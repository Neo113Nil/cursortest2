package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.protos.franklin.api.HelpItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class SetNameEvent {

    public final class FooterUrlClicked extends SetNameEvent {
        public final String url;

        public FooterUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterUrlClicked) && Intrinsics.areEqual(this.url, ((FooterUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterUrlClicked(url=", this.url, ")");
        }
    }

    public final class GoBack extends SetNameEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 156179316;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class HelpButtonClicked extends SetNameEvent {
        public static final HelpButtonClicked INSTANCE = new HelpButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpButtonClicked);
        }

        public final int hashCode() {
            return 1293670447;
        }

        public final String toString() {
            return "HelpButtonClicked";
        }
    }

    public final class HelpItemClick extends SetNameEvent {
        public final HelpItem item;

        public HelpItemClick(HelpItem helpItem) {
            helpItem.getClass();
            this.item = helpItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpItemClick) && Intrinsics.areEqual(this.item, ((HelpItemClick) obj).item);
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final String toString() {
            return "HelpItemClick(item=" + this.item + ")";
        }
    }

    public final class NameSubmitted extends SetNameEvent {
        public final CharSequence name;
        public final SignalsContext signalsContext;

        public NameSubmitted(CharSequence charSequence, SignalsContext signalsContext) {
            charSequence.getClass();
            this.name = charSequence;
            this.signalsContext = signalsContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameSubmitted)) {
                return false;
            }
            NameSubmitted nameSubmitted = (NameSubmitted) obj;
            return Intrinsics.areEqual(this.name, nameSubmitted.name) && this.signalsContext.equals(nameSubmitted.signalsContext);
        }

        public final int hashCode() {
            return this.signalsContext.touchEvents.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return "NameSubmitted(name=" + ((Object) this.name) + ", signalsContext=" + this.signalsContext + ")";
        }
    }
}
