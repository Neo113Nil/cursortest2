package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import com.yandex.music.shared.network.repositories.retrofit.VideoClipApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class b8u {
    public final VideoClipApi a;

    public b8u(e0j e0jVar) {
        this.a = (VideoClipApi) e0jVar.a.b(VideoClipApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        z7u z7uVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof z7u) {
            z7uVar = (z7u) cg6Var;
            int i2 = z7uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z7uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = z7uVar.j;
                nm6 nm6Var = nm6.a;
                i = z7uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<VideoClipDto>> a = this.a.a(str);
                    z7uVar.l = 1;
                    obj = swf.N(a, z7uVar);
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
                    x1u p0 = o2g.p0((VideoClipDto) ((aii) biiVar).a);
                    return p0 == null ? new nj6(null) : new qj6(p0);
                }
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
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        z7uVar = new z7u(this, cg6Var);
        Object obj2 = z7uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = z7uVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, cg6 cg6Var) {
        a8u a8uVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof a8u) {
            a8uVar = (a8u) cg6Var;
            int i2 = a8uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a8uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a8uVar.j;
                nm6 nm6Var = nm6.a;
                i = a8uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<VideoClipDto>>> b = this.a.b(new o3f(list));
                    a8uVar.l = 1;
                    obj = swf.N(b, a8uVar);
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
                    List list2 = (List) ((aii) biiVar).a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        x1u p0 = o2g.p0((VideoClipDto) it.next());
                        if (p0 != null) {
                            arrayList.add(p0);
                        }
                    }
                    return new qj6(arrayList);
                }
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
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        a8uVar = new a8u(this, cg6Var);
        Object obj2 = a8uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a8uVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
