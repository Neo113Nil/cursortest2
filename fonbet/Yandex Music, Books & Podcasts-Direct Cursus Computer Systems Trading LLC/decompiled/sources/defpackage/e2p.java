package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.skeleton.blocks.search_history.data.SearchHistoryBlockApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class e2p {
    public final oze a;
    public final frt b;
    public final jyr c;
    public final jyr d;

    public e2p(oze ozeVar, frt frtVar, upq upqVar, jyr jyrVar) {
        this.a = ozeVar;
        this.b = frtVar;
        this.c = jyrVar;
        this.d = btf.b(new z26(upqVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        b2p b2pVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof b2p) {
            b2pVar = (b2p) cg6Var;
            int i2 = b2pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = b2pVar.j;
                Object obj2 = nm6.a;
                i = b2pVar.l;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = this.b.c().a;
                    b2pVar.l = 1;
                    obj = b(str, b2pVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        b2pVar = new b2p(this, cg6Var);
        Object obj3 = b2pVar.j;
        Object obj22 = nm6.a;
        i = b2pVar.l;
        boolean z2 = true;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof qj6)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        c2p c2pVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof c2p) {
            c2pVar = (c2p) cg6Var;
            int i2 = c2pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = c2pVar.j;
                nm6 nm6Var = nm6.a;
                i = c2pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> a = ((SearchHistoryBlockApi) this.d.getValue()).a(str, "no-cache");
                    c2pVar.l = 1;
                    obj = swf.O(a, Unit.class, c2pVar);
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
        c2pVar = new c2p(this, cg6Var);
        Object obj2 = c2pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = c2pVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0046, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(uvn uvnVar, boolean z, cg6 cg6Var) {
        d2p d2pVar;
        int i;
        Object obj;
        if (cg6Var instanceof d2p) {
            d2pVar = (d2p) cg6Var;
            int i2 = d2pVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d2pVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = d2pVar.l;
                nm6 nm6Var = nm6.a;
                i = d2pVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    d2pVar.k = z;
                    d2pVar.n = 1;
                    obj2 = this.a.a(uvnVar, z, d2pVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = d2pVar.j;
                        qgg.h0(obj2);
                        if (((Boolean) obj2).booleanValue()) {
                            return obj;
                        }
                        qj6 qj6Var = (qj6) obj;
                        List list = ((uze) qj6Var.a).a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!(((f0f) obj3) instanceof b0f)) {
                                arrayList.add(obj3);
                            }
                        }
                        ((uze) qj6Var.a).getClass();
                        return new qj6(new uze(arrayList));
                    }
                    z = d2pVar.k;
                    qgg.h0(obj2);
                }
                obj = (rj6) obj2;
                if (obj instanceof qj6) {
                    return obj;
                }
                f0p f0pVar = (f0p) this.c.getValue();
                d2pVar.j = (qj6) obj;
                d2pVar.k = z;
                d2pVar.n = 2;
                obj2 = f0pVar.a(d2pVar);
            }
        }
        d2pVar = new d2p(this, cg6Var);
        Object obj22 = d2pVar.l;
        nm6 nm6Var2 = nm6.a;
        i = d2pVar.n;
        if (i != 0) {
        }
        obj = (rj6) obj22;
        if (obj instanceof qj6) {
        }
    }
}
