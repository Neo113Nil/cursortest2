package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.f02;
import defpackage.jt7;
import defpackage.ouj;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.F8;
import ru.kinopoisk.sdk.easylogin.internal.di.CastModule$Companion$provideCastLogger$1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1121l6 {

    @NotNull
    public final String a;

    @NotNull
    public final InterfaceC1093j6 b;

    @NotNull
    public final CastModule$Companion$provideCastLogger$1 c;

    @NotNull
    public final InterfaceC1188q3 d;

    @NotNull
    public final ThreadPoolExecutor e;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/l6$a;", "", "a", "b", "c", "Lru/kinopoisk/sdk/easylogin/internal/l6$a$a;", "Lru/kinopoisk/sdk/easylogin/internal/l6$a$b;", "Lru/kinopoisk/sdk/easylogin/internal/l6$a$c;", "libs_android_logger_core"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l6$a */
    public static abstract class a {

        @NotNull
        public final String a;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l6$a$a, reason: collision with other inner class name */
        public static final class C0039a extends a {

            @NotNull
            public static final C0039a b = new C0039a();

            public C0039a() {
                super("error", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0039a);
            }

            public final int hashCode() {
                return -1037606965;
            }

            @NotNull
            public final String toString() {
                return "Error";
            }
        }

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l6$a$b */
        public static final class b extends a {

            @NotNull
            public static final b b = new b();

            public b() {
                super("info", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1003187573;
            }

            @NotNull
            public final String toString() {
                return "Info";
            }
        }

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l6$a$c */
        public static final class c extends a {

            @NotNull
            public static final c b = new c();

            public c() {
                super("verbose", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1122214533;
            }

            @NotNull
            public final String toString() {
                return "Verbose";
            }
        }

        public a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this.a = str;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l6$b */
    public static final class b implements Serializable {

        @NotNull
        public final Object a;

        public b(@NotNull String str, @NotNull String str2, @NotNull Object obj) {
            str.getClass();
            str2.getClass();
            obj.getClass();
            this.a = obj;
        }
    }

    public C1121l6(@NotNull InterfaceC1093j6 interfaceC1093j6, @NotNull CastModule$Companion$provideCastLogger$1 castModule$Companion$provideCastLogger$1, @NotNull InterfaceC1188q3 interfaceC1188q3) {
        interfaceC1093j6.getClass();
        castModule$Companion$provideCastLogger$1.getClass();
        interfaceC1188q3.getClass();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new jt7(7));
        this.a = "CastLogger";
        this.b = interfaceC1093j6;
        this.c = castModule$Companion$provideCastLogger$1;
        this.d = interfaceC1188q3;
        this.e = threadPoolExecutor;
    }

    public static final void a(C1121l6 c1121l6, a aVar, String str, Object obj, Throwable th) {
        try {
            CastModule$Companion$provideCastLogger$1 castModule$Companion$provideCastLogger$1 = c1121l6.c;
            String str2 = aVar.a;
            if (th != null) {
                C1082i9.a(new StringBuilder(), th, "", 0).toString();
            }
            c1121l6.b.a(c1121l6.a, castModule$Companion$provideCastLogger$1.to(new b(str2, str, obj)));
            if (th != null) {
                c1121l6.b.a(c1121l6.a, th);
            }
        } catch (Throwable th2) {
            c1121l6.d.a(th2);
        }
    }

    public final void a(@NotNull a aVar, @NotNull String str, @NotNull F8.a aVar2, Throwable th) {
        aVar.getClass();
        str.getClass();
        aVar2.getClass();
        this.e.execute(new f02(this, aVar, str, aVar2, th));
    }

    public static final Thread a(String str, Runnable runnable) {
        return new Thread(runnable, ouj.n(str, "Thread"));
    }
}
