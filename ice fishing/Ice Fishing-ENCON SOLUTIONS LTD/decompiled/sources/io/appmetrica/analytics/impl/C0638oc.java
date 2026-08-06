package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638oc implements InterfaceC0538kg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0664pc f6673a;

    public C0638oc(C0664pc c0664pc) {
        this.f6673a = c0664pc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0538kg
    public final void a(C0616ng c0616ng) {
        if (c0616ng == null) {
            return;
        }
        P5 p5 = new P5("", "", 0);
        p5.setValueBytes(c0616ng.a());
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        p5.f4907d = 4097;
        this.f6673a.a(p5);
    }
}
