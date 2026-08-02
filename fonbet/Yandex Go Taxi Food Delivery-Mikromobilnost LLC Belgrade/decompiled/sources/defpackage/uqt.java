package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes8.dex */
public final class uqt extends r8 {
    public static final /* synthetic */ kgx[] x = {new MutablePropertyReference1Impl("isGoPlatformEnabled", 0, "isGoPlatformEnabled()Z", uqt.class), new MutablePropertyReference1Impl("goPlatformUrl", 0, "getGoPlatformUrl()Ljava/lang/String;", uqt.class)};
    public final qme0 c;
    public final qme0 w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uqt(dne0 dne0Var) {
        super(7, r4);
        cne0 a = dne0Var.a("com.yandex.taxi.go_platform.switcher.GoPlatformSwitcherRepository");
        this.c = new qme0(0, a, a, "is_go_platform_enabled");
        this.w = new qme0(1, a, a, "go_platform_url");
    }
}
