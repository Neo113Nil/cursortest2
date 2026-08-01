package F;

import O.AbstractC0049z;
import O.C0038n;
import O.InterfaceC0039o;
import O.K;
import O.N;
import O.j0;
import V.w;
import V.x;
import V.z;
import Z.AbstractComponentCallbacksC0070s;
import Z.M;
import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import b.C0108d;
import h.AbstractActivityC0168i;
import h.LayoutInflaterFactory2C0159B;
import h.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractC0177a;
import k.C0181e;
import k0.I;
import k0.b0;
import k0.h0;
import k0.k0;
import k0.l0;
import l.MenuC0213B;
import l.MenuC0229m;
import m0.C0295c;
import m0.C0297e;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0330a;
import r.AbstractC0341i;
import r.C0340h;
import r.C0342j;
import z.C0380b;
import z.C0387i;
import z.C0392n;

/* loaded from: classes.dex */
public final class i implements InterfaceC0039o, V.p, O1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207a;

    /* renamed from: b, reason: collision with root package name */
    public Object f208b;

    /* renamed from: c, reason: collision with root package name */
    public Object f209c;

    public /* synthetic */ i(int i, Object obj) {
        this.f207a = i;
        this.f209c = obj;
    }

    public static int v(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A(int i, int i2) {
        int[] iArr = (int[]) this.f208b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f208b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f208b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f209c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h0 h0Var = (h0) ((ArrayList) this.f209c).get(size);
            int i4 = h0Var.f3498a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f209c).remove(size);
                } else {
                    h0Var.f3498a = i4 - i2;
                }
            }
        }
    }

    public void B(AbstractC0177a abstractC0177a) {
        B.k kVar = (B.k) this.f208b;
        ((ActionMode.Callback) kVar.f28a).onDestroyActionMode(kVar.g(abstractC0177a));
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) this.f209c;
        if (layoutInflaterFactory2C0159B.f3125w != null) {
            layoutInflaterFactory2C0159B.f3114l.getDecorView().removeCallbacks(layoutInflaterFactory2C0159B.f3126x);
        }
        if (layoutInflaterFactory2C0159B.f3124v != null) {
            N n2 = layoutInflaterFactory2C0159B.f3127y;
            if (n2 != null) {
                n2.b();
            }
            N a2 = K.a(layoutInflaterFactory2C0159B.f3124v);
            a2.a(RecyclerView.f2111C0);
            layoutInflaterFactory2C0159B.f3127y = a2;
            a2.d(new s(2, this));
        }
        layoutInflaterFactory2C0159B.f3123u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0159B.f3081A;
        WeakHashMap weakHashMap = K.f747a;
        AbstractC0049z.c(viewGroup);
        layoutInflaterFactory2C0159B.H();
    }

    public boolean C(AbstractC0177a abstractC0177a, MenuC0229m menuC0229m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0159B) this.f209c).f3081A;
        WeakHashMap weakHashMap = K.f747a;
        AbstractC0049z.c(viewGroup);
        B.k kVar = (B.k) this.f208b;
        C0181e g2 = kVar.g(abstractC0177a);
        C0342j c0342j = (C0342j) kVar.f29b;
        Menu menu = (Menu) c0342j.get(menuC0229m);
        if (menu == null) {
            menu = new MenuC0213B((Context) kVar.f31d, menuC0229m);
            c0342j.put(menuC0229m, menu);
        }
        return ((ActionMode.Callback) kVar.f28a).onPrepareActionMode(g2, menu);
    }

    public void D(L.h hVar) {
        int i = hVar.f426b;
        K.e eVar = (K.e) this.f209c;
        B.b bVar = (B.b) this.f208b;
        if (i != 0) {
            eVar.execute(new L.a(i, 0, bVar));
        } else {
            eVar.execute(new D.b(bVar, 3, hVar.f425a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C0387i c0387i;
        char c2;
        C0392n c0392n = new C0392n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c0387i = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    c0387i = C0392n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0387i = C0392n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0387i = C0392n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0387i.f4871d.f4899a = true;
                                    break;
                                case 3:
                                    c0387i = C0392n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0387i.f4871d.f4913h0 = 1;
                                    break;
                                case 4:
                                    if (c0387i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0387i.f4869b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0387i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0387i.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0387i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0387i.f4871d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0387i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0387i.f4870c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0387i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0380b.a(context, xmlResourceParser, c0387i.f4872f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f209c).put(identifier, c0392n);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                c0392n.f4963c.put(Integer.valueOf(c0387i.f4868a), c0387i);
                                c0387i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f209c).put(identifier, c0392n);
                return;
            }
        }
    }

    public C0038n F(b0 b0Var, int i) {
        l0 l0Var;
        C0038n c0038n;
        C0342j c0342j = (C0342j) this.f208b;
        int d2 = c0342j.d(b0Var);
        if (d2 >= 0 && (l0Var = (l0) c0342j.i(d2)) != null) {
            int i2 = l0Var.f3541a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                l0Var.f3541a = i3;
                if (i == 4) {
                    c0038n = l0Var.f3542b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0038n = l0Var.f3543c;
                }
                if ((i3 & 12) == 0) {
                    c0342j.g(d2);
                    l0Var.f3541a = 0;
                    l0Var.f3542b = null;
                    l0Var.f3543c = null;
                    l0.f3540d.c(l0Var);
                }
                return c0038n;
            }
        }
        return null;
    }

    public void G(b0 b0Var) {
        l0 l0Var = (l0) ((C0342j) this.f208b).get(b0Var);
        if (l0Var == null) {
            return;
        }
        l0Var.f3541a &= -2;
    }

    public void H(b0 b0Var) {
        C0340h c0340h = (C0340h) this.f209c;
        int e = c0340h.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (b0Var == c0340h.f(e)) {
                Object[] objArr = c0340h.f4316c;
                Object obj = objArr[e];
                Object obj2 = AbstractC0341i.f4318a;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    c0340h.f4314a = true;
                }
            } else {
                e--;
            }
        }
        l0 l0Var = (l0) ((C0342j) this.f208b).remove(b0Var);
        if (l0Var != null) {
            l0Var.f3541a = 0;
            l0Var.f3542b = null;
            l0Var.f3543c = null;
            l0.f3540d.c(l0Var);
        }
    }

    public void I(int i, int i2, int i3, int i4) {
        AbstractC0330a abstractC0330a = (AbstractC0330a) this.f209c;
        abstractC0330a.f4223d.set(i, i2, i3, i4);
        Rect rect = abstractC0330a.f4222c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void J() {
        Integer num;
        C0108d c0108d = (C0108d) this.f209c;
        ArrayList arrayList = c0108d.f2271d;
        String str = (String) this.f208b;
        if (!arrayList.contains(str) && (num = (Integer) c0108d.f2269b.remove(str)) != null) {
            c0108d.f2268a.remove(num);
        }
        c0108d.e.remove(str);
        HashMap hashMap = c0108d.f2272f;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = c0108d.f2273g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        if (c0108d.f2270c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // V.p
    public boolean a(CharSequence charSequence, int i, int i2, w wVar) {
        if ((wVar.f1251c & 4) > 0) {
            return true;
        }
        if (((z) this.f208b) == null) {
            this.f208b = new z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((S0.e) this.f209c).getClass();
        ((z) this.f208b).setSpan(new x(wVar), i, i2, 33);
        return true;
    }

    @Override // V.p
    public Object b() {
        return (z) this.f208b;
    }

    public void c(b0 b0Var, C0038n c0038n) {
        C0342j c0342j = (C0342j) this.f208b;
        l0 l0Var = (l0) c0342j.get(b0Var);
        if (l0Var == null) {
            l0Var = l0.a();
            c0342j.put(b0Var, l0Var);
        }
        l0Var.f3543c = c0038n;
        l0Var.f3541a |= 8;
    }

    public void d() {
        int[] iArr = (int[]) this.f208b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f209c = null;
    }

    public void e(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void f(boolean z2) {
        M m2 = (M) this.f209c;
        AbstractActivityC0168i abstractActivityC0168i = m2.f1452u.f1629b;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = m2.f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z2) {
        M m2 = (M) this.f209c;
        AbstractActivityC0168i abstractActivityC0168i = m2.f1452u.f1629b;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = m2.f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void l(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void p(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((M) this.f209c).f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            abstractComponentCallbacksC0070s.j().f1444m.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f208b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // O.InterfaceC0039o
    public j0 s(View view, j0 j0Var) {
        L0.p pVar = new L0.p();
        L0.p pVar2 = (L0.p) this.f209c;
        pVar.f520a = pVar2.f520a;
        pVar.f521b = pVar2.f521b;
        pVar.f522c = pVar2.f522c;
        pVar.f523d = pVar2.f523d;
        return ((L0.o) this.f208b).a(view, j0Var, pVar);
    }

    public void t(int i) {
        int[] iArr = (int[]) this.f208b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f208b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f208b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f208b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f207a) {
            case 3:
                return "Bounds{lower=" + ((G.c) this.f208b) + " upper=" + ((G.c) this.f209c) + "}";
            case 16:
                String str = "[ ";
                if (((u.f) this.f208b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((u.f) this.f208b).f4427h[i] + " ";
                    }
                }
                return str + "] " + ((u.f) this.f208b);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        View u2;
        I i5 = (I) this.f208b;
        int d2 = i5.d();
        int c2 = i5.c();
        int i6 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (i5.f3378a) {
                case 0:
                    u2 = i5.f3379b.u(i);
                    break;
                default:
                    u2 = i5.f3379b.u(i);
                    break;
            }
            int b2 = i5.b(u2);
            int a2 = i5.a(u2);
            k0 k0Var = (k0) this.f209c;
            k0Var.f3536b = d2;
            k0Var.f3537c = c2;
            k0Var.f3538d = b2;
            k0Var.e = a2;
            if (i3 != 0) {
                k0Var.f3535a = i3;
                if (k0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                k0Var.f3535a = i4;
                if (k0Var.a()) {
                    view = u2;
                }
            }
            i += i6;
        }
        return view;
    }

    @Override // O1.e
    public Object w(O1.f fVar, v1.d dVar) {
        Object w2 = ((B.b) this.f208b).w(new C0295c(fVar, (C0297e) this.f209c), dVar);
        return w2 == w1.a.f4662a ? w2 : t1.i.f4388c;
    }

    public void x() {
        ((SparseIntArray) this.f208b).clear();
    }

    public boolean y(View view) {
        I i = (I) this.f208b;
        int d2 = i.d();
        int c2 = i.c();
        int b2 = i.b(view);
        int a2 = i.a(view);
        k0 k0Var = (k0) this.f209c;
        k0Var.f3536b = d2;
        k0Var.f3537c = c2;
        k0Var.f3538d = b2;
        k0Var.e = a2;
        k0Var.f3535a = 24579;
        return k0Var.a();
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f208b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f208b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f208b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f209c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h0 h0Var = (h0) ((ArrayList) this.f209c).get(size);
            int i4 = h0Var.f3498a;
            if (i4 >= i) {
                h0Var.f3498a = i4 + i2;
            }
        }
    }

    public /* synthetic */ i(int i, boolean z2) {
        this.f207a = i;
    }

    public /* synthetic */ i(Object obj, int i, Object obj2) {
        this.f207a = i;
        this.f208b = obj;
        this.f209c = obj2;
    }

    public /* synthetic */ i(Object obj, Object obj2, int i, boolean z2) {
        this.f207a = i;
        this.f209c = obj;
        this.f208b = obj2;
    }

    public i(M m2) {
        this.f207a = 7;
        this.f208b = new CopyOnWriteArrayList();
        this.f209c = m2;
    }

    public i(I i) {
        this.f207a = 12;
        this.f208b = i;
        k0 k0Var = new k0();
        k0Var.f3535a = 0;
        this.f209c = k0Var;
    }

    public i(Animation animation) {
        this.f207a = 6;
        this.f208b = animation;
        this.f209c = null;
    }

    public i(Animator animator) {
        this.f207a = 6;
        this.f208b = null;
        this.f209c = animator;
    }

    public i(ArrayList arrayList, ArrayList arrayList2) {
        this.f207a = 0;
        int size = arrayList.size();
        this.f208b = new int[size];
        this.f209c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f208b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f209c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public i(int i, int i2) {
        this.f207a = 0;
        this.f208b = new int[]{i, i2};
        this.f209c = new float[]{RecyclerView.f2111C0, 1.0f};
    }

    public i(int i, int i2, int i3) {
        this.f207a = 0;
        this.f208b = new int[]{i, i2, i3};
        this.f209c = new float[]{RecyclerView.f2111C0, 0.5f, 1.0f};
    }

    public i(EditText editText) {
        this.f207a = 5;
        this.f208b = editText;
        X.i iVar = new X.i(editText);
        this.f209c = iVar;
        editText.addTextChangedListener(iVar);
        if (X.a.f1375b == null) {
            synchronized (X.a.f1374a) {
                try {
                    if (X.a.f1375b == null) {
                        X.a aVar = new X.a();
                        try {
                            X.a.f1376c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, X.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        X.a.f1375b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(X.a.f1375b);
    }

    public i(int i) {
        this.f207a = i;
        switch (i) {
            case 13:
                this.f208b = new C0342j(0);
                this.f209c = new C0340h();
                break;
            default:
                this.f208b = new SparseIntArray();
                this.f209c = new SparseIntArray();
                break;
        }
    }
}
