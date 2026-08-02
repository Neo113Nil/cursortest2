package ru.yandex.video.m3.ott.data.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ott/data/exception/ForbiddenByLicenseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ForbiddenByLicenseException extends RuntimeException {
    public static final int $stable = 0;

    public /* synthetic */ ForbiddenByLicenseException(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }

    public ForbiddenByLicenseException(Throwable th) {
        super(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ForbiddenByLicenseException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
