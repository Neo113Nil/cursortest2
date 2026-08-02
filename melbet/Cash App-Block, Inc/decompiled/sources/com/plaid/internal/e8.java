package com.plaid.internal;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class e8 implements Callable<Unit> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ g8 b;

    public e8(g8 g8Var, ArrayList arrayList) {
        this.b = g8Var;
        this.a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Unit call() {
        this.b.a.beginTransaction();
        try {
            this.b.b.handleMultiple(this.a);
            this.b.a.setTransactionSuccessful();
            return Unit.INSTANCE;
        } finally {
            this.b.a.endTransaction();
        }
    }
}
