package I0;

import D1.d;
import D1.l;
import F.C0038n;
import N1.n;
import P.AbstractC0052a;
import P.C0053b;
import P0.B;
import P0.t;
import P0.z;
import Q1.A;
import U0.c;
import a1.C0085a;
import a1.C0098n;
import a1.C0099o;
import a1.InterfaceC0090f;
import a1.InterfaceC0095k;
import a1.InterfaceC0096l;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.provider.Settings;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import c0.k;
import d.AbstractC0142a;
import f1.AbstractC0162M;
import f1.C0161L;
import f1.C0166Q;
import f1.C0174h;
import f1.C0176j;
import f1.EnumC0164O;
import f1.InterfaceC0175i;
import h1.C0239i;
import i1.AbstractC0252i;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.i;
import m0.j;
import m1.EnumC0985a;
import org.xmlpull.v1.XmlPullParserException;
import q.InterfaceC1032b;
import q.f;
import u0.AbstractC1050a;
import x.InterfaceC1063a;
import x0.e;
import z1.g;
import z1.o;

/* loaded from: classes.dex */
public final class b implements InterfaceC0095k, InterfaceC0175i, d {

    /* renamed from: e, reason: collision with root package name */
    public static b f719e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f720a;

    /* renamed from: b, reason: collision with root package name */
    public Object f721b;

    /* renamed from: c, reason: collision with root package name */
    public Object f722c;

    /* renamed from: d, reason: collision with root package name */
    public Object f723d;

    public /* synthetic */ b(int i2, boolean z2) {
        this.f720a = i2;
    }

    public static b F() {
        if (f719e == null) {
            j jVar = new j(18, false);
            O0.a aVar = new O0.a();
            aVar.f1233a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            c cVar = new c();
            cVar.f1818a = false;
            cVar.f1819b = false;
            cVar.f1823f = flutterJNI;
            cVar.f1824g = newCachedThreadPool;
            b bVar = new b(3, false);
            bVar.f721b = cVar;
            bVar.f722c = jVar;
            bVar.f723d = newCachedThreadPool;
            f719e = bVar;
        }
        return f719e;
    }

    public static b H(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new b(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public Drawable A(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f722c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0142a.a((Context) this.f721b, resourceId);
    }

    public Typeface B(int i2, int i3, A a2) {
        int i4 = 9;
        int resourceId = ((TypedArray) this.f722c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f723d) == null) {
            this.f723d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f723d;
        Object obj = f.f8444a;
        Context context = (Context) this.f721b;
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
            a2.a();
            return null;
        }
        int i5 = typedValue.assetCookie;
        l.f fVar = r.d.f8453b;
        Typeface typeface = (Typeface) fVar.a(r.d.b(resources, resourceId, charSequence2, i5, i3));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new F0.c(i4, a2, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                InterfaceC1032b u2 = AbstractC1050a.u(resources.getXml(resourceId), resources);
                if (u2 != null) {
                    return r.d.a(context, u2, resources, resourceId, charSequence2, typedValue.assetCookie, i3, a2);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                a2.a();
                return null;
            }
            int i6 = typedValue.assetCookie;
            Typeface m2 = r.d.f8452a.m(context, resources, resourceId, charSequence2, i3);
            if (m2 != null) {
                fVar.b(r.d.b(resources, resourceId, charSequence2, i6, i3), m2);
            }
            if (m2 != null) {
                new Handler(Looper.getMainLooper()).post(new F0.c(i4, a2, m2));
            } else {
                a2.a();
            }
            return m2;
        } catch (IOException e2) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
            a2.a();
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
            a2.a();
            return null;
        }
    }

    public View C(int i2) {
        return ((RecyclerView) ((C.j) this.f721b).f124b).getChildAt(i2);
    }

    public int D() {
        return ((RecyclerView) ((C.j) this.f721b).f124b).getChildCount();
    }

    public boolean E(KeyEvent keyEvent) {
        if (((HashSet) this.f722c).remove(keyEvent)) {
            return false;
        }
        B[] bArr = (B[]) this.f721b;
        if (bArr.length <= 0) {
            I(keyEvent);
            return true;
        }
        K.a aVar = new K.a(this, keyEvent);
        for (B b2 : bArr) {
            b2.e(keyEvent, new P0.A(aVar));
        }
        return true;
    }

