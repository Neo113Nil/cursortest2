package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.Iterators$7;
import com.google.mlkit.vision.text.zzc;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import kotlin.reflect.jvm.internal.EqualityMode;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable, Serializable {
    public static final LiteralByteString EMPTY = new LiteralByteString(Internal.EMPTY_BYTE_ARRAY);
    public static final ByteArrayCopier byteArrayCopier;
    public int hash;

    /* loaded from: classes4.dex */
    public final class BoundedByteString extends LiteralByteString {
        public final int bytesLength;
        public final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte byteAt(int i) {
            int i2 = this.bytesLength;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.bytes[this.bytesOffset + i];
            }
            if (i < 0) {
                JWK$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
                return (byte) 0;
            }
            JWK$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index > length: ", i, i2, ", "));
            return (byte) 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final void copyToInternal(int i, byte[] bArr) {
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
        public final int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final int size() {
            return this.bytesLength;
        }
    }

    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    public class LiteralByteString extends ByteString {
        public final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            this.hash = 0;
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyToInternal(int i, byte[] bArr) {
            System.arraycopy(this.bytes, 0, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (!(obj instanceof LiteralByteString)) {
                    return obj.equals(this);
                }
                LiteralByteString literalByteString = (LiteralByteString) obj;
                int i = this.hash;
                int i2 = literalByteString.hash;
                if (i == 0 || i2 == 0 || i == i2) {
                    int size = size();
                    if (size > literalByteString.size()) {
                        a$$ExternalSyntheticBUOutline0.m(size, size());
                        return false;
                    }
                    if (size > literalByteString.size()) {
                        Handlers$$ExternalSyntheticBUOutline0.m(literalByteString.size(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(size, "Ran off end of other: 0, ", ", "));
                        return false;
                    }
                    byte[] bArr = literalByteString.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + size;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes();
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (this.bytes[offsetIntoBytes2] == bArr[offsetIntoBytes3]) {
                            offsetIntoBytes2++;
                            offsetIntoBytes3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return new Iterators$7(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }
    }

    public final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        byteArrayCopier = Android.isOnAndroidDevice() ? new SystemByteArrayCopier() : new zzc(9);
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static LiteralByteString copyFrom(int i, int i2, byte[] bArr) {
        checkRange(i, i + i2, bArr.length);
        return new LiteralByteString(byteArrayCopier.copyFrom(bArr, i, i2));
    }

    public abstract byte byteAt(int i);

    public abstract void copyToInternal(int i, byte[] bArr);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.hash;
        if (i != 0) {
            return i;
        }
        int size = size();
        LiteralByteString literalByteString = (LiteralByteString) this;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        int i2 = size;
        for (int i3 = offsetIntoBytes; i3 < offsetIntoBytes + size; i3++) {
            i2 = (i2 * 31) + literalByteString.bytes[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.hash = i2;
        return i2;
    }

    public abstract byte internalByteAt(int i);

    public abstract int size();

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(size, bArr);
        return bArr;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = EqualityMode.escapeBytes(this);
        } else {
            LiteralByteString literalByteString = (LiteralByteString) this;
            int checkRange = checkRange(0, 47, literalByteString.size());
            concat = EqualityMode.escapeBytes(checkRange == 0 ? EMPTY : new BoundedByteString(literalByteString.bytes, literalByteString.getOffsetIntoBytes(), checkRange)).concat("...");
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("<ByteString@", size, hexString, " size=", " contents=\""), concat, "\">");
    }
}
