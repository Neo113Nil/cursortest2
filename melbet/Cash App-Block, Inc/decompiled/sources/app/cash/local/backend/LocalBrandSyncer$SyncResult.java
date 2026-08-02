package app.cash.local.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalBrandSyncer$SyncResult {

    public final class Cache implements LocalBrandSyncer$SyncResult {
        public static final Cache INSTANCE = new Cache();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cache);
        }

        public final int hashCode() {
            return 1970417675;
        }

        public final String toString() {
            return "Cache";
        }
    }

    public final class Failure implements LocalBrandSyncer$SyncResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -2135968813;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class RedirectToWeb implements LocalBrandSyncer$SyncResult {
        public final String url;

        public RedirectToWeb(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RedirectToWeb) && Intrinsics.areEqual(this.url, ((RedirectToWeb) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RedirectToWeb(url=", this.url, ")");
        }
    }

    public final class Success implements LocalBrandSyncer$SyncResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 1378402892;
        }

        public final String toString() {
            return "Success";
        }
    }
}
