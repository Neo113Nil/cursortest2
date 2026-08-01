package com.google.android.datatransport;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerAlgorithm extends WinterFlowWidgetInterface {
    public final /* synthetic */ WinterFlowWidgetDebug WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowInvokerAlgorithm(WinterFlowWidgetDebug winterFlowWidgetDebug, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.WinterFlowHookDataSource = winterFlowWidgetDebug;
        this.WinterFlowRouterStructure = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            new StringBuilder(String.valueOf(i).length() + 39);
            return;
        }
        int i2 = WinterFlowClassComponent.WinterFlowRouterStructure;
        WinterFlowWidgetDebug winterFlowWidgetDebug = this.WinterFlowHookDataSource;
        Context context = this.WinterFlowRouterStructure;
        int WinterFlowHookDataSource = winterFlowWidgetDebug.WinterFlowHookDataSource(context, i2);
        int i3 = WinterFlowEncryptionHandler.WinterFlowCacheManagerAgent;
        if (WinterFlowHookDataSource == 1 || WinterFlowHookDataSource == 2 || WinterFlowHookDataSource == 3 || WinterFlowHookDataSource == 9) {
            Intent WinterFlowRouterStructure = winterFlowWidgetDebug.WinterFlowRouterStructure(WinterFlowHookDataSource, context, "n");
            winterFlowWidgetDebug.WinterFlowTransactionManagerStrategy(context, WinterFlowHookDataSource, WinterFlowRouterStructure == null ? null : PendingIntent.getActivity(context, 0, WinterFlowRouterStructure, 201326592));
        }
    }
}
