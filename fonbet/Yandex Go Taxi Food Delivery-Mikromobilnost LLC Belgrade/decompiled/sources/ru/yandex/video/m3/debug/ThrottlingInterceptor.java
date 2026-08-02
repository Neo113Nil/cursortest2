package ru.yandex.video.m3.debug;

import defpackage.cvj0;
import defpackage.kvj0;
import defpackage.m8w;
import defpackage.p8w;
import defpackage.rvj0;
import defpackage.zci0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/debug/ThrottlingInterceptor;", "Lp8w;", "", "bytesLimit", "<init>", "(J)V", "Lm8w;", "chain", "Lkvj0;", "intercept", "(Lm8w;)Lkvj0;", "J", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThrottlingInterceptor implements p8w {
    public static final int $stable = 0;
    private final long bytesLimit;

    public ThrottlingInterceptor(long j) {
        this.bytesLimit = j;
    }

    @Override // defpackage.p8w
    public kvj0 intercept(m8w chain) {
        zci0 zci0Var = (zci0) chain;
        kvj0 b = zci0Var.b(zci0Var.e);
        rvj0 rvj0Var = b.z;
        if (rvj0Var == null) {
            return b;
        }
        cvj0 c = b.c();
        c.g = new ThrottledResponseBody(rvj0Var, this.bytesLimit);
        return c.a();
    }
}
