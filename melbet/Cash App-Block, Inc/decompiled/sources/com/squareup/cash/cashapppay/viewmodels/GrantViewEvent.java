package com.squareup.cash.cashapppay.viewmodels;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class GrantViewEvent {

    public final class BlockerActionEvent extends GrantViewEvent {
        public final BlockerAction blockerAction;

        public BlockerActionEvent(BlockerAction blockerAction) {
            blockerAction.getClass();
            this.blockerAction = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockerActionEvent) && Intrinsics.areEqual(this.blockerAction, ((BlockerActionEvent) obj).blockerAction);
        }

        public final int hashCode() {
            return this.blockerAction.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("BlockerActionEvent(blockerAction=", this.blockerAction, ")");
        }
    }

    public final class Dismiss extends GrantViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1818773682;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class InTransactionTopUpInfoClicked extends GrantViewEvent {
        public static final InTransactionTopUpInfoClicked INSTANCE = new InTransactionTopUpInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InTransactionTopUpInfoClicked);
        }

        public final int hashCode() {
            return 1296051562;
        }

        public final String toString() {
            return "InTransactionTopUpInfoClicked";
        }
    }

    public final class InTransactionTopUpInfoClosed extends GrantViewEvent {
        public static final InTransactionTopUpInfoClosed INSTANCE = new InTransactionTopUpInfoClosed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InTransactionTopUpInfoClosed);
        }

        public final int hashCode() {
            return -1759113271;
        }

        public final String toString() {
            return "InTransactionTopUpInfoClosed";
        }
    }

    public final class OnDisplayInterstitialComplete extends GrantViewEvent {
        public static final OnDisplayInterstitialComplete INSTANCE = new OnDisplayInterstitialComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnDisplayInterstitialComplete);
        }

        public final int hashCode() {
            return 437425968;
        }

        public final String toString() {
            return "OnDisplayInterstitialComplete";
        }
    }

    public final class UrlClicked extends GrantViewEvent {
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
