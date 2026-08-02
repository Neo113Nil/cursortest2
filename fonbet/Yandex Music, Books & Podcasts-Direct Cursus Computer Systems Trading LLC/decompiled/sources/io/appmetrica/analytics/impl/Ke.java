package io.appmetrica.analytics.impl;

import defpackage.c5b;
import defpackage.v75;
import defpackage.yhn;
import defpackage.ype;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Ke implements Rm {
    public final InterfaceC0789xo a;
    public final String b;
    public final SystemTimeProvider c;
    public final List d;
    public final String e;
    public final long f;

    public Ke(@NotNull InterfaceC0789xo interfaceC0789xo, @NotNull String str, @NotNull SystemTimeProvider systemTimeProvider, @NotNull List<He> list) {
        this.a = interfaceC0789xo;
        this.b = str;
        this.c = systemTimeProvider;
        this.d = list;
        this.e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f = 86400000L;
    }

    public final Qm a() {
        Ze ze;
        He he;
        if (!this.d.isEmpty()) {
            List o0 = CollectionsKt.o0(this.d, new Je());
            String c = ((Tf) this.a).c(this.e, (String) null);
            if (c != null) {
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                    IntRange m = yhn.m(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(v75.o(m, 10));
                    ype it = m.iterator();
                    while (it.c) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(it.nextInt());
                        try {
                            he = new He(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                        } catch (Throwable unused) {
                            he = new He("", false);
                        }
                        arrayList.add(he);
                    }
                    ze = new Ze(arrayList, jSONObject.getLong("lastSendTime"));
                } catch (Throwable unused2) {
                    ze = new Ze(c5b.a, 0L);
                }
            } else {
                ze = null;
            }
            long currentTimeMillis = this.c.currentTimeMillis();
            if (ze == null || currentTimeMillis - ze.b > this.f || !Intrinsics.d(o0, ze.a)) {
                Ze ze2 = new Ze(o0, currentTimeMillis);
                InterfaceC0789xo interfaceC0789xo = this.a;
                Tf tf = (Tf) interfaceC0789xo;
                return new Qm(AbstractC0155bp.a(new StringBuilder(), this.b, "_status"), ze2.a());
            }
        }
        return null;
    }

    public /* synthetic */ Ke(InterfaceC0789xo interfaceC0789xo, String str, SystemTimeProvider systemTimeProvider, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0789xo, str, (i & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
