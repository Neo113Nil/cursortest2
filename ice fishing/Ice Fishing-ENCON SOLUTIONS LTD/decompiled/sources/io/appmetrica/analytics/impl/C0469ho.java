package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469ho extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0469ho[] f6153e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6154a;

    /* renamed from: b, reason: collision with root package name */
    public double f6155b;

    /* renamed from: c, reason: collision with root package name */
    public double f6156c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6157d;

    public C0469ho() {
        a();
    }

    public static C0469ho[] b() {
        if (f6153e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6153e == null) {
                        f6153e = new C0469ho[0];
                    }
                } finally {
                }
            }
        }
        return f6153e;
    }

    public final C0469ho a() {
        this.f6154a = WireFormatNano.EMPTY_BYTES;
        this.f6155b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6156c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6157d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f6154a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6154a);
        }
        if (Double.doubleToLongBits(this.f6155b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f6155b);
        }
        if (Double.doubleToLongBits(this.f6156c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f6156c);
        }
        boolean z2 = this.f6157d;
        return z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6154a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6154a);
        }
        if (Double.doubleToLongBits(this.f6155b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f6155b);
        }
        if (Double.doubleToLongBits(this.f6156c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(3, this.f6156c);
        }
        boolean z2 = this.f6157d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0469ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6154a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f6155b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f6156c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6157d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0469ho b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0469ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C0469ho a(byte[] bArr) {
        return (C0469ho) MessageNano.mergeFrom(new C0469ho(), bArr);
    }
}
