package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r0m {
    public final cvl a;
    public final List b;
    public final frt c;
    public final lwc d;
    public final z66 e;
    public final f7l f;

    public r0m(cvl cvlVar, List list, frt frtVar, lwc lwcVar, z66 z66Var, f7l f7lVar) {
        cvlVar.getClass();
        frtVar.getClass();
        lwcVar.getClass();
        z66Var.getClass();
        f7lVar.getClass();
        this.a = cvlVar;
        this.b = list;
        this.c = frtVar;
        this.d = lwcVar;
        this.e = z66Var;
        this.f = f7lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        p0m p0mVar;
        Object obj;
        int i;
        n8g b;
        ArrayList arrayList;
        n8g n8gVar;
        int i2;
        ArrayList arrayList2;
        n8g n8gVar2;
        n7q n7qVar;
        if (cg6Var instanceof p0m) {
            p0mVar = (p0m) cg6Var;
            int i3 = p0mVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p0mVar.p = i3 - Integer.MIN_VALUE;
                obj = p0mVar.n;
                nm6 nm6Var = nm6.a;
                i = p0mVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    b = t75.b();
                    cvl cvlVar = this.a;
                    boolean z = false;
                    int i4 = cvlVar.g > 0 ? 1 : 0;
                    List list = this.b;
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((mqs) obj2).k == dg2.b) {
                                arrayList3.add(obj2);
                            }
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    if (i4 != 0) {
                        b.add(o0m.Share);
                        if (arrayList != null) {
                            d6l x = p6g.x((e6l) this.f.c.getValue());
                            if (x != null && (n7qVar = x.a) != null) {
                                z = vut.E(n7qVar);
                            }
                            if (z) {
                                b.add(o0m.PlayNext);
                                b.add(o0m.AddToQueue);
                            }
                        }
                        if (!this.d.a()) {
                            b.add(o0m.DevicePicker);
                        }
                    }
                    if (!cvlVar.d()) {
                        p0mVar.j = b;
                        p0mVar.k = b;
                        p0mVar.l = arrayList;
                        p0mVar.m = i4;
                        p0mVar.p = 1;
                        Object b2 = b(cvlVar, p0mVar);
                        if (b2 == nm6Var) {
                            return nm6Var;
                        }
                        n8gVar = b;
                        i2 = i4;
                        arrayList2 = arrayList;
                        obj = b2;
                        n8gVar2 = n8gVar;
                    }
                    return t75.a(b);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = p0mVar.m;
                arrayList2 = p0mVar.l;
                n8gVar = p0mVar.k;
                n8gVar2 = p0mVar.j;
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    if (i2 != 0 && arrayList2 != null) {
                        n8gVar.add(o0m.Edit);
                    }
                    n8gVar.add(o0m.Rename);
                    if (this.e.f()) {
                        n8gVar.add(o0m.AddTracks);
                    }
                    n8gVar.add(o0m.Delete);
                }
                b = n8gVar2;
                return t75.a(b);
            }
        }
        p0mVar = new p0m(this, cg6Var);
        obj = p0mVar.n;
        nm6 nm6Var2 = nm6.a;
        i = p0mVar.p;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        b = n8gVar2;
        return t75.a(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cvl cvlVar, cg6 cg6Var) {
        q0m q0mVar;
        int i;
        String str;
        if (cg6Var instanceof q0m) {
            q0mVar = (q0m) cg6Var;
            int i2 = q0mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = q0mVar.k;
                nm6 nm6Var = nm6.a;
                i = q0mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    str = cvlVar.c.a;
                    q0mVar.j = str;
                    q0mVar.m = 1;
                    obj = this.c.f(q0mVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = q0mVar.j;
                    qgg.h0(obj);
                }
                return Boolean.valueOf(Intrinsics.d(str, ((xxq) obj).a));
            }
        }
        q0mVar = new q0m(this, cg6Var);
        Object obj2 = q0mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = q0mVar.m;
        if (i != 0) {
        }
        return Boolean.valueOf(Intrinsics.d(str, ((xxq) obj2).a));
    }
}
