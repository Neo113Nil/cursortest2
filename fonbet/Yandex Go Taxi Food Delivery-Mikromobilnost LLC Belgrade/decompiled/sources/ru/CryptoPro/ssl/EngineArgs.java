package ru.CryptoPro.ssl;

import defpackage.ny61;
import defpackage.oyr;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes4.dex */
public class EngineArgs {
    public int a;
    public ByteBuffer[] appData;
    public int b;
    public int c;
    public int d;
    public int[] e;
    public int[] f;
    public int g = 0;
    public final boolean h = false;
    public ByteBuffer netData;

    public EngineArgs(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) {
        a(byteBuffer, byteBufferArr, i, i2);
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        if (byteBuffer == null || byteBufferArr == null) {
            ny61.g("src/dst is null");
            return;
        }
        if (i < 0 || i2 < 0 || i > byteBufferArr.length - i2) {
            ny61.s();
            return;
        }
        boolean z = this.h;
        if (z && byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        this.c = byteBuffer.position();
        this.d = byteBuffer.limit();
        this.e = new int[byteBufferArr.length];
        this.f = new int[byteBufferArr.length];
        for (int i3 = i; i3 < i + i2; i3++) {
            ByteBuffer byteBuffer2 = byteBufferArr[i3];
            if (byteBuffer2 == null) {
                ny61.g(oyr.j(i3, "appData[", "] == null"));
                return;
            }
            if (!z && byteBuffer2.isReadOnly()) {
                throw new ReadOnlyBufferException();
            }
            this.g = byteBufferArr[i3].remaining() + this.g;
            this.e[i3] = byteBufferArr[i3].position();
            this.f[i3] = byteBufferArr[i3].limit();
        }
        this.netData = byteBuffer;
        this.appData = byteBufferArr;
        this.a = i;
        this.b = i2;
    }

    public int deltaApp() {
        int i = 0;
        for (int i2 = this.a; i2 < this.a + this.b; i2++) {
            i += this.appData[i2].position() - this.e[i2];
        }
        return i;
    }

    public int deltaNet() {
        return this.netData.position() - this.c;
    }

    public void gather(int i) {
        for (int i2 = this.a; i2 < this.a + this.b && i > 0; i2++) {
            int min = Math.min(this.appData[i2].remaining(), i);
            ByteBuffer byteBuffer = this.appData[i2];
            byteBuffer.limit(byteBuffer.position() + min);
            this.netData.put(this.appData[i2]);
            this.g -= min;
            i -= min;
        }
    }

    public int getAppRemaining() {
        return this.g;
    }

    public void resetLim() {
        this.netData.limit(this.d);
        for (int i = this.a; i < this.a + this.b; i++) {
            this.appData[i].limit(this.f[i]);
        }
    }

    public void resetPos() {
        this.netData.position(this.c);
        for (int i = this.a; i < this.a + this.b; i++) {
            this.appData[i].position(this.e[i]);
        }
    }

    public void scatter(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        for (int i = this.a; i < this.a + this.b && remaining > 0; i++) {
            int min = Math.min(this.appData[i].remaining(), remaining);
            byteBuffer.limit(byteBuffer.position() + min);
            this.appData[i].put(byteBuffer);
            remaining -= min;
        }
    }

    public EngineArgs(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        a(byteBuffer, byteBufferArr, i, i2);
    }

    public void scatter(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < this.b + i && length > 0; i2++) {
            int min = Math.min(this.appData[i2].remaining(), length);
            this.appData[i2].put(bArr, i, min);
            length -= min;
            i += min;
        }
    }

    public void scatter(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i < i3 + i2 && i4 > 0) {
            int min = Math.min(this.appData[i].remaining(), i4);
            this.appData[i].put(bArr, i3, min);
            i4 -= min;
            i3 += min;
            i++;
        }
    }
}
