package androidx.compose.foundation.text.selection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.Role;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.transfers.views.WithdrawViewKt$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionMagnifierKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SelectionMagnifierKt$$ExternalSyntheticLambda2(int i, Function0 function0, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(759876635);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.derivedStateOf(function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                State state = (State) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new Animatable(new Offset(((Offset) state.getValue()).packedValue), SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter, new Offset(SelectionMagnifierKt.OffsetDisplacementThreshold), 8);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Animatable animatable = (Animatable) rememberedValue2;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(animatable);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new SliderDraggableState$drag$2(state, animatable, (Continuation) null, 27);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                AnimationState animationState = animatable.internalState;
                boolean changed = gapComposer.changed(animationState);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new NavHostKt$$ExternalSyntheticLambda8(animationState, 1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Modifier modifier = (Modifier) function1.invoke((Function0) rememberedValue4);
                gapComposer.end(false);
                return modifier;
            default:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue5;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13);
                Role role = new Role(0);
                boolean changed2 = gapComposer2.changed(function0) | gapComposer2.changed(function1);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new WithdrawViewKt$$ExternalSyntheticLambda2(1, function0, function1);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                Trace.m1191Iconww6aTOc(Icons.ClearField24, Room.stringResource(gapComposer2, R.string.search_bar_clear_description), ImageKt.m182clickableO2vRcR0$default(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, role, (Function0) rememberedValue6, 12), 0L, gapComposer2, 6, 8);
                return Unit.INSTANCE;
        }
    }
}
