package q7;

import java.util.ArrayList;
import java.util.Iterator;
import p7.C4853a;
import r7.C4913c;

/* renamed from: q7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4890j {

    /* renamed from: b, reason: collision with root package name */
    public final Y6.d f40089b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4885e f40090c;

    /* renamed from: d, reason: collision with root package name */
    public final C4853a f40091d;

    /* renamed from: e, reason: collision with root package name */
    public final H5.a f40092e;

    /* renamed from: f, reason: collision with root package name */
    public final C4913c f40093f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4889i f40094g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f40088a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile Y6.c f40095h = null;

    public C4890j(Y6.d dVar, EnumC4885e enumC4885e, C4853a c4853a, H5.a aVar, C4913c c4913c, ArrayList arrayList) {
        this.f40089b = dVar;
        this.f40090c = enumC4885e;
        this.f40091d = c4853a;
        this.f40092e = aVar;
        this.f40093f = c4913c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC4889i) it.next());
        }
        this.f40094g = arrayList2.isEmpty() ? C4884d.f40072n : arrayList2.size() == 1 ? (InterfaceC4889i) arrayList2.get(0) : new C4883c(new ArrayList(arrayList2));
    }
}
