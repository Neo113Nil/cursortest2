package ru.yandex.video.m3.player;

import defpackage.ccl;
import defpackage.crb;
import defpackage.hjp;
import defpackage.j6e;
import defpackage.jsb;
import defpackage.ngl;
import defpackage.paw;
import defpackage.rp7;
import defpackage.wj7;
import defpackage.wqb;
import defpackage.z23;
import defpackage.z6u;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public abstract class a {
    public final paw a;
    public final z23 b;
    public final ngl c;
    public final AtomicInteger d = new AtomicInteger(0);
    public boolean e;

    public a(paw pawVar, z23 z23Var, ngl nglVar) {
        this.a = pawVar;
        this.b = z23Var;
        this.c = nglVar;
        nglVar.H("BasePlayerStrategy", "init", null, "getVideoSessionId=" + pawVar.D());
    }

    public abstract String a(VideoData videoData);

    public final jsb b(ccl cclVar, TrackType trackType, VideoData videoData) {
        cclVar.getClass();
        trackType.getClass();
        this.c.H("BasePlayerStrategy", "prepareTrack", null, "trackType=" + trackType);
        crb crbVar = (crb) cclVar;
        int i = wqb.a[trackType.ordinal()];
        z23 z23Var = this.b;
        if (i != 1) {
            return i != 2 ? new jsb(trackType, crbVar.f(trackType), new rp7(z23Var), false) : new jsb(trackType, crbVar.f(trackType), new rp7(z23Var), crbVar.v);
        }
        wj7 f = crbVar.f(trackType);
        z6u z6uVar = crbVar.K.i;
        z6uVar.getClass();
        j6e j6eVar = new j6e();
        j6eVar.a = z6uVar;
        j6eVar.b = new hjp(12, z23Var);
        return new jsb(trackType, f, j6eVar, false);
    }

    public abstract boolean c();
}
