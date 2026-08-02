package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class g extends Lambda implements sls {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return Boolean.valueOf(this.a.getPackageManager().hasSystemFeature(this.b));
    }
}
