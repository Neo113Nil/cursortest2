package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b6e;
import defpackage.d85;
import defpackage.hq5;
import defpackage.mb6;
import defpackage.oq5;
import defpackage.rvf;
import defpackage.sb6;
import defpackage.uif;
import defpackage.xmn;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1101k0 {

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k0$a */
    public static final class a extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ EnumC1087j0 a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC1087j0 enumC1087j0, int i) {
            super(2);
            this.a = enumC1087j0;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C1101k0.a(this.a, (hq5) obj, rvf.R(this.b | 1));
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k0$b */
    public static final class b extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ T8 a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T8 t8, int i) {
            super(2);
            this.a = t8;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C1101k0.a(this.a, (hq5) obj, rvf.R(this.b | 1));
            return Unit.a;
        }
    }

    public static final void a(T8 t8, hq5 hq5Var, int i) {
        int i2;
        T8 t82;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1707494104);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(t8) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            t82 = t8;
        } else {
            t82 = t8;
            S8.a(null, t82, d85.b(((d85) oq5Var.j(sb6.a)).a, ((Number) oq5Var.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14), oq5Var, (i2 << 3) & 112, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b(t82, i);
        }
    }

    public static final void a(@NotNull EnumC1087j0 enumC1087j0, hq5 hq5Var, int i) {
        int i2;
        T8 t8;
        enumC1087j0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1032592886);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(enumC1087j0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int ordinal = enumC1087j0.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                t8 = T8.ExtraSmall;
            } else {
                if (ordinal != 3 && ordinal != 4) {
                    b6e.s();
                    return;
                }
                t8 = T8.Small;
            }
            a(t8, oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a(enumC1087j0, i);
        }
    }

    public static final float a(@NotNull EnumC1087j0 enumC1087j0) {
        enumC1087j0.getClass();
        int ordinal = enumC1087j0.ordinal();
        if (ordinal == 0) {
            return 8;
        }
        if (ordinal == 1 || ordinal == 2) {
            return 10;
        }
        if (ordinal == 3 || ordinal == 4) {
            return 12;
        }
        b6e.s();
        return 0.0f;
    }
}
