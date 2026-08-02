package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ms8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns8 b;

    public /* synthetic */ ms8(ns8 ns8Var, int i) {
        this.a = i;
        this.b = ns8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
        }
        return this.b.getViewModelStore();
    }
}
