package io.appmetrica.analytics.impl;

import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class Y7 implements ProtobufConverter {
    public final Yg a;
    public final C0356g8 b;

    public /* synthetic */ Y7(Yg yg, C0356g8 c0356g8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Yg() : yg, (i & 2) != 0 ? new C0356g8(null, 1, null) : c0356g8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0183a8 toModel(C0442j8 c0442j8) {
        Ba ba;
        C0442j8 c0442j82 = new C0442j8();
        int i = c0442j8.a;
        Integer valueOf = i != c0442j82.a ? Integer.valueOf(i) : null;
        String str = c0442j8.b;
        String str2 = !jl40.l(str, c0442j82.b) ? str : null;
        String str3 = c0442j8.c;
        String str4 = !jl40.l(str3, c0442j82.c) ? str3 : null;
        long j = c0442j8.d;
        Long valueOf2 = j != c0442j82.d ? Long.valueOf(j) : null;
        C0327f8 model = this.b.toModel(c0442j8.e);
        String str5 = c0442j8.f;
        String str6 = !jl40.l(str5, c0442j82.f) ? str5 : null;
        String str7 = c0442j8.g;
        String str8 = !jl40.l(str7, c0442j82.g) ? str7 : null;
        long j2 = c0442j8.h;
        Long valueOf3 = Long.valueOf(j2);
        if (j2 == c0442j82.h) {
            valueOf3 = null;
        }
        int i2 = c0442j8.i;
        Integer valueOf4 = i2 != c0442j82.i ? Integer.valueOf(i2) : null;
        int i3 = c0442j8.j;
        Integer valueOf5 = i3 != c0442j82.j ? Integer.valueOf(i3) : null;
        String str9 = c0442j8.k;
        String str10 = !jl40.l(str9, c0442j82.k) ? str9 : null;
        int i4 = c0442j8.l;
        Integer valueOf6 = Integer.valueOf(i4);
        if (i4 == c0442j82.l) {
            valueOf6 = null;
        }
        X9 a = valueOf6 != null ? X9.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0442j8.m;
        String str12 = !jl40.l(str11, c0442j82.m) ? str11 : null;
        int i5 = c0442j8.n;
        Integer valueOf7 = Integer.valueOf(i5);
        if (i5 == c0442j82.n) {
            valueOf7 = null;
        }
        EnumC0821wb a2 = valueOf7 != null ? EnumC0821wb.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i6 = c0442j8.o;
        Integer valueOf8 = Integer.valueOf(i6);
        if (i6 == c0442j82.o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            Ba[] values = Ba.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    ba = Ba.NATIVE;
                    break;
                }
                ba = values[i7];
                Ba[] baArr = values;
                if (ba.a == intValue) {
                    break;
                }
                i7++;
                values = baArr;
            }
        } else {
            ba = null;
        }
        Boolean a3 = this.a.a(c0442j8.p);
        int i8 = c0442j8.q;
        Integer valueOf9 = i8 != c0442j82.q ? Integer.valueOf(i8) : null;
        byte[] bArr = c0442j8.r;
        return new C0183a8(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a, str12, a2, ba, a3, valueOf9, !Arrays.equals(bArr, c0442j82.r) ? bArr : null);
    }

    public Y7(Yg yg, C0356g8 c0356g8) {
        this.a = yg;
        this.b = c0356g8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Y7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0442j8 fromModel(C0183a8 c0183a8) {
        C0442j8 c0442j8 = new C0442j8();
        Integer num = c0183a8.a;
        if (num != null) {
            c0442j8.a = num.intValue();
        }
        String str = c0183a8.b;
        if (str != null) {
            c0442j8.b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0183a8.c;
        if (str2 != null) {
            c0442j8.c = StringUtils.correctIllFormedString(str2);
        }
        Long l = c0183a8.d;
        if (l != null) {
            c0442j8.d = l.longValue();
        }
        C0327f8 c0327f8 = c0183a8.e;
        if (c0327f8 != null) {
            c0442j8.e = this.b.fromModel(c0327f8);
        }
        String str3 = c0183a8.f;
        if (str3 != null) {
            c0442j8.f = str3;
        }
        String str4 = c0183a8.g;
        if (str4 != null) {
            c0442j8.g = str4;
        }
        Long l2 = c0183a8.h;
        if (l2 != null) {
            c0442j8.h = l2.longValue();
        }
        Integer num2 = c0183a8.i;
        if (num2 != null) {
            c0442j8.i = num2.intValue();
        }
        Integer num3 = c0183a8.j;
        if (num3 != null) {
            c0442j8.j = num3.intValue();
        }
        String str5 = c0183a8.k;
        if (str5 != null) {
            c0442j8.k = str5;
        }
        X9 x9 = c0183a8.l;
        if (x9 != null) {
            c0442j8.l = x9.a;
        }
        String str6 = c0183a8.m;
        if (str6 != null) {
            c0442j8.m = str6;
        }
        EnumC0821wb enumC0821wb = c0183a8.n;
        if (enumC0821wb != null) {
            c0442j8.n = enumC0821wb.a;
        }
        Ba ba = c0183a8.o;
        if (ba != null) {
            c0442j8.o = ba.a;
        }
        Boolean bool = c0183a8.p;
        if (bool != null) {
            c0442j8.p = this.a.fromModel(bool).intValue();
        }
        Integer num4 = c0183a8.q;
        if (num4 != null) {
            c0442j8.q = num4.intValue();
        }
        byte[] bArr = c0183a8.r;
        if (bArr != null) {
            c0442j8.r = bArr;
        }
        return c0442j8;
    }
}
