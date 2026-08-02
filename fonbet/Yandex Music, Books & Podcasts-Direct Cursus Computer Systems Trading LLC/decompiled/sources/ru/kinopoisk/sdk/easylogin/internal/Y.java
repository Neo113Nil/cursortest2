package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.uif;
import defpackage.vnj;
import defpackage.yci;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* loaded from: classes5.dex */
public final class Y extends uif implements pyc {
    public final /* synthetic */ InterfaceC1129m0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC1129m0 interfaceC1129m0) {
        super(3);
        this.a = interfaceC1129m0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci yciVar = (yci) obj;
        ((Number) obj3).intValue();
        yciVar.getClass();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.a0(133768255);
        if (Intrinsics.d(this.a, InterfaceC1129m0.g.a)) {
            yciVar = vnj.q(yciVar, C0975b0.a);
        } else if (Intrinsics.d(this.a, InterfaceC1129m0.a.a)) {
            yciVar = vnj.q(yciVar, X.a);
        }
        oq5Var.p(false);
        return yciVar;
    }
}
