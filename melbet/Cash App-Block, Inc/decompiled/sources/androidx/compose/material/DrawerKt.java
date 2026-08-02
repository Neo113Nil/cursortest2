package androidx.compose.material;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.work.impl.WorkLauncherImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class DrawerKt {
    public static final TweenSpec AnimationSpec = new TweenSpec(256, (Easing) null, 6);

    public static final DrawerState rememberDrawerState(Composer composer) {
        DrawerValue drawerValue = DrawerValue.Closed;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new ButtonKt$$ExternalSyntheticLambda2(7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        int i = 0;
        Object[] objArr = new Object[0];
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(8, new SnackbarHostKt$$ExternalSyntheticLambda2(15), new GestureNodeKt$$ExternalSyntheticLambda0(3, function1));
        boolean changed = ((GapComposer) composer).changed(function1);
        GapComposer gapComposer2 = (GapComposer) composer;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(i, function1);
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        return (DrawerState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue2, (Composer) gapComposer2, 0);
    }
}
