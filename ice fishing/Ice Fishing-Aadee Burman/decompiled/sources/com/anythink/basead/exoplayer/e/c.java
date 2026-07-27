package com.anythink.basead.exoplayer.e;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final Constructor<? extends e> f7163a;

    /* renamed from: b, reason: collision with root package name */
    private int f7164b;

    /* renamed from: c, reason: collision with root package name */
    private int f7165c;

    static {
        Constructor<? extends e> constructor;
        try {
            constructor = Class.forName("com.anythink.expressad.exoplayer.ext.flac.FlacExtractor").asSubclass(e.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e9) {
            throw new RuntimeException("Error instantiating FLAC extension", e9);
        }
        f7163a = constructor;
    }

    private synchronized c a(int i) {
        this.f7164b = i;
        return this;
    }

    private synchronized c b(int i) {
        this.f7165c = i;
        return this;
    }

    @Override // com.anythink.basead.exoplayer.e.h
    public final synchronized e[] a() {
        e[] eVarArr;
        Constructor<? extends e> constructor = f7163a;
        eVarArr = new e[constructor == null ? 2 : 3];
        eVarArr[0] = new com.anythink.basead.exoplayer.e.a.e(this.f7165c);
        eVarArr[1] = new com.anythink.basead.exoplayer.e.a.g(this.f7164b);
        if (constructor != null) {
            try {
                eVarArr[2] = constructor.newInstance(new Object[0]);
            } catch (Exception e9) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e9);
            }
        }
        return eVarArr;
    }
}
