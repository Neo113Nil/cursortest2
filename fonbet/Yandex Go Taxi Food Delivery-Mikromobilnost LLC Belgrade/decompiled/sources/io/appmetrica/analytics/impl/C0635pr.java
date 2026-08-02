package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.pr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0635pr implements ProtobufConverter {
    public final C0288dr a;
    public final C0233c0 b;
    public final C0240c7 c;
    public final Wo d;
    public final C0769uh e;
    public final C0798vh f;

    public C0635pr() {
        this(new C0288dr(), new C0233c0(new Vq()), new C0240c7(), new Wo(), new C0769uh(), new C0798vh());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q6 fromModel(C0606or c0606or) {
        Q6 q6 = new Q6();
        C0317er c0317er = c0606or.a;
        if (c0317er != null) {
            q6.a = this.a.fromModel(c0317er);
        }
        C0204b0 c0204b0 = c0606or.b;
        if (c0204b0 != null) {
            q6.b = this.b.fromModel(c0204b0);
        }
        List<Yo> list = c0606or.c;
        if (list != null) {
            q6.e = this.d.fromModel(list);
        }
        String str = c0606or.g;
        if (str != null) {
            q6.c = str;
        }
        q6.d = this.c.a(c0606or.h);
        if (!StringUtils.isNullOrEmpty(c0606or.d)) {
            q6.h = this.e.fromModel(c0606or.d);
        }
        if (!StringUtils.isNullOrEmpty(c0606or.e)) {
            q6.i = c0606or.e.getBytes();
        }
        if (!Or.a(c0606or.f)) {
            q6.j = this.f.fromModel(c0606or.f);
        }
        return q6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0635pr(C0288dr c0288dr, C0233c0 c0233c0, C0240c7 c0240c7, Wo wo, C0769uh c0769uh, C0798vh c0798vh) {
        this.b = c0233c0;
        this.a = c0288dr;
        this.c = c0240c7;
        this.d = wo;
        this.e = c0769uh;
        this.f = c0798vh;
    }

    public final C0606or a(Q6 q6) {
        throw new UnsupportedOperationException();
    }
}
