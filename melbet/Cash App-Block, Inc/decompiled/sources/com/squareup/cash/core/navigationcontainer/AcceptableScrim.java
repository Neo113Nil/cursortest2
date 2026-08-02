package com.squareup.cash.core.navigationcontainer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AcceptableScrim {
    public final MainActivity$$ExternalSyntheticLambda0 activeImageLoader;
    public final StateFlowImpl managedBounceAtBottom;
    public final ParcelableSnapshotMutableState managedDismissRequested;
    public final ParcelableSnapshotMutableState activeScrim = Updater.mutableStateOf$default(null);
    public final StateFlowImpl settledScrimState = FlowKt.MutableStateFlow(null);
    public final MutexImpl scrimLock = new MutexImpl();

    public AcceptableScrim(MainActivity$$ExternalSyntheticLambda0 mainActivity$$ExternalSyntheticLambda0) {
        this.activeImageLoader = mainActivity$$ExternalSyntheticLambda0;
        Boolean bool = Boolean.FALSE;
        this.managedDismissRequested = Updater.mutableStateOf$default(bool);
        this.managedBounceAtBottom = FlowKt.MutableStateFlow(bool);
    }

    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1312532987);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            ScrimScreen scrimScreen = (ScrimScreen) this.activeScrim.getValue();
            if (scrimScreen instanceof ScrimScreen.ManagedAccountSwitchScrimScreen) {
                gapComposer.startReplaceGroup(-287826916);
                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(scrimScreen);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RealAppConfigManager$update$2$2(this, (ScrimScreen.ManagedAccountSwitchScrimScreen) scrimScreen, null, 9);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, scrimScreen, (Function2) rememberedValue);
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(693438623, new MoleculeKt$$ExternalSyntheticLambda2(i2, (ScrimScreen.ManagedAccountSwitchScrimScreen) scrimScreen, this), gapComposer), gapComposer, 3072, 7);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-287362009);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-986495524, new MoleculeKt$$ExternalSyntheticLambda2(5, scrimScreen, this), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AcceptableScrim$$ExternalSyntheticLambda0(this, i);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(6:(2:3|(11:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(9:22|23|24|25|26|(2:28|(1:30))|15|16|17))(1:38))(3:52|(1:54)|32)|39|40|41|42|43|(6:45|26|(0)|15|16|17)|32))|41|42|43|(0)|32)|7|(0)(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r14, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:13:0x0033, B:14:0x00c1, B:15:0x00cf, B:26:0x0097, B:28:0x00a3, B:30:0x00ab), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.squareup.cash.core.navigationcontainer.AcceptableScrim, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v8, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v13, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object interact(Function2 function2, ContinuationImpl continuationImpl) {
        AcceptableScrim$interact$1 acceptableScrim$interact$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        Function2 function22;
        int i2;
        MutexImpl mutexImpl2;
        Object obj;
        try {
            try {
                if (continuationImpl instanceof AcceptableScrim$interact$1) {
                    acceptableScrim$interact$1 = (AcceptableScrim$interact$1) continuationImpl;
                    int i3 = acceptableScrim$interact$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        acceptableScrim$interact$1.label = i3 - PKIFailureInfo.systemUnavail;
                        Object obj2 = acceptableScrim$interact$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = acceptableScrim$interact$1.label;
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.activeScrim;
                        int i4 = 0;
                        StateFlowImpl stateFlowImpl = this.managedBounceAtBottom;
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.managedDismissRequested;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            acceptableScrim$interact$1.L$0 = (SuspendLambda) function2;
                            mutexImpl = this.scrimLock;
                            acceptableScrim$interact$1.L$1 = mutexImpl;
                            acceptableScrim$interact$1.I$0 = 0;
                            acceptableScrim$interact$1.label = 1;
                            if (mutexImpl.lock(acceptableScrim$interact$1) != coroutineSingletons) {
                                function22 = function2;
                                i2 = 0;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Object obj3 = acceptableScrim$interact$1.L$1;
                                SafeTrace.throwOnFailure(obj2);
                                obj = obj3;
                                parcelableSnapshotMutableState.setValue(null);
                                Boolean bool = Boolean.FALSE;
                                parcelableSnapshotMutableState2.setValue(bool);
                                stateFlowImpl.getClass();
                                stateFlowImpl.updateState(null, bool);
                                this = obj;
                                Unit unit = Unit.INSTANCE;
                                this.unlock(null);
                                return unit;
                            }
                            i4 = acceptableScrim$interact$1.I$1;
                            int i5 = acceptableScrim$interact$1.I$0;
                            ?? r13 = acceptableScrim$interact$1.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                i2 = i5;
                                mutexImpl2 = r13;
                                this = mutexImpl2;
                                if (((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue()) {
                                    this = mutexImpl2;
                                    if (parcelableSnapshotMutableState.getValue() instanceof ScrimScreen.ManagedAccountSwitchScrimScreen) {
                                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5();
                                        acceptableScrim$interact$1.L$0 = null;
                                        acceptableScrim$interact$1.L$1 = mutexImpl2;
                                        acceptableScrim$interact$1.I$0 = i2;
                                        acceptableScrim$interact$1.I$1 = i4;
                                        acceptableScrim$interact$1.label = 3;
                                        obj = mutexImpl2;
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                                this.unlock(null);
                                return unit2;
                            } catch (Throwable th) {
                                th = th;
                                this = r13;
                                this.unlock(null);
                                throw th;
                            }
                        }
                        i2 = acceptableScrim$interact$1.I$0;
                        ?? r2 = acceptableScrim$interact$1.L$1;
                        function22 = (Function2) acceptableScrim$interact$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        mutexImpl = r2;
                        Boolean bool2 = Boolean.FALSE;
                        parcelableSnapshotMutableState2.setValue(bool2);
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool2);
                        acceptableScrim$interact$1.L$0 = null;
                        acceptableScrim$interact$1.L$1 = mutexImpl;
                        acceptableScrim$interact$1.I$0 = i2;
                        acceptableScrim$interact$1.I$1 = 0;
                        acceptableScrim$interact$1.label = 2;
                        if (function22.invoke(this, acceptableScrim$interact$1) != coroutineSingletons) {
                            mutexImpl2 = mutexImpl;
                            this = mutexImpl2;
                            if (((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue()) {
                            }
                            Unit unit22 = Unit.INSTANCE;
                            this.unlock(null);
                            return unit22;
                        }
                        return coroutineSingletons;
                    }
                }
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool2);
                acceptableScrim$interact$1.L$0 = null;
                acceptableScrim$interact$1.L$1 = mutexImpl;
                acceptableScrim$interact$1.I$0 = i2;
                acceptableScrim$interact$1.I$1 = 0;
                acceptableScrim$interact$1.label = 2;
                if (function22.invoke(this, acceptableScrim$interact$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th2) {
                th = th2;
                this = mutexImpl;
                this.unlock(null);
                throw th;
            }
            if (i != 0) {
            }
            Boolean bool22 = Boolean.FALSE;
            parcelableSnapshotMutableState2.setValue(bool22);
        } catch (Throwable th3) {
            th = th3;
        }
        acceptableScrim$interact$1 = new AcceptableScrim$interact$1(this, continuationImpl);
        Object obj22 = acceptableScrim$interact$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptableScrim$interact$1.label;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.activeScrim;
        int i42 = 0;
        StateFlowImpl stateFlowImpl2 = this.managedBounceAtBottom;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState22 = this.managedDismissRequested;
    }
}
