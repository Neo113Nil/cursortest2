package com.yandex.varioqub.config;

import R1.d;
import android.content.Context;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.config.impl.A;
import com.yandex.varioqub.config.impl.B;
import com.yandex.varioqub.config.model.ConfigValue;
import h1.C0237g;
import h1.InterfaceC0233c;
import java.util.Map;
import java.util.Set;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class Varioqub {
    public static final Varioqub INSTANCE = new Varioqub();

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC0233c f2724a = d.y(A.f2738a);

    private Varioqub() {
    }

    public static final void activateConfig(InterfaceC1046a interfaceC1046a) {
        getInstance().activateConfig(interfaceC1046a);
    }

    public static /* synthetic */ void activateConfig$default(InterfaceC1046a interfaceC1046a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC1046a = null;
        }
        activateConfig(interfaceC1046a);
    }

    public static final void clearClientFeatures() {
        getInstance().clearClientFeatures();
    }

    public static final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        getInstance().fetchConfig(onFetchCompleteListener);
    }

    public static final Set<String> getAllKeys() {
        return getInstance().getAllKeys();
    }

    public static final boolean getBoolean(String str, boolean z2) {
        return getInstance().getBoolean(str, z2);
    }

    public static /* synthetic */ boolean getBoolean$default(String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return getBoolean(str, z2);
    }

    public static final double getDouble(String str, double d2) {
        return getInstance().getDouble(str, d2);
    }

    public static /* synthetic */ double getDouble$default(String str, double d2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d2 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        return getDouble(str, d2);
    }

    public static final String getId() {
        return getInstance().getId();
    }

    public static final VarioqubApi getInstance() {
        INSTANCE.getClass();
        return (B) ((C0237g) f2724a).a();
    }

    public static final long getLong(String str, long j2) {
        return getInstance().getLong(str, j2);
    }

    public static /* synthetic */ long getLong$default(String str, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return getLong(str, j2);
    }

    public static final String getString(String str, String str2) {
        return getInstance().getString(str, str2);
    }

    public static /* synthetic */ String getString$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        return getString(str, str2);
    }

    public static final ConfigValue getValue(String str) {
        return getInstance().getValue(str);
    }

    public static final void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context) {
        getInstance().init(varioqubSettings, varioqubConfigAdapter, context);
    }

    public static final void putClientFeature(String str, String str2) {
        getInstance().putClientFeature(str, str2);
    }

    public static final void setDefaults(Map<String, ? extends Object> map) {
        getInstance().setDefaults(map);
    }

    public static /* synthetic */ void setDefaults$default(int i2, InterfaceC1046a interfaceC1046a, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC1046a = null;
        }
        setDefaults(i2, interfaceC1046a);
    }

    public static final void setDefaults(int i2, InterfaceC1046a interfaceC1046a) {
        getInstance().setDefaults(i2, interfaceC1046a);
    }
}
