package com.yandex.passport.sloth.ui;

import defpackage.gzf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ r(b0 b0Var, int i) {
        this.a = i;
        this.b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.p.a(e1.b);
                return Unit.a;
            case 1:
                this.b.p.a(e1.b);
                return Unit.a;
            case 2:
                return new gzf(this.b);
            default:
                b0 b0Var = this.b;
                return new com.yandex.passport.sloth.ui.webview.i(b0Var.m, b0Var.r(), b0Var.t, b0Var.v, b0Var.w, b0Var.x);
        }
    }
}
