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
import l0.C0208k;
import m0.C0216a;
import org.xmlpull.v1.XmlPullParserException;
import r0.C0234f;
import r0.C0236h;
import r0.InterfaceC0235g;
import t0.C0252g;

/* renamed from: L.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026b implements InterfaceC0235g, O0.d {

    /* renamed from: i, reason: collision with root package name */
    public static C0026b f522i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f523e;

    /* renamed from: f, reason: collision with root package name */
    public Object f524f;

    /* renamed from: g, reason: collision with root package name */
    public Object f525g;

    /* renamed from: h, reason: collision with root package name */
    public Object f526h;

    public /* synthetic */ C0026b(Object obj, Object obj2, Object obj3, int i2) {
        this.f523e = i2;
        this.f525g = obj;
        this.f524f = obj2;
        this.f526h = obj3;
    }

    public static C0026b C() {
        if (f522i == null) {
            E.a aVar = new E.a(15);
            b0.a aVar2 = new b0.a();
            aVar2.f1636a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar2);
            FlutterJNI flutterJNI = new FlutterJNI();
            h0.d dVar = new h0.d();
            dVar.f2332a = false;
            dVar.f2333b = false;
            dVar.f2337f = flutterJNI;
            dVar.f2338g = newCachedThreadPool;
            C0026b c0026b = new C0026b(3);
            c0026b.f525g = dVar;
            c0026b.f524f = aVar;
            c0026b.f526h = newCachedThreadPool;
            f522i = c0026b;
        }
        return f522i;
    }

    public static C0026b E(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0026b(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public int A() {
        return ((RecyclerView) ((A.j) this.f525g).f30f).getChildCount();
    }

    public boolean B(KeyEvent keyEvent) {
        if (((HashSet) this.f524f).remove(keyEvent)) {
            return false;
        }
        c0.B[] bArr = (c0.B[]) this.f525g;
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

    public void D(String str, Object obj, C0208k c0208k) {
        ((m0.f) this.f525g).m((String) this.f524f, ((m0.l) this.f526h).b(new Q(22, str, obj)), c0208k == null ? null : new C0216a(1, this, c0208k));
    }

    public void F(KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        c0.r rVar = (c0.r) this.f526h;
        if (rVar != null) {
            io.flutter.plugin.editing.l lVar = rVar.f1750p;
            boolean z2 = false;
            if (lVar.f2433b.isAcceptingText() && (cVar = lVar.f2441j) != null && keyEvent.getAction() == 0) {
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
                        EditorInfo editorInfo = cVar.f2393e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & 255);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f2392d;
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
            HashSet hashSet = (HashSet) this.f524f;
            hashSet.add(keyEvent);
            rVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void G(Activity activity, U.k kVar) {
        E0.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f524f;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f526h;
        try {
            if (kVar.equals((U.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((X.k) ((A.j) this.f525g).f30f).f1079b.iterator();
            while (it.hasNext()) {
                X.j jVar = (X.j) it.next();
                if (jVar.f1073a.equals(activity)) {
                    jVar.f1075c = kVar;
                    jVar.f1074b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void H() {
        ((TypedArray) this.f524f).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r4 = r3.f1664a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r6[r4] = r2;
        r3.f1664a = r4 + 1;
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
            AbstractC0025a abstractC0025a = (AbstractC0025a) arrayList.get(i2);
            abstractC0025a.getClass();
            c0.E e2 = (c0.E) this.f525g;
            e2.getClass();
            E0.i.e(abstractC0025a, "instance");
            int i3 = e2.f1664a;
            int i4 = 0;
            while (true) {
                Object[] objArr = e2.f1665b;
                if (i4 >= i3) {
                    break;
                } else {
                    if (objArr[i4] == abstractC0025a) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
            }
        }
        arrayList.clear();
    }

    public void J(m0.k kVar) {
        ((m0.f) this.f525g).f((String) this.f524f, new Q(this, kVar, 23, false));
    }

    @Override // r0.InterfaceC0235g
    public Double a(String str, C0236h c0236h) {
        SharedPreferences s2 = s(c0236h);
        if (!s2.contains(str)) {
            return null;
        }
        Object c2 = r0.K.c(s2.getString(str, ""), (E.a) this.f526h);
        E0.i.c(c2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c2;
    }

    @Override // r0.InterfaceC0235g
    public void b(String str, boolean z2, C0236h c0236h) {
        s(c0236h).edit().putBoolean(str, z2).apply();
    }

    @Override // O0.d
    public Object c(O0.e eVar, v0.d dVar) {
        Object c2 = ((O0.d) this.f525g).c(new O0.l(eVar, (G.d) this.f524f, (r0.J) this.f526h), dVar);
        return c2 == w0.a.f3076e ? c2 : C0252g.f2994a;
    }

    @Override // r0.InterfaceC0235g
    public r0.N d(String str, C0236h c0236h) {
        SharedPreferences s2 = s(c0236h);
        if (!s2.contains(str)) {
            return null;
        }
        String string = s2.getString(str, "");
        E0.i.b(string);
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new r0.N(string, r0.L.JSON_ENCODED) : string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new r0.N(null, r0.L.PLATFORM_ENCODED) : new r0.N(null, r0.L.UNEXPECTED_STRING);
    }

    @Override // r0.InterfaceC0235g
    public void e(String str, String str2, C0236h c0236h) {
        s(c0236h).edit().putString(str, str2).apply();
    }

    @Override // r0.InterfaceC0235g
    public Long f(String str, C0236h c0236h) {
        long j2;
        SharedPreferences s2 = s(c0236h);
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

    @Override // r0.InterfaceC0235g
    public List g(List list, C0236h c0236h) {
        Map<String, ?> all = s(c0236h).getAll();
        E0.i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            E0.i.d(key, "<get-key>(...)");
            if (r0.K.b(key, entry.getValue(), list != null ? u0.d.G(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return u0.d.F(linkedHashMap.keySet());
    }

    @Override // r0.InterfaceC0235g
    public void i(String str, long j2, C0236h c0236h) {
        s(c0236h).edit().putLong(str, j2).apply();
    }

    @Override // r0.InterfaceC0235g
    public void j(String str, String str2, C0236h c0236h) {
        s(c0236h).edit().putString(str, str2).apply();
    }

    @Override // r0.InterfaceC0235g
    public void k(String str, List list, C0236h c0236h) {
        s(c0236h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((E.a) this.f526h).d(list))).apply();
    }

    @Override // r0.InterfaceC0235g
    public void l(String str, double d2, C0236h c0236h) {
        s(c0236h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // r0.InterfaceC0235g
    public String m(String str, C0236h c0236h) {
        SharedPreferences s2 = s(c0236h);
        if (s2.contains(str)) {
            return s2.getString(str, "");
        }
        return null;
    }

    @Override // r0.InterfaceC0235g
    public Boolean n(String str, C0236h c0236h) {
        SharedPreferences s2 = s(c0236h);
        if (s2.contains(str)) {
            return Boolean.valueOf(s2.getBoolean(str, true));
        }
        return null;
    }

    @Override // r0.InterfaceC0235g
    public void o(List list, C0236h c0236h) {
        SharedPreferences s2 = s(c0236h);
        SharedPreferences.Editor edit = s2.edit();
        E0.i.d(edit, "edit(...)");
        Map<String, ?> all = s2.getAll();
        E0.i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (r0.K.b(str, all.get(str), list != null ? u0.d.G(list) : null)) {
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

    @Override // r0.InterfaceC0235g
    public Map p(List list, C0236h c0236h) {
        Object value;
        Map<String, ?> all = s(c0236h).getAll();
        E0.i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (r0.K.b(entry.getKey(), entry.getValue(), list != null ? u0.d.G(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c2 = r0.K.c(value, (E.a) this.f526h);
                E0.i.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // r0.InterfaceC0235g
    public ArrayList q(String str, C0236h c0236h) {
        List list;
        SharedPreferences s2 = s(c0236h);
        ArrayList arrayList = null;
        if (s2.contains(str)) {
            String string = s2.getString(str, "");
            E0.i.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) r0.K.c(s2.getString(str, ""), (E.a) this.f526h)) != null) {
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
        ReentrantLock reentrantLock = (ReentrantLock) this.f524f;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f526h).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences s(C0236h c0236h) {
        String str = c0236h.f2887a;
        Context context = (Context) this.f524f;
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
        ((FlutterJNI) this.f524f).dispatchSemanticsAction(i2, eVar);
    }

    public String toString() {
        switch (this.f523e) {
            case 1:
                return ((C0027c) this.f526h).toString() + ", hidden list:" + ((ArrayList) this.f524f).size();
            default:
                return super.toString();
        }
    }

    public void u(int i2, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f524f).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public int v(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f526h;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0025a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public ColorStateList w(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f524f;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            Object obj = AbstractC0110a.f1780a;
            ColorStateList colorStateList = ((Context) this.f525g).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public Drawable x(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f524f;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0110a.a((Context) this.f525g, resourceId);
    }

    public Typeface y(int i2, int i3, C0174s c0174s) {
        int i4 = 1;
        int resourceId = ((TypedArray) this.f524f).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f526h) == null) {
            this.f526h = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f526h;
        Object obj = o.f.f2798a;
        Context context = (Context) this.f525g;
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
        k.d dVar = p.d.f2806b;
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
            Typeface j2 = p.d.f2805a.j(context, resources, resourceId, charSequence2, i3);
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
        return ((RecyclerView) ((A.j) this.f525g).f30f).getChildAt(i2);
    }

    public C0026b(A.j jVar) {
        this.f523e = 1;
        this.f525g = jVar;
        this.f526h = new C0027c();
        this.f524f = new ArrayList();
    }

    public C0026b(Context context, TypedArray typedArray) {
        this.f523e = 5;
        this.f525g = context;
        this.f524f = typedArray;
    }

    public C0026b(E.a aVar) {
        this.f523e = 0;
        this.f525g = new c0.E(30);
        this.f524f = new ArrayList();
        this.f526h = new ArrayList();
        new E.a(8, this);
    }

    public C0026b(C0126b c0126b, FlutterJNI flutterJNI) {
        this.f523e = 6;
        A.j jVar = new A.j(28, this);
        C0013n c0013n = new C0013n(c0126b, "flutter/accessibility", m0.n.f2779a, null);
        this.f525g = c0013n;
        c0013n.j(jVar);
        this.f524f = flutterJNI;
    }

    public C0026b(c0.r rVar) {
        this.f523e = 4;
        this.f524f = new HashSet();
        this.f526h = rVar;
        this.f525g = new c0.B[]{new c0.y(rVar.getBinaryMessenger()), new Q(new C0199b(rVar.getBinaryMessenger()))};
        new C0200c(rVar.getBinaryMessenger()).f2697f = this;
    }

    public C0026b(int i2) {
        this.f523e = i2;
        switch (i2) {
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f525g = new ConcurrentLinkedQueue();
                break;
        }
    }

    public C0026b(m0.f fVar, Context context, E.a aVar) {
        this.f523e = 9;
        E0.i.e(fVar, "messenger");
        E0.i.e(context, "context");
        this.f525g = fVar;
        this.f524f = context;
        this.f526h = aVar;
        try {
            InterfaceC0235g.f2886d.getClass();
            C0234f.b(fVar, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public C0026b(A.j jVar, byte b2) {
        this.f523e = 2;
        this.f525g = jVar;
        this.f524f = new ReentrantLock();
        this.f526h = new WeakHashMap();
    }
}
