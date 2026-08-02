package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface MP {
    void A(int i, int i4, int i6, long j6);

    void B(int i, long j6);

    ByteBuffer D(int i);

    ByteBuffer b(int i);

    int d();

    void g(ArrayList arrayList);

    MediaFormat h();

    void i(int i, C3857rN c3857rN, long j6, int i4);

    void k();

    void l();

    void m(Bundle bundle);

    void o(Surface surface);

    default boolean p(C4042ut c4042ut) {
        return false;
    }

    void s();

    void t(int i);

    default void u(RunnableC3214fP runnableC3214fP) {
        runnableC3214fP.run();
    }

    int v(MediaCodec.BufferInfo bufferInfo);

    void y(int i);
}
