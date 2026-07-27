package L;

import java.util.ArrayList;

/* renamed from: L.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d extends v {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f529e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f530f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f531g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f532h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f533i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f534j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f535k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f536l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f537m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f538n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f539o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // L.v
    public final void a() {
        ArrayList arrayList = this.f531g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            E0.h.h(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f529e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f594a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f530f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f532h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            E0.h.h(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f534j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    E0.h.h(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f533i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f535k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    E0.h.h(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f538n);
            c(this.f537m);
            c(this.f536l);
            c(this.f539o);
            ArrayList arrayList11 = this.f595b;
            if (arrayList11.size() > 0) {
                E0.h.h(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // L.v
    public final boolean b() {
        return (this.f530f.isEmpty() && this.f532h.isEmpty() && this.f531g.isEmpty() && this.f529e.isEmpty() && this.f537m.isEmpty() && this.f538n.isEmpty() && this.f536l.isEmpty() && this.f539o.isEmpty() && this.f534j.isEmpty() && this.f533i.isEmpty() && this.f535k.isEmpty()) ? false : true;
    }
}
