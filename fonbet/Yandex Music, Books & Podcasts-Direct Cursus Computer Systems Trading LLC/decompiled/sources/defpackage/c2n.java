package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c2n implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ j2n c;

    public /* synthetic */ c2n(rjc rjcVar, j2n j2nVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = j2nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        b2n b2nVar;
        int i;
        l1n l1nVar;
        l1n l1nVar2;
        h2n h2nVar;
        int i2;
        List list;
        int i3 = this.a;
        j2n j2nVar = this.c;
        rjc rjcVar = this.b;
        Object obj2 = null;
        switch (i3) {
            case 0:
                if (continuation instanceof b2n) {
                    b2nVar = (b2n) continuation;
                    int i4 = b2nVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        b2nVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = b2nVar.j;
                        nm6 nm6Var = nm6.a;
                        i = b2nVar.k;
                        if (i != 0) {
                            qgg.h0(obj3);
                            List list2 = (List) obj;
                            s9f[] s9fVarArr = j2n.D;
                            List list3 = list2;
                            boolean z = false;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator it = list3.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((x74) it.next()) instanceof t74) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            if (!z && (l1nVar2 = j2nVar.p) != null) {
                                obj2 = new y64(l1nVar2.a, l1nVar2.b, l1nVar2.c, l1nVar2.d);
                            } else if (z && (l1nVar = j2nVar.q) != null) {
                                obj2 = new x64(l1nVar.a, l1nVar.b, l1nVar.c, l1nVar.d);
                            }
                            Pair pair = new Pair(list2, obj2);
                            b2nVar.k = 1;
                            if (rjcVar.emit(pair, b2nVar) == nm6Var) {
                                break;
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                b2nVar = new b2n(this, continuation);
                Object obj32 = b2nVar.j;
                nm6 nm6Var2 = nm6.a;
                i = b2nVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof h2n) {
                    h2nVar = (h2n) continuation;
                    int i5 = h2nVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        h2nVar.k = i5 - Integer.MIN_VALUE;
                        Object obj4 = h2nVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = h2nVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            s9f[] s9fVarArr2 = j2n.D;
                            ArrayList arrayList = ((ok4) obj).a;
                            Activity R = vq2.R(j2nVar.a);
                            if (R == null) {
                                list = c5b.a;
                            } else if (j2nVar.g().e(R)) {
                                List<kk4> o0 = CollectionsKt.o0(arrayList, new ehf(28));
                                ArrayList arrayList2 = new ArrayList(v75.o(o0, 10));
                                for (kk4 kk4Var : o0) {
                                    kk4Var.getClass();
                                    arrayList2.add(new r74(kk4Var.a, kk4Var.b, kk4Var.c));
                                }
                                list = arrayList2;
                            } else {
                                list = c5b.a;
                            }
                            q1n q1nVar = new q1n(list, c5b.a);
                            h2nVar.k = 1;
                            if (rjcVar.emit(q1nVar, h2nVar) == nm6Var3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                h2nVar = new h2n(this, continuation);
                Object obj42 = h2nVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = h2nVar.k;
                if (i2 != 0) {
                }
        }
        return Unit.a;
    }
}
