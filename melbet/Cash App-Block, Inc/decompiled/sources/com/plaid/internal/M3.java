package com.plaid.internal;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class M3 implements Callable<Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ P3 d;

    public M3(P3 p3, String str, String str2, String str3) {
        this.d = p3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        SupportSQLiteStatement acquire = this.d.b.acquire();
        acquire.bindString(1, this.a);
        acquire.bindString(2, this.b);
        acquire.bindString(3, this.c);
        try {
            this.d.a.beginTransaction();
            try {
                acquire.executeInsert();
                this.d.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.d.a.endTransaction();
            }
        } finally {
            this.d.b.release(acquire);
        }
    }
}
