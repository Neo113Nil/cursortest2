package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.versionedparcelable.CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356;
import androidx.versionedparcelable.LunarNodeUnificationStaticL2zqeVyA8a4JHSE54u58459701241467;
import androidx.versionedparcelable.TitanCloudSyntaxDecryptionYFvNwvTaE0mBTYDDzp68287933556530;
import java.util.HashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    public static final HashMap LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new HashMap();
    public LunarNodeUnificationStaticL2zqeVyA8a4JHSE54u58459701241467 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder binder;
        LunarNodeUnificationStaticL2zqeVyA8a4JHSE54u58459701241467 lunarNodeUnificationStaticL2zqeVyA8a4JHSE54u58459701241467 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (lunarNodeUnificationStaticL2zqeVyA8a4JHSE54u58459701241467 == null) {
            return null;
        }
        binder = lunarNodeUnificationStaticL2zqeVyA8a4JHSE54u58459701241467.getBinder();
        return binder;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new LunarNodeUnificationStaticL2zqeVyA8a4JHSE54u58459701241467(this);
            return;
        }
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (((TitanCloudSyntaxDecryptionYFvNwvTaE0mBTYDDzp68287933556530) hashMap.get(componentName)) == null) {
            if (i >= 26) {
                CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Can't be here without a job id");
                return;
            }
            TitanCloudSyntaxDecryptionYFvNwvTaE0mBTYDDzp68287933556530 titanCloudSyntaxDecryptionYFvNwvTaE0mBTYDDzp68287933556530 = new TitanCloudSyntaxDecryptionYFvNwvTaE0mBTYDDzp68287933556530();
            getApplicationContext();
            PowerManager powerManager = (PowerManager) getSystemService("power");
            powerManager.newWakeLock(1, componentName.getClassName() + ":launch").setReferenceCounted(false);
            powerManager.newWakeLock(1, componentName.getClassName() + ":run").setReferenceCounted(false);
            hashMap.put(componentName, titanCloudSyntaxDecryptionYFvNwvTaE0mBTYDDzp68287933556530);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
