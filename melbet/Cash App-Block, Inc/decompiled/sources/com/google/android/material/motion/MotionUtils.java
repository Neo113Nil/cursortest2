package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.graphics.PathParser;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.genericelements.viewmodels.DividerComponentViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import kotlin.jvm.functions.Function0;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public abstract class MotionUtils {
    public static final void BlankDividerWidget(DividerComponentViewModel.BlankDividerViewModel blankDividerViewModel, Composer composer, int i) {
        int i2;
        blankDividerViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(165795554);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(blankDividerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), blankDividerViewModel.size.value));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(blankDividerViewModel, i, 21);
        }
    }

    public static final void LineDividerWidget(DividerComponentViewModel.LineDividerViewModel lineDividerViewModel, Composer composer, int i) {
        int i2;
        lineDividerViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1107341312);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(lineDividerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = lineDividerViewModel.usePadding;
            float f = RecyclerView.DECELERATION_RATE;
            float f2 = z ? 24.0f : 0.0f;
            if (z) {
                f = 20.0f;
            }
            SpacerKt.Spacer(gapComposer, ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, f, 5), 1.0f), MooncakeTheme.getColors(gapComposer).hairline, ColorKt.RectangleShape));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(lineDividerViewModel, i, 22);
        }
    }

    public static final void animateInAndOut(View view, Function0 function0, Function0 function02) {
        view.setVisibility(0);
        view.setAlpha(RecyclerView.DECELERATION_RATE);
        ViewPropertyAnimator animate = view.animate();
        animate.setStartDelay(0L);
        animate.alpha(1.0f).withEndAction(new CardEntryActivityController$$ExternalSyntheticLambda1(18, function0, view, function02));
    }

    public static float getLegacyControlPoint(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= RecyclerView.DECELERATION_RATE && parseFloat <= 1.0f) {
            return parseFloat;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("Motion easing control point value must be between 0 and 1; instead got: ", parseFloat);
        return RecyclerView.DECELERATION_RATE;
    }

    public static boolean isLegacyEasingType(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int resolveThemeDuration(Context context, int i, int i2) {
        TypedValue resolve = MaterialAttributes.resolve(context.getTheme(), i);
        return (resolve == null || resolve.type != 16) ? i2 : resolve.data;
    }

    public static TimeInterpolator resolveThemeInterpolator(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            a$$ExternalSyntheticBUOutline0.m$3("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!isLegacyEasingType(valueOf, "cubic-bezier") && !isLegacyEasingType(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (isLegacyEasingType(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(getLegacyControlPoint(split, 0), getLegacyControlPoint(split, 1), getLegacyControlPoint(split, 2), getLegacyControlPoint(split, 3));
            }
            a$$ExternalSyntheticBUOutline0.m(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!isLegacyEasingType(valueOf, "path")) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String m1148m = Boxes$$ExternalSyntheticOutline1.m1148m(1, 5, valueOf);
        Path path = new Path();
        try {
            PathParser.nodesToPath(PathParser.createNodesFromPathData(m1148m), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Error in parsing ".concat(m1148m), (Throwable) e);
            return null;
        }
    }

    public static SpringForce resolveThemeSpringForce(Context context, int i) {
        TypedValue resolve = MaterialAttributes.resolve(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = R$styleable.MaterialSpring;
        TypedArray obtainStyledAttributes = resolve == null ? context.obtainStyledAttributes(null, iArr, 0, i) : context.obtainStyledAttributes(resolve.resourceId, iArr);
        SpringForce springForce = new SpringForce();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            springForce.setStiffness(f);
            springForce.setDampingRatio(f2);
            return springForce;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
