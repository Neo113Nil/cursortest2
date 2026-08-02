package ru.yandex.video.m3.player.impl.source.dash;

import android.net.Uri;
import defpackage.h5z0;
import defpackage.ipg;
import defpackage.kpg;
import defpackage.mpg;
import defpackage.npg;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.player.baseurls.BaseUrlChecker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/BaseUrlCheckerImpl;", "Lru/yandex/video/m3/player/baseurls/BaseUrlChecker;", "Lipg;", "dataSourceFactory", "<init>", "(Lipg;)V", "", "baseUrl", "", "check", "(Ljava/lang/String;)Z", "Lipg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BaseUrlCheckerImpl implements BaseUrlChecker {
    public static final int $stable = 8;
    private final ipg dataSourceFactory;

    public BaseUrlCheckerImpl(ipg ipgVar) {
        this.dataSourceFactory = ipgVar;
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlChecker
    public boolean check(String baseUrl) {
        Object failure;
        kpg createDataSource = this.dataSourceFactory.createDataSource();
        mpg mpgVar = new mpg();
        mpgVar.a = Uri.parse(baseUrl).buildUpon().clearQuery().path("ping").build();
        mpgVar.i = 2;
        npg a = mpgVar.a();
        h5z0.a.a("ping url is " + a.a, new Object[0]);
        try {
            failure = Boolean.valueOf(createDataSource.open(a) >= 0);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        createDataSource.close();
        return ((Boolean) failure).booleanValue();
    }
}
