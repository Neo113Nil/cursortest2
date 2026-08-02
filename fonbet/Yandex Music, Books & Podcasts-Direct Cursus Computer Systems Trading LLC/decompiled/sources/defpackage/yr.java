package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.AlbumApi;
import java.io.IOException;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class yr {
    public final jyr a;

    public yr(e0j e0jVar) {
        this.a = btf.b(new w2(e0jVar, 4));
        btf.b(new w2(e0jVar, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        sr srVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof sr) {
            srVar = (sr) cg6Var;
            int i2 = srVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                srVar.l = i2 - Integer.MIN_VALUE;
                Object obj = srVar.j;
                nm6 nm6Var = nm6.a;
                i = srVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AlbumDto>> b = f().b(str);
                    srVar.l = 1;
                    obj = swf.N(b, srVar);
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
                    oq G = ild.G((AlbumDto) ((aii) biiVar).a);
                    return G == null ? new nj6(null) : new qj6(G);
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
        }
        srVar = new sr(this, cg6Var);
        Object obj2 = srVar.j;
        nm6 nm6Var2 = nm6.a;
        i = srVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        tr trVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof tr) {
            trVar = (tr) cg6Var;
            int i2 = trVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trVar.l = i2 - Integer.MIN_VALUE;
                Object obj = trVar.j;
                nm6 nm6Var = nm6.a;
                i = trVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AlbumDto>> b = f().b(str);
                    trVar.l = 1;
                    obj = swf.N(b, trVar);
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
                    mt H = ild.H((AlbumDto) ((aii) biiVar).a);
                    return H == null ? new nj6(null) : new qj6(H);
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
        }
        trVar = new tr(this, cg6Var);
        Object obj2 = trVar.j;
        nm6 nm6Var2 = nm6.a;
        i = trVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, boolean z, cg6 cg6Var) {
        vr vrVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof vr) {
            vrVar = (vr) cg6Var;
            int i2 = vrVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vrVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vrVar.j;
                nm6 nm6Var = nm6.a;
                i = vrVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AlbumDto>> d = f().d(str);
                    vrVar.l = 2;
                    obj = swf.N(d, vrVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i == 1) {
                        try {
                            qgg.h0(obj);
                            mt H = ild.H((AlbumDto) obj);
                            return H == null ? new nj6(null) : new qj6(H);
                        } catch (IllegalRequestOnNetworkModeException e) {
                            return new oj6(e.a, e.b);
                        } catch (MusicBackendHttpException e2) {
                            MusicBackendInvocationError musicBackendInvocationError = e2.b;
                            String name = musicBackendInvocationError.getName();
                            String str2 = name == null ? "" : name;
                            String message = musicBackendInvocationError.getMessage();
                            return new kj6(e2.a, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, e2.c);
                        } catch (MusicCommonHttpException e3) {
                            return new lj6(e3.a, e3.b, e3.c);
                        } catch (IOException e4) {
                            return new oj6(btf.b(new ur(0, e4)));
                        }
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    mt H2 = ild.H((AlbumDto) ((aii) biiVar).a);
                    return H2 == null ? new nj6(null) : new qj6(H2);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError2 = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name2 = musicBackendInvocationError2.getName();
                    String str3 = name2 == null ? "" : name2;
                    String message2 = musicBackendInvocationError2.getMessage();
                    return new kj6(i3, musicBackendInvocationError2.getDetails(), str3, message2 == null ? "" : message2, xhiVar.a);
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
        vrVar = new vr(this, cg6Var);
        Object obj2 = vrVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vrVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        wr wrVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof wr) {
            wrVar = (wr) cg6Var;
            int i2 = wrVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wrVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wrVar.j;
                nm6 nm6Var = nm6.a;
                i = wrVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AlbumDto>> d = f().d(str);
                    wrVar.l = 1;
                    obj = swf.N(d, wrVar);
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
                    oq G = ild.G((AlbumDto) ((aii) biiVar).a);
                    return G == null ? new nj6(null) : new qj6(G);
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
        }
        wrVar = new wr(this, cg6Var);
        Object obj2 = wrVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wrVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, cg6 cg6Var) {
        xr xrVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof xr) {
            xrVar = (xr) cg6Var;
            int i2 = xrVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xrVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xrVar.j;
                nm6 nm6Var = nm6.a;
                i = xrVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<AlbumDto>>> c = f().c(new o3f(list));
                    xrVar.l = 1;
                    obj = swf.N(c, xrVar);
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
                    return new qj6(ild.I((List) ((aii) biiVar).a));
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
        }
        xrVar = new xr(this, cg6Var);
        Object obj2 = xrVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xrVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public final AlbumApi f() {
        return (AlbumApi) this.a.getValue();
    }
}
