package com.google.android.datatransport;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewProtocol extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowWorkerThreadPool WinterFlowBandwidthObject;
    public final /* synthetic */ Context WinterFlowOrchestrationSubsystem;
    public int WinterFlowResponseEngine;
    public final /* synthetic */ ContentResolver WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowQueryInterface WinterFlowServiceUtility;
    public WinterFlowThreadPoolServiceProvider WinterFlowSyntax;
    public final /* synthetic */ Uri WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowViewProtocol(ContentResolver contentResolver, Uri uri, WinterFlowQueryInterface winterFlowQueryInterface, WinterFlowWorkerThreadPool winterFlowWorkerThreadPool, Context context, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = contentResolver;
        this.WinterFlowThreadListener = uri;
        this.WinterFlowServiceUtility = winterFlowQueryInterface;
        this.WinterFlowBandwidthObject = winterFlowWorkerThreadPool;
        this.WinterFlowOrchestrationSubsystem = context;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowViewProtocol winterFlowViewProtocol = new WinterFlowViewProtocol(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, this.WinterFlowBandwidthObject, this.WinterFlowOrchestrationSubsystem, winterFlowTransactionManagerLayer);
        winterFlowViewProtocol.WinterFlowTransactionAgent = obj;
        return winterFlowViewProtocol;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r6.WinterFlowRouterRouter(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0043, B:15:0x0054, B:17:0x005c, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowCacheInterface winterFlowCacheInterface;
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider;
        WinterFlowCacheInterface winterFlowCacheInterface2;
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider2;
        Object WinterFlowHookDataSource;
        int i = this.WinterFlowResponseEngine;
        WinterFlowQueryInterface winterFlowQueryInterface = this.WinterFlowServiceUtility;
        ContentResolver contentResolver = this.WinterFlowServerProtocol;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        try {
            if (i == 0) {
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowTransactionAgent;
                contentResolver.registerContentObserver(this.WinterFlowThreadListener, false, winterFlowQueryInterface);
                winterFlowThreadPoolServiceProvider = new WinterFlowThreadPoolServiceProvider(this.WinterFlowBandwidthObject);
                this.WinterFlowTransactionAgent = winterFlowCacheInterface;
                this.WinterFlowSyntax = winterFlowThreadPoolServiceProvider;
                this.WinterFlowResponseEngine = 1;
                WinterFlowHookDataSource = winterFlowThreadPoolServiceProvider.WinterFlowHookDataSource(this);
                if (WinterFlowHookDataSource != winterFlowListenerJava) {
                }
            } else if (i == 1) {
                winterFlowThreadPoolServiceProvider2 = this.WinterFlowSyntax;
                winterFlowCacheInterface2 = (WinterFlowCacheInterface) this.WinterFlowTransactionAgent;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                winterFlowThreadPoolServiceProvider2 = this.WinterFlowSyntax;
                winterFlowCacheInterface2 = (WinterFlowCacheInterface) this.WinterFlowTransactionAgent;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                winterFlowCacheInterface = winterFlowCacheInterface2;
                winterFlowThreadPoolServiceProvider = winterFlowThreadPoolServiceProvider2;
                this.WinterFlowTransactionAgent = winterFlowCacheInterface;
                this.WinterFlowSyntax = winterFlowThreadPoolServiceProvider;
                this.WinterFlowResponseEngine = 1;
                WinterFlowHookDataSource = winterFlowThreadPoolServiceProvider.WinterFlowHookDataSource(this);
                if (WinterFlowHookDataSource != winterFlowListenerJava) {
                    return winterFlowListenerJava;
                }
                WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider3 = winterFlowThreadPoolServiceProvider;
                winterFlowCacheInterface2 = winterFlowCacheInterface;
                obj = WinterFlowHookDataSource;
                winterFlowThreadPoolServiceProvider2 = winterFlowThreadPoolServiceProvider3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(winterFlowQueryInterface);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                winterFlowThreadPoolServiceProvider2.WinterFlowCacheManagerAgent();
                Context context = this.WinterFlowOrchestrationSubsystem;
                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowDeserializationSystem.WinterFlowRouterStructure;
                Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.WinterFlowTransactionAgent = winterFlowCacheInterface2;
                this.WinterFlowSyntax = winterFlowThreadPoolServiceProvider2;
                this.WinterFlowResponseEngine = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(winterFlowQueryInterface);
            throw th;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowViewProtocol) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheInterface) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
