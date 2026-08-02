package defpackage;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class oa {
    public final /* synthetic */ gs4 a;
    public final /* synthetic */ ma b;
    public final /* synthetic */ ja c;
    public final /* synthetic */ AtomicBoolean d;
    public final /* synthetic */ HashSet e;
    public final /* synthetic */ HashSet f;
    public final /* synthetic */ HashSet g;

    public oa(gs4 gs4Var, ma maVar, ja jaVar, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        this.a = gs4Var;
        this.b = maVar;
        this.c = jaVar;
        this.d = atomicBoolean;
        this.e = hashSet;
        this.f = hashSet2;
        this.g = hashSet3;
    }

    public final void a(qod qodVar) {
        boolean z;
        long j;
        Date date;
        ehv ehvVar;
        Date date2;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.a.b;
        AtomicBoolean atomicBoolean2 = this.d;
        ja jaVar = this.c;
        qodVar.getClass();
        ma maVar = this.b;
        String str = (String) maVar.c;
        int i = maVar.a;
        Long l = (Long) maVar.e;
        String str2 = (String) maVar.d;
        try {
            ehv ehvVar2 = gs4.i;
            if (((ja) ehvVar2.o().a) != null) {
                try {
                    ja jaVar2 = (ja) ehvVar2.o().a;
                    if ((jaVar2 != null ? jaVar2.i : null) == jaVar.i) {
                        if (!atomicBoolean2.get() && str == null && i == 0) {
                            atomicBoolean.set(false);
                            return;
                        }
                        Date date3 = jaVar.a;
                        if (maVar.a != 0) {
                            date = new Date(maVar.a * 1000);
                            j = 1000;
                        } else {
                            if (maVar.b != 0) {
                                j = 1000;
                                date3 = new Date((maVar.b * 1000) + new Date().getTime());
                            } else {
                                j = 1000;
                            }
                            date = date3;
                        }
                        if (str == null) {
                            str = jaVar.e;
                        }
                        String str3 = str;
                        String str4 = jaVar.h;
                        String str5 = jaVar.i;
                        Collection collection = atomicBoolean2.get() ? this.e : jaVar.b;
                        Collection collection2 = atomicBoolean2.get() ? this.f : jaVar.c;
                        Collection collection3 = atomicBoolean2.get() ? this.g : jaVar.d;
                        ra raVar = jaVar.f;
                        Date date4 = new Date();
                        if (l != null) {
                            long longValue = l.longValue();
                            ehvVar = ehvVar2;
                            date2 = new Date(longValue * j);
                        } else {
                            ehvVar = ehvVar2;
                            date2 = jaVar.j;
                        }
                        Date date5 = date2;
                        if (str2 == null) {
                            str2 = jaVar.k;
                        }
                        ehvVar.o().V(new ja(str3, str4, str5, collection, collection2, collection3, raVar, date, date4, date5, str2), true);
                        atomicBoolean.set(false);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    atomicBoolean.set(z);
                    throw th;
                }
            }
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }
}
