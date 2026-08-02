package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0516ob implements ProtobufConverter {
    public final Jg a;

    public C0516ob() {
        this(new Vo());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0164c5 toModel(@NonNull C0732vp c0732vp) {
        C0106a5 c0106a5 = new C0106a5();
        c0106a5.d = c0732vp.d;
        c0106a5.c = c0732vp.c;
        c0106a5.b = c0732vp.b;
        c0106a5.a = c0732vp.a;
        c0106a5.e = c0732vp.e;
        c0106a5.f = this.a.a(c0732vp.f);
        return new C0164c5(c0106a5);
    }

    public C0516ob(Vo vo) {
        this.a = vo;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0732vp fromModel(@NonNull C0164c5 c0164c5) {
        C0732vp c0732vp = new C0732vp();
        c0732vp.b = c0164c5.b;
        c0732vp.a = c0164c5.a;
        c0732vp.c = c0164c5.c;
        c0732vp.d = c0164c5.d;
        c0732vp.e = c0164c5.e;
        c0732vp.f = this.a.a(c0164c5.f);
        return c0732vp;
    }
}
