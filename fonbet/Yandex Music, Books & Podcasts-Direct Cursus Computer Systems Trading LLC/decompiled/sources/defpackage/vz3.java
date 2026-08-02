package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class vz3 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ a04 c;

    public /* synthetic */ vz3(rjc rjcVar, a04 a04Var, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = a04Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        uz3 uz3Var;
        int i;
        yz3 yz3Var;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof uz3) {
                    uz3Var = (uz3) continuation;
                    int i3 = uz3Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uz3Var.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = uz3Var.j;
                        nm6 nm6Var = nm6.a;
                        i = uz3Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((pda) it.next()).a);
                            }
                            this.c.getClass();
                            wgg wggVar = new wgg(CollectionsKt.q0(arrayList, 8), 8 < arrayList.size());
                            uz3Var.k = 1;
                            if (this.b.emit(wggVar, uz3Var) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                uz3Var = new uz3(this, continuation);
                Object obj22 = uz3Var.j;
                nm6 nm6Var2 = nm6.a;
                i = uz3Var.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof yz3) {
                    yz3Var = (yz3) continuation;
                    int i4 = yz3Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        yz3Var.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = yz3Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = yz3Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            List list2 = (List) obj;
                            this.c.getClass();
                            wgg wggVar2 = new wgg(CollectionsKt.q0(list2, 8), 8 < list2.size());
                            yz3Var.k = 1;
                            if (this.b.emit(wggVar2, yz3Var) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                yz3Var = new yz3(this, continuation);
                Object obj32 = yz3Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = yz3Var.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
