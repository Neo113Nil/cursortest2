package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.consent_sdk.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4341l0 extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f35712n;

    public C4341l0(int i, String str) {
        super(str);
        this.f35712n = i;
    }

    public final M3.f a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new M3.f(this.f35712n, super.getMessage());
    }

    public C4341l0(int i, IOException iOException, String str) {
        super(str, iOException);
        this.f35712n = i;
    }
}
