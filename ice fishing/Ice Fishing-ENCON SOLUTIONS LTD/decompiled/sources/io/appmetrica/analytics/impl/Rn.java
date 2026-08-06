package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes.dex */
public final class Rn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fn f5010a;

    /* renamed from: b, reason: collision with root package name */
    public final W f5011b;

    /* renamed from: c, reason: collision with root package name */
    public final C0451h6 f5012c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f5013d;

    /* renamed from: e, reason: collision with root package name */
    public final He f5014e;

    /* renamed from: f, reason: collision with root package name */
    public final Ie f5015f;

    public Rn() {
        this(new Fn(), new W(new C0882xn()), new C0451h6(), new Bl(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 fromModel(Qn qn) {
        V5 v5 = new V5();
        Gn gn = qn.f4964a;
        if (gn != null) {
            v5.f5214a = this.f5010a.fromModel(gn);
        }
        V v2 = qn.f4965b;
        if (v2 != null) {
            v5.f5215b = this.f5011b.fromModel(v2);
        }
        List<Dl> list = qn.f4966c;
        if (list != null) {
            v5.f5218e = this.f5013d.fromModel(list);
        }
        String str = qn.f4970g;
        if (str != null) {
            v5.f5216c = str;
        }
        v5.f5217d = this.f5012c.a(qn.f4971h);
        if (!TextUtils.isEmpty(qn.f4967d)) {
            v5.f5221h = this.f5014e.fromModel(qn.f4967d);
        }
        if (!TextUtils.isEmpty(qn.f4968e)) {
            v5.f5222i = qn.f4968e.getBytes();
        }
        if (!AbstractC0572lo.a(qn.f4969f)) {
            v5.f5223j = this.f5015f.fromModel(qn.f4969f);
        }
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Rn(Fn fn, W w2, C0451h6 c0451h6, Bl bl, He he, Ie ie) {
        this.f5011b = w2;
        this.f5010a = fn;
        this.f5012c = c0451h6;
        this.f5013d = bl;
        this.f5014e = he;
        this.f5015f = ie;
    }

    public final Qn a(V5 v5) {
        throw new UnsupportedOperationException();
    }
}
