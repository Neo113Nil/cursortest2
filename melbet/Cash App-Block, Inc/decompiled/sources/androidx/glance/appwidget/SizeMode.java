package androidx.glance.appwidget;

/* loaded from: classes3.dex */
public interface SizeMode {

    public final class Exact implements SizeMode {
        public static final Exact INSTANCE = new Exact();

        public final String toString() {
            return "SizeMode.Exact";
        }
    }

    public final class Single implements SizeMode {
        public static final Single INSTANCE = new Single();

        public final String toString() {
            return "SizeMode.Single";
        }
    }
}
