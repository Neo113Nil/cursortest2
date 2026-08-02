package defpackage;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class yfg implements rt5 {
    public final FlutterJNI a;
    public final int b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public yfg(FlutterJNI flutterJNI, int i) {
        this.a = flutterJNI;
        this.b = i;
    }

    @Override // defpackage.rt5
    public final void a(ByteBuffer byteBuffer) {
        if (this.c.getAndSet(true)) {
            ny61.r("Reply already submitted");
            return;
        }
        int i = this.b;
        FlutterJNI flutterJNI = this.a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i, byteBuffer, byteBuffer.position());
        }
    }
}
