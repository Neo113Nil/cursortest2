package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class n3s extends s4k {
    public d3s b;
    public List c;
    public final z3s d;
    public final boolean e;
    public final w3s f;
    public final w3s g;
    public final jyr h;
    public final jyr i;
    public final int j;

    public n3s(d3s d3sVar, List list, z3s z3sVar, boolean z, w3s w3sVar, w3s w3sVar2) {
        d3sVar.getClass();
        z3sVar.getClass();
        this.b = d3sVar;
        this.c = list;
        this.d = z3sVar;
        this.e = z;
        this.f = w3sVar;
        this.g = w3sVar2;
        bdt I = hag.I(u3s.class);
        l18 l18Var = l18.b;
        this.h = l18Var.b(I, true);
        this.i = l18Var.b(hag.I(q3s.class), true);
        this.j = 25;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:12:0x0028, B:13:0x00bc, B:15:0x00c5, B:18:0x00d9, B:19:0x00e0, B:23:0x003a, B:24:0x005e, B:26:0x0064, B:27:0x0084, B:29:0x008e, B:30:0x0094, B:35:0x0073, B:37:0x0077, B:38:0x007d, B:39:0x007e, B:40:0x0083, B:42:0x0041, B:44:0x0045), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:12:0x0028, B:13:0x00bc, B:15:0x00c5, B:18:0x00d9, B:19:0x00e0, B:23:0x003a, B:24:0x005e, B:26:0x0064, B:27:0x0084, B:29:0x008e, B:30:0x0094, B:35:0x0073, B:37:0x0077, B:38:0x007d, B:39:0x007e, B:40:0x0083, B:42:0x0041, B:44:0x0045), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:12:0x0028, B:13:0x00bc, B:15:0x00c5, B:18:0x00d9, B:19:0x00e0, B:23:0x003a, B:24:0x005e, B:26:0x0064, B:27:0x0084, B:29:0x008e, B:30:0x0094, B:35:0x0073, B:37:0x0077, B:38:0x007d, B:39:0x007e, B:40:0x0083, B:42:0x0041, B:44:0x0045), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:12:0x0028, B:13:0x00bc, B:15:0x00c5, B:18:0x00d9, B:19:0x00e0, B:23:0x003a, B:24:0x005e, B:26:0x0064, B:27:0x0084, B:29:0x008e, B:30:0x0094, B:35:0x0073, B:37:0x0077, B:38:0x007d, B:39:0x007e, B:40:0x0083, B:42:0x0041, B:44:0x0045), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:12:0x0028, B:13:0x00bc, B:15:0x00c5, B:18:0x00d9, B:19:0x00e0, B:23:0x003a, B:24:0x005e, B:26:0x0064, B:27:0x0084, B:29:0x008e, B:30:0x0094, B:35:0x0073, B:37:0x0077, B:38:0x007d, B:39:0x007e, B:40:0x0083, B:42:0x0041, B:44:0x0045), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        m3s m3sVar;
        int i;
        List list;
        ap0 ap0Var;
        rj6 rj6Var;
        List list2;
        try {
            if (cg6Var instanceof m3s) {
                m3sVar = (m3s) cg6Var;
                int i2 = m3sVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    m3sVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = m3sVar.l;
                    nm6 nm6Var = nm6.a;
                    i = m3sVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        list = this.c;
                        if (list == null) {
                            q3s q3sVar = (q3s) this.i.getValue();
                            String str = this.b.a;
                            z3s z3sVar = this.d;
                            m3sVar.j = o4kVar;
                            m3sVar.n = 1;
                            obj = q3sVar.a(str, z3sVar, m3sVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        }
                        Integer num = (Integer) o4kVar.a();
                        ap0 ap0Var2 = new ap0(num == null ? num.intValue() : 0, this.j, list.size());
                        u3s u3sVar = (u3s) this.h.getValue();
                        List E = bow.E(list, ap0Var2);
                        boolean z = this.e;
                        m3sVar.j = null;
                        m3sVar.k = ap0Var2;
                        m3sVar.n = 2;
                        obj = u3sVar.a.d(E, z, m3sVar);
                        if (obj != nm6Var) {
                            ap0Var = ap0Var2;
                            list2 = (List) obj;
                            if (!list2.isEmpty()) {
                            }
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ap0Var = m3sVar.k;
                        qgg.h0(obj);
                        list2 = (List) obj;
                        if (!list2.isEmpty()) {
                            throw new IOException("playlists are empty, most likely network error");
                        }
                        this.f.invoke();
                        return new q4k(list2, null, ap0Var.a(), Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                    o4kVar = m3sVar.j;
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                    if (rj6Var instanceof qj6) {
                        if (rj6Var instanceof pj6) {
                            throw ((pj6) rj6Var).a();
                        }
                        throw new x7j();
                    }
                    pvl pvlVar = (pvl) ((qj6) rj6Var).a;
                    this.b = pvlVar.a;
                    list = pvlVar.b;
                    this.c = list;
                    Integer num2 = (Integer) o4kVar.a();
                    ap0 ap0Var22 = new ap0(num2 == null ? num2.intValue() : 0, this.j, list.size());
                    u3s u3sVar2 = (u3s) this.h.getValue();
                    List E2 = bow.E(list, ap0Var22);
                    boolean z2 = this.e;
                    m3sVar.j = null;
                    m3sVar.k = ap0Var22;
                    m3sVar.n = 2;
                    obj = u3sVar2.a.d(E2, z2, m3sVar);
                    if (obj != nm6Var) {
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            rj6Var = (rj6) obj;
            if (rj6Var instanceof qj6) {
            }
        } catch (IOException e) {
            this.g.invoke();
            return new p4k(e);
        }
        m3sVar = new m3s(this, cg6Var);
        Object obj2 = m3sVar.l;
        nm6 nm6Var2 = nm6.a;
        i = m3sVar.n;
    }
}
