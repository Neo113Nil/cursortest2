package com.squareup.cash.session.backend;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import coil3.size.DimensionKt;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Error;
import com.bugsnag.android.Event;
import com.bugsnag.android.EventInternal;
import com.bugsnag.android.OnErrorCallback;
import com.bugsnag.android.Severity;
import com.squareup.analytics.cdp.CdpAnalytics;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.blockers.views.SwitchToEmailState;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.backend.real.WeakThrowableScribe;
import com.squareup.cash.observability.backend.real.bugsnag.RealBugsnagClient;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.ThrowableScribe;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinker;
import com.squareup.cash.threedsdataonly.backend.real.ThreeDsAuthenticationWorker$setup$1$1;
import com.squareup.cash.threedsdataonly.backend.real.ThreeDsAuthenticationWorker$setup$1$2;
import com.squareup.util.coroutines.CompositeSetupTeardown;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import papa.InteractionResult;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class SetupTeardownRunner$run$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $value;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetupTeardownRunner$run$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$value = obj2;
        this.this$0 = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$value;
        switch (i) {
            case 0:
                SetupTeardownRunner$run$2 setupTeardownRunner$run$2 = new SetupTeardownRunner$run$2((InteractionResult) obj2, obj3, continuation);
                setupTeardownRunner$run$2.L$0 = obj;
                return setupTeardownRunner$run$2;
            case 1:
                return new SetupTeardownRunner$run$2((CdpAnalytics) this.L$0, (StorageLinker) obj3, (StorageLink) obj2, continuation, 1);
            case 2:
                return new SetupTeardownRunner$run$2((TextFieldState) this.L$0, (MutableState) obj3, (RegisterAliasViewModel) obj2, continuation, 2);
            case 3:
                return new SetupTeardownRunner$run$2((Throwable) this.L$0, (RealBugsnagClient) obj3, (RealBrazeManager$$ExternalSyntheticLambda0) obj2, continuation, 3);
            case 4:
                SetupTeardownRunner$run$2 setupTeardownRunner$run$22 = new SetupTeardownRunner$run$2((Lifecycle) obj2, (ActivityTransitionsSideEffectsPerformer) obj3, continuation);
                setupTeardownRunner$run$22.L$0 = obj;
                return setupTeardownRunner$run$22;
            default:
                SetupTeardownRunner$run$2 setupTeardownRunner$run$23 = new SetupTeardownRunner$run$2((CoroutineContext) obj3, (Lazy) obj2, continuation);
                setupTeardownRunner$run$23.L$0 = obj;
                return setupTeardownRunner$run$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SetupTeardownRunner$run$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object[] objArr = 0;
        switch (this.$r8$classId) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Iterator it = ((ArrayList) ((InteractionResult) this.this$0).$$delegate_0).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new CoroutinesKt$until$2((CoroutineContext) pair.first, (CompositeSetupTeardown) pair.second, this.$value, (Continuation) null), 1);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CdpAnalytics cdpAnalytics = (CdpAnalytics) this.L$0;
                String linkedAccountToken = ((StorageLinker) this.$value).getLinkedAccountToken((StorageLink) this.this$0);
                if (linkedAccountToken != null) {
                    cdpAnalytics.latchedCustomerToken = linkedAccountToken;
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) this.$value;
                SwitchToEmailState switchToEmailState = (SwitchToEmailState) mutableState.getValue();
                SwitchToEmailState.Unhandled unhandled = switchToEmailState instanceof SwitchToEmailState.Unhandled ? (SwitchToEmailState.Unhandled) switchToEmailState : null;
                if (unhandled != null) {
                    String str = ((RegisterAliasViewModel) this.this$0).mode == RegisterAliasViewModel.Mode.EMAIL ? unhandled.input : null;
                    if (str != null) {
                        TextFieldState textFieldState = (TextFieldState) this.L$0;
                        TextFieldBuffer startEdit = textFieldState.startEdit();
                        try {
                            startEdit.replace(0, startEdit.buffer.length(), str);
                            textFieldState.commitEdit(startEdit);
                            textFieldState.finishEditing();
                            mutableState.setValue(SwitchToEmailState.Handled.INSTANCE);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            textFieldState.finishEditing();
                            throw th;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final Throwable th2 = (Throwable) this.L$0;
                final RealBugsnagClient realBugsnagClient = (RealBugsnagClient) this.$value;
                final RealBrazeManager$$ExternalSyntheticLambda0 realBrazeManager$$ExternalSyntheticLambda0 = (RealBrazeManager$$ExternalSyntheticLambda0) this.this$0;
                Bugsnag.getClient().notify(th2, new OnErrorCallback() { // from class: com.squareup.cash.observability.backend.real.bugsnag.RealBugsnagClient$notify$1$$ExternalSyntheticLambda0
                    @Override // com.bugsnag.android.OnErrorCallback
                    public final boolean onError(Event event) {
                        Severity severity;
                        EventInternal eventInternal = event.impl;
                        RealBrazeManager$$ExternalSyntheticLambda0 realBrazeManager$$ExternalSyntheticLambda02 = realBrazeManager$$ExternalSyntheticLambda0;
                        Throwable th3 = th2;
                        ReportedError reportedError = (ReportedError) th3;
                        int ordinal = reportedError.getImpact().severity.ordinal();
                        if (ordinal == 0) {
                            severity = Severity.ERROR;
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return false;
                            }
                            severity = Severity.WARNING;
                        }
                        if (severity != null) {
                            eventInternal.severityReason.currentSeverity = severity;
                        } else {
                            event.logNull$1("severity");
                        }
                        ThrowableScribe throwableScribe = realBugsnagClient.throwableScribe;
                        if (throwableScribe != null && th3 != null) {
                            if (throwableScribe == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("throwableScribe");
                                throw null;
                            }
                            DimensionKt.access$addMetadata(event, (Map) ((WeakThrowableScribe) throwableScribe).annotations.remove(th3));
                        }
                        try {
                            DimensionKt.access$addMetadata(event, (Map) realBrazeManager$$ExternalSyntheticLambda02.invoke());
                        } catch (Throwable th4) {
                            Timber.Forest.w("Failed to produce metadata for error report.", new Object[0], th4);
                        }
                        String title = reportedError.getTitle();
                        if (title != null) {
                            ArrayList arrayList = eventInternal.errors;
                            arrayList.getClass();
                            ((Error) CollectionsKt.first((List) arrayList)).setErrorClass(title);
                        }
                        return true;
                    }
                });
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer = (ActivityTransitionsSideEffectsPerformer) this.$value;
                JobKt.launch$default(coroutineScope2, null, null, new ThreeDsAuthenticationWorker$setup$1$1(activityTransitionsSideEffectsPerformer, null, 0), 3);
                JobKt.launch$default(coroutineScope2, null, null, new ThreeDsAuthenticationWorker$setup$1$2((Lifecycle) this.this$0, activityTransitionsSideEffectsPerformer, null), 3);
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope3, (CoroutineContext) this.$value, null, new CashApp$onCreate$1((Lazy) this.this$0, objArr == true ? 1 : 0, 9), 2);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupTeardownRunner$run$2(Lifecycle lifecycle, ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.$value = activityTransitionsSideEffectsPerformer;
        this.this$0 = lifecycle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupTeardownRunner$run$2(CoroutineContext coroutineContext, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$value = coroutineContext;
        this.this$0 = lazy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupTeardownRunner$run$2(InteractionResult interactionResult, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = interactionResult;
        this.$value = obj;
    }
}
