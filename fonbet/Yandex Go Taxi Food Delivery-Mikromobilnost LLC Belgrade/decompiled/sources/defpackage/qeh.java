package defpackage;

import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;

/* loaded from: classes7.dex */
public final /* synthetic */ class qeh implements rmm {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExoDrmSessionManager b;

    public /* synthetic */ qeh(ExoDrmSessionManager exoDrmSessionManager, int i) {
        this.a = i;
        this.b = exoDrmSessionManager;
    }

    @Override // defpackage.rmm
    public final qmm a(fe10 fe10Var) {
        qmm createInternal$lambda$2$lambda$1;
        qmm createInternal$lambda$4$lambda$3;
        qmm createInternal$lambda$6$lambda$5;
        qmm createDashMediaSourceFactory$lambda$11$lambda$10;
        int i = this.a;
        ExoDrmSessionManager exoDrmSessionManager = this.b;
        switch (i) {
            case 0:
                createInternal$lambda$2$lambda$1 = DefaultMediaSourceFactory.createInternal$lambda$2$lambda$1(exoDrmSessionManager, fe10Var);
                return createInternal$lambda$2$lambda$1;
            case 1:
                createInternal$lambda$4$lambda$3 = DefaultMediaSourceFactory.createInternal$lambda$4$lambda$3(exoDrmSessionManager, fe10Var);
                return createInternal$lambda$4$lambda$3;
            case 2:
                createInternal$lambda$6$lambda$5 = DefaultMediaSourceFactory.createInternal$lambda$6$lambda$5(exoDrmSessionManager, fe10Var);
                return createInternal$lambda$6$lambda$5;
            default:
                createDashMediaSourceFactory$lambda$11$lambda$10 = DefaultMediaSourceFactory.createDashMediaSourceFactory$lambda$11$lambda$10(exoDrmSessionManager, fe10Var);
                return createDashMediaSourceFactory$lambda$11$lambda$10;
        }
    }
}
