package com.anythink.core.common.m.a.a;

import android.text.TextUtils;
import com.anythink.core.common.m.a.i;
import com.anythink.core.common.m.a.j;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.x;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.v.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends com.anythink.core.common.m.a.a {

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.common.n.b.e f14592b;

    public e(com.anythink.core.common.m.a.f fVar) {
        super(fVar);
    }

    private static void b() {
    }

    private static /* synthetic */ void c() {
    }

    private static ad b(i iVar) {
        u.a aVar = new u.a();
        Map<String, String> map = iVar.f14623e;
        if (map == null || map.isEmpty()) {
            String j9 = m.j();
            if (!TextUtils.isEmpty(j9)) {
                aVar.a("User-Agent", j9);
            }
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
            if (!map.containsKey("User-Agent")) {
                String j10 = m.j();
                if (!TextUtils.isEmpty(j10)) {
                    aVar.a("User-Agent", j10);
                }
            }
        }
        if (Objects.equals(iVar.f14620b, "GET")) {
            return new ad.a().a(iVar.f14619a).a().a(aVar.a()).b();
        }
        return new ad.a().a(iVar.f14619a).a(iVar.f14620b, ae.a(x.b(iVar.f14622d), iVar.f14621c)).a(aVar.a()).b();
    }

    @Override // com.anythink.core.common.m.a.b
    public final j a(i iVar) {
        try {
            com.anythink.core.common.n.b.e a9 = a(this.f14574a, iVar).a(b(iVar));
            this.f14592b = a9;
            return b(iVar, a9.b(), null);
        } catch (Throwable th) {
            return b(iVar, null, th);
        }
    }

    @Override // com.anythink.core.common.m.a.b
    public final void a(final i iVar, final com.anythink.core.common.m.a.c cVar) {
        try {
            com.anythink.core.common.n.b.e a9 = a(this.f14574a, iVar).a(b(iVar));
            this.f14592b = a9;
            a9.a(new com.anythink.core.common.n.b.f() { // from class: com.anythink.core.common.m.a.a.e.1
                @Override // com.anythink.core.common.n.b.f
                public final void a(IOException iOException) {
                    e.b(iVar, null, iOException);
                }

                @Override // com.anythink.core.common.n.b.f
                public final void a(af afVar) {
                    e.b(iVar, afVar, null);
                }
            });
        } catch (Throwable th) {
            b(iVar, null, th);
        }
    }

    @Override // com.anythink.core.common.m.a.b
    public final void a() {
        try {
            com.anythink.core.common.n.b.e eVar = this.f14592b;
            if (eVar == null || eVar.e()) {
                return;
            }
            this.f14592b.c();
        } catch (Throwable unused) {
        }
    }

    private static z a(com.anythink.core.common.m.a.f fVar, i iVar) {
        return d.a().a(fVar, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j b(i iVar, af afVar, Throwable th) {
        j.a a9 = new j.a().a(iVar).a(th);
        if (afVar != null) {
            try {
                a9.a(afVar.c());
                a9.a(afVar.d());
                HashMap hashMap = new HashMap();
                u f6 = afVar.f();
                for (int i = 0; i < f6.a(); i++) {
                    String a10 = f6.a(i);
                    String b9 = f6.b(i);
                    List list = (List) hashMap.get(a10);
                    if (list != null) {
                        if (!list.contains(b9)) {
                            list.add(b9);
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(b9);
                        hashMap.put(a10, arrayList);
                    }
                }
                a9.a(hashMap);
                ag g9 = afVar.g();
                if (g9 != null) {
                    a9.a(new f(g9));
                }
            } catch (Throwable th2) {
                a9.a(th2);
            }
        }
        return a9.a();
    }
}
