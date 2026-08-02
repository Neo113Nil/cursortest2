package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.zzacv;

/* loaded from: classes.dex */
public final class CodedInputStream$ArrayDecoder extends zzacv {
    public final byte[] buffer;
    public int bufferSizeAfterLimit;
    public int currentLimit;
    public int lastTag;
    public int limit;
    public int pos;
    public final int startPos;

    public CodedInputStream$ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
        this.zzb = 100;
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.startPos = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int getTotalBytesRead() {
        return this.pos - this.startPos;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean isAtEnd() {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int pushLimit(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i;
        if (totalBytesRead < 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.currentLimit;
        if (totalBytesRead > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = totalBytesRead;
        recomputeBufferSizeAfterLimit();
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    public final int readRawLittleEndian32() {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.pos = i + 4;
        byte[] bArr = this.buffer;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long readRawLittleEndian64() {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.pos = i + 8;
        byte[] bArr = this.buffer;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int readRawVarint32() {
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.buffer;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.pos = i5;
                return i;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    public final long readRawVarint64() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.pos;
        int i2 = this.limit;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.buffer;
            byte b = bArr[i];
            if (b >= 0) {
                this.pos = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.pos = i4;
                return j;
            }
        }
        return readRawVarint64SlowPath();
    }

    public final long readRawVarint64SlowPath() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.pos;
            if (i2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.buffer[i2] & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if ((readRawVarint32 >>> 3) != 0) {
            return readRawVarint32;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void recomputeBufferSizeAfterLimit() {
        int i = this.limit + this.bufferSizeAfterLimit;
        this.limit = i;
        int i2 = i - this.startPos;
        int i3 = this.currentLimit;
        if (i2 <= i3) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i4 = i2 - i3;
        this.bufferSizeAfterLimit = i4;
        this.limit = i - i4;
    }
}
