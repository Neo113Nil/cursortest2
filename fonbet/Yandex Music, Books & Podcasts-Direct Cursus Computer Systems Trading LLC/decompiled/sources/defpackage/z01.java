package defpackage;

import com.yandex.plus.home.dailyquests.repository.rest.prefs.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes4.dex */
public final class z01 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(String str, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.k = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z01(this.k, continuation);
            case 1:
                return new z01(this.k, continuation, 1);
            default:
                return new z01(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((z01) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        LinkedList linkedList;
        boolean contains;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ArrayList b = aoi.c().b(this.k);
                ArrayList arrayList = new ArrayList();
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    oq oqVar = (oq) it.next();
                    LinkedList linkedList2 = oqVar.F;
                    if (linkedList2 == null || linkedList2.isEmpty()) {
                        linkedList = new LinkedList();
                    } else {
                        Collection collection = (Collection) Preconditions.nonNull(linkedList2);
                        linkedList = new LinkedList();
                        for (Object obj2 : collection) {
                            mqs mqsVar = (mqs) obj2;
                            if (mqsVar == null) {
                                su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                                contains = false;
                            } else {
                                l18 l18Var = l18.b;
                                bdt I = hag.I(uaa.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                            }
                            if (contains) {
                                linkedList.add(obj2);
                            }
                        }
                    }
                    if (!linkedList.isEmpty()) {
                        oqVar.k(linkedList);
                        arrayList.add(oqVar);
                    }
                }
                return arrayList;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return this.k;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return x3f.d.b(y.Companion.serializer(), this.k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z01(String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = str;
    }
}
