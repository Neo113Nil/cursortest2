package ru.yandex.video.m3.player.impl.source;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache$CacheException;
import defpackage.cj01;
import defpackage.h5z0;
import defpackage.kpg;
import defpackage.npg;
import defpackage.ra7;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.impl.cache.CacheMissLogger;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006!"}, d2 = {"Lru/yandex/video/m3/player/impl/source/NotCachedDataSource;", "Lkpg;", "Lra7;", "cache", "", "shouldUseLogInsteadOfTimber", "<init>", "(Lra7;Z)V", "Lcj01;", "transferListener", "Lzy11;", "addTransferListener", "(Lcj01;)V", "Lnpg;", "dataSpec", "", OpenList.STR_OPEN, "(Lnpg;)J", "", "buffer", "", "offset", "readLength", "read", "([BII)I", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "close", "()V", "Lra7;", "Z", "Exception", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotCachedDataSource implements kpg {
    public static final int $stable = 8;
    private final ra7 cache;
    private final boolean shouldUseLogInsteadOfTimber;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/impl/source/NotCachedDataSource$Exception;", "Landroidx/media3/datasource/cache/Cache$CacheException;", "Lnpg;", "dataSpec", "<init>", "(Lnpg;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Exception extends Cache$CacheException {
        public Exception(npg npgVar) {
            super(new Cache$CacheException("Not cached " + npgVar.h + ",  " + npgVar.f + Extension.FIX_SPACE + npgVar.g));
        }
    }

    public NotCachedDataSource(ra7 ra7Var, boolean z) {
        this.cache = ra7Var;
        this.shouldUseLogInsteadOfTimber = z;
    }

    @Override // defpackage.kpg
    public void addTransferListener(cj01 transferListener) {
    }

    @Override // defpackage.kpg
    public void close() {
    }

    @Override // defpackage.kpg
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public Uri getInflatedUri() {
        return null;
    }

    @Override // defpackage.kpg
    public long open(npg dataSpec) {
        npg npgVar;
        if (this.shouldUseLogInsteadOfTimber) {
            npgVar = dataSpec;
            CacheMissLogger.logCacheMiss$default(CacheMissLogger.INSTANCE, this.cache, npgVar, false, 4, null);
        } else {
            npgVar = dataSpec;
            h5z0.a.o(CacheMissLogger.logCacheMiss$default(CacheMissLogger.INSTANCE, this.cache, npgVar, false, 4, null), new Object[0]);
        }
        throw new Exception(npgVar);
    }

    @Override // defpackage.apg
    public int read(byte[] buffer, int offset, int readLength) {
        throw new UnsupportedOperationException();
    }
}
