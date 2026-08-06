package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640oe implements InterfaceC0298b8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0743se f6674a;

    /* renamed from: b, reason: collision with root package name */
    public final C0499j3 f6675b;

    /* renamed from: c, reason: collision with root package name */
    public final C0739sa f6676c;

    /* renamed from: d, reason: collision with root package name */
    public final Jf f6677d;

    public C0640oe() {
        this(new C0743se(), new C0499j3(), new C0739sa(100), new Jf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0614ne c0614ne) {
        Di di;
        C0789u8 c0789u8 = new C0789u8();
        c0789u8.f6984a = c0614ne.f6614a;
        c0789u8.f6989f = new C0504j8();
        C0666pe c0666pe = c0614ne.f6615b;
        C0453h8 c0453h8 = new C0453h8();
        c0453h8.f6128a = StringUtils.getUTF8Bytes(c0666pe.f6741a);
        Mn a2 = this.f6676c.a(c0666pe.f6742b);
        c0453h8.f6129b = StringUtils.getUTF8Bytes((String) a2.f4785a);
        c0453h8.f6132e = c0666pe.f6743c.size();
        Map<String, String> map = c0666pe.f6744d;
        if (map != null) {
            di = this.f6674a.fromModel(map);
            c0453h8.f6130c = (C0556l8) di.f4305a;
        } else {
            di = null;
        }
        c0789u8.f6989f.f6256a = c0453h8;
        C0267a3 c0267a3 = new C0267a3(C0267a3.b(a2, di));
        List list = c0666pe.f6743c;
        ArrayList arrayList = new ArrayList();
        this.f6677d.getClass();
        int computeInt32Size = c0789u8.f6984a != new C0789u8().f6984a ? CodedOutputByteBufferNano.computeInt32Size(1, c0789u8.f6984a) : 0;
        C0763t8 c0763t8 = c0789u8.f6985b;
        if (c0763t8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c0763t8);
        }
        C0711r8 c0711r8 = c0789u8.f6986c;
        if (c0711r8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0711r8);
        }
        C0737s8 c0737s8 = c0789u8.f6987d;
        int i2 = 4;
        if (c0737s8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c0737s8);
        }
        C0350d8 c0350d8 = c0789u8.f6988e;
        if (c0350d8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0350d8);
        }
        C0504j8 c0504j8 = c0789u8.f6989f;
        if (c0504j8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0504j8);
        }
        ArrayList arrayList2 = new ArrayList();
        C0789u8 c0789u82 = new C0789u8();
        c0789u82.f6984a = c0789u8.f6984a;
        C0504j8 c0504j82 = new C0504j8();
        c0789u82.f6989f = c0504j82;
        c0504j82.f6256a = new C0453h8();
        C0453h8 c0453h82 = c0789u82.f6989f.f6256a;
        C0453h8 c0453h83 = c0789u8.f6989f.f6256a;
        c0453h82.f6129b = c0453h83.f6129b;
        c0453h82.f6128a = c0453h83.f6128a;
        c0453h82.f6132e = c0453h83.f6132e;
        c0453h82.f6130c = c0453h83.f6130c;
        int i3 = 0;
        C0267a3 c0267a32 = c0267a3;
        int i4 = computeInt32Size;
        while (i3 < list.size()) {
            C0525k3 c0525k3 = (C0525k3) list.get(i3);
            C0479i8 c0479i8 = new C0479i8();
            c0479i8.f6177a = i3;
            Di fromModel = this.f6675b.fromModel(c0525k3);
            c0479i8.f6178b = (C0375e8) fromModel.f4305a;
            fromModel.f4306b.getBytesTruncated();
            Di di2 = new Di(c0479i8, fromModel);
            Jf jf = this.f6677d;
            C0479i8 c0479i82 = (C0479i8) di2.f4305a;
            jf.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0479i82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i4 + computeRawVarint32Size > 204800) {
                c0789u82.f6989f.f6256a.f6131d = (C0479i8[]) arrayList2.toArray(new C0479i8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Di(c0789u82, c0267a32));
                C0789u8 c0789u83 = new C0789u8();
                c0789u83.f6984a = c0789u8.f6984a;
                C0504j8 c0504j83 = new C0504j8();
                c0789u83.f6989f = c0504j83;
                c0504j83.f6256a = new C0453h8();
                C0453h8 c0453h84 = c0789u83.f6989f.f6256a;
                C0453h8 c0453h85 = c0789u8.f6989f.f6256a;
                c0453h84.f6129b = c0453h85.f6129b;
                c0453h84.f6128a = c0453h85.f6128a;
                c0453h84.f6132e = c0453h85.f6132e;
                c0453h84.f6130c = c0453h85.f6130c;
                c0267a32 = c0267a3;
                i4 = computeInt32Size;
                c0789u82 = c0789u83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0479i8) di2.f4305a);
            c0267a32 = new C0267a3(C0267a3.b(c0267a32, di2.f4306b));
            i4 += computeRawVarint32Size;
            i3++;
            i2 = 4;
        }
        c0789u82.f6989f.f6256a.f6131d = (C0479i8[]) arrayList2.toArray(new C0479i8[arrayList2.size()]);
        arrayList.add(new Di(c0789u82, c0267a32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0640oe(C0743se c0743se, C0499j3 c0499j3, C0739sa c0739sa, Jf jf) {
        this.f6674a = c0743se;
        this.f6675b = c0499j3;
        this.f6676c = c0739sa;
        this.f6677d = jf;
    }

    public final C0614ne a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
