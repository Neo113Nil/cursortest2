package com.plaid.internal;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class F4 implements Callable<Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ H4 d;

    public F4(H4 h4, String str, String str2, byte[] bArr) {
        this.d = h4;
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        SupportSQLiteStatement acquire = this.d.b.acquire();
        acquire.bindString(1, this.a);
        acquire.bindString(2, this.b);
        acquire.bindBlob(3, this.c);
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
