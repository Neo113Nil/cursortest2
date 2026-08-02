package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.uif;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Bd extends uif implements Function0 {
    public final /* synthetic */ Cd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Cd cd) {
        super(0);
        this.a = cd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Wd c0320hh;
        Cd cd = this.a;
        Xd xd = cd.f;
        InterfaceC0831za interfaceC0831za = cd.b;
        C0668tj c0668tj = cd.a;
        C0250f5 c0250f5 = cd.c;
        C0637sh c0637sh = cd.d;
        xd.getClass();
        if (FrameworkDetector.isNative()) {
            Ua i = C0747wb.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                c0320hh = new C0434lg();
                return c0320hh.a();
            }
        }
        c0320hh = new C0320hh(interfaceC0831za, c0668tj, c0250f5, c0637sh);
        return c0320hh.a();
    }
}