    public void G(String str, Object obj, Z0.j jVar) {
        ((InterfaceC0090f) this.f721b).c((String) this.f722c, ((InterfaceC0096l) this.f723d).e(new e(19, str, obj)), jVar == null ? null : new C0085a(1, this, jVar));
    }

    public void I(KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        t tVar = (t) this.f723d;
        if (tVar != null) {
            io.flutter.plugin.editing.j jVar = tVar.f1467l;
            boolean z2 = false;
            if (jVar.f7816b.isAcceptingText() && (cVar = jVar.f7824j) != null && keyEvent.getAction() == 0) {
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
                        EditorInfo editorInfo = cVar.f7779e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & KotlinVersion.MAX_COMPONENT_VALUE);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f7778d;
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
            HashSet hashSet = (HashSet) this.f722c;
            hashSet.add(keyEvent);
            tVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void J(Activity activity, Z.j jVar) {
        i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f722c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f723d;
        try {
            if (jVar.equals((Z.j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((k) ((Z0.i) this.f721b).f1992b).f2657b.iterator();
            while (it.hasNext()) {
                c0.j jVar2 = (c0.j) it.next();
                if (jVar2.f2651a.equals(activity)) {
                    jVar2.f2653c = jVar;
                    jVar2.f2652b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void K() {
        ((TypedArray) this.f722c).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = r3.f1223a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f1223a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            AbstractC0052a instance = (AbstractC0052a) arrayList.get(i2);
            instance.getClass();
            n nVar = (n) this.f721b;
            nVar.getClass();
            i.e(instance, "instance");
            int i3 = nVar.f1223a;
            int i4 = 0;
            while (true) {
                Object[] objArr = (Object[]) nVar.f1224b;
                if (i4 >= i3) {
                    break;
                } else {
                    if (objArr[i4] == instance) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
            }
        }
        arrayList.clear();
    }

    public void M(InterfaceC0095k interfaceC0095k) {
        ((InterfaceC0090f) this.f721b).f((String) this.f722c, interfaceC0095k == null ? null : new e(this, interfaceC0095k, 20, false));
    }

    @Override // f1.InterfaceC0175i
    public void a(String str, boolean z2, C0176j c0176j) {
        t(c0176j).edit().putBoolean(str, z2).apply();
    }

    @Override // f1.InterfaceC0175i
    public Double b(String str, C0176j c0176j) {
        SharedPreferences t = t(c0176j);
        if (!t.contains(str)) {
            return null;
        }
        Object c2 = AbstractC0162M.c(t.getString(str, ""), (j) this.f723d);
        i.c(c2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c2;
    }

    @Override // f1.InterfaceC0175i
    public Long c(String str, C0176j c0176j) {
        long j2;
        SharedPreferences t = t(c0176j);
        if (!t.contains(str)) {
            return null;
        }
        try {
            j2 = t.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j2 = t.getInt(str, 0);
        }
        return Long.valueOf(j2);
    }

    @Override // f1.InterfaceC0175i
    public ArrayList d(String str, C0176j c0176j) {
        List list;
        SharedPreferences t = t(c0176j);
        ArrayList arrayList = null;
        if (t.contains(str)) {
            String string = t.getString(str, "");
            i.b(string);
            if (o.R(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) && !o.R(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) && (list = (List) AbstractC0162M.c(t.getString(str, ""), (j) this.f723d)) != null) {
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

    @Override // f1.InterfaceC0175i
    public void e(String str, String str2, C0176j c0176j) {
        t(c0176j).edit().putString(str, str2).apply();
    }

    @Override // f1.InterfaceC0175i
    public void f(String str, List list, C0176j c0176j) {
        t(c0176j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((j) this.f723d).h(list))).apply();
    }

    @Override // f1.InterfaceC0175i
    public void g(String str, double d2, C0176j c0176j) {
        t(c0176j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // f1.InterfaceC0175i
    public C0166Q h(String str, C0176j c0176j) {
        SharedPreferences t = t(c0176j);
        if (!t.contains(str)) {
            return null;
        }
        String string = t.getString(str, "");
        i.b(string);
        return o.R(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) ? new C0166Q(string, EnumC0164O.JSON_ENCODED) : o.R(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new C0166Q(null, EnumC0164O.PLATFORM_ENCODED) : new C0166Q(null, EnumC0164O.UNEXPECTED_STRING);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d3, code lost:
    
        if (z1.o.R(r1, "generic", false) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018f A[LOOP:1: B:21:0x0189->B:23:0x018f, LOOP_END] */
    @Override // a1.InterfaceC0095k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(e call, Z0.j jVar) {
        boolean z2;
        Iterator it;
        i.e(call, "call");
        if (!((String) call.f8530b).equals("getDeviceInfo")) {
            jVar.b();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        String BRAND = Build.BRAND;
        hashMap.put("brand", BRAND);
        String DEVICE = Build.DEVICE;
        hashMap.put("device", DEVICE);
        hashMap.put("display", Build.DISPLAY);
        String FINGERPRINT = Build.FINGERPRINT;
        hashMap.put("fingerprint", FINGERPRINT);
        String HARDWARE = Build.HARDWARE;
        hashMap.put("hardware", HARDWARE);
        hashMap.put("host", Build.HOST);
        hashMap.put("id", Build.ID);
        String MANUFACTURER = Build.MANUFACTURER;
        hashMap.put(CommonUrlParts.MANUFACTURER, MANUFACTURER);
        String MODEL = Build.MODEL;
        hashMap.put(CommonUrlParts.MODEL, MODEL);
        String PRODUCT = Build.PRODUCT;
        hashMap.put("product", PRODUCT);
        String string = Settings.Global.getString((ContentResolver) this.f723d, "device_name");
        if (string == null) {
            string = "";
        }
        hashMap.put("name", string);
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", AbstractC0253j.B(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", AbstractC0253j.B(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", AbstractC0253j.B(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        i.d(BRAND, "BRAND");
        if (o.R(BRAND, "generic", false)) {
            i.d(DEVICE, "DEVICE");
        }
        i.d(FINGERPRINT, "FINGERPRINT");
        if (!o.R(FINGERPRINT, "generic", false) && !o.R(FINGERPRINT, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE, false)) {
            i.d(HARDWARE, "HARDWARE");
            if (!g.T(HARDWARE, "goldfish") && !g.T(HARDWARE, "ranchu")) {
                i.d(MODEL, "MODEL");
                if (!g.T(MODEL, "google_sdk") && !g.T(MODEL, "Emulator") && !g.T(MODEL, "Android SDK built for x86")) {
                    i.d(MANUFACTURER, "MANUFACTURER");
                    if (!g.T(MANUFACTURER, "Genymotion")) {
                        i.d(PRODUCT, "PRODUCT");
                        if (!g.T(PRODUCT, "sdk") && !g.T(PRODUCT, "vbox86p") && !g.T(PRODUCT, "emulator") && !g.T(PRODUCT, "simulator")) {
                            z2 = false;
                            hashMap.put("isPhysicalDevice", Boolean.valueOf(!z2));
                            FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f721b).getSystemAvailableFeatures();
                            i.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                            ArrayList arrayList = new ArrayList();
                            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                                if (featureInfo.name != null) {
                                    arrayList.add(featureInfo);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(i1.k.E(arrayList));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((FeatureInfo) it.next()).name);
                            }
                            hashMap.put("systemFeatures", arrayList2);
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            hashMap.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
                            hashMap.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
                            HashMap hashMap2 = new HashMap();
                            int i2 = Build.VERSION.SDK_INT;
                            hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                            hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                            hashMap2.put("codename", Build.VERSION.CODENAME);
                            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
                            hashMap2.put("release", Build.VERSION.RELEASE);
                            hashMap2.put("sdkInt", Integer.valueOf(i2));
                            hashMap.put("version", hashMap2);
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            ((ActivityManager) this.f722c).getMemoryInfo(memoryInfo);
                            hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
                            hashMap.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
                            hashMap.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
                            jVar.c(hashMap);
                        }
                    }
                }
            }
        }
        z2 = true;
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!z2));
        FeatureInfo[] systemAvailableFeatures2 = ((PackageManager) this.f721b).getSystemAvailableFeatures();
        i.d(systemAvailableFeatures2, "getSystemAvailableFeatures(...)");
        ArrayList arrayList3 = new ArrayList();
        while (r8 < r2) {
        }
        ArrayList arrayList22 = new ArrayList(i1.k.E(arrayList3));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        hashMap.put("systemFeatures", arrayList22);
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("freeDiskSize", Long.valueOf(statFs2.getFreeBytes()));
        hashMap.put("totalDiskSize", Long.valueOf(statFs2.getTotalBytes()));
        HashMap hashMap22 = new HashMap();
        int i22 = Build.VERSION.SDK_INT;
        hashMap22.put("baseOS", Build.VERSION.BASE_OS);
        hashMap22.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap22.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap22.put("codename", Build.VERSION.CODENAME);
        hashMap22.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap22.put("release", Build.VERSION.RELEASE);
        hashMap22.put("sdkInt", Integer.valueOf(i22));
        hashMap.put("version", hashMap22);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f722c).getMemoryInfo(memoryInfo2);
        hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo2.lowMemory));
        hashMap.put("physicalRamSize", Long.valueOf(memoryInfo2.totalMem / 1048576));
        hashMap.put("availableRamSize", Long.valueOf(memoryInfo2.availMem / 1048576));
        jVar.c(hashMap);
    }

    @Override // f1.InterfaceC0175i
    public void j(String str, String str2, C0176j c0176j) {
        t(c0176j).edit().putString(str, str2).apply();
    }

    @Override // f1.InterfaceC0175i
    public void k(List list, C0176j c0176j) {
        SharedPreferences t = t(c0176j);
        SharedPreferences.Editor edit = t.edit();
        i.d(edit, "edit(...)");
        Map<String, ?> all = t.getAll();
        i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (AbstractC0162M.b(str, all.get(str), list != null ? AbstractC0252i.V(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            i.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // f1.InterfaceC0175i
    public List l(List list, C0176j c0176j) {
        Map<String, ?> all = t(c0176j).getAll();
        i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            i.d(key, "<get-key>(...)");
            if (AbstractC0162M.b(key, entry.getValue(), list != null ? AbstractC0252i.V(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC0252i.R(linkedHashMap.keySet());
    }

    @Override // f1.InterfaceC0175i
    public Map m(List list, C0176j c0176j) {
        Object value;
        Map<String, ?> all = t(c0176j).getAll();
        i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (AbstractC0162M.b(entry.getKey(), entry.getValue(), list != null ? AbstractC0252i.V(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c2 = AbstractC0162M.c(value, (j) this.f723d);
                i.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // f1.InterfaceC0175i
    public String n(String str, C0176j c0176j) {
        SharedPreferences t = t(c0176j);
        if (t.contains(str)) {
            return t.getString(str, "");
        }
        return null;
    }

    @Override // f1.InterfaceC0175i
    public Boolean p(String str, C0176j c0176j) {
        SharedPreferences t = t(c0176j);
        if (t.contains(str)) {
            return Boolean.valueOf(t.getBoolean(str, true));
        }
        return null;
    }

    @Override // f1.InterfaceC0175i
    public void q(String str, long j2, C0176j c0176j) {
        t(c0176j).edit().putLong(str, j2).apply();
    }

    @Override // D1.d
    public Object r(D1.e eVar, l1.d dVar) {
        Object r2 = ((d) this.f721b).r(new l(eVar, (I.d) this.f722c, (C0161L) this.f723d), dVar);
        return r2 == EnumC0985a.f8194a ? r2 : C0239i.f3393a;
    }

    public void s(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f722c;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f723d).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences t(C0176j c0176j) {
        String str = c0176j.f2936a;
        Context context = (Context) this.f722c;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            i.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public String toString() {
        switch (this.f720a) {
            case 2:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            case 5:
                return ((C0053b) this.f722c).toString() + ", hidden list:" + ((ArrayList) this.f723d).size();
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        for (K.e eVar : ((J1.l) this.f722c).c()) {
            if (eVar != null && z2) {
                eVar.f1028c.u(true);
            }
        }
    }

    public void v(boolean z2) {
        for (K.e eVar : ((J1.l) this.f722c).c()) {
            if (eVar != null && z2) {
                eVar.f1028c.v(true);
            }
        }
    }

    public void w(int i2, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f722c).dispatchSemanticsAction(i2, eVar);
    }

    public void x(int i2, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f722c).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public int y(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f723d;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0052a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public ColorStateList z(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f722c;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            Object obj = AbstractC0142a.f2825a;
            ColorStateList colorStateList = ((Context) this.f721b).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i2) {
        this.f720a = i2;
        this.f721b = obj;
        this.f722c = obj2;
        this.f723d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0090f interfaceC0090f, String str) {
        this(interfaceC0090f, str, C0099o.f2035b, 9);
        this.f720a = 9;
    }

    public b(C.j jVar) {
        this.f720a = 5;
        this.f721b = jVar;
        this.f722c = new C0053b();
        this.f723d = new ArrayList();
    }

    public b(Context context, TypedArray typedArray) {
        this.f720a = 13;
        this.f721b = context;
        this.f722c = typedArray;
    }

    public b(j jVar) {
        this.f720a = 4;
        this.f721b = new n(30);
        this.f722c = new ArrayList();
        this.f723d = new ArrayList();
        new j(13, this);
    }

    public b(R0.b bVar, FlutterJNI flutterJNI) {
        this.f720a = 7;
        C.j jVar = new C.j(22, this);
        C0038n c0038n = new C0038n(bVar, "flutter/accessibility", C0098n.INSTANCE, null);
        this.f721b = c0038n;
        c0038n.h(jVar);
        this.f722c = flutterJNI;
    }

    public b(int i2) {
        this.f720a = i2;
        switch (i2) {
            case 8:
                this.f721b = new ConcurrentLinkedQueue();
                break;
            default:
                this.f721b = new ArrayList();
                this.f722c = new J1.l(1);
                new ArrayList();
                new j(this, 4);
                this.f723d = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new ArrayList();
                new j(this, 3);
                new CopyOnWriteArrayList();
                final int i3 = 0;
                new InterfaceC1063a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f1040b;

                    {
                        this.f1040b = this;
                    }

                    @Override // x.InterfaceC1063a
                    public final void accept(Object obj) {
                        switch (i3) {
                            case 0:
                                I0.b bVar = this.f1040b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f1040b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                        }
                    }
                };
                final int i4 = 1;
                new InterfaceC1063a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f1040b;

                    {
                        this.f1040b = this;
                    }

                    @Override // x.InterfaceC1063a
                    public final void accept(Object obj) {
                        switch (i4) {
                            case 0:
                                I0.b bVar = this.f1040b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f1040b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                        }
                    }
                };
                final int i5 = 2;
                new InterfaceC1063a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f1040b;

                    {
                        this.f1040b = this;
                    }

                    @Override // x.InterfaceC1063a
                    public final void accept(Object obj) {
                        switch (i5) {
                            case 0:
                                I0.b bVar = this.f1040b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f1040b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                        }
                    }
                };
                final int i6 = 3;
                new InterfaceC1063a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f1040b;

                    {
                        this.f1040b = this;
                    }

                    @Override // x.InterfaceC1063a
                    public final void accept(Object obj) {
                        switch (i6) {
                            case 0:
                                I0.b bVar = this.f1040b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f1040b;
                                bVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1040b.getClass();
                                throw null;
                        }
                    }
                };
                new ArrayDeque();
                new C.b(2, this);
                break;
        }
    }

    public b(t tVar) {
        this.f720a = 6;
        this.f722c = new HashSet();
        this.f723d = tVar;
        this.f721b = new B[]{new z(tVar.getBinaryMessenger()), new e(new Z0.b(tVar.getBinaryMessenger()))};
        new C.j(tVar.getBinaryMessenger()).f124b = this;
    }

    public b(InterfaceC0090f messenger, Context context, j jVar) {
        this.f720a = 11;
        i.e(messenger, "messenger");
        i.e(context, "context");
        this.f721b = messenger;
        this.f722c = context;
        this.f723d = jVar;
        try {
            InterfaceC0175i.f2935Q.getClass();
            C0174h.b(messenger, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public b(Z0.i iVar) {
        this.f720a = 10;
        this.f721b = iVar;
        this.f722c = new ReentrantLock();
        this.f723d = new WeakHashMap();
    }
}
