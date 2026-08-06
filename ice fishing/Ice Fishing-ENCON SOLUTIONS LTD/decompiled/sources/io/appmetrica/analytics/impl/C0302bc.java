package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import t1.InterfaceC1046a;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302bc extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0328cc f5666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0302bc(C0328cc c0328cc) {
        super(0);
        this.f5666a = c0328cc;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        InterfaceC0793uc ke;
        C0328cc c0328cc = this.f5666a;
        C0819vc c0819vc = c0328cc.f5741f;
        InterfaceC0712r9 interfaceC0712r9 = c0328cc.f5737b;
        Qg qg = c0328cc.f5736a;
        C0630o4 c0630o4 = c0328cc.f5738c;
        We we = c0328cc.f5739d;
        c0819vc.getClass();
        if (FrameworkDetector.isNative()) {
            M9 i2 = C0610na.f6575I.i();
            Bundle applicationMetaData = i2.f4747d.getApplicationMetaData(i2.f4744a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                ke = new Qd();
                return ke.a();
            }
        }
        ke = new Ke(interfaceC0712r9, qg, c0630o4, we);
        return ke.a();
    }
}
