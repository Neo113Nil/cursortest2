package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.offline.recommender.data.network.GetOfflineRecommenderRequestDto;
import com.yandex.music.shared.offline.recommender.data.network.OfflineRecommenderApi;
import com.yandex.music.shared.offline.recommender.data.network.OfflineRecommenderProgramResponseDto;
import java.util.ArrayList;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class rlj {
    public final jyr a;

    public rlj(e0j e0jVar) {
        this.a = btf.b(new mze(e0jVar, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, cg6 cg6Var) {
        qlj qljVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof qlj) {
            qljVar = (qlj) cg6Var;
            int i2 = qljVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qljVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qljVar.j;
                nm6 nm6Var = nm6.a;
                i = qljVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<OfflineRecommenderProgramResponseDto>> a = ((OfflineRecommenderApi) this.a.getValue()).a(new GetOfflineRecommenderRequestDto(arrayList2, arrayList3, arrayList));
                    qljVar.l = 1;
                    obj = swf.N(a, qljVar);
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
                    int[] offlineRecommenderSource = ((OfflineRecommenderProgramResponseDto) ((aii) biiVar).a).getOfflineRecommenderSource();
                    return offlineRecommenderSource == null ? new nj6(null) : new qj6(offlineRecommenderSource);
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
        qljVar = new qlj(this, cg6Var);
        Object obj2 = qljVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qljVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
