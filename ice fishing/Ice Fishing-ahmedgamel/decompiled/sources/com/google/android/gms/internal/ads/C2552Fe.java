package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2552Fe implements InterfaceC3231gB, InterfaceC3742pl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24810n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f24811u;

    public /* synthetic */ C2552Fe(Context context, int i) {
        this.f24810n = i;
        this.f24811u = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        ((InterfaceC2541Ek) obj).s(this.f24811u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public Object mo15c() {
        Context context = this.f24811u;
        switch (this.f24810n) {
            case 0:
                return AbstractC2639Kg.b(context);
            default:
                int i = EN.f24583A;
                new N0();
                new C3921t2(6);
                context.getApplicationContext();
                C3084dP c3084dP = new C3084dP(8);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.clear();
                hashMap2.clear();
                return c3084dP;
        }
    }
}
