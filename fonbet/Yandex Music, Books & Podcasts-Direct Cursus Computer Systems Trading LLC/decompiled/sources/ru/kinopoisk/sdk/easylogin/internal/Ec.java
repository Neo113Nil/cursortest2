package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aqi;
import defpackage.bqi;
import defpackage.hq5;
import defpackage.ild;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.rvf;
import defpackage.sdr;
import defpackage.szf;
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
public final class Ec extends uif implements pyc {
    public final /* synthetic */ bqi a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ Function0<Unit> c;

    public static final class a extends uif implements pyc {
        public final /* synthetic */ sdr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sdr sdrVar) {
            super(3);
            this.a = sdrVar;
        }

        public final void a(InterfaceC1012d9 interfaceC1012d9, hq5 hq5Var, int i) {
            interfaceC1012d9.getClass();
            if (((Cc) this.a.getValue()).a()) {
                oq5 oq5Var = (oq5) hq5Var;
                oq5Var.a0(686513605);
                interfaceC1012d9.a(rvf.M(R.string.button_request_code_text, oq5Var), oq5Var, (i << 3) & 112);
                oq5Var.p(false);
                return;
            }
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.a0(686611751);
            interfaceC1012d9.b(rvf.M(R.string.button_request_code_text, oq5Var2), oq5Var2, (i << 3) & 112);
            oq5Var2.p(false);
        }

        @Override // defpackage.pyc
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC1012d9) obj, (hq5) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(bqi bqiVar, nbt nbtVar, Function0 function0) {
        super(3);
        this.a = bqiVar;
        this.b = nbtVar;
        this.c = function0;
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
        aqi Q = szf.Q(this.a, hq5Var);
        vci vciVar = vci.a;
        this.b.h(0, hq5Var, androidx.compose.foundation.layout.d.o(vciVar, 343, 240), C1210rc.a(hq5Var, 0).k());
        u1g.l(hq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_small_3, hq5Var)));
        xcs.b(rvf.M(R.string.error_screen_input_error_title, hq5Var), null, C1210rc.a(hq5Var, 0).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, C1210rc.b(hq5Var, 0).getJ(), hq5Var, 0, 0, 65530);
        u1g.l(hq5Var, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_3, hq5Var)));
        C1155nc.a(this.c, androidx.compose.foundation.layout.d.t(vciVar, 220, 0.0f, 2), ((Cc) Q.getValue()).a() ? InterfaceC1129m0.j.a : InterfaceC1129m0.e.a, EnumC1087j0.ExtraLarge, false, ild.s(hq5Var, 1655447927, new a(Q)), hq5Var, 199728, 16);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((ua5) obj, (hq5) obj2, ((Number) obj3).intValue());
        return Unit.a;
    }
}
