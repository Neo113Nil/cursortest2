package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public abstract class TextOverflow {

    public final class Companion {
    }

    public static final int access$packBytes(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1016toStringimpl(int i) {
        return i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
    }
}
