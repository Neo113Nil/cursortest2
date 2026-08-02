package com.squareup.cash.family.familyhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class SponsorResourcesViewEvent {

    public final class TapBack extends SponsorResourcesViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 1188326268;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapRow extends SponsorResourcesViewEvent {
        public final String url;

        public TapRow(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapRow) && this.url.equals(((TapRow) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapRow(url=", this.url, ")");
        }
    }
}
