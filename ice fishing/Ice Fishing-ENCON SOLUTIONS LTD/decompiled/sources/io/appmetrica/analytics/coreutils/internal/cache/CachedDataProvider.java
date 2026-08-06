package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f3823a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f3824b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f3825c;

        /* renamed from: d, reason: collision with root package name */
        private long f3826d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f3827e = null;

        public CachedData(long j2, long j3, String str) {
            this.f3823a = "[CachedData-" + str + "]";
            this.f3824b = j2;
            this.f3825c = j3;
        }

        public T getData() {
            return (T) this.f3827e;
        }

        public long getExpiryTime() {
            return this.f3825c;
        }

        public long getRefreshTime() {
            return this.f3824b;
        }

        public final boolean isEmpty() {
            return this.f3827e == null;
        }

        public void setData(T t) {
            this.f3827e = t;
            this.f3826d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j2, long j3) {
            this.f3824b = j2;
            this.f3825c = j3;
        }

        public final boolean shouldClearData() {
            if (this.f3826d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f3826d;
            return currentTimeMillis > this.f3825c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f3826d;
            return currentTimeMillis > this.f3824b || currentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f3823a + "', refreshTime=" + this.f3824b + ", expiryTime=" + this.f3825c + ", mCachedTime=" + this.f3826d + ", mCachedData=" + this.f3827e + '}';
        }
    }
}
