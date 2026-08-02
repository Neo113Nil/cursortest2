package com.google.android.gms.internal.time;

import androidx.glance.appwidget.protobuf.ByteString$LiteralByteString;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.internal.ChaCha20Util;
import com.google.crypto.tink.subtle.Bytes;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public abstract class zzgv {
    public int zza;
    public Object zzb;

    public zzgv(zzek zzekVar, int i) {
        if (zzekVar == null) {
            a$$ExternalSyntheticBUOutline0.m$3("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "invalid index: "));
            throw null;
        }
        this.zza = i;
        this.zzb = zzekVar;
    }

    public ByteBuffer chacha20Block(int i, byte[] bArr) {
        int[] createInitialState = createInitialState(i, ChaCha20Util.toIntArray(bArr));
        int[] iArr = (int[]) createInitialState.clone();
        ChaCha20Util.shuffleState(iArr);
        for (int i2 = 0; i2 < createInitialState.length; i2++) {
            createInitialState[i2] = createInitialState[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(createInitialState, 0, 16);
        return order;
    }

    public abstract void checkLastTagWas(int i);

    public abstract int[] createInitialState(int i, int[] iArr);

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract int nonceSizeInBytes();

    public abstract void popLimit(int i);

    public void process(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != nonceSizeInBytes()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + nonceSizeInBytes());
        }
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer chacha20Block = chacha20Block(this.zza + i3, bArr);
            if (i3 == i) {
                Bytes.xor(byteBuffer, byteBuffer2, chacha20Block, remaining % 64);
            } else {
                Bytes.xor(byteBuffer, byteBuffer2, chacha20Block, 64);
            }
        }
    }

    public abstract int pushLimit(int i);

    public abstract boolean readBool();

    public abstract ByteString$LiteralByteString readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    public abstract void zzb(zzei zzeiVar, Object obj);
}
