package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Ji, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2624Ji implements InterfaceC2488Bi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25729a;

    /* renamed from: b, reason: collision with root package name */
    public final C5069B f25730b = C4835j.f39733C.f39743h.g();

    public C2624Ji(Context context) {
        this.f25729a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2488Bi
    public final void a(HashMap hashMap) {
        String str;
        if (hashMap.isEmpty() || (str = (String) hashMap.get("gad_idless")) == null) {
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        this.f25730b.s(parseBoolean);
        if (parseBoolean) {
            t8.g.J(this.f25729a);
        }
    }
}
