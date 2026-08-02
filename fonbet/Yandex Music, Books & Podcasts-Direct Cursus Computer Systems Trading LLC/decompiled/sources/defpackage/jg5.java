package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jg5 {
    public static final jg5 a;
    public static final HashMap b;
    public static final /* synthetic */ jg5[] c;

    /* JADX INFO: Fake field, exist only in values array */
    jg5 EF0;

    static {
        jg5 jg5Var = new jg5("X86_32", 0);
        jg5 jg5Var2 = new jg5("X86_64", 1);
        jg5 jg5Var3 = new jg5("ARM_UNKNOWN", 2);
        jg5 jg5Var4 = new jg5("PPC", 3);
        jg5 jg5Var5 = new jg5("PPC64", 4);
        jg5 jg5Var6 = new jg5("ARMV6", 5);
        jg5 jg5Var7 = new jg5("ARMV7", 6);
        jg5 jg5Var8 = new jg5("UNKNOWN", 7);
        a = jg5Var8;
        jg5 jg5Var9 = new jg5("ARMV7S", 8);
        jg5 jg5Var10 = new jg5("ARM64", 9);
        c = new jg5[]{jg5Var, jg5Var2, jg5Var3, jg5Var4, jg5Var5, jg5Var6, jg5Var7, jg5Var8, jg5Var9, jg5Var10};
        HashMap hashMap = new HashMap(4);
        b = hashMap;
        hashMap.put("armeabi-v7a", jg5Var7);
        hashMap.put("armeabi", jg5Var6);
        hashMap.put("arm64-v8a", jg5Var10);
        hashMap.put("x86", jg5Var);
    }

    public static jg5 valueOf(String str) {
        return (jg5) Enum.valueOf(jg5.class, str);
    }

    public static jg5[] values() {
        return (jg5[]) c.clone();
    }
}
