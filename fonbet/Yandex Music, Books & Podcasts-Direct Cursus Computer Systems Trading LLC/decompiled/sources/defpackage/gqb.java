package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.drm.DrmSessionManagerMode;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class gqb implements eqb, gra {
    public final u76 b;
    public final tl7 c;
    public final nnd d;

    public gqb(u76 u76Var, tl7 tl7Var, nnd nndVar) {
        nndVar.getClass();
        this.b = u76Var;
        this.c = tl7Var;
        this.d = nndVar;
    }

    @Override // defpackage.gra
    public final void a() {
        this.c.a();
    }

    @Override // defpackage.eqb
    public final void b(rmh rmhVar) {
        this.b.b = new x9o(rmhVar);
    }

    @Override // defpackage.eqb
    public final void c(DrmSessionManagerMode drmSessionManagerMode, byte[] bArr) {
        int i;
        drmSessionManagerMode.getClass();
        int i2 = fqb.a[drmSessionManagerMode.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 == 2) {
                i = 1;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    b6e.s();
                    return;
                }
                i = 3;
            }
        } else {
            i = 0;
        }
        tl7 tl7Var = this.c;
        vq1.A(tl7Var.m.isEmpty());
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        tl7Var.v = i;
        tl7Var.w = bArr;
    }

    @Override // defpackage.gra
    public final void q() {
        this.c.q();
    }

    @Override // defpackage.gra
    public final zqa r(cra craVar, dsc dscVar) {
        HashSet u0;
        Object t7oVar;
        UUID t;
        dscVar.getClass();
        zqa r = this.c.r(craVar, dscVar);
        nnd nndVar = this.d;
        nndVar.getClass();
        String str = dscVar.n;
        if (str != null) {
            DrmType drmType = null;
            TrackType trackType = l5i.o(str) ? TrackType.Video : l5i.k(str) ? TrackType.Audio : l5i.n(str) ? TrackType.Subtitles : null;
            if (trackType != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nndVar.c;
                if (r != null && (t = r.t()) != null) {
                    drmType = t.equals(un3.c) ? DrmType.ClearKey : t.equals(un3.e) ? DrmType.PlayReady : t.equals(un3.d) ? DrmType.Widevine : t.equals(un3.a) ? DrmType.None : DrmType.Other;
                }
                if (drmType == null) {
                    drmType = DrmType.None;
                }
                concurrentHashMap.put(trackType, drmType);
                yjj yjjVar = (yjj) nndVar.b;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        zbl zblVar = (zbl) next;
                        DrmType drmType2 = (DrmType) ((ConcurrentHashMap) nndVar.c).get(trackType);
                        if (drmType2 == null) {
                            drmType2 = DrmType.None;
                        }
                        zblVar.y(drmType2);
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
            }
        }
        return r;
    }

    @Override // defpackage.gra
    public final void s(Looper looper, ndl ndlVar) {
        looper.getClass();
        ndlVar.getClass();
        this.c.s(looper, ndlVar);
    }

    @Override // defpackage.gra
    public final int t(dsc dscVar) {
        dscVar.getClass();
        return this.c.t(dscVar);
    }
}
