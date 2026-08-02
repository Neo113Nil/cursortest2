package com.squareup.cash.observability.backend.real;

import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.util.Quintuple;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class ObservabilitySetupTeardown$manageDatadogLifecycle$4 extends AdaptedFunctionReference implements Function6 {
    public static final ObservabilitySetupTeardown$manageDatadogLifecycle$4 INSTANCE = new ObservabilitySetupTeardown$manageDatadogLifecycle$4(6, Quintuple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        return new Quintuple(bool, (FeatureFlag$JsonFeatureFlag.Options) obj2, bool2, (String) obj4, (String) obj5);
    }
}
