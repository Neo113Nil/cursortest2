package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.ui.unit.Dp;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FloatingActionButtonElevationAnimatable {
    public final Animatable animatable;
    public float defaultElevation;
    public float focusedElevation;
    public float hoveredElevation;
    public Interaction lastTargetInteraction;
    public float pressedElevation;
    public Interaction targetInteraction;

    public FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        this.animatable = new Animatable(new Dp(f), AnimatableKt.DpToVector, (Object) null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateElevation(Interaction interaction, ContinuationImpl continuationImpl) {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        int i;
        Animatable animatable = this.animatable;
        try {
            if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
                floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) continuationImpl;
                int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    floatingActionButtonElevationAnimatable$animateElevation$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = floatingActionButtonElevationAnimatable$animateElevation$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        float f = interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction$Enter ? this.hoveredElevation : interaction instanceof FocusInteraction$Focus ? this.focusedElevation : this.defaultElevation;
                        this.targetInteraction = interaction;
                        if (!Dp.m1037equalsimpl0(((Dp) animatable.targetValue$delegate.getValue()).value, f)) {
                            Interaction interaction2 = this.lastTargetInteraction;
                            floatingActionButtonElevationAnimatable$animateElevation$1.L$0 = interaction;
                            floatingActionButtonElevationAnimatable$animateElevation$1.label = 1;
                            if (ElevationKt.m565animateElevationrAjV9yQ(animatable, f, interaction2, interaction, floatingActionButtonElevationAnimatable$animateElevation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interaction = floatingActionButtonElevationAnimatable$animateElevation$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.lastTargetInteraction = interaction;
                    this = Unit.INSTANCE;
                    return this;
                }
            }
            if (i != 0) {
            }
            this.lastTargetInteraction = interaction;
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.lastTargetInteraction = interaction;
            throw th;
        }
        floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
        Object obj2 = floatingActionButtonElevationAnimatable$animateElevation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = floatingActionButtonElevationAnimatable$animateElevation$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object snapElevation(ContinuationImpl continuationImpl) {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        int i;
        try {
            if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
                floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) continuationImpl;
                int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    floatingActionButtonElevationAnimatable$snapElevation$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = floatingActionButtonElevationAnimatable$snapElevation$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Interaction interaction = this.targetInteraction;
                        float f = interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction$Enter ? this.hoveredElevation : interaction instanceof FocusInteraction$Focus ? this.focusedElevation : this.defaultElevation;
                        Animatable animatable = this.animatable;
                        if (!Dp.m1037equalsimpl0(((Dp) animatable.targetValue$delegate.getValue()).value, f)) {
                            Dp dp = new Dp(f);
                            floatingActionButtonElevationAnimatable$snapElevation$1.label = 1;
                            if (animatable.snapTo(dp, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } finally {
            this.lastTargetInteraction = this.targetInteraction;
        }
        floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
        Object obj2 = floatingActionButtonElevationAnimatable$snapElevation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = floatingActionButtonElevationAnimatable$snapElevation$1.label;
    }
}
