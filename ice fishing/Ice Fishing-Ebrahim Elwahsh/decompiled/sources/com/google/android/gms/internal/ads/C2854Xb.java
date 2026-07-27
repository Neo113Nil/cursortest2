package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Xb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2854Xb implements XA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28654b;

    public /* synthetic */ C2854Xb(String str, int i) {
        this.f28653a = i;
        this.f28654b = str;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final Object apply(Object obj) {
        String str = this.f28654b;
        switch (this.f28653a) {
            case 0:
                String str2 = (String) obj;
                C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                if (str2 == null) {
                    return str;
                }
                if (((Boolean) AbstractC2615Ja.f25775f.r()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(str).getHost();
                    for (int i = 0; i < 3; i++) {
                        if (!host.endsWith(strArr[i])) {
                        }
                    }
                    return str;
                }
                String str3 = (String) AbstractC2615Ja.f25770a.r();
                String str4 = (String) AbstractC2615Ja.f25771b.r();
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
                C2820Vb c2820Vb2 = AbstractC2935ac.f29210a;
                if (((Boolean) AbstractC2615Ja.i.r()).booleanValue()) {
                    p2.j.f39798C.f39808h.d("prepareClickUrl.attestation2", th);
                }
                return str;
            case 2:
                return new C3055cn(str, (BinderC3098db) obj);
            default:
                Throwable th2 = (Throwable) obj;
                C4301zs c4301zs = Ls.f26236j;
                int i4 = t2.C.f40822b;
                u2.i.c("Error calling adapter: ".concat(String.valueOf(str)));
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ze)).booleanValue()) {
                    p2.j.f39798C.f39808h.e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                    return null;
                }
                p2.j.f39798C.f39808h.d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                return null;
        }
    }
}
