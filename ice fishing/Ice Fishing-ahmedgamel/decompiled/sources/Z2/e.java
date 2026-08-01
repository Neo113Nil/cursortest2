package Z2;

import B1.A;
import B1.C0262d;
import B1.x;
import C2.N;
import J0.s;
import J0.t;
import O2.B;
import S0.i;
import S0.p;
import T0.l;
import Z1.k;
import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.o;
import androidx.emoji2.text.r;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.AbstractServiceC0506y;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.work.OverwritingInputMerger;
import b0.C0511a;
import b2.InterfaceC0515b;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2941aq;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.RO;
import f2.C4507a;
import f2.j;
import g2.InterfaceC4527d;
import h.I;
import h.InterfaceC4542b;
import h0.AbstractC4554b;
import h0.C4553a;
import h0.C4556d;
import j3.m;
import j4.n;
import j4.q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import kotlin.jvm.internal.h;
import m.b1;
import q2.C4896n;
import s1.InterfaceC4969d;
import t7.InterfaceC5044a;
import v1.InterfaceC5104a;
import x0.C5181c;

/* loaded from: classes2.dex */
public final class e implements I2.a, G1.c, j3.c, T.g, V0.a, InterfaceC0515b, InterfaceC4542b {

    /* renamed from: x, reason: collision with root package name */
    public static e f4167x;

    /* renamed from: y, reason: collision with root package name */
    public static e f4168y;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4169n;

    /* renamed from: u, reason: collision with root package name */
    public Object f4170u;

    /* renamed from: v, reason: collision with root package name */
    public Object f4171v;

