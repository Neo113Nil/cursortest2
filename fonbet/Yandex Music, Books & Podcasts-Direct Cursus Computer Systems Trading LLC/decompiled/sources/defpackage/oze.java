package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.skeleton.blocks.itemlist.data.ItemListBlockApi;
import com.yandex.music.skeleton.blocks.itemlist.data.ItemListEntitiesDto;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class oze {
    public final jyr a;

    public oze(upq upqVar) {
        this.a = btf.b(new mze(upq.b(upqVar, null, new mke(23), 1), 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        nze nzeVar;
        int i;
        int i2;
        bii biiVar;
        if (cg6Var instanceof nze) {
            nzeVar = (nze) cg6Var;
            int i3 = nzeVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nzeVar.n = i3 - Integer.MIN_VALUE;
                Object obj = nzeVar.l;
                nm6 nm6Var = nm6.a;
                i = nzeVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ItemListEntitiesDto>> a = ((ItemListBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    nzeVar.j = z;
                    nzeVar.k = 0;
                    nzeVar.n = 1;
                    Object N = swf.N(a, nzeVar);
                    if (N != nm6Var) {
                        obj = N;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return new qj6(new uze((List) obj));
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = nzeVar.k;
                z = nzeVar.j;
                qgg.h0(obj);
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i4 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i4, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
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
                ItemListEntitiesDto itemListEntitiesDto = (ItemListEntitiesDto) ((aii) biiVar).a;
                nzeVar.j = z;
                nzeVar.k = i2;
                nzeVar.n = 2;
                obj = xv7.E(itemListEntitiesDto, nzeVar);
            }
        }
        nzeVar = new nze(this, cg6Var);
        Object obj2 = nzeVar.l;
        nm6 nm6Var2 = nm6.a;
        i = nzeVar.n;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
