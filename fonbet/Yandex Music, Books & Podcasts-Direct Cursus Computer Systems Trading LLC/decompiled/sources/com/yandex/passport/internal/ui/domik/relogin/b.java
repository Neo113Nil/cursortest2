package com.yandex.passport.internal.ui.domik.relogin;

import com.yandex.passport.internal.ui.f;
import defpackage.ca8;
import defpackage.cq4;
import defpackage.dq7;
import defpackage.mn7;
import defpackage.ot0;
import defpackage.x97;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.a((f) obj);
                break;
            case 1:
                dVar.G(((Boolean) obj).booleanValue());
                break;
            default:
                dVar.getClass();
                cq4 F = ot0.F(dVar);
                dq7 dq7Var = ca8.a;
                x97.y(F, mn7.d, null, new c(dVar, (com.yandex.passport.internal.ui.domik.d) obj, null, 0), 2);
                break;
        }
        return Unit.a;
    }
}
