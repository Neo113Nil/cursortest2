package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.rvf;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.ua5;
import defpackage.uif;
import defpackage.vci;
import defpackage.xcs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1061h2 extends uif implements pyc {
    public final /* synthetic */ nbt a;
    public final /* synthetic */ Function0<Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1061h2(nbt nbtVar, Function0<Unit> function0) {
        super(3);
        this.a = nbtVar;
        this.b = function0;
    }

    public final void a(ua5 ua5Var, hq5 hq5Var, int i) {
        ua5Var.getClass();
        if ((i & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return;
            }
        }
        nbt nbtVar = this.a;
        vci vciVar = vci.a;
        nbtVar.f(androidx.compose.foundation.layout.d.o(vciVar, 343, 240), hq5Var, 6);
        u1g.l(hq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_2, hq5Var)));
        xcs.b(rvf.M(this.a.x(), hq5Var), null, C1210rc.a(hq5Var, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(hq5Var, 0).getA(), hq5Var, 0, 0, 65018);
        u1g.l(hq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_3, hq5Var)));
        C1155nc.a(this.b, androidx.compose.foundation.layout.d.t(vciVar, 220, 0.0f, 2), InterfaceC1129m0.e.a, EnumC1087j0.ExtraLarge, false, C1088j1.a(), hq5Var, 200112, 16);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((ua5) obj, (hq5) obj2, ((Number) obj3).intValue());
        return Unit.a;
    }
}
