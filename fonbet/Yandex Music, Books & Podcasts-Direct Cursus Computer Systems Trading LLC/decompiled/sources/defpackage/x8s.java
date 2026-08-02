package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class x8s extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ y8s k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8s(y8s y8sVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = y8sVar;
        this.l = str;
        this.m = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x8s(this.k, this.l, this.m, continuation, 0);
            default:
                return new x8s(this.k, this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((x8s) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.m;
        String str2 = this.l;
        y8s y8sVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                List list = (List) y8sVar.d.get(str2);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        mqs mqsVar = (mqs) obj2;
                        if (!StringsKt.M(mqsVar.c, str, true)) {
                            List list2 = mqsVar.f;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    if (StringsKt.M(((zp2) it.next()).b, str, true)) {
                                    }
                                }
                            }
                        }
                        arrayList.add(obj2);
                    }
                    break;
                } else {
                    break;
                }
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                List list3 = (List) y8sVar.e.get(str2);
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list3) {
                        mqs mqsVar2 = (mqs) obj3;
                        if (!StringsKt.M(mqsVar2.c, str, true)) {
                            List list4 = mqsVar2.f;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    if (StringsKt.M(((zp2) it2.next()).b, str, true)) {
                                    }
                                }
                            }
                        }
                        arrayList2.add(obj3);
                    }
                    break;
                } else {
                    break;
                }
                break;
        }
        return c5b.a;
    }
}
