package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503j7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0562le f6254a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0503j7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0607n7 fromModel(C0478i7 c0478i7) {
        C0607n7 c0607n7 = new C0607n7();
        Boolean bool = c0478i7.f6166a;
        if (bool != null) {
            c0607n7.f6555a = this.f6254a.fromModel(bool).intValue();
        }
        Double d2 = c0478i7.f6168c;
        if (d2 != null) {
            c0607n7.f6557c = d2.doubleValue();
        }
        Double d3 = c0478i7.f6167b;
        if (d3 != null) {
            c0607n7.f6556b = d3.doubleValue();
        }
        Long l2 = c0478i7.f6173h;
        if (l2 != null) {
            c0607n7.f6562h = l2.longValue();
        }
        Integer num = c0478i7.f6171f;
        if (num != null) {
            c0607n7.f6560f = num.intValue();
        }
        Integer num2 = c0478i7.f6170e;
        if (num2 != null) {
            c0607n7.f6559e = num2.intValue();
        }
        Integer num3 = c0478i7.f6172g;
        if (num3 != null) {
            c0607n7.f6561g = num3.intValue();
        }
        Integer num4 = c0478i7.f6169d;
        if (num4 != null) {
            c0607n7.f6558d = num4.intValue();
        }
        String str = c0478i7.f6174i;
        if (str != null) {
            c0607n7.f6563i = str;
        }
        String str2 = c0478i7.f6175j;
        if (str2 != null) {
            c0607n7.f6564j = str2;
        }
        return c0607n7;
    }

    public C0503j7(C0562le c0562le) {
        this.f6254a = c0562le;
    }

    public /* synthetic */ C0503j7(C0562le c0562le, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0562le() : c0562le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0478i7 toModel(C0607n7 c0607n7) {
        if (c0607n7 == null) {
            return new C0478i7(null, null, null, null, null, null, null, null, null, null);
        }
        C0607n7 c0607n72 = new C0607n7();
        Boolean a2 = this.f6254a.a(c0607n7.f6555a);
        double d2 = c0607n7.f6557c;
        Double valueOf = !((d2 > c0607n72.f6557c ? 1 : (d2 == c0607n72.f6557c ? 0 : -1)) == 0) ? Double.valueOf(d2) : null;
        double d3 = c0607n7.f6556b;
        Double valueOf2 = !(d3 == c0607n72.f6556b) ? Double.valueOf(d3) : null;
        long j2 = c0607n7.f6562h;
        Long valueOf3 = j2 != c0607n72.f6562h ? Long.valueOf(j2) : null;
        int i2 = c0607n7.f6560f;
        Integer valueOf4 = i2 != c0607n72.f6560f ? Integer.valueOf(i2) : null;
        int i3 = c0607n7.f6559e;
        Integer valueOf5 = i3 != c0607n72.f6559e ? Integer.valueOf(i3) : null;
        int i4 = c0607n7.f6561g;
        Integer valueOf6 = i4 != c0607n72.f6561g ? Integer.valueOf(i4) : null;
        int i5 = c0607n7.f6558d;
        Integer valueOf7 = i5 != c0607n72.f6558d ? Integer.valueOf(i5) : null;
        String str = c0607n7.f6563i;
        String str2 = !kotlin.jvm.internal.i.a(str, c0607n72.f6563i) ? str : null;
        String str3 = c0607n7.f6564j;
        return new C0478i7(a2, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !kotlin.jvm.internal.i.a(str3, c0607n72.f6564j) ? str3 : null);
    }
}
