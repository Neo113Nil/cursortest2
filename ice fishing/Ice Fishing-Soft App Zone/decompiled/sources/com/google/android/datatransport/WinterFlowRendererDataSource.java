package com.google.android.datatransport;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererDataSource extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowSyntaxTransactionManager WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRendererDataSource(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, int i) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowSyntaxTransactionManager;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int actionMasked;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Boolean bool = (Boolean) winterFlowSyntaxTransactionManager.WinterFlowRouterAdapter.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = winterFlowSyntaxTransactionManager.getConfiguration().getLocales();
                WinterFlowConcurrencyServer winterFlowConcurrencyServer = new WinterFlowConcurrencyServer(new WinterFlowConcurrencyUnitTest(locales));
                if (locales.isEmpty()) {
                    winterFlowConcurrencyServer = new WinterFlowConcurrencyServer(new WinterFlowConcurrencyUnitTest(LocaleList.getDefault()));
                }
                WinterFlowConcurrencyUnitTest winterFlowConcurrencyUnitTest = winterFlowConcurrencyServer.WinterFlowRouterStructure;
                int size = winterFlowConcurrencyUnitTest.WinterFlowRouterStructure.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = winterFlowConcurrencyUnitTest.WinterFlowRouterStructure.get(i2);
                    locale.getClass();
                    arrayList.add(new WinterFlowGatewayEngine(locale));
                }
                return new WinterFlowRuntimeException(arrayList);
            case 2:
                MotionEvent motionEvent = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    winterFlowSyntaxTransactionManager.WinterFlowXMLFramework = SystemClock.uptimeMillis();
                    winterFlowSyntaxTransactionManager.post(winterFlowSyntaxTransactionManager.WinterFlowServerStack);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                winterFlowSyntaxTransactionManager.get_viewTreeOwners();
                return null;
        }
    }
}
