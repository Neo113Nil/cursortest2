package defpackage;

import android.view.View;
import com.yandex.go.payments.paymentlist.ui.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Ref$LongRef;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes.dex */
public final /* synthetic */ class veu implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ veu(Ref$LongRef ref$LongRef, fva0 fva0Var, String str, PerformanceAnalytics$Type performanceAnalytics$Type) {
        this.a = 2;
        this.b = ref$LongRef;
        this.w = fva0Var;
        this.c = str;
        this.x = performanceAnalytics$Type;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                xeu xeuVar = (xeu) this.b;
                String str = (String) this.c;
                String str2 = (String) this.w;
                kme0 kme0Var = (kme0) this.x;
                ez40 ez40Var = (ez40) obj;
                Object obj3 = 0L;
                Object c = ez40Var.c(xeu.d);
                if (((String) (c != null ? c : "")).equals(str)) {
                    kme0 c2 = xeuVar.c(ez40Var, str);
                    if (c2 != null && !c2.a.equals(str2)) {
                        synchronized (xeuVar) {
                            xeuVar.d(ez40Var, str);
                            Object hashSet = new HashSet();
                            Object c3 = ez40Var.c(kme0Var);
                            if (c3 != null) {
                                hashSet = c3;
                            }
                            HashSet hashSet2 = new HashSet((Collection) hashSet);
                            hashSet2.add(str);
                            ez40Var.g(kme0Var, hashSet2);
                        }
                    }
                    return null;
                }
                kme0 kme0Var2 = xeu.c;
                Object c4 = ez40Var.c(kme0Var2);
                if (c4 == null) {
                    c4 = obj3;
                }
                long longValue = ((Long) c4).longValue();
                if (longValue + 1 == 30) {
                    synchronized (xeuVar) {
                        try {
                            Object c5 = ez40Var.c(kme0Var2);
                            if (c5 != null) {
                                obj3 = c5;
                            }
                            long longValue2 = ((Long) obj3).longValue();
                            String str3 = "";
                            Set hashSet3 = new HashSet();
                            String str4 = null;
                            for (Map.Entry entry : ez40Var.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str5 : set) {
                                        if (str4 != null && str4.compareTo(str5) <= 0) {
                                        }
                                        str3 = ((kme0) entry.getKey()).a;
                                        str4 = str5;
                                        hashSet3 = set;
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet4 = new HashSet(hashSet3);
                            hashSet4.remove(str4);
                            ez40Var.g(new kme0(str3), hashSet4);
                            longValue = longValue2 - 1;
                            ez40Var.g(xeu.c, Long.valueOf(longValue));
                        } finally {
                        }
                    }
                } else {
                    obj2 = null;
                }
                Object hashSet5 = new HashSet();
                Object c6 = ez40Var.c(kme0Var);
                if (c6 != null) {
                    hashSet5 = c6;
                }
                HashSet hashSet6 = new HashSet((Collection) hashSet5);
                hashSet6.add(str);
                ez40Var.g(kme0Var, hashSet6);
                ez40Var.g(xeu.c, Long.valueOf(longValue + 1));
                ez40Var.g(xeu.d, str);
                return obj2;
            case 1:
                return new c((ListItemWithBadgeComponent) obj, (z0a0) this.b, (pav) this.c, (mfb) this.w, (hba0) this.x);
            case 2:
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.b;
                fva0 fva0Var = (fva0) this.w;
                String str6 = (String) this.c;
                PerformanceAnalytics$Type performanceAnalytics$Type = (PerformanceAnalytics$Type) this.x;
                long longValue3 = ((Long) obj).longValue();
                ref$LongRef.element = longValue3;
                String d = fva0Var.d(str6, performanceAnalytics$Type.getAnalyticsName());
                fva0Var.b.getClass();
                czf0.a(longValue3, d);
                fva0Var.d.getClass();
                return zy11.a;
            case 3:
                kku0.o((kku0) this.b, (ArrayList) this.c, (ArrayList) this.w, (ArrayList) this.x);
                return zy11.a;
            default:
                jyw0 jyw0Var = (jyw0) this.b;
                return new qyw0((View) obj, jyw0Var.a, (wn70) this.c, (w301) this.w, (f2z) jyw0Var.b.get(), (chw0) this.x);
        }
    }

    public /* synthetic */ veu(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
