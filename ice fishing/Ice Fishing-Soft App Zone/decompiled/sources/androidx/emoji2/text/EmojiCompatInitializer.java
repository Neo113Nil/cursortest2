package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.google.android.datatransport.WinterFlowCacheManagerController;
import com.google.android.datatransport.WinterFlowDatabaseUtility;
import com.google.android.datatransport.WinterFlowDecoratorVersion;
import com.google.android.datatransport.WinterFlowEventWorker;
import com.google.android.datatransport.WinterFlowIDEEngine;
import com.google.android.datatransport.WinterFlowMiddlewareSystem;
import com.google.android.datatransport.WinterFlowObjectPackage;
import com.google.android.datatransport.WinterFlowRepositoryEncryption;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements WinterFlowCacheManagerController {
    @Override // com.google.android.datatransport.WinterFlowCacheManagerController
    public final Object WinterFlowHookDataSource(Context context) {
        Object obj;
        WinterFlowMiddlewareSystem winterFlowMiddlewareSystem = new WinterFlowMiddlewareSystem(new WinterFlowEventWorker(context, 1));
        winterFlowMiddlewareSystem.WinterFlowRouterStructure = 1;
        if (WinterFlowIDEEngine.WinterFlowTransactionAgent == null) {
            synchronized (WinterFlowIDEEngine.WinterFlowResponseEngine) {
                try {
                    if (WinterFlowIDEEngine.WinterFlowTransactionAgent == null) {
                        WinterFlowIDEEngine.WinterFlowTransactionAgent = new WinterFlowIDEEngine(winterFlowMiddlewareSystem);
                    }
                } finally {
                }
            }
        }
        WinterFlowObjectPackage WinterFlowServerProtocol = WinterFlowObjectPackage.WinterFlowServerProtocol(context);
        WinterFlowServerProtocol.getClass();
        synchronized (WinterFlowObjectPackage.WinterFlowResponseEngine) {
            try {
                obj = ((HashMap) WinterFlowServerProtocol.WinterFlowTransactionManagerStrategy).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = WinterFlowServerProtocol.WinterFlowResponseEngine(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        WinterFlowDatabaseUtility WinterFlowUnitTestResponse = ((WinterFlowDecoratorVersion) obj).WinterFlowUnitTestResponse();
        WinterFlowUnitTestResponse.WinterFlowRouterStructure(new WinterFlowRepositoryEncryption(this, WinterFlowUnitTestResponse));
        return Boolean.TRUE;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerController
    public final List WinterFlowRouterStructure() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
