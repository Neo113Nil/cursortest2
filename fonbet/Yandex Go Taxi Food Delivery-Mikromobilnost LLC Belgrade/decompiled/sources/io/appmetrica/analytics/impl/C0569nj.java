package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.nj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0569nj implements ProtobufConverter {
    public final C0288dr a;
    public final C0233c0 b;
    public final C0240c7 c;
    public final Wo d;
    public final C0769uh e;
    public final C0798vh f;

    public C0569nj() {
        this(new C0288dr(), new C0233c0(new Vq()), new C0240c7(), new Wo(), new C0769uh(), new C0798vh());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S6 fromModel(C0540mj c0540mj) {
        S6 s6 = new S6();
        s6.f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c0540mj.a, s6.f));
        C0606or c0606or = c0540mj.b;
        if (c0606or != null) {
            C0317er c0317er = c0606or.a;
            if (c0317er != null) {
                s6.a = this.a.fromModel(c0317er);
            }
            C0204b0 c0204b0 = c0606or.b;
            if (c0204b0 != null) {
                s6.b = this.b.fromModel(c0204b0);
            }
            List<Yo> list = c0606or.c;
            if (list != null) {
                s6.e = this.d.fromModel(list);
            }
            s6.c = (String) WrapUtils.getOrDefault(c0606or.g, s6.c);
            s6.d = this.c.a(c0606or.h);
            if (!TextUtils.isEmpty(c0606or.d)) {
                s6.i = this.e.fromModel(c0606or.d);
            }
            if (!TextUtils.isEmpty(c0606or.e)) {
                s6.j = c0606or.e.getBytes();
            }
            if (!Or.a(c0606or.f)) {
                s6.k = this.f.fromModel(c0606or.f);
            }
        }
        return s6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0569nj(C0288dr c0288dr, C0233c0 c0233c0, C0240c7 c0240c7, Wo wo, C0769uh c0769uh, C0798vh c0798vh) {
        this.a = c0288dr;
        this.b = c0233c0;
        this.c = c0240c7;
        this.d = wo;
        this.e = c0769uh;
        this.f = c0798vh;
    }

    public final C0540mj a(S6 s6) {
        throw new UnsupportedOperationException();
    }
}
