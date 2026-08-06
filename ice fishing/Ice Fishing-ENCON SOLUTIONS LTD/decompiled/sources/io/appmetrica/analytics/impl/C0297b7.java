package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297b7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0562le f5612a;

    /* renamed from: b, reason: collision with root package name */
    public final C0503j7 f5613b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0297b7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0581m7 fromModel(C0349d7 c0349d7) {
        C0581m7 c0581m7 = new C0581m7();
        Integer num = c0349d7.f5788a;
        if (num != null) {
            c0581m7.f6485a = num.intValue();
        }
        String str = c0349d7.f5789b;
        if (str != null) {
            c0581m7.f6486b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0349d7.f5790c;
        if (str2 != null) {
            c0581m7.f6487c = StringUtils.correctIllFormedString(str2);
        }
        Long l2 = c0349d7.f5791d;
        if (l2 != null) {
            c0581m7.f6488d = l2.longValue();
        }
        C0478i7 c0478i7 = c0349d7.f5792e;
        if (c0478i7 != null) {
            c0581m7.f6489e = this.f5613b.fromModel(c0478i7);
        }
        String str3 = c0349d7.f5793f;
        if (str3 != null) {
            c0581m7.f6490f = str3;
        }
        String str4 = c0349d7.f5794g;
        if (str4 != null) {
            c0581m7.f6491g = str4;
        }
        Long l3 = c0349d7.f5795h;
        if (l3 != null) {
            c0581m7.f6492h = l3.longValue();
        }
        Integer num2 = c0349d7.f5796i;
        if (num2 != null) {
            c0581m7.f6493i = num2.intValue();
        }
        Integer num3 = c0349d7.f5797j;
        if (num3 != null) {
            c0581m7.f6494j = num3.intValue();
        }
        String str5 = c0349d7.f5798k;
        if (str5 != null) {
            c0581m7.f6495k = str5;
        }
        I8 i8 = c0349d7.f5799l;
        if (i8 != null) {
            c0581m7.f6496l = i8.f4539a;
        }
        String str6 = c0349d7.f5800m;
        if (str6 != null) {
            c0581m7.f6497m = str6;
        }
        EnumC0352da enumC0352da = c0349d7.f5801n;
        if (enumC0352da != null) {
            c0581m7.f6498n = enumC0352da.f5815a;
        }
        EnumC0583m9 enumC0583m9 = c0349d7.f5802o;
        if (enumC0583m9 != null) {
            c0581m7.f6499o = enumC0583m9.f6510a;
        }
        Boolean bool = c0349d7.f5803p;
        if (bool != null) {
            c0581m7.f6500p = this.f5612a.fromModel(bool).intValue();
        }
        Integer num4 = c0349d7.f5804q;
        if (num4 != null) {
            c0581m7.f6501q = num4.intValue();
        }
        byte[] bArr = c0349d7.f5805r;
        if (bArr != null) {
            c0581m7.f6502r = bArr;
        }
        return c0581m7;
    }

    public C0297b7(C0562le c0562le, C0503j7 c0503j7) {
        this.f5612a = c0562le;
        this.f5613b = c0503j7;
    }

    public /* synthetic */ C0297b7(C0562le c0562le, C0503j7 c0503j7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0562le() : c0562le, (i2 & 2) != 0 ? new C0503j7(null, 1, null) : c0503j7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0349d7 toModel(C0581m7 c0581m7) {
        EnumC0583m9 enumC0583m9;
        C0581m7 c0581m72 = new C0581m7();
        int i2 = c0581m7.f6485a;
        Integer valueOf = i2 != c0581m72.f6485a ? Integer.valueOf(i2) : null;
        String str = c0581m7.f6486b;
        String str2 = !kotlin.jvm.internal.i.a(str, c0581m72.f6486b) ? str : null;
        String str3 = c0581m7.f6487c;
        String str4 = !kotlin.jvm.internal.i.a(str3, c0581m72.f6487c) ? str3 : null;
        long j2 = c0581m7.f6488d;
        Long valueOf2 = j2 != c0581m72.f6488d ? Long.valueOf(j2) : null;
        C0478i7 model = this.f5613b.toModel(c0581m7.f6489e);
        String str5 = c0581m7.f6490f;
        String str6 = !kotlin.jvm.internal.i.a(str5, c0581m72.f6490f) ? str5 : null;
        String str7 = c0581m7.f6491g;
        String str8 = !kotlin.jvm.internal.i.a(str7, c0581m72.f6491g) ? str7 : null;
        long j3 = c0581m7.f6492h;
        Long valueOf3 = Long.valueOf(j3);
        if (j3 == c0581m72.f6492h) {
            valueOf3 = null;
        }
        int i3 = c0581m7.f6493i;
        Integer valueOf4 = i3 != c0581m72.f6493i ? Integer.valueOf(i3) : null;
        int i4 = c0581m7.f6494j;
        Integer valueOf5 = i4 != c0581m72.f6494j ? Integer.valueOf(i4) : null;
        String str9 = c0581m7.f6495k;
        String str10 = !kotlin.jvm.internal.i.a(str9, c0581m72.f6495k) ? str9 : null;
        int i5 = c0581m7.f6496l;
        Integer valueOf6 = Integer.valueOf(i5);
        if (i5 == c0581m72.f6496l) {
            valueOf6 = null;
        }
        I8 a2 = valueOf6 != null ? I8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0581m7.f6497m;
        String str12 = !kotlin.jvm.internal.i.a(str11, c0581m72.f6497m) ? str11 : null;
        int i6 = c0581m7.f6498n;
        Integer valueOf7 = Integer.valueOf(i6);
        if (i6 == c0581m72.f6498n) {
            valueOf7 = null;
        }
        EnumC0352da a3 = valueOf7 != null ? EnumC0352da.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i7 = c0581m7.f6499o;
        Integer valueOf8 = Integer.valueOf(i7);
        if (i7 == c0581m72.f6499o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC0583m9[] values = EnumC0583m9.values();
            int length = values.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    EnumC0583m9 enumC0583m92 = values[i8];
                    EnumC0583m9[] enumC0583m9Arr = values;
                    if (enumC0583m92.f6510a == intValue) {
                        enumC0583m9 = enumC0583m92;
                        break;
                    }
                    i8++;
                    values = enumC0583m9Arr;
                } else {
                    enumC0583m9 = EnumC0583m9.NATIVE;
                    break;
                }
            }
        } else {
            enumC0583m9 = null;
        }
        Boolean a4 = this.f5612a.a(c0581m7.f6500p);
        int i9 = c0581m7.f6501q;
        Integer valueOf9 = i9 != c0581m72.f6501q ? Integer.valueOf(i9) : null;
        byte[] bArr = c0581m7.f6502r;
        return new C0349d7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a2, str12, a3, enumC0583m9, a4, valueOf9, !Arrays.equals(bArr, c0581m72.f6502r) ? bArr : null);
    }
}
