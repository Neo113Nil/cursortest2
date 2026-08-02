package com.yandex.passport.internal.social.esia;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.i7;
import defpackage.n8g;
import defpackage.t75;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EsiaBindActivity b;

    public /* synthetic */ a(EsiaBindActivity esiaBindActivity, int i) {
        this.a = i;
        this.b = esiaBindActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q0 q0Var;
        s0 s0Var;
        int i = this.a;
        EsiaBindActivity esiaBindActivity = this.b;
        switch (i) {
            case 0:
                int i2 = EsiaBindActivity.h;
                d createEsiaBindComponentBuilder = com.yandex.passport.internal.di.a.a().createEsiaBindComponentBuilder();
                com.yandex.passport.internal.properties.j i3 = esiaBindActivity.i();
                if (i3 != null) {
                    com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(i3.b);
                    String str = i3.c;
                    String str2 = i3.d;
                    String str3 = i3.e;
                    int ordinal = i3.a.ordinal();
                    if (ordinal == 0) {
                        s0Var = s0.a;
                    } else if (ordinal != 1) {
                        int i4 = esiaBindActivity.getResources().getConfiguration().uiMode & 48;
                        s0Var = i4 != 16 ? i4 != 32 ? s0.a : s0.b : s0.a;
                    } else {
                        s0Var = s0.b;
                    }
                    q0Var = new q0(L, str, str2, str3, s0Var);
                } else {
                    q0Var = null;
                }
                break;
            case 1:
                int i5 = EsiaBindActivity.h;
                break;
            case 2:
                int i6 = EsiaBindActivity.h;
                break;
            case 3:
                int i7 = EsiaBindActivity.h;
                com.yandex.passport.internal.report.reporters.z j = esiaBindActivity.j();
                com.yandex.passport.common.core.f fVar = esiaBindActivity.e;
                j.getClass();
                i7 i7Var = i7.d;
                n8g b = t75.b();
                if (fVar != null) {
                    b.add(new ff(fVar));
                }
                j.m(i7Var, t75.a(b));
                if (!((e0) ((n0) esiaBindActivity.c.getValue()).m.b.invoke()).d) {
                    esiaBindActivity.j().y(esiaBindActivity.e, com.yandex.passport.internal.report.reporters.x.WEB_VIEW);
                }
                break;
            default:
                int i8 = EsiaBindActivity.h;
                if (!((e0) ((n0) esiaBindActivity.c.getValue()).m.b.invoke()).d) {
                    esiaBindActivity.j().w(esiaBindActivity.e, com.yandex.passport.internal.report.reporters.x.WEB_VIEW);
                }
                break;
        }
        return Unit.a;
    }
}
