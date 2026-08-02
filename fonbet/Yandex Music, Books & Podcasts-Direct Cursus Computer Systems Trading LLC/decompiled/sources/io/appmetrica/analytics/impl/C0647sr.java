package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0647sr extends MessageNano {
    public static volatile C0647sr[] b;
    public C0561pr[] a;

    public C0647sr() {
        a();
    }

    public static C0647sr[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C0647sr[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0647sr mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0561pr[] c0561prArr = this.a;
                int length = c0561prArr == null ? 0 : c0561prArr.length;
                int i = repeatedFieldArrayLength + length;
                C0561pr[] c0561prArr2 = new C0561pr[i];
                if (length != 0) {
                    System.arraycopy(c0561prArr, 0, c0561prArr2, 0, length);
                }
                while (length < i - 1) {
                    C0561pr c0561pr = new C0561pr();
                    c0561prArr2[length] = c0561pr;
                    codedInputByteBufferNano.readMessage(c0561pr);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0561pr c0561pr2 = new C0561pr();
                c0561prArr2[length] = c0561pr2;
                codedInputByteBufferNano.readMessage(c0561pr2);
                this.a = c0561prArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0561pr[] c0561prArr = this.a;
        if (c0561prArr != null && c0561prArr.length > 0) {
            int i = 0;
            while (true) {
                C0561pr[] c0561prArr2 = this.a;
                if (i >= c0561prArr2.length) {
                    break;
                }
                C0561pr c0561pr = c0561prArr2[i];
                if (c0561pr != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0561pr) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0561pr[] c0561prArr = this.a;
        if (c0561prArr != null && c0561prArr.length > 0) {
            int i = 0;
            while (true) {
                C0561pr[] c0561prArr2 = this.a;
                if (i >= c0561prArr2.length) {
                    break;
                }
                C0561pr c0561pr = c0561prArr2[i];
                if (c0561pr != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0561pr);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0647sr b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0647sr().mergeFrom(codedInputByteBufferNano);
    }

    public final C0647sr a() {
        this.a = C0561pr.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0647sr a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0647sr) MessageNano.mergeFrom(new C0647sr(), bArr);
    }
}
