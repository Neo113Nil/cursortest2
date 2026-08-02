package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.player.api.download.CastDownloadException;
import com.yandex.music.shared.player.content.remote.downloadinfo.DownloadInfoApi;
import com.yandex.music.shared.player.content.remote.downloadinfo.DownloadInfoDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class c48 {
    public final jyr a;

    public c48(i0j i0jVar) {
        this.a = btf.b(new jt5(i0jVar, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zvs zvsVar, cg6 cg6Var) {
        b48 b48Var;
        int i;
        bii biiVar;
        Object J;
        String codec;
        if (cg6Var instanceof b48) {
            b48Var = (b48) cg6Var;
            int i2 = b48Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b48Var.l = i2 - Integer.MIN_VALUE;
                Object obj = b48Var.j;
                nm6 nm6Var = nm6.a;
                i = b48Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<DownloadInfoDto>>> a = ((DownloadInfoApi) this.a.getValue()).a(zvsVar.a, Boolean.TRUE, null, null);
                    b48Var.l = 1;
                    obj = swf.N(a, b48Var);
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
                    List<DownloadInfoDto> list = (List) ((aii) biiVar).a;
                    list.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (DownloadInfoDto downloadInfoDto : list) {
                        if (downloadInfoDto != null && (codec = downloadInfoDto.getCodec()) != null) {
                            oq4.b.getClass();
                            oq4 Y = x2i.Y(codec);
                            Integer bitrate = downloadInfoDto.getBitrate();
                            if (bitrate != null) {
                                int intValue = bitrate.intValue();
                                String link = downloadInfoDto.getLink();
                                if (link != null) {
                                    String container = downloadInfoDto.getContainer();
                                    arrayList.add(new vaa(Y, intValue, link, Intrinsics.d(container, "hls") ? bb6.b : Intrinsics.d(container, "raw") ? bb6.a : container == null ? bb6.a : bb6.a, downloadInfoDto.getGain()));
                                }
                            }
                        }
                        arrayList = null;
                    }
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
                if (!(J instanceof mj6)) {
                    mj6 mj6Var = (mj6) J;
                    throw new CastDownloadException(k5r.i(mj6Var.a, "bad response, code "), mj6Var.a());
                }
                if (J instanceof oj6) {
                    throw new CastDownloadException("Transport error", ((oj6) J).a());
                }
                if (J instanceof nj6) {
                    throw new CastDownloadException("bad response, download-info list is  null", ((nj6) J).a());
                }
                if (!(J instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                Collection collection = (Collection) ((qj6) J).a;
                if (collection.isEmpty()) {
                    throw new CastDownloadException("download-info list is empty", null);
                }
                return (List) collection;
            }
        }
        b48Var = new b48(this, cg6Var);
        Object obj2 = b48Var.j;
        nm6 nm6Var2 = nm6.a;
        i = b48Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
        if (!(J instanceof mj6)) {
        }
    }
}
