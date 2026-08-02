package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class s32 extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ boolean l;
    public int m;
    public Object n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s32(List list, Continuation continuation, jkw jkwVar, boolean z) {
        super(2, continuation);
        this.n = list;
        this.o = jkwVar;
        this.l = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new s32((t32) this.o, this.l, continuation);
            default:
                return new s32((List) this.n, continuation, (jkw) this.o, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((s32) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v32 v32Var;
        int i;
        Object e;
        t32 t32Var;
        int i2;
        List list;
        int i3;
        rj6 rj6Var;
        switch (this.j) {
            case 0:
                t32 t32Var2 = (t32) this.o;
                nm6 nm6Var = nm6.a;
                int i4 = this.m;
                if (i4 == 0) {
                    qgg.h0(obj);
                    if (((Boolean) t32Var2.o.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    Object value = t32Var2.n.getValue();
                    v32Var = value instanceof v32 ? (v32) value : null;
                    if (v32Var != null) {
                        i = 0;
                        if (this.l) {
                            q12 q12Var = (q12) t32Var2.q.getValue();
                            this.n = t32Var2;
                            this.p = v32Var;
                            this.k = 0;
                            this.m = 1;
                            Object i5 = ((z22) ((c72) q12Var.a.getValue())).i(true, this);
                            if (i5 != nm6Var) {
                                i5 = Unit.a;
                            }
                            if (i5 == nm6Var) {
                                return nm6Var;
                            }
                        }
                        q12 a = t32.a(t32Var2);
                        boolean z = v32Var.a;
                        this.n = t32Var2;
                        this.p = v32Var;
                        this.k = i;
                        this.m = 2;
                        e = ((z22) ((c72) a.a.getValue())).e(z, this);
                        if (e != nm6Var) {
                        }
                        if (e != nm6Var) {
                        }
                    }
                    return Unit.a;
                }
                if (i4 == 1) {
                    int i6 = this.k;
                    v32Var = (v32) this.p;
                    t32 t32Var3 = (t32) this.n;
                    qgg.h0(obj);
                    i = i6;
                    t32Var2 = t32Var3;
                    q12 a2 = t32.a(t32Var2);
                    boolean z2 = v32Var.a;
                    this.n = t32Var2;
                    this.p = v32Var;
                    this.k = i;
                    this.m = 2;
                    e = ((z22) ((c72) a2.a.getValue())).e(z2, this);
                    if (e != nm6Var) {
                        e = Unit.a;
                    }
                    if (e != nm6Var) {
                        return nm6Var;
                    }
                    t32Var = t32Var2;
                    i2 = i;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    i2 = this.k;
                    v32Var = (v32) this.p;
                    t32Var = (t32) this.n;
                    qgg.h0(obj);
                }
                q12 a3 = t32.a(t32Var);
                k22 k22Var = v32Var.c.c;
                this.n = null;
                this.p = null;
                this.k = i2;
                this.m = 3;
                Object k = ((z22) ((c72) a3.a.getValue())).k(k22Var, this);
                if (k != nm6Var) {
                    k = Unit.a;
                }
                if (k == nm6Var) {
                    return nm6Var;
                }
                return Unit.a;
            default:
                l0t l0tVar = ((jkw) this.o).c;
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                boolean z3 = this.l;
                if (i7 == 0) {
                    qgg.h0(obj);
                    List list2 = (List) this.n;
                    if (list2.isEmpty()) {
                        return c5b.a;
                    }
                    List w0 = CollectionsKt.w0(CollectionsKt.z0(list2));
                    List list3 = w0;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((iiw) it.next()).a());
                    }
                    psd psdVar = new psd(2);
                    psdVar.b = "YnisonMetaLoader";
                    psdVar.a("Loading by full id");
                    this.p = w0;
                    this.m = 0;
                    this.k = 1;
                    Object d = l0tVar.d(arrayList, z3, psdVar, this);
                    if (d == nm6Var2) {
                        return nm6Var2;
                    }
                    list = w0;
                    obj = d;
                    i3 = 0;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        rj6Var = (rj6) obj;
                        if (!(rj6Var instanceof qj6)) {
                            return ((qj6) rj6Var).a;
                        }
                        if (rj6Var instanceof pj6) {
                            return c5b.a;
                        }
                        b6e.s();
                        return null;
                    }
                    i3 = this.m;
                    list = (List) this.p;
                    qgg.h0(obj);
                }
                rj6 rj6Var2 = (rj6) obj;
                if (rj6Var2 instanceof qj6) {
                    return ((qj6) rj6Var2).a;
                }
                if (!(rj6Var2 instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                List list4 = list;
                ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((iiw) it2.next()).a);
                }
                List w02 = CollectionsKt.w0(CollectionsKt.z0(arrayList2));
                psd psdVar2 = new psd(2);
                psdVar2.b = "YnisonMetaLoader";
                psdVar2.a("Loading by track id");
                this.p = null;
                this.m = i3;
                this.k = 2;
                obj = l0tVar.d(w02, z3, psdVar2, this);
                if (obj == nm6Var2) {
                    return nm6Var2;
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s32(t32 t32Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = t32Var;
        this.l = z;
    }
}
