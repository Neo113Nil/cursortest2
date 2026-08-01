package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.datatransport.WinterFlowAlgorithmDebug;
import com.google.android.datatransport.WinterFlowCacheManagerController;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements WinterFlowCacheManagerController {
    @Override // com.google.android.datatransport.WinterFlowCacheManagerController
    public final Object WinterFlowHookDataSource(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: com.google.android.datatransport.WinterFlowDataSourceWidget
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new WinterFlowBandwidthDeployment(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new WinterFlowAlgorithmDebug(19);
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerController
    public final List WinterFlowRouterStructure() {
        return Collections.EMPTY_LIST;
    }
}
