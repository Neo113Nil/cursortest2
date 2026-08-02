package com.anythink.basead.exoplayer.b;

import com.google.android.gms.internal.ads.Wv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f7226a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i, int i4, int i6) {
            super(r4.toString());
            StringBuilder j6 = Wv.j(i, i4, "Unhandled format: ", " Hz, ", " channels in encoding ");
            j6.append(i6);
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i, int i4, int i6);

    int b();

    int c();

    int d();

    void e();

    ByteBuffer f();

    boolean g();

    void h();

    void i();
}
