package io.appmetrica.analytics.coreutils.internal.cache;

import defpackage.oyr;
import defpackage.qv10;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes9.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {
        private final String b;
        private volatile long c;
        private volatile long d;
        private long e = 0;
        private Object f = null;
        private final SystemTimeProvider a = new SystemTimeProvider();

        public CachedData(long j, long j2, String str) {
            this.b = oyr.p("[CachedData-", str, "]");
            this.c = j;
            this.d = j2;
        }

        public T getData() {
            return (T) this.f;
        }

        public long getExpiryTime() {
            return this.d;
        }

        public long getRefreshTime() {
            return this.c;
        }

        public final boolean isEmpty() {
            return this.f == null;
        }

        public void setData(T t) {
            this.f = t;
            this.e = this.a.currentTimeMillis();
        }

        public void setExpirationPolicy(long j, long j2) {
            this.c = j;
            this.d = j2;
        }

        public final boolean shouldClearData() {
            if (this.e == 0) {
                return false;
            }
            long currentTimeMillis = this.a.currentTimeMillis() - this.e;
            return currentTimeMillis > this.d || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = this.a.currentTimeMillis() - this.e;
            return currentTimeMillis > this.c || currentTimeMillis < 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CachedData{tag='");
            sb.append(this.b);
            sb.append("', refreshTime=");
            sb.append(this.c);
            sb.append(", expiryTime=");
            sb.append(this.d);
            sb.append(", mCachedTime=");
            sb.append(this.e);
            sb.append(", mCachedData=");
            return qv10.r(sb, this.f, '}');
        }
    }
}
