package q7;

import java.util.ArrayList;
import java.util.Iterator;
import p7.C4853a;
import r7.C4963c;

/* renamed from: q7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4941j {

    /* renamed from: b, reason: collision with root package name */
    public final Y6.d f40275b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4936e f40276c;

    /* renamed from: d, reason: collision with root package name */
    public final C4853a f40277d;

    /* renamed from: e, reason: collision with root package name */
    public final H5.a f40278e;

    /* renamed from: f, reason: collision with root package name */
    public final C4963c f40279f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4940i f40280g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f40274a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile Y6.c f40281h = null;

    public C4941j(Y6.d dVar, EnumC4936e enumC4936e, C4853a c4853a, H5.a aVar, C4963c c4963c, ArrayList arrayList) {
        this.f40275b = dVar;
        this.f40276c = enumC4936e;
        this.f40277d = c4853a;
        this.f40278e = aVar;
        this.f40279f = c4963c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC4940i) it.next());
        }
        this.f40280g = arrayList2.isEmpty() ? C4935d.f40258n : arrayList2.size() == 1 ? (InterfaceC4940i) arrayList2.get(0) : new C4934c(new ArrayList(arrayList2));
    }
}
