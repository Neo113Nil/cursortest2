package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class h0h {
    public final fnb a;
    public final wjb b;
    public final jyr c;

    public h0h(fnb fnbVar, wjb wjbVar) {
        fnbVar.getClass();
        wjbVar.getClass();
        this.a = fnbVar;
        this.b = wjbVar;
        this.c = btf.b(new opg(14));
    }

    public final void a(n7n n7nVar, int i) {
        n7nVar.getClass();
        nmb nmbVar = (nmb) this.c.getValue();
        wjb wjbVar = wjb.LumenAwakeningScreen;
        String G = this.a.G();
        pkb pkbVar = pkb.Wave;
        String X = CollectionsKt.X(n7nVar.c, StringUtils.COMMA, null, null, null, 62);
        qkb qkbVar = qkb.Carousel;
        nmbVar.n(this.b, wjbVar, G, this.b, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, pkbVar, X, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : i, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : null, (r60 & 16384) != 0 ? 0 : 0, (32768 & r60) != 0 ? false : false, "q2v_wave", "q2v_wave", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 0, (2097152 & r60) != 0 ? "" : null, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, "", "", "", (r60 & 268435456) != 0 ? "" : null);
    }
}
