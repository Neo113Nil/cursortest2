package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0221bh implements InterfaceC0617p9 {
    public final C0336fh a;
    public final C0237c4 b;
    public final Rb c;
    public final C0857xi d;

    public C0221bh() {
        this(new C0336fh(), new C0237c4(), new Rb(100), new C0857xi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0802vl> fromModel(C0192ah c0192ah) {
        C0802vl c0802vl;
        I9 i9 = new I9();
        i9.a = c0192ah.a;
        i9.f = new C0848x9();
        C0250ch c0250ch = c0192ah.b;
        C0790v9 c0790v9 = new C0790v9();
        c0790v9.a = StringUtils.getUTF8Bytes(c0250ch.a);
        C0490kr a = this.c.a(c0250ch.b);
        c0790v9.b = StringUtils.getUTF8Bytes((String) a.a);
        c0790v9.e = c0250ch.c.size();
        Map<String, String> map = c0250ch.d;
        if (map != null) {
            c0802vl = this.a.fromModel(map);
            c0790v9.c = (C0906z9) c0802vl.a;
        } else {
            c0802vl = null;
        }
        i9.f.a = c0790v9;
        int i = 0;
        boolean z = true;
        S3 s3 = new S3(S3.b(a, c0802vl));
        List list = c0250ch.c;
        ArrayList arrayList = new ArrayList();
        this.d.getClass();
        int computeInt32Size = i9.a != new I9().a ? CodedOutputByteBufferNano.computeInt32Size(1, i9.a) : 0;
        H9 h9 = i9.b;
        if (h9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, h9);
        }
        F9 f9 = i9.c;
        if (f9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, f9);
        }
        G9 g9 = i9.d;
        int i2 = 4;
        if (g9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, g9);
        }
        C0674r9 c0674r9 = i9.e;
        if (c0674r9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0674r9);
        }
        C0848x9 c0848x9 = i9.f;
        if (c0848x9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0848x9);
        }
        ArrayList arrayList2 = new ArrayList();
        I9 i92 = new I9();
        i92.a = i9.a;
        C0848x9 c0848x92 = new C0848x9();
        i92.f = c0848x92;
        c0848x92.a = new C0790v9();
        C0790v9 c0790v92 = i92.f.a;
        C0790v9 c0790v93 = i9.f.a;
        c0790v92.b = c0790v93.b;
        c0790v92.a = c0790v93.a;
        c0790v92.e = c0790v93.e;
        c0790v92.c = c0790v93.c;
        S3 s32 = s3;
        int i3 = 0;
        int i4 = computeInt32Size;
        while (i3 < list.size()) {
            C0266d4 c0266d4 = (C0266d4) list.get(i3);
            boolean z2 = z;
            C0819w9 c0819w9 = new C0819w9();
            c0819w9.a = i3;
            int i5 = i;
            C0802vl fromModel = this.b.fromModel(c0266d4);
            c0819w9.b = (C0703s9) fromModel.a;
            fromModel.b.getBytesTruncated();
            C0802vl c0802vl2 = new C0802vl(c0819w9, fromModel);
            C0857xi c0857xi = this.d;
            C0819w9 c0819w92 = (C0819w9) c0802vl2.a;
            c0857xi.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0819w92);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i5 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i4 + computeRawVarint32Size > 204800) {
                i92.f.a.d = (C0819w9[]) arrayList2.toArray(new C0819w9[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C0802vl(i92, s32));
                I9 i93 = new I9();
                i93.a = i9.a;
                C0848x9 c0848x93 = new C0848x9();
                i93.f = c0848x93;
                c0848x93.a = new C0790v9();
                C0790v9 c0790v94 = i93.f.a;
                C0790v9 c0790v95 = i9.f.a;
                c0790v94.b = c0790v95.b;
                c0790v94.a = c0790v95.a;
                c0790v94.e = c0790v95.e;
                c0790v94.c = c0790v95.c;
                s32 = s3;
                i4 = computeInt32Size;
                i92 = i93;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0819w9) c0802vl2.a);
            T3 t3 = c0802vl2.b;
            T3[] t3Arr = new T3[2];
            t3Arr[i5] = s32;
            t3Arr[z2 ? 1 : 0] = t3;
            s32 = new S3(S3.b(t3Arr));
            i4 += computeRawVarint32Size;
            i3++;
            z = z2 ? 1 : 0;
            i = i5;
            i2 = 4;
        }
        i92.f.a.d = (C0819w9[]) arrayList2.toArray(new C0819w9[arrayList2.size()]);
        arrayList.add(new C0802vl(i92, s32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0221bh(C0336fh c0336fh, C0237c4 c0237c4, Rb rb, C0857xi c0857xi) {
        this.a = c0336fh;
        this.b = c0237c4;
        this.c = rb;
        this.d = c0857xi;
    }

    public final C0192ah a(List<C0802vl> list) {
        throw new UnsupportedOperationException();
    }
}
