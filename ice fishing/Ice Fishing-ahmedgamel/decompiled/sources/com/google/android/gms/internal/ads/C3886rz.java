package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.rz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3886rz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34548a;

    /* renamed from: b, reason: collision with root package name */
    public final C4006uA f34549b;

    /* renamed from: c, reason: collision with root package name */
    public final Xy f34550c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34551d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34552e;

    public C3886rz(Context context, C4006uA c4006uA, Xy xy, C2972ay c2972ay) {
        this.f34548a = context;
        this.f34549b = c4006uA;
        this.f34550c = xy;
        this.f34551d = c2972ay.R();
        this.f34552e = c2972ay.j0();
    }

    public final String a(long j6) {
        boolean z6;
        String str = "E";
        Context context = this.f34548a;
        try {
            this.f34549b.a(55).a();
            N6 A9 = O6.A();
            String str2 = this.f34551d;
            A9.h();
            ((O6) A9.f28504u).C(str2);
            A9.h();
            ((O6) A9.f28504u).B("0.904631200");
            String packageName = context.getPackageName();
            A9.h();
            ((O6) A9.f28504u).E(packageName);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            A9.h();
            ((O6) A9.f28504u).D(currentTimeMillis);
            long currentTimeMillis2 = (System.currentTimeMillis() - j6) / 1000;
            A9.h();
            ((O6) A9.f28504u).G(currentTimeMillis2);
            if (this.f34552e) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] digest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b9 : digest) {
                            String hexString = Integer.toHexString(b9 & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        str = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                A9.h();
                ((O6) A9.f28504u).H(str);
            }
            try {
                long j9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                A9.h();
                ((O6) A9.f28504u).F(j9);
            } catch (PackageManager.NameNotFoundException unused2) {
                A9.h();
                ((O6) A9.f28504u).F(-1L);
            }
            Xy xy = this.f34550c;
            synchronized (xy) {
                z6 = xy.f29393d;
            }
            if (!z6) {
                xy.a();
            }
            R6 d9 = xy.d(null, ((O6) A9.j()).b());
            d9.h();
            ((S6) d9.f28504u).D(5);
            d9.h();
            ((S6) d9.f28504u).E(2);
            byte[] b10 = ((S6) d9.j()).b();
            CC cc = EC.f25317e;
            if (cc.f25320b != null) {
                cc = new CC(cc.f25319a, (Character) null);
            }
            return cc.g(b10.length, b10);
        } finally {
        }
    }
}
