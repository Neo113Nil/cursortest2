package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.k5r;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.u7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1247u7 {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    public static final C1247u7 e = new C1247u7(2023, "_kinopoisk._tcp.", "KinopoiskCast");
    public final int a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/u7$a;", "", "libs_android_pairing_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.u7$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new C1247u7(2024, "_yango._tcp.", "YangoCast");
    }

    public C1247u7(int i, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247u7)) {
            return false;
        }
        C1247u7 c1247u7 = (C1247u7) obj;
        return this.a == c1247u7.a && Intrinsics.d(this.b, c1247u7.b) && Intrinsics.d(this.c, c1247u7.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1292y0.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        int i = this.a;
        String str = this.b;
        return su4.o(k5r.r(i, "PairingServiceConfig(servicePort=", ", serviceType=", str, ", servicePrefix="), this.c, ")");
    }
}
