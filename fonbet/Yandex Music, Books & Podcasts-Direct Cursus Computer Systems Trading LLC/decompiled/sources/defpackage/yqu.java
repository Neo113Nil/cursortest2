package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wavefortwo.data.MultivibeGroupDto;
import com.yandex.music.shared.wavefortwo.data.MultivibeGroupEditRequestDto;
import com.yandex.music.shared.wavefortwo.data.WaveForTwoMultivibeGroupApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class yqu {
    public final e0j a;
    public final jyr b;

    public yqu(e0j e0jVar) {
        e0jVar.getClass();
        this.a = e0jVar;
        this.b = btf.b(new wfs(22, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        tqu tquVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof tqu) {
            tquVar = (tqu) cg6Var;
            int i2 = tquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = tquVar.j;
                nm6 nm6Var = nm6.a;
                i = tquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MultivibeGroupDto>> a = d().a();
                    tquVar.l = 1;
                    obj = swf.N(a, tquVar);
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
                    fhi c0 = bg3.c0((MultivibeGroupDto) ((aii) biiVar).a);
                    return c0 == null ? new nj6(null) : new qj6(c0);
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
        tquVar = new tqu(this, cg6Var);
        Object obj2 = tquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = tquVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, cg6 cg6Var) {
        uqu uquVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof uqu) {
            uquVar = (uqu) cg6Var;
            int i2 = uquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uquVar.j;
                nm6 nm6Var = nm6.a;
                i = uquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MultivibeGroupDto>> d = d().d(str, new MultivibeGroupEditRequestDto(str2));
                    uquVar.l = 1;
                    obj = swf.N(d, uquVar);
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
                    fhi c0 = bg3.c0((MultivibeGroupDto) ((aii) biiVar).a);
                    return c0 == null ? new nj6(null) : new qj6(c0);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str3 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
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
        uquVar = new uqu(this, cg6Var);
        Object obj2 = uquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = uquVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        vqu vquVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof vqu) {
            vquVar = (vqu) cg6Var;
            int i2 = vquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vquVar.j;
                nm6 nm6Var = nm6.a;
                i = vquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MultivibeGroupDto>> e = d().e(str);
                    vquVar.l = 1;
                    obj = swf.N(e, vquVar);
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
                    fhi c0 = bg3.c0((MultivibeGroupDto) ((aii) biiVar).a);
                    return c0 == null ? new nj6(null) : new qj6(c0);
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
        vquVar = new vqu(this, cg6Var);
        Object obj2 = vquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vquVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public final WaveForTwoMultivibeGroupApi d() {
        return (WaveForTwoMultivibeGroupApi) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        wqu wquVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof wqu) {
            wquVar = (wqu) cg6Var;
            int i2 = wquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wquVar.j;
                nm6 nm6Var = nm6.a;
                i = wquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MultivibeGroupDto>> b = d().b(str);
                    wquVar.l = 1;
                    obj = swf.N(b, wquVar);
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
                    fhi c0 = bg3.c0((MultivibeGroupDto) ((aii) biiVar).a);
                    return c0 == null ? new nj6(null) : new qj6(c0);
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
        wquVar = new wqu(this, cg6Var);
        Object obj2 = wquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wquVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        xqu xquVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof xqu) {
            xquVar = (xqu) cg6Var;
            int i2 = xquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xquVar.j;
                nm6 nm6Var = nm6.a;
                i = xquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<MultivibeGroupDto>>> f = d().f();
                    xquVar.l = 1;
                    obj = swf.N(f, xquVar);
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
                    List list = (List) ((aii) biiVar).a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fhi c0 = bg3.c0((MultivibeGroupDto) it.next());
                        if (c0 != null) {
                            arrayList.add(c0);
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
        xquVar = new xqu(this, cg6Var);
        Object obj2 = xquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xquVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
