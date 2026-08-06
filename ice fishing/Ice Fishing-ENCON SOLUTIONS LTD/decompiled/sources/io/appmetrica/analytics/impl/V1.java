package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class V1 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5192c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5193d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5194e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5195f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5196g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5197h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5198i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5199j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5200k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5201l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile V1[] f5202m;

    /* renamed from: a, reason: collision with root package name */
    public int f5203a;

    /* renamed from: b, reason: collision with root package name */
    public int f5204b;

    public V1() {
        a();
    }

    public static V1[] b() {
        if (f5202m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5202m == null) {
                        f5202m = new V1[0];
                    }
                } finally {
                }
            }
        }
        return f5202m;
    }

    public final V1 a() {
        this.f5203a = 0;
        this.f5204b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f5204b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f5203a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(2, this.f5203a);
        codedOutputByteBufferNano.writeInt32(3, this.f5204b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f5203a = readInt32;
                        break;
                }
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f5204b = readInt322;
                }
            }
        }
    }

    public static V1 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new V1().mergeFrom(codedInputByteBufferNano);
    }

    public static V1 a(byte[] bArr) {
        return (V1) MessageNano.mergeFrom(new V1(), bArr);
    }
}
