package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3004bc implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30086b;

    public /* synthetic */ C3004bc(String str, int i) {
        this.f30085a = i;
        this.f30086b = str;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        String str = this.f30086b;
        switch (this.f30085a) {
            case 0:
                String str2 = (String) obj;
                C2950ac c2950ac = AbstractC3218fc.f31040a;
                if (str2 == null) {
                    return str;
                }
                if (((Boolean) AbstractC2721Oa.f27398f.r()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(str).getHost();
                    for (int i = 0; i < 3; i++) {
                        if (!host.endsWith(strArr[i])) {
                        }
                    }
                    return str;
                }
                String str3 = (String) AbstractC2721Oa.f27393a.r();
                String str4 = (String) AbstractC2721Oa.f27394b.r();
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
                C2950ac c2950ac2 = AbstractC3218fc.f31040a;
                if (((Boolean) AbstractC2721Oa.i.r()).booleanValue()) {
                    C4906k.f40186C.f40196h.d("prepareClickUrl.attestation2", th);
                }
                return str;
            case 2:
                return new C3175en(str, (BinderC3379ib) obj);
            default:
                Throwable th2 = (Throwable) obj;
                C4149ws c4149ws = Ks.f26781j;
                int i4 = w2.z.f41712b;
                x2.i.c("Error calling adapter: ".concat(String.valueOf(str)));
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Fe)).booleanValue()) {
                    C4906k.f40186C.f40196h.e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                    return null;
                }
                C4906k.f40186C.f40196h.d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                return null;
        }
    }
}
