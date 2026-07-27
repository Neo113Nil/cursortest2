package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context.FrostHunterCameraXSolarEpic6706;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterJobIntentServiceHeroVortexVision1708;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    public static final HashMap FrostHunterFlowMaxDragonHero5809 = new HashMap();
    public FrostHunterJobIntentServiceHeroVortexVision1708 FrostHunterCameraXPixelTurboCosmos9814;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder binder;
        FrostHunterJobIntentServiceHeroVortexVision1708 frostHunterJobIntentServiceHeroVortexVision1708 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterJobIntentServiceHeroVortexVision1708 == null) {
            return null;
        }
        binder = frostHunterJobIntentServiceHeroVortexVision1708.getBinder();
        return binder;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterJobIntentServiceHeroVortexVision1708(this);
            return;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = FrostHunterFlowMaxDragonHero5809;
        if (((FrostHunterCameraXSolarEpic6706) hashMap.get(componentName)) == null) {
            if (i >= 26) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Can't be here without a job id");
                return;
            }
            FrostHunterCameraXSolarEpic6706 frostHunterCameraXSolarEpic6706 = new FrostHunterCameraXSolarEpic6706();
            getApplicationContext();
            PowerManager powerManager = (PowerManager) getSystemService("power");
            powerManager.newWakeLock(1, componentName.getClassName() + ":launch").setReferenceCounted(false);
            powerManager.newWakeLock(1, componentName.getClassName() + ":run").setReferenceCounted(false);
            hashMap.put(componentName, frostHunterCameraXSolarEpic6706);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
