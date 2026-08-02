package androidx.glance.unit;

/* loaded from: classes3.dex */
public abstract class Dimension {

    public final class Dp extends Dimension {
    }

    public final class Expand extends Dimension {
        public static final Expand INSTANCE = new Expand();
    }

    public final class Fill extends Dimension {
        public static final Fill INSTANCE = new Fill();
    }

    public final class Wrap extends Dimension {
        public static final Wrap INSTANCE = new Wrap();
    }
}
