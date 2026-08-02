package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import defpackage.eta;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0838zh implements V8 {

    @NonNull
    public final Mh a;

    @NonNull
    public final List<C0810yh> b;

    public C0838zh(@NonNull Mh mh, @NonNull List<C0810yh> list) {
        this.a = mh;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.V8
    @NonNull
    public final List<C0810yh> a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.V8
    public final Object b() {
        return this.a;
    }

    public final Mh c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb.append(this.a);
        sb.append(", candidates=");
        return eta.h(sb, this.b, '}');
    }
}
