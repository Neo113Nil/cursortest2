package com.squareup.cash.buynowpaylater.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class InfoSheetViewEvents {

    public final class CloseSheet extends InfoSheetViewEvents {
        public static final CloseSheet INSTANCE = new CloseSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseSheet);
        }

        public final int hashCode() {
            return 1418404477;
        }

        public final String toString() {
            return "CloseSheet";
        }
    }

    public final class OpenUrl extends InfoSheetViewEvents {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }
}
