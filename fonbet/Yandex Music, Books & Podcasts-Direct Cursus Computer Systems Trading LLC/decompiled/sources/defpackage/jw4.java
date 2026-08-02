package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class jw4 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jw4(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                jw4 jw4Var = new jw4(3, 0, continuation);
                jw4Var.k = list;
                jw4Var.l = list2;
                return jw4Var.invokeSuspend(Unit.a);
            case 1:
                jw4 jw4Var2 = new jw4(3, 1, continuation);
                jw4Var2.k = list;
                jw4Var2.l = list2;
                return jw4Var2.invokeSuspend(Unit.a);
            case 2:
                jw4 jw4Var3 = new jw4(3, 2, continuation);
                jw4Var3.k = list;
                jw4Var3.l = list2;
                return jw4Var3.invokeSuspend(Unit.a);
            case 3:
                jw4 jw4Var4 = new jw4(3, 3, continuation);
                jw4Var4.k = list;
                jw4Var4.l = list2;
                return jw4Var4.invokeSuspend(Unit.a);
            default:
                jw4 jw4Var5 = new jw4(3, 4, continuation);
                jw4Var5.k = list;
                jw4Var5.l = list2;
                return jw4Var5.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                List list = this.k;
                List list2 = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new iw4(list, list2);
            case 1:
                List list3 = this.k;
                List list4 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return new h35(list3, list4);
            case 2:
                List list5 = this.k;
                List list6 = this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                List list7 = list5;
                HashSet hashSet = new HashSet();
                Iterator it = list6.iterator();
                while (it.hasNext()) {
                    hashSet.add(((x1u) it.next()).a);
                }
                return CollectionsKt.e0(list7, hashSet);
            case 3:
                List list8 = this.k;
                List list9 = this.l;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return new k98(list8, list9);
            default:
                List list10 = this.k;
                List list11 = this.l;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return new cwl(list10, list11);
        }
    }
}
