package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.datatransport.WinterFlowProcessorQuery;
import com.google.android.datatransport.WinterFlowSoftwareResolver;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int WinterFlowVariableVersionControl;
    public final LinkedHashMap WinterFlowTransactionManagerStrategy = new LinkedHashMap();
    public final WinterFlowProcessorQuery WinterFlowUnitTestResponse = new WinterFlowProcessorQuery(this);
    public final WinterFlowSoftwareResolver WinterFlowRouterRouter = new WinterFlowSoftwareResolver(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.WinterFlowRouterRouter;
    }
}
