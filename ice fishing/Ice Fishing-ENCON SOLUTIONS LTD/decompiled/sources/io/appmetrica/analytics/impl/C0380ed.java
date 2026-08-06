package io.appmetrica.analytics.impl;

import i1.AbstractC0251h;
import i1.AbstractC0252i;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import u0.AbstractC1050a;
import w1.C1061b;
import w1.C1062c;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380ed implements Tj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0802ul f5929a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5930b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f5931c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5932d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5933e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5934f;

    public C0380ed(InterfaceC0802ul interfaceC0802ul, String str, SystemTimeProvider systemTimeProvider, List<C0303bd> list) {
        this.f5929a = interfaceC0802ul;
        this.f5930b = str;
        this.f5931c = systemTimeProvider;
        this.f5932d = list;
        this.f5933e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f5934f = TimeUnit.DAYS.toMillis(1L);
    }

    public final Sj a() {
        List L2;
        C0768td c0768td;
        C0303bd c0303bd;
        if (this.f5932d.isEmpty()) {
            return null;
        }
        List list = this.f5932d;
        C0355dd c0355dd = new C0355dd();
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.size() <= 1) {
            L2 = AbstractC0252i.R(list);
        } else {
            Object[] array = list.toArray(new Object[0]);
            kotlin.jvm.internal.i.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, c0355dd);
            }
            L2 = AbstractC0251h.L(array);
        }
        String c2 = ((AbstractC0898yd) this.f5929a).c(this.f5933e, (String) null);
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(c2);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                C1062c E2 = AbstractC1050a.E(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(i1.k.E(E2));
                Iterator it = E2.iterator();
                while (((C1061b) it).f8521c) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((C1061b) it).a());
                    try {
                        c0303bd = new C0303bd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                    } catch (Throwable unused) {
                        c0303bd = new C0303bd("", false);
                    }
                    arrayList.add(c0303bd);
                }
                c0768td = new C0768td(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                c0768td = new C0768td(i1.r.f3416a, 0L);
            }
        } else {
            c0768td = null;
        }
        long currentTimeMillis = this.f5931c.currentTimeMillis();
        if (c0768td != null && currentTimeMillis - c0768td.f6946b <= this.f5934f && L2.equals(c0768td.f6945a)) {
            return null;
        }
        C0768td c0768td2 = new C0768td(L2, currentTimeMillis);
        InterfaceC0802ul interfaceC0802ul = this.f5929a;
        AbstractC0898yd abstractC0898yd = (AbstractC0898yd) interfaceC0802ul;
        return new Sj(C1.a.k(new StringBuilder(), this.f5930b, "_status"), c0768td2.a());
    }

    public /* synthetic */ C0380ed(InterfaceC0802ul interfaceC0802ul, String str, SystemTimeProvider systemTimeProvider, List list, int i2, kotlin.jvm.internal.e eVar) {
        this(interfaceC0802ul, str, (i2 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
