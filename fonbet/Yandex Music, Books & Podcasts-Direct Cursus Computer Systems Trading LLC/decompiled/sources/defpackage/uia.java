package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class uia extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;
    public final /* synthetic */ wia m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uia(wia wiaVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = wiaVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                uia uiaVar = new uia(this.m, continuation, 0);
                uiaVar.k = list;
                uiaVar.l = list2;
                return uiaVar.invokeSuspend(Unit.a);
            default:
                uia uiaVar2 = new uia(this.m, continuation, 1);
                uiaVar2.k = list;
                uiaVar2.l = list2;
                return uiaVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        wia wiaVar = this.m;
        switch (i) {
            case 0:
                List list = this.k;
                List list2 = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                List list3 = list;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(wia.c(wiaVar, (jja) it.next()));
                }
                List list4 = list2;
                ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(wia.b(wiaVar, (kca) it2.next()));
                }
                return wia.a(wiaVar, new List[]{arrayList, arrayList2});
            default:
                List list5 = this.k;
                List list6 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                List list7 = list5;
                ArrayList arrayList3 = new ArrayList(v75.o(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(wia.c(wiaVar, (jja) it3.next()));
                }
                List list8 = list6;
                ArrayList arrayList4 = new ArrayList(v75.o(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(wia.b(wiaVar, (kca) it4.next()));
                }
                return wia.a(wiaVar, new List[]{arrayList3, arrayList4});
        }
    }
}
