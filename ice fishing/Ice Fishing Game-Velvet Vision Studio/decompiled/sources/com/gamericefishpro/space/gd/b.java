package com.gamericefishpro.space.gd;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    Boolean getBool(String str, String str2, Boolean bool);

    Integer getInt(String str, String str2, Integer num);

    Long getLong(String str, String str2, Long l);

    String getString(String str, String str2, String str3);

    Set<String> getStringSet(String str, String str2, Set<String> set);

    void saveBool(String str, String str2, Boolean bool);

    void saveInt(String str, String str2, Integer num);

    void saveLong(String str, String str2, Long l);

    void saveString(String str, String str2, String str3);

    void saveStringSet(String str, String str2, Set<String> set);
}
