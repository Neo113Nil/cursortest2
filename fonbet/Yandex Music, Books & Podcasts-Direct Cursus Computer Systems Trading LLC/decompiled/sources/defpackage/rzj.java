package defpackage;

import java.io.OutputStream;
import kotlin.KotlinVersion;

/* loaded from: classes4.dex */
public final class rzj extends OutputStream {
    public byte[] a;
    public int b;

    public final void a(byte b) {
        int i = this.b;
        byte[] bArr = this.a;
        if (i >= bArr.length) {
            kac.f("stream was teared");
        } else {
            bArr[i] = b;
            this.b = i + 1;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        a((byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        a((byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
        a((byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
        a((byte) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        while (i < i2) {
            a(bArr[i]);
            i++;
        }
    }
}
