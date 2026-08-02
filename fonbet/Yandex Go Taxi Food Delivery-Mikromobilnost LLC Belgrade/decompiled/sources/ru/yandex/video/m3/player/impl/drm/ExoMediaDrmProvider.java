package ru.yandex.video.m3.player.impl.drm;

import android.media.UnsupportedSchemeException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import defpackage.kno;
import defpackage.mno;
import defpackage.rfs;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/ExoMediaDrmProvider;", "Lkno;", "", "preferL3DRMSecurityLevel", "<init>", "(Z)V", "Ljava/util/UUID;", "uuid", "Lmno;", "acquireExoMediaDrm", "(Ljava/util/UUID;)Lmno;", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ExoMediaDrmProvider implements kno {
    private final boolean preferL3DRMSecurityLevel;

    public ExoMediaDrmProvider(boolean z) {
        this.preferL3DRMSecurityLevel = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kno
    public mno acquireExoMediaDrm(UUID uuid) {
        Result.Failure failure;
        try {
            try {
                try {
                    rfs rfsVar = new rfs(uuid);
                    failure = rfsVar;
                    if (this.preferL3DRMSecurityLevel) {
                        rfsVar.b.setPropertyString(DRMInfoProvider.MediaDRMKeys.SECURITY_LEVEL, "L3");
                        failure = rfsVar;
                    }
                } catch (UnsupportedSchemeException e) {
                    throw new UnsupportedDrmException(1, e);
                }
            } catch (Exception e2) {
                throw new UnsupportedDrmException(2, e2);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        Object obj = failure;
        if (a != null) {
            obj = new DummyExoMediaDrm(a);
        }
        return (mno) obj;
    }
}
