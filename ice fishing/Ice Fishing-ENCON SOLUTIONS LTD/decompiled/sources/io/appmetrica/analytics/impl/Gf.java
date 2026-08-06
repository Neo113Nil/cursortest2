package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Gf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0743se f4423a;

    /* renamed from: b, reason: collision with root package name */
    public final C0874xf f4424b;

    /* renamed from: c, reason: collision with root package name */
    public final C0551l3 f4425c;

    /* renamed from: d, reason: collision with root package name */
    public final If f4426d;

    /* renamed from: e, reason: collision with root package name */
    public final C0739sa f4427e;

    /* renamed from: f, reason: collision with root package name */
    public final C0739sa f4428f;

    public Gf() {
        this(new C0743se(), new C0874xf(), new C0551l3(), new If(), new C0739sa(100), new C0739sa(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(Hf hf) {
        Di di;
        Di di2;
        Di di3;
        Di di4;
        C0608n8 c0608n8 = new C0608n8();
        Mn a2 = this.f4427e.a(hf.f4469a);
        c0608n8.f6566a = StringUtils.getUTF8Bytes((String) a2.f4785a);
        Mn a3 = this.f4428f.a(hf.f4470b);
        c0608n8.f6567b = StringUtils.getUTF8Bytes((String) a3.f4785a);
        List<String> list = hf.f4471c;
        Di di5 = null;
        if (list != null) {
            di = this.f4425c.fromModel(list);
            c0608n8.f6568c = (C0401f8) di.f4305a;
        } else {
            di = null;
        }
        Map<String, String> map = hf.f4472d;
        if (map != null) {
            di2 = this.f4423a.fromModel(map);
            c0608n8.f6569d = (C0556l8) di2.f4305a;
        } else {
            di2 = null;
        }
        C0926zf c0926zf = hf.f4473e;
        if (c0926zf != null) {
            di3 = this.f4424b.fromModel(c0926zf);
            c0608n8.f6570e = (C0582m8) di3.f4305a;
        } else {
            di3 = null;
        }
        C0926zf c0926zf2 = hf.f4474f;
        if (c0926zf2 != null) {
            di4 = this.f4424b.fromModel(c0926zf2);
            c0608n8.f6571f = (C0582m8) di4.f4305a;
        } else {
            di4 = null;
        }
        List<String> list2 = hf.f4475g;
        if (list2 != null) {
            di5 = this.f4426d.fromModel(list2);
            c0608n8.f6572g = (C0634o8[]) di5.f4305a;
        }
        return new Di(c0608n8, new C0267a3(C0267a3.b(a2, a3, di, di2, di3, di4, di5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Gf(C0743se c0743se, C0874xf c0874xf, C0551l3 c0551l3, If r4, C0739sa c0739sa, C0739sa c0739sa2) {
        this.f4423a = c0743se;
        this.f4424b = c0874xf;
        this.f4425c = c0551l3;
        this.f4426d = r4;
        this.f4427e = c0739sa;
        this.f4428f = c0739sa2;
    }

    public final Hf a(Di di) {
        throw new UnsupportedOperationException();
    }
}
