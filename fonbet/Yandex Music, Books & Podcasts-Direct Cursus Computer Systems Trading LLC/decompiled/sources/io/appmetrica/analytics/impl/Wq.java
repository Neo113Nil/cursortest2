package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes5.dex */
public final class Wq implements ProtobufConverter {
    public final Kq a;
    public final C0101a0 b;
    public final Z6 c;
    public final Eo d;
    public final C0233eh e;
    public final C0262fh f;

    public Wq() {
        this(new Kq(), new C0101a0(new Cq()), new Z6(), new Eo(), new C0233eh(), new C0262fh());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N6 fromModel(@NonNull Vq vq) {
        N6 n6 = new N6();
        Lq lq = vq.a;
        if (lq != null) {
            n6.a = this.a.fromModel(lq);
        }
        Z z = vq.b;
        if (z != null) {
            n6.b = this.b.fromModel(z);
        }
        List<Go> list = vq.c;
        if (list != null) {
            n6.e = this.d.fromModel(list);
        }
        String str = vq.g;
        if (str != null) {
            n6.c = str;
        }
        n6.d = this.c.a(vq.h);
        if (!TextUtils.isEmpty(vq.d)) {
            n6.h = this.e.fromModel(vq.d);
        }
        if (!TextUtils.isEmpty(vq.e)) {
            n6.i = vq.e.getBytes();
        }
        if (!AbstractC0734vr.a(vq.f)) {
            n6.j = this.f.fromModel(vq.f);
        }
        return n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Wq(Kq kq, C0101a0 c0101a0, Z6 z6, Eo eo, C0233eh c0233eh, C0262fh c0262fh) {
        this.b = c0101a0;
        this.a = kq;
        this.c = z6;
        this.d = eo;
        this.e = c0233eh;
        this.f = c0262fh;
    }

    @NonNull
    public final Vq a(@NonNull N6 n6) {
        throw new UnsupportedOperationException();
    }
}
