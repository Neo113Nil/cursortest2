package coil3.size;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public interface Dimension {

    public final class Pixels implements Dimension {
        public final int px;

        public final boolean equals(Object obj) {
            if (obj instanceof Pixels) {
                return this.px == ((Pixels) obj).px;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.px);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.px, "Pixels(px=", ")");
        }
    }

    public final class Undefined implements Dimension {
        public static final Undefined INSTANCE = new Undefined();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Undefined);
        }

        public final int hashCode() {
            return -2093724603;
        }

        public final String toString() {
            return "Undefined";
        }
    }
}
