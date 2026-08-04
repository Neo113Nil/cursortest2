package com.gamericefishpro.space.qa;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.gamericefishpro.space.sa.o;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final o a;
    public final String b;
    public final d c;
    public final com.gamericefishpro.space.sa.d d;

    public g(Context context, o oVar, d dVar) {
        String strEncodeToString;
        this.b = context.getPackageName();
        this.a = oVar;
        this.c = dVar;
        o oVar2 = com.gamericefishpro.space.sa.f.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                            }
                        }
                        this.d = new com.gamericefishpro.space.sa.d(context, oVar, h.a);
                        return;
                    }
                }
                o oVar3 = com.gamericefishpro.space.sa.f.a;
                Object[] objArr = new Object[0];
                oVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", o.b(oVar3.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        oVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", o.b(oVar.a, "Phonesky is not installed.", objArr2));
        }
        this.d = null;
    }

    public static Bundle a(g gVar, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", gVar.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        int i = 0;
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.gamericefishpro.space.sa.k(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            com.gamericefishpro.space.sa.k kVar = (com.gamericefishpro.space.sa.k) obj;
            Bundle bundle2 = new Bundle();
            kVar.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", kVar.a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
