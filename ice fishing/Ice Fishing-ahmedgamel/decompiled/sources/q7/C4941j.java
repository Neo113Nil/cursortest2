package q7;

import java.util.ArrayList;
import java.util.Iterator;
import p7.C4853a;
import r7.C4963c;

/* renamed from: q7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4941j {

    /* renamed from: b, reason: collision with root package name */
    public final Y6.d f40278b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4936e f40279c;

    /* renamed from: d, reason: collision with root package name */
    public final C4853a f40280d;

    /* renamed from: e, reason: collision with root package name */
    public final H5.a f40281e;

    /* renamed from: f, reason: collision with root package name */
    public final C4963c f40282f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4940i f40283g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f40277a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile Y6.c f40284h = null;

    public C4941j(Y6.d dVar, EnumC4936e enumC4936e, C4853a c4853a, H5.a aVar, C4963c c4963c, ArrayList arrayList) {
        this.f40278b = dVar;
        this.f40279c = enumC4936e;
        this.f40280d = c4853a;
        this.f40281e = aVar;
        this.f40282f = c4963c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC4940i) it.next());
        }
        this.f40283g = arrayList2.isEmpty() ? C4935d.f40261n : arrayList2.size() == 1 ? (InterfaceC4940i) arrayList2.get(0) : new C4934c(new ArrayList(arrayList2));
    }
}
