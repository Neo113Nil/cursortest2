package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.fillr.e;
import com.google.android.play.integrity.internal.ae;
import com.google.android.play.integrity.internal.d;
import com.google.android.play.integrity.internal.s;
import com.google.mlkit.common.internal.zze;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ar {
    public final ae a;
    public final s b;
    public final String c;
    public final Context d;
    public final zze f;

    public ar(Context context, s sVar, zze zzeVar) {
        s sVar2;
        this.c = context.getPackageName();
        this.b = sVar;
        this.f = zzeVar;
        this.d = context;
        s sVar3 = com.google.android.play.integrity.internal.ai.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (com.google.android.play.integrity.internal.ai.c(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new ae(context, sVar, "IntegrityService", as.a, new e());
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    sVar2 = sVar;
                    sVar3.e("Play Store package is not found.", new Object[0]);
                }
            } else {
                sVar3.e("Play Store package is disabled.", new Object[0]);
            }
            sVar2 = sVar;
        } catch (PackageManager.NameNotFoundException unused2) {
            sVar2 = sVar;
            sVar3.e("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        sVar2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", s.f(sVar2.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }

    public static /* bridge */ /* synthetic */ Bundle a(ar arVar, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", arVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(d.a(arrayList)));
        return bundle;
    }
}
