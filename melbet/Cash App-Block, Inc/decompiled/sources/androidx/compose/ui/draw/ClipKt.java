package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class ClipKt {
    public static final Modifier clip(Modifier modifier, Shape shape) {
        return ColorKt.m687graphicsLayer_6ThJ44$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, shape, 518143);
    }

    public static final Modifier clipToBounds(Modifier modifier) {
        return ColorKt.m687graphicsLayer_6ThJ44$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 520191);
    }

    public static final Modifier drawBehind(Modifier modifier, Function1 function1) {
        return modifier.then(new DrawBehindElement(function1));
    }

    public static final Modifier drawWithCache(Modifier modifier, Function1 function1) {
        return modifier.then(new DrawWithCacheElement(function1));
    }

    public static final Modifier drawWithContent(Modifier modifier, Function1 function1) {
        return modifier.then(new DrawWithContentElement(function1));
    }

    public static Modifier paint$default(Modifier modifier, Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i) {
        if ((i & 4) != 0) {
            alignment = Alignment.Companion.Center;
        }
        Alignment alignment2 = alignment;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            colorFilter = null;
        }
        return modifier.then(new PainterElement(painter, alignment2, contentScale, f2, colorFilter));
    }
}
