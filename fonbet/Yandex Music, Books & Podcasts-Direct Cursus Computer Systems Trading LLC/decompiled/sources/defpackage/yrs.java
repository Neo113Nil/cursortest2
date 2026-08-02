package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class yrs implements rjc {
    public final /* synthetic */ rjc a;
    public final /* synthetic */ ass b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ m d;
    public final /* synthetic */ qe3 e;
    public final /* synthetic */ boolean f;

    public yrs(rjc rjcVar, ass assVar, Context context, m mVar, qe3 qe3Var, boolean z) {
        this.a = rjcVar;
        this.b = assVar;
        this.c = context;
        this.d = mVar;
        this.e = qe3Var;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        xrs xrsVar;
        int i;
        mwj mwjVar;
        if (continuation instanceof xrs) {
            xrsVar = (xrs) continuation;
            int i2 = xrsVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xrsVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = xrsVar.j;
                nm6 nm6Var = nm6.a;
                i = xrsVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    mwj mwjVar2 = (mwj) obj;
                    Pair pair = mwjVar2.a;
                    if (pair == null) {
                        mwjVar = mwj.b;
                    } else {
                        if (pair == null) {
                            wvs.h("No value present");
                            return null;
                        }
                        eca ecaVar = (eca) pair.a;
                        boolean isEmpty = ecaVar.a().isEmpty();
                        ass assVar = this.b;
                        Context context = this.c;
                        m mVar = this.d;
                        qe3 qe3Var = this.e;
                        boolean z = this.f;
                        if (isEmpty) {
                            Collection collection = ecaVar.a;
                            Set set = ((lja) ((e6q) assVar.d).e.getValue()).a;
                            Collection collection2 = collection;
                            ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
                            Iterator it = collection2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((mqs) it.next()).a);
                            }
                            boolean containsAll = set.containsAll(arrayList);
                            if (containsAll) {
                                mwjVar = new mwj(new Pair(ecaVar, assVar.a(trs.a, ecaVar, context, mVar, qe3Var, z)));
                            } else {
                                if (containsAll) {
                                    b6e.s();
                                    return null;
                                }
                                mwjVar = new mwj(new Pair(ecaVar, null));
                            }
                        } else {
                            Pair pair2 = mwjVar2.a;
                            if (pair2 == null) {
                                wvs.h("No value present");
                                return null;
                            }
                            mwjVar = new mwj(new Pair(ecaVar, assVar.a((wrs) pair2.b, ecaVar, context, mVar, qe3Var, z)));
                        }
                    }
                    xrsVar.k = 1;
                    if (this.a.emit(mwjVar, xrsVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        xrsVar = new xrs(this, continuation);
        Object obj22 = xrsVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xrsVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }
}
