package com.gamericefishpro.space.gd;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Boolean getBool$default(b bVar, String str, String str2, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBool");
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return bVar.getBool(str, str2, bool);
    }

    public static /* synthetic */ Integer getInt$default(b bVar, String str, String str2, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return bVar.getInt(str, str2, num);
    }

    public static /* synthetic */ Long getLong$default(b bVar, String str, String str2, Long l, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return bVar.getLong(str, str2, l);
    }

    public static /* synthetic */ String getString$default(b bVar, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return bVar.getString(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(b bVar, String str, String str2, Set set, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringSet");
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return bVar.getStringSet(str, str2, set);
    }
}
