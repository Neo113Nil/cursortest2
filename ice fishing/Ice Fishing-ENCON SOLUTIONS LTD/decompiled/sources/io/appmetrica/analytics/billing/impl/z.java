package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0376e9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f3606l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f3607m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f3608n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f3609o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f3610p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile z[] f3611q;

    /* renamed from: a, reason: collision with root package name */
    public int f3612a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3613b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3614c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3615d;

    /* renamed from: e, reason: collision with root package name */
    public u f3616e;

    /* renamed from: f, reason: collision with root package name */
    public long f3617f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3618g;

    /* renamed from: h, reason: collision with root package name */
    public int f3619h;

    /* renamed from: i, reason: collision with root package name */
    public int f3620i;

    /* renamed from: j, reason: collision with root package name */
    public y f3621j;

    /* renamed from: k, reason: collision with root package name */
    public x f3622k;

    public z() {
        a();
    }

    public static z[] b() {
        if (f3611q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3611q == null) {
                        f3611q = new z[0];
                    }
                } finally {
                }
            }
        }
        return f3611q;
    }

    public final z a() {
        this.f3612a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f3613b = bArr;
        this.f3614c = bArr;
        this.f3615d = bArr;
        this.f3616e = null;
        this.f3617f = 0L;
        this.f3618g = false;
        this.f3619h = 0;
        this.f3620i = 1;
        this.f3621j = null;
        this.f3622k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f3612a;
        if (i2 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f3613b) + computeSerializedSize;
        byte[] bArr = this.f3614c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f3614c);
        }
        if (!Arrays.equals(this.f3615d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f3615d);
        }
        u uVar = this.f3616e;
        if (uVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j2 = this.f3617f;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z2 = this.f3618g;
        if (z2) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z2);
        }
        int i3 = this.f3619h;
        if (i3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i4 = this.f3620i;
        if (i4 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i4);
        }
        y yVar = this.f3621j;
        if (yVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f3622k;
        return xVar != null ? computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, xVar) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f3612a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f3613b);
        byte[] bArr = this.f3614c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f3614c);
        }
        if (!Arrays.equals(this.f3615d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f3615d);
        }
        u uVar = this.f3616e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j2 = this.f3617f;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z2 = this.f3618g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(8, z2);
        }
        int i3 = this.f3619h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i4 = this.f3620i;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i4);
        }
        y yVar = this.f3621j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f3622k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f3612a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0376e9.G /* 26 */:
                    this.f3613b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f3614c = codedInputByteBufferNano.readBytes();
                    break;
                case C0376e9.f5891M /* 42 */:
                    this.f3615d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f3616e == null) {
                        this.f3616e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f3616e);
                    break;
                case 56:
                    this.f3617f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f3618g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f3619h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f3620i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f3621j == null) {
                        this.f3621j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f3621j);
                    break;
                case 98:
                    if (this.f3622k == null) {
                        this.f3622k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f3622k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static z a(byte[] bArr) {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
