package com.plaid.internal;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.android.gms.internal.p001authapiphone.zzac;
import com.google.mlkit.vision.text.zza;
import com.squareup.util.Strings;

/* renamed from: com.plaid.internal.f7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0169f7 extends C0304v {
    public final R6 a;

    public C0169f7(InterfaceC0160e7 interfaceC0160e7) {
        interfaceC0160e7.getClass();
        this.a = new R6(EnumC0151d7.SMS_RECEIVER, interfaceC0160e7);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    @Override // com.plaid.internal.C0304v
    public final void a(Context context) {
        context.getClass();
        zzab zzabVar = new zzab(context, null, SmsRetrieverClient.zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        zacn builder = zacn.builder();
        builder.zaa = new zza(zzabVar, 6);
        builder.zaa$1 = new Feature[]{zzac.zzc};
        builder.zac = 1567;
        zzabVar.zae(1, builder.build());
        Strings.registerReceiver(context, this.a, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), null, 2);
    }

    @Override // com.plaid.internal.C0304v
    public final void b(Context context) {
        if (context != null) {
            context.unregisterReceiver(this.a);
        }
    }
}
