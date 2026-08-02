package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0531ma extends AbstractC0741ti {
    public final C0455jl a;
    public final HashMap b;
    public final C0497l5 c;

    public C0531ma(S5 s5) {
        C0455jl c0455jl = new C0455jl(s5);
        this.a = c0455jl;
        this.c = new C0497l5(c0455jl);
        this.b = a(s5);
    }

    public final HashMap a(S5 s5) {
        HashMap hashMap = new HashMap();
        hashMap.put(Hc.EVENT_TYPE_ACTIVATION, new C0405i(this.a, s5.b));
        hashMap.put(Hc.EVENT_TYPE_START, new Zo(this.a));
        hashMap.put(Hc.EVENT_TYPE_REGULAR, new C0627pj(this.a));
        Xc xc = new Xc(this.a);
        hashMap.put(Hc.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, xc);
        hashMap.put(Hc.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, xc);
        hashMap.put(Hc.EVENT_TYPE_SEND_REFERRER, xc);
        hashMap.put(Hc.EVENT_TYPE_CUSTOM_EVENT, xc);
        Hc hc = Hc.EVENT_TYPE_SET_SESSION_EXTRA;
        C0455jl c0455jl = this.a;
        hashMap.put(hc, new Uo(c0455jl, c0455jl.t));
        hashMap.put(Hc.EVENT_TYPE_APP_OPEN, new C0829wj(this.a));
        hashMap.put(Hc.EVENT_TYPE_PURGE_BUFFER, new Li(this.a));
        hashMap.put(Hc.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0644q7(this.a));
        hashMap.put(Hc.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C0423ii(this.a));
        hashMap.put(Hc.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0750tr(this.a));
        hashMap.put(Hc.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C0452ji(this.a));
        hashMap.put(Hc.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new C0721sr(this.a));
        hashMap.put(Hc.EVENT_TYPE_ANR, xc);
        Hc hc2 = Hc.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0455jl c0455jl2 = this.a;
        hashMap.put(hc2, new Uo(c0455jl2, c0455jl2.e));
        Hc hc3 = Hc.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0455jl c0455jl3 = this.a;
        hashMap.put(hc3, new Uo(c0455jl3, c0455jl3.f));
        hashMap.put(Hc.EVENT_TYPE_SEND_USER_PROFILE, xc);
        Hc hc4 = Hc.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0455jl c0455jl4 = this.a;
        hashMap.put(hc4, new Uo(c0455jl4, c0455jl4.k));
        hashMap.put(Hc.EVENT_TYPE_SEND_REVENUE_EVENT, xc);
        hashMap.put(Hc.EVENT_TYPE_SEND_AD_REVENUE_EVENT, xc);
        hashMap.put(Hc.EVENT_TYPE_CLEANUP, xc);
        hashMap.put(Hc.EVENT_TYPE_SEND_ECOMMERCE_EVENT, xc);
        hashMap.put(Hc.EVENT_TYPE_WEBVIEW_SYNC, xc);
        hashMap.put(Hc.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new Ua(this.a));
        return hashMap;
    }

    public final void a(Hc hc, Nb nb) {
        this.b.put(hc, nb);
    }

    public final C0455jl a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0741ti
    public final AbstractC0502la a(int i) {
        LinkedList linkedList = new LinkedList();
        Hc a = Hc.a(i);
        C0497l5 c0497l5 = this.c;
        if (c0497l5 != null) {
            c0497l5.a(a, linkedList);
        }
        Nb nb = (Nb) this.b.get(a);
        if (nb != null) {
            nb.a(linkedList);
        }
        return new C0473ka(linkedList);
    }

    public final Nb a(Hc hc) {
        return (Nb) this.b.get(hc);
    }
}
