package defpackage;

import android.graphics.SurfaceTexture;
import io.flutter.embedding.engine.FlutterJNI;
import org.webrtc.SurfaceTextureHelper;

/* loaded from: classes4.dex */
public final /* synthetic */ class vsr implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vsr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wsr wsrVar = (wsr) obj;
                FlutterJNI flutterJNI = wsrVar.e.a;
                if (!wsrVar.c && flutterJNI.isAttached()) {
                    wsrVar.b.markDirty();
                    flutterJNI.scheduleFrame();
                    break;
                }
                break;
            case 1:
                ((cnm0) obj).a.set(true);
                break;
            case 2:
                ((SurfaceTextureHelper) obj).lambda$new$0(surfaceTexture);
                break;
            default:
                ((rm81) obj).a.set(true);
                break;
        }
    }
}
