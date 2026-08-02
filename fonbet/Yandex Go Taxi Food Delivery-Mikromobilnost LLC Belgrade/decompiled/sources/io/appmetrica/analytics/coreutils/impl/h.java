package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class h extends Lambda implements sls {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i) {
        super(0);
        this.a = context;
        this.b = intent;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return this.a.getPackageManager().resolveActivity(this.b, this.c);
    }
}
