package defpackage;

/* loaded from: classes6.dex */
public final class uq3 {
    public final boolean a;

    public uq3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uq3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a == ((uq3) obj).a;
    }

    public final int hashCode() {
        return k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, false), 31, true);
    }

    public final String toString() {
        return ouj.r(new StringBuilder("CachedDataSourceConfig(enableDebugCacheMiss="), this.a, ", enableFallbackToUpstream=false, experimentalPreloadLiveDashConfig=null, enableCacheWriteWhileWatching=true)");
    }
}
