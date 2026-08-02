package com.plaid.internal;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class N3 implements Callable<Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ P3 b;

    public N3(P3 p3, String str) {
        this.b = p3;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        SupportSQLiteStatement acquire = this.b.c.acquire();
        acquire.bindString(1, this.a);
        try {
            this.b.a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.b.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                this.b.a.endTransaction();
            }
        } finally {
            this.b.c.release(acquire);
        }
    }
}
