package com.yandex.passport.internal.push;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    public static final t a;
    public static final a b;
    public static final a c;
    public static final /* synthetic */ a[] d;

    static {
        a aVar = new a("JOB_INTENT_SERVICE", 0);
        b = aVar;
        a aVar2 = new a("COROUTINE", 1);
        c = aVar2;
        d = new a[]{aVar, aVar2};
        a = new t();
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
