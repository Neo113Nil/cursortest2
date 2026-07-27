package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2981bc implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29297b;

    public /* synthetic */ C2981bc(String str, int i) {
        this.f29296a = i;
        this.f29297b = str;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        String str = this.f29297b;
        switch (this.f29296a) {
            case 0:
                String str2 = (String) obj;
                C2927ac c2927ac = AbstractC3195fc.f30252a;
                if (str2 == null) {
                    return str;
                }
                if (((Boolean) AbstractC2701Oa.f26622f.r()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(str).getHost();
                    for (int i = 0; i < 3; i++) {
                        if (!host.endsWith(strArr[i])) {
                        }
                    }
                    return str;
                }
                String str3 = (String) AbstractC2701Oa.f26617a.r();
                String str4 = (String) AbstractC2701Oa.f26618b.r();
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replace(str3, str2);
                }
                if (TextUtils.isEmpty(str4)) {
                    return str;
                }
                Uri parse = Uri.parse(str);
                return TextUtils.isEmpty(parse.getQueryParameter(str4)) ? parse.buildUpon().appendQueryParameter(str4, str2).toString() : str;
            case 1:
                Throwable th = (Throwable) obj;
                C2927ac c2927ac2 = AbstractC3195fc.f30252a;
                if (((Boolean) AbstractC2701Oa.i.r()).booleanValue()) {
                    C4835j.f39730C.f39740h.d("prepareClickUrl.attestation2", th);
                }
                return str;
            case 2:
                return new C3099dn(str, (BinderC3356ib) obj);
            default:
                Throwable th2 = (Throwable) obj;
                C4126ws c4126ws = Ks.f25981j;
                int i6 = u2.z.f41319b;
                v2.i.c("Error calling adapter: ".concat(String.valueOf(str)));
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Fe)).booleanValue()) {
                    C4835j.f39730C.f39740h.e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                    return null;
                }
                C4835j.f39730C.f39740h.d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                return null;
        }
    }
}
