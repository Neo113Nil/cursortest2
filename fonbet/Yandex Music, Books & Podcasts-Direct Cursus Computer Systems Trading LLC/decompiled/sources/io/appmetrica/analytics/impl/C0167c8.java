package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0167c8 implements Converter {
    public final Ig a;

    public /* synthetic */ C0167c8(Ig ig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ig() : ig);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0138b8 toModel(C0282g8 c0282g8) {
        if (c0282g8 == null) {
            return new C0138b8(null, null, null, null, null, null, null, null, null, null);
        }
        C0282g8 c0282g82 = new C0282g8();
        Boolean a = this.a.a(c0282g8.a);
        double d = c0282g8.c;
        Double valueOf = Double.valueOf(d);
        if (d == c0282g82.c) {
            valueOf = null;
        }
        double d2 = c0282g8.b;
        Double valueOf2 = !(d2 == c0282g82.b) ? Double.valueOf(d2) : null;
        long j = c0282g8.h;
        Long valueOf3 = j != c0282g82.h ? Long.valueOf(j) : null;
        int i = c0282g8.f;
        Integer valueOf4 = i != c0282g82.f ? Integer.valueOf(i) : null;
        int i2 = c0282g8.e;
        Integer valueOf5 = i2 != c0282g82.e ? Integer.valueOf(i2) : null;
        int i3 = c0282g8.g;
        Integer valueOf6 = i3 != c0282g82.g ? Integer.valueOf(i3) : null;
        int i4 = c0282g8.d;
        Integer valueOf7 = i4 != c0282g82.d ? Integer.valueOf(i4) : null;
        String str = c0282g8.i;
        String str2 = !Intrinsics.d(str, c0282g82.i) ? str : null;
        String str3 = c0282g8.j;
        return new C0138b8(a, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !Intrinsics.d(str3, c0282g82.j) ? str3 : null);
    }

    public C0167c8(@NotNull Ig ig) {
        this.a = ig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0167c8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0282g8 fromModel(@NotNull C0138b8 c0138b8) {
        C0282g8 c0282g8 = new C0282g8();
        Boolean bool = c0138b8.a;
        if (bool != null) {
            c0282g8.a = this.a.fromModel(bool).intValue();
        }
        Double d = c0138b8.c;
        if (d != null) {
            c0282g8.c = d.doubleValue();
        }
        Double d2 = c0138b8.b;
        if (d2 != null) {
            c0282g8.b = d2.doubleValue();
        }
        Long l = c0138b8.h;
        if (l != null) {
            c0282g8.h = l.longValue();
        }
        Integer num = c0138b8.f;
        if (num != null) {
            c0282g8.f = num.intValue();
        }
        Integer num2 = c0138b8.e;
        if (num2 != null) {
            c0282g8.e = num2.intValue();
        }
        Integer num3 = c0138b8.g;
        if (num3 != null) {
            c0282g8.g = num3.intValue();
        }
        Integer num4 = c0138b8.d;
        if (num4 != null) {
            c0282g8.d = num4.intValue();
        }
        String str = c0138b8.i;
        if (str != null) {
            c0282g8.i = str;
        }
        String str2 = c0138b8.j;
        if (str2 != null) {
            c0282g8.j = str2;
        }
        return c0282g8;
    }
}
