package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.instyle.InStyleBlockApi;
import com.yandex.music.shared.skeleton.blocks.instyle.InStyleEntitiesDto;
import com.yandex.music.shared.skeleton.blocks.instyle.InStyleEntityDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class ohe {
    public final jyr a;

    public ohe(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        nhe nheVar;
        int i;
        bii biiVar;
        rhe rheVar;
        if (cg6Var instanceof nhe) {
            nheVar = (nhe) cg6Var;
            int i2 = nheVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nheVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nheVar.j;
                nm6 nm6Var = nm6.a;
                i = nheVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<InStyleEntitiesDto>> a = ((InStyleBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    nheVar.l = 1;
                    obj = swf.N(a, nheVar);
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
                InStyleEntitiesDto inStyleEntitiesDto = (InStyleEntitiesDto) ((aii) biiVar).a;
                inStyleEntitiesDto.getClass();
                List<InStyleEntityDto> inStyleTabs = inStyleEntitiesDto.getInStyleTabs();
                if (inStyleTabs != null) {
                    ArrayList arrayList = new ArrayList();
                    for (InStyleEntityDto inStyleEntityDto : inStyleTabs) {
                        zge a2 = inStyleEntityDto != null ? inStyleEntityDto.a() : null;
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    BlockAnalyticsDataDto analytics = inStyleEntitiesDto.getAnalytics();
                    rheVar = new rhe(arrayList, analytics != null ? saf.n0(analytics) : null);
                } else {
                    rheVar = null;
                }
                return rheVar == null ? new nj6(null) : new qj6(rheVar);
            }
        }
        nheVar = new nhe(this, cg6Var);
        Object obj2 = nheVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nheVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
