package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Ji, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2644Ji implements InterfaceC2508Bi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26483a;

    /* renamed from: b, reason: collision with root package name */
    public final C5140B f26484b = C4906k.f40186C.f40196h.g();

    public C2644Ji(Context context) {
        this.f26483a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Bi
    public final void a(HashMap hashMap) {
        String str;
        if (hashMap.isEmpty() || (str = (String) hashMap.get("gad_idless")) == null) {
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        this.f26484b.s(parseBoolean);
        if (parseBoolean) {
            com.bumptech.glide.h.l(this.f26483a);
        }
    }
}
