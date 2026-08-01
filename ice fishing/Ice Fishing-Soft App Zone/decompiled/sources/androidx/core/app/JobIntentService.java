package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.datatransport.WinterFlowSchedulerFramework;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    public WinterFlowSchedulerFramework WinterFlowVariableVersionControl;

    static {
        new HashMap();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.WinterFlowVariableVersionControl.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.WinterFlowVariableVersionControl = new WinterFlowSchedulerFramework(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
