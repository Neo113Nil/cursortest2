package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.cC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3017cC implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC3017cC f29433n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC3017cC[] f29434u;

    static {
        EnumC3017cC enumC3017cC = new EnumC3017cC("INSTANCE", 0);
        f29433n = enumC3017cC;
        f29434u = new EnumC3017cC[]{enumC3017cC};
    }

    public static EnumC3017cC[] values() {
        return (EnumC3017cC[]) f29434u.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2772Sd.I("no calls to next() since the last call to remove()", false);
    }
}
