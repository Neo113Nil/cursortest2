package io.appmetrica.analytics.impl;

import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.g8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0356g8 implements Converter {
    public final Yg a;

    public /* synthetic */ C0356g8(Yg yg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Yg() : yg);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0327f8 toModel(C0471k8 c0471k8) {
        if (c0471k8 == null) {
            return new C0327f8(null, null, null, null, null, null, null, null, null, null);
        }
        C0471k8 c0471k82 = new C0471k8();
        Boolean a = this.a.a(c0471k8.a);
        double d = c0471k8.c;
        Double valueOf = Double.valueOf(d);
        if (d == c0471k82.c) {
            valueOf = null;
        }
        double d2 = c0471k8.b;
        Double valueOf2 = !(d2 == c0471k82.b) ? Double.valueOf(d2) : null;
        long j = c0471k8.h;
        Long valueOf3 = j != c0471k82.h ? Long.valueOf(j) : null;
        int i = c0471k8.f;
        Integer valueOf4 = i != c0471k82.f ? Integer.valueOf(i) : null;
        int i2 = c0471k8.e;
        Integer valueOf5 = i2 != c0471k82.e ? Integer.valueOf(i2) : null;
        int i3 = c0471k8.g;
        Integer valueOf6 = i3 != c0471k82.g ? Integer.valueOf(i3) : null;
        int i4 = c0471k8.d;
        Integer valueOf7 = i4 != c0471k82.d ? Integer.valueOf(i4) : null;
        String str = c0471k8.i;
        String str2 = !jl40.l(str, c0471k82.i) ? str : null;
        String str3 = c0471k8.j;
        return new C0327f8(a, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !jl40.l(str3, c0471k82.j) ? str3 : null);
    }

    public C0356g8(Yg yg) {
        this.a = yg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0356g8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0471k8 fromModel(C0327f8 c0327f8) {
        C0471k8 c0471k8 = new C0471k8();
        Boolean bool = c0327f8.a;
        if (bool != null) {
            c0471k8.a = this.a.fromModel(bool).intValue();
        }
        Double d = c0327f8.c;
        if (d != null) {
            c0471k8.c = d.doubleValue();
        }
        Double d2 = c0327f8.b;
        if (d2 != null) {
            c0471k8.b = d2.doubleValue();
        }
        Long l = c0327f8.h;
        if (l != null) {
            c0471k8.h = l.longValue();
        }
        Integer num = c0327f8.f;
        if (num != null) {
            c0471k8.f = num.intValue();
        }
        Integer num2 = c0327f8.e;
        if (num2 != null) {
            c0471k8.e = num2.intValue();
        }
        Integer num3 = c0327f8.g;
        if (num3 != null) {
            c0471k8.g = num3.intValue();
        }
        Integer num4 = c0327f8.d;
        if (num4 != null) {
            c0471k8.d = num4.intValue();
        }
        String str = c0327f8.i;
        if (str != null) {
            c0471k8.i = str;
        }
        String str2 = c0327f8.j;
        if (str2 != null) {
            c0471k8.j = str2;
        }
        return c0471k8;
    }
}
