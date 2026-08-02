package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.clips.ClipBlockApi;
import com.yandex.music.shared.skeleton.blocks.clips.ClipEntitiesDto;
import com.yandex.music.shared.skeleton.blocks.clips.ClipEntityDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class tp4 {
    public final jyr a;

    public tp4(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        sp4 sp4Var;
        int i;
        bii biiVar;
        ap4 ap4Var;
        if (cg6Var instanceof sp4) {
            sp4Var = (sp4) cg6Var;
            int i2 = sp4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sp4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = sp4Var.j;
                nm6 nm6Var = nm6.a;
                i = sp4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ClipEntitiesDto>> a = ((ClipBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    sp4Var.l = 1;
                    obj = swf.N(a, sp4Var);
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
                ClipEntitiesDto clipEntitiesDto = (ClipEntitiesDto) ((aii) biiVar).a;
                clipEntitiesDto.getClass();
                List<ClipEntityDto> items = clipEntitiesDto.getItems();
                if (items != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ClipEntityDto clipEntityDto : items) {
                        bp4 a2 = clipEntityDto != null ? clipEntityDto.a() : null;
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    BlockAnalyticsDataDto analytics = clipEntitiesDto.getAnalytics();
                    ap4Var = new ap4(arrayList, analytics != null ? saf.n0(analytics) : null);
                } else {
                    ap4Var = null;
                }
                return ap4Var == null ? new nj6(null) : new qj6(ap4Var);
            }
        }
        sp4Var = new sp4(this, cg6Var);
        Object obj2 = sp4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = sp4Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
