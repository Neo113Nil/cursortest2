package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface LP {
    ByteBuffer D(int i);

    ByteBuffer b(int i);

    int d();

    void g(ArrayList arrayList);

    MediaFormat h();

    void i(int i, C3834rN c3834rN, long j6, int i6);

    void j(Bundle bundle);

    void k();

    void l();

    void m(Surface surface);

    default boolean o(C4019ut c4019ut) {
        return false;
    }

    void q(int i);

    default void r(RunnableC3191fP runnableC3191fP) {
        runnableC3191fP.run();
    }

    void s();

    int t(MediaCodec.BufferInfo bufferInfo);

    void u(int i);

    void x(int i, int i6, int i9, long j6);

    void y(int i, long j6);
}
