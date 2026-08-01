package x;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0371f implements InterfaceC0369d {

    /* renamed from: d, reason: collision with root package name */
    public final o f4688d;

    /* renamed from: f, reason: collision with root package name */
    public int f4689f;

    /* renamed from: g, reason: collision with root package name */
    public int f4690g;

    /* renamed from: a, reason: collision with root package name */
    public o f4685a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4686b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4687c = false;
    public int e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f4691h = 1;
    public C0372g i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4692k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4693l = new ArrayList();

    public C0371f(o oVar) {
        this.f4688d = oVar;
    }

    @Override // x.InterfaceC0369d
    public final void a(InterfaceC0369d interfaceC0369d) {
        ArrayList arrayList = this.f4693l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0371f) it.next()).j) {
                return;
            }
        }
        this.f4687c = true;
        o oVar = this.f4685a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f4686b) {
            this.f4688d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0371f c0371f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0371f c0371f2 = (C0371f) it2.next();
            if (!(c0371f2 instanceof C0372g)) {
                i++;
                c0371f = c0371f2;
            }
        }
        if (c0371f != null && i == 1 && c0371f.j) {
            C0372g c0372g = this.i;
            if (c0372g != null) {
                if (!c0372g.j) {
                    return;
                } else {
                    this.f4689f = this.f4691h * c0372g.f4690g;
                }
            }
            d(c0371f.f4690g + this.f4689f);
        }
        o oVar2 = this.f4685a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f4692k.add(oVar);
        if (this.j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f4693l.clear();
        this.f4692k.clear();
        this.j = false;
        this.f4690g = 0;
        this.f4687c = false;
        this.f4686b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f4690g = i;
        Iterator it = this.f4692k.iterator();
        while (it.hasNext()) {
            InterfaceC0369d interfaceC0369d = (InterfaceC0369d) it.next();
            interfaceC0369d.a(interfaceC0369d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4688d.f4707b.f4561h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.f4690g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4693l.size());
        sb.append(":d=");
        sb.append(this.f4692k.size());
        sb.append(">");
        return sb.toString();
    }
}
