package com.squareup.cash.blockers.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.franklin.api.HelpItem;

/* loaded from: classes4.dex */
public abstract class BankAccountLinkingViewEvent {

    public final class Back extends BankAccountLinkingViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 3900915;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class HelpClick extends BankAccountLinkingViewEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return -2122601157;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class HelpItemClick extends BankAccountLinkingViewEvent {
        public final HelpItem item;

        public HelpItemClick(HelpItem helpItem) {
            helpItem.getClass();
            this.item = helpItem;
        }
    }

    public final class SkipClick extends BankAccountLinkingViewEvent {
        public static final SkipClick INSTANCE = new SkipClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipClick);
        }

        public final int hashCode() {
            return -1325347395;
        }

        public final String toString() {
            return "SkipClick";
        }
    }

    public final class Submit extends BankAccountLinkingViewEvent {
        public final String text;

        public Submit(String str) {
            this.text = str;
        }
    }
}
