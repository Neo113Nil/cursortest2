package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Yi implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0743se f5438a;

    /* renamed from: b, reason: collision with root package name */
    public final C0551l3 f5439b;

    /* renamed from: c, reason: collision with root package name */
    public final C0739sa f5440c;

    /* renamed from: d, reason: collision with root package name */
    public final C0739sa f5441d;

    public Yi() {
        this(new C0743se(), new C0551l3(), new C0739sa(100), new C0739sa(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C0335cj c0335cj) {
        Di di;
        C0686q8 c0686q8 = new C0686q8();
        Mn a2 = this.f5440c.a(c0335cj.f5754a);
        c0686q8.f6770a = StringUtils.getUTF8Bytes((String) a2.f4785a);
        List<String> list = c0335cj.f5755b;
        Di di2 = null;
        if (list != null) {
            di = this.f5439b.fromModel(list);
            c0686q8.f6771b = (C0401f8) di.f4305a;
        } else {
            di = null;
        }
        Mn a3 = this.f5441d.a(c0335cj.f5756c);
        c0686q8.f6772c = StringUtils.getUTF8Bytes((String) a3.f4785a);
        Map<String, String> map = c0335cj.f5757d;
        if (map != null) {
            di2 = this.f5438a.fromModel(map);
            c0686q8.f6773d = (C0556l8) di2.f4305a;
        }
        return new Di(c0686q8, new C0267a3(C0267a3.b(a2, di, a3, di2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Yi(C0743se c0743se, C0551l3 c0551l3, C0739sa c0739sa, C0739sa c0739sa2) {
        this.f5438a = c0743se;
        this.f5439b = c0551l3;
        this.f5440c = c0739sa;
        this.f5441d = c0739sa2;
    }

    public final C0335cj a(Di di) {
        throw new UnsupportedOperationException();
    }
}
