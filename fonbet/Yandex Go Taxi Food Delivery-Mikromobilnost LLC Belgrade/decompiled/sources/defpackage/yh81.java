package defpackage;

import java.nio.ByteBuffer;
import yads.ta0;

/* loaded from: classes7.dex */
public class yh81 extends db71 {
    public final l271 b = new l271();
    public ByteBuffer c;
    public boolean w;
    public long x;
    public ByteBuffer y;
    public final int z;

    static {
        xc81.a("goog.exo.decoder");
    }

    public yh81(int i) {
        this.z = i;
    }

    public void e() {
        this.a = 0;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.y;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.w = false;
    }

    public final void f() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.y;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final void g(int i) {
        ByteBuffer allocateDirect;
        ByteBuffer allocateDirect2;
        ByteBuffer byteBuffer = this.c;
        int i2 = this.z;
        if (byteBuffer == null) {
            if (i2 == 1) {
                allocateDirect2 = ByteBuffer.allocate(i);
            } else {
                if (i2 != 2) {
                    throw new ta0(byteBuffer != null ? byteBuffer.capacity() : 0, i);
                }
                allocateDirect2 = ByteBuffer.allocateDirect(i);
            }
            this.c = allocateDirect2;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i + position;
        if (capacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        if (i2 == 1) {
            allocateDirect = ByteBuffer.allocate(i3);
        } else {
            if (i2 != 2) {
                ByteBuffer byteBuffer2 = this.c;
                throw new ta0(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i3);
            }
            allocateDirect = ByteBuffer.allocateDirect(i3);
        }
        allocateDirect.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            allocateDirect.put(byteBuffer);
        }
        this.c = allocateDirect;
    }
}
