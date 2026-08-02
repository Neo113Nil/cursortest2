package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b6e;
import defpackage.d85;
import defpackage.ges;
import defpackage.hq5;
import defpackage.mb6;
import defpackage.oq5;
import defpackage.rvf;
import defpackage.sb6;
import defpackage.uif;
import defpackage.vci;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1115l0 {

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l0$a */
    public static final class a extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ EnumC1087j0 b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, EnumC1087j0 enumC1087j0, int i) {
            super(2);
            this.a = str;
            this.b = enumC1087j0;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C1115l0.a(this.a, this.b, (hq5) obj, rvf.R(this.c | 1));
            return Unit.a;
        }
    }

    public static final void a(@NotNull String str, @NotNull EnumC1087j0 enumC1087j0, hq5 hq5Var, int i) {
        int i2;
        ges gesVar;
        oq5 oq5Var;
        str.getClass();
        enumC1087j0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1460677096);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(enumC1087j0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            yci a2 = androidx.compose.ui.platform.a.a(vci.a, "ButtonText-Text");
            long b = d85.b(((d85) oq5Var2.j(sb6.a)).a, ((Number) oq5Var2.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
            int ordinal = enumC1087j0.ordinal();
            if (ordinal == 0) {
                oq5Var2.a0(148217122);
                gesVar = ((yc) oq5Var2.j(zc.b)).G;
                oq5Var2.p(false);
            } else if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                oq5Var2.a0(148182581);
                oq5Var2.p(false);
                b6e.s();
                return;
            } else {
                oq5Var2.a0(148222466);
                gesVar = ((yc) oq5Var2.j(zc.b)).y;
                oq5Var2.p(false);
            }
            oq5Var = oq5Var2;
            xcs.b(str, a2, b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar, oq5Var, (i2 & 14) | 48, 3120, 55288);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a(str, enumC1087j0, i);
        }
    }
}
