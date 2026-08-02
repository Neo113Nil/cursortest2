package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.plaid.internal.C0095a6;
import com.plaid.internal.EnumC0203j5;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: com.plaid.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0230m5 implements Y {
    public final Application a;
    public final Lazy b;

    public C0230m5(Application application) {
        application.getClass();
        this.a = application;
        this.b = LazyKt.lazy(new C0221l5(this));
    }

    public final void a(EnumC0203j5 enumC0203j5) {
        enumC0203j5.getClass();
        ((SharedPreferences) this.b.getValue()).edit().putString("plaid_environment", enumC0203j5.getJson()).apply();
    }

    public final EnumC0203j5 b() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.getValue();
        sharedPreferences.getClass();
        String a = C0106b7.a(sharedPreferences, EnumC0203j5.SANDBOX.getJson());
        try {
            EnumC0203j5.Companion.getClass();
            return EnumC0203j5.a.a(a);
        } catch (Exception e) {
            C0095a6.a.b(C0095a6.a, Recorder$$ExternalSyntheticOutline2.m("Unknown value was stored in shared prefs: ", a), new Object[]{e});
            return EnumC0203j5.SANDBOX;
        }
    }

    @Override // com.plaid.internal.Y
    public final String a() {
        return b().name();
    }
}
