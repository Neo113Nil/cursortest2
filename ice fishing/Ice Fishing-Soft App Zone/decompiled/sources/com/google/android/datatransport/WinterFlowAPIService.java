package com.google.android.datatransport;

import android.animation.ValueAnimator;
import android.view.View;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAPIService implements Runnable {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 1;

    public WinterFlowAPIService(InstallReferrer installReferrer, Object obj, Method method, Object[] objArr) {
        this.WinterFlowSyntax = installReferrer;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = method;
        this.WinterFlowRouterRouter = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InstallReferrerReadListener installReferrerReadListener;
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowRouterRouter;
        Object obj3 = this.WinterFlowUnitTestResponse;
        Object obj4 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                InstallReferrer installReferrer = (InstallReferrer) obj;
                try {
                    installReferrer.invokeI(obj4, (Method) obj3, (Object[]) obj2);
                    break;
                } catch (Throwable th) {
                    installReferrerReadListener = installReferrer.referrerCallback;
                    installReferrerReadListener.onFail(Util.formatString("invoke error (%s) thrown by (%s)", th.getMessage(), th.getClass().getCanonicalName()));
                    return;
                }
            default:
                WinterFlowControllerDataSource.WinterFlowSyntax((View) obj4, (WinterFlowValidatorEngine) obj3, (WinterFlowCacheManagerVersionControl) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public WinterFlowAPIService(View view, WinterFlowValidatorEngine winterFlowValidatorEngine, WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, ValueAnimator valueAnimator) {
        this.WinterFlowTransactionManagerStrategy = view;
        this.WinterFlowUnitTestResponse = winterFlowValidatorEngine;
        this.WinterFlowRouterRouter = winterFlowCacheManagerVersionControl;
        this.WinterFlowSyntax = valueAnimator;
    }
}
