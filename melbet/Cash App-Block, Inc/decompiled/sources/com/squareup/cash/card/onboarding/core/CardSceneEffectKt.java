package com.squareup.cash.card.onboarding.core;

import android.content.Context;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda8;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreSummary$1$3$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$$ExternalSyntheticLambda20;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CardSceneEffectKt {
    public static final Quat DEFAULT_CARD_ROTATION;
    public static final float[] X_AXIS;
    public static final float[] Y_AXIS;
    public static final Quat backwardResting;
    public static final Quat forwardResting;

    static {
        float[] fArr = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        X_AXIS = fArr;
        Y_AXIS = new float[]{RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
        float[] fArr2 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f};
        Quat times = new Quat(0.055956185f, 0.084961325f, -0.083761916f, 0.9912797f).times(new Quat((float) Math.toRadians(-90.0d), fArr));
        DEFAULT_CARD_ROTATION = times;
        forwardResting = times;
        backwardResting = new Quat((float) Math.toRadians(180.0d), fArr2).times(times);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.coroutines.Continuation, kotlinx.coroutines.channels.BufferOverflow] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardSceneEffect(Modifier modifier, final MutableState mutableState, State state, State state2, State state3, boolean z, MutableState mutableState2, MutableState mutableState3, State state4, State state5, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, int i, int i2) {
        State state6;
        int i3;
        int i4;
        State state7;
        int i5;
        int i6;
        Function1 function15;
        int i7;
        GapComposer gapComposer;
        State state8;
        State state9;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        State state10;
        State state11;
        State state12;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        State rememberUpdatedState;
        Function1 function19;
        Function1 function110;
        State state13;
        Function1 function111;
        State state14;
        int i8;
        State state15;
        boolean z3;
        int i9;
        Function1 function112;
        State state16;
        State state17;
        Object obj;
        Function1 function113;
        Function1 function114;
        Object realIdvPresenter$models$1$1;
        Engine engine;
        CardWobbleState cardWobbleState;
        Object obj2;
        ?? r1;
        CardScene cardScene;
        ?? r4;
        State state18;
        State state19;
        MutableState mutableState4;
        State state20;
        State state21;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1066702633);
        int i10 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changed(mutableState) ? 32 : 16);
        if ((i2 & 4) == 0) {
            state6 = state;
            if (gapComposer2.changed(state6)) {
                i3 = 256;
                i4 = i10 | i3 | 1778688 | (!gapComposer2.changed(mutableState2) ? 8388608 : 4194304) | (!gapComposer2.changed(mutableState3) ? 67108864 : 33554432) | 268435456;
                if ((i2 & 1024) != 0) {
                    state7 = state5;
                    if (gapComposer2.changed(state7)) {
                        i5 = 4;
                        int i11 = i5 | 3504;
                        i6 = i2 & 16384;
                        if (i6 != 0) {
                            i7 = i5 | 28080;
                            function15 = function14;
                        } else {
                            function15 = function14;
                            i7 = i11 | (gapComposer2.changedInstance(function15) ? 16384 : PKIFailureInfo.certRevoked);
                        }
                        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i7 & 9363) != 9362)) {
                            gapComposer2.startDefaults();
                            int i12 = i & 1;
                            Object obj3 = Composer.Companion.Empty;
                            if (i12 == 0 || gapComposer2.getDefaultsInvalid()) {
                                if ((i2 & 4) != 0) {
                                    state6 = Updater.rememberUpdatedState(new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), gapComposer2);
                                    i4 &= -897;
                                }
                                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Float.valueOf(0.43f), gapComposer2);
                                rememberUpdatedState = Updater.rememberUpdatedState(Float.valueOf(290.0f), gapComposer2);
                                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(EmptyList.INSTANCE, gapComposer2);
                                int i13 = i4 & (-1879112705);
                                if ((i2 & 1024) != 0) {
                                    state7 = Updater.rememberUpdatedState(null, gapComposer2);
                                    i7 &= -15;
                                }
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == obj3) {
                                    rememberedValue = new CalendarRowKt$$ExternalSyntheticLambda10(25);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                Function1 function115 = (Function1) rememberedValue;
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (rememberedValue2 == obj3) {
                                    function19 = function115;
                                    rememberedValue2 = new CalendarRowKt$$ExternalSyntheticLambda10(26);
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                } else {
                                    function19 = function115;
                                }
                                Function1 function116 = (Function1) rememberedValue2;
                                if (i6 != 0) {
                                    Object rememberedValue3 = gapComposer2.rememberedValue();
                                    if (rememberedValue3 == obj3) {
                                        rememberedValue3 = new CalendarRowKt$$ExternalSyntheticLambda10(27);
                                        gapComposer2.updateRememberedValue(rememberedValue3);
                                    }
                                    function110 = function116;
                                    state13 = rememberUpdatedState2;
                                    function111 = (Function1) rememberedValue3;
                                } else {
                                    function110 = function116;
                                    state13 = rememberUpdatedState2;
                                    function111 = function15;
                                }
                                state14 = state6;
                                i8 = i7;
                                state15 = rememberUpdatedState3;
                                z3 = true;
                                i9 = i13;
                                function112 = function19;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i4 &= -897;
                                }
                                int i14 = i4 & (-1879112705);
                                if ((i2 & 1024) != 0) {
                                    i7 &= -15;
                                }
                                state13 = state2;
                                rememberUpdatedState = state3;
                                function110 = function12;
                                function111 = function15;
                                state14 = state6;
                                i8 = i7;
                                state15 = state4;
                                function112 = function1;
                                i9 = i14;
                                z3 = z;
                            }
                            gapComposer2.endDefaults();
                            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                            boolean z4 = z3;
                            Object rememberedValue4 = gapComposer2.rememberedValue();
                            if (rememberedValue4 == obj3) {
                                rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                                gapComposer2.updateRememberedValue(rememberedValue4);
                            }
                            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
                            MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(function13, gapComposer2);
                            Object rememberedValue5 = gapComposer2.rememberedValue();
                            if (rememberedValue5 == obj3) {
                                state17 = rememberUpdatedState;
                                state16 = state13;
                                Engine engine2 = new Engine(coroutineScope, new CashCardKt$$ExternalSyntheticLambda0(27, rememberUpdatedState4));
                                engine2.initialize();
                                gapComposer2.updateRememberedValue(engine2);
                                obj = engine2;
                            } else {
                                state16 = state13;
                                state17 = rememberUpdatedState;
                                obj = rememberedValue5;
                            }
                            Engine engine3 = (Engine) obj;
                            Object rememberedValue6 = gapComposer2.rememberedValue();
                            if (rememberedValue6 == obj3) {
                                rememberedValue6 = new CardScene(context, engine3);
                                gapComposer2.updateRememberedValue(rememberedValue6);
                            }
                            CardScene cardScene2 = (CardScene) rememberedValue6;
                            boolean changedInstance = gapComposer2.changedInstance(cardScene2);
                            Object rememberedValue7 = gapComposer2.rememberedValue();
                            if (changedInstance || rememberedValue7 == obj3) {
                                rememberedValue7 = new RealAppConfigManager$update$2$2(function110, cardScene2, null, 2);
                                gapComposer2.updateRememberedValue(rememberedValue7);
                            }
                            Updater.LaunchedEffect(gapComposer2, cardScene2, (Function2) rememberedValue7);
                            Unit unit = Unit.INSTANCE;
                            boolean changedInstance2 = ((((29360128 & i9) ^ 12582912) > 8388608 && gapComposer2.changed(mutableState2)) || (i9 & 12582912) == 8388608) | ((((234881024 & i9) ^ 100663296) > 67108864 && gapComposer2.changed(mutableState3)) || (i9 & 100663296) == 67108864) | gapComposer2.changedInstance(cardScene2);
                            Object rememberedValue8 = gapComposer2.rememberedValue();
                            if (changedInstance2 || rememberedValue8 == obj3) {
                                rememberedValue8 = new CardStudioPresenter$models$1$1(mutableState2, mutableState3, cardScene2, (Continuation) null);
                                gapComposer2.updateRememberedValue(rememberedValue8);
                            }
                            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue8);
                            boolean changed = gapComposer2.changed(state15) | gapComposer2.changedInstance(cardScene2);
                            Object rememberedValue9 = gapComposer2.rememberedValue();
                            if (changed || rememberedValue9 == obj3) {
                                rememberedValue9 = new PlaidLinkView.AnonymousClass2(state15, cardScene2, (Continuation) null, 26);
                                gapComposer2.updateRememberedValue(rememberedValue9);
                            }
                            Updater.LaunchedEffect(gapComposer2, cardScene2, (Function2) rememberedValue9);
                            Object rememberedValue10 = gapComposer2.rememberedValue();
                            if (rememberedValue10 == obj3) {
                                rememberedValue10 = Updater.mutableStateOf$default(DEFAULT_CARD_ROTATION);
                                gapComposer2.updateRememberedValue(rememberedValue10);
                            }
                            MutableState mutableState5 = (MutableState) rememberedValue10;
                            MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(function112, gapComposer2);
                            boolean changed2 = gapComposer2.changed(rememberUpdatedState5);
                            State state22 = state15;
                            Object rememberedValue11 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue11 == obj3) {
                                function113 = function112;
                                rememberedValue11 = new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState5, rememberUpdatedState5, (Continuation) null, 1);
                                gapComposer2.updateRememberedValue(rememberedValue11);
                            } else {
                                function113 = function112;
                            }
                            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue11);
                            Object rememberedValue12 = gapComposer2.rememberedValue();
                            if (rememberedValue12 == obj3) {
                                rememberedValue12 = new CardWobbleState();
                                gapComposer2.updateRememberedValue(rememberedValue12);
                            }
                            CardWobbleState cardWobbleState2 = (CardWobbleState) rememberedValue12;
                            boolean changedInstance3 = gapComposer2.changedInstance(cardScene2) | gapComposer2.changedInstance(engine3);
                            Object rememberedValue13 = gapComposer2.rememberedValue();
                            if (changedInstance3 || rememberedValue13 == obj3) {
                                rememberedValue13 = new BorrowHomeKt$$ExternalSyntheticLambda1(16, cardScene2, engine3);
                                gapComposer2.updateRememberedValue(rememberedValue13);
                            }
                            Updater.DisposableEffect(engine3, cardScene2, (Function1) rememberedValue13, gapComposer2);
                            int i15 = i9 & 112;
                            boolean changedInstance4 = ((((i9 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer2.changed(state14)) || (i9 & MLKEMEngine.KyberPolyBytes) == 256) | (i15 == 32) | ((((i8 & 14) ^ 6) > 4 && gapComposer2.changed(state7)) || (i8 & 6) == 4) | gapComposer2.changedInstance(cardScene2);
                            Object rememberedValue14 = gapComposer2.rememberedValue();
                            if (changedInstance4 || rememberedValue14 == obj3) {
                                function114 = function110;
                                engine = engine3;
                                cardWobbleState = cardWobbleState2;
                                obj2 = obj3;
                                r1 = 0;
                                cardScene = cardScene2;
                                r4 = 0;
                                realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1(cardWobbleState, state14, mutableState, state7, mutableState5, cardScene, (Continuation) null);
                                state18 = state14;
                                state19 = state7;
                                mutableState4 = mutableState5;
                                gapComposer2.updateRememberedValue(realIdvPresenter$models$1$1);
                            } else {
                                engine = engine3;
                                mutableState4 = mutableState5;
                                function114 = function110;
                                realIdvPresenter$models$1$1 = rememberedValue14;
                                state18 = state14;
                                state19 = state7;
                                r1 = 0;
                                r4 = 0;
                                cardWobbleState = cardWobbleState2;
                                obj2 = obj3;
                                cardScene = cardScene2;
                            }
                            Updater.LaunchedEffect(gapComposer2, cardScene, (Function2) realIdvPresenter$models$1$1);
                            final float density = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).getDensity();
                            Object rememberedValue15 = gapComposer2.rememberedValue();
                            if (rememberedValue15 == obj2) {
                                rememberedValue15 = FlowKt.MutableSharedFlow$default(r4, r4, r1, 7);
                                gapComposer2.updateRememberedValue(rememberedValue15);
                            }
                            final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue15;
                            boolean changedInstance5 = gapComposer2.changedInstance(mutableSharedFlow);
                            Object rememberedValue16 = gapComposer2.rememberedValue();
                            if (changedInstance5 || rememberedValue16 == obj2) {
                                rememberedValue16 = new PlaidLinkView.AnonymousClass2(mutableSharedFlow, cardWobbleState, (Continuation) r1, 25);
                                gapComposer2.updateRememberedValue(rememberedValue16);
                            }
                            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue16);
                            State state23 = state16;
                            State state24 = state17;
                            boolean changedInstance6 = gapComposer2.changedInstance(mutableSharedFlow) | gapComposer2.changed(state23) | gapComposer2.changed(state24);
                            Object rememberedValue17 = gapComposer2.rememberedValue();
                            if (changedInstance6 || rememberedValue17 == obj2) {
                                state20 = state23;
                                state21 = state24;
                                rememberedValue17 = new VerifyCheckDepositPresenter$models$3$1((Object) mutableSharedFlow, (Object) state20, (Object) state21, mutableState4, (Continuation) null, 1);
                                gapComposer2.updateRememberedValue(rememberedValue17);
                            } else {
                                state20 = state23;
                                state21 = state24;
                            }
                            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue17);
                            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                            if (z4) {
                                gapComposer2.startReplaceGroup(-321037632);
                                boolean changedInstance7 = gapComposer2.changedInstance(coroutineScope) | gapComposer2.changedInstance(mutableSharedFlow) | gapComposer2.changed(density) | (i15 == 32 ? true : r4) | gapComposer2.changedInstance(cardScene);
                                Object rememberedValue18 = gapComposer2.rememberedValue();
                                if (changedInstance7 || rememberedValue18 == obj2) {
                                    final CardScene cardScene3 = cardScene;
                                    rememberedValue18 = new PointerInputEventHandler() { // from class: com.squareup.cash.card.onboarding.core.CardSceneEffectKt$CardSceneEffect$touchModifier$1$1
                                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                            CoroutineScope coroutineScope2 = CoroutineScope.this;
                                            MutableSharedFlow mutableSharedFlow2 = mutableSharedFlow;
                                            Object detectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, new CardSchemePresenter$$ExternalSyntheticLambda20(coroutineScope2, mutableSharedFlow2, 1), new TooltipBoxKt$$ExternalSyntheticLambda8(coroutineScope2, mutableSharedFlow2, density, mutableState, cardScene3, pointerInputScope), continuation, 5);
                                            return detectDragGestures$default == CoroutineSingletons.COROUTINE_SUSPENDED ? detectDragGestures$default : Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer2.updateRememberedValue(rememberedValue18);
                                }
                                modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, unit, (PointerInputEventHandler) rememberedValue18);
                                gapComposer2.end(r4);
                            } else {
                                gapComposer2.startReplaceGroup(-319684637);
                                gapComposer2.end(r4);
                            }
                            gapComposer = gapComposer2;
                            function18 = function111;
                            ByteStreamsKt.SwampGLEffect(modifier.then(modifier2), engine, cardScene, null, false, function18, null, gapComposer, 24640 | ((i8 << 3) & 458752), 72);
                            function17 = function114;
                            state10 = state18;
                            state9 = state22;
                            function16 = function113;
                            state11 = state19;
                            state8 = state20;
                            state12 = state21;
                            z2 = z4;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            state8 = state2;
                            state9 = state4;
                            function16 = function1;
                            function17 = function12;
                            function18 = function15;
                            state10 = state6;
                            state11 = state7;
                            state12 = state3;
                            z2 = z;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new CardSceneEffectKt$$ExternalSyntheticLambda5(modifier, mutableState, state10, state8, state12, z2, mutableState2, mutableState3, state9, state11, function16, function17, function13, function18, i, i2);
                            return;
                        }
                        return;
                    }
                } else {
                    state7 = state5;
                }
                i5 = 2;
                int i112 = i5 | 3504;
                i6 = i2 & 16384;
                if (i6 != 0) {
                }
                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i7 & 9363) != 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
        } else {
            state6 = state;
        }
        i3 = 128;
        i4 = i10 | i3 | 1778688 | (!gapComposer2.changed(mutableState2) ? 8388608 : 4194304) | (!gapComposer2.changed(mutableState3) ? 67108864 : 33554432) | 268435456;
        if ((i2 & 1024) != 0) {
        }
        i5 = 2;
        int i1122 = i5 | 3504;
        i6 = i2 & 16384;
        if (i6 != 0) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i7 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
