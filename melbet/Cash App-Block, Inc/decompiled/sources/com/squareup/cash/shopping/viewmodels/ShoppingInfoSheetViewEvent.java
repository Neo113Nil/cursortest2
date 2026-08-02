package com.squareup.cash.shopping.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShoppingInfoSheetViewEvent {

    public final class Close extends ShoppingInfoSheetViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1423547489;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class OpenLink extends ShoppingInfoSheetViewEvent {
        public final String url;

        public OpenLink(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenLink) && Intrinsics.areEqual(this.url, ((OpenLink) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenLink(url=", this.url, ")");
        }
    }
}
