package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.smart.downloading.data.network.SmartDownloadingApi;
import com.yandex.music.shared.smart.downloading.data.network.SmartDownloadingTracksRequestDto;
import com.yandex.music.shared.smart.downloading.data.network.SmartDownloadingTracksResponseDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class fzq {
    public final jyr a;

    public fzq(e0j e0jVar) {
        this.a = btf.b(new mze(e0jVar, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, int i2, int i3, String str, cg6 cg6Var) {
        ezq ezqVar;
        int i4;
        bii biiVar;
        Set set;
        Set set2;
        long f;
        if (cg6Var instanceof ezq) {
            ezqVar = (ezq) cg6Var;
            int i5 = ezqVar.l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ezqVar.l = i5 - Integer.MIN_VALUE;
                Object obj = ezqVar.j;
                nm6 nm6Var = nm6.a;
                i4 = ezqVar.l;
                if (i4 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SmartDownloadingTracksResponseDto>> a = ((SmartDownloadingApi) this.a.getValue()).a(new SmartDownloadingTracksRequestDto(arrayList, arrayList2, arrayList3, new Integer(i), new Integer(i2), new Integer(i3), str));
                    ezqVar.l = 1;
                    obj = swf.N(a, ezqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
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
                    int i6 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i6, musicBackendInvocationError.getDetails(), name, message != null ? message : "", xhiVar.a);
                }
                SmartDownloadingTracksResponseDto smartDownloadingTracksResponseDto = (SmartDownloadingTracksResponseDto) ((aii) biiVar).a;
                smartDownloadingTracksResponseDto.getClass();
                List tracksToAdd = smartDownloadingTracksResponseDto.getTracksToAdd();
                if (tracksToAdd == null || (set = CollectionsKt.A0(CollectionsKt.O(tracksToAdd))) == null) {
                    set = q5b.a;
                }
                List tracksToDelete = smartDownloadingTracksResponseDto.getTracksToDelete();
                if (tracksToDelete == null || (set2 = CollectionsKt.A0(CollectionsKt.O(tracksToDelete))) == null) {
                    set2 = q5b.a;
                }
                List downloadIntervals = smartDownloadingTracksResponseDto.getDownloadIntervals();
                List P = downloadIntervals != null ? wxf.P(downloadIntervals) : c5b.a;
                Long nextRequestTimeSec = smartDownloadingTracksResponseDto.getNextRequestTimeSec();
                if (nextRequestTimeSec != null) {
                    f = nextRequestTimeSec.longValue() * 1000;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    msa msaVar = nsa.b;
                    f = currentTimeMillis + nsa.f(yd5.M(24, ssa.HOURS));
                }
                return new qj6(new ozq(set, set2, P, f, smartDownloadingTracksResponseDto.getProgramData()));
            }
        }
        ezqVar = new ezq(this, cg6Var);
        Object obj2 = ezqVar.j;
        nm6 nm6Var2 = nm6.a;
        i4 = ezqVar.l;
        if (i4 != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
