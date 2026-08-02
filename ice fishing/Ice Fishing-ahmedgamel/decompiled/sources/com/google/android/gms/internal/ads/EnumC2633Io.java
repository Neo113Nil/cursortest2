package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.Io, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2633Io {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC2633Io f26341n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC2633Io f26342u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC2633Io f26343v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC2633Io[] f26344w;

    static {
        EnumC2633Io enumC2633Io = new EnumC2633Io("AD_REQUESTED", 0);
        f26341n = enumC2633Io;
        EnumC2633Io enumC2633Io2 = new EnumC2633Io("AD_LOADED", 1);
        f26342u = enumC2633Io2;
        EnumC2633Io enumC2633Io3 = new EnumC2633Io("AD_LOAD_FAILED", 2);
        f26343v = enumC2633Io3;
        f26344w = new EnumC2633Io[]{enumC2633Io, enumC2633Io2, enumC2633Io3};
    }

    public static EnumC2633Io[] values() {
        return (EnumC2633Io[]) f26344w.clone();
    }
}
