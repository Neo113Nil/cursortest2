package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.cC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3040cC implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC3040cC f30216n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC3040cC[] f30217u;

    static {
        EnumC3040cC enumC3040cC = new EnumC3040cC("INSTANCE", 0);
        f30216n = enumC3040cC;
        f30217u = new EnumC3040cC[]{enumC3040cC};
    }

    public static EnumC3040cC[] values() {
        return (EnumC3040cC[]) f30217u.clone();
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
        AbstractC2792Sd.I("no calls to next() since the last call to remove()", false);
    }
}
