package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2572Fe implements InterfaceC3254gB, InterfaceC3765pl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25599n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f25600u;

    public /* synthetic */ C2572Fe(Context context, int i) {
        this.f25599n = i;
        this.f25600u = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        ((InterfaceC2561Ek) obj).s(this.f25600u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public Object mo14c() {
        Context context = this.f25600u;
        switch (this.f25599n) {
            case 0:
                return AbstractC2659Kg.b(context);
            default:
                int i = EN.f25344A;
                new N0();
                new C3944t2(6);
                context.getApplicationContext();
                C3107dP c3107dP = new C3107dP(8);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.clear();
                hashMap2.clear();
                return c3107dP;
        }
    }
}
