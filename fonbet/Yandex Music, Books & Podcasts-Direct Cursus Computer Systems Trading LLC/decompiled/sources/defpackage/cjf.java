package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.data.api.model.SkeletonDataDto;
import com.yandex.music.shared.skeleton.data.network.LandingSkeletonApi;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.Continuation;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class cjf {
    public final String a;
    public final upq b;
    public final gnq c;
    public final cmf d;
    public final boolean e;
    public final jyr f;

    public cjf(String str, upq upqVar, gnq gnqVar, cmf cmfVar, hnq hnqVar, spq spqVar) {
        str.getClass();
        upqVar.getClass();
        gnqVar.getClass();
        hnqVar.getClass();
        this.a = str;
        this.b = upqVar;
        this.c = gnqVar;
        this.d = cmfVar;
        int ordinal = hnqVar.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            z = false;
        }
        this.e = z;
        this.f = btf.b(new zya(27, this, spqVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(cjf cjfVar, boolean z, cg6 cg6Var) {
        ypq ypqVar;
        int i;
        if (cg6Var instanceof ypq) {
            ypqVar = (ypq) cg6Var;
            int i2 = ypqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ypqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ypqVar.j;
                Object obj2 = nm6.a;
                i = ypqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ypqVar.l = 1;
                    obj = cjfVar.b(z, ypqVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return u7g.Y((rj6) obj);
            }
        }
        ypqVar = new ypq(cjfVar, cg6Var);
        Object obj3 = ypqVar.j;
        Object obj22 = nm6.a;
        i = ypqVar.l;
        if (i != 0) {
        }
        return u7g.Y((rj6) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        ajf ajfVar;
        int i;
        cqq cqqVar;
        if (cg6Var instanceof ajf) {
            ajfVar = (ajf) cg6Var;
            int i2 = ajfVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ajfVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ajfVar.j;
                nm6 nm6Var = nm6.a;
                i = ajfVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    akc akcVar = new akc(this, continuation, 21);
                    ajfVar.l = 1;
                    obj = tyf.L(2000L, akcVar, ajfVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                cqqVar = (cqq) obj;
                if (cqqVar == null) {
                    return cqqVar;
                }
                ssg.a(6, "LandingSkeletonRepository", "Timeout when trying to force request skeleton from cache! id=" + this.a, null);
                return new aqq(zpq.a, new TimeoutException());
            }
        }
        ajfVar = new ajf(this, cg6Var);
        Object obj2 = ajfVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ajfVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        cqqVar = (cqq) obj2;
        if (cqqVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0067, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, cg6 cg6Var) {
        bjf bjfVar;
        Object obj;
        int i;
        LandingSkeletonApi landingSkeletonApi;
        String str;
        if (cg6Var instanceof bjf) {
            bjfVar = (bjf) cg6Var;
            int i2 = bjfVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bjfVar.o = i2 - Integer.MIN_VALUE;
                obj = bjfVar.m;
                nm6 nm6Var = nm6.a;
                i = bjfVar.o;
                boolean z2 = false;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    landingSkeletonApi = (LandingSkeletonApi) this.f.getValue();
                    str = this.a;
                    cmf cmfVar = this.d;
                    if (cmfVar != null) {
                        bjfVar.k = landingSkeletonApi;
                        bjfVar.l = str;
                        bjfVar.j = z;
                        bjfVar.o = 1;
                        obj = x97.V(dm6.b, new amf(cmfVar, continuation, 1), bjfVar);
                    }
                    Call<MusicBackendResponse<SkeletonDataDto>> a = landingSkeletonApi.a(str, z2, z ? "no-cache" : null);
                    bjfVar.k = null;
                    bjfVar.l = null;
                    bjfVar.j = z;
                    bjfVar.o = 2;
                    obj = swf.N(a, bjfVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        bii biiVar = (bii) obj;
                        if (biiVar instanceof aii) {
                            snq t1 = gut.t1((SkeletonDataDto) ((aii) biiVar).a, this.c, this.e);
                            return t1 == null ? new nj6(null) : new qj6(t1);
                        }
                        if (!(biiVar instanceof xhi)) {
                            if (biiVar instanceof yhi) {
                                yhi yhiVar = (yhi) biiVar;
                                return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                            }
                            if (biiVar instanceof zhi) {
                                return uwf.J((zhi) biiVar);
                            }
                            b6e.s();
                            return null;
                        }
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i3 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        if (name == null) {
                            name = "";
                        }
                        String message = musicBackendInvocationError.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                    }
                    z = bjfVar.j;
                    str = bjfVar.l;
                    landingSkeletonApi = bjfVar.k;
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    z2 = true;
                }
                Call<MusicBackendResponse<SkeletonDataDto>> a2 = landingSkeletonApi.a(str, z2, z ? "no-cache" : null);
                bjfVar.k = null;
                bjfVar.l = null;
                bjfVar.j = z;
                bjfVar.o = 2;
                obj = swf.N(a2, bjfVar);
            }
        }
        bjfVar = new bjf(this, cg6Var);
        obj = bjfVar.m;
        nm6 nm6Var2 = nm6.a;
        i = bjfVar.o;
        boolean z22 = false;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        Call<MusicBackendResponse<SkeletonDataDto>> a22 = landingSkeletonApi.a(str, z22, z ? "no-cache" : null);
        bjfVar.k = null;
        bjfVar.l = null;
        bjfVar.j = z;
        bjfVar.o = 2;
        obj = swf.N(a22, bjfVar);
    }
}
