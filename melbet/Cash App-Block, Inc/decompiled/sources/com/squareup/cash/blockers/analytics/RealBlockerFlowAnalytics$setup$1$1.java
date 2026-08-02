package com.squareup.cash.blockers.analytics;

import com.squareup.cash.appforeground.AppForegroundState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class RealBlockerFlowAnalytics$setup$1$1 extends FunctionReferenceImpl implements Function2 {
    public static final RealBlockerFlowAnalytics$setup$1$1 INSTANCE = new RealBlockerFlowAnalytics$setup$1$1(2, AppForegroundState.class, "equals", "equals(Ljava/lang/Object;)Z", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AppForegroundState appForegroundState = (AppForegroundState) obj;
        appForegroundState.getClass();
        return Boolean.valueOf(appForegroundState.equals(obj2));
    }
}
