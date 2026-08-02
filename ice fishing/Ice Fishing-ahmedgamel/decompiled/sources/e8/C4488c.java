package e8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: e8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4488c extends AbstractC4498m {

    /* renamed from: b, reason: collision with root package name */
    public final C4487b f37357b;

    public C4488c() {
        super(f8.p.f37535a);
        c8.f elementDesc = f8.p.f37536b;
        kotlin.jvm.internal.h.e(elementDesc, "elementDesc");
        this.f37357b = new C4487b(elementDesc);
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return this.f37357b;
    }

    @Override // e8.AbstractC4486a
    public final Object d() {
        return new ArrayList();
    }

    @Override // e8.AbstractC4486a
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // e8.AbstractC4486a
    public final Iterator f(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.h.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.h.e(collection, "<this>");
        return collection.size();
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        kotlin.jvm.internal.h.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // e8.AbstractC4486a
    public final Object k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // e8.AbstractC4498m
    public final void l(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
