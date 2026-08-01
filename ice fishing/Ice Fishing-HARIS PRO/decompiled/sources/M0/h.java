package M0;

import D1.q;
import F.o;
import V.p;
import V.w;
import V.x;
import a.AbstractC0078a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.layout.s;
import androidx.window.layout.t;
import androidx.window.layout.u;
import androidx.window.layout.z;
import c0.AbstractC0121b;
import c0.C0122c;
import d0.C0127b;
import h.J;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import l0.C0233d;
import m.C0281u;
import m.T;
import x.C0367b;
import z.C0384f;

/* loaded from: classes.dex */
public final class h {
    public static h e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f615a;

    /* renamed from: b, reason: collision with root package name */
    public Object f616b;

    /* renamed from: c, reason: collision with root package name */
    public Object f617c;

    /* renamed from: d, reason: collision with root package name */
    public Object f618d;

    public /* synthetic */ h() {
        this.f615a = 8;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        x[] xVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xVarArr = (x[]) editable.getSpans(selectionStart, selectionEnd, x.class)) != null && xVarArr.length > 0) {
            for (x xVar : xVarArr) {
                int spanStart = editable.getSpanStart(xVar);
                int spanEnd = editable.getSpanEnd(xVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static h i(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new h(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public ColorStateList b(int i) {
        int resourceId;
        ColorStateList z2;
        TypedArray typedArray = (TypedArray) this.f617c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = AbstractC0078a.z((Context) this.f616b, resourceId)) == null) ? typedArray.getColorStateList(i) : z2;
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f617c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : h0.f.n((Context) this.f616b, resourceId);
    }

    public Drawable d(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f617c).hasValue(i) || (resourceId = ((TypedArray) this.f617c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0281u a2 = C0281u.a();
        Context context = (Context) this.f616b;
        synchronized (a2) {
            d2 = a2.f4028a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface e(int i, int i2, T t2) {
        int resourceId = ((TypedArray) this.f617c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f618d) == null) {
            this.f618d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f618d;
        ThreadLocal threadLocal = o.f221a;
        Context context = (Context) this.f616b;
        if (context.isRestricted()) {
            return null;
        }
        return o.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    public Q f(D1.e eVar, String str) {
        boolean isInstance;
        Q g2;
        D1.i.e(str, "key");
        U u2 = (U) this.f616b;
        u2.getClass();
        LinkedHashMap linkedHashMap = u2.f2025a;
        Q q2 = (Q) linkedHashMap.get(str);
        Class cls = eVar.f161a;
        D1.i.e(cls, "jClass");
        Map map = D1.e.f158b;
        D1.i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = q.b(num.intValue(), q2);
        } else {
            if (cls.isPrimitive()) {
                cls = AbstractC0078a.G(D1.o.a(cls));
            }
            isInstance = cls.isInstance(q2);
        }
        androidx.lifecycle.T t2 = (androidx.lifecycle.T) this.f617c;
        if (isInstance) {
            if (t2 instanceof O) {
                O o2 = (O) t2;
                D1.i.b(q2);
                C0103u c0103u = o2.f2019d;
                if (c0103u != null) {
                    C0233d c0233d = o2.e;
                    D1.i.b(c0233d);
                    L.a(q2, c0233d, c0103u);
                }
            }
            D1.i.c(q2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return q2;
        }
        C0122c c0122c = new C0122c((AbstractC0121b) this.f618d);
        c0122c.f2340a.put(C0127b.f2835a, str);
        try {
            try {
                g2 = t2.m(eVar, c0122c);
            } catch (AbstractMethodError unused) {
                g2 = t2.u(AbstractC0078a.F(eVar), c0122c);
            }
        } catch (AbstractMethodError unused2) {
            g2 = t2.g(AbstractC0078a.F(eVar));
        }
        D1.i.e(g2, "viewModel");
        Q q3 = (Q) linkedHashMap.put(str, g2);
        if (q3 != null) {
            q3.a();
        }
        return g2;
    }

    public boolean g(CharSequence charSequence, int i, int i2, w wVar) {
        if ((wVar.f1251c & 3) == 0) {
            V.d dVar = (V.d) this.f618d;
            W.a c2 = wVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.f839d).getShort(a2 + c2.f836a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = V.d.f1204b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f1205a;
            String sb2 = sb.toString();
            int i3 = G.d.f265a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i4 = wVar.f1251c & 4;
            wVar.f1251c = hasGlyph ? i4 | 2 : i4 | 1;
        }
        return (wVar.f1251c & 3) == 2;
    }

    public boolean h(int i, w.d dVar, C0384f c0384f) {
        int[] iArr = dVar.f4575p0;
        int i2 = iArr[0];
        C0367b c0367b = (C0367b) this.f617c;
        c0367b.f4669a = i2;
        c0367b.f4670b = iArr[1];
        c0367b.f4671c = dVar.q();
        c0367b.f4672d = dVar.k();
        c0367b.i = false;
        c0367b.j = i;
        boolean z2 = c0367b.f4669a == 3;
        boolean z3 = c0367b.f4670b == 3;
        boolean z4 = z2 && dVar.f4543W > RecyclerView.f2111C0;
        boolean z5 = z3 && dVar.f4543W > RecyclerView.f2111C0;
        int[] iArr2 = dVar.f4579t;
        if (z4 && iArr2[0] == 4) {
            c0367b.f4669a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0367b.f4670b = 1;
        }
        c0384f.b(dVar, c0367b);
        dVar.O(c0367b.e);
        dVar.L(c0367b.f4673f);
        dVar.f4526E = c0367b.f4675h;
        dVar.I(c0367b.f4674g);
        c0367b.j = 0;
        return c0367b.i;
    }

    public void j(Activity activity, z zVar) {
        D1.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f617c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f618d;
        try {
            if (zVar.equals((z) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((u) ((s) this.f616b).f2248b).f2255b.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.f2249a.equals(activity)) {
                    tVar.f2251c = zVar;
                    tVar.f2250b.accept(zVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object k(CharSequence charSequence, int i, int i2, int i3, boolean z2, p pVar) {
        int i4;
        char c2;
        V.q qVar = new V.q((V.t) ((B.k) this.f617c).f30c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f1231c.f1242a;
                V.t tVar = sparseArray == null ? null : (V.t) sparseArray.get(codePointAt);
                if (qVar.f1229a == 2) {
                    if (tVar != null) {
                        qVar.f1231c = tVar;
                        qVar.f1233f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            V.t tVar2 = qVar.f1231c;
                            if (tVar2.f1243b != null) {
                                if (qVar.f1233f != 1) {
                                    qVar.f1232d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.f1232d = qVar.f1231c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                                c2 = 3;
                            } else {
                                qVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (tVar == null) {
                    qVar.a();
                    c2 = 1;
                } else {
                    qVar.f1229a = 2;
                    qVar.f1231c = tVar;
                    qVar.f1233f = 1;
                    c2 = 2;
                }
                qVar.e = codePointAt;
                if (c2 == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c2 == 3) {
                    if (z2 || !g(charSequence, i4, i6, qVar.f1232d.f1243b)) {
                        z3 = pVar.a(charSequence, i4, i6, qVar.f1232d.f1243b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f1229a == 2 && qVar.f1231c.f1243b != null && ((qVar.f1233f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !g(charSequence, i4, i6, qVar.f1231c.f1243b)))) {
            pVar.a(charSequence, i4, i6, qVar.f1231c.f1243b);
        }
        return pVar.b();
    }

    public void l() {
        ((TypedArray) this.f617c).recycle();
    }

    public void m(w.e eVar, int i, int i2, int i3) {
        eVar.getClass();
        int i4 = eVar.f4550b0;
        int i5 = eVar.f4552c0;
        eVar.f4550b0 = 0;
        eVar.f4552c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f4550b0 = 0;
        } else {
            eVar.f4550b0 = i4;
        }
        if (i5 < 0) {
            eVar.f4552c0 = 0;
        } else {
            eVar.f4552c0 = i5;
        }
        w.e eVar2 = (w.e) this.f618d;
        eVar2.f4599t0 = i;
        eVar2.U();
    }

    public void n(w.e eVar) {
        ArrayList arrayList = (ArrayList) this.f616b;
        arrayList.clear();
        int size = eVar.f4597q0.size();
        for (int i = 0; i < size; i++) {
            w.d dVar = (w.d) eVar.f4597q0.get(i);
            int[] iArr = dVar.f4575p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.s0.f4679b = true;
    }

    public String toString() {
        switch (this.f615a) {
            case 5:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f616b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f617c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f618d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                D1.i.d(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public h(U u2, androidx.lifecycle.T t2, AbstractC0121b abstractC0121b) {
        this.f615a = 4;
        D1.i.e(u2, "store");
        D1.i.e(abstractC0121b, "extras");
        this.f616b = u2;
        this.f617c = t2;
        this.f618d = abstractC0121b;
    }

    public h(b bVar, View view) {
        Object eVar;
        this.f615a = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            eVar = new g();
        } else {
            eVar = i >= 33 ? new e() : null;
        }
        this.f616b = eVar;
        this.f617c = bVar;
        this.f618d = view;
    }

    public h(Intent intent) {
        this.f615a = 5;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f616b = data;
        this.f617c = action;
        this.f618d = type;
    }

    public h(Method method, Method method2, Method method3) {
        this.f615a = 10;
        this.f616b = method;
        this.f617c = method2;
        this.f618d = method3;
    }

    public h(Runnable runnable) {
        this.f615a = 1;
        this.f617c = new CopyOnWriteArrayList();
        this.f618d = new HashMap();
        this.f616b = runnable;
    }

    public h(Context context, TypedArray typedArray) {
        this.f615a = 7;
        this.f616b = context;
        this.f617c = typedArray;
    }

    public h(Context context, LocationManager locationManager) {
        this.f615a = 6;
        this.f618d = new J();
        this.f616b = context;
        this.f617c = locationManager;
    }

    public h(w.e eVar) {
        this.f615a = 9;
        this.f616b = new ArrayList();
        this.f617c = new C0367b();
        this.f618d = eVar;
    }

    public h(B.k kVar, S0.e eVar, V.d dVar, Set set) {
        this.f615a = 2;
        this.f616b = eVar;
        this.f617c = kVar;
        this.f618d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new Q1.u(str, 1));
        }
    }

    public h(s sVar) {
        this.f615a = 3;
        this.f616b = sVar;
        this.f617c = new ReentrantLock();
        this.f618d = new WeakHashMap();
    }
}
