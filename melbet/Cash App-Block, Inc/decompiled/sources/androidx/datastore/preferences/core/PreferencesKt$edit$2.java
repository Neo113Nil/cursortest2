package androidx.datastore.preferences.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class PreferencesKt$edit$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 $transform;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferencesKt$edit$2(Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function2 function2 = this.$transform;
        switch (i) {
            case 0:
                PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(function2, continuation, 0);
                preferencesKt$edit$2.L$0 = obj;
                return preferencesKt$edit$2;
            case 1:
                PreferencesKt$edit$2 preferencesKt$edit$22 = new PreferencesKt$edit$2(function2, continuation, 1);
                preferencesKt$edit$22.L$0 = obj;
                return preferencesKt$edit$22;
            default:
                PreferencesKt$edit$2 preferencesKt$edit$23 = new PreferencesKt$edit$2(function2, continuation, 2);
                preferencesKt$edit$23.L$0 = obj;
                return preferencesKt$edit$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((PreferencesKt$edit$2) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((PreferencesKt$edit$2) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((PreferencesKt$edit$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function2 function2 = this.$transform;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutablePreferences mutablePreferences = ((Preferences) this.L$0).toMutablePreferences();
                    this.L$0 = mutablePreferences;
                    this.label = 1;
                    return function2.invoke(mutablePreferences, this) == coroutineSingletons ? coroutineSingletons : mutablePreferences;
                }
                if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MutablePreferences mutablePreferences2 = (MutablePreferences) this.L$0;
                SafeTrace.throwOnFailure(obj);
                return mutablePreferences2;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Preferences preferences = (Preferences) this.L$0;
                    this.label = 1;
                    obj = function2.invoke(preferences, this);
                    if (obj == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Preferences preferences2 = (Preferences) obj;
                preferences2.getClass();
                ((AtomicBoolean) ((MutablePreferences) preferences2).frozen.f61default).set(true);
                return preferences2;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    this.label = 1;
                    if (function2.invoke(coroutineScope, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
