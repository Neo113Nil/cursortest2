package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0255fa extends AbstractC0177ci {
    public final Zk a;
    public final HashMap b;
    public final C0308h5 c;

    public C0255fa(P5 p5) {
        Zk zk = new Zk(p5);
        this.a = zk;
        this.c = new C0308h5(zk);
        this.b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0603rc.EVENT_TYPE_ACTIVATION, new C0331i(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_START, new Ho(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_REGULAR, new C0379jj(this.a));
        Hc hc = new Hc(this.a);
        hashMap.put(EnumC0603rc.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, hc);
        hashMap.put(EnumC0603rc.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, hc);
        hashMap.put(EnumC0603rc.EVENT_TYPE_SEND_REFERRER, hc);
        hashMap.put(EnumC0603rc.EVENT_TYPE_CUSTOM_EVENT, hc);
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_SET_SESSION_EXTRA;
        Zk zk = this.a;
        hashMap.put(enumC0603rc, new Co(zk, zk.t));
        hashMap.put(EnumC0603rc.EVENT_TYPE_APP_OPEN, new C0582qj(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_PURGE_BUFFER, new C0696ui(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0425l7(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Rh(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0128ar(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Sh(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Zq(this.a));
        hashMap.put(EnumC0603rc.EVENT_TYPE_ANR, hc);
        EnumC0603rc enumC0603rc2 = EnumC0603rc.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Zk zk2 = this.a;
        hashMap.put(enumC0603rc2, new Co(zk2, zk2.e));
        EnumC0603rc enumC0603rc3 = EnumC0603rc.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Zk zk3 = this.a;
        hashMap.put(enumC0603rc3, new Co(zk3, zk3.f));
        hashMap.put(EnumC0603rc.EVENT_TYPE_SEND_USER_PROFILE, hc);
        EnumC0603rc enumC0603rc4 = EnumC0603rc.EVENT_TYPE_SET_USER_PROFILE_ID;
        Zk zk4 = this.a;
        hashMap.put(enumC0603rc4, new Co(zk4, zk4.k));
        hashMap.put(EnumC0603rc.EVENT_TYPE_SEND_REVENUE_EVENT, hc);
        hashMap.put(EnumC0603rc.EVENT_TYPE_SEND_AD_REVENUE_EVENT, hc);
        hashMap.put(EnumC0603rc.EVENT_TYPE_CLEANUP, hc);
        hashMap.put(EnumC0603rc.EVENT_TYPE_SEND_ECOMMERCE_EVENT, hc);
        hashMap.put(EnumC0603rc.EVENT_TYPE_WEBVIEW_SYNC, hc);
        hashMap.put(EnumC0603rc.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new Ma(this.a));
        return hashMap;
    }

    public final Zk b() {
        return this.a;
    }

    public final void a(EnumC0603rc enumC0603rc, AbstractC0776xb abstractC0776xb) {
        this.b.put(enumC0603rc, abstractC0776xb);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0177ci
    public final AbstractC0226ea a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC0603rc a = EnumC0603rc.a(i);
        C0308h5 c0308h5 = this.c;
        if (c0308h5 != null) {
            c0308h5.a(a, linkedList);
        }
        AbstractC0776xb abstractC0776xb = (AbstractC0776xb) this.b.get(a);
        if (abstractC0776xb != null) {
            abstractC0776xb.a(linkedList);
        }
        return new C0198da(linkedList);
    }

    public final AbstractC0776xb a(EnumC0603rc enumC0603rc) {
        return (AbstractC0776xb) this.b.get(enumC0603rc);
    }
}
