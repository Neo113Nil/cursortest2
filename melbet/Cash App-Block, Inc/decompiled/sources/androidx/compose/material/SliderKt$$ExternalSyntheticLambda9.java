package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ State f$6;
    public final /* synthetic */ MutableState f$7;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda9(boolean z, SliderDraggableState sliderDraggableState, MutableInteractionSourceImpl mutableInteractionSourceImpl, float f, boolean z2, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableState mutableState) {
        this.f$0 = z;
        this.f$1 = sliderDraggableState;
        this.f$2 = mutableInteractionSourceImpl;
        this.f$3 = f;
        this.f$4 = z2;
        this.f$5 = mutableFloatState;
        this.f$6 = mutableFloatState2;
        this.f$7 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$5;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        boolean z = this.f$0;
        final int i2 = 0;
        switch (i) {
            case 0:
                final DraggableState draggableState = (DraggableState) obj7;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj6;
                final MutableState mutableState = (MutableState) obj5;
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(1945228890);
                if (z) {
                    gapComposer.startReplaceGroup(-1679801122);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj4) {
                        rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                    final float f = this.f$3;
                    Float valueOf = Float.valueOf(f);
                    final boolean z2 = this.f$4;
                    Object[] objArr = {draggableState, mutableInteractionSourceImpl, valueOf, Boolean.valueOf(z2)};
                    boolean changed = gapComposer.changed(z2) | gapComposer.changed(f) | gapComposer.changed(mutableState);
                    final State state = this.f$6;
                    boolean changed2 = changed | gapComposer.changed(state) | gapComposer.changedInstance(coroutineScope) | gapComposer.changedInstance(draggableState);
                    final MutableState mutableState2 = this.f$7;
                    boolean changed3 = gapComposer.changed(mutableState2) | changed2;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue2 == obj4) {
                        Object obj8 = new PointerInputEventHandler() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1

                            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1, reason: invalid class name */
                            public final class AnonymousClass1 extends SuspendLambda implements Function3 {
                                public final /* synthetic */ boolean $isRtl;
                                public final /* synthetic */ float $maxPx;
                                public final /* synthetic */ MutableState $pressOffset;
                                public final /* synthetic */ State $rawOffset;
                                public /* synthetic */ long J$0;
                                public /* synthetic */ PressGestureScope L$0;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(boolean z, float f, MutableState mutableState, State state, Continuation continuation) {
                                    super(3, continuation);
                                    this.$isRtl = z;
                                    this.$maxPx = f;
                                    this.$pressOffset = mutableState;
                                    this.$rawOffset = state;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    long j = ((Offset) obj2).packedValue;
                                    MutableState mutableState = this.$pressOffset;
                                    State state = this.$rawOffset;
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, mutableState, state, (Continuation) obj3);
                                    anonymousClass1.L$0 = (PressGestureScope) obj;
                                    anonymousClass1.J$0 = j;
                                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    float intBitsToFloat;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i = this.label;
                                    MutableState mutableState = this.$pressOffset;
                                    try {
                                        if (i == 0) {
                                            SafeTrace.throwOnFailure(obj);
                                            PressGestureScope pressGestureScope = this.L$0;
                                            long j = this.J$0;
                                            if (this.$isRtl) {
                                                intBitsToFloat = this.$maxPx - Float.intBitsToFloat((int) (j >> 32));
                                            } else {
                                                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                            }
                                            mutableState.setValue(new Float(intBitsToFloat - ((Number) this.$rawOffset.getValue()).floatValue()));
                                            this.label = 1;
                                            if (pressGestureScope.awaitRelease(this) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            if (i != 1) {
                                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            SafeTrace.throwOnFailure(obj);
                                        }
                                    } catch (GestureCancellationException unused) {
                                        mutableState.setValue(new Float(RecyclerView.DECELERATION_RATE));
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, new AnonymousClass1(z2, f, mutableState, state, null), new MenuKt$$ExternalSyntheticLambda0(coroutineScope, draggableState, mutableState2, 18), continuation, 3);
                                return detectTapGestures$default == CoroutineSingletons.COROUTINE_SUSPENDED ? detectTapGestures$default : Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(obj8);
                        rememberedValue2 = obj8;
                    }
                    PointerEvent pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
                    modifier = modifier.then(new SuspendPointerInputElement(null, null, objArr, (PointerInputEventHandler) rememberedValue2, 3));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1678708124);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                return modifier;
            default:
                final AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) obj7;
                final Function1 function1 = (Function1) obj6;
                LazyListState lazyListState = (LazyListState) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$7;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                final int i3 = 1;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z) {
                        gapComposer2.startReplaceGroup(-713162810);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == obj4) {
                            rememberedValue3 = Updater.derivedStateOf(new CardStylePickerViewKt$$ExternalSyntheticLambda9(lazyListState, this.f$3, 1));
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        State state2 = (State) rememberedValue3;
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == obj4) {
                            rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda14(6, parcelableSnapshotMutableIntState);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue4);
                        String str = ((Boolean) state2.getValue()).booleanValue() ? afterpayAppletHomeContentViewModel.homeScreenTitleText : null;
                        NavigationType navigationType = NavigationType.BACK;
                        boolean changed4 = gapComposer2.changed(function1);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed4 || rememberedValue5 == obj4) {
                            rememberedValue5 = new ReceiptUiKt$$ExternalSyntheticLambda3(13, function1);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        DBUtil.TitleBarSub(str, navigationType, onGloballyPositioned, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, Expect_jvmKt.rememberComposableLambda(2029216912, new Function3() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                GapComposer gapComposer3;
                                int i4 = i2;
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                final Function1 function12 = function1;
                                AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel2 = afterpayAppletHomeContentViewModel;
                                final int i5 = 0;
                                boolean z3 = true;
                                switch (i4) {
                                    case 0:
                                        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj9;
                                        Composer composer2 = (Composer) obj10;
                                        int intValue2 = ((Integer) obj11).intValue();
                                        titleBarActionScope.getClass();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                        }
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            final TappableIcon tappableIcon = afterpayAppletHomeContentViewModel2.headerInfoIcon;
                                            if (tappableIcon == null) {
                                                gapComposer4.startReplaceGroup(736391915);
                                                gapComposer4.end(false);
                                            } else {
                                                gapComposer4.startReplaceGroup(736391916);
                                                zzd zzdVar = Icons.Companion;
                                                String str2 = tappableIcon.arcadeIconId;
                                                zzdVar.getClass();
                                                Icons icons = zzd.get(str2);
                                                if (icons == null) {
                                                    gapComposer4.startReplaceGroup(2058863312);
                                                    gapComposer4.end(false);
                                                    gapComposer3 = gapComposer4;
                                                } else {
                                                    gapComposer4.startReplaceGroup(2058863313);
                                                    String str3 = tappableIcon.accessibilityText;
                                                    String str4 = str3 != null ? str3 : "";
                                                    boolean changedInstance = gapComposer4.changedInstance(tappableIcon) | gapComposer4.changed(function12);
                                                    Object rememberedValue6 = gapComposer4.rememberedValue();
                                                    Object obj12 = rememberedValue6;
                                                    if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                                                        final boolean z4 = z3 ? 1 : 0;
                                                        Function0 function0 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda23
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i6 = z4;
                                                                Function1 function13 = function12;
                                                                TappableIcon tappableIcon2 = tappableIcon;
                                                                switch (i6) {
                                                                    case 0:
                                                                        Tap tap = tappableIcon2.tapAction;
                                                                        if (tap != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Tap tap2 = tappableIcon2.tapAction;
                                                                        if (tap2 != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap2, tap2.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        gapComposer4.updateRememberedValue(function0);
                                                        obj12 = function0;
                                                    }
                                                    TransactorKt.IconAction(titleBarActionScope, icons, str4, (Function0) obj12, null, null, null, null, null, null, false, gapComposer4, intValue2 & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                                    GapComposer gapComposer5 = gapComposer4;
                                                    gapComposer5.end(false);
                                                    gapComposer3 = gapComposer5;
                                                }
                                                gapComposer3.end(false);
                                            }
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj9;
                                        Composer composer3 = (Composer) obj10;
                                        int intValue3 = ((Integer) obj11).intValue();
                                        titleBarActionScope2.getClass();
                                        if ((intValue3 & 6) == 0) {
                                            intValue3 |= ((GapComposer) composer3).changed(titleBarActionScope2) ? 4 : 2;
                                        }
                                        GapComposer gapComposer6 = (GapComposer) composer3;
                                        if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                            final TappableIcon tappableIcon2 = afterpayAppletHomeContentViewModel2.headerInfoIcon;
                                            if (tappableIcon2 == null) {
                                                gapComposer6.startReplaceGroup(-491893630);
                                                gapComposer6.end(false);
                                            } else {
                                                gapComposer6.startReplaceGroup(-491893629);
                                                zzd zzdVar2 = Icons.Companion;
                                                String str5 = tappableIcon2.arcadeIconId;
                                                zzdVar2.getClass();
                                                Icons icons2 = zzd.get(str5);
                                                if (icons2 == null) {
                                                    gapComposer6.startReplaceGroup(-374293337);
                                                    gapComposer6.end(false);
                                                } else {
                                                    gapComposer6.startReplaceGroup(-374293336);
                                                    String str6 = tappableIcon2.accessibilityText;
                                                    String str7 = str6 == null ? "" : str6;
                                                    boolean changedInstance2 = gapComposer6.changedInstance(tappableIcon2) | gapComposer6.changed(function12);
                                                    Object rememberedValue7 = gapComposer6.rememberedValue();
                                                    Object obj13 = rememberedValue7;
                                                    if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                                                        Function0 function02 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda23
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i6 = i5;
                                                                Function1 function13 = function12;
                                                                TappableIcon tappableIcon22 = tappableIcon2;
                                                                switch (i6) {
                                                                    case 0:
                                                                        Tap tap = tappableIcon22.tapAction;
                                                                        if (tap != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Tap tap2 = tappableIcon22.tapAction;
                                                                        if (tap2 != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap2, tap2.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        gapComposer6.updateRememberedValue(function02);
                                                        obj13 = function02;
                                                    }
                                                    TransactorKt.IconAction(titleBarActionScope2, icons2, str7, (Function0) obj13, null, null, null, null, null, null, false, gapComposer6, intValue3 & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                                    gapComposer6.end(false);
                                                }
                                                gapComposer6.end(false);
                                            }
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 1573296, 40);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-711567240);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (rememberedValue6 == obj4) {
                            rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda14(7, parcelableSnapshotMutableIntState);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        Modifier onGloballyPositioned2 = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue6);
                        if (!this.f$4) {
                            r10 = afterpayAppletHomeContentViewModel.homeScreenTitleText;
                        } else if (((Boolean) this.f$6.getValue()).booleanValue()) {
                            r10 = afterpayAppletHomeContentViewModel.homeScreenTitleText;
                        }
                        String str2 = r10;
                        NavigationType navigationType2 = NavigationType.BACK;
                        boolean changed5 = gapComposer2.changed(function1);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (changed5 || rememberedValue7 == obj4) {
                            rememberedValue7 = new ReceiptUiKt$$ExternalSyntheticLambda3(15, function1);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        DBUtil.TitleBarSub(str2, navigationType2, onGloballyPositioned2, (DynamicColorConfiguration) null, (Function0) rememberedValue7, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1183763033, new Function3() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                GapComposer gapComposer3;
                                int i4 = i3;
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                final Function1 function12 = function1;
                                AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel2 = afterpayAppletHomeContentViewModel;
                                final int i5 = 0;
                                boolean z3 = true;
                                switch (i4) {
                                    case 0:
                                        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj9;
                                        Composer composer2 = (Composer) obj10;
                                        int intValue2 = ((Integer) obj11).intValue();
                                        titleBarActionScope.getClass();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                        }
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            final TappableIcon tappableIcon = afterpayAppletHomeContentViewModel2.headerInfoIcon;
                                            if (tappableIcon == null) {
                                                gapComposer4.startReplaceGroup(736391915);
                                                gapComposer4.end(false);
                                            } else {
                                                gapComposer4.startReplaceGroup(736391916);
                                                zzd zzdVar = Icons.Companion;
                                                String str22 = tappableIcon.arcadeIconId;
                                                zzdVar.getClass();
                                                Icons icons = zzd.get(str22);
                                                if (icons == null) {
                                                    gapComposer4.startReplaceGroup(2058863312);
                                                    gapComposer4.end(false);
                                                    gapComposer3 = gapComposer4;
                                                } else {
                                                    gapComposer4.startReplaceGroup(2058863313);
                                                    String str3 = tappableIcon.accessibilityText;
                                                    String str4 = str3 != null ? str3 : "";
                                                    boolean changedInstance = gapComposer4.changedInstance(tappableIcon) | gapComposer4.changed(function12);
                                                    Object rememberedValue62 = gapComposer4.rememberedValue();
                                                    Object obj12 = rememberedValue62;
                                                    if (changedInstance || rememberedValue62 == neverEqualPolicy) {
                                                        final int z4 = z3 ? 1 : 0;
                                                        Function0 function0 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda23
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i6 = z4;
                                                                Function1 function13 = function12;
                                                                TappableIcon tappableIcon22 = tappableIcon;
                                                                switch (i6) {
                                                                    case 0:
                                                                        Tap tap = tappableIcon22.tapAction;
                                                                        if (tap != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Tap tap2 = tappableIcon22.tapAction;
                                                                        if (tap2 != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap2, tap2.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        gapComposer4.updateRememberedValue(function0);
                                                        obj12 = function0;
                                                    }
                                                    TransactorKt.IconAction(titleBarActionScope, icons, str4, (Function0) obj12, null, null, null, null, null, null, false, gapComposer4, intValue2 & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                                    GapComposer gapComposer5 = gapComposer4;
                                                    gapComposer5.end(false);
                                                    gapComposer3 = gapComposer5;
                                                }
                                                gapComposer3.end(false);
                                            }
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj9;
                                        Composer composer3 = (Composer) obj10;
                                        int intValue3 = ((Integer) obj11).intValue();
                                        titleBarActionScope2.getClass();
                                        if ((intValue3 & 6) == 0) {
                                            intValue3 |= ((GapComposer) composer3).changed(titleBarActionScope2) ? 4 : 2;
                                        }
                                        GapComposer gapComposer6 = (GapComposer) composer3;
                                        if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                            final TappableIcon tappableIcon2 = afterpayAppletHomeContentViewModel2.headerInfoIcon;
                                            if (tappableIcon2 == null) {
                                                gapComposer6.startReplaceGroup(-491893630);
                                                gapComposer6.end(false);
                                            } else {
                                                gapComposer6.startReplaceGroup(-491893629);
                                                zzd zzdVar2 = Icons.Companion;
                                                String str5 = tappableIcon2.arcadeIconId;
                                                zzdVar2.getClass();
                                                Icons icons2 = zzd.get(str5);
                                                if (icons2 == null) {
                                                    gapComposer6.startReplaceGroup(-374293337);
                                                    gapComposer6.end(false);
                                                } else {
                                                    gapComposer6.startReplaceGroup(-374293336);
                                                    String str6 = tappableIcon2.accessibilityText;
                                                    String str7 = str6 == null ? "" : str6;
                                                    boolean changedInstance2 = gapComposer6.changedInstance(tappableIcon2) | gapComposer6.changed(function12);
                                                    Object rememberedValue72 = gapComposer6.rememberedValue();
                                                    Object obj13 = rememberedValue72;
                                                    if (changedInstance2 || rememberedValue72 == neverEqualPolicy) {
                                                        Function0 function02 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda23
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i6 = i5;
                                                                Function1 function13 = function12;
                                                                TappableIcon tappableIcon22 = tappableIcon2;
                                                                switch (i6) {
                                                                    case 0:
                                                                        Tap tap = tappableIcon22.tapAction;
                                                                        if (tap != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Tap tap2 = tappableIcon22.tapAction;
                                                                        if (tap2 != null) {
                                                                            function13.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap2, tap2.getAnalyticsTapEventsSpec()));
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        gapComposer6.updateRememberedValue(function02);
                                                        obj13 = function02;
                                                    }
                                                    TransactorKt.IconAction(titleBarActionScope2, icons2, str7, (Function0) obj13, null, null, null, null, null, null, false, gapComposer6, intValue3 & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                                    gapComposer6.end(false);
                                                }
                                                gapComposer6.end(false);
                                            }
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 1573296, 40);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda9(boolean z, AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel, Function1 function1, boolean z2, LazyListState lazyListState, float f, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, State state) {
        this.f$0 = z;
        this.f$1 = afterpayAppletHomeContentViewModel;
        this.f$2 = function1;
        this.f$4 = z2;
        this.f$5 = lazyListState;
        this.f$3 = f;
        this.f$7 = parcelableSnapshotMutableIntState;
        this.f$6 = state;
    }
}
