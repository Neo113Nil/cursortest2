package coil3.network;

import coil3.network.internal.DefaultCacheStrategy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface CacheStrategy {
    public static final DefaultCacheStrategy DEFAULT = new DefaultCacheStrategy();

    public final class ReadResult {
        public final NetworkResponse response;

        public ReadResult(NetworkResponse networkResponse) {
            this.response = networkResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReadResult) && Intrinsics.areEqual(this.response, ((ReadResult) obj).response);
        }

        public final int hashCode() {
            NetworkResponse networkResponse = this.response;
            if (networkResponse != null) {
                return networkResponse.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReadResult(request=null, response=" + this.response + ")";
        }
    }

    public final class WriteResult {
        public static final WriteResult DISABLED = new WriteResult();
        public final NetworkResponse response;

        public WriteResult() {
            this.response = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof WriteResult) {
                return Intrinsics.areEqual(this.response, ((WriteResult) obj).response);
            }
            return false;
        }

        public final int hashCode() {
            NetworkResponse networkResponse = this.response;
            if (networkResponse != null) {
                return networkResponse.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "WriteResult(response=" + this.response + ")";
        }

        public WriteResult(NetworkResponse networkResponse) {
            this.response = networkResponse;
        }
    }
}
