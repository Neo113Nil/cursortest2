package app.cash.local.viewmodels;

/* loaded from: classes3.dex */
public interface BrandFollowViewModel {

    public final class Add implements BrandFollowViewModel {
        public static final Add INSTANCE = new Add();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Add);
        }

        public final int hashCode() {
            return -1755100883;
        }

        public final String toString() {
            return "Add";
        }
    }

    public final class Adding implements BrandFollowViewModel {
        public static final Adding INSTANCE = new Adding();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Adding);
        }

        public final int hashCode() {
            return 721560469;
        }

        public final String toString() {
            return "Adding";
        }
    }

    public final class None implements BrandFollowViewModel {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1426845740;
        }

        public final String toString() {
            return "None";
        }
    }

    public final class Remove implements BrandFollowViewModel {
        public static final Remove INSTANCE = new Remove();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Remove);
        }

        public final int hashCode() {
            return 1209453688;
        }

        public final String toString() {
            return "Remove";
        }
    }

    public final class Removing implements BrandFollowViewModel {
        public static final Removing INSTANCE = new Removing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Removing);
        }

        public final int hashCode() {
            return -1651135691;
        }

        public final String toString() {
            return "Removing";
        }
    }
}
