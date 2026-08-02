package app.cash.local.primitives;

/* loaded from: classes3.dex */
public interface ItemOffer {

    public final class FreeItem implements ItemOffer {
        public final Line line;

        public FreeItem(Line line) {
            this.line = line;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FreeItem) && this.line.equals(((FreeItem) obj).line);
        }

        @Override // app.cash.local.primitives.ItemOffer
        public final Line getLine() {
            return this.line;
        }

        public final int hashCode() {
            return this.line.hashCode();
        }

        public final String toString() {
            return "FreeItem(line=" + this.line + ")";
        }
    }

    public final class Reward implements ItemOffer {
        public final Line line;

        public Reward(Line line) {
            this.line = line;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Reward) && this.line.equals(((Reward) obj).line);
        }

        @Override // app.cash.local.primitives.ItemOffer
        public final Line getLine() {
            return this.line;
        }

        public final int hashCode() {
            return this.line.hashCode();
        }

        public final String toString() {
            return "Reward(line=" + this.line + ")";
        }
    }

    Line getLine();
}
