package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.pyc;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.wn5;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1102k1 {

    @NotNull
    public static final sn5 a = new wn5(a.a, 1853220822, false);

    @NotNull
    public static final sn5 b = new wn5(b.a, 1671834779, false);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k1$a */
    public static final class a extends uif implements pyc {
        public static final a a = new a();

        public a() {
            super(3);
        }

        public static void a(InterfaceC1012d9 interfaceC1012d9, hq5 hq5Var, int i) {
            interfaceC1012d9.getClass();
            interfaceC1012d9.b(rvf.M(R.string.button_okay_text, hq5Var), hq5Var, (i << 3) & 112);
        }

        @Override // defpackage.pyc
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC1012d9) obj, (hq5) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k1$b */
    public static final class b extends uif implements pyc {
        public static final b a = new b();

        public b() {
            super(3);
        }

        public static void a(InterfaceC1012d9 interfaceC1012d9, hq5 hq5Var, int i) {
            interfaceC1012d9.getClass();
            interfaceC1012d9.b(rvf.M(R.string.button_need_help_text, hq5Var), hq5Var, (i << 3) & 112);
        }

        @Override // defpackage.pyc
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC1012d9) obj, (hq5) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @NotNull
    public static sn5 a() {
        return a;
    }

    @NotNull
    public static sn5 b() {
        return b;
    }
}
