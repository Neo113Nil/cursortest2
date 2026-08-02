package com.anythink.basead.exoplayer.b;

import com.icefishingapp.icefishing.AbstractC4404f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f6440a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i, int i6, int i9) {
            super(r4.toString());
            StringBuilder h9 = AbstractC4404f.h(i, i6, "Unhandled format: ", " Hz, ", " channels in encoding ");
            h9.append(i9);
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i, int i6, int i9);

    int b();

    int c();

    int d();

    void e();

    ByteBuffer f();

    boolean g();

    void h();

    void i();
}
