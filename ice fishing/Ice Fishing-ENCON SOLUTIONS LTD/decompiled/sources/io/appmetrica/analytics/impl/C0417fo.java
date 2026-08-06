package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417fo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6030e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6031f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6032g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6033h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C0417fo[] f6034i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6035a;

    /* renamed from: b, reason: collision with root package name */
    public int f6036b;

    /* renamed from: c, reason: collision with root package name */
    public C0443go f6037c;

    /* renamed from: d, reason: collision with root package name */
    public C0469ho f6038d;

    public C0417fo() {
        a();
    }

    public static C0417fo[] b() {
        if (f6034i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6034i == null) {
                        f6034i = new C0417fo[0];
                    }
                } finally {
                }
            }
        }
        return f6034i;
    }

    public final C0417fo a() {
        this.f6035a = WireFormatNano.EMPTY_BYTES;
        this.f6036b = 0;
        this.f6037c = null;
        this.f6038d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f6036b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f6035a) + super.computeSerializedSize();
        C0443go c0443go = this.f6037c;
        if (c0443go != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0443go);
        }
        C0469ho c0469ho = this.f6038d;
        return c0469ho != null ? computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c0469ho) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f6035a);
        codedOutputByteBufferNano.writeInt32(2, this.f6036b);
        C0443go c0443go = this.f6037c;
        if (c0443go != null) {
            codedOutputByteBufferNano.writeMessage(3, c0443go);
        }
        C0469ho c0469ho = this.f6038d;
        if (c0469ho != null) {
            codedOutputByteBufferNano.writeMessage(4, c0469ho);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0417fo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6035a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6036b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f6037c == null) {
                    this.f6037c = new C0443go();
                }
                codedInputByteBufferNano.readMessage(this.f6037c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6038d == null) {
                    this.f6038d = new C0469ho();
                }
                codedInputByteBufferNano.readMessage(this.f6038d);
            }
        }
    }

    public static C0417fo b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0417fo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0417fo a(byte[] bArr) {
        return (C0417fo) MessageNano.mergeFrom(new C0417fo(), bArr);
    }
}
