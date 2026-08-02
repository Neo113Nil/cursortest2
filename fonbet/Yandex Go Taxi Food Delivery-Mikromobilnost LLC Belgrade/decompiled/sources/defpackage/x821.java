package defpackage;

import com.yandex.quark.js.event.f;
import com.yandex.quark.js.event.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class x821 implements ifo, olw0 {
    public final r0 a;
    public final gci0 b;

    public x821() {
        r0 c = bvf0.c(EmptyList.a);
        this.a = c;
        this.b = e.d(c);
    }

    @Override // defpackage.ifo
    public final boolean c(i iVar) {
        return iVar instanceof f;
    }

    @Override // defpackage.ifo
    public final Object g(i iVar, ContinuationImpl continuationImpl) {
        List a = ((feo) ((f) iVar).a()).a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(new jlw0((String) it.next()));
        }
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, arrayList);
        return zy11.a;
    }

    @Override // defpackage.olw0
    public final tpr j() {
        return this.b;
    }
}
