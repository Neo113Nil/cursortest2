package e0;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131g implements m0.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1865b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f1866c = new AtomicBoolean(false);

    public C0131g(FlutterJNI flutterJNI, int i2) {
        this.f1864a = flutterJNI;
        this.f1865b = i2;
    }

    @Override // m0.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f1866c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f1865b;
        FlutterJNI flutterJNI = this.f1864a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
