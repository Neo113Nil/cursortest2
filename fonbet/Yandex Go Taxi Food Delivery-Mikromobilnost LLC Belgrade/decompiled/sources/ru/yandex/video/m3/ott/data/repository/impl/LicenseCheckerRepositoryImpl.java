package ru.yandex.video.m3.ott.data.repository.impl;

import defpackage.zy11;
import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.net.LicenseCheckerApi;
import ru.yandex.video.m3.ott.data.repository.LicenseCheckerRepository;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/LicenseCheckerRepositoryImpl;", "Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;", "Lru/yandex/video/m3/ott/data/net/LicenseCheckerApi;", "licenseCheckerApi", "<init>", "(Lru/yandex/video/m3/ott/data/net/LicenseCheckerApi;)V", "", "contentId", "Ljava/util/concurrent/Future;", "Lzy11;", "checkLicense", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/net/LicenseCheckerApi;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LicenseCheckerRepositoryImpl implements LicenseCheckerRepository {
    public static final int $stable = 8;
    private final LicenseCheckerApi licenseCheckerApi;

    public LicenseCheckerRepositoryImpl(LicenseCheckerApi licenseCheckerApi) {
        this.licenseCheckerApi = licenseCheckerApi;
    }

    @Override // ru.yandex.video.m3.ott.data.repository.LicenseCheckerRepository
    public Future<zy11> checkLicense(String contentId) {
        return this.licenseCheckerApi.checkLicense(contentId);
    }
}
