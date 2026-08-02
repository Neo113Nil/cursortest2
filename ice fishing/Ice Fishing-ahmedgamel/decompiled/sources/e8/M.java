package e8;

import b8.InterfaceC0537a;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class M extends AbstractC4498m {

    /* renamed from: b, reason: collision with root package name */
    public final L f37333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(InterfaceC0537a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.h.e(primitiveSerializer, "primitiveSerializer");
        this.f37333b = new L(primitiveSerializer.c());
    }

    @Override // e8.AbstractC4498m, b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        int g9 = g(obj);
        L descriptor = this.f37333b;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        g8.q a9 = qVar.a(descriptor);
        n(a9, obj, g9);
        a9.p(descriptor);
    }

    @Override // e8.AbstractC4486a, b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return h(decoder);
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return this.f37333b;
    }

    @Override // e8.AbstractC4486a
    public final Object d() {
        return (K) j(m());
    }

    @Override // e8.AbstractC4486a
    public final int e(Object obj) {
        K k9 = (K) obj;
        kotlin.jvm.internal.h.e(k9, "<this>");
        return k9.d();
    }

    @Override // e8.AbstractC4486a
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // e8.AbstractC4486a
    public final Object k(Object obj) {
        K k9 = (K) obj;
        kotlin.jvm.internal.h.e(k9, "<this>");
        return k9.a();
    }

    @Override // e8.AbstractC4498m
    public final void l(int i, Object obj, Object obj2) {
        kotlin.jvm.internal.h.e((K) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object m();

    public abstract void n(g8.q qVar, Object obj, int i);
}
