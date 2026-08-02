package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.TagDto;
import com.yandex.music.shared.dto.playlist.PlaylistIdDto;
import com.yandex.music.shared.dto.tag.PlaylistIdsByTagDto;
import com.yandex.music.shared.network.repositories.retrofit.TagApi;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class q3s {
    public final TagApi a;

    public q3s(e0j e0jVar) {
        this.a = (TagApi) e0jVar.a.b(TagApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, z3s z3sVar, cg6 cg6Var) {
        p3s p3sVar;
        int i;
        bii biiVar;
        pvl pvlVar;
        String value;
        String name;
        List<PlaylistIdDto> ids;
        String uid;
        String kind;
        if (cg6Var instanceof p3s) {
            p3sVar = (p3s) cg6Var;
            int i2 = p3sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p3sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = p3sVar.j;
                nm6 nm6Var = nm6.a;
                i = p3sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistIdsByTagDto>> a = this.a.a(str, z3sVar.a);
                    p3sVar.l = 1;
                    obj = swf.N(a, p3sVar);
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
                        String name2 = musicBackendInvocationError.getName();
                        String str2 = name2 == null ? "" : name2;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
                PlaylistIdsByTagDto playlistIdsByTagDto = (PlaylistIdsByTagDto) ((aii) biiVar).a;
                playlistIdsByTagDto.getClass();
                TagDto tag = playlistIdsByTagDto.getTag();
                if (tag != null) {
                    String id = tag.getId();
                    d3s d3sVar = (id == null || (value = tag.getValue()) == null || (name = tag.getName()) == null) ? null : new d3s(id, value, name);
                    if (d3sVar != null && (ids = playlistIdsByTagDto.getIds()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (PlaylistIdDto playlistIdDto : ids) {
                            nvl nvlVar = (playlistIdDto == null || (uid = playlistIdDto.getUid()) == null || (kind = playlistIdDto.getKind()) == null) ? null : new nvl(uid, kind);
                            if (nvlVar != null) {
                                arrayList.add(nvlVar);
                            }
                        }
                        pvlVar = new pvl(d3sVar, arrayList);
                        return pvlVar != null ? new nj6(null) : new qj6(pvlVar);
                    }
                }
                pvlVar = null;
                if (pvlVar != null) {
                }
            }
        }
        p3sVar = new p3s(this, cg6Var);
        Object obj2 = p3sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = p3sVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
