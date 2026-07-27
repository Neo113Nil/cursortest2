package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.fC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3190fC implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC3190fC f30631n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC3190fC[] f30632u;

    static {
        EnumC3190fC enumC3190fC = new EnumC3190fC("INSTANCE", 0);
        f30631n = enumC3190fC;
        f30632u = new EnumC3190fC[]{enumC3190fC};
    }

    public static EnumC3190fC[] values() {
        return (EnumC3190fC[]) f30632u.clone();
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
        PA.U("no calls to next() since the last call to remove()", false);
    }
}
