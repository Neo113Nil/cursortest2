package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.f1d;
import defpackage.k5r;
import defpackage.su4;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1164o7 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final InterfaceC1233t7 e;

    @NotNull
    public final String f;

    @NotNull
    public final List<String> g;

    @NotNull
    public final LinkedHashMap h;

    public C1164o7(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull InterfaceC1233t7 interfaceC1233t7, @NotNull String str5, @NotNull List list, @NotNull LinkedHashMap linkedHashMap) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        interfaceC1233t7.getClass();
        str5.getClass();
        list.getClass();
        linkedHashMap.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = interfaceC1233t7;
        this.f = str5;
        this.g = list;
        this.h = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164o7)) {
            return false;
        }
        C1164o7 c1164o7 = (C1164o7) obj;
        return Intrinsics.d(this.a, c1164o7.a) && Intrinsics.d(this.b, c1164o7.b) && Intrinsics.d(this.c, c1164o7.c) && Intrinsics.d(this.d, c1164o7.d) && Intrinsics.d(this.e, c1164o7.e) && Intrinsics.d(this.f, c1164o7.f) && Intrinsics.d(this.g, c1164o7.g) && Intrinsics.d(this.h, c1164o7.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + k5r.d(C1292y0.a(this.f, (this.e.hashCode() + C1292y0.a(this.d, C1292y0.a(this.c, C1292y0.a(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31, this.g);
    }

    @NotNull
    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        InterfaceC1233t7 interfaceC1233t7 = this.e;
        String str5 = this.f;
        List<String> list = this.g;
        LinkedHashMap linkedHashMap = this.h;
        StringBuilder m = f1d.m("PairingDevice(id=", str, ", name=", str2, ", vendor=");
        su4.v(m, str3, ", model=", str4, ", os=");
        m.append(interfaceC1233t7);
        m.append(", osVersion=");
        m.append(str5);
        m.append(", features=");
        m.append(list);
        m.append(", additions=");
        m.append(linkedHashMap);
        m.append(")");
        return m.toString();
    }
}
