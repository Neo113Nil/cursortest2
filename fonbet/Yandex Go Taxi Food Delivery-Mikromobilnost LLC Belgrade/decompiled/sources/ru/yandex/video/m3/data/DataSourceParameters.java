package ru.yandex.video.m3.data;

import android.util.Log;
import defpackage.cj01;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/data/DataSourceParameters;", "", "", "canReadFromUpstream", "canReadFromCache", "canWriteToCache", "Lcj01;", "transferListener", "<init>", "(ZZZLcj01;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getCanReadFromUpstream", "()Z", "getCanReadFromCache", "getCanWriteToCache", "Lcj01;", "getTransferListener", "()Lcj01;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataSourceParameters {
    public static final int $stable = 8;
    private final boolean canReadFromCache;
    private final boolean canReadFromUpstream;
    private final boolean canWriteToCache;
    private final cj01 transferListener;

    private DataSourceParameters(boolean z, boolean z2, boolean z3, cj01 cj01Var) {
        this.canReadFromUpstream = z;
        this.canReadFromCache = z2;
        this.canWriteToCache = z3;
        this.transferListener = cj01Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DataSourceParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DataSourceParameters dataSourceParameters = (DataSourceParameters) other;
        return this.canReadFromUpstream == dataSourceParameters.canReadFromUpstream && this.canReadFromCache == dataSourceParameters.canReadFromCache && this.canWriteToCache == dataSourceParameters.canWriteToCache && jl40.l(this.transferListener, dataSourceParameters.transferListener);
    }

    public final boolean getCanReadFromCache() {
        return this.canReadFromCache;
    }

    public final boolean getCanReadFromUpstream() {
        return this.canReadFromUpstream;
    }

    public final boolean getCanWriteToCache() {
        return this.canWriteToCache;
    }

    public final cj01 getTransferListener() {
        return this.transferListener;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.canReadFromUpstream) * 31, 31, this.canReadFromCache), 31, this.canWriteToCache);
        cj01 cj01Var = this.transferListener;
        return e + (cj01Var != null ? cj01Var.hashCode() : 0);
    }

    public String toString() {
        return "DataSourceParameters(canReadFromCache=" + this.canReadFromCache + ", canReadFromUpstream=" + this.canReadFromUpstream + ", canWriteToCache=" + this.canWriteToCache + ", transferListener=" + this.transferListener + ')';
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0006\u0010\u0016R*\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\b\u0010\u0016R*\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\t\u0010\u0016R.\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\f\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/data/DataSourceParameters$Builder;", "", "<init>", "()V", "", "enable", "setCanReadFromUpstream", "(Z)Lru/yandex/video/m3/data/DataSourceParameters$Builder;", "setCanReadFromCache", "setCanWriteToCache", "Lcj01;", "transferListener", "setTransferListener", "(Lcj01;)Lru/yandex/video/m3/data/DataSourceParameters$Builder;", "Lru/yandex/video/m3/data/DataSourceParameters;", "build", "()Lru/yandex/video/m3/data/DataSourceParameters;", "<set-?>", "canReadFromUpstream", "Z", "getCanReadFromUpstream", "()Z", "(Z)V", "canReadFromCache", "getCanReadFromCache", "canWriteToCache", "getCanWriteToCache", "Lcj01;", "getTransferListener", "()Lcj01;", "(Lcj01;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private boolean canReadFromCache;
        private boolean canReadFromUpstream = true;
        private boolean canWriteToCache;
        private cj01 transferListener;

        public final DataSourceParameters build() {
            if (!this.canReadFromCache && !this.canReadFromUpstream) {
                Log.e("DataSourceParameters", "No read source is enabled. Falling back to upstream.");
                this.canReadFromUpstream = true;
            }
            return new DataSourceParameters(this.canReadFromUpstream, this.canReadFromCache, this.canWriteToCache, this.transferListener, null);
        }

        public final boolean getCanReadFromCache() {
            return this.canReadFromCache;
        }

        public final boolean getCanReadFromUpstream() {
            return this.canReadFromUpstream;
        }

        public final boolean getCanWriteToCache() {
            return this.canWriteToCache;
        }

        public final cj01 getTransferListener() {
            return this.transferListener;
        }

        /* renamed from: setCanReadFromCache, reason: collision with other method in class */
        public final /* synthetic */ void m732setCanReadFromCache(boolean z) {
            this.canReadFromCache = z;
        }

        /* renamed from: setCanReadFromUpstream, reason: collision with other method in class */
        public final /* synthetic */ void m733setCanReadFromUpstream(boolean z) {
            this.canReadFromUpstream = z;
        }

        /* renamed from: setCanWriteToCache, reason: collision with other method in class */
        public final /* synthetic */ void m734setCanWriteToCache(boolean z) {
            this.canWriteToCache = z;
        }

        /* renamed from: setTransferListener, reason: collision with other method in class */
        public final /* synthetic */ void m735setTransferListener(cj01 cj01Var) {
            this.transferListener = cj01Var;
        }

        public final Builder setCanReadFromCache(boolean enable) {
            this.canReadFromCache = enable;
            return this;
        }

        public final Builder setCanReadFromUpstream(boolean enable) {
            this.canReadFromUpstream = enable;
            return this;
        }

        public final Builder setCanWriteToCache(boolean enable) {
            this.canWriteToCache = enable;
            return this;
        }

        public final Builder setTransferListener(cj01 transferListener) {
            this.transferListener = transferListener;
            return this;
        }
    }

    public /* synthetic */ DataSourceParameters(boolean z, boolean z2, boolean z3, cj01 cj01Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, cj01Var);
    }
}
