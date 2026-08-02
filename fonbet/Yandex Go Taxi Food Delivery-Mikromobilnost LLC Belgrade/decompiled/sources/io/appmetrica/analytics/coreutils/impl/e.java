package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class e extends Lambda implements sls {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i) {
        super(0);
        this.a = context;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return this.a.getPackageManager().getPackageInfo(this.b, this.c);
    }
}
