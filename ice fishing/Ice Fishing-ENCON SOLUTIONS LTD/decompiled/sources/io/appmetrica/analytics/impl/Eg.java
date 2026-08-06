package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Eg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fn f4355a;

    /* renamed from: b, reason: collision with root package name */
    public final W f4356b;

    /* renamed from: c, reason: collision with root package name */
    public final C0451h6 f4357c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f4358d;

    /* renamed from: e, reason: collision with root package name */
    public final He f4359e;

    /* renamed from: f, reason: collision with root package name */
    public final Ie f4360f;

    public Eg() {
        this(new Fn(), new W(new C0882xn()), new C0451h6(), new Bl(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 fromModel(Dg dg) {
        X5 x5 = new X5();
        x5.f5377f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(dg.f4301a, x5.f5377f));
        Qn qn = dg.f4302b;
        if (qn != null) {
            Gn gn = qn.f4964a;
            if (gn != null) {
                x5.f5372a = this.f4355a.fromModel(gn);
            }
            V v2 = qn.f4965b;
            if (v2 != null) {
                x5.f5373b = this.f4356b.fromModel(v2);
            }
            List<Dl> list = qn.f4966c;
            if (list != null) {
                x5.f5376e = this.f4358d.fromModel(list);
            }
            x5.f5374c = (String) WrapUtils.getOrDefault(qn.f4970g, x5.f5374c);
            x5.f5375d = this.f4357c.a(qn.f4971h);
            if (!TextUtils.isEmpty(qn.f4967d)) {
                x5.f5380i = this.f4359e.fromModel(qn.f4967d);
            }
            if (!TextUtils.isEmpty(qn.f4968e)) {
                x5.f5381j = qn.f4968e.getBytes();
            }
            if (!AbstractC0572lo.a(qn.f4969f)) {
                x5.f5382k = this.f4360f.fromModel(qn.f4969f);
            }
        }
        return x5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Eg(Fn fn, W w2, C0451h6 c0451h6, Bl bl, He he, Ie ie) {
        this.f4355a = fn;
        this.f4356b = w2;
        this.f4357c = c0451h6;
        this.f4358d = bl;
        this.f4359e = he;
        this.f4360f = ie;
    }

    public final Dg a(X5 x5) {
        throw new UnsupportedOperationException();
    }
}
