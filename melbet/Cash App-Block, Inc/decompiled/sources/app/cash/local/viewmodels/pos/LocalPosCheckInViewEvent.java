package app.cash.local.viewmodels.pos;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalPosCheckInViewEvent {

    public final class NavigationClicked implements LocalPosCheckInViewEvent {
        public static final NavigationClicked INSTANCE = new NavigationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationClicked);
        }

        public final int hashCode() {
            return 651960190;
        }

        public final String toString() {
            return "NavigationClicked";
        }
    }

    public final class QrCodeDetected implements LocalPosCheckInViewEvent {
        public final String url;

        public QrCodeDetected(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QrCodeDetected) && Intrinsics.areEqual(this.url, ((QrCodeDetected) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("QrCodeDetected(url=", this.url, ")");
        }
    }
}
