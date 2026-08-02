package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class qg7 extends ceg {
    public dsc g;
    public final nv6 h;
    public ByteBuffer i;
    public boolean j;
    public long k;
    public ByteBuffer l;
    public final int m;

    static {
        ynh.a("media3.decoder");
    }

    public qg7(int i) {
        super(1);
        this.h = new nv6();
        this.m = i;
    }

    public final ByteBuffer A(int i) {
        int i2 = this.m;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.i;
        throw new pg7(dfi.f("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), i, " < ", ")"));
    }

    public final void B(int i) {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null) {
            this.i = A(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.i = byteBuffer;
            return;
        }
        ByteBuffer A = A(i2);
        A.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            A.put(byteBuffer);
        }
        this.i = A;
    }

    public final void C() {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.l;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void z() {
        this.b = 0;
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.l;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.j = false;
    }
}
