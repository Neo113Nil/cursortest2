package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.view.ContentInfoCompat;
import androidx.room.Room;
import app.cash.arcade.protocol.host.arcade.TitleBarCoreProtocolNode$StartActionCallback;
import app.cash.arcade.protocol.host.arcade.TitleBarSubProtocolNode$NavigationCallback;
import app.cash.arcade.protocol.host.arcade.TitleBarSubProtocolNode$PrimaryActionCallback;
import app.cash.arcade.protocol.host.arcade.TitleBarSubProtocolNode$SecondaryActionCallback;
import app.cash.arcade.protocol.host.arcade.ToastProtocolNode$ActionOnClick;
import app.cash.arcade.protocol.host.redwoodlazylayout.RefreshableLazyListProtocolNode$OnRefresh;
import app.cash.redwood.treehouse.AndroidTreehouseDispatchers;
import app.cash.redwood.treehouse.CodeHost$State$Starting;
import app.cash.redwood.treehouse.RealTreehouseApp$codeHost$1;
import app.cash.redwood.treehouse.ZiplineCodeSession;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.arcade.treehouse.LegacyPasscodeInputBinding;
import com.squareup.cash.arcade.treehouse.PasscodeInputBinding;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncEntityStore;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncRangeStore;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.mooncake.components.MooncakeToggle;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.offers.backend.api.SearchTrackingState;
import com.squareup.cash.offers.backend.real.RealSearchTrackingManager;
import com.squareup.cash.treehouse.platform.CashTreehouseAppFactory;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes6.dex */
public final /* synthetic */ class WandScene$ring$3 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WandScene$ring$3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.squareup.cash.observability.backend.api.SpanTracking] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.squareup.cash.observability.backend.api.SpanTracking] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                ((WandScene) this.receiver).markDirty();
                break;
            case 1:
                TitleBarCoreProtocolNode$StartActionCallback titleBarCoreProtocolNode$StartActionCallback = (TitleBarCoreProtocolNode$StartActionCallback) this.receiver;
                titleBarCoreProtocolNode$StartActionCallback.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(titleBarCoreProtocolNode$StartActionCallback.id, 3, null, null, null));
                break;
            case 2:
                TitleBarSubProtocolNode$NavigationCallback titleBarSubProtocolNode$NavigationCallback = (TitleBarSubProtocolNode$NavigationCallback) this.receiver;
                titleBarSubProtocolNode$NavigationCallback.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(titleBarSubProtocolNode$NavigationCallback.id, 7, null, null, null));
                break;
            case 3:
                TitleBarSubProtocolNode$PrimaryActionCallback titleBarSubProtocolNode$PrimaryActionCallback = (TitleBarSubProtocolNode$PrimaryActionCallback) this.receiver;
                titleBarSubProtocolNode$PrimaryActionCallback.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(titleBarSubProtocolNode$PrimaryActionCallback.id, 4, null, null, null));
                break;
            case 4:
                TitleBarSubProtocolNode$SecondaryActionCallback titleBarSubProtocolNode$SecondaryActionCallback = (TitleBarSubProtocolNode$SecondaryActionCallback) this.receiver;
                titleBarSubProtocolNode$SecondaryActionCallback.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(titleBarSubProtocolNode$SecondaryActionCallback.id, 6, null, null, null));
                break;
            case 5:
                ToastProtocolNode$ActionOnClick toastProtocolNode$ActionOnClick = (ToastProtocolNode$ActionOnClick) this.receiver;
                toastProtocolNode$ActionOnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(toastProtocolNode$ActionOnClick.id, 7, null, null, null));
                break;
            case 6:
                RefreshableLazyListProtocolNode$OnRefresh refreshableLazyListProtocolNode$OnRefresh = (RefreshableLazyListProtocolNode$OnRefresh) this.receiver;
                refreshableLazyListProtocolNode$OnRefresh.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(refreshableLazyListProtocolNode$OnRefresh.id, 6, null, null, null));
                break;
            case 7:
                RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = (RealTreehouseApp$codeHost$1) this.receiver;
                CashTreehouseAppFactory.LauncherEventListenerFactory launcherEventListenerFactory = realTreehouseApp$codeHost$1.eventListenerFactory;
                if (launcherEventListenerFactory == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("closed");
                    break;
                } else {
                    AndroidTreehouseDispatchers.checkUi();
                    Room room = realTreehouseApp$codeHost$1.state;
                    if (!(room instanceof CodeHost$State$Starting)) {
                        CoroutineScope codeUpdatesScope = room.getCodeUpdatesScope();
                        if (codeUpdatesScope != null) {
                            JobKt.cancel(codeUpdatesScope, (CancellationException) null);
                        }
                        ZiplineCodeSession codeSession = room.getCodeSession();
                        if (codeSession != null) {
                            codeSession.removeListener(realTreehouseApp$codeHost$1.codeSessionListener);
                        }
                        ZiplineCodeSession codeSession2 = room.getCodeSession();
                        if (codeSession2 != null) {
                            codeSession2.stop();
                        }
                        ContextScope CoroutineScope = JobKt.CoroutineScope(new SupervisorJobImpl(JobKt.getJob(realTreehouseApp$codeHost$1.appScope.coroutineContext)));
                        realTreehouseApp$codeHost$1.state = new CodeHost$State$Starting(CoroutineScope);
                        realTreehouseApp$codeHost$1.mutableZipline.setValue(null);
                        JobKt.launch$default(CoroutineScope, realTreehouseApp$codeHost$1.dispatchers.zipline, null, new ZiplineLoader$ModuleJob$run$3(realTreehouseApp$codeHost$1, launcherEventListenerFactory, r5, 24), 2);
                    }
                    break;
                }
            case 8:
                LegacyPasscodeInputBinding legacyPasscodeInputBinding = (LegacyPasscodeInputBinding) this.receiver;
                int i = LegacyPasscodeInputBinding.$r8$clinit;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = legacyPasscodeInputBinding.inputEnabled$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = legacyPasscodeInputBinding.shakeTrigger$delegate;
                if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                    if (legacyPasscodeInputBinding.getPasscode().length() == 0) {
                        parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                    } else {
                        legacyPasscodeInputBinding.passcode$delegate.setValue(StringsKt___StringsKt.dropLast(1, legacyPasscodeInputBinding.getPasscode()));
                    }
                }
                break;
            case 9:
                LegacyPasscodeInputBinding legacyPasscodeInputBinding2 = (LegacyPasscodeInputBinding) this.receiver;
                int i2 = LegacyPasscodeInputBinding.$r8$clinit;
                if (((Boolean) legacyPasscodeInputBinding2.inputEnabled$delegate.getValue()).booleanValue()) {
                    legacyPasscodeInputBinding2.passcode$delegate.setValue("");
                }
                break;
            case 10:
                PasscodeInputBinding passcodeInputBinding = (PasscodeInputBinding) this.receiver;
                int i3 = PasscodeInputBinding.$r8$clinit;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = passcodeInputBinding.inputEnabled$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = passcodeInputBinding.shakeTrigger$delegate;
                if (((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue()) {
                    if (passcodeInputBinding.getPasscode$1().length() == 0) {
                        parcelableSnapshotMutableIntState2.setIntValue(parcelableSnapshotMutableIntState2.getIntValue() + 1);
                    } else {
                        passcodeInputBinding.passcode$delegate.setValue(StringsKt___StringsKt.dropLast(1, passcodeInputBinding.getPasscode$1()));
                    }
                }
                break;
            case 11:
                PasscodeInputBinding passcodeInputBinding2 = (PasscodeInputBinding) this.receiver;
                int i4 = PasscodeInputBinding.$r8$clinit;
                if (((Boolean) passcodeInputBinding2.inputEnabled$delegate.getValue()).booleanValue()) {
                    passcodeInputBinding2.passcode$delegate.setValue("");
                }
                break;
            case 12:
                ((CardModelView) this.receiver).scheduleRedraw();
                break;
            case 13:
                ((SignatureState) this.receiver).undo();
                break;
            case 14:
                ((StampState) this.receiver).undo();
                break;
            case 15:
                ((CardScene) this.receiver).markDirty();
                break;
            case 16:
                ((HeartScene) this.receiver).markDirty();
                break;
            case 17:
                ((MiniCardScene) this.receiver).markDirty();
                break;
            case 18:
                BootstrappedSyncEntityStore bootstrappedSyncEntityStore = (BootstrappedSyncEntityStore) this.receiver;
                bootstrappedSyncEntityStore.transactor.transaction(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(bootstrappedSyncEntityStore, 18));
                break;
            case 19:
                BootstrappedSyncRangeStore bootstrappedSyncRangeStore = (BootstrappedSyncRangeStore) this.receiver;
                bootstrappedSyncRangeStore.transactor.transaction(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(bootstrappedSyncRangeStore, 19));
                break;
            case 20:
                RealEducationStoryRepository realEducationStoryRepository = (RealEducationStoryRepository) this.receiver;
                StateFlowImpl stateFlowImpl = realEducationStoryRepository.expiryTime;
                long millis = realEducationStoryRepository.clock.millis();
                Duration.Companion companion = Duration.Companion;
                Long valueOf = Long.valueOf(Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(5, DurationUnit.MINUTES)) + millis);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, valueOf);
                break;
            case 21:
                ((Shaker) this.receiver).shake();
                break;
            case 22:
                ((MooncakeToggle) this.receiver).invalidate();
                break;
            case 23:
                RealSearchTrackingManager realSearchTrackingManager = (RealSearchTrackingManager) this.receiver;
                SpanTracking spanTracking = realSearchTrackingManager.mapAndRequestSpan;
                if (spanTracking != null) {
                    SpanTracking.spanEnded$default(spanTracking, null, 3);
                }
                SpanTracking spanTracking2 = realSearchTrackingManager.nullStateSpan;
                if (spanTracking2 != null) {
                    SpanTracking.spanEnded$default(spanTracking2, null, 3);
                }
                break;
            case 24:
                RealSearchTrackingManager realSearchTrackingManager2 = (RealSearchTrackingManager) this.receiver;
                SpanTracking spanTracking3 = realSearchTrackingManager2.mapAndRequestSpan;
                realSearchTrackingManager2.searchState$delegate.setValue(SearchTrackingState.copy$default(realSearchTrackingManager2.getSearchState(), null, null, spanTracking3 != null ? SpanTracking.childSpanStarted$default(spanTracking3, null, "offers_search_networkRequest", null, 12) : null, null, 11));
                break;
            case 25:
                SpanTracking spanTracking4 = ((RealSearchTrackingManager) this.receiver).getSearchState().requestTracking;
                if (spanTracking4 != null) {
                    SpanTracking.spanEnded$default(spanTracking4, null, 3);
                }
                break;
            case 26:
                RealSearchTrackingManager realSearchTrackingManager3 = (RealSearchTrackingManager) this.receiver;
                SpanTracking spanTracking5 = realSearchTrackingManager3.mapAndRequestSpan;
                realSearchTrackingManager3.searchState$delegate.setValue(SearchTrackingState.copy$default(realSearchTrackingManager3.getSearchState(), null, spanTracking5 != null ? SpanTracking.childSpanStarted$default(spanTracking5, null, "offers_search_Database", null, 12) : null, null, null, 13));
                break;
            case 27:
                SpanTracking spanTracking6 = ((RealSearchTrackingManager) this.receiver).getSearchState().dbTracking;
                if (spanTracking6 != null) {
                    SpanTracking.spanEnded$default(spanTracking6, null, 3);
                }
                break;
            case 28:
                RealSearchTrackingManager realSearchTrackingManager4 = (RealSearchTrackingManager) this.receiver;
                SpanTracking spanTracking7 = realSearchTrackingManager4.mapAndRequestSpan;
                realSearchTrackingManager4.searchState$delegate.setValue(SearchTrackingState.copy$default(realSearchTrackingManager4.getSearchState(), null, null, null, spanTracking7 != null ? SpanTracking.childSpanStarted$default(spanTracking7, null, "offers_search_mapping", null, 12) : null, 7));
                break;
            default:
                SpanTracking spanTracking8 = ((RealSearchTrackingManager) this.receiver).getSearchState().mapperTracking;
                if (spanTracking8 != null) {
                    SpanTracking.spanEnded$default(spanTracking8, null, 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
