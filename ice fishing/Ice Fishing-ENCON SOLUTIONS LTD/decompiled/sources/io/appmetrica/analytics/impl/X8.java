package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class X8 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final C0721ri f5383a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5384b;

    /* renamed from: c, reason: collision with root package name */
    public final C0682q4 f5385c;

    public X8(X4 x4) {
        C0721ri c0721ri = new C0721ri(x4);
        this.f5383a = c0721ri;
        this.f5385c = new C0682q4(c0721ri);
        this.f5384b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0301bb.EVENT_TYPE_ACTIVATION, new C0444h(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_START, new El(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_REGULAR, new Gg(this.f5383a));
        C0482ib c0482ib = new C0482ib(this.f5383a);
        hashMap.put(EnumC0301bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_TYPE_SEND_REFERRER, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_TYPE_CUSTOM_EVENT, c0482ib);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_SET_SESSION_EXTRA;
        C0721ri c0721ri = this.f5383a;
        hashMap.put(enumC0301bb, new C0932zl(c0721ri, c0721ri.t));
        hashMap.put(EnumC0301bb.EVENT_TYPE_APP_OPEN, new Ng(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_PURGE_BUFFER, new Rf(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0735s6(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C0822vf(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Vn(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C0848wf(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Un(this.f5383a));
        hashMap.put(EnumC0301bb.EVENT_TYPE_ANR, c0482ib);
        EnumC0301bb enumC0301bb2 = EnumC0301bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0721ri c0721ri2 = this.f5383a;
        hashMap.put(enumC0301bb2, new C0932zl(c0721ri2, c0721ri2.f6828e));
        EnumC0301bb enumC0301bb3 = EnumC0301bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0721ri c0721ri3 = this.f5383a;
        hashMap.put(enumC0301bb3, new C0932zl(c0721ri3, c0721ri3.f6829f));
        hashMap.put(EnumC0301bb.EVENT_TYPE_SEND_USER_PROFILE, c0482ib);
        EnumC0301bb enumC0301bb4 = EnumC0301bb.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0721ri c0721ri4 = this.f5383a;
        hashMap.put(enumC0301bb4, new C0932zl(c0721ri4, c0721ri4.f6834k));
        hashMap.put(EnumC0301bb.EVENT_TYPE_SEND_REVENUE_EVENT, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_TYPE_CLEANUP, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_TYPE_WEBVIEW_SYNC, c0482ib);
        hashMap.put(EnumC0301bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new E9(this.f5383a));
        return hashMap;
    }

    public final C0721ri b() {
        return this.f5383a;
    }

    public final void a(EnumC0301bb enumC0301bb, AbstractC0636oa abstractC0636oa) {
        this.f5384b.put(enumC0301bb, abstractC0636oa);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i2) {
        LinkedList linkedList = new LinkedList();
        EnumC0301bb a2 = EnumC0301bb.a(i2);
        C0682q4 c0682q4 = this.f5385c;
        if (c0682q4 != null) {
            c0682q4.a(a2, linkedList);
        }
        AbstractC0636oa abstractC0636oa = (AbstractC0636oa) this.f5384b.get(a2);
        if (abstractC0636oa != null) {
            abstractC0636oa.a(linkedList);
        }
        return new V8(linkedList);
    }

    public final AbstractC0636oa a(EnumC0301bb enumC0301bb) {
        return (AbstractC0636oa) this.f5384b.get(enumC0301bb);
    }
}
