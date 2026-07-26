package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Context.FrostHunterDrawerLayoutUltraStrike3303;
import android.content.Context.FrostHunterKeyEventNovaXAlpha1220;
import android.content.Context.FrostHunterTransitionGammaTitanSpeed7178;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class DownloadService extends Service {
    public static final HashMap FrostHunterCameraXPixelTurboCosmos9814 = new HashMap();

    public abstract FrostHunterTransitionGammaTitanSpeed7178 FrostHunterAlphaAnimationNeoCosmos5761();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterCameraXPixelTurboCosmos9814.get(getClass()));
        FrostHunterAlphaAnimationNeoCosmos5761();
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        }
        throw null;
    }

    public final void onTimeout(int i, int i2) {
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("onTimeout() called by system. Calling stopSelf() to terminate gracefully.");
        stopSelf();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
