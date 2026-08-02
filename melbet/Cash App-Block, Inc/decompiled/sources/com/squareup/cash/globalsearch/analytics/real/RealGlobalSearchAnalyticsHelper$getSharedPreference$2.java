package com.squareup.cash.globalsearch.analytics.real;

import android.content.SharedPreferences;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGlobalSearchAnalyticsHelper$getSharedPreference$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $key;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealGlobalSearchAnalyticsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealGlobalSearchAnalyticsHelper$getSharedPreference$2(RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realGlobalSearchAnalyticsHelper;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$key;
        RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = this.this$0;
        switch (i) {
            case 0:
                return new RealGlobalSearchAnalyticsHelper$getSharedPreference$2(realGlobalSearchAnalyticsHelper, str, continuation, 0);
            default:
                return new RealGlobalSearchAnalyticsHelper$getSharedPreference$2(realGlobalSearchAnalyticsHelper, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealGlobalSearchAnalyticsHelper$getSharedPreference$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$key;
        RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SharedPreferences sharedPreferences = realGlobalSearchAnalyticsHelper.preferences;
                String string2 = sharedPreferences.getString(str, null);
                if (string2 != null) {
                    return string2;
                }
                String m = re$$ExternalSyntheticOutline0.m();
                sharedPreferences.edit().putString(str, m).apply();
                return m;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String m2 = re$$ExternalSyntheticOutline0.m();
                realGlobalSearchAnalyticsHelper.preferences.edit().putString(str, m2).apply();
                return m2;
        }
    }
}
