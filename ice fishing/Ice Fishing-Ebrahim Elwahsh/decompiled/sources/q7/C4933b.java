package q7;

import v7.C5139j;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* renamed from: q7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4933b implements InterfaceC5133d {

    /* renamed from: n, reason: collision with root package name */
    public c8.o f40154n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC5133d f40155u;

    /* renamed from: v, reason: collision with root package name */
    public Object f40156v;

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return C5139j.f41372n;
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        this.f40155u = null;
        this.f40156v = obj;
    }
}
