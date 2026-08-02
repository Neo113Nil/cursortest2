package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface iih {
    void a();

    void b(Bundle bundle);

    void c(int i, int i2, long j, int i3);

    MediaFormat d();

    void e();

    void f(int i, nv6 nv6Var, long j, int i2);

    void flush();

    void g(int i);

    PersistableBundle h();

    ByteBuffer i(int i);

    void j(Surface surface);

    void k(int i);

    void l(int i, long j);

    ByteBuffer m(int i);

    void o(ckh ckhVar, Handler handler);

    default boolean p(hih hihVar) {
        return false;
    }

    int s();

    int t(MediaCodec.BufferInfo bufferInfo);
}
