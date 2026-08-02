package com.squareup.cash.deposits.physical.viewmodels.map;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AtmPmdExplainerViewEvent {

    public final class ButtonGroupClicked extends AtmPmdExplainerViewEvent {
        public final String url;

        public ButtonGroupClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonGroupClicked) && Intrinsics.areEqual(this.url, ((ButtonGroupClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonGroupClicked(url=", this.url, ")");
        }
    }

    public final class Exit extends AtmPmdExplainerViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 435110605;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class LinkClicked extends AtmPmdExplainerViewEvent {
        public final String url;

        public LinkClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkClicked) && Intrinsics.areEqual(this.url, ((LinkClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkClicked(url=", this.url, ")");
        }
    }
}
