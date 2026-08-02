package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes8.dex */
public final class yeh implements xa20 {
    public final zeh a;
    public final i3y b;
    public final i3y c;

    public yeh(zeh zehVar) {
        this.a = zehVar;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: xeh
            public final /* synthetic */ yeh b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                yeh yehVar = this.b;
                switch (i2) {
                    case 0:
                        return (qig0) yehVar.a.a.a.b;
                    default:
                        return (qig0) yehVar.a.b.a.b;
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: xeh
            public final /* synthetic */ yeh b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                yeh yehVar = this.b;
                switch (i22) {
                    case 0:
                        return (qig0) yehVar.a.a.a.b;
                    default:
                        return (qig0) yehVar.a.b.a.b;
                }
            }
        });
    }

    @Override // defpackage.xa20
    public final void a(wtf0 wtf0Var, Throwable th) {
        qig0 qig0Var = (qig0) this.b.getValue();
        String str = wtf0Var.a;
        String a = wtf0Var.a();
        ac20 ac20Var = qig0Var.a;
        String a2 = qig0.a(str);
        if (a == null) {
            a = "";
        }
        ((q) ac20Var).e(a2, a, th);
    }

    @Override // defpackage.xa20
    public final void b(leo leoVar) {
        boolean z = leoVar instanceof wtf0;
        i3y i3yVar = this.b;
        if (!z) {
            qig0 qig0Var = (qig0) i3yVar.getValue();
            String name = leoVar.getName();
            String a = leoVar.a();
            ac20 ac20Var = qig0Var.a;
            String a2 = qig0.a(name);
            if (a == null) {
                a = "";
            }
            ((q) ac20Var).g(a2, a);
            return;
        }
        wtf0 wtf0Var = (wtf0) leoVar;
        Map map = wtf0Var.b;
        qig0 qig0Var2 = (qig0) i3yVar.getValue();
        String str = wtf0Var.a;
        qig0Var2.getClass();
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (str2 != null) {
                mapBuilder.put(str2, value);
            }
        }
        MapBuilder j = mapBuilder.j();
        ((q) qig0Var2.a).h(qig0.a(str), j);
    }

    @Override // defpackage.xa20
    public final void c(String str, String str2) {
        ((qig0) this.b.getValue()).getClass();
    }

    @Override // defpackage.xa20
    public final void d(List list) {
        ((qig0) this.c.getValue()).getClass();
    }

    @Override // defpackage.xa20
    public final void e(wtf0 wtf0Var) {
        qig0 qig0Var = (qig0) this.b.getValue();
        String str = wtf0Var.a;
        String a = wtf0Var.a();
        ac20 ac20Var = qig0Var.a;
        String a2 = qig0.a(str);
        if (a == null) {
            a = "";
        }
        ((q) ac20Var).e(a2, a, null);
    }
}
