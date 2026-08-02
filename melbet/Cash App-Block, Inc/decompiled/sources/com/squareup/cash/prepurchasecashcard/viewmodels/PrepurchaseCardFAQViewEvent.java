package com.squareup.cash.prepurchasecashcard.viewmodels;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PrepurchaseCardFAQViewEvent {

    public final class CloseClicked implements PrepurchaseCardFAQViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 1274885360;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class PrimaryButtonClicked implements PrepurchaseCardFAQViewEvent {
        public final BlockerAction blockerAction;

        public PrimaryButtonClicked(BlockerAction blockerAction) {
            blockerAction.getClass();
            this.blockerAction = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimaryButtonClicked) && Intrinsics.areEqual(this.blockerAction, ((PrimaryButtonClicked) obj).blockerAction);
        }

        public final int hashCode() {
            return this.blockerAction.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("PrimaryButtonClicked(blockerAction=", this.blockerAction, ")");
        }
    }

    public final class UrlClicked implements PrepurchaseCardFAQViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
