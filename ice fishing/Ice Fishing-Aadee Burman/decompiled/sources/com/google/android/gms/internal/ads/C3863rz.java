package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.rz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3863rz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33780a;

    /* renamed from: b, reason: collision with root package name */
    public final C3983uA f33781b;

    /* renamed from: c, reason: collision with root package name */
    public final Xy f33782c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33783d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33784e;

    public C3863rz(Context context, C3983uA c3983uA, Xy xy, C2949ay c2949ay) {
        this.f33780a = context;
        this.f33781b = c3983uA;
        this.f33782c = xy;
        this.f33783d = c2949ay.R();
        this.f33784e = c2949ay.j0();
    }

    public final String a(long j6) {
        boolean z3;
        String str = "E";
        Context context = this.f33780a;
        try {
            this.f33781b.a(55).a();
            N6 A9 = O6.A();
            String str2 = this.f33783d;
            A9.h();
            ((O6) A9.f27721u).C(str2);
            A9.h();
            ((O6) A9.f27721u).B("0.904631200");
            String packageName = context.getPackageName();
            A9.h();
            ((O6) A9.f27721u).E(packageName);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            A9.h();
            ((O6) A9.f27721u).D(currentTimeMillis);
            long currentTimeMillis2 = (System.currentTimeMillis() - j6) / 1000;
            A9.h();
            ((O6) A9.f27721u).G(currentTimeMillis2);
            if (this.f33784e) {
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
                ((O6) A9.f27721u).H(str);
            }
            try {
                long j9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                A9.h();
                ((O6) A9.f27721u).F(j9);
            } catch (PackageManager.NameNotFoundException unused2) {
                A9.h();
                ((O6) A9.f27721u).F(-1L);
            }
            Xy xy = this.f33782c;
            synchronized (xy) {
                z3 = xy.f28616d;
            }
            if (!z3) {
                xy.a();
            }
            R6 d2 = xy.d(null, ((O6) A9.j()).b());
            d2.h();
            ((S6) d2.f27721u).D(5);
            d2.h();
            ((S6) d2.f27721u).E(2);
            byte[] b10 = ((S6) d2.j()).b();
            CC cc = EC.f24556e;
            if (cc.f24559b != null) {
                cc = new CC(cc.f24558a, (Character) null);
            }
            return cc.g(b10.length, b10);
        } finally {
        }
    }
}
