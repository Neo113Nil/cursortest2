package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.wn5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1199r1 {

    @NotNull
    public static final sn5 a = new wn5(a.a, -1765859383, false);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r1$a */
    public static final class a extends uif implements pyc {
        public static final a a = new a();

        public a() {
            super(3);
        }

        public static void a(InterfaceC1012d9 interfaceC1012d9, hq5 hq5Var, int i) {
            interfaceC1012d9.getClass();
            interfaceC1012d9.b(rvf.M(R.string.button_search_text, hq5Var), hq5Var, (i << 3) & 112);
        }

        @Override // defpackage.pyc
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC1012d9) obj, (hq5) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r1$b */
    public static final class b extends uif implements Function2<hq5, Integer, Unit> {
        public static final b a = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            hq5 hq5Var = (hq5) obj;
            if ((((Number) obj2).intValue() & 3) == 2) {
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.z()) {
                    oq5Var.S();
                    return Unit.a;
                }
            }
            Pa.a(null, hq5Var, 0, 1);
            return Unit.a;
        }
    }

    static {
        b bVar = b.a;
    }

    @NotNull
    public static sn5 a() {
        return a;
    }
}
