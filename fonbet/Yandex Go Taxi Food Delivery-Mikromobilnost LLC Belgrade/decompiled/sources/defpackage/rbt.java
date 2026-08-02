package defpackage;

import com.yandex.messaging.domain.contacts.GetPhoneContactListUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.sync.d;
import com.yandex.messaging.internal.storage.contacts.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class rbt extends vds0 {
    public final h3y b;
    public final d c;
    public final kse d;
    public final lqo e;

    public rbt(h3y h3yVar, d dVar, kse kseVar, lqo lqoVar) {
        super(kseVar.b);
        this.b = h3yVar;
        this.c = dVar;
        this.d = kseVar;
        this.e = lqoVar;
    }

    public static final qbt d(rbt rbtVar, a aVar, boolean z) {
        rbtVar.getClass();
        List a = aVar.e.a();
        ArrayList<peb0> arrayList = new ArrayList();
        for (Object obj : a) {
            if (!evu0.J(((peb0) obj).c)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return z ? obt.d : obt.c;
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (peb0 peb0Var : arrayList) {
            arrayList2.add(new nbt(peb0Var.a, peb0Var.b, peb0Var.c, peb0Var.d));
        }
        return new pbt(arrayList2);
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return !this.e.a(tz10.k) ? new g92(2, obt.a) : e.X(this.c.j, new GetPhoneContactListUseCase$run$$inlined$flatMapLatest$1(null, this));
    }
}
