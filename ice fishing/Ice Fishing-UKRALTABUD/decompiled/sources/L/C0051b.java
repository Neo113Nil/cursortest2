package L;

import D.C0013n;
import a.AbstractC0069a;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import c0.C0098A;
import d.AbstractC0110a;
import e0.C0126b;
import h.C0174s;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import l0.C0199b;
import l0.C0200c;
import m0.C0203a;
import m0.C0216n;
import m0.InterfaceC0208f;
import m0.InterfaceC0213k;
import m0.InterfaceC0214l;
import org.xmlpull.v1.XmlPullParserException;
import r0.AbstractC0239M;
import r0.C0238L;
import r0.C0247h;
import r0.C0249j;
import r0.InterfaceC0248i;

/* renamed from: L.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051b implements InterfaceC0248i, N0.d {

    /* renamed from: j, reason: collision with root package name */
    public static C0051b f600j;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f601f;

    /* renamed from: g, reason: collision with root package name */
    public Object f602g;

    /* renamed from: h, reason: collision with root package name */
    public Object f603h;

    /* renamed from: i, reason: collision with root package name */
    public Object f604i;

    public /* synthetic */ C0051b(Object obj, Object obj2, Object obj3, int i2) {
        this.f601f = i2;
        this.f603h = obj;
        this.f602g = obj2;
        this.f604i = obj3;
    }

    public static C0051b C() {
        if (f600j == null) {
            E.a aVar = new E.a(15);
            b0.a aVar2 = new b0.a();
            aVar2.f1628a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar2);
            FlutterJNI flutterJNI = new FlutterJNI();
            h0.d dVar = new h0.d();
            dVar.f2324a = false;
            dVar.f2325b = false;
            dVar.f2329f = flutterJNI;
            dVar.f2330g = newCachedThreadPool;
            C0051b c0051b = new C0051b(3);
            c0051b.f603h = dVar;
            c0051b.f602g = aVar;
            c0051b.f604i = newCachedThreadPool;
            f600j = c0051b;
        }
        return f600j;
    }

    public static C0051b E(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0051b(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public int A() {
        return ((RecyclerView) ((A.j) this.f603h).f30g).getChildCount();
    }

    public boolean B(KeyEvent keyEvent) {
        if (((HashSet) this.f602g).remove(keyEvent)) {
            return false;
        }
        c0.B[] bArr = (c0.B[]) this.f603h;
        if (bArr.length <= 0) {
            F(keyEvent);
            return true;
        }
        C0098A c0098a = new C0098A(this, keyEvent);
        for (c0.B b2 : bArr) {
            b2.b(keyEvent, new c0.z(c0098a));
        }
        return true;
    }

    public void D(String str, Object obj, l0.k kVar) {
        ((InterfaceC0208f) this.f603h).l((String) this.f602g, ((InterfaceC0214l) this.f604i).b(new Q(22, str, obj)), kVar == null ? null : new C0203a(1, this, kVar));
    }

    public void F(KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        c0.r rVar = (c0.r) this.f604i;
        if (rVar != null) {
            io.flutter.plugin.editing.l lVar = rVar.f1743q;
            boolean z2 = false;
            if (lVar.f2425b.isAcceptingText() && (cVar = lVar.f2433j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z2 = cVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z2 = cVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z2 = cVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z2 = cVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        EditorInfo editorInfo = cVar.f2385e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & 255);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f2384d;
                    int selectionStart = Selection.getSelectionStart(fVar);
                    int selectionEnd = Selection.getSelectionEnd(fVar);
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                        int min = Math.min(selectionStart, selectionEnd);
                        int max = Math.max(selectionStart, selectionEnd);
                        cVar.beginBatchEdit();
                        if (min != max) {
                            fVar.delete(min, max);
                        }
                        fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                        int i2 = min + 1;
                        cVar.setSelection(i2, i2);
                        cVar.endBatchEdit();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                return;
            }
            HashSet hashSet = (HashSet) this.f602g;
            hashSet.add(keyEvent);
            rVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void G(Activity activity, U.k kVar) {
        E0.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f602g;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f604i;
        try {
            if (kVar.equals((U.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((X.k) ((A.j) this.f603h).f30g).f1071b.iterator();
            while (it.hasNext()) {
                X.j jVar = (X.j) it.next();
                if (jVar.f1065a.equals(activity)) {
                    jVar.f1067c = kVar;
                    jVar.f1066b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void H() {
        ((TypedArray) this.f602g).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r4 = r3.f1656a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r6[r4] = r2;
        r3.f1656a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            AbstractC0050a abstractC0050a = (AbstractC0050a) arrayList.get(i2);
            abstractC0050a.getClass();
            c0.E e2 = (c0.E) this.f603h;
            e2.getClass();
            E0.i.e(abstractC0050a, "instance");
            int i3 = e2.f1656a;
            int i4 = 0;
            while (true) {
                Object[] objArr = e2.f1657b;
                if (i4 >= i3) {
                    break;
                } else {
                    if (objArr[i4] == abstractC0050a) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
            }
        }
        arrayList.clear();
    }

    public void J(InterfaceC0213k interfaceC0213k) {
        ((InterfaceC0208f) this.f603h).f((String) this.f602g, new Q(this, interfaceC0213k, 23, false));
    }

    @Override // r0.InterfaceC0248i
    public Double a(String str, C0249j c0249j) {
        SharedPreferences s2 = s(c0249j);
        if (!s2.contains(str)) {
            return null;
        }
        Object c2 = AbstractC0239M.c(s2.getString(str, ""), (E.a) this.f604i);
        E0.i.c(c2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c2;
    }

    @Override // r0.InterfaceC0248i
    public void b(String str, boolean z2, C0249j c0249j) {
        s(c0249j).edit().putBoolean(str, z2).apply();
    }

    @Override // r0.InterfaceC0248i
    public r0.P d(String str, C0249j c0249j) {
        SharedPreferences s2 = s(c0249j);
        if (!s2.contains(str)) {
            return null;
        }
        String string = s2.getString(str, "");
        E0.i.b(string);
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new r0.P(string, r0.N.JSON_ENCODED) : string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new r0.P(null, r0.N.PLATFORM_ENCODED) : new r0.P(null, r0.N.UNEXPECTED_STRING);
    }

    @Override // r0.InterfaceC0248i
    public void e(String str, String str2, C0249j c0249j) {
        s(c0249j).edit().putString(str, str2).apply();
    }

    @Override // r0.InterfaceC0248i
    public Long f(String str, C0249j c0249j) {
        long j2;
        SharedPreferences s2 = s(c0249j);
        if (!s2.contains(str)) {
            return null;
        }
        try {
            j2 = s2.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j2 = s2.getInt(str, 0);
        }
        return Long.valueOf(j2);
    }

    @Override // r0.InterfaceC0248i
    public List g(List list, C0249j c0249j) {
        Map<String, ?> all = s(c0249j).getAll();
        E0.i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            E0.i.d(key, "<get-key>(...)");
            if (AbstractC0239M.b(key, entry.getValue(), list != null ? u0.d.I(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return u0.d.H(linkedHashMap.keySet());
    }

    @Override // r0.InterfaceC0248i
    public void h(String str, long j2, C0249j c0249j) {
        s(c0249j).edit().putLong(str, j2).apply();
    }

    @Override // r0.InterfaceC0248i
    public void i(String str, String str2, C0249j c0249j) {
        s(c0249j).edit().putString(str, str2).apply();
    }

    @Override // r0.InterfaceC0248i
    public void j(String str, List list, C0249j c0249j) {
        s(c0249j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((E.a) this.f604i).d(list))).apply();
    }

    @Override // r0.InterfaceC0248i
    public void k(String str, double d2, C0249j c0249j) {
        s(c0249j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // r0.InterfaceC0248i
    public String l(String str, C0249j c0249j) {
        SharedPreferences s2 = s(c0249j);
        if (s2.contains(str)) {
            return s2.getString(str, "");
        }
        return null;
    }

    @Override // r0.InterfaceC0248i
    public Boolean m(String str, C0249j c0249j) {
        SharedPreferences s2 = s(c0249j);
        if (s2.contains(str)) {
            return Boolean.valueOf(s2.getBoolean(str, true));
        }
        return null;
    }

    @Override // N0.d
    public Object n(N0.e eVar, v0.d dVar) {
        Object n2 = ((N0.d) this.f603h).n(new N0.l(eVar, (G.d) this.f602g, (C0238L) this.f604i), dVar);
        return n2 == w0.a.f3071f ? n2 : t0.g.f2989a;
    }

    @Override // r0.InterfaceC0248i
    public void o(List list, C0249j c0249j) {
        SharedPreferences s2 = s(c0249j);
        SharedPreferences.Editor edit = s2.edit();
        E0.i.d(edit, "edit(...)");
        Map<String, ?> all = s2.getAll();
        E0.i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (AbstractC0239M.b(str, all.get(str), list != null ? u0.d.I(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        E0.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            E0.i.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // r0.InterfaceC0248i
    public Map p(List list, C0249j c0249j) {
        Object value;
        Map<String, ?> all = s(c0249j).getAll();
        E0.i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (AbstractC0239M.b(entry.getKey(), entry.getValue(), list != null ? u0.d.I(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c2 = AbstractC0239M.c(value, (E.a) this.f604i);
                E0.i.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // r0.InterfaceC0248i
    public ArrayList q(String str, C0249j c0249j) {
        List list;
        SharedPreferences s2 = s(c0249j);
        ArrayList arrayList = null;
        if (s2.contains(str)) {
            String string = s2.getString(str, "");
            E0.i.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) AbstractC0239M.c(s2.getString(str, ""), (E.a) this.f604i)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public void r(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f602g;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f604i).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences s(C0249j c0249j) {
        String str = c0249j.f2888a;
        Context context = (Context) this.f602g;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            E0.i.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        E0.i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void t(int i2, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f602g).dispatchSemanticsAction(i2, eVar);
    }

    public String toString() {
        switch (this.f601f) {
            case 1:
                return ((C0052c) this.f604i).toString() + ", hidden list:" + ((ArrayList) this.f602g).size();
            default:
                return super.toString();
        }
    }

    public void u(int i2, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f602g).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public int v(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f604i;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0050a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public ColorStateList w(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f602g;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            Object obj = AbstractC0110a.f1772a;
            ColorStateList colorStateList = ((Context) this.f603h).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public Drawable x(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f602g;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0110a.a((Context) this.f603h, resourceId);
    }

    public Typeface y(int i2, int i3, C0174s c0174s) {
        int i4 = 1;
        int resourceId = ((TypedArray) this.f602g).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f604i) == null) {
            this.f604i = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f604i;
        Object obj = o.f.f2790a;
        Context context = (Context) this.f603h;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            c0174s.a();
            return null;
        }
        int i5 = typedValue.assetCookie;
        k.d dVar = p.d.f2798b;
        Typeface typeface = (Typeface) dVar.a(p.d.b(resources, resourceId, charSequence2, i5, i3));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new J.g(i4, c0174s, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                o.b w2 = AbstractC0069a.w(resources.getXml(resourceId), resources);
                if (w2 != null) {
                    return p.d.a(context, w2, resources, resourceId, charSequence2, typedValue.assetCookie, i3, c0174s);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0174s.a();
                return null;
            }
            int i6 = typedValue.assetCookie;
            Typeface j2 = p.d.f2797a.j(context, resources, resourceId, charSequence2, i3);
            if (j2 != null) {
                dVar.b(p.d.b(resources, resourceId, charSequence2, i6, i3), j2);
            }
            if (j2 != null) {
                new Handler(Looper.getMainLooper()).post(new J.g(i4, c0174s, j2));
            } else {
                c0174s.a();
            }
            return j2;
        } catch (IOException e2) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
            c0174s.a();
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
            c0174s.a();
            return null;
        }
    }

    public View z(int i2) {
        return ((RecyclerView) ((A.j) this.f603h).f30g).getChildAt(i2);
    }

    public C0051b(A.j jVar) {
        this.f601f = 1;
        this.f603h = jVar;
        this.f604i = new C0052c();
        this.f602g = new ArrayList();
    }

    public C0051b(Context context, TypedArray typedArray) {
        this.f601f = 5;
        this.f603h = context;
        this.f602g = typedArray;
    }

    public C0051b(E.a aVar) {
        this.f601f = 0;
        this.f603h = new c0.E(30);
        this.f602g = new ArrayList();
        this.f604i = new ArrayList();
        new E.a(8, this);
    }

    public C0051b(C0126b c0126b, FlutterJNI flutterJNI) {
        this.f601f = 6;
        A.j jVar = new A.j(28, this);
        C0013n c0013n = new C0013n(c0126b, "flutter/accessibility", C0216n.f2771a, null);
        this.f603h = c0013n;
        c0013n.j(jVar);
        this.f602g = flutterJNI;
    }

    public C0051b(c0.r rVar) {
        this.f601f = 4;
        this.f602g = new HashSet();
        this.f604i = rVar;
        this.f603h = new c0.B[]{new c0.y(rVar.getBinaryMessenger()), new Q(new C0199b(rVar.getBinaryMessenger()))};
        new C0200c(rVar.getBinaryMessenger()).f2689g = this;
    }

    public C0051b(int i2) {
        this.f601f = i2;
        switch (i2) {
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f603h = new ConcurrentLinkedQueue();
                break;
        }
    }

    public C0051b(InterfaceC0208f interfaceC0208f, Context context, E.a aVar) {
        this.f601f = 9;
        E0.i.e(interfaceC0208f, "messenger");
        E0.i.e(context, "context");
        this.f603h = interfaceC0208f;
        this.f602g = context;
        this.f604i = aVar;
        try {
            InterfaceC0248i.f2887e.getClass();
            C0247h.b(interfaceC0208f, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public C0051b(A.j jVar, byte b2) {
        this.f601f = 2;
        this.f603h = jVar;
        this.f602g = new ReentrantLock();
        this.f604i = new WeakHashMap();
    }
}
