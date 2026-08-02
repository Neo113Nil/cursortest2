package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import yads.uj1;

/* loaded from: classes7.dex */
public interface ss81 {
    MediaFormat a();

    void a(Bundle bundle);

    int b();

    void b(int i);

    void c(int i, long j);

    void d(boolean z, int i);

    ByteBuffer e(int i);

    void flush();

    void h(int i, l271 l271Var, long j);

    void i(uj1 uj1Var, Handler handler);

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(int i, int i2, long j, int i3);

    ByteBuffer m(int i);

    void p(Surface surface);

    void release();
}
