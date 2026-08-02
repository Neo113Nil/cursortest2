package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.d85;
import defpackage.hrg;
import defpackage.met;
import defpackage.net;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1129m0 {

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$a */
    public static final class a implements InterfaceC1129m0 {

        @NotNull
        public static final a a = new a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/m0$b;", "Lru/kinopoisk/sdk/easylogin/internal/m0;", "Ld85;", "contentColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "android_ui_uikit_mobilebase"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$b */
    public static final /* data */ class b implements InterfaceC1129m0 {
        public final long a;
        public final long b;

        public b(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return d85.c(this.a, bVar.a) && d85.c(this.b, bVar.b);
        }

        public final int hashCode() {
            long j = this.a;
            int i = d85.o;
            met metVar = net.b;
            return Long.hashCode(this.b) + (Long.hashCode(j) * 31);
        }

        @NotNull
        public final String toString() {
            return hrg.s("Custom(contentColor=", d85.i(this.a), ", backgroundColor=", d85.i(this.b), ")");
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$c */
    public static final class c implements InterfaceC1129m0 {

        @NotNull
        public static final c a = new c();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$d */
    public static final class d implements InterfaceC1129m0 {

        @NotNull
        public static final d a = new d();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$e */
    public static final class e implements InterfaceC1129m0 {

        @NotNull
        public static final e a = new e();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$f */
    public static final class f implements InterfaceC1129m0 {

        @NotNull
        public static final f a = new f();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$g */
    public static final class g implements InterfaceC1129m0 {

        @NotNull
        public static final g a = new g();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$h */
    public static final class h implements InterfaceC1129m0 {

        @NotNull
        public static final h a = new h();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$i */
    public static final class i implements InterfaceC1129m0 {

        @NotNull
        public static final i a = new i();
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m0$j */
    public static final class j implements InterfaceC1129m0 {

        @NotNull
        public static final j a = new j();
    }
}
