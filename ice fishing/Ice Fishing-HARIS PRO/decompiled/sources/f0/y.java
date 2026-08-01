package f0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.NavGraphNavigator;
import g0.AbstractC0156a;
import java.util.ArrayList;
import java.util.Iterator;
import r.C0343k;

/* loaded from: classes.dex */
public final class y extends w implements Iterable, E1.a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2998n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final C0343k f2999k;

    /* renamed from: l, reason: collision with root package name */
    public int f3000l;

    /* renamed from: m, reason: collision with root package name */
    public String f3001m;

    public y(NavGraphNavigator navGraphNavigator) {
        super(navGraphNavigator);
        this.f2999k = new C0343k(0);
    }

    @Override // f0.w
    public final u d(M0.h hVar) {
        return h(hVar, false, this);
    }

    @Override // f0.w
    public final void e(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC0156a.f3060d);
        D1.i.d(obtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f2994h) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        this.f3000l = resourceId;
        this.f3001m = null;
        if (resourceId <= 16777215) {
            valueOf = String.valueOf(resourceId);
        } else {
            try {
                valueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(resourceId);
            }
            D1.i.d(valueOf, "try {\n                  …tring()\n                }");
        }
        this.f3001m = valueOf;
        obtainAttributes.recycle();
    }

    @Override // f0.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        if (super.equals(obj)) {
            C0343k c0343k = this.f2999k;
            int e = c0343k.e();
            y yVar = (y) obj;
            C0343k c0343k2 = yVar.f2999k;
            if (e == c0343k2.e() && this.f3000l == yVar.f3000l) {
                for (w wVar : J1.h.e0(new D1.a(2, c0343k))) {
                    if (!wVar.equals(c0343k2.b(wVar.f2994h))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(w wVar) {
        D1.i.e(wVar, "node");
        int i = wVar.f2994h;
        String str = wVar.i;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.i;
        if (str2 != null && D1.i.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + wVar + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.f2994h) {
            throw new IllegalArgumentException(("Destination " + wVar + " cannot have the same id as graph " + this).toString());
        }
        C0343k c0343k = this.f2999k;
        w wVar2 = (w) c0343k.b(i);
        if (wVar2 == wVar) {
            return;
        }
        if (wVar.f2989b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (wVar2 != null) {
            wVar2.f2989b = null;
        }
        wVar.f2989b = this;
        c0343k.d(wVar.f2994h, wVar);
    }

    public final w g(int i, w wVar, w wVar2, boolean z2) {
        C0343k c0343k = this.f2999k;
        w wVar3 = (w) c0343k.b(i);
        if (wVar2 != null) {
            if (D1.i.a(wVar3, wVar2) && D1.i.a(wVar3.f2989b, wVar2.f2989b)) {
                return wVar3;
            }
            wVar3 = null;
        } else if (wVar3 != null) {
            return wVar3;
        }
        if (z2) {
            Iterator it = J1.h.e0(new D1.a(2, c0343k)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    wVar3 = null;
                    break;
                }
                w wVar4 = (w) it.next();
                wVar3 = (!(wVar4 instanceof y) || D1.i.a(wVar4, wVar)) ? null : ((y) wVar4).g(i, this, wVar2, true);
                if (wVar3 != null) {
                    break;
                }
            }
        }
        if (wVar3 != null) {
            return wVar3;
        }
        y yVar = this.f2989b;
        if (yVar == null || yVar.equals(wVar)) {
            return null;
        }
        y yVar2 = this.f2989b;
        D1.i.b(yVar2);
        return yVar2.g(i, this, wVar2, z2);
    }

    public final u h(M0.h hVar, boolean z2, y yVar) {
        u uVar;
        u d2 = super.d(hVar);
        ArrayList arrayList = new ArrayList();
        x xVar = new x(this);
        while (true) {
            if (!xVar.hasNext()) {
                break;
            }
            w wVar = (w) xVar.next();
            uVar = D1.i.a(wVar, yVar) ? null : wVar.d(hVar);
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        u uVar2 = (u) u1.g.T(arrayList);
        y yVar2 = this.f2989b;
        if (yVar2 != null && z2 && !yVar2.equals(yVar)) {
            uVar = yVar2.h(hVar, true, this);
        }
        u[] uVarArr = {d2, uVar2, uVar};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 3; i++) {
            u uVar3 = uVarArr[i];
            if (uVar3 != null) {
                arrayList2.add(uVar3);
            }
        }
        return (u) u1.g.T(arrayList2);
    }

    @Override // f0.w
    public final int hashCode() {
        int i = this.f3000l;
        C0343k c0343k = this.f2999k;
        int e = c0343k.e();
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 31) + c0343k.c(i2)) * 31) + ((w) c0343k.f(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new x(this);
    }

    @Override // f0.w
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        w g2 = g(this.f3000l, this, null, false);
        sb.append(" startDestination=");
        if (g2 == null) {
            String str = this.f3001m;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.f3000l));
            }
        } else {
            sb.append("{");
            sb.append(g2.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
