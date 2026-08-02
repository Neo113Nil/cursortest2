package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oq5;
import defpackage.ovn;
import defpackage.pyc;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.wn5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1158o1 {

    @NotNull
    public static final sn5 a = new wn5(a.a, -1547191289, false);

    @NotNull
    public static final sn5 b = new wn5(b.a, -1757230530, false);

    @NotNull
    public static final sn5 c = new wn5(c.a, -942741981, false);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1$a */
    public static final class a extends uif implements pyc {
        public static final a a = new a();

        public a() {
            super(3);
        }

        public static void a(InterfaceC1012d9 interfaceC1012d9, hq5 hq5Var, int i) {
            interfaceC1012d9.getClass();
            interfaceC1012d9.b(rvf.M(R.string.button_continue_text, hq5Var), hq5Var, (i << 3) & 112);
        }

        @Override // defpackage.pyc
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC1012d9) obj, (hq5) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1$b */
    public static final class b extends uif implements pyc {
        public static final b a = new b();

        public b() {
            super(3);
        }

        public static void a(InterfaceC1012d9 interfaceC1012d9, hq5 hq5Var, int i) {
            interfaceC1012d9.getClass();
            interfaceC1012d9.b(rvf.M(R.string.button_not_now_text, hq5Var), hq5Var, (i << 3) & 112);
        }

        @Override // defpackage.pyc
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC1012d9) obj, (hq5) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1$c */
    public static final class c extends uif implements pyc {
        public static final c a = new c();

        public c() {
            super(3);
        }

        public static void a(InterfaceC1012d9 interfaceC1012d9, hq5 hq5Var, int i) {
            interfaceC1012d9.getClass();
            interfaceC1012d9.b(rvf.M(R.string.button_remind_later_text, hq5Var), hq5Var, (i << 3) & 112);
        }

        @Override // defpackage.pyc
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC1012d9) obj, (hq5) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1$d */
    public static final class d extends uif implements Function2<hq5, Integer, Unit> {
        public static final d a = new d();

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1$d$a */
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

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1$d$b */
        public static final class b extends uif implements Function0<Unit> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Object invoke() {
                return Unit.a;
            }
        }

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o1$d$c */
        public static final class c extends uif implements Function0<Unit> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Object invoke() {
                return Unit.a;
            }
        }

        public d() {
            super(2);
        }

        public static void a(hq5 hq5Var, int i) {
            if ((i & 3) == 2) {
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.z()) {
                    oq5Var.S();
                    return;
                }
            }
            A9.a(ovn.j, null, a.a, b.a, c.a, hq5Var, 28038, 2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((hq5) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    static {
        d dVar = d.a;
    }

    @NotNull
    public static sn5 a() {
        return a;
    }

    @NotNull
    public static sn5 b() {
        return b;
    }

    @NotNull
    public static sn5 c() {
        return c;
    }
}
