package androidx.compose.material;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.SystemClock;
import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.material3.DateInputValidator;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.ComposeNavigator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.google.common.collect.ImmutableList;
import com.google.mlkit.common.internal.zzb;
import com.squareup.cash.R;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(Ref$LongRef ref$LongRef, CoroutineScope coroutineScope, MutableState mutableState, MutableSharedFlow mutableSharedFlow, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, MutableSharedFlow mutableSharedFlow2, MutableState mutableState2) {
        this.$r8$classId = 6;
        this.f$0 = ref$LongRef;
        this.f$4 = coroutineScope;
        this.f$1 = mutableState;
        this.f$2 = mutableSharedFlow;
        this.f$3 = pointerEventHandlerCoroutine;
        this.f$5 = mutableSharedFlow2;
        this.f$6 = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.squareup.cash.onboarding.views.OnboardingLandingViewKt$VideoBackground$1$1$listener$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object failure;
        String string2;
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        final int i2 = 0;
        final int i3 = 1;
        ExoPlayerImpl exoPlayerImpl = null;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                List list = (List) obj8;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                SliderDraggableState sliderDraggableState = (SliderDraggableState) obj4;
                Function0 function0 = (Function0) obj3;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj9)).getFloatValue();
                float f2 = ((Ref$FloatRef) obj7).element;
                float f3 = ((Ref$FloatRef) obj6).element;
                if (list.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = list.get(0);
                    float abs = Math.abs(TransactorKt.lerp(f2, f3, ((Number) obj2).floatValue()) - floatValue2);
                    int size = list.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj10 = list.get(i3);
                            float abs2 = Math.abs(TransactorKt.lerp(f2, f3, ((Number) obj10).floatValue()) - floatValue2);
                            if (Float.compare(abs, abs2) > 0) {
                                obj2 = obj10;
                                abs = abs2;
                            }
                            if (i3 != size) {
                                i3++;
                            }
                        }
                    }
                }
                Float f4 = (Float) obj2;
                float lerp = f4 != null ? TransactorKt.lerp(f2, f3, f4.floatValue()) : floatValue2;
                if (floatValue2 != lerp) {
                    JobKt.launch$default(coroutineScope, null, null, new SliderKt$Slider$2$gestureEndAction$1$1$1(sliderDraggableState, floatValue2, lerp, floatValue, function0, null), 3);
                } else if (!((Boolean) sliderDraggableState.isDragging$delegate.getValue()).booleanValue() && function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                MutableState mutableState = (MutableState) obj8;
                Function1 function1 = (Function1) obj7;
                CalendarModelImpl calendarModelImpl = (CalendarModelImpl) obj6;
                Locale locale = (Locale) obj5;
                DateInputValidator dateInputValidator = (DateInputValidator) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                String str = textFieldValue.annotatedString.text;
                int length = str.length();
                String str2 = ((DateInputFormat) obj9).patternWithoutDelimiters;
                if (length <= str2.length()) {
                    while (true) {
                        if (i2 >= str.length()) {
                            mutableState2.setValue(textFieldValue);
                            String obj11 = StringsKt.trim(str).toString();
                            if (obj11.length() != 0 && obj11.length() >= str2.length()) {
                                CalendarDate parse = calendarModelImpl.parse(obj11, str2, locale);
                                mutableState.setValue(dateInputValidator.m521validateXivgLIo(parse, locale));
                                function1.invoke((((CharSequence) mutableState.getValue()).length() != 0 || parse == null) ? null : Long.valueOf(parse.utcTimeMillis));
                            } else {
                                mutableState.setValue("");
                                function1.invoke(null);
                            }
                        } else if (Character.isDigit(str.charAt(i2))) {
                            i2++;
                        }
                    }
                }
                break;
            case 2:
                MutableObjectFloatMap mutableObjectFloatMap = (MutableObjectFloatMap) obj9;
                ComposeNavigator composeNavigator = (ComposeNavigator) obj8;
                Function1 function12 = (Function1) obj7;
                Function1 function13 = (Function1) obj6;
                Function1 function14 = (Function1) obj5;
                MutableState mutableState3 = (MutableState) obj3;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                if (!((List) ((State) obj4).getValue()).contains(animatedContentTransitionScopeImpl.getInitialState())) {
                    break;
                } else {
                    String str3 = ((NavBackStackEntry) animatedContentTransitionScopeImpl.getInitialState()).id;
                    int findKeyIndex = mutableObjectFloatMap.findKeyIndex(str3);
                    if (findKeyIndex >= 0) {
                        f = mutableObjectFloatMap.values[findKeyIndex];
                    } else {
                        mutableObjectFloatMap.set(str3, RecyclerView.DECELERATION_RATE);
                    }
                    if (!Intrinsics.areEqual(((NavBackStackEntry) animatedContentTransitionScopeImpl.getTargetState()).id, ((NavBackStackEntry) animatedContentTransitionScopeImpl.getInitialState()).id)) {
                        f = (((Boolean) composeNavigator.isPop.getValue()).booleanValue() || ((Boolean) mutableState3.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                    }
                    mutableObjectFloatMap.set(((NavBackStackEntry) animatedContentTransitionScopeImpl.getTargetState()).id, f);
                    break;
                }
                break;
            case 3:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj9;
                SyncValueType syncValueType = (SyncValueType) obj3;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                ((zzb) localTabContentQueries.local_tab_contentAdapter).getClass();
                androidStatement.bindLong(0, Long.valueOf(((SyncTopic) obj8).value));
                androidStatement.bindString(1, (String) obj7);
                ((zzb) localTabContentQueries.local_tab_contentAdapter).getClass();
                androidStatement.bindLong(2, Long.valueOf(((SyncEntityType) obj6).value));
                androidStatement.bindBytes(3, (byte[]) obj5);
                androidStatement.bindLong(4, (Long) obj4);
                androidStatement.bindLong(5, syncValueType != null ? Long.valueOf(syncValueType.value) : null);
                break;
            case 4:
                Context context = (Context) obj9;
                final MutableState mutableState4 = (MutableState) obj8;
                final MutableState mutableState5 = (MutableState) obj7;
                final MutableState mutableState6 = (MutableState) obj6;
                final MutableState mutableState7 = (MutableState) obj5;
                String str4 = (String) obj4;
                final MutableState mutableState8 = (MutableState) obj3;
                final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) obj;
                lifecycleStartStopEffectScope.getClass();
                ((Function1) mutableState4.getValue()).invoke(Boolean.FALSE);
                final Ref$LongRef ref$LongRef = new Ref$LongRef();
                try {
                    exoPlayerImpl = new ExoPlayer.Builder(context.getApplicationContext()).build();
                } catch (Throwable unused) {
                }
                if (exoPlayerImpl != null) {
                    final ?? r16 = new Player.Listener() { // from class: com.squareup.cash.onboarding.views.OnboardingLandingViewKt$VideoBackground$1$1$listener$1
                        @Override // androidx.media3.common.Player.Listener
                        public final void onPlaybackStateChanged(int i4) {
                            if (i4 == 3) {
                                Function1 function15 = (Function1) mutableState4.getValue();
                                Boolean bool = Boolean.TRUE;
                                function15.invoke(bool);
                                MutableState mutableState9 = mutableState6;
                                if (((Boolean) mutableState9.getValue()).booleanValue()) {
                                    return;
                                }
                                mutableState9.setValue(bool);
                                ((Function1) mutableState7.getValue()).invoke(Long.valueOf(SystemClock.elapsedRealtime() - Ref$LongRef.this.element));
                            }
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public final void onPlayerError(PlaybackException playbackException) {
                            playbackException.getClass();
                            ((Function0) mutableState5.getValue()).invoke();
                        }
                    };
                    try {
                        Result.Companion companion = Result.Companion;
                        exoPlayerImpl.setMediaItems(ImmutableList.of((Object) MediaItem.fromUri(Uri.parse(str4))));
                        exoPlayerImpl.setRepeatMode(1);
                        exoPlayerImpl.setPlayWhenReady(true);
                        exoPlayerImpl.setVolume(RecyclerView.DECELERATION_RATE);
                        ref$LongRef.element = SystemClock.elapsedRealtime();
                        exoPlayerImpl.listeners.add(r16);
                        exoPlayerImpl.prepare();
                        failure = Unit.INSTANCE;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    if (!(failure instanceof Result.Failure)) {
                        mutableState8.setValue(exoPlayerImpl);
                        final ExoPlayerImpl exoPlayerImpl2 = exoPlayerImpl;
                        break;
                    } else {
                        try {
                            exoPlayerImpl.release();
                        } catch (Throwable unused2) {
                            Result.Companion companion3 = Result.Companion;
                        }
                        ((Function0) mutableState5.getValue()).invoke();
                        break;
                    }
                } else {
                    ((Function0) mutableState5.getValue()).invoke();
                    break;
                }
            case 5:
                Text text = (Text) obj8;
                Text text2 = (Text) obj7;
                SearchCommonMessageSection searchCommonMessageSection = (SearchCommonMessageSection) obj6;
                Section.Layout layout = (Section.Layout) obj5;
                Button button = (Button) obj4;
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj3;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) obj9);
                androidStatement2.bindBytes(1, text != null ? (byte[]) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries.rewardAdapter).callFactory).encode(text) : null);
                androidStatement2.bindBytes(2, text2 != null ? (byte[]) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries.rewardAdapter).baseUrl).encode(text2) : null);
                androidStatement2.bindBytes(3, searchCommonMessageSection != null ? (byte[]) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries.rewardAdapter).callAdapterFactories).encode(searchCommonMessageSection) : null);
                androidStatement2.bindString(4, layout != null ? (String) ((EnumColumnAdapter) ((Retrofit.Builder) rewardSlotQueries.rewardAdapter).converterFactories).encode(layout) : null);
                androidStatement2.bindBytes(5, button != null ? (byte[]) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries.rewardAdapter).callbackExecutor).encode(button) : null);
                break;
            case 6:
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) obj9;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj7;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj6;
                MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) obj4;
                MutableState mutableState9 = (MutableState) obj3;
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                CardModelView cardModelView = (CardModelView) ((MutableState) obj8).getValue();
                if (cardModelView != null) {
                    StateFlowKt.emitOrThrow(cardModelView.touchPoints, new PointF(Float.intBitsToFloat((int) (pointerInputChange.position >> 32)), Float.intBitsToFloat((int) (pointerInputChange.position & BodyPartID.bodyIdMax))));
                }
                long m625minusMKHz9U = Offset.m625minusMKHz9U(pointerInputChange.position, ref$LongRef2.element);
                ref$LongRef2.element = pointerInputChange.position;
                JobKt.launch$default(coroutineScope2, null, null, new ContentInViewNode$launchAnimation$2(mutableSharedFlow, m625minusMKHz9U, pointerEventHandlerCoroutine, mutableSharedFlow2, mutableState9, (Continuation) null), 3);
                pointerInputChange.consume();
                break;
            default:
                GovernmentIdNfcScan.Attributes attributes = (GovernmentIdNfcScan.Attributes) obj9;
                UiWorkflow uiWorkflow = (UiWorkflow) obj8;
                String str5 = (String) obj7;
                Date date = (Date) obj6;
                Date date2 = (Date) obj5;
                UiState.Displaying.NfcScan nfcScan = (UiState.Displaying.NfcScan) obj4;
                UiState.Displaying displaying = (UiState.Displaying) obj3;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (attributes == null || (string2 = attributes.getRequiredText()) == null) {
                    string2 = uiWorkflow.applicationContext.getString(R.string.pi2_retry);
                    string2.getClass();
                }
                if (StringsKt.isBlank(str5)) {
                    linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string2);
                }
                if (date == null) {
                    linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string2);
                }
                if (date2 == null) {
                    linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string2);
                }
                updater.state = UiState.Displaying.copy$default(displaying, null, CollectionsKt__CollectionsJVMKt.listOf(new UiComponentError.UiGovernmentIdNfcScanComponentError(nfcScan.component.name, null, linkedHashMap, 2, null)), null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.DQT_MARKER);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
    }
}
