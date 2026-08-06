package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.c;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.f;
import com.yandex.varioqub.appmetricaadapter.impl.i;
import com.yandex.varioqub.appmetricaadapter.impl.j;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import i1.AbstractC0252i;
import i1.t;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2712a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2713b;

    /* renamed from: c, reason: collision with root package name */
    public String f2714c;

    /* renamed from: d, reason: collision with root package name */
    public Set f2715d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2716e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i2) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public AppMetricaAdapter(Context context) {
        Class<?> cls;
        d iVar;
        this.f2712a = context;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("io.appmetrica.analytics.AppMetrica", false, j.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            iVar = new c();
        } else {
            try {
                cls2 = Class.forName("com.yandex.metrica.YandexMetrica", false, j.class.getClassLoader());
            } catch (Throwable unused2) {
            }
            iVar = cls2 != null ? new i() : new f();
        }
        this.f2713b = iVar;
        this.f2714c = "";
        this.f2715d = t.f3418a;
        this.f2716e = "AppMetricaAdapter";
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public final String getAdapterName() {
        return this.f2716e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void reportConfigChanged(ConfigData configData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        this.f2713b.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2713b.a(this.f2712a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2713b.c(this.f2712a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setExperiments(String str) {
        this.f2714c = str;
        Objects.toString(this.f2715d);
        k kVar = new k();
        kVar.f2721o = this.f2714c;
        kVar.f2722p = AbstractC0252i.S(this.f2715d);
        this.f2713b.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setTriggeredTestIds(Set set) {
        Objects.toString(set);
        Set V2 = AbstractC0252i.V(set);
        this.f2715d = V2;
        Objects.toString(V2);
        k kVar = new k();
        kVar.f2721o = this.f2714c;
        kVar.f2722p = AbstractC0252i.S(this.f2715d);
        this.f2713b.a(MessageNano.toByteArray(kVar));
    }
}
