package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class lfb {
    public final xq5 a;
    public final l1u b;
    public final g46 c;
    public final boolean d;
    public paw e;

    public lfb(xq5 xq5Var, l1u l1uVar, g46 g46Var, h1b h1bVar, boolean z) {
        this.a = xq5Var;
        this.b = l1uVar;
        this.c = g46Var;
        this.d = z;
    }

    public final void a() {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            rgl rglVar = (rgl) it.next();
            paw pawVar = this.e;
            if (pawVar != null) {
                pawVar.F(rglVar);
            }
        }
        this.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e0, code lost:
    
        if (r15.c() != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x022f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qld b(PlaybackException playbackException, PreparingParams preparingParams, ltg ltgVar) {
        Object t7oVar;
        Object t7oVar2;
        boolean z;
        qld qldVar;
        Long l;
        int i;
        sfb sfbVar = sfb.p;
        paw pawVar = this.e;
        if (pawVar == null) {
            return new rfb("Player is not attached to error handler! Cannot recover from error");
        }
        if (this.c.b()) {
            return new rfb("Player has already been stopped at the time when error occurred");
        }
        xq5 xq5Var = this.a;
        boolean z2 = false;
        Boolean bool = null;
        if (xq5Var.b(playbackException)) {
            qldVar = xq5Var.c(playbackException);
        } else {
            l1u l1uVar = this.b;
            AtomicInteger atomicInteger = l1uVar.d;
            paw pawVar2 = l1uVar.a;
            ngl nglVar = l1uVar.c;
            nglVar.M("BasePlayerStrategy", "onPlaybackError", "received", playbackException, new Object[0]);
            if (playbackException instanceof PlaybackException.DrmThrowable.ErrorKeysExpired ? true : playbackException instanceof PlaybackException.DrmThrowable.ErrorAuthentication) {
                try {
                    r7o r7oVar = z7o.b;
                    pawVar2.G().getClass();
                    t7oVar = Boolean.TRUE;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (t7oVar instanceof t7o) {
                    t7oVar = null;
                }
                Boolean bool2 = (Boolean) t7oVar;
                if (atomicInteger.incrementAndGet() <= 1 && Intrinsics.d(bool2, Boolean.TRUE) && l1uVar.c()) {
                    try {
                        VideoData G = pawVar2.G();
                        G.getClass();
                        t7oVar2 = l1uVar.a(G);
                    } catch (Throwable th2) {
                        r7o r7oVar3 = z7o.b;
                        t7oVar2 = new t7o(th2);
                    }
                    if (t7oVar2 instanceof t7o) {
                        t7oVar2 = null;
                    }
                    nglVar.H("BasePlayerStrategy", "onPlaybackError", "re-preparing", f1d.g("contentId=", (String) t7oVar2));
                    z = false;
                } else {
                    nglVar.H("BasePlayerStrategy", "onPlaybackError", "player.stop()", new Object[0]);
                    pawVar2.stop();
                    z = true;
                }
            } else {
                if (playbackException instanceof PlaybackException.ErrorConnection.UnavailableForLegalReasons ? true : playbackException instanceof PlaybackException.ErrorConnection.Forbidden ? true : playbackException instanceof PlaybackException.ErrorConnection.Unauthorized) {
                    if (atomicInteger.incrementAndGet() <= 1) {
                    }
                    z = true;
                } else {
                    if (!(playbackException instanceof PlaybackException.DrmThrowable.ErrorDiagnosticFatal)) {
                        nglVar.H("BasePlayerStrategy", "onPlaybackError", "Do nothing", new Object[0]);
                    } else if (Intrinsics.d(((PlaybackException.DrmThrowable.ErrorDiagnosticFatal) playbackException).getError(), "EXPIRED_SIGNATURE") && atomicInteger.incrementAndGet() <= 1 && l1uVar.c()) {
                        nglVar.H("BasePlayerStrategy", "onPlaybackError", "prepare on EXPIRED_SIGNATURE fatal diagnostic error", new Object[0]);
                        z = false;
                    }
                    z = true;
                }
            }
            qldVar = z ? sfbVar : qfb.p;
        }
        if (qldVar instanceof ofb) {
            ild ildVar = ((ofb) qldVar).p;
            Timber.INSTANCE.tag("PlayerErrorHandling").d("decision = " + ildVar, new Object[0]);
            if (ildVar.equals(mfb.m)) {
                pawVar.s(-9223372036854775807L);
                pawVar.d();
            } else {
                if (!(ildVar instanceof nfb)) {
                    b6e.s();
                    return null;
                }
                VideoData G2 = pawVar.G();
                if (G2 != null) {
                    nfb nfbVar = (nfb) ildVar;
                    int i2 = kfb.a[nfbVar.m.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            b6e.s();
                            return null;
                        }
                        long position = pawVar.getPosition();
                        l = Long.valueOf(position);
                        if (position < 0) {
                            l = null;
                        }
                        if (l == null) {
                            if (preparingParams != null) {
                                l = preparingParams.getStartPosition();
                            }
                        }
                        i = kfb.b[nfbVar.n.ordinal()];
                        if (i != 1) {
                            z2 = true;
                        } else if (i != 2) {
                            if (i != 3) {
                                b6e.s();
                                return null;
                            }
                            if (this.d) {
                                if (ltgVar instanceof sgb) {
                                    if (preparingParams != null) {
                                        bool = Boolean.valueOf(preparingParams.getAutoPlay());
                                    }
                                } else if (ltgVar instanceof rgb) {
                                    bool = Boolean.valueOf(((rgb) ltgVar).r);
                                } else {
                                    if (!(ltgVar instanceof qgb)) {
                                        b6e.s();
                                        return null;
                                    }
                                    bool = Boolean.FALSE;
                                }
                                if (bool != null) {
                                    z2 = bool.booleanValue();
                                }
                            } else {
                                if (ltgVar instanceof sgb) {
                                    if (preparingParams != null) {
                                        bool = Boolean.valueOf(preparingParams.getAutoPlay());
                                    }
                                } else if (ltgVar instanceof rgb) {
                                    if (((rgb) ltgVar).q) {
                                        PlaybackStats j = pawVar.j();
                                        if (j != null) {
                                            bool = Boolean.valueOf(j.getWillPlayWhenReady());
                                        }
                                    } else if (preparingParams != null) {
                                        bool = Boolean.valueOf(preparingParams.getAutoPlay());
                                    }
                                } else {
                                    if (!(ltgVar instanceof qgb)) {
                                        b6e.s();
                                        return null;
                                    }
                                    bool = Boolean.FALSE;
                                }
                                if (bool != null) {
                                    z2 = bool.booleanValue();
                                }
                            }
                        }
                        pawVar.y(G2, a4g.e(z2, new lma(6, l, ildVar, preparingParams)));
                    }
                    l = null;
                    i = kfb.b[nfbVar.n.ordinal()];
                    if (i != 1) {
                    }
                    pawVar.y(G2, a4g.e(z2, new lma(6, l, ildVar, preparingParams)));
                }
                if (z2) {
                    return sfbVar;
                }
            }
            z2 = true;
            if (z2) {
            }
        }
        return qldVar;
    }
}
