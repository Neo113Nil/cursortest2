package defpackage;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class y6w implements rzm {
    public final /* synthetic */ int a;
    public final z6u b;

    public /* synthetic */ y6w(z6u z6uVar, int i) {
        this.a = i;
        this.b = z6uVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                vx6 vx6Var = new vx6((Context) this.b.b);
                js3 js3Var = new js3();
                oxa oxaVar = new oxa(vx6Var, js3Var, vx6Var);
                n7b n7bVar = new n7b(new ozw(25, (byte) 0));
                String a = js3Var.a(u75.j((String) vx6Var.b, "psdk_flags"));
                js3Var.a(u75.j(a, "feature_flags.json"));
                String a2 = js3Var.a(u75.j(a, "pending_feature_flags.json"));
                le3 le3Var = new le3();
                le3Var.a = a;
                le3Var.b = a2;
                return new oac(oxaVar, le3Var, n7bVar);
            case 1:
                vx6 vx6Var2 = new vx6((Context) this.b.b);
                js3 js3Var2 = new js3();
                oxa oxaVar2 = new oxa(vx6Var2, js3Var2, vx6Var2);
                n7b n7bVar2 = new n7b(new ozw(25, (byte) 0));
                String a3 = js3Var2.a(u75.j((String) vx6Var2.b, "xmail_flags"));
                return new qac(oxaVar2, new lm7(a3, js3Var2.a(u75.j(a3, "activated_flags.json")), js3Var2.a(u75.j(a3, "pending_flags.json"))), n7bVar2);
            case 2:
                return new nzi(false, t7g.o(((ugk) this.b.c) == ugk.TESTING), c5b.a);
            case 3:
                return new pq7(new hxo(26, this.b));
            default:
                Context context = (Context) this.b.b;
                jyr b = btf.b(wjp.A0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(h46.a.b, new elr(((emf) b.getValue()).a));
                String str = h46.d.b;
                String str2 = context.getApplicationInfo().packageName;
                str2.getClass();
                linkedHashMap.put(str, new elr(str2));
                linkedHashMap.put(h46.b.b, new w0u(new yx3("6.26.1", false)));
                linkedHashMap.put(h46.c.b, new jqe(1));
                String str3 = h46.e.b;
                String uuid = AppMetrica.getUuid(context);
                if (uuid == null) {
                    uuid = "";
                }
                linkedHashMap.put(str3, new jqe(uuid.hashCode() % 100));
                String str4 = h46.f.b;
                String uuid2 = AppMetrica.getUuid(context);
                linkedHashMap.put(str4, new elr(uuid2 != null ? uuid2 : ""));
                return linkedHashMap;
        }
    }
}
