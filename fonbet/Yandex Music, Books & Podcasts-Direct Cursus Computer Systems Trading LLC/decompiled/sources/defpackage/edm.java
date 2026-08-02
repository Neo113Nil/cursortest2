package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import java.util.Iterator;
import retrofit2.Call;
import ru.yandex.music.novelties.podcasts.catalog.PodcastsCatalogHttpApi;
import ru.yandex.music.novelties.podcasts.catalog.data.PodcastsCatalogDto;

/* loaded from: classes6.dex */
public final class edm {
    public final PodcastsCatalogHttpApi a;

    public edm(PodcastsCatalogHttpApi podcastsCatalogHttpApi) {
        this.a = podcastsCatalogHttpApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        cdm cdmVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof cdm) {
            cdmVar = (cdm) cg6Var;
            int i2 = cdmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cdmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cdmVar.j;
                nm6 nm6Var = nm6.a;
                i = cdmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PodcastsCatalogDto>> f = this.a.f();
                    cdmVar.l = 1;
                    obj = swf.N(f, cdmVar);
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
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    PodcastsCatalogDto podcastsCatalogDto = (PodcastsCatalogDto) ((aii) biiVar).a;
                    l94 l94Var = l94.a;
                    vcm P = bfg.P(podcastsCatalogDto);
                    vcm a = P != null ? vcm.a(P, P.d) : null;
                    return a == null ? new nj6(null) : new qj6(a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                }
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
        }
        cdmVar = new cdm(this, cg6Var);
        Object obj2 = cdmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cdmVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        ddm ddmVar;
        int i;
        bii biiVar;
        fg6 fg6Var;
        Object obj;
        if (cg6Var instanceof ddm) {
            ddmVar = (ddm) cg6Var;
            int i2 = ddmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ddmVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = ddmVar.j;
                nm6 nm6Var = nm6.a;
                i = ddmVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    Call<MusicBackendResponse<PodcastsCatalogDto>> e = this.a.e();
                    ddmVar.l = 1;
                    obj2 = swf.N(e, ddmVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                biiVar = (bii) obj2;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i3 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                    }
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
                PodcastsCatalogDto podcastsCatalogDto = (PodcastsCatalogDto) ((aii) biiVar).a;
                l94 l94Var = l94.a;
                vcm P = bfg.P(podcastsCatalogDto);
                if (P != null) {
                    Iterator it = P.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((tcm) obj).a() == g94.ContinueListen) {
                            break;
                        }
                    }
                    if (obj instanceof fg6) {
                        fg6Var = (fg6) obj;
                        return fg6Var != null ? new nj6(null) : new qj6(fg6Var);
                    }
                }
                fg6Var = null;
                if (fg6Var != null) {
                }
            }
        }
        ddmVar = new ddm(this, cg6Var);
        Object obj22 = ddmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ddmVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj22;
        if (biiVar instanceof aii) {
        }
    }
}
