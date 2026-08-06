package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692qe implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public final File f6776a;

    /* renamed from: b, reason: collision with root package name */
    public final Jg f6777b;

    public C0692qe(File file, Jg jg) {
        this.f6776a = file;
        this.f6777b = jg;
    }

    @Override // io.appmetrica.analytics.impl.I6
    public final File a(Context context, String str) {
        return new File(this.f6776a, this.f6777b.a(str));
    }
}
