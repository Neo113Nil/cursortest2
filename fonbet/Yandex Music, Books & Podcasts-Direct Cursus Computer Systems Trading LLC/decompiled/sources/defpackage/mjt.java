package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.universal.entities.data.UniversalEntitiesApi;
import com.yandex.music.universal.entities.data.network.dto.UniversalScreenEntitiesPageDto;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class mjt {
    public final e0j a;
    public final jyr b = btf.b(new wfs(10, this));

    public mjt(e0j e0jVar) {
        this.a = e0jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0053, code lost:
    
        if (r11 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ujt ujtVar, int i, cg6 cg6Var) {
        kjt kjtVar;
        int i2;
        bii biiVar;
        if (cg6Var instanceof kjt) {
            kjtVar = (kjt) cg6Var;
            int i3 = kjtVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kjtVar.l = i3 - Integer.MIN_VALUE;
                Object obj = kjtVar.j;
                Object obj2 = nm6.a;
                i2 = kjtVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    int ordinal = ujtVar.ordinal();
                    if (ordinal == 0) {
                        kjtVar.l = 1;
                        Object b = b(str, i, kjtVar);
                        if (b != obj2) {
                            return b;
                        }
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        Call<MusicBackendResponse<UniversalScreenEntitiesPageDto>> a = ((UniversalEntitiesApi) this.b.getValue()).a(str, str2, 0, i);
                        kjtVar.l = 2;
                        obj = swf.N(a, kjtVar);
                    }
                    return obj2;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    yjt K = ywf.K((UniversalScreenEntitiesPageDto) ((aii) biiVar).a);
                    return K == null ? new nj6(null) : new qj6(K);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i4 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str3 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i4, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
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
        kjtVar = new kjt(this, cg6Var);
        Object obj3 = kjtVar.j;
        Object obj22 = nm6.a;
        i2 = kjtVar.l;
        if (i2 != 0) {
        }
        biiVar = (bii) obj3;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i, cg6 cg6Var) {
        ljt ljtVar;
        int i2;
        bii biiVar;
        if (cg6Var instanceof ljt) {
            ljtVar = (ljt) cg6Var;
            int i3 = ljtVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ljtVar.l = i3 - Integer.MIN_VALUE;
                Object obj = ljtVar.j;
                nm6 nm6Var = nm6.a;
                i2 = ljtVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<UniversalScreenEntitiesPageDto>> b = ((UniversalEntitiesApi) this.b.getValue()).b(str, 0, i);
                    ljtVar.l = 1;
                    obj = swf.N(b, ljtVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    yjt K = ywf.K((UniversalScreenEntitiesPageDto) ((aii) biiVar).a);
                    return K == null ? new nj6(null) : new qj6(K);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i4 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i4, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
        ljtVar = new ljt(this, cg6Var);
        Object obj2 = ljtVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = ljtVar.l;
        if (i2 != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
