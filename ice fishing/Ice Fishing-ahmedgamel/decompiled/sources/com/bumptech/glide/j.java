package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final j f23401n;

    /* renamed from: u, reason: collision with root package name */
    public static final j f23402u;

    /* renamed from: v, reason: collision with root package name */
    public static final j f23403v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f23404w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j[] f23405x;

    static {
        j jVar = new j("IMMEDIATE", 0);
        f23401n = jVar;
        j jVar2 = new j("HIGH", 1);
        f23402u = jVar2;
        j jVar3 = new j("NORMAL", 2);
        f23403v = jVar3;
        j jVar4 = new j("LOW", 3);
        f23404w = jVar4;
        f23405x = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f23405x.clone();
    }
}
