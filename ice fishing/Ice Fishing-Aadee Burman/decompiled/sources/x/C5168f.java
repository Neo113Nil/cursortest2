package x;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5168f implements InterfaceC5166d {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5178p f41717d;

    /* renamed from: f, reason: collision with root package name */
    public int f41719f;

    /* renamed from: g, reason: collision with root package name */
    public int f41720g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5178p f41714a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41715b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41716c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f41718e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f41721h = 1;
    public C5169g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41722j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f41723k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f41724l = new ArrayList();

    public C5168f(AbstractC5178p abstractC5178p) {
        this.f41717d = abstractC5178p;
    }

    @Override // x.InterfaceC5166d
    public final void a(InterfaceC5166d interfaceC5166d) {
        ArrayList arrayList = this.f41724l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C5168f) it.next()).f41722j) {
                return;
            }
        }
        this.f41716c = true;
        AbstractC5178p abstractC5178p = this.f41714a;
        if (abstractC5178p != null) {
            abstractC5178p.a(this);
        }
        if (this.f41715b) {
            this.f41717d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C5168f c5168f = null;
        int i = 0;
        while (it2.hasNext()) {
            C5168f c5168f2 = (C5168f) it2.next();
            if (!(c5168f2 instanceof C5169g)) {
                i++;
                c5168f = c5168f2;
            }
        }
        if (c5168f != null && i == 1 && c5168f.f41722j) {
            C5169g c5169g = this.i;
            if (c5169g != null) {
                if (!c5169g.f41722j) {
                    return;
                } else {
                    this.f41719f = this.f41721h * c5169g.f41720g;
                }
            }
            d(c5168f.f41720g + this.f41719f);
        }
        AbstractC5178p abstractC5178p2 = this.f41714a;
        if (abstractC5178p2 != null) {
            abstractC5178p2.a(this);
        }
    }

    public final void b(AbstractC5178p abstractC5178p) {
        this.f41723k.add(abstractC5178p);
        if (this.f41722j) {
            abstractC5178p.a(abstractC5178p);
        }
    }

    public final void c() {
        this.f41724l.clear();
        this.f41723k.clear();
        this.f41722j = false;
        this.f41720g = 0;
        this.f41716c = false;
        this.f41715b = false;
    }

    public void d(int i) {
        if (this.f41722j) {
            return;
        }
        this.f41722j = true;
        this.f41720g = i;
        Iterator it = this.f41723k.iterator();
        while (it.hasNext()) {
            InterfaceC5166d interfaceC5166d = (InterfaceC5166d) it.next();
            interfaceC5166d.a(interfaceC5166d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41717d.f41739b.f41515h0);
        sb.append(":");
        switch (this.f41718e) {
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
        sb.append(this.f41722j ? Integer.valueOf(this.f41720g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f41724l.size());
        sb.append(":d=");
        sb.append(this.f41723k.size());
        sb.append(">");
        return sb.toString();
    }
}
