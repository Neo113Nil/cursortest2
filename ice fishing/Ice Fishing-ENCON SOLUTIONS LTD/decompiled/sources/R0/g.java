package R0;

import a1.InterfaceC0089e;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements InterfaceC0089e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1724a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1725b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f1726c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f1724a = flutterJNI;
        this.f1725b = i2;
    }

    @Override // a1.InterfaceC0089e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f1726c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f1725b;
        FlutterJNI flutterJNI = this.f1724a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
