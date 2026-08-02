package com.squareup.cash.money.booklet;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneyTabBookletViewEvent {

    public final class Close implements MoneyTabBookletViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1408776930;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CtaClicked implements MoneyTabBookletViewEvent {
        public static final CtaClicked INSTANCE = new CtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClicked);
        }

        public final int hashCode() {
            return 952947857;
        }

        public final String toString() {
            return "CtaClicked";
        }
    }

    public final class LinkClicked implements MoneyTabBookletViewEvent {
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
