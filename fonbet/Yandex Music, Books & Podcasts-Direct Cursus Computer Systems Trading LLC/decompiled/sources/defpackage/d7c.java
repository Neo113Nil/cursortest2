package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.skeleton.blocks.featured.data.FeaturedBlockApi;
import com.yandex.music.skeleton.blocks.featured.data.FeaturedEntitiesDto;
import com.yandex.music.skeleton.blocks.featured.data.FeaturedEntityDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class d7c extends xmm {
    public final q43 d;
    public final b7c e;
    public final xdr f;
    public final jyr g;

    public d7c(s63 s63Var, q43 q43Var) {
        this.d = q43Var;
        b7c b7cVar = (b7c) s63Var.a;
        this.e = b7cVar;
        this.f = ydr.a(new f7c(b7cVar.c, true));
        this.g = btf.b(new htb(5));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.e;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.f.getValue() instanceof g7c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r15.isEmpty() == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        c7c c7cVar;
        int i;
        bii biiVar;
        Object J;
        ArrayList arrayList;
        if (cg6Var instanceof c7c) {
            c7cVar = (c7c) cg6Var;
            int i2 = c7cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = c7cVar.j;
                nm6 nm6Var = nm6.a;
                i = c7cVar.l;
                xdr xdrVar = this.f;
                b7c b7cVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        f7c f7cVar = new f7c(b7cVar.c, true);
                        xdrVar.getClass();
                        xdrVar.m(null, f7cVar);
                    }
                    Call<MusicBackendResponse<FeaturedEntitiesDto>> a = ((FeaturedBlockApi) this.g.getValue()).a(b7cVar.b.a, men.G(b7cVar.a), z ? "no-cache" : null);
                    c7cVar.l = 1;
                    obj = swf.N(a, c7cVar);
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
                    FeaturedEntitiesDto featuredEntitiesDto = (FeaturedEntitiesDto) ((aii) biiVar).a;
                    featuredEntitiesDto.getClass();
                    List<FeaturedEntityDto> promotions = featuredEntitiesDto.getPromotions();
                    if (promotions != null) {
                        arrayList = new ArrayList();
                        for (FeaturedEntityDto featuredEntityDto : promotions) {
                            y6c a2 = featuredEntityDto != null ? featuredEntityDto.a() : null;
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                    }
                    arrayList = null;
                    J = arrayList == null ? new nj6(null) : new qj6(arrayList);
                } else if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    J = new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                } else if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                } else {
                    if (!(biiVar instanceof zhi)) {
                        b6e.s();
                        return null;
                    }
                    J = uwf.J((zhi) biiVar);
                }
                if (!(J instanceof qj6)) {
                    List list = (List) ((qj6) J).a;
                    g7c g7cVar = new g7c(list, b7cVar.c);
                    xdrVar.getClass();
                    xdrVar.m(null, g7cVar);
                    int size = list.size();
                    q43 q43Var = this.d;
                    q43Var.b(q43Var.a, size, null, null);
                    return new d73(b7cVar);
                }
                if (!(J instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                if (!n()) {
                    f7c f7cVar2 = new f7c(b7cVar.c, false);
                    xdrVar.getClass();
                    xdrVar.m(null, f7cVar2);
                }
                ((pj6) J).a();
                return new c73(b7cVar);
            }
        }
        c7cVar = new c7c(this, cg6Var);
        Object obj2 = c7cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = c7cVar.l;
        xdr xdrVar2 = this.f;
        b7c b7cVar2 = this.e;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
        if (!(J instanceof qj6)) {
        }
    }
}
