package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.f1d;
import defpackage.k5r;
import defpackage.ouj;
import java.net.InetAddress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.v7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1260v7 {

    @NotNull
    public final String a;

    @NotNull
    public final List<InetAddress> b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1260v7(@NotNull String str, @NotNull List<? extends InetAddress> list, int i) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = i;
    }

    @NotNull
    public final List<InetAddress> a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260v7)) {
            return false;
        }
        C1260v7 c1260v7 = (C1260v7) obj;
        return Intrinsics.d(this.a, c1260v7.a) && Intrinsics.d(this.b, c1260v7.b) && this.c == c1260v7.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        String str = this.a;
        List<InetAddress> list = this.b;
        return f1d.i(ouj.v("PairingServiceInfo(id=", str, ", hosts=", ", port=", list), this.c, ")");
    }
}
