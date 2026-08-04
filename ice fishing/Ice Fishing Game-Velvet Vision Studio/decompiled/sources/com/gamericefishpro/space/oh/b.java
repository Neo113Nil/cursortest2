package com.gamericefishpro.space.oh;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b d;
    public static final /* synthetic */ b[] e;

    static {
        b bVar = new b("WARNING", 0);
        d = bVar;
        b[] bVarArr = {bVar, new b("ERROR", 1), new b("HIDDEN", 2)};
        e = bVarArr;
        a4.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
