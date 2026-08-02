package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.likes.UserLibraryModifyDto;
import com.yandex.music.shared.network.repositories.dto.likes.TrackLikeDto;
import com.yandex.music.shared.network.repositories.dto.likes.TrackLikeRequest;
import com.yandex.music.shared.network.repositories.dto.likes.VideoClipLikeDto;
import com.yandex.music.shared.network.repositories.dto.likes.VideoClipLikeRequest;
import com.yandex.music.shared.network.repositories.retrofit.LikesDislikesApi;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class f5g {
    public final jyr a;

    public f5g(e0j e0jVar) {
        this.a = btf.b(new mze(e0jVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, ArrayList arrayList) {
        s4g s4gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof s4g) {
            s4gVar = (s4g) cg6Var;
            int i2 = s4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = s4gVar.j;
                nm6 nm6Var = nm6.a;
                i = s4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> j = j().j(str, new o3f(arrayList));
                    s4gVar.l = 1;
                    obj = swf.O(j, Unit.class, s4gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        s4gVar = new s4g(this, cg6Var);
        Object obj2 = s4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = s4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, String str, ArrayList arrayList) {
        t4g t4gVar;
        int i;
        rc7 rc7Var;
        tc7 sc7Var;
        bii biiVar;
        if (cg6Var instanceof t4g) {
            t4gVar = (t4g) cg6Var;
            int i2 = t4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = t4gVar.j;
                nm6 nm6Var = nm6.a;
                i = t4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        r4g r4gVar = (r4g) it.next();
                        String e = r4gVar.a.e();
                        Long l = r4gVar.b;
                        if (l != null) {
                            Date date = new Date(l.longValue());
                            jyr b = btf.b(new x6s(6));
                            jyr b2 = btf.b(new x6s(7));
                            jyr b3 = btf.b(new x6s(8));
                            lm4 a = ern.a(rc7.class);
                            if (a.equals(ern.a(qc7.class))) {
                                sc7Var = new qc7(date, ((bgs) b.getValue()).a(date));
                            } else if (a.equals(ern.a(rc7.class))) {
                                sc7Var = new rc7(date, ((bgs) b2.getValue()).a(date));
                            } else {
                                if (!a.equals(ern.a(sc7.class))) {
                                    xq0.x("Add this type to method");
                                    return null;
                                }
                                sc7Var = new sc7(date, ((bgs) b3.getValue()).a(date));
                            }
                            rc7Var = (rc7) sc7Var;
                        } else {
                            rc7Var = null;
                        }
                        arrayList2.add(new TrackLikeDto(e, rc7Var));
                    }
                    Call<MusicBackendResponse<UserLibraryModifyDto>> k = j.k(str, new TrackLikeRequest(arrayList2));
                    t4gVar.l = 1;
                    obj = swf.N(k, t4gVar);
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
                    Integer revision = ((UserLibraryModifyDto) ((aii) biiVar).a).getRevision();
                    return new qj6(new Integer(revision != null ? revision.intValue() : 0));
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        t4gVar = new t4g(this, cg6Var);
        Object obj2 = t4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = t4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var, String str, ArrayList arrayList) {
        u4g u4gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof u4g) {
            u4gVar = (u4g) cg6Var;
            int i2 = u4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = u4gVar.j;
                nm6 nm6Var = nm6.a;
                i = u4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new VideoClipLikeDto((String) it.next()));
                    }
                    Call<Unit> e = j.e(str, new VideoClipLikeRequest(arrayList2));
                    u4gVar.l = 1;
                    obj = swf.O(e, Unit.class, u4gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        u4gVar = new u4g(this, cg6Var);
        Object obj2 = u4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = u4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var, String str, ArrayList arrayList) {
        v4g v4gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof v4g) {
            v4gVar = (v4g) cg6Var;
            int i2 = v4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = v4gVar.j;
                nm6 nm6Var = nm6.a;
                i = v4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> g = j().g(str, new o3f(arrayList));
                    v4gVar.l = 1;
                    obj = swf.O(g, Unit.class, v4gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        v4gVar = new v4g(this, cg6Var);
        Object obj2 = v4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = v4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var, String str, ArrayList arrayList) {
        w4g w4gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof w4g) {
            w4gVar = (w4g) cg6Var;
            int i2 = w4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = w4gVar.j;
                nm6 nm6Var = nm6.a;
                i = w4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> i3 = j().i(str, new o3f(arrayList));
                    w4gVar.l = 1;
                    obj = swf.O(i3, Unit.class, w4gVar);
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
                    return new qj6(((aii) biiVar).a);
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
        w4gVar = new w4g(this, cg6Var);
        Object obj2 = w4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = w4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var, String str, ArrayList arrayList) {
        x4g x4gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof x4g) {
            x4gVar = (x4g) cg6Var;
            int i2 = x4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = x4gVar.j;
                nm6 nm6Var = nm6.a;
                i = x4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((nvl) it.next()).d());
                    }
                    Call<Unit> a = j.a(str, new o3f(arrayList2));
                    x4gVar.l = 1;
                    obj = swf.O(a, Unit.class, x4gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        x4gVar = new x4g(this, cg6Var);
        Object obj2 = x4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = x4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var, String str, ArrayList arrayList) {
        y4g y4gVar;
        int i;
        rc7 rc7Var;
        tc7 sc7Var;
        bii biiVar;
        if (cg6Var instanceof y4g) {
            y4gVar = (y4g) cg6Var;
            int i2 = y4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = y4gVar.j;
                nm6 nm6Var = nm6.a;
                i = y4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        r4g r4gVar = (r4g) it.next();
                        String e = r4gVar.a.e();
                        Long l = r4gVar.b;
                        if (l != null) {
                            Date date = new Date(l.longValue());
                            jyr b = btf.b(new x6s(6));
                            jyr b2 = btf.b(new x6s(7));
                            jyr b3 = btf.b(new x6s(8));
                            lm4 a = ern.a(rc7.class);
                            if (a.equals(ern.a(qc7.class))) {
                                sc7Var = new qc7(date, ((bgs) b.getValue()).a(date));
                            } else if (a.equals(ern.a(rc7.class))) {
                                sc7Var = new rc7(date, ((bgs) b2.getValue()).a(date));
                            } else {
                                if (!a.equals(ern.a(sc7.class))) {
                                    xq0.x("Add this type to method");
                                    return null;
                                }
                                sc7Var = new sc7(date, ((bgs) b3.getValue()).a(date));
                            }
                            rc7Var = (rc7) sc7Var;
                        } else {
                            rc7Var = null;
                        }
                        arrayList2.add(new TrackLikeDto(e, rc7Var));
                    }
                    Call<MusicBackendResponse<UserLibraryModifyDto>> m = j.m(str, new TrackLikeRequest(arrayList2));
                    y4gVar.l = 1;
                    obj = swf.N(m, y4gVar);
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
                    Integer revision = ((UserLibraryModifyDto) ((aii) biiVar).a).getRevision();
                    return new qj6(new Integer(revision != null ? revision.intValue() : 0));
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        y4gVar = new y4g(this, cg6Var);
        Object obj2 = y4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = y4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cg6 cg6Var, String str, ArrayList arrayList) {
        z4g z4gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof z4g) {
            z4gVar = (z4g) cg6Var;
            int i2 = z4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = z4gVar.j;
                nm6 nm6Var = nm6.a;
                i = z4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new VideoClipLikeDto((String) it.next()));
                    }
                    Call<Unit> b = j.b(str, new VideoClipLikeRequest(arrayList2));
                    z4gVar.l = 1;
                    obj = swf.O(b, Unit.class, z4gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        z4gVar = new z4g(this, cg6Var);
        Object obj2 = z4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = z4gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(cg6 cg6Var, String str, ArrayList arrayList) {
        a5g a5gVar;
        int i;
        rc7 rc7Var;
        tc7 sc7Var;
        bii biiVar;
        if (cg6Var instanceof a5g) {
            a5gVar = (a5g) cg6Var;
            int i2 = a5gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a5gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a5gVar.j;
                nm6 nm6Var = nm6.a;
                i = a5gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        r4g r4gVar = (r4g) it.next();
                        String str2 = r4gVar.a.a;
                        Long l = r4gVar.b;
                        if (l != null) {
                            Date date = new Date(l.longValue());
                            jyr b = btf.b(new x6s(6));
                            jyr b2 = btf.b(new x6s(7));
                            jyr b3 = btf.b(new x6s(8));
                            lm4 a = ern.a(rc7.class);
                            if (a.equals(ern.a(qc7.class))) {
                                sc7Var = new qc7(date, ((bgs) b.getValue()).a(date));
                            } else if (a.equals(ern.a(rc7.class))) {
                                sc7Var = new rc7(date, ((bgs) b2.getValue()).a(date));
                            } else {
                                if (!a.equals(ern.a(sc7.class))) {
                                    xq0.x("Add this type to method");
                                    return null;
                                }
                                sc7Var = new sc7(date, ((bgs) b3.getValue()).a(date));
                            }
                            rc7Var = (rc7) sc7Var;
                        } else {
                            rc7Var = null;
                        }
                        arrayList2.add(new TrackLikeDto(str2, rc7Var));
                    }
                    Call<MusicBackendResponse<UserLibraryModifyDto>> l2 = j.l(str, new TrackLikeRequest(arrayList2));
                    a5gVar.l = 1;
                    obj = swf.N(l2, a5gVar);
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
                    Integer revision = ((UserLibraryModifyDto) ((aii) biiVar).a).getRevision();
                    return new qj6(new Integer(revision != null ? revision.intValue() : 0));
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
        a5gVar = new a5g(this, cg6Var);
        Object obj2 = a5gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a5gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public final LikesDislikesApi j() {
        return (LikesDislikesApi) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var, String str, ArrayList arrayList) {
        b5g b5gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof b5g) {
            b5gVar = (b5g) cg6Var;
            int i2 = b5gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b5gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = b5gVar.j;
                nm6 nm6Var = nm6.a;
                i = b5gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> f = j().f(str, new o3f(arrayList));
                    b5gVar.l = 1;
                    obj = swf.O(f, Unit.class, b5gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        b5gVar = new b5g(this, cg6Var);
        Object obj2 = b5gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = b5gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cg6 cg6Var, String str, ArrayList arrayList) {
        c5g c5gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof c5g) {
            c5gVar = (c5g) cg6Var;
            int i2 = c5gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = c5gVar.j;
                nm6 nm6Var = nm6.a;
                i = c5gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> d = j().d(str, new o3f(arrayList));
                    c5gVar.l = 1;
                    obj = swf.O(d, Unit.class, c5gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        c5gVar = new c5g(this, cg6Var);
        Object obj2 = c5gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = c5gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(cg6 cg6Var, String str, ArrayList arrayList) {
        d5g d5gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof d5g) {
            d5gVar = (d5g) cg6Var;
            int i2 = d5gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d5gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = d5gVar.j;
                nm6 nm6Var = nm6.a;
                i = d5gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((nvl) it.next()).d());
                    }
                    Call<Unit> h = j.h(str, new o3f(arrayList2));
                    d5gVar.l = 1;
                    obj = swf.O(h, Unit.class, d5gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        d5gVar = new d5g(this, cg6Var);
        Object obj2 = d5gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = d5gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(cg6 cg6Var, String str, ArrayList arrayList) {
        e5g e5gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof e5g) {
            e5gVar = (e5g) cg6Var;
            int i2 = e5gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e5gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = e5gVar.j;
                nm6 nm6Var = nm6.a;
                i = e5gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LikesDislikesApi j = j();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new VideoClipLikeDto((String) it.next()));
                    }
                    Call<Unit> c = j.c(str, new VideoClipLikeRequest(arrayList2));
                    e5gVar.l = 1;
                    obj = swf.O(c, Unit.class, e5gVar);
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
                    return new qj6(((aii) biiVar).a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
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
        }
        e5gVar = new e5g(this, cg6Var);
        Object obj2 = e5gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = e5gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
