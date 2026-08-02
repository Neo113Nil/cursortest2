package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface GpsExplainerViewEvent {

    public final class CloseClicked implements GpsExplainerViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -627450082;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class UrlClicked implements GpsExplainerViewEvent {
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