    /* renamed from: w, reason: collision with root package name */
    public Object f4172w;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.f4169n = i;
        this.f4170u = obj;
        this.f4171v = obj2;
        this.f4172w = obj3;
    }

    public static void A(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static final SharedPreferences N(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void O(Context context) {
        if (N(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z3) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void B(EnumC0496n enumC0496n) {
        Q q8 = (Q) this.f4172w;
        if (q8 != null) {
            q8.run();
        }
        Q q9 = new Q((C0505x) this.f4170u, enumC0496n);
        this.f4172w = q9;
        ((Handler) this.f4171v).postAtFrontOfQueue(q9);
    }

    public Object C(CharSequence charSequence, int i, int i6, int i9, boolean z3, o oVar) {
        int i10;
        char c9;
        RO ro = new RO((r) ((i) this.f4171v).f2790w);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z6 = true;
        int i11 = 0;
        int i12 = i;
        loop0: while (true) {
            i10 = i12;
            while (i12 < i6 && i11 < i9 && z6) {
                SparseArray sparseArray = ((r) ro.f27200b).f4796a;
                r rVar = sparseArray == null ? null : (r) sparseArray.get(codePointAt);
                if (ro.f27202d == 2) {
                    if (rVar != null) {
                        ro.f27200b = rVar;
                        ro.f27204f++;
                    } else {
                        if (codePointAt == 65038) {
                            ro.a();
                        } else if (codePointAt != 65039) {
                            r rVar2 = (r) ro.f27200b;
                            if (rVar2.f4797b != null) {
                                if (ro.f27204f != 1) {
                                    ro.f27201c = rVar2;
                                    ro.a();
                                } else if (ro.b()) {
                                    ro.f27201c = (r) ro.f27200b;
                                    ro.a();
                                } else {
                                    ro.a();
                                }
                                c9 = 3;
                            } else {
                                ro.a();
                            }
                        }
                        c9 = 1;
                    }
                    c9 = 2;
                } else if (rVar == null) {
                    ro.a();
                    c9 = 1;
                } else {
                    ro.f27202d = 2;
                    ro.f27200b = rVar;
                    ro.f27204f = 1;
                    c9 = 2;
                }
                ro.f27203e = codePointAt;
                if (c9 == 1) {
                    i12 = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (i12 < i6) {
                        codePointAt = Character.codePointAt(charSequence, i12);
                    }
                } else if (c9 == 2) {
                    int charCount = Character.charCount(codePointAt) + i12;
                    if (charCount < i6) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i12 = charCount;
                } else if (c9 == 3) {
                    if (z3 || !y(charSequence, i10, i12, ((r) ro.f27201c).f4797b)) {
                        z6 = oVar.v(charSequence, i10, i12, ((r) ro.f27201c).f4797b);
                        i11++;
                    }
                }
            }
        }
        if (ro.f27202d == 2 && ((r) ro.f27200b).f4797b != null && ((ro.f27204f > 1 || ro.b()) && i11 < i9 && z6 && (z3 || !y(charSequence, i10, i12, ((r) ro.f27200b).f4797b)))) {
            oVar.v(charSequence, i10, i12, ((r) ro.f27200b).f4797b);
        }
        return oVar.getResult();
    }

    public boolean D(Object obj) {
        if (obj instanceof O1.b) {
            ((O1.b) obj).b().f2160a = true;
        }
        ((O1.c) this.f4171v).k(obj);
        return ((N.d) this.f4172w).c(obj);
    }

    public void E(Collection workSpecs) {
        h.e(workSpecs, "workSpecs");
        synchronized (this.f4172w) {
            try {
                for (P0.b bVar : (P0.b[]) this.f4171v) {
                    if (bVar.f2417e != null) {
                        bVar.f2417e = null;
                        bVar.d(null, bVar.f2416d);
                    }
                }
                for (P0.b bVar2 : (P0.b[]) this.f4171v) {
                    bVar2.c(workSpecs);
                }
                for (P0.b bVar3 : (P0.b[]) this.f4171v) {
                    if (bVar3.f2417e != this) {
                        bVar3.f2417e = this;
                        bVar3.d(this, bVar3.f2416d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void F() {
        synchronized (this.f4172w) {
            for (P0.b bVar : (P0.b[]) this.f4171v) {
                ArrayList arrayList = bVar.f2414b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f2413a.b(bVar);
                }
            }
        }
    }

    public void G(W1.a aVar) {
        x xVar = new x(22);
        Z1.i iVar = (Z1.i) this.f4170u;
        W1.c cVar = (W1.c) this.f4171v;
        Z1.o oVar = (Z1.o) this.f4172w;
        W1.d dVar = W1.d.f3407n;
        e a9 = Z1.i.a();
        a9.H(iVar.f4148a);
        a9.f4172w = dVar;
        a9.f4171v = iVar.f4149b;
        Z1.i n9 = a9.n();
        C4896n c4896n = new C4896n(2);
        c4896n.f40197z = new HashMap();
        c4896n.f40195x = Long.valueOf(oVar.f4161a.g());
        c4896n.f40196y = Long.valueOf(oVar.f4162b.g());
        c4896n.f40192u = "FCM_CLIENT_EVENT_LOGGING";
        k4.e eVar = aVar.f3403a;
        e eVar2 = n.f38426a;
        eVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar2.q(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        c4896n.f40194w = new k(cVar, byteArrayOutputStream.toByteArray());
        c4896n.f40193v = null;
        Z1.h c9 = c4896n.c();
        e2.b bVar = (e2.b) oVar.f4163c;
        bVar.getClass();
        bVar.f37190b.execute(new androidx.emoji2.text.k(bVar, n9, xVar, c9));
    }

    public void H(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4170u = str;
    }

    public void I(long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h.e(timeUnit, "timeUnit");
        ((p) this.f4171v).f2814g = timeUnit.toMillis(j6);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((p) this.f4171v).f2814g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public void L() {
        Log.i("HsdpLoadingPanel", "try to hideLoading");
        View view = (View) this.f4172w;
        if (view == null) {
            return;
        }
        ((Activity) this.f4170u).runOnUiThread(new LD(15, this, view));
    }

    public boolean M() {
        return (((Activity) this.f4170u).getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // T.g
    public Uri a() {
        return (Uri) this.f4170u;
    }

    @Override // I2.a
    public m b() {
        j3.h hVar = new j3.h();
        ((ExecutorService) this.f4172w).execute(new LD(28, this, hVar));
        return hVar.f38358a;
    }

    @Override // h.InterfaceC4542b
    public boolean d() {
        return true;
    }

    @Override // T.g
    public Uri e() {
        return (Uri) this.f4172w;
    }

    @Override // j3.c
    public void f(m mVar) {
        L2.b bVar = (L2.b) this.f4170u;
        String str = (String) this.f4171v;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f4172w;
        synchronized (bVar.f1623a) {
            bVar.f1623a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // G1.c
    public u1.x g(u1.x xVar, s1.h hVar) {
        Drawable drawable = (Drawable) xVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((G1.a) this.f4171v).g(C0262d.b(((BitmapDrawable) drawable).getBitmap(), (InterfaceC5104a) this.f4170u), hVar);
        }
        if (drawable instanceof F1.c) {
            return ((G1.f) this.f4172w).g(xVar, hVar);
        }
        return null;
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        switch (this.f4169n) {
            case 21:
                return new Z1.o(new E3.e(), new a4.e(), (e2.c) ((N) this.f4170u).get(), (f2.i) ((b1) this.f4171v).get(), (j) ((q) this.f4172w).get());
            default:
                return new f2.c((Context) ((G3.e) this.f4170u).f1072n, (InterfaceC4527d) ((InterfaceC5044a) this.f4171v).get(), (C4507a) ((E3.e) this.f4172w).get());
        }
    }

    @Override // T.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f4171v;
    }

    @Override // T.g
    public Object h() {
        return null;
    }

    @Override // h.InterfaceC4542b
    public Context j() {
        return ((Toolbar) this.f4170u).getContext();
    }

    public Object k() {
        Object a9 = ((N.d) this.f4172w).a();
        if (a9 == null) {
            a9 = ((O1.a) this.f4170u).f();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + a9.getClass());
            }
        }
        if (a9 instanceof O1.b) {
            ((O1.b) a9).b().f2160a = false;
        }
        return a9;
    }

    public boolean l(String workSpecId) {
        P0.b bVar;
        boolean z3;
        h.e(workSpecId, "workSpecId");
        synchronized (this.f4172w) {
            try {
                P0.b[] bVarArr = (P0.b[]) this.f4171v;
                int length = bVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i];
                    bVar.getClass();
                    Object obj = bVar.f2416d;
                    if (obj != null && bVar.b(obj) && bVar.f2415c.contains(workSpecId)) {
                        break;
                    }
                    i++;
                }
                if (bVar != null) {
                    s.d().a(O0.c.f2158a, "Work " + workSpecId + " constrained by " + bVar.getClass().getSimpleName());
                }
                z3 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public t m() {
        t tVar = new t((UUID) this.f4170u, (p) this.f4171v, (LinkedHashSet) this.f4172w);
        J0.d dVar = ((p) this.f4171v).f2816j;
        boolean z3 = !dVar.f1381h.isEmpty() || dVar.f1377d || dVar.f1375b || dVar.f1376c;
        p pVar = (p) this.f4171v;
        if (pVar.f2823q) {
            if (z3) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f2814g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        h.d(randomUUID, "randomUUID()");
        this.f4170u = randomUUID;
        String uuid = randomUUID.toString();
        h.d(uuid, "id.toString()");
        p other = (p) this.f4171v;
        h.e(other, "other");
        int i = other.f2809b;
        String str = other.f2811d;
        J0.h hVar = new J0.h(other.f2812e);
        J0.h hVar2 = new J0.h(other.f2813f);
        long j6 = other.f2814g;
        J0.d other2 = other.f2816j;
        h.e(other2, "other");
        this.f4171v = new p(uuid, i, other.f2810c, str, hVar, hVar2, j6, other.f2815h, other.i, new J0.d(other2.f1374a, other2.f1375b, other2.f1376c, other2.f1377d, other2.f1378e, other2.f1379f, other2.f1380g, other2.f1381h), other.f2817k, other.f2818l, other.f2819m, other.f2820n, other.f2821o, other.f2822p, other.f2823q, other.f2824r, other.f2825s, 524288, 0);
        return tVar;
    }

    public Z1.i n() {
        String str = ((String) this.f4170u) == null ? " backendName" : "";
        if (((W1.d) this.f4172w) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new Z1.i((String) this.f4170u, (byte[]) this.f4171v, (W1.d) this.f4172w);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap o(BitmapFactory.Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        switch (this.f4169n) {
            case 1:
                return B1.r.c(new N1.a(N1.b.c((ByteBuffer) this.f4170u)), options, this);
            case 2:
                A a9 = (A) ((com.bumptech.glide.load.data.g) this.f4170u).f23424u;
                a9.reset();
                return B1.r.c(a9, options, this);
            default:
                FileDescriptor fileDescriptor = ((com.bumptech.glide.load.data.g) this.f4172w).e().getFileDescriptor();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT != 34 || !B1.r.a(options) || !B1.r.d(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                Bitmap.Config config4 = options.inPreferredConfig;
                config = Bitmap.Config.HARDWARE;
                N1.g.a("", config4 == config);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (decodeFileDescriptor != null) {
                        try {
                            bitmap = B1.r.e(decodeFileDescriptor);
                        } catch (Throwable th) {
                            th = th;
                            bitmap = decodeFileDescriptor;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            config2 = Bitmap.Config.HARDWARE;
                            options.inPreferredConfig = config2;
                            throw th;
                        }
                    }
                    decodeFileDescriptor.recycle();
                    config3 = Bitmap.Config.HARDWARE;
                    options.inPreferredConfig = config3;
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    public void q(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f4171v;
        HashMap hashMap2 = (HashMap) this.f4170u;
        Y3.f fVar = new Y3.f(byteArrayOutputStream, hashMap2, hashMap, (X3.a) this.f4172w);
        V3.d dVar = (V3.d) hashMap2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new V3.b("No encoder for " + obj.getClass());
        }
    }

    public S r(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return s(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public S s(Class cls, String key) {
        S viewModel;
        h.e(key, "key");
        X x9 = (X) this.f4170u;
        x9.getClass();
        LinkedHashMap linkedHashMap = x9.f5153a;
        S s9 = (S) linkedHashMap.get(key);
        boolean isInstance = cls.isInstance(s9);
        V v9 = (V) this.f4171v;
        if (!isInstance) {
            C4556d c4556d = new C4556d((AbstractC4554b) this.f4172w);
            c4556d.f37943a.put(T.f5149b, key);
            try {
                viewModel = v9.b(cls, c4556d);
            } catch (AbstractMethodError unused) {
                viewModel = v9.a(cls);
            }
            h.e(viewModel, "viewModel");
            S s10 = (S) linkedHashMap.put(key, viewModel);
            if (s10 != null) {
                s10.onCleared();
            }
            return viewModel;
        }
        O o6 = v9 instanceof O ? (O) v9 : null;
        if (o6 != null) {
            h.b(s9);
            AbstractC0498p abstractC0498p = o6.f5135d;
            if (abstractC0498p != null) {
                C5181c c5181c = o6.f5136e;
                h.b(c5181c);
                L.a(s9, c5181c, abstractC0498p);
            }
        }
        h.c(s9, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return s9;
    }

    @Override // h.InterfaceC4542b
    public Drawable t() {
        return (Drawable) this.f4171v;
    }

    @Override // h.InterfaceC4542b
    public void u(int i) {
        Toolbar toolbar = (Toolbar) this.f4170u;
        if (i == 0) {
            toolbar.setNavigationContentDescription((CharSequence) this.f4172w);
        } else {
            toolbar.setNavigationContentDescription(i);
        }
    }

    public ImageHeaderParser$ImageType v() {
        switch (this.f4169n) {
            case 1:
                return com.bumptech.glide.e.f((ArrayList) this.f4171v, N1.b.c((ByteBuffer) this.f4170u));
            case 2:
                A a9 = (A) ((com.bumptech.glide.load.data.g) this.f4170u).f23424u;
                a9.reset();
                return com.bumptech.glide.e.e((ArrayList) this.f4172w, a9, (C2941aq) this.f4171v);
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) this.f4172w;
                C2941aq c2941aq = (C2941aq) this.f4170u;
                ArrayList arrayList = (ArrayList) this.f4171v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC4969d interfaceC4969d = (InterfaceC4969d) arrayList.get(i);
                    A a10 = null;
                    try {
                        A a11 = new A(new FileInputStream(gVar.e().getFileDescriptor()), c2941aq);
                        try {
                            ImageHeaderParser$ImageType c9 = interfaceC4969d.c(a11);
                            a11.b();
                            gVar.e();
                            if (c9 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return c9;
                            }
                        } catch (Throwable th) {
                            th = th;
                            a10 = a11;
                            if (a10 != null) {
                                a10.b();
                            }
                            gVar.e();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public File w(Context context) {
        ((M2.i) this.f4171v).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("pl_droidsonroids_gif"));
    }

    @Override // h.InterfaceC4542b
    public void x(j.a aVar, int i) {
        ((Toolbar) this.f4170u).setNavigationIcon(aVar);
        u(i);
    }

    public boolean y(CharSequence charSequence, int i, int i6, u uVar) {
        if ((uVar.f4805c & 3) == 0) {
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) this.f4172w;
            C0511a b9 = uVar.b();
            int a9 = b9.a(8);
            if (a9 != 0) {
                ((ByteBuffer) b9.f2045w).getShort(a9 + b9.f2042n);
            }
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f4762b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i6) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f4763a;
            String sb2 = sb.toString();
            int i9 = G.h.f1009a;
            boolean a10 = G.f.a(textPaint, sb2);
            int i10 = uVar.f4805c & 4;
            uVar.f4805c = a10 ? i10 | 2 : i10 | 1;
        }
        return (uVar.f4805c & 3) == 2;
    }

    /* JADX WARN: Finally extract failed */
    public boolean z() {
        switch (this.f4169n) {
            case 1:
                ByteBuffer c9 = N1.b.c((ByteBuffer) this.f4170u);
                C2941aq c2941aq = (C2941aq) this.f4172w;
                if (c9 == null) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) this.f4171v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC4969d) arrayList.get(i)).e(c9, c2941aq)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 2:
                A a9 = (A) ((com.bumptech.glide.load.data.g) this.f4170u).f23424u;
                a9.reset();
                C2941aq c2941aq2 = (C2941aq) this.f4171v;
                a9.mark(5242880);
                ArrayList arrayList2 = (ArrayList) this.f4172w;
                int size2 = arrayList2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    try {
                        boolean d2 = ((InterfaceC4969d) arrayList2.get(i6)).d(a9, c2941aq2);
                        a9.reset();
                        if (d2) {
                            return true;
                        }
                    } catch (Throwable th) {
                        a9.reset();
                        throw th;
                    }
                }
                return false;
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) this.f4172w;
                C2941aq c2941aq3 = (C2941aq) this.f4170u;
                ArrayList arrayList3 = (ArrayList) this.f4171v;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    InterfaceC4969d interfaceC4969d = (InterfaceC4969d) arrayList3.get(i9);
                    A a10 = null;
                    try {
                        A a11 = new A(new FileInputStream(gVar.e().getFileDescriptor()), c2941aq3);
                        try {
                            boolean d9 = interfaceC4969d.d(a11, c2941aq3);
                            a11.b();
                            gVar.e();
                            if (d9) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a10 = a11;
                            if (a10 != null) {
                                a10.b();
                            }
                            gVar.e();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return false;
        }
    }

    public /* synthetic */ e(int i, boolean z3) {
        this.f4169n = i;
    }

    public e(Activity activity) {
        this.f4169n = 9;
        this.f4172w = null;
        this.f4170u = activity;
        this.f4171v = (WindowManager) activity.getSystemService("window");
    }

    public e(Context context) {
        this.f4169n = 0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f4171v = newSingleThreadScheduledExecutor;
        this.f4172w = Executors.newSingleThreadExecutor();
        this.f4170u = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new G0.c(14, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public e(List list) {
        this.f4169n = 22;
        this.f4172w = list;
        this.f4170u = new ArrayList(list.size());
        this.f4171v = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f4170u).add(new a1.n((List) ((e1.f) list.get(i)).f37132b.f1720u));
            ((ArrayList) this.f4171v).add(((e1.f) list.get(i)).f37133c.a());
        }
    }

    public e(AbstractServiceC0506y abstractServiceC0506y) {
        this.f4169n = 24;
        this.f4170u = new C0505x(abstractServiceC0506y);
        this.f4171v = new Handler();
    }

    public e(Z1.i iVar, W1.c cVar, d4.f fVar, Z1.o oVar) {
        this.f4169n = 20;
        this.f4170u = iVar;
        this.f4171v = cVar;
        this.f4172w = oVar;
    }

    public e(ExecutorService executorService) {
        this.f4169n = 16;
        this.f4171v = new Handler(Looper.getMainLooper());
        this.f4172w = new B(1, this);
        this.f4170u = new l(executorService);
    }

    public e(X store, V factory, AbstractC4554b defaultCreationExtras) {
        this.f4169n = 25;
        h.e(store, "store");
        h.e(factory, "factory");
        h.e(defaultCreationExtras, "defaultCreationExtras");
        this.f4170u = store;
        this.f4171v = factory;
        this.f4172w = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(X store, V v9) {
        this(store, v9, C4553a.f37942b);
        this.f4169n = 25;
        h.e(store, "store");
    }

    private final void J() {
    }

    private final void K() {
    }

    @Override // T.g
    public void c() {
    }

    public e(Class cls) {
        this.f4169n = 6;
        UUID randomUUID = UUID.randomUUID();
        h.d(randomUUID, "randomUUID()");
        this.f4170u = randomUUID;
        String uuid = ((UUID) this.f4170u).toString();
        h.d(uuid, "id.toString()");
        this.f4171v = new p(uuid, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(v7.t.P(1));
        linkedHashSet.add(strArr[0]);
        this.f4172w = linkedHashSet;
        ((p) this.f4171v).f2811d = OverwritingInputMerger.class.getName();
    }

    public e(Context context, LocationManager locationManager) {
        this.f4169n = 29;
        this.f4172w = new I();
        this.f4170u = context;
        this.f4171v = locationManager;
    }

    public e(i trackers, O0.b bVar) {
        this.f4169n = 10;
        h.e(trackers, "trackers");
        Q0.f tracker = (Q0.f) trackers.f2788u;
        h.e(tracker, "tracker");
        P0.a aVar = new P0.a(tracker, 0);
        Q0.a tracker2 = (Q0.a) trackers.f2789v;
        h.e(tracker2, "tracker");
        P0.a aVar2 = new P0.a(tracker2, 1);
        Q0.f tracker3 = (Q0.f) trackers.f2791x;
        h.e(tracker3, "tracker");
        P0.a aVar3 = new P0.a(tracker3, 4);
        Q0.f tracker4 = (Q0.f) trackers.f2790w;
        h.e(tracker4, "tracker");
        P0.a aVar4 = new P0.a(tracker4, 2);
        h.e(tracker4, "tracker");
        P0.a aVar5 = new P0.a(tracker4, 3);
        h.e(tracker4, "tracker");
        P0.d dVar = new P0.d(tracker4);
        h.e(tracker4, "tracker");
        P0.b[] bVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, dVar, new P0.c(tracker4)};
        this.f4170u = bVar;
        this.f4171v = bVarArr;
        this.f4172w = new Object();
    }

    public e(i iVar, M2.i iVar2, androidx.emoji2.text.d dVar, Set set) {
        this.f4169n = 23;
        this.f4170u = iVar2;
        this.f4171v = iVar;
        this.f4172w = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            C(str, 0, str.length(), 1, true, new D2.b(str, 2));
        }
    }

    public e(N.d dVar, O1.a aVar, O1.c cVar) {
        this.f4169n = 11;
        this.f4172w = dVar;
        this.f4170u = aVar;
        this.f4171v = cVar;
    }

    public e(N1.m mVar, ArrayList arrayList, C2941aq c2941aq) {
        this.f4169n = 2;
        N1.g.c(c2941aq, "Argument must not be null");
        this.f4171v = c2941aq;
        N1.g.c(arrayList, "Argument must not be null");
        this.f4172w = arrayList;
        this.f4170u = new com.bumptech.glide.load.data.g(mVar, c2941aq);
    }

    public e(int i) {
        this.f4169n = i;
        switch (i) {
            case 13:
                M2.i iVar = new M2.i(8);
                E3.e eVar = new E3.e();
                this.f4170u = new HashSet();
                this.f4171v = iVar;
                this.f4172w = eVar;
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f4170u = list;
                this.f4171v = list;
                break;
        }
    }

    public e(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C2941aq c2941aq) {
        this.f4169n = 3;
        N1.g.c(c2941aq, "Argument must not be null");
        this.f4170u = c2941aq;
        N1.g.c(arrayList, "Argument must not be null");
        this.f4171v = arrayList;
        this.f4172w = new com.bumptech.glide.load.data.g(parcelFileDescriptor);
    }

    public e(Matcher matcher, String input) {
        this.f4169n = 14;
        h.e(input, "input");
        this.f4170u = matcher;
        this.f4171v = new Q7.h(this);
    }

    public e(Toolbar toolbar) {
        this.f4169n = 28;
        this.f4170u = toolbar;
        this.f4171v = toolbar.getNavigationIcon();
        this.f4172w = toolbar.getNavigationContentDescription();
    }
}
