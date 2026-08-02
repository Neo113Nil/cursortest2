package com.squareup.cash.family.applets.data;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FormattedTimestamp {

    public final class Error implements FormattedTimestamp {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1725192917;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements FormattedTimestamp {
        public final String formattedTimestamp;

        public Loaded(String str) {
            this.formattedTimestamp = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.formattedTimestamp, ((Loaded) obj).formattedTimestamp);
        }

        public final int hashCode() {
            String str = this.formattedTimestamp;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(formattedTimestamp=", this.formattedTimestamp, ")");
        }
    }

    public final class Loading implements FormattedTimestamp {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1762621343;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
