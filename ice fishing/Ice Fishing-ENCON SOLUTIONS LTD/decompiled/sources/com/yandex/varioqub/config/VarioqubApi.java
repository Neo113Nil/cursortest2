package com.yandex.varioqub.config;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Map;
import java.util.Set;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public interface VarioqubApi {

    public static final class DefaultImpls {
        public static /* synthetic */ void activateConfig$default(VarioqubApi varioqubApi, InterfaceC1046a interfaceC1046a, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activateConfig");
            }
            if ((i2 & 1) != 0) {
                interfaceC1046a = null;
            }
            varioqubApi.activateConfig(interfaceC1046a);
        }

        public static /* synthetic */ boolean getBoolean$default(VarioqubApi varioqubApi, String str, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            return varioqubApi.getBoolean(str, z2);
        }

        public static /* synthetic */ double getDouble$default(VarioqubApi varioqubApi, String str, double d2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDouble");
            }
            if ((i2 & 2) != 0) {
                d2 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            }
            return varioqubApi.getDouble(str, d2);
        }

        public static /* synthetic */ long getLong$default(VarioqubApi varioqubApi, String str, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i2 & 2) != 0) {
                j2 = 0;
            }
            return varioqubApi.getLong(str, j2);
        }

        public static /* synthetic */ String getString$default(VarioqubApi varioqubApi, String str, String str2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i2 & 2) != 0) {
                str2 = "";
            }
            return varioqubApi.getString(str, str2);
        }

        public static /* synthetic */ void setDefaults$default(VarioqubApi varioqubApi, int i2, InterfaceC1046a interfaceC1046a, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDefaults");
            }
            if ((i3 & 2) != 0) {
                interfaceC1046a = null;
            }
            varioqubApi.setDefaults(i2, interfaceC1046a);
        }
    }

    void activateConfig(InterfaceC1046a interfaceC1046a);

    void clearClientFeatures();

    void fetchConfig(OnFetchCompleteListener onFetchCompleteListener);

    Set<String> getAllKeys();

    boolean getBoolean(String str, boolean z2);

    double getDouble(String str, double d2);

    String getId();

    long getLong(String str, long j2);

    String getString(String str, String str2);

    ConfigValue getValue(String str);

    void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context);

    void putClientFeature(String str, String str2);

    void setDefaults(int i2, InterfaceC1046a interfaceC1046a);

    void setDefaults(Map<String, ? extends Object> map);
}
