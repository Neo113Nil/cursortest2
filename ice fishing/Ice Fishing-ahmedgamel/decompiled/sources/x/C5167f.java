package x;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5167f implements InterfaceC5165d {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5177p f41775d;

    /* renamed from: f, reason: collision with root package name */
    public int f41777f;

    /* renamed from: g, reason: collision with root package name */
    public int f41778g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5177p f41772a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41773b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41774c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f41776e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f41779h = 1;
    public C5168g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41780j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f41781k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f41782l = new ArrayList();

    public C5167f(AbstractC5177p abstractC5177p) {
        this.f41775d = abstractC5177p;
    }

    @Override // x.InterfaceC5165d
    public final void a(InterfaceC5165d interfaceC5165d) {
        ArrayList arrayList = this.f41782l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C5167f) it.next()).f41780j) {
                return;
            }
        }
        this.f41774c = true;
        AbstractC5177p abstractC5177p = this.f41772a;
        if (abstractC5177p != null) {
            abstractC5177p.a(this);
        }
        if (this.f41773b) {
            this.f41775d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C5167f c5167f = null;
        int i = 0;
        while (it2.hasNext()) {
            C5167f c5167f2 = (C5167f) it2.next();
            if (!(c5167f2 instanceof C5168g)) {
                i++;
                c5167f = c5167f2;
            }
        }
        if (c5167f != null && i == 1 && c5167f.f41780j) {
            C5168g c5168g = this.i;
            if (c5168g != null) {
                if (!c5168g.f41780j) {
                    return;
                } else {
                    this.f41777f = this.f41779h * c5168g.f41778g;
                }
            }
            d(c5167f.f41778g + this.f41777f);
        }
        AbstractC5177p abstractC5177p2 = this.f41772a;
        if (abstractC5177p2 != null) {
            abstractC5177p2.a(this);
        }
    }

    public final void b(AbstractC5177p abstractC5177p) {
        this.f41781k.add(abstractC5177p);
        if (this.f41780j) {
            abstractC5177p.a(abstractC5177p);
        }
    }

    public final void c() {
        this.f41782l.clear();
        this.f41781k.clear();
        this.f41780j = false;
        this.f41778g = 0;
        this.f41774c = false;
        this.f41773b = false;
    }

    public void d(int i) {
        if (this.f41780j) {
            return;
        }
        this.f41780j = true;
        this.f41778g = i;
        Iterator it = this.f41781k.iterator();
        while (it.hasNext()) {
            InterfaceC5165d interfaceC5165d = (InterfaceC5165d) it.next();
            interfaceC5165d.a(interfaceC5165d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41775d.f41797b.f41297h0);
        sb.append(":");
        switch (this.f41776e) {
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
        sb.append(this.f41780j ? Integer.valueOf(this.f41778g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f41782l.size());
        sb.append(":d=");
        sb.append(this.f41781k.size());
        sb.append(">");
        return sb.toString();
    }
}
