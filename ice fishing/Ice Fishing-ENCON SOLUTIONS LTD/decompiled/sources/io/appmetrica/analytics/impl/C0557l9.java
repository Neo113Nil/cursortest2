package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557l9 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final C0591mh f6441a;

    /* renamed from: b, reason: collision with root package name */
    public final C0643oh f6442b;

    /* renamed from: c, reason: collision with root package name */
    public final C0281ah f6443c;

    public C0557l9(X4 x4) {
        this.f6441a = new C0591mh(x4);
        this.f6442b = new C0643oh(x4);
        this.f6443c = new C0281ah(x4);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i2) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0301bb.a(i2).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f6441a);
        } else if (ordinal == 3) {
            linkedList.add(this.f6443c);
        } else if (ordinal == 27) {
            linkedList.add(this.f6442b);
            linkedList.add(this.f6441a);
        }
        return new V8(linkedList);
    }
}
