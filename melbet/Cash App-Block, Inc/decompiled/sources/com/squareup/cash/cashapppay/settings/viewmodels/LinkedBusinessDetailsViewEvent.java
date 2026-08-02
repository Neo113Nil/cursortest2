package com.squareup.cash.cashapppay.settings.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public abstract class LinkedBusinessDetailsViewEvent {

    public final class Close extends LinkedBusinessDetailsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -2131649332;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class RemoveClick extends LinkedBusinessDetailsViewEvent {
        public static final RemoveClick INSTANCE = new RemoveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveClick);
        }

        public final int hashCode() {
            return 849403704;
        }

        public final String toString() {
            return "RemoveClick";
        }
    }
}
