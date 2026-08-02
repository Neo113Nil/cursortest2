package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.DpSize;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class SizeKt {
    public static final FillElement FillWholeMaxHeight;
    public static final FillElement FillWholeMaxSize;
    public static final FillElement FillWholeMaxWidth;
    public static final WrapContentElement WrapContentHeightCenter;
    public static final WrapContentElement WrapContentHeightTop;
    public static final WrapContentElement WrapContentSizeCenter;
    public static final WrapContentElement WrapContentSizeTopStart;
    public static final WrapContentElement WrapContentWidthCenter;
    public static final WrapContentElement WrapContentWidthStart;

    static {
        Direction direction = Direction.Horizontal;
        FillWholeMaxWidth = new FillElement(direction, 1.0f, "fillMaxWidth");
        Direction direction2 = Direction.Vertical;
        FillWholeMaxHeight = new FillElement(direction2, 1.0f, "fillMaxHeight");
        Direction direction3 = Direction.Both;
        FillWholeMaxSize = new FillElement(direction3, 1.0f, "fillMaxSize");
        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
        int i = 2;
        WrapContentWidthCenter = new WrapContentElement(direction, false, new ComposerKt$$ExternalSyntheticLambda0(horizontal, i), horizontal, "wrapContentWidth");
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
        WrapContentWidthStart = new WrapContentElement(direction, false, new ComposerKt$$ExternalSyntheticLambda0(horizontal2, i), horizontal2, "wrapContentWidth");
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        int i2 = 3;
        WrapContentHeightCenter = new WrapContentElement(direction2, false, new ComposerKt$$ExternalSyntheticLambda0(vertical, i2), vertical, "wrapContentHeight");
        BiasAlignment.Vertical vertical2 = Alignment.Companion.Top;
        WrapContentHeightTop = new WrapContentElement(direction2, false, new ComposerKt$$ExternalSyntheticLambda0(vertical2, i2), vertical2, "wrapContentHeight");
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        int i3 = 4;
        WrapContentSizeCenter = new WrapContentElement(direction3, false, new ComposerKt$$ExternalSyntheticLambda0(biasAlignment, i3), biasAlignment, "wrapContentSize");
        BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
        WrapContentSizeTopStart = new WrapContentElement(direction3, false, new ComposerKt$$ExternalSyntheticLambda0(biasAlignment2, i3), biasAlignment2, "wrapContentSize");
    }

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m275defaultMinSizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new UnspecifiedConstraintsElement(f, f2));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m276defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m275defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxHeight : new FillElement(Direction.Vertical, f, "fillMaxHeight"));
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxSize : new FillElement(Direction.Both, f, "fillMaxSize"));
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxWidth : new FillElement(Direction.Horizontal, f, "fillMaxWidth"));
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m277height3ABfNKs(Modifier modifier, float f) {
        int i = 5;
        return modifier.then(new SizeElement(RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, f, i, true));
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m278heightInVpY3zN4(Modifier modifier, float f, float f2) {
        int i = 5;
        return modifier.then(new SizeElement(RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, f2, i, true));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m279heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m278heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m280requiredHeight3ABfNKs(Modifier modifier, float f) {
        int i = 5;
        return modifier.then(new SizeElement(RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, f, i, false));
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m281requiredSize3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, f, f, f, false));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m282requiredSizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(f, f2, f, f2, false));
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m284requiredWidth3ABfNKs(Modifier modifier, float f) {
        int i = 10;
        return modifier.then(new SizeElement(f, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, i, false));
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m285size3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, f, f, f, true));
    }

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m286size6HolHcs(long j, Modifier modifier) {
        return m287sizeVpY3zN4(modifier, DpSize.m1044getWidthD9Ej5fM(j), DpSize.m1043getHeightD9Ej5fM(j));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m287sizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new SizeElement(f, f2, f, f2, true));
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m288sizeInqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new SizeElement(f, f2, f3, f4, true));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m289sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 8) != 0) {
            f4 = Float.NaN;
        }
        return m288sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m290width3ABfNKs(Modifier modifier, float f) {
        int i = 10;
        return modifier.then(new SizeElement(f, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, i, true));
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m291widthInVpY3zN4(Modifier modifier, float f, float f2) {
        int i = 10;
        return modifier.then(new SizeElement(f, RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, i, true));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m292widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m291widthInVpY3zN4(modifier, f, f2);
    }

    public static final Modifier wrapContentHeight(Modifier modifier, BiasAlignment.Vertical vertical, boolean z) {
        return modifier.then((!vertical.equals(Alignment.Companion.CenterVertically) || z) ? (!vertical.equals(Alignment.Companion.Top) || z) ? new WrapContentElement(Direction.Vertical, z, new ComposerKt$$ExternalSyntheticLambda0(vertical, 3), vertical, "wrapContentHeight") : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static Modifier wrapContentSize$default(Modifier modifier, BiasAlignment biasAlignment, int i) {
        BiasAlignment biasAlignment2 = Alignment.Companion.Center;
        BiasAlignment biasAlignment3 = (i & 1) != 0 ? biasAlignment2 : biasAlignment;
        boolean z = (i & 2) == 0;
        return modifier.then((!biasAlignment3.equals(biasAlignment2) || z) ? (!biasAlignment3.equals(Alignment.Companion.TopStart) || z) ? new WrapContentElement(Direction.Both, z, new ComposerKt$$ExternalSyntheticLambda0(biasAlignment3, 4), biasAlignment3, "wrapContentSize") : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static Modifier wrapContentWidth$default(Modifier modifier, BiasAlignment.Horizontal horizontal, int i) {
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.CenterHorizontally;
        BiasAlignment.Horizontal horizontal3 = (i & 1) != 0 ? horizontal2 : horizontal;
        int i2 = 2;
        boolean z = (i & 2) == 0;
        return modifier.then((!horizontal3.equals(horizontal2) || z) ? (!horizontal3.equals(Alignment.Companion.Start) || z) ? new WrapContentElement(Direction.Horizontal, z, new ComposerKt$$ExternalSyntheticLambda0(horizontal3, i2), horizontal3, "wrapContentWidth") : WrapContentWidthStart : WrapContentWidthCenter);
    }
}
