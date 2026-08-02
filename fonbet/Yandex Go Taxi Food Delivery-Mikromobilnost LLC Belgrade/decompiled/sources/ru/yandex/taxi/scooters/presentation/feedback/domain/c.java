package ru.yandex.taxi.scooters.presentation.feedback.domain;

import android.content.Context;
import defpackage.eln0;
import defpackage.evu0;
import defpackage.fln0;
import defpackage.iln0;
import defpackage.jqr;
import defpackage.jwo0;
import defpackage.kzo;
import defpackage.mth;
import defpackage.ppm0;
import defpackage.sln0;
import defpackage.tcc;
import defpackage.tj60;
import defpackage.uln0;
import defpackage.zjo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class c {
    public final Context a;
    public final tj60 b;
    public final eln0 c;
    public final zjo0 d;
    public final kzo e;

    public c(Context context, tj60 tj60Var, eln0 eln0Var, zjo0 zjo0Var, kzo kzoVar) {
        this.a = context;
        this.b = tj60Var;
        this.c = eln0Var;
        this.d = zjo0Var;
        this.e = kzoVar;
        a(0);
    }

    public final void a(int i) {
        kzo kzoVar = this.e;
        sln0 sln0Var = (sln0) kzoVar.c;
        boolean z = sln0Var.a;
        jwo0 jwo0Var = sln0Var.d;
        if (z) {
            Iterator it = sln0Var.c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                List list = (List) entry.getKey();
                jwo0 jwo0Var2 = (jwo0) entry.getValue();
                if (list.contains(Integer.valueOf(i))) {
                    jwo0Var = jwo0Var2;
                    break;
                }
            }
        }
        if (jwo0Var != null) {
            r0 r0Var = (r0) kzoVar.w;
            r0Var.getClass();
            r0Var.m(null, jwo0Var);
        }
    }

    public final List b() {
        List list;
        iln0 iln0Var;
        kzo kzoVar = this.e;
        uln0 uln0Var = (uln0) ((r0) kzoVar.x).getValue();
        List list2 = ((sln0) kzoVar.c).b;
        jwo0 jwo0Var = (jwo0) ((r0) kzoVar.w).getValue();
        List list3 = uln0Var.a;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((fln0) it.next()).a);
        }
        eln0 eln0Var = this.c;
        eln0Var.getClass();
        if (jwo0Var == null || (list = list2) == null || list.isEmpty() || arrayList.isEmpty() || (iln0Var = jwo0Var.a) == null) {
            return null;
        }
        eln0Var.a.getClass();
        boolean isEmpty = arrayList.isEmpty();
        EmptyList emptyList = EmptyList.a;
        if (isEmpty || list2.isEmpty()) {
            return emptyList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iln0Var.c.iterator();
        while (it2.hasNext()) {
            ru.yandex.taxi.scooters.presentation.feedback.data.mapper.a.b((iln0) it2.next(), arrayList, list2, emptyList, arrayList2);
        }
        return arrayList2;
    }

    public final ArrayList c(String str) {
        List f = this.d.f(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (((ppm0) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ppm0) it.next()).a.b);
        }
        return arrayList2;
    }

    public final Object d(String str, String str2, Continuation continuation) {
        kzo kzoVar = this.e;
        uln0 uln0Var = (uln0) ((r0) kzoVar.x).getValue();
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = ((sln0) kzoVar.c).e;
        int i = uln0Var.c;
        String obj = uln0Var.d.toString();
        ArrayList c = c(str);
        List list = uln0Var.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fln0) it.next()).a);
        }
        eln0 eln0Var = this.c;
        if (i == 0) {
            eln0Var.getClass();
            if (evu0.J(obj) && c.isEmpty() && arrayList.isEmpty()) {
                return zy11.a;
            }
        }
        return eln0Var.b.b(feedbackSettingsParams$Screen, str, str2, i, obj, c, arrayList, (ContinuationImpl) continuation);
    }

    public final m0 e() {
        kzo kzoVar = this.e;
        return new m0(new mth(e.d((r0) kzoVar.w), 6), e.d((r0) kzoVar.x), new ScootersFeedbackStateInteractor$listenInputStateValidity$1(this, null));
    }

    public final jqr f(String str) {
        return new jqr(this.d.g(str), new ScootersFeedbackStateInteractor$listenPhotos$1(this, null), 3);
    }

    public final void g() {
        uln0 uln0Var = (uln0) ((r0) this.e.x).getValue();
        if (uln0Var.c == 0 && evu0.J(uln0Var.d)) {
            List list = uln0Var.e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ppm0) it.next()).a()) {
                        break;
                    }
                }
            }
            if (uln0Var.a.isEmpty()) {
                return;
            }
        }
        ru.yandex.taxi.scooters.presentation.feedback.b.a(this.b, this.a);
    }
}
