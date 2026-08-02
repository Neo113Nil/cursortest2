package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class sia implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ wia c;

    public /* synthetic */ sia(rjc rjcVar, wia wiaVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = wiaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ria riaVar;
        int i;
        via viaVar;
        int i2;
        int i3 = this.a;
        rjc rjcVar = this.b;
        wia wiaVar = this.c;
        switch (i3) {
            case 0:
                if (continuation instanceof ria) {
                    riaVar = (ria) continuation;
                    int i4 = riaVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        riaVar.k = i4 - Integer.MIN_VALUE;
                        Object obj2 = riaVar.j;
                        nm6 nm6Var = nm6.a;
                        i = riaVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(wia.b(wiaVar, (kca) it.next()));
                            }
                            List a = wia.a(wiaVar, new List[]{arrayList});
                            riaVar.k = 1;
                            if (rjcVar.emit(a, riaVar) == nm6Var) {
                                break;
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
                riaVar = new ria(this, continuation);
                Object obj22 = riaVar.j;
                nm6 nm6Var2 = nm6.a;
                i = riaVar.k;
                if (i != 0) {
                }
            default:
                if (continuation instanceof via) {
                    viaVar = (via) continuation;
                    int i5 = viaVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        viaVar.k = i5 - Integer.MIN_VALUE;
                        Object obj3 = viaVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = viaVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            List<gga> list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                            for (gga ggaVar : list2) {
                                wiaVar.getClass();
                                cvl cvlVar = ggaVar.a;
                                arrayList2.add(new hia(cvlVar.b, op7.c(cvlVar), qo6.e, null, ggaVar.b));
                            }
                            List a2 = wia.a(wiaVar, new List[]{arrayList2});
                            viaVar.k = 1;
                            if (rjcVar.emit(a2, viaVar) == nm6Var3) {
                                break;
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
                viaVar = new via(this, continuation);
                Object obj32 = viaVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = viaVar.k;
                if (i2 != 0) {
                }
        }
        return Unit.a;
    }
}
