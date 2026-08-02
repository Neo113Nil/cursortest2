package ru.yandex.video.m3.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.k5r;
import defpackage.t6t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/data/DataSourceParameters;", "", "", "canReadFromUpstream", "canReadFromCache", "canWriteToCache", "Lt6t;", "transferListener", "<init>", "(ZZZLt6t;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getCanReadFromUpstream", "()Z", "getCanReadFromCache", "getCanWriteToCache", "Lt6t;", "getTransferListener", "()Lt6t;", "lb7", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DataSourceParameters {
    public static final int $stable = 8;
    private final boolean canReadFromCache;
    private final boolean canReadFromUpstream;
    private final boolean canWriteToCache;
    private final t6t transferListener;

    private DataSourceParameters(boolean z, boolean z2, boolean z3, t6t t6tVar) {
        this.canReadFromUpstream = z;
        this.canReadFromCache = z2;
        this.canWriteToCache = z3;
        this.transferListener = t6tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DataSourceParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DataSourceParameters dataSourceParameters = (DataSourceParameters) other;
        return this.canReadFromUpstream == dataSourceParameters.canReadFromUpstream && this.canReadFromCache == dataSourceParameters.canReadFromCache && this.canWriteToCache == dataSourceParameters.canWriteToCache && Intrinsics.d(this.transferListener, dataSourceParameters.transferListener);
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

    public final t6t getTransferListener() {
        return this.transferListener;
    }

    public int hashCode() {
        int e = k5r.e(k5r.e(Boolean.hashCode(this.canReadFromUpstream) * 31, 31, this.canReadFromCache), 31, this.canWriteToCache);
        t6t t6tVar = this.transferListener;
        return e + (t6tVar != null ? t6tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataSourceParameters(canReadFromCache=" + this.canReadFromCache + ", canReadFromUpstream=" + this.canReadFromUpstream + ", canWriteToCache=" + this.canWriteToCache + ", transferListener=" + this.transferListener + ')';
    }

    public /* synthetic */ DataSourceParameters(boolean z, boolean z2, boolean z3, t6t t6tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, t6tVar);
    }
}
