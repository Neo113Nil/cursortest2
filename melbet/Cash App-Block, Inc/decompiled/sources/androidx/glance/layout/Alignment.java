package androidx.glance.layout;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class Alignment {
    public final int horizontal;
    public final int vertical;
    public static final Alignment TopStart = new Alignment(0, 0);
    public static final Alignment Center = new Alignment(1, 1);

    public final class Horizontal {
        public final int value;

        public /* synthetic */ Horizontal(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Horizontal m1122boximpl(int i) {
            return new Horizontal(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1123toStringimpl(int i) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Horizontal(value=", i, ')');
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Horizontal) {
                return this.value == ((Horizontal) obj).value;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value);
        }

        public final String toString() {
            return m1123toStringimpl(this.value);
        }
    }

    public final class Vertical {
        public final int value;

        public /* synthetic */ Vertical(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Vertical m1124boximpl(int i) {
            return new Vertical(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1125toStringimpl(int i) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Vertical(value=", i, ')');
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Vertical) {
                return this.value == ((Vertical) obj).value;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value);
        }

        public final String toString() {
            return m1125toStringimpl(this.value);
        }
    }

    public Alignment(int i, int i2) {
        this.horizontal = i;
        this.vertical = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Alignment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Alignment alignment = (Alignment) obj;
        return this.horizontal == alignment.horizontal && this.vertical == alignment.vertical;
    }

    public final int hashCode() {
        return Integer.hashCode(this.vertical) + (Integer.hashCode(this.horizontal) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) Horizontal.m1123toStringimpl(this.horizontal)) + ", vertical=" + ((Object) Vertical.m1125toStringimpl(this.vertical)) + ')';
    }
}
