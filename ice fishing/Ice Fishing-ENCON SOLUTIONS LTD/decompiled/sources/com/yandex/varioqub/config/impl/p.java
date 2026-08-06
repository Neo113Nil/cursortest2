package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0376e9;

/* loaded from: classes.dex */
public final class p extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public String f2789a;

    /* renamed from: b, reason: collision with root package name */
    public String f2790b;

    /* renamed from: c, reason: collision with root package name */
    public n[] f2791c;

    /* renamed from: d, reason: collision with root package name */
    public String f2792d;

    /* renamed from: e, reason: collision with root package name */
    public String f2793e;

    /* renamed from: f, reason: collision with root package name */
    public String f2794f;

    /* renamed from: g, reason: collision with root package name */
    public String f2795g;

    /* renamed from: h, reason: collision with root package name */
    public String f2796h;

    /* renamed from: i, reason: collision with root package name */
    public String f2797i;

    /* renamed from: j, reason: collision with root package name */
    public o[] f2798j;

    /* renamed from: k, reason: collision with root package name */
    public String f2799k;

    /* renamed from: l, reason: collision with root package name */
    public String f2800l;

    /* renamed from: m, reason: collision with root package name */
    public String f2801m;

    /* renamed from: n, reason: collision with root package name */
    public String f2802n;

    public p() {
        a();
    }

    public final void a() {
        this.f2789a = "";
        this.f2790b = "";
        if (n.f2783c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n.f2783c == null) {
                        n.f2783c = new n[0];
                    }
                } finally {
                }
            }
        }
        this.f2791c = n.f2783c;
        this.f2792d = "";
        this.f2793e = "";
        this.f2794f = "";
        this.f2795g = "";
        this.f2796h = "";
        this.f2797i = "";
        this.f2798j = o.b();
        this.f2799k = "";
        this.f2800l = "";
        this.f2801m = "";
        this.f2802n = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2789a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f2789a);
        }
        if (!this.f2790b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f2790b);
        }
        n[] nVarArr = this.f2791c;
        int i2 = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                n[] nVarArr2 = this.f2791c;
                if (i3 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i3];
                if (nVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, nVar) + computeSerializedSize;
                }
                i3++;
            }
        }
        if (!this.f2792d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f2792d);
        }
        if (!this.f2793e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.f2793e);
        }
        if (!this.f2794f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f2794f);
        }
        if (!this.f2795g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f2795g);
        }
        if (!this.f2796h.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.f2796h);
        }
        if (!this.f2797i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f2797i);
        }
        o[] oVarArr = this.f2798j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                o[] oVarArr2 = this.f2798j;
                if (i2 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i2];
                if (oVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, oVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        if (!this.f2799k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f2799k);
        }
        if (!this.f2800l.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(12, this.f2800l);
        }
        if (!this.f2801m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f2801m);
        }
        return !this.f2802n.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(14, this.f2802n) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f2789a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f2790b = codedInputByteBufferNano.readString();
                    break;
                case C0376e9.G /* 26 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    n[] nVarArr = this.f2791c;
                    int length = nVarArr == null ? 0 : nVarArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    n[] nVarArr2 = new n[i2];
                    if (length != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        n nVar = new n();
                        nVarArr2[length] = nVar;
                        codedInputByteBufferNano.readMessage(nVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    n nVar2 = new n();
                    nVarArr2[length] = nVar2;
                    codedInputByteBufferNano.readMessage(nVar2);
                    this.f2791c = nVarArr2;
                    break;
                case 34:
                    this.f2792d = codedInputByteBufferNano.readString();
                    break;
                case C0376e9.f5891M /* 42 */:
                    this.f2793e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f2794f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f2795g = codedInputByteBufferNano.readString();
                    break;
                case 66:
                    this.f2796h = codedInputByteBufferNano.readString();
                    break;
                case 74:
                    this.f2797i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    o[] oVarArr = this.f2798j;
                    int length2 = oVarArr == null ? 0 : oVarArr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    o[] oVarArr2 = new o[i3];
                    if (length2 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        o oVar = new o();
                        oVarArr2[length2] = oVar;
                        codedInputByteBufferNano.readMessage(oVar);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    o oVar2 = new o();
                    oVarArr2[length2] = oVar2;
                    codedInputByteBufferNano.readMessage(oVar2);
                    this.f2798j = oVarArr2;
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f2799k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f2800l = codedInputByteBufferNano.readString();
                    break;
                case 106:
                    this.f2801m = codedInputByteBufferNano.readString();
                    break;
                case 114:
                    this.f2802n = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2789a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2789a);
        }
        if (!this.f2790b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f2790b);
        }
        n[] nVarArr = this.f2791c;
        int i2 = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                n[] nVarArr2 = this.f2791c;
                if (i3 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i3];
                if (nVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, nVar);
                }
                i3++;
            }
        }
        if (!this.f2792d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f2792d);
        }
        if (!this.f2793e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f2793e);
        }
        if (!this.f2794f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f2794f);
        }
        if (!this.f2795g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f2795g);
        }
        if (!this.f2796h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f2796h);
        }
        if (!this.f2797i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f2797i);
        }
        o[] oVarArr = this.f2798j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                o[] oVarArr2 = this.f2798j;
                if (i2 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i2];
                if (oVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, oVar);
                }
                i2++;
            }
        }
        if (!this.f2799k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f2799k);
        }
        if (!this.f2800l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f2800l);
        }
        if (!this.f2801m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f2801m);
        }
        if (!this.f2802n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f2802n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
