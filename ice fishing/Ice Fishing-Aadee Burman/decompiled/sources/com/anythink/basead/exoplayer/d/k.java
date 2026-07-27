package com.anythink.basead.exoplayer.d;

import android.media.MediaCrypto;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCrypto f6872a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6873b;

    private k(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public final MediaCrypto a() {
        return this.f6872a;
    }

    public k(MediaCrypto mediaCrypto, boolean z3) {
        this.f6872a = (MediaCrypto) com.anythink.basead.exoplayer.k.a.a(mediaCrypto);
        this.f6873b = z3;
    }

    @Override // com.anythink.basead.exoplayer.d.i
    public final boolean a(String str) {
        return !this.f6873b && this.f6872a.requiresSecureDecoderComponent(str);
    }
}
