package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.sx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3938sx implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f34957n;

    @Override // I7.a
    public final Object invoke() {
        Context context = this.f34957n;
        kotlin.jvm.internal.h.e(context, "<this>");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/ad_quality_data.pb");
    }
}
