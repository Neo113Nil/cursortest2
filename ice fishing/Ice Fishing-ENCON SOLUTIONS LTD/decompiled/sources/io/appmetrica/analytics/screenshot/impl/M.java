package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class M implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f7597a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(J j2) {
        S s2 = new S();
        s2.f7612a = j2.f7592a;
        W w2 = j2.f7593b;
        s2.f7613b = w2 != null ? this.f7597a.fromModel(w2) : null;
        return s2;
    }

    public M(Y y2) {
        this.f7597a = y2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(Y y2, int i2, kotlin.jvm.internal.e eVar) {
        this(y2);
        if ((i2 & 1) != 0) {
            y2 = new Y(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(S s2) {
        return new J(s2.f7612a, this.f7597a.toModel(s2.f7613b));
    }
}
