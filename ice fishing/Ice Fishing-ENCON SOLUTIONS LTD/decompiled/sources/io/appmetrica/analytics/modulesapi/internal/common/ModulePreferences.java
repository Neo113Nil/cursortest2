package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public interface ModulePreferences {

    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(ModulePreferences modulePreferences, String str, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return modulePreferences.getInt(str, i2);
        }

        public static /* synthetic */ long getLong$default(ModulePreferences modulePreferences, String str, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i2 & 2) != 0) {
                j2 = 0;
            }
            return modulePreferences.getLong(str, j2);
        }

        public static /* synthetic */ String getString$default(ModulePreferences modulePreferences, String str, String str2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            return modulePreferences.getString(str, str2);
        }
    }

    boolean getBoolean(String str, boolean z2);

    int getInt(String str, int i2);

    long getLong(String str, long j2);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z2);

    void putInt(String str, int i2);

    void putLong(String str, long j2);

    void putString(String str, String str2);
}
