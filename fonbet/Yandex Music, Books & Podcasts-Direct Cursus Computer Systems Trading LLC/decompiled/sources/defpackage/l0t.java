package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.network.repositories.retrofit.TracksApi;
import com.yandex.music.shared.utils.ReduplicationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.sequences.Sequence;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class l0t {
    public final e4 a;
    public final jyr b;

    public l0t(e0j e0jVar, e4 e4Var) {
        this.a = e4Var;
        this.b = btf.b(new mze(e0jVar, 16));
    }

    public final rj6 a(String str, psd psdVar) {
        str.getClass();
        return (rj6) x97.D(g.a, new fpq(this, str, psdVar, null, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9 A[Catch: ReduplicationException -> 0x002d, TryCatch #0 {ReduplicationException -> 0x002d, blocks: (B:11:0x0028, B:12:0x00b3, B:14:0x00b9, B:15:0x00d0, B:17:0x00d6, B:19:0x00de, B:21:0x00e4, B:25:0x00e8, B:26:0x014b, B:28:0x014f, B:30:0x0163, B:33:0x0198, B:36:0x016a, B:37:0x0173, B:39:0x0179, B:42:0x019e, B:43:0x01bc, B:44:0x01bd, B:47:0x01c2, B:48:0x01c7, B:49:0x00ee, B:51:0x00f2, B:55:0x0109, B:58:0x0117, B:61:0x0129, B:63:0x012d, B:64:0x0141, B:66:0x0145, B:67:0x01c8, B:68:0x01cd, B:72:0x003b, B:73:0x004e, B:75:0x0054, B:77:0x005c, B:79:0x0064, B:82:0x006d, B:85:0x007c, B:86:0x007f, B:88:0x0080), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014f A[Catch: ReduplicationException -> 0x002d, TryCatch #0 {ReduplicationException -> 0x002d, blocks: (B:11:0x0028, B:12:0x00b3, B:14:0x00b9, B:15:0x00d0, B:17:0x00d6, B:19:0x00de, B:21:0x00e4, B:25:0x00e8, B:26:0x014b, B:28:0x014f, B:30:0x0163, B:33:0x0198, B:36:0x016a, B:37:0x0173, B:39:0x0179, B:42:0x019e, B:43:0x01bc, B:44:0x01bd, B:47:0x01c2, B:48:0x01c7, B:49:0x00ee, B:51:0x00f2, B:55:0x0109, B:58:0x0117, B:61:0x0129, B:63:0x012d, B:64:0x0141, B:66:0x0145, B:67:0x01c8, B:68:0x01cd, B:72:0x003b, B:73:0x004e, B:75:0x0054, B:77:0x005c, B:79:0x0064, B:82:0x006d, B:85:0x007c, B:86:0x007f, B:88:0x0080), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bd A[Catch: ReduplicationException -> 0x002d, TryCatch #0 {ReduplicationException -> 0x002d, blocks: (B:11:0x0028, B:12:0x00b3, B:14:0x00b9, B:15:0x00d0, B:17:0x00d6, B:19:0x00de, B:21:0x00e4, B:25:0x00e8, B:26:0x014b, B:28:0x014f, B:30:0x0163, B:33:0x0198, B:36:0x016a, B:37:0x0173, B:39:0x0179, B:42:0x019e, B:43:0x01bc, B:44:0x01bd, B:47:0x01c2, B:48:0x01c7, B:49:0x00ee, B:51:0x00f2, B:55:0x0109, B:58:0x0117, B:61:0x0129, B:63:0x012d, B:64:0x0141, B:66:0x0145, B:67:0x01c8, B:68:0x01cd, B:72:0x003b, B:73:0x004e, B:75:0x0054, B:77:0x005c, B:79:0x0064, B:82:0x006d, B:85:0x007c, B:86:0x007f, B:88:0x0080), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee A[Catch: ReduplicationException -> 0x002d, TryCatch #0 {ReduplicationException -> 0x002d, blocks: (B:11:0x0028, B:12:0x00b3, B:14:0x00b9, B:15:0x00d0, B:17:0x00d6, B:19:0x00de, B:21:0x00e4, B:25:0x00e8, B:26:0x014b, B:28:0x014f, B:30:0x0163, B:33:0x0198, B:36:0x016a, B:37:0x0173, B:39:0x0179, B:42:0x019e, B:43:0x01bc, B:44:0x01bd, B:47:0x01c2, B:48:0x01c7, B:49:0x00ee, B:51:0x00f2, B:55:0x0109, B:58:0x0117, B:61:0x0129, B:63:0x012d, B:64:0x0141, B:66:0x0145, B:67:0x01c8, B:68:0x01cd, B:72:0x003b, B:73:0x004e, B:75:0x0054, B:77:0x005c, B:79:0x0064, B:82:0x006d, B:85:0x007c, B:86:0x007f, B:88:0x0080), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vz0 vz0Var, boolean z, psd psdVar, cg6 cg6Var) {
        i0t i0tVar;
        int i;
        LinkedHashMap linkedHashMap;
        ArrayList<Pair> arrayList;
        bii biiVar;
        Object J;
        try {
            if (cg6Var instanceof i0t) {
                i0tVar = (i0t) cg6Var;
                int i2 = i0tVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    i0tVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = i0tVar.l;
                    nm6 nm6Var = nm6.a;
                    i = i0tVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int i3 = 0;
                        ArrayList arrayList2 = new ArrayList(0);
                        for (Object obj2 : (Sequence) vz0Var.b) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                u75.n();
                                throw null;
                            }
                            Integer num = (Integer) linkedHashMap2.get(obj2);
                            if (num == null) {
                                linkedHashMap2.put(obj2, new Integer(i3));
                            } else {
                                arrayList2.add(new Pair(new Integer(i3), num));
                            }
                            i3 = i4;
                        }
                        Set keySet = linkedHashMap2.keySet();
                        keySet.getClass();
                        Set set = keySet;
                        a0g.F(this.a, psdVar, CollectionsKt.J(set));
                        Call<MusicBackendResponse<List<TrackDto>>> b = ((TracksApi) this.b.getValue()).b(new o3f(set), z);
                        i0tVar.j = linkedHashMap2;
                        i0tVar.k = arrayList2;
                        i0tVar.n = 1;
                        Object N = swf.N(b, i0tVar);
                        if (N == nm6Var) {
                            return nm6Var;
                        }
                        linkedHashMap = linkedHashMap2;
                        obj = N;
                        arrayList = arrayList2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList = i0tVar.k;
                        linkedHashMap = i0tVar.j;
                        qgg.h0(obj);
                    }
                    biiVar = (bii) obj;
                    if (!(biiVar instanceof aii)) {
                        List<TrackDto> list = (List) ((aii) biiVar).a;
                        ArrayList arrayList3 = new ArrayList(v75.o(list, 10));
                        for (TrackDto trackDto : list) {
                            arrayList3.add(trackDto != null ? wts.a(trackDto) : null);
                        }
                        J = new qj6(arrayList3);
                    } else if (biiVar instanceof xhi) {
                        int i5 = ((xhi) biiVar).b;
                        String name = ((xhi) biiVar).c.getName();
                        String str = name == null ? "" : name;
                        String message = ((xhi) biiVar).c.getMessage();
                        J = new kj6(i5, ((xhi) biiVar).c.getDetails(), str, message == null ? "" : message, ((xhi) biiVar).a);
                    } else if (biiVar instanceof yhi) {
                        J = new lj6(((yhi) biiVar).b, ((yhi) biiVar).c, ((yhi) biiVar).a);
                    } else {
                        if (!(biiVar instanceof zhi)) {
                            throw new x7j();
                        }
                        J = uwf.J((zhi) biiVar);
                    }
                    if (J instanceof qj6) {
                        if (J instanceof pj6) {
                            return J;
                        }
                        throw new x7j();
                    }
                    ArrayList O = CollectionsKt.O((Iterable) ((qj6) J).a);
                    int size = O.size();
                    int size2 = linkedHashMap.size();
                    if (size != size2) {
                        throw new ReduplicationException(size + " values returned for initial " + size2 + " keys");
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(O);
                        for (Pair pair : arrayList) {
                            arrayList4.add(((Number) pair.a).intValue(), arrayList4.get(((Number) pair.b).intValue()));
                        }
                        O = arrayList4;
                    }
                    return new qj6(O);
                }
            }
            if (i != 0) {
            }
            biiVar = (bii) obj;
            if (!(biiVar instanceof aii)) {
            }
            if (J instanceof qj6) {
            }
        } catch (ReduplicationException e) {
            ssg.a(7, null, "Reduplication failed", e);
            return new oj6(new IOException(e));
        }
        i0tVar = new i0t(this, cg6Var);
        Object obj3 = i0tVar.l;
        nm6 nm6Var2 = nm6.a;
        i = i0tVar.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, psd psdVar, cg6 cg6Var) {
        j0t j0tVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof j0t) {
            j0tVar = (j0t) cg6Var;
            int i2 = j0tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = j0tVar.j;
                nm6 nm6Var = nm6.a;
                i = j0tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a0g.F(this.a, psdVar, 1);
                    Call<MusicBackendResponse<List<TrackDto>>> b = ((TracksApi) this.b.getValue()).b(new o3f(t75.c(str)), false);
                    j0tVar.l = 1;
                    obj = swf.N(b, j0tVar);
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
                    TrackDto trackDto = (TrackDto) CollectionsKt.firstOrNull((List) ((aii) biiVar).a);
                    mqs a = trackDto != null ? wts.a(trackDto) : null;
                    return a == null ? new nj6(null) : new qj6(a);
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
        j0tVar = new j0t(this, cg6Var);
        Object obj2 = j0tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = j0tVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public final Object d(Iterable iterable, boolean z, psd psdVar, cg6 cg6Var) {
        return b(new vz0(4, new lcc(CollectionsKt.F(iterable), true, new phs(27))), z, psdVar, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Iterable iterable, psd psdVar, cg6 cg6Var) {
        k0t k0tVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof k0t) {
            k0tVar = (k0t) cg6Var;
            int i2 = k0tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k0tVar.j;
                nm6 nm6Var = nm6.a;
                i = k0tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a0g.F(this.a, psdVar, CollectionsKt.J(iterable));
                    TracksApi tracksApi = (TracksApi) this.b.getValue();
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zc4.a0((rr5) it.next()));
                    }
                    Call<MusicBackendResponse<List<TrackDto>>> c = tracksApi.c(new o3f(arrayList), false);
                    k0tVar.l = 1;
                    obj = swf.N(c, k0tVar);
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
                    return new qj6(wts.b((List) ((aii) biiVar).a));
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
        k0tVar = new k0t(this, cg6Var);
        Object obj2 = k0tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = k0tVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
