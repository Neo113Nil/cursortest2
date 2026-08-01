package e8;

import b8.InterfaceC0529a;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class M extends AbstractC4481m {

    /* renamed from: b, reason: collision with root package name */
    public final L f37257b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(InterfaceC0529a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.h.e(primitiveSerializer, "primitiveSerializer");
        this.f37257b = new L(primitiveSerializer.c());
    }

    @Override // e8.AbstractC4481m, b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        int g4 = g(obj);
        L descriptor = this.f37257b;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        g8.q a9 = qVar.a(descriptor);
        n(a9, obj, g4);
        a9.p(descriptor);
    }

    @Override // e8.AbstractC4469a, b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return h(decoder);
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return this.f37257b;
    }

    @Override // e8.AbstractC4469a
    public final Object d() {
        return (K) j(m());
    }

    @Override // e8.AbstractC4469a
    public final int e(Object obj) {
        K k9 = (K) obj;
        kotlin.jvm.internal.h.e(k9, "<this>");
        return k9.d();
    }

    @Override // e8.AbstractC4469a
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // e8.AbstractC4469a
    public final Object k(Object obj) {
        K k9 = (K) obj;
        kotlin.jvm.internal.h.e(k9, "<this>");
        return k9.a();
    }

    @Override // e8.AbstractC4481m
    public final void l(int i, Object obj, Object obj2) {
        kotlin.jvm.internal.h.e((K) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object m();

    public abstract void n(g8.q qVar, Object obj, int i);
}
