package com.anythink.basead.exoplayer.d;

import android.media.MediaCrypto;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCrypto f7658a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7659b;

    private k(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public final MediaCrypto a() {
        return this.f7658a;
    }

    public k(MediaCrypto mediaCrypto, boolean z6) {
        this.f7658a = (MediaCrypto) com.anythink.basead.exoplayer.k.a.a(mediaCrypto);
        this.f7659b = z6;
    }

    @Override // com.anythink.basead.exoplayer.d.i
    public final boolean a(String str) {
        return !this.f7659b && this.f7658a.requiresSecureDecoderComponent(str);
    }
}
