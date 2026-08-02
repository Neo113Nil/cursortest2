package app.cash.broadway.presenter;

/* loaded from: classes.dex */
public interface Placement {

    /* loaded from: classes3.dex */
    public final class Background implements Placement {
        public static final Background INSTANCE = new Background();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Background);
        }

        public final int hashCode() {
            return -2126646416;
        }

        public final String toString() {
            return "Background";
        }
    }

    public final class Foreground implements Placement {
        public static final Foreground INSTANCE = new Foreground();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Foreground);
        }

        public final int hashCode() {
            return 1190004613;
        }

        public final String toString() {
            return "Foreground";
        }
    }
}
