package ru.kinopoisk.sdk.easylogin.internal;

import android.os.Handler;
import android.os.Looper;
import defpackage.arf;
import defpackage.btf;
import defpackage.ti;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.s6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1218s6 {

    @NotNull
    public static final arf a = btf.b(a.a);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.s6$a */
    public static final class a extends uif implements Function0<Handler> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final void a(@NotNull Function0<Unit> function0) {
        function0.getClass();
        if (Intrinsics.d(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            ((Handler) a.getValue()).post(new ti(12, function0));
        }
    }

    public static final void b(Function0 function0) {
        function0.invoke();
    }
}
