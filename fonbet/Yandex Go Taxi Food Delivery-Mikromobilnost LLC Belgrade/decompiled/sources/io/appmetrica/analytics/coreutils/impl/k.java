package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import defpackage.sls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class k extends Lambda implements sls {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ComponentName b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i, int i2) {
        super(0);
        this.a = context;
        this.b = componentName;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        this.a.getPackageManager().setComponentEnabledSetting(this.b, this.c, this.d);
        return zy11.a;
    }
}
