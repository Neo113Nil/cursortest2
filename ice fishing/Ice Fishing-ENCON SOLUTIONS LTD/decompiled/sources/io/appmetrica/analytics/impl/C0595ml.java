package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595ml implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0621nl f6535a;

    public C0595ml(C0621nl c0621nl) {
        this.f6535a = c0621nl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0621nl c0621nl = this.f6535a;
        if (c0621nl.f6633b.hasPermission(c0621nl.f6632a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
