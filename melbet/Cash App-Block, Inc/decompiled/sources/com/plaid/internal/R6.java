package com.plaid.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.plaid.internal.C0095a6;

/* loaded from: classes5.dex */
public final class R6 extends BroadcastReceiver {
    public final EnumC0151d7 a;
    public final InterfaceC0160e7 b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0151d7.values().length];
            try {
                iArr[EnumC0151d7.SMS_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0151d7.NO_SMS_AUTOFILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public R6(EnumC0151d7 enumC0151d7, InterfaceC0160e7 interfaceC0160e7) {
        enumC0151d7.getClass();
        interfaceC0160e7.getClass();
        this.a = enumC0151d7;
        this.b = interfaceC0160e7;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                C0095a6.a.b(C0095a6.a, "SMS Retrieved action extras are null");
                J5 j5 = Y6.a;
                if (j5 != null) {
                    j5.a("SMS Retrieved action extras are null");
                    return;
                }
                return;
            }
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Integer valueOf = status != null ? Integer.valueOf(status.zza) : null;
            if (valueOf == null || valueOf.intValue() != 0) {
                if (valueOf != null && valueOf.intValue() == 15) {
                    this.b.a();
                    return;
                }
                return;
            }
            if (a.a[this.a.ordinal()] != 1) {
                return;
            }
            String string2 = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (string2 != null) {
                this.b.a(string2);
                return;
            }
            C0095a6.a.b(C0095a6.a, "SMS Receiver message is null");
            J5 j52 = Y6.a;
            if (j52 != null) {
                j52.a("SMS Receiver message is null");
            }
        }
    }
}
