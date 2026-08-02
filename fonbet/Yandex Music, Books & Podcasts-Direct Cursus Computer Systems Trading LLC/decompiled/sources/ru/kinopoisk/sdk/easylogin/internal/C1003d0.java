package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ouj;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1031f0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/d0;", "", "libs_android_benchmark_core"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C1003d0 {

    @NotNull
    public final String a;

    @NotNull
    public final Z2 b;
    public final boolean c;

    public C1003d0(@NotNull String str, @NotNull Z2 z2, boolean z) {
        str.getClass();
        z2.getClass();
        this.a = str;
        this.b = z2;
        this.c = z;
        UUID.randomUUID().toString().getClass();
        new C0964a3(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1003d0)) {
            return false;
        }
        C1003d0 c1003d0 = (C1003d0) obj;
        return Intrinsics.d(this.a, c1003d0.a) && Intrinsics.d(this.b, c1003d0.b) && this.c == c1003d0.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.a;
        Z2 z2 = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder("Benchmark(name=");
        sb.append(str);
        sb.append(", durationRange=");
        sb.append(z2);
        sb.append(", withStartState=");
        return ouj.r(sb, z, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1003d0(String str, Z2 z2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2, (i & 4) != 0 ? true : z);
        if ((i & 2) != 0) {
            InterfaceC1031f0.a.getClass();
            z2 = InterfaceC1031f0.a.b;
        }
    }
}
