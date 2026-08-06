package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577m3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6475a;

    /* renamed from: b, reason: collision with root package name */
    public final We f6476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6477c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f6478d;

    public C0577m3(Context context, We we, String str, SafePackageManager safePackageManager) {
        this.f6475a = context;
        this.f6476b = we;
        this.f6477c = str;
        this.f6478d = safePackageManager;
    }

    public final List a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        List<String> g2 = this.f6476b.g();
        boolean isEmpty = g2.isEmpty();
        List<String> list = g2;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f6478d.getPackageInfo(this.f6475a, this.f6477c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f6478d.getPackageInfo(this.f6475a, this.f6477c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.f6476b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
