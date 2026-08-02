package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes6.dex */
public final class zkp implements u9l, rgl {
    public static final List j;
    public static final List k;
    public static final eq4 l;
    public static final eq4 m;
    public final ihs a;
    public final ihs b;
    public final qku c;
    public final cpt d;
    public StalledReason e;
    public long f;
    public long g;
    public int h;
    public LinkedHashMap i;

    static {
        StalledReason stalledReason = StalledReason.SET_SOURCE;
        StalledReason stalledReason2 = StalledReason.INIT;
        j = u75.h(stalledReason, stalledReason2);
        k = u75.h(stalledReason, stalledReason2, StalledReason.AD_END, StalledReason.AD_START);
        l = new eq4(0.0d, 87.5d);
        m = new eq4(95.0d, 100.0d);
    }

    public zkp(paw pawVar) {
        pawVar.getClass();
        ihs ihsVar = new ihs(new ujl());
        ihs ihsVar2 = new ihs(new ujl());
        qku qkuVar = new qku(pawVar, new ihs(new ujl()));
        this.a = ihsVar;
        this.b = ihsVar2;
        this.c = qkuVar;
        this.d = new cpt(qkuVar);
        pawVar.I(qkuVar);
        if (pawVar.e()) {
            qkuVar.a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (xkp xkpVar : xkp.values()) {
            linkedHashMap.put(xkpVar, SessionColor.GREEN);
        }
        this.i = linkedHashMap;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        LinkedHashMap q = uah.q(this.i);
        q.put(xkp.b, SessionColor.RED);
        this.i = q;
    }

    @Override // defpackage.rgl
    public final void Q(long j2) {
        X(xkp.a, new ykp(this, 3));
        X(xkp.c, new ykp(this, 4));
    }

    public final void X(xkp xkpVar, Function0 function0) {
        LinkedHashMap q = uah.q(this.i);
        q.put(xkpVar, function0.invoke());
        this.i = q;
    }

    @Override // defpackage.u9l
    public final void d0(StalledReason stalledReason) {
        stalledReason.getClass();
        this.e = stalledReason;
        if (!k.contains(stalledReason)) {
            this.h++;
            this.b.c();
        }
        if (j.contains(stalledReason)) {
            this.a.c();
        }
        X(xkp.d, new ykp(this, 2));
    }

    @Override // defpackage.rgl
    public final void g0() {
        if (CollectionsKt.I(j, this.e)) {
            long j2 = this.f;
            ihs ihsVar = this.a;
            this.f = ihsVar.a() + j2;
            ihsVar.b();
        }
        if (!CollectionsKt.I(k, this.e)) {
            long j3 = this.g;
            ihs ihsVar2 = this.b;
            long a = ihsVar2.a();
            if (j3 < a) {
                j3 = a;
            }
            this.g = j3;
            ihsVar2.b();
        }
        this.e = null;
        X(xkp.e, new ykp(this, 0));
        X(xkp.f, new ykp(this, 1));
    }

    @Override // defpackage.rgl
    public final void o(nqs nqsVar, nqs nqsVar2, nqs nqsVar3) {
        Size c;
        nqsVar.getClass();
        nqsVar2.getClass();
        nqsVar3.getClass();
        jsb jsbVar = (jsb) nqsVar3;
        isb b = jsbVar.b();
        TrackVariant c2 = jsbVar.c();
        boolean z = c2 instanceof TrackVariant.Adaptive;
        cpt cptVar = this.d;
        if (z) {
            su3 cappingProvider = ((TrackVariant.Adaptive) c2).getCappingProvider();
            cptVar.b = (cappingProvider == null || (c = cappingProvider.c()) == null) ? -1 : c.getHeight();
            cptVar.a();
        }
        cptVar.a = b != null ? b.g : -1;
        cptVar.a();
    }

    @Override // defpackage.u9l
    public final void o0(Size size) {
        int height = size.getHeight();
        cpt cptVar = this.d;
        cptVar.c = height;
        cptVar.a();
    }
}
