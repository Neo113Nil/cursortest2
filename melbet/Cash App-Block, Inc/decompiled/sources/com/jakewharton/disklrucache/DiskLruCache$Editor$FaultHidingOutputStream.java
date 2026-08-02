package com.jakewharton.disklrucache;

import com.android.volley.Response;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Mac;

/* loaded from: classes9.dex */
public final class DiskLruCache$Editor$FaultHidingOutputStream extends FilterOutputStream {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object this$1;

    public DiskLruCache$Editor$FaultHidingOutputStream(OutputStream outputStream, Mac mac) {
        super(outputStream);
        this.this$1 = mac;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$r8$classId;
        Object obj = this.this$1;
        switch (i) {
            case 0:
                try {
                    ((FilterOutputStream) this).out.close();
                    break;
                } catch (IOException unused) {
                    ((Response) obj).intermediate = true;
                    return;
                }
            default:
                ((FilterOutputStream) this).out.write(((Mac) obj).doFinal());
                ((FilterOutputStream) this).out.flush();
                ((FilterOutputStream) this).out.close();
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.$r8$classId) {
            case 0:
                try {
                    ((FilterOutputStream) this).out.flush();
                    break;
                } catch (IOException unused) {
                    ((Response) this.this$1).intermediate = true;
                    return;
                }
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.this$1;
        switch (i2) {
            case 0:
                try {
                    ((FilterOutputStream) this).out.write(i);
                    break;
                } catch (IOException unused) {
                    ((Response) obj).intermediate = true;
                    return;
                }
            default:
                ((Mac) obj).update((byte) i);
                ((FilterOutputStream) this).out.write(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$FaultHidingOutputStream(Response response, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.this$1 = response;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.this$1;
        switch (i3) {
            case 0:
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                    break;
                } catch (IOException unused) {
                    ((Response) obj).intermediate = true;
                    return;
                }
            default:
                ((Mac) obj).update(bArr, i, i2);
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                break;
        }
    }
}
