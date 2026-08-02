package com.squareup.cash.investing.presenters.activity;

/* loaded from: classes6.dex */
public interface Result {

    public final class Found implements Result {
        public final String value;

        public Found(String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Found) && this.value.equals(((Found) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "Found(value=" + ((Object) this.value) + ")";
        }
    }

    public final class Loading implements Result {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -109045702;
        }

        @Override // com.squareup.cash.investing.presenters.activity.Result
        public final /* bridge */ Object nullableValue() {
            return (Void) super.nullableValue();
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NotFound implements Result {
        public static final NotFound INSTANCE = new NotFound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFound);
        }

        public final int hashCode() {
            return 621637937;
        }

        @Override // com.squareup.cash.investing.presenters.activity.Result
        public final /* bridge */ Object nullableValue() {
            return (Void) super.nullableValue();
        }

        public final String toString() {
            return "NotFound";
        }
    }

    default Object nullableValue() {
        if (this instanceof Found) {
            return ((Found) this).value;
        }
        return null;
    }
}
