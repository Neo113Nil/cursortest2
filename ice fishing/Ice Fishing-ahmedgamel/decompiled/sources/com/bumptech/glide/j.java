package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final j f24188n;

    /* renamed from: u, reason: collision with root package name */
    public static final j f24189u;

    /* renamed from: v, reason: collision with root package name */
    public static final j f24190v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f24191w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j[] f24192x;

    static {
        j jVar = new j("IMMEDIATE", 0);
        f24188n = jVar;
        j jVar2 = new j("HIGH", 1);
        f24189u = jVar2;
        j jVar3 = new j("NORMAL", 2);
        f24190v = jVar3;
        j jVar4 = new j("LOW", 3);
        f24191w = jVar4;
        f24192x = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f24192x.clone();
    }
}
