package com.yandex.passport.sloth.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;

    public /* synthetic */ m(y1 y1Var, int i) {
        this.a = i;
        this.b = y1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                this.b.a(new r1(str));
                break;
            case 1:
                y0 y0Var = (y0) obj;
                y0Var.getClass();
                this.b.a(new w1(y0Var));
                break;
            case 2:
                com.yandex.passport.sloth.ui.webview.f fVar = (com.yandex.passport.sloth.ui.webview.f) obj;
                fVar.getClass();
                this.b.a(new t1(fVar));
                break;
            default:
                this.b.a(new s1((String) obj));
                break;
        }
        return Unit.a;
    }
}
