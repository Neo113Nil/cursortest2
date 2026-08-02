package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface vx1 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    tx1 e(tx1 tx1Var);

    void f();

    void flush();

    boolean g();

    void reset();
}
