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

/* loaded from: classes5.dex */
public final class S1 extends uif implements pyc {
    public final /* synthetic */ nbt a;
    public final /* synthetic */ boolean b;

    public static final class a extends uif implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(nbt nbtVar, boolean z) {
        super(3);
        this.a = nbtVar;
        this.b = z;
    }

    public final void a(ua5 ua5Var, hq5 hq5Var, int i) {
        vci vciVar;
        hq5 hq5Var2;
        ua5Var.getClass();
        if ((i & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return;
            }
        }
        nbt nbtVar = this.a;
        vci vciVar2 = vci.a;
        nbtVar.o(androidx.compose.foundation.layout.d.o(vciVar2, 342, 240), hq5Var, 6);
        u1g.l(hq5Var, androidx.compose.foundation.layout.d.e(vciVar2, u7g.E(R.dimen.space_medium_2, hq5Var)));
        if (this.b) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.a0(797535850);
            vciVar = vciVar2;
            xcs.b(rvf.M(R.string.app_found_screen_title, hq5Var), null, C1210rc.a(hq5Var, 0).f(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(hq5Var, 0).getJ(), hq5Var, 0, 0, 65018);
            hq5Var2 = hq5Var;
            oq5Var2.p(false);
        } else {
            vciVar = vciVar2;
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.a0(797787291);
            xcs.b(rvf.M(R.string.connecting_screen_subtitle_android, hq5Var), null, C1210rc.a(hq5Var, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(hq5Var, 0).getA(), hq5Var, 0, 0, 65018);
            hq5Var2 = hq5Var;
            oq5Var3.p(false);
        }
        vci vciVar3 = vciVar;
        u1g.l(hq5Var2, androidx.compose.foundation.layout.d.e(vciVar3, u7g.E(R.dimen.space_medium_3, hq5Var2)));
        C1197qc.a(a.a, androidx.compose.foundation.layout.d.t(vciVar3, 220, 0.0f, 2), InterfaceC1129m0.j.a, EnumC1087j0.ExtraLarge, false, EnumC1073i0.Start, C1060h1.a(), hq5Var2, 1772982, 16);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((ua5) obj, (hq5) obj2, ((Number) obj3).intValue());
        return Unit.a;
    }
}
