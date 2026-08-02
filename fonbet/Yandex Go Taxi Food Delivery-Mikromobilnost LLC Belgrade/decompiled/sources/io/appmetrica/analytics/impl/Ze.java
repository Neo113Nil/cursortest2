package io.appmetrica.analytics.impl;

import defpackage.c6w;
import defpackage.d6w;
import defpackage.tcc;
import defpackage.y6i0;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Ze implements InterfaceC0400hn {
    public final So a;
    public final String b;
    public final SystemTimeProvider c;
    public final List d;
    public final String e;
    public final long f;

    public Ze(So so, String str, SystemTimeProvider systemTimeProvider, List<We> list) {
        this.a = so;
        this.b = str;
        this.c = systemTimeProvider;
        this.d = list;
        this.e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f = 86400000L;
    }

    public final C0371gn a() {
        C0594of c0594of;
        We we;
        if (!this.d.isEmpty()) {
            List x0 = kotlin.collections.a.x0(this.d, new Ye());
            String a = ((AbstractC0421ig) this.a).a(this.e, (String) null);
            if (a != null) {
                try {
                    JSONObject jSONObject = new JSONObject(a);
                    JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                    d6w n = y6i0.n(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(tcc.n(n, 10));
                    c6w it = n.iterator();
                    while (it.c) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(it.nextInt());
                        try {
                            we = new We(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                        } catch (Throwable unused) {
                            we = new We("", false);
                        }
                        arrayList.add(we);
                    }
                    c0594of = new C0594of(arrayList, jSONObject.getLong("lastSendTime"));
                } catch (Throwable unused2) {
                    c0594of = new C0594of(EmptyList.a, 0L);
                }
            } else {
                c0594of = null;
            }
            long currentTimeMillis = this.c.currentTimeMillis();
            if (c0594of == null || currentTimeMillis - c0594of.b > this.f || !x0.equals(c0594of.a)) {
                C0594of c0594of2 = new C0594of(x0, currentTimeMillis);
                So so = this.a;
                AbstractC0421ig abstractC0421ig = (AbstractC0421ig) so;
                abstractC0421ig.d(abstractC0421ig.g(this.e), c0594of2.a());
                return new C0371gn(AbstractC0748tp.a(new StringBuilder(), this.b, "_status"), c0594of2.a());
            }
        }
        return null;
    }

    public /* synthetic */ Ze(So so, String str, SystemTimeProvider systemTimeProvider, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(so, str, (i & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
