package app.cash.broadway.presenter;

/* loaded from: classes3.dex */
public final class SwipeContext {
    public final Source source;
    public final boolean usedSwipeGesture;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source Activity;
        public static final Source Local;
        public static final Source Money;
        public static final Source Moneybot;
        public static final Source Payment;
        public static final Source TreehouseActivity;

        static {
            Source source = new Source("Activity", 0);
            Activity = source;
            Source source2 = new Source("Money", 1);
            Money = source2;
            Source source3 = new Source("Moneybot", 2);
            Moneybot = source3;
            Source source4 = new Source("Payment", 3);
            Payment = source4;
            Source source5 = new Source("TreehouseActivity", 4);
            TreehouseActivity = source5;
            Source source6 = new Source("Local", 5);
            Local = source6;
            $VALUES = new Source[]{source, source2, source3, source4, source5, source6};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public SwipeContext(boolean z, Source source) {
        this.usedSwipeGesture = z;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeContext)) {
            return false;
        }
        SwipeContext swipeContext = (SwipeContext) obj;
        return this.usedSwipeGesture == swipeContext.usedSwipeGesture && this.source == swipeContext.source;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.usedSwipeGesture) * 31;
        Source source = this.source;
        return hashCode + (source == null ? 0 : source.hashCode());
    }

    public final String toString() {
        return "SwipeContext(usedSwipeGesture=" + this.usedSwipeGesture + ", source=" + this.source + ")";
    }
}
