package defpackage;

import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.sequences.b;

/* loaded from: classes9.dex */
public final class zjr {
    public final wjr a;
    public final ListBuilder b;
    public final rjr c;
    public String d;

    public zjr(wjr wjrVar, List list) {
        this.a = wjrVar;
        ListBuilder a = rcc.a();
        a.add(new xjr("flex"));
        s5r s5rVar = new s5r(b.h(new h73(1, list), new n35(5)));
        while (s5rVar.hasNext()) {
            a.add(new xjr(((xjr) s5rVar.next()).a));
        }
        this.b = a.j();
        this.c = this.a.createLogConfiguration();
    }

    public final void a() {
        String str = this.d;
        if (str != null) {
            c(str);
        }
    }

    public final void b() {
        String str = this.d;
        if (str != null) {
            xfz.c.a.put(new yjr(str), new ConcurrentLinkedQueue());
        }
    }

    public final void c(String str) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) xfz.c.a.remove(new yjr(str));
        List J0 = concurrentLinkedQueue != null ? a.J0(concurrentLinkedQueue) : null;
        if (J0 != null) {
            Iterator it = J0.iterator();
            while (it.hasNext()) {
                e((ujr) it.next());
            }
        }
    }

    public final void d(FlexLogLevel flexLogLevel, String str, i3y i3yVar, List list, String str2, String str3, String str4) {
        String str5 = this.d;
        ujr ujrVar = new ujr(flexLogLevel, str, i3yVar, new sjr(a.m0(list, this.b), System.currentTimeMillis(), new tjr(str2, str3, str4)));
        if (str5 != null) {
            hsa0 hsa0Var = xfz.c;
            if (hsa0Var.a.get(new yjr(str5)) != null) {
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) hsa0Var.a.get(new yjr(str5));
                if (concurrentLinkedQueue != null) {
                    concurrentLinkedQueue.add(ujrVar);
                    return;
                }
                return;
            }
        }
        e(ujrVar);
    }

    public final void e(ujr ujrVar) {
        String str = this.d;
        if (str != null) {
            i3y c = xfz.c((i3y) xfz.a.get(new yjr(str)), ujrVar.c);
            List list = (List) xfz.b.get(new yjr(str));
            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
            ujrVar = new ujr(ujrVar.a, ujrVar.b, xfz.c(c, xfz.a(new Pair("tags", arrayList))), ujrVar.d);
        }
        this.a.log(ujrVar);
    }

    public final void f(String str) {
        if (str == null) {
            str = null;
        }
        this.d = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zjr(List list) {
        this(vjr.b, list);
        wjr.a.getClass();
    }
}
