package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ouj;
import defpackage.tlm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/k7;", "", "libs_android_pairing_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C1108k7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public C1108k7(long j, long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        j = (i & 1) != 0 ? 10000L : j;
        j2 = (i & 2) != 0 ? 2000L : j2;
        j3 = (i & 4) != 0 ? 10L : j3;
        j4 = (i & 8) != 0 ? 5L : j4;
        j5 = (i & 16) != 0 ? 50L : j5;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1108k7)) {
            return false;
        }
        C1108k7 c1108k7 = (C1108k7) obj;
        return this.a == c1108k7.a && this.b == c1108k7.b && this.c == c1108k7.c && this.d == c1108k7.d && this.e == c1108k7.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        StringBuilder l = tlm.l(j, "PairingConfig(connectionTimeoutMs=", ", reconnectionDelayMs=");
        l.append(j2);
        ouj.C(l, ", connectionRetries=", j3, ", discoveryMdnsResolveRetries=");
        l.append(j4);
        l.append(", discoveryMdnsResolveDelayMs=");
        l.append(j5);
        l.append(")");
        return l.toString();
    }

    public C1108k7() {
        this(0L, 0L, 0L, 0L, 0L, 31, null);
    }
}
