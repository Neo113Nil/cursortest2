package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class U7 implements ProtobufConverter {
    public final Ig a;
    public final C0167c8 b;

    public /* synthetic */ U7(Ig ig, C0167c8 c0167c8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ig() : ig, (i & 2) != 0 ? new C0167c8(null, 1, null) : c0167c8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W7 toModel(@NotNull C0253f8 c0253f8) {
        EnumC0688ua enumC0688ua;
        C0253f8 c0253f82 = new C0253f8();
        int i = c0253f8.a;
        Integer valueOf = i != c0253f82.a ? Integer.valueOf(i) : null;
        String str = c0253f8.b;
        String str2 = !Intrinsics.d(str, c0253f82.b) ? str : null;
        String str3 = c0253f8.c;
        String str4 = !Intrinsics.d(str3, c0253f82.c) ? str3 : null;
        long j = c0253f8.d;
        Long valueOf2 = j != c0253f82.d ? Long.valueOf(j) : null;
        C0138b8 model = this.b.toModel(c0253f8.e);
        String str5 = c0253f8.f;
        String str6 = !Intrinsics.d(str5, c0253f82.f) ? str5 : null;
        String str7 = c0253f8.g;
        String str8 = !Intrinsics.d(str7, c0253f82.g) ? str7 : null;
        long j2 = c0253f8.h;
        Long valueOf3 = Long.valueOf(j2);
        if (j2 == c0253f82.h) {
            valueOf3 = null;
        }
        int i2 = c0253f8.i;
        Integer valueOf4 = i2 != c0253f82.i ? Integer.valueOf(i2) : null;
        int i3 = c0253f8.j;
        Integer valueOf5 = i3 != c0253f82.j ? Integer.valueOf(i3) : null;
        String str9 = c0253f8.k;
        String str10 = !Intrinsics.d(str9, c0253f82.k) ? str9 : null;
        int i4 = c0253f8.l;
        Integer valueOf6 = Integer.valueOf(i4);
        if (i4 == c0253f82.l) {
            valueOf6 = null;
        }
        Q9 a = valueOf6 != null ? Q9.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0253f8.m;
        String str12 = !Intrinsics.d(str11, c0253f82.m) ? str11 : null;
        int i5 = c0253f8.n;
        Integer valueOf7 = Integer.valueOf(i5);
        if (i5 == c0253f82.n) {
            valueOf7 = null;
        }
        EnumC0458mb a2 = valueOf7 != null ? EnumC0458mb.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i6 = c0253f8.o;
        Integer valueOf8 = Integer.valueOf(i6);
        if (i6 == c0253f82.o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC0688ua[] values = EnumC0688ua.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    enumC0688ua = EnumC0688ua.NATIVE;
                    break;
                }
                enumC0688ua = values[i7];
                EnumC0688ua[] enumC0688uaArr = values;
                if (enumC0688ua.a == intValue) {
                    break;
                }
                i7++;
                values = enumC0688uaArr;
            }
        } else {
            enumC0688ua = null;
        }
        Boolean a3 = this.a.a(c0253f8.p);
        int i8 = c0253f8.q;
        Integer valueOf9 = i8 != c0253f82.q ? Integer.valueOf(i8) : null;
        byte[] bArr = c0253f8.r;
        return new W7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a, str12, a2, enumC0688ua, a3, valueOf9, !Arrays.equals(bArr, c0253f82.r) ? bArr : null);
    }

    public U7(@NotNull Ig ig, @NotNull C0167c8 c0167c8) {
        this.a = ig;
        this.b = c0167c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0253f8 fromModel(@NotNull W7 w7) {
        C0253f8 c0253f8 = new C0253f8();
        Integer num = w7.a;
        if (num != null) {
            c0253f8.a = num.intValue();
        }
        String str = w7.b;
        if (str != null) {
            c0253f8.b = StringUtils.correctIllFormedString(str);
        }
        String str2 = w7.c;
        if (str2 != null) {
            c0253f8.c = StringUtils.correctIllFormedString(str2);
        }
        Long l = w7.d;
        if (l != null) {
            c0253f8.d = l.longValue();
        }
        C0138b8 c0138b8 = w7.e;
        if (c0138b8 != null) {
            c0253f8.e = this.b.fromModel(c0138b8);
        }
        String str3 = w7.f;
        if (str3 != null) {
            c0253f8.f = str3;
        }
        String str4 = w7.g;
        if (str4 != null) {
            c0253f8.g = str4;
        }
        Long l2 = w7.h;
        if (l2 != null) {
            c0253f8.h = l2.longValue();
        }
        Integer num2 = w7.i;
        if (num2 != null) {
            c0253f8.i = num2.intValue();
        }
        Integer num3 = w7.j;
        if (num3 != null) {
            c0253f8.j = num3.intValue();
        }
        String str5 = w7.k;
        if (str5 != null) {
            c0253f8.k = str5;
        }
        Q9 q9 = w7.l;
        if (q9 != null) {
            c0253f8.l = q9.a;
        }
        String str6 = w7.m;
        if (str6 != null) {
            c0253f8.m = str6;
        }
        EnumC0458mb enumC0458mb = w7.n;
        if (enumC0458mb != null) {
            c0253f8.n = enumC0458mb.a;
        }
        EnumC0688ua enumC0688ua = w7.o;
        if (enumC0688ua != null) {
            c0253f8.o = enumC0688ua.a;
        }
        Boolean bool = w7.p;
        if (bool != null) {
            c0253f8.p = this.a.fromModel(bool).intValue();
        }
        Integer num4 = w7.q;
        if (num4 != null) {
            c0253f8.q = num4.intValue();
        }
        byte[] bArr = w7.r;
        if (bArr != null) {
            c0253f8.r = bArr;
        }
        return c0253f8;
    }
}
