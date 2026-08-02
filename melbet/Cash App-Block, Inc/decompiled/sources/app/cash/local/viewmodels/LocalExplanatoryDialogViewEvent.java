package app.cash.local.viewmodels;

/* loaded from: classes3.dex */
public interface LocalExplanatoryDialogViewEvent {

    public final class NegativeClicked implements LocalExplanatoryDialogViewEvent {
        public static final NegativeClicked INSTANCE = new NegativeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClicked);
        }

        public final int hashCode() {
            return 1752903527;
        }

        public final String toString() {
            return "NegativeClicked";
        }
    }

    public final class PositiveClicked implements LocalExplanatoryDialogViewEvent {
        public static final PositiveClicked INSTANCE = new PositiveClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClicked);
        }

        public final int hashCode() {
            return 1519213859;
        }

        public final String toString() {
            return "PositiveClicked";
        }
    }
}
