package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.tx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3982tx implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f34499n;

    @Override // E7.a
    public final Object invoke() {
        Context context = this.f34499n;
        kotlin.jvm.internal.h.e(context, "<this>");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/ad_quality_data.pb");
    }
}
