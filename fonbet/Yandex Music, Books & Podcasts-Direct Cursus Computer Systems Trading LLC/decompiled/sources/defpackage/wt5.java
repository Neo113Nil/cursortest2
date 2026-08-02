package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.similar.tracks.SimilarTracksApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.similar.tracks.SimilarTracksDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import retrofit2.Call;

/* loaded from: classes5.dex */
public final class wt5 {
    public final jyr a;

    public wt5(int i) {
        switch (i) {
            case 2:
                this.a = l18.b.b(hag.I(crs.class), true);
                break;
            case 3:
                this.a = l18.b.b(hag.I(skr.class), true);
                break;
            default:
                this.a = l18.b.b(hag.I(ot5.class), true);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, int i, cg6 cg6Var) {
        nhq nhqVar;
        int i2;
        bii biiVar;
        ArrayList arrayList;
        List<TrackDto> q0;
        if (cg6Var instanceof nhq) {
            nhqVar = (nhq) cg6Var;
            int i3 = nhqVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nhqVar.m = i3 - Integer.MIN_VALUE;
                Object obj = nhqVar.k;
                nm6 nm6Var = nm6.a;
                i2 = nhqVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SimilarTracksDto>> a = ((SimilarTracksApi) this.a.getValue()).a(str);
                    nhqVar.j = i;
                    nhqVar.m = 1;
                    obj = swf.N(a, nhqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = nhqVar.j;
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    List similarTracks = ((SimilarTracksDto) ((aii) biiVar).a).getSimilarTracks();
                    if (similarTracks == null || (q0 = CollectionsKt.q0(similarTracks, i)) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (TrackDto trackDto : q0) {
                            mqs a2 = trackDto != null ? wts.a(trackDto) : null;
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                    }
                    return arrayList == null ? new nj6(null) : new qj6(arrayList);
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
        nhqVar = new nhq(this, cg6Var);
        Object obj2 = nhqVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = nhqVar.m;
        if (i2 != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public void b(j1g j1gVar, String str) {
        dyr dyrVar;
        int ordinal = j1gVar.ordinal();
        if (ordinal == 0) {
            dyrVar = dyr.b;
        } else if (ordinal == 1) {
            dyrVar = dyr.c;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            dyrVar = dyr.d;
        }
        neg.A(dyrVar, str);
        if (j1gVar == j1g.a) {
            crs crsVar = (crs) this.a.getValue();
            x97.y(crsVar.b, null, null, new v0r(crsVar, "Like_Anything_FirstTime", null, 26), 3);
        }
    }

    public wt5(fnb fnbVar, cvo cvoVar) {
        this.a = btf.b(new fv4(5, fnbVar, cvoVar));
    }

    public wt5(e0j e0jVar) {
        e0jVar.getClass();
        this.a = btf.b(new mze(e0jVar, 12));
    }
}
