package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Lg implements InterfaceC0369j9 {
    public final Pg a;
    public final Y3 b;
    public final Bb c;
    public final C0292gi d;

    public Lg() {
        this(new Pg(), new Y3(), new Bb(100), new C0292gi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0439ll> fromModel(@NonNull Kg kg) {
        C0439ll c0439ll;
        C9 c9 = new C9();
        c9.a = kg.a;
        c9.f = new C0600r9();
        Mg mg = kg.b;
        C0543p9 c0543p9 = new C0543p9();
        c0543p9.a = StringUtils.getUTF8Bytes(mg.a);
        Rq a = this.c.a(mg.b);
        c0543p9.b = StringUtils.getUTF8Bytes((String) a.a);
        c0543p9.e = mg.c.size();
        Map<String, String> map = mg.d;
        if (map != null) {
            c0439ll = this.a.fromModel(map);
            c0543p9.c = (C0658t9) c0439ll.a;
        } else {
            c0439ll = null;
        }
        c9.f.a = c0543p9;
        int i = 0;
        boolean z = true;
        P3 p3 = new P3(P3.b(a, c0439ll));
        List list = mg.c;
        ArrayList arrayList = new ArrayList();
        this.d.getClass();
        int computeInt32Size = c9.a != new C9().a ? CodedOutputByteBufferNano.computeInt32Size(1, c9.a) : 0;
        B9 b9 = c9.b;
        if (b9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, b9);
        }
        C0830z9 c0830z9 = c9.c;
        if (c0830z9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0830z9);
        }
        A9 a9 = c9.d;
        int i2 = 4;
        if (a9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, a9);
        }
        C0427l9 c0427l9 = c9.e;
        if (c0427l9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0427l9);
        }
        C0600r9 c0600r9 = c9.f;
        if (c0600r9 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0600r9);
        }
        ArrayList arrayList2 = new ArrayList();
        C9 c92 = new C9();
        c92.a = c9.a;
        C0600r9 c0600r92 = new C0600r9();
        c92.f = c0600r92;
        c0600r92.a = new C0543p9();
        C0543p9 c0543p92 = c92.f.a;
        C0543p9 c0543p93 = c9.f.a;
        c0543p92.b = c0543p93.b;
        c0543p92.a = c0543p93.a;
        c0543p92.e = c0543p93.e;
        c0543p92.c = c0543p93.c;
        P3 p32 = p3;
        int i3 = 0;
        int i4 = computeInt32Size;
        while (i3 < list.size()) {
            Z3 z3 = (Z3) list.get(i3);
            boolean z2 = z;
            C0572q9 c0572q9 = new C0572q9();
            c0572q9.a = i3;
            int i5 = i;
            C0439ll fromModel = this.b.fromModel(z3);
            c0572q9.b = (C0456m9) fromModel.a;
            fromModel.b.getBytesTruncated();
            C0439ll c0439ll2 = new C0439ll(c0572q9, fromModel);
            C0292gi c0292gi = this.d;
            C0572q9 c0572q92 = (C0572q9) c0439ll2.a;
            c0292gi.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0572q92);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i5 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i4 + computeRawVarint32Size > 204800) {
                c92.f.a.d = (C0572q9[]) arrayList2.toArray(new C0572q9[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C0439ll(c92, p32));
                C9 c93 = new C9();
                c93.a = c9.a;
                C0600r9 c0600r93 = new C0600r9();
                c93.f = c0600r93;
                c0600r93.a = new C0543p9();
                C0543p9 c0543p94 = c93.f.a;
                C0543p9 c0543p95 = c9.f.a;
                c0543p94.b = c0543p95.b;
                c0543p94.a = c0543p95.a;
                c0543p94.e = c0543p95.e;
                c0543p94.c = c0543p95.c;
                p32 = p3;
                i4 = computeInt32Size;
                c92 = c93;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0572q9) c0439ll2.a);
            Q3 q3 = c0439ll2.b;
            Q3[] q3Arr = new Q3[2];
            q3Arr[i5] = p32;
            q3Arr[z2 ? 1 : 0] = q3;
            p32 = new P3(P3.b(q3Arr));
            i4 += computeRawVarint32Size;
            i3++;
            z = z2 ? 1 : 0;
            i = i5;
            i2 = 4;
        }
        c92.f.a.d = (C0572q9[]) arrayList2.toArray(new C0572q9[arrayList2.size()]);
        arrayList.add(new C0439ll(c92, p32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Lg(Pg pg, Y3 y3, Bb bb, C0292gi c0292gi) {
        this.a = pg;
        this.b = y3;
        this.c = bb;
        this.d = c0292gi;
    }

    @NonNull
    public final Kg a(@NonNull List<C0439ll> list) {
        throw new UnsupportedOperationException();
    }
}
