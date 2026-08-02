package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public final class yuk implements suk, zuk {
    public final cvk a;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final tvk g;
    public final long i;
    public final String b = "PlayAudio2:".concat("PlayAudioCenter");
    public final tf6 f = gld.e(e.c(a4g.n(), dm6.b));
    public final jyr h = btf.b(new d1j(13, this));

    public yuk(cvk cvkVar) {
        this.a = cvkVar;
        this.c = cvkVar.b(hag.I(tuk.class), true);
        this.d = cvkVar.b(hag.I(ivk.class), true);
        this.e = cvkVar.b(hag.I(wot.class), true);
        this.g = new tvk(cvkVar);
        msa msaVar = nsa.b;
        this.i = yd5.M(5, ssa.SECONDS);
    }

    public final void a(nsa nsaVar, tss tssVar, boolean z, String str) {
        ruk e;
        vvk vvkVar;
        dwk dwkVar;
        tvk tvkVar = this.g;
        Continuation continuation = null;
        if (nsaVar == null) {
            tvkVar.getClass();
            if (tvkVar.r == svk.a) {
                e = null;
            } else {
                ssg.a(4, tvkVar.b, "play maybe ended", null);
                e = tvkVar.e(tvkVar.i, tss.InProgress, str);
            }
        } else {
            e = tvkVar.e(nsaVar.a, tssVar, str);
        }
        if (e != null) {
            v3w.l("adding end play for ", e.a(), 4, this.b, null);
            if (((tuk) this.c.getValue()).a() && (vvkVar = (vvk) this.h.getValue()) != null) {
                ewk d = this.g.d();
                aqd aqdVar = new aqd((d == null || (dwkVar = d.d) == null) ? null : dwkVar.c.toString());
                uvk uvkVar = new uvk(e);
                loop0: while (true) {
                    uvk uvkVar2 = (uvk) vvkVar.e.get();
                    uvkVar.b = uvkVar2;
                    AtomicReference atomicReference = vvkVar.e;
                    while (!atomicReference.compareAndSet(uvkVar2, uvkVar)) {
                        if (atomicReference.get() != uvkVar2) {
                            break;
                        }
                    }
                }
                x97.y(vvkVar.d, null, null, new n71(vvkVar, aqdVar, uvkVar, continuation, 25), 3);
            }
            x97.y(this.f, null, null, new cg1(this, e, z, continuation, 13), 3);
        }
    }

    public final void b(long j, String str) {
        tvk tvkVar;
        nsa g;
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.MILLISECONDS;
        if (nsa.e(j, yd5.M(0, ssaVar)) || (g = (tvkVar = this.g).g(j, str, "")) == null || nsa.c(g.a, this.i) <= 0) {
            return;
        }
        ruk a = tvkVar.a();
        tvkVar.k = yd5.M(0, ssaVar);
        if (a != null) {
            c(a);
        }
    }

    public final void c(ruk rukVar) {
        v3w.l("saving end play for ", rukVar.a(), 4, this.b, null);
        x97.y(this.f, null, null, new h1j(this, rukVar, (Continuation) null, 24), 3);
    }
}
