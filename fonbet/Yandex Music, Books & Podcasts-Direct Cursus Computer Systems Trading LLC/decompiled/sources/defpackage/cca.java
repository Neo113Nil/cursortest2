package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class cca {
    public static final String k = "Downloading:".concat("DownloadTracksTask");
    public final wka a;
    public final hvs b;
    public final cur c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final x0q j = y0q.b(0, 1, null, 5);

    public cca(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, wka wkaVar, hvs hvsVar, cur curVar, jyr jyrVar5, jyr jyrVar6) {
        this.a = wkaVar;
        this.b = hvsVar;
        this.c = curVar;
        this.d = jyrVar;
        this.e = jyrVar2;
        this.f = jyrVar3;
        this.g = jyrVar5;
        this.h = jyrVar4;
        this.i = jyrVar6;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(5:11|12|13|14|15)(2:17|18))(2:19|20))(3:38|39|(2:41|31))|21|(2:34|(5:36|(1:25)(1:33)|26|27|(1:29)(1:32))(1:37))|23|(0)(0)|26|27|(0)(0)))|52|6|7|(0)(0)|21|(0)|23|(0)(0)|26|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r0 == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        r2.getClass();
        defpackage.ssg.a(6, "SharedPlayerErrorHandler", "download error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if ((r0 instanceof com.yandex.music.shared.player.api.download.j) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        ((defpackage.taa) ((defpackage.raa) r18.d.getValue())).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        defpackage.ssg.a(3, defpackage.cca.k, "download cancelled " + r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
    
        com.yandex.music.shared.utils.assertions.Assertions.throwOrSkip$default(new com.yandex.music.shared.utils.assertions.FailedAssertionException("Unexpected exception from Downloader", r0), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[Catch: all -> 0x0037, CancellationException -> 0x003a, TrackFetchException -> 0x003d, TryCatch #2 {TrackFetchException -> 0x003d, CancellationException -> 0x003a, all -> 0x0037, blocks: (B:12:0x0032, B:20:0x004b, B:21:0x006f, B:25:0x008a, B:27:0x00a0, B:32:0x00bb, B:33:0x009d, B:34:0x007e, B:37:0x0084, B:39:0x0052), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[Catch: all -> 0x0037, CancellationException -> 0x003a, TrackFetchException -> 0x003d, TRY_LEAVE, TryCatch #2 {TrackFetchException -> 0x003d, CancellationException -> 0x003a, all -> 0x0037, blocks: (B:12:0x0032, B:20:0x004b, B:21:0x006f, B:25:0x008a, B:27:0x00a0, B:32:0x00bb, B:33:0x009d, B:34:0x007e, B:37:0x0084, B:39:0x0052), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[Catch: all -> 0x0037, CancellationException -> 0x003a, TrackFetchException -> 0x003d, TryCatch #2 {TrackFetchException -> 0x003d, CancellationException -> 0x003a, all -> 0x0037, blocks: (B:12:0x0032, B:20:0x004b, B:21:0x006f, B:25:0x008a, B:27:0x00a0, B:32:0x00bb, B:33:0x009d, B:34:0x007e, B:37:0x0084, B:39:0x0052), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e A[Catch: all -> 0x0037, CancellationException -> 0x003a, TrackFetchException -> 0x003d, TryCatch #2 {TrackFetchException -> 0x003d, CancellationException -> 0x003a, all -> 0x0037, blocks: (B:12:0x0032, B:20:0x004b, B:21:0x006f, B:25:0x008a, B:27:0x00a0, B:32:0x00bb, B:33:0x009d, B:34:0x007e, B:37:0x0084, B:39:0x0052), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zvs zvsVar, gba gbaVar, pxs pxsVar, cg6 cg6Var) {
        yba ybaVar;
        nm6 nm6Var;
        int i;
        nss nssVar;
        boolean z;
        Object V;
        zvs zvsVar2 = zvsVar;
        gba gbaVar2 = gbaVar;
        if (cg6Var instanceof yba) {
            ybaVar = (yba) cg6Var;
            int i2 = ybaVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybaVar.n = i2 - Integer.MIN_VALUE;
                Object obj = ybaVar.l;
                nm6Var = nm6.a;
                i = ybaVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    be6 q = ghh.q(false, false, wyf.O(gbaVar2.a));
                    hvs hvsVar = this.b;
                    ybaVar.j = zvsVar2;
                    ybaVar.k = gbaVar2;
                    ybaVar.n = 1;
                    obj = ((jvs) hvsVar).a(zvsVar2, q, pxsVar, ybaVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zvs zvsVar3 = ybaVar.j;
                        qgg.h0(obj);
                        boolean z2 = true;
                        return Boolean.valueOf(z2);
                    }
                    gbaVar2 = ybaVar.k;
                    zvsVar2 = ybaVar.j;
                    qgg.h0(obj);
                }
                ess essVar = (ess) obj;
                nssVar = gbaVar2.b;
                if (!nssVar.equals(pss.a)) {
                    if (nssVar instanceof nss) {
                        z = true;
                        Object qjsVar = z ? new qjs(new Long(gbaVar2.c - gbaVar2.d)) : pjs.b;
                        cur curVar = this.c;
                        nss nssVar2 = gbaVar2.b;
                        ybaVar.j = zvsVar2;
                        ybaVar.k = null;
                        ybaVar.n = 2;
                        V = x97.V(dm6.a, new v24((Continuation) null, curVar, essVar, nssVar2, qjsVar, 14), ybaVar);
                        if (V != nm6Var) {
                            V = Unit.a;
                        }
                    } else {
                        b6e.s();
                    }
                }
                z = false;
                Object qjsVar2 = z ? new qjs(new Long(gbaVar2.c - gbaVar2.d)) : pjs.b;
                cur curVar2 = this.c;
                nss nssVar22 = gbaVar2.b;
                ybaVar.j = zvsVar2;
                ybaVar.k = null;
                ybaVar.n = 2;
                V = x97.V(dm6.a, new v24((Continuation) null, curVar2, essVar, nssVar22, qjsVar2, 14), ybaVar);
                if (V != nm6Var) {
                }
            }
        }
        ybaVar = new yba(this, cg6Var);
        Object obj2 = ybaVar.l;
        nm6Var = nm6.a;
        i = ybaVar.n;
        if (i != 0) {
        }
        ess essVar2 = (ess) obj2;
        nssVar = gbaVar2.b;
        if (!nssVar.equals(pss.a)) {
        }
        z = false;
        Object qjsVar22 = z ? new qjs(new Long(gbaVar2.c - gbaVar2.d)) : pjs.b;
        cur curVar22 = this.c;
        nss nssVar222 = gbaVar2.b;
        ybaVar.j = zvsVar2;
        ybaVar.k = null;
        ybaVar.n = 2;
        V = x97.V(dm6.a, new v24((Continuation) null, curVar22, essVar2, nssVar222, qjsVar22, 14), ybaVar);
        if (V != nm6Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(gba gbaVar, cg6 cg6Var) {
        zba zbaVar;
        int i;
        mqs mqsVar;
        boolean booleanValue;
        boolean z;
        if (cg6Var instanceof zba) {
            zbaVar = (zba) cg6Var;
            int i2 = zbaVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zbaVar.n = i2 - Integer.MIN_VALUE;
                Object obj = zbaVar.l;
                Object obj2 = nm6.a;
                i = zbaVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    mqs mqsVar2 = gbaVar.a;
                    zvs zvsVar = new zvs(mqsVar2.a);
                    xdr xdrVar = saa.a;
                    nxs nxsVar = mqsVar2.B;
                    pxs pxsVar = nxsVar != null ? new pxs(nxsVar.a, nxsVar.b) : null;
                    zbaVar.j = mqsVar2;
                    zbaVar.n = 1;
                    Object a = a(zvsVar, gbaVar, pxsVar, zbaVar);
                    if (a != obj2) {
                        obj = a;
                        mqsVar = mqsVar2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = zbaVar.k;
                    qgg.h0(obj);
                    booleanValue = z;
                    return Boolean.valueOf(booleanValue);
                }
                mqsVar = zbaVar.j;
                qgg.h0(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    ((wo6) this.g.getValue()).b(mqsVar);
                    e6q e6qVar = (e6q) this.f.getValue();
                    zbaVar.j = null;
                    zbaVar.k = booleanValue;
                    zbaVar.n = 2;
                    if (e6qVar.a(zbaVar) != obj2) {
                        z = booleanValue;
                        booleanValue = z;
                    }
                    return obj2;
                }
                return Boolean.valueOf(booleanValue);
            }
        }
        zbaVar = new zba(this, cg6Var);
        Object obj3 = zbaVar.l;
        Object obj22 = nm6.a;
        i = zbaVar.n;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (booleanValue) {
        }
        return Boolean.valueOf(booleanValue);
    }
}
