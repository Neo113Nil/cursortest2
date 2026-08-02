package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.fillr.n;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.internal.zzw;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzi {
    public static final n.a zzb = new n.a("ReviewService", 3);
    public final zzt zza;
    public final String zzc;

    public zzi(Context context) {
        String str;
        this.zzc = context.getPackageName();
        n.a aVar = zzw.zza;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                aVar.zzd("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    aVar.zzd("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        str = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    arrayList.add(str);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                        }
                    }
                    this.zza = new zzt(context, zzb, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ", ");
                        }
                    }
                }
                aVar.zzd(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                aVar.zzd("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            aVar.zzd("Play Store package is not found.", new Object[0]);
        }
    }
}
