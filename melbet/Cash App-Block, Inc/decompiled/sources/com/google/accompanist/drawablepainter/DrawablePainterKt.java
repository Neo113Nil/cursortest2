package com.google.accompanist.drawablepainter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class DrawablePainterKt {
    public static final Lazy MAIN_HANDLER$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new DataStoreKey$$ExternalSyntheticLambda0(1));

    public static final Painter rememberDrawablePainter(Drawable drawable, Composer composer) {
        Object drawablePainter;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1756822313);
        gapComposer.startReplaceGroup(289266787);
        boolean changed = gapComposer.changed(drawable);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            if (drawable == null) {
                rememberedValue = EmptyPainter.INSTANCE;
            } else {
                if (drawable instanceof ColorDrawable) {
                    drawablePainter = new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()));
                } else {
                    Drawable mutate = drawable.mutate();
                    mutate.getClass();
                    drawablePainter = new DrawablePainter(mutate);
                }
                rememberedValue = drawablePainter;
            }
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Painter painter = (Painter) rememberedValue;
        gapComposer.end(false);
        gapComposer.end(false);
        return painter;
    }
}
