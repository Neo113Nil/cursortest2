package b3;

import D1.C0299d;
import D1.z;
import E2.C0316m;
import E2.M;
import J0.s;
import S0.n;
import S0.p;
import T0.l;
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
import androidx.emoji2.text.k;
import androidx.emoji2.text.o;
import androidx.emoji2.text.r;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.AbstractServiceC0510y;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.work.OverwritingInputMerger;
import b0.C0515a;
import b2.i;
import b2.j;
import com.anythink.core.common.n.b.A;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2964aq;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.RO;
import d2.InterfaceC4460b;
import h.InterfaceC4546b;
import h.J;
import h0.AbstractC4559b;
import h0.C4558a;
import h0.C4561d;
import h2.C4572a;
import i1.C4585b;
import i2.InterfaceC4590d;
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
import l3.m;
import m.c1;
import s2.C4945n;
import t7.InterfaceC5045a;
import u1.InterfaceC5065d;
import v7.t;
import w1.w;
import x0.C5180c;
import x1.InterfaceC5183a;

/* loaded from: classes2.dex */
public final class e implements K2.a, I1.b, l3.c, T.g, V0.a, InterfaceC4460b, InterfaceC4546b {

    /* renamed from: x, reason: collision with root package name */
    public static e f5554x;

    /* renamed from: y, reason: collision with root package name */
    public static e f5555y;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5556n;

    /* renamed from: u, reason: collision with root package name */
    public Object f5557u;

    /* renamed from: v, reason: collision with root package name */
    public Object f5558v;

    /* renamed from: w, reason: collision with root package name */
    public Object f5559w;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.f5556n = i;
        this.f5557u = obj;
        this.f5558v = obj2;
        this.f5559w = obj3;
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

    public static boolean q(Editable editable, KeyEvent keyEvent, boolean z6) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void B(EnumC0500n enumC0500n) {
        Q q8 = (Q) this.f5559w;
        if (q8 != null) {
            q8.run();
        }
        Q q9 = new Q((C0509x) this.f5557u, enumC0500n);
        this.f5559w = q9;
        ((Handler) this.f5558v).postAtFrontOfQueue(q9);
    }

    public Object C(CharSequence charSequence, int i, int i4, int i6, boolean z6, o oVar) {
        int i9;
        char c9;
        RO ro = new RO((r) ((n) this.f5558v).f2933w);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z9 = true;
        int i10 = 0;
        int i11 = i;
        loop0: while (true) {
            i9 = i11;
            while (i11 < i4 && i10 < i6 && z9) {
                SparseArray sparseArray = ((r) ro.f27956b).f4764a;
                r rVar = sparseArray == null ? null : (r) sparseArray.get(codePointAt);
                if (ro.f27958d == 2) {
                    if (rVar != null) {
                        ro.f27956b = rVar;
                        ro.f27960f++;
                    } else {
                        if (codePointAt == 65038) {
                            ro.a();
                        } else if (codePointAt != 65039) {
                            r rVar2 = (r) ro.f27956b;
                            if (rVar2.f4765b != null) {
                                if (ro.f27960f != 1) {
                                    ro.f27957c = rVar2;
                                    ro.a();
                                } else if (ro.b()) {
                                    ro.f27957c = (r) ro.f27956b;
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
                    ro.f27958d = 2;
                    ro.f27956b = rVar;
                    ro.f27960f = 1;
                    c9 = 2;
                }
                ro.f27959e = codePointAt;
                if (c9 == 1) {
                    i11 = Character.charCount(Character.codePointAt(charSequence, i9)) + i9;
                    if (i11 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i11);
                    }
                } else if (c9 == 2) {
                    int charCount = Character.charCount(codePointAt) + i11;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i11 = charCount;
                } else if (c9 == 3) {
                    if (z6 || !y(charSequence, i9, i11, ((r) ro.f27957c).f4765b)) {
                        z9 = oVar.y(charSequence, i9, i11, ((r) ro.f27957c).f4765b);
                        i10++;
                    }
                }
            }
        }
        if (ro.f27958d == 2 && ((r) ro.f27956b).f4765b != null && ((ro.f27960f > 1 || ro.b()) && i10 < i6 && z9 && (z6 || !y(charSequence, i9, i11, ((r) ro.f27956b).f4765b)))) {
            oVar.y(charSequence, i9, i11, ((r) ro.f27956b).f4765b);
        }
        return oVar.getResult();
    }

    public boolean D(Object obj) {
        if (obj instanceof Q1.b) {
            ((Q1.b) obj).d().f2479a = true;
        }
        ((Q1.c) this.f5558v).l(obj);
        return ((N.d) this.f5559w).c(obj);
    }

    public void E(Collection workSpecs) {
        h.e(workSpecs, "workSpecs");
        synchronized (this.f5559w) {
            try {
                for (P0.b bVar : (P0.b[]) this.f5558v) {
                    if (bVar.f2348e != null) {
                        bVar.f2348e = null;
                        bVar.d(null, bVar.f2347d);
                    }
                }
                for (P0.b bVar2 : (P0.b[]) this.f5558v) {
                    bVar2.c(workSpecs);
                }
                for (P0.b bVar3 : (P0.b[]) this.f5558v) {
                    if (bVar3.f2348e != this) {
                        bVar3.f2348e = this;
                        bVar3.d(this, bVar3.f2347d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void F() {
        synchronized (this.f5559w) {
            for (P0.b bVar : (P0.b[]) this.f5558v) {
                ArrayList arrayList = bVar.f2345b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f2344a.b(bVar);
                }
            }
        }
    }

    public void G(Y1.a aVar) {
        D0.n nVar = new D0.n(23);
        i iVar = (i) this.f5557u;
        Y1.c cVar = (Y1.c) this.f5558v;
        b2.n nVar2 = (b2.n) this.f5559w;
        Y1.d dVar = Y1.d.f3904n;
        e a9 = i.a();
        a9.H(iVar.f5537a);
        a9.f5559w = dVar;
        a9.f5558v = iVar.f5538b;
        i o4 = a9.o();
        C4945n c4945n = new C4945n(2);
        c4945n.f40496z = new HashMap();
        c4945n.f40494x = Long.valueOf(nVar2.f5548a.f());
        c4945n.f40495y = Long.valueOf(nVar2.f5549b.f());
        c4945n.f40491u = "FCM_CLIENT_EVENT_LOGGING";
        m4.e eVar = aVar.f3900a;
        e eVar2 = l4.n.f38938a;
        eVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar2.s(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        c4945n.f40493w = new j(cVar, byteArrayOutputStream.toByteArray());
        c4945n.f40492v = null;
        b2.h c9 = c4945n.c();
        g2.b bVar = (g2.b) nVar2.f5550c;
        bVar.getClass();
        bVar.f37666b.execute(new k(bVar, o4, nVar, c9));
    }

    public void H(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f5557u = str;
    }

    public void I(long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h.e(timeUnit, "timeUnit");
        ((p) this.f5558v).f2943g = timeUnit.toMillis(j6);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((p) this.f5558v).f2943g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public void L() {
        Log.i("HsdpLoadingPanel", "try to hideLoading");
        View view = (View) this.f5559w;
        if (view == null) {
            return;
        }
        ((Activity) this.f5557u).runOnUiThread(new LD(15, this, view));
    }

    public boolean M() {
        return (((Activity) this.f5557u).getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // h.InterfaceC4546b
    public boolean a() {
        return true;
    }

    @Override // T.g
    public Uri b() {
        return (Uri) this.f5557u;
    }

    @Override // T.g
    public Uri d() {
        return (Uri) this.f5559w;
    }

    @Override // I1.b
    public w e(w wVar, u1.h hVar) {
        Drawable drawable = (Drawable) wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((I1.a) this.f5558v).e(C0299d.d(((BitmapDrawable) drawable).getBitmap(), (InterfaceC5183a) this.f5557u), hVar);
        }
        if (drawable instanceof H1.c) {
            return ((I1.e) this.f5559w).e(wVar, hVar);
        }
        return null;
    }

    @Override // T.g
    public Object f() {
        return null;
    }

    @Override // h.InterfaceC4546b
    public Context g() {
        return ((Toolbar) this.f5557u).getContext();
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        switch (this.f5556n) {
            case 24:
                return new b2.n(new O2.i(21), new G3.e(21), (g2.c) ((M) this.f5557u).get(), (h2.i) ((c1) this.f5558v).get(), (h2.j) ((S0.i) this.f5559w).get());
            default:
                return new h2.c((Context) ((C4585b) this.f5557u).f38152u, (InterfaceC4590d) ((InterfaceC5045a) this.f5558v).get(), (C4572a) ((O2.i) this.f5559w).get());
        }
    }

    @Override // T.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f5558v;
    }

    @Override // h.InterfaceC4546b
    public Drawable i() {
        return (Drawable) this.f5558v;
    }

    @Override // K2.a
    public m j() {
        l3.h hVar = new l3.h();
        ((ExecutorService) this.f5559w).execute(new LD(28, this, hVar));
        return hVar.f38870a;
    }

    public Object k() {
        Object a9 = ((N.d) this.f5559w).a();
        if (a9 == null) {
            a9 = ((Q1.a) this.f5557u).e();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + a9.getClass());
            }
        }
        if (a9 instanceof Q1.b) {
            ((Q1.b) a9).d().f2479a = false;
        }
        return a9;
    }

    public boolean l(String workSpecId) {
        P0.b bVar;
        boolean z6;
        h.e(workSpecId, "workSpecId");
        synchronized (this.f5559w) {
            try {
                P0.b[] bVarArr = (P0.b[]) this.f5558v;
                int length = bVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i];
                    bVar.getClass();
                    Object obj = bVar.f2347d;
                    if (obj != null && bVar.b(obj) && bVar.f2346c.contains(workSpecId)) {
                        break;
                    }
                    i++;
                }
                if (bVar != null) {
                    J0.r.d().a(O0.c.f2246a, "Work " + workSpecId + " constrained by " + bVar.getClass().getSimpleName());
                }
                z6 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public s m() {
        s sVar = new s((UUID) this.f5557u, (p) this.f5558v, (LinkedHashSet) this.f5559w);
        J0.d dVar = ((p) this.f5558v).f2945j;
        boolean z6 = !dVar.f1410h.isEmpty() || dVar.f1406d || dVar.f1404b || dVar.f1405c;
        p pVar = (p) this.f5558v;
        if (pVar.f2952q) {
            if (z6) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f2943g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        h.d(randomUUID, "randomUUID()");
        this.f5557u = randomUUID;
        String uuid = randomUUID.toString();
        h.d(uuid, "id.toString()");
        p other = (p) this.f5558v;
        h.e(other, "other");
        int i = other.f2938b;
        String str = other.f2940d;
        J0.g gVar = new J0.g(other.f2941e);
        J0.g gVar2 = new J0.g(other.f2942f);
        long j6 = other.f2943g;
        J0.d other2 = other.f2945j;
        h.e(other2, "other");
        this.f5558v = new p(uuid, i, other.f2939c, str, gVar, gVar2, j6, other.f2944h, other.i, new J0.d(other2.f1403a, other2.f1404b, other2.f1405c, other2.f1406d, other2.f1407e, other2.f1408f, other2.f1409g, other2.f1410h), other.f2946k, other.f2947l, other.f2948m, other.f2949n, other.f2950o, other.f2951p, other.f2952q, other.f2953r, other.f2954s, 524288, 0);
        return sVar;
    }

    @Override // h.InterfaceC4546b
    public void n(int i) {
        Toolbar toolbar = (Toolbar) this.f5557u;
        if (i == 0) {
            toolbar.setNavigationContentDescription((CharSequence) this.f5559w);
        } else {
            toolbar.setNavigationContentDescription(i);
        }
    }

    public i o() {
        String str = ((String) this.f5557u) == null ? " backendName" : "";
        if (((Y1.d) this.f5559w) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new i((String) this.f5557u, (byte[]) this.f5558v, (Y1.d) this.f5559w);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap p(BitmapFactory.Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        switch (this.f5556n) {
            case 2:
                return D1.r.c(new P1.a(P1.b.c((ByteBuffer) this.f5557u)), options, this);
            case 3:
                z zVar = (z) ((com.bumptech.glide.load.data.g) this.f5557u).f24211u;
                zVar.reset();
                return D1.r.c(zVar, options, this);
            default:
                FileDescriptor fileDescriptor = ((com.bumptech.glide.load.data.g) this.f5559w).e().getFileDescriptor();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT != 34 || !D1.r.a(options) || !D1.r.d(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                Bitmap.Config config4 = options.inPreferredConfig;
                config = Bitmap.Config.HARDWARE;
                P1.g.a("", config4 == config);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (decodeFileDescriptor != null) {
                        try {
                            bitmap = D1.r.e(decodeFileDescriptor);
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

    @Override // l3.c
    public void r(m mVar) {
        N2.b bVar = (N2.b) this.f5557u;
        String str = (String) this.f5558v;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f5559w;
        synchronized (bVar.f1912a) {
            bVar.f1912a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void s(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f5558v;
        HashMap hashMap2 = (HashMap) this.f5557u;
        a4.f fVar = new a4.f(byteArrayOutputStream, hashMap2, hashMap, (Z3.a) this.f5559w);
        X3.d dVar = (X3.d) hashMap2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new X3.b("No encoder for " + obj.getClass());
        }
    }

    @Override // h.InterfaceC4546b
    public void t(j.a aVar, int i) {
        ((Toolbar) this.f5557u).setNavigationIcon(aVar);
        n(i);
    }

    public S u(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return v(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public S v(Class cls, String key) {
        S viewModel;
        h.e(key, "key");
        X x9 = (X) this.f5557u;
        x9.getClass();
        LinkedHashMap linkedHashMap = x9.f5120a;
        S s9 = (S) linkedHashMap.get(key);
        boolean isInstance = cls.isInstance(s9);
        V v9 = (V) this.f5558v;
        if (!isInstance) {
            C4561d c4561d = new C4561d((AbstractC4559b) this.f5559w);
            c4561d.f37969a.put(T.f5116b, key);
            try {
                viewModel = v9.b(cls, c4561d);
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
        O o4 = v9 instanceof O ? (O) v9 : null;
        if (o4 != null) {
            h.b(s9);
            AbstractC0502p abstractC0502p = o4.f5102d;
            if (abstractC0502p != null) {
                C5180c c5180c = o4.f5103e;
                h.b(c5180c);
                L.a(s9, c5180c, abstractC0502p);
            }
        }
        h.c(s9, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return s9;
    }

    public ImageHeaderParser$ImageType w() {
        switch (this.f5556n) {
            case 2:
                return t8.g.l((ArrayList) this.f5558v, P1.b.c((ByteBuffer) this.f5557u));
            case 3:
                z zVar = (z) ((com.bumptech.glide.load.data.g) this.f5557u).f24211u;
                zVar.reset();
                return t8.g.k((ArrayList) this.f5559w, zVar, (C2964aq) this.f5558v);
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) this.f5559w;
                C2964aq c2964aq = (C2964aq) this.f5557u;
                ArrayList arrayList = (ArrayList) this.f5558v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC5065d interfaceC5065d = (InterfaceC5065d) arrayList.get(i);
                    z zVar2 = null;
                    try {
                        z zVar3 = new z(new FileInputStream(gVar.e().getFileDescriptor()), c2964aq);
                        try {
                            ImageHeaderParser$ImageType c9 = interfaceC5065d.c(zVar3);
                            zVar3.b();
                            gVar.e();
                            if (c9 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return c9;
                            }
                        } catch (Throwable th) {
                            th = th;
                            zVar2 = zVar3;
                            if (zVar2 != null) {
                                zVar2.b();
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

    public File x(Context context) {
        ((c4.e) this.f5558v).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("pl_droidsonroids_gif"));
    }

    public boolean y(CharSequence charSequence, int i, int i4, u uVar) {
        if ((uVar.f4773c & 3) == 0) {
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) this.f5559w;
            C0515a b9 = uVar.b();
            int a9 = b9.a(8);
            if (a9 != 0) {
                ((ByteBuffer) b9.f2133w).getShort(a9 + b9.f2130n);
            }
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f4730b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i4) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f4731a;
            String sb2 = sb.toString();
            int i6 = G.h.f1035a;
            boolean a10 = G.f.a(textPaint, sb2);
            int i9 = uVar.f4773c & 4;
            uVar.f4773c = a10 ? i9 | 2 : i9 | 1;
        }
        return (uVar.f4773c & 3) == 2;
    }

    /* JADX WARN: Finally extract failed */
    public boolean z() {
        switch (this.f5556n) {
            case 2:
                ByteBuffer c9 = P1.b.c((ByteBuffer) this.f5557u);
                C2964aq c2964aq = (C2964aq) this.f5559w;
                if (c9 == null) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) this.f5558v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC5065d) arrayList.get(i)).e(c9, c2964aq)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 3:
                z zVar = (z) ((com.bumptech.glide.load.data.g) this.f5557u).f24211u;
                zVar.reset();
                C2964aq c2964aq2 = (C2964aq) this.f5558v;
                zVar.mark(5242880);
                ArrayList arrayList2 = (ArrayList) this.f5559w;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    try {
                        boolean d9 = ((InterfaceC5065d) arrayList2.get(i4)).d(zVar, c2964aq2);
                        zVar.reset();
                        if (d9) {
                            return true;
                        }
                    } catch (Throwable th) {
                        zVar.reset();
                        throw th;
                    }
                }
                return false;
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) this.f5559w;
                C2964aq c2964aq3 = (C2964aq) this.f5557u;
                ArrayList arrayList3 = (ArrayList) this.f5558v;
                int size3 = arrayList3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    InterfaceC5065d interfaceC5065d = (InterfaceC5065d) arrayList3.get(i6);
                    z zVar2 = null;
                    try {
                        z zVar3 = new z(new FileInputStream(gVar.e().getFileDescriptor()), c2964aq3);
                        try {
                            boolean d10 = interfaceC5065d.d(zVar3, c2964aq3);
                            zVar3.b();
                            gVar.e();
                            if (d10) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            zVar2 = zVar3;
                            if (zVar2 != null) {
                                zVar2.b();
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

    public /* synthetic */ e(int i, boolean z6) {
        this.f5556n = i;
    }

    public e(Activity activity) {
        this.f5556n = 9;
        this.f5559w = null;
        this.f5557u = activity;
        this.f5558v = (WindowManager) activity.getSystemService("window");
    }

    public e(Context context) {
        this.f5556n = 0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f5558v = newSingleThreadScheduledExecutor;
        this.f5559w = Executors.newSingleThreadExecutor();
        this.f5557u = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new G0.c(19, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public e(List list) {
        this.f5556n = 25;
        this.f5559w = list;
        this.f5557u = new ArrayList(list.size());
        this.f5558v = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f5557u).add(new c1.n((List) ((g1.f) list.get(i)).f37608b.f67u));
            ((ArrayList) this.f5558v).add(((g1.f) list.get(i)).f37609c.a());
        }
    }

    public e(AbstractServiceC0510y abstractServiceC0510y) {
        this.f5556n = 20;
        this.f5557u = new C0509x(abstractServiceC0510y);
        this.f5558v = new Handler();
    }

    public e(i iVar, Y1.c cVar, A a9, b2.n nVar) {
        this.f5556n = 23;
        this.f5557u = iVar;
        this.f5558v = cVar;
        this.f5559w = nVar;
    }

    public e(ExecutorService executorService) {
        this.f5556n = 16;
        this.f5558v = new Handler(Looper.getMainLooper());
        this.f5559w = new Q2.A(1, this);
        this.f5557u = new l(executorService);
    }

    public e(X store, V factory, AbstractC4559b defaultCreationExtras) {
        this.f5556n = 21;
        h.e(store, "store");
        h.e(factory, "factory");
        h.e(defaultCreationExtras, "defaultCreationExtras");
        this.f5557u = store;
        this.f5558v = factory;
        this.f5559w = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(X store, V v9) {
        this(store, v9, C4558a.f37968b);
        this.f5556n = 21;
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
        this.f5556n = 6;
        UUID randomUUID = UUID.randomUUID();
        h.d(randomUUID, "randomUUID()");
        this.f5557u = randomUUID;
        String uuid = ((UUID) this.f5557u).toString();
        h.d(uuid, "id.toString()");
        this.f5558v = new p(uuid, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.t(1));
        linkedHashSet.add(strArr[0]);
        this.f5559w = linkedHashSet;
        ((p) this.f5558v).f2940d = OverwritingInputMerger.class.getName();
    }

    public e(Context context, LocationManager locationManager) {
        this.f5556n = 29;
        this.f5559w = new J();
        this.f5557u = context;
        this.f5558v = locationManager;
    }

    public e(S0.i trackers, O0.b bVar) {
        this.f5556n = 10;
        h.e(trackers, "trackers");
        Q0.f tracker = (Q0.f) trackers.f2917u;
        h.e(tracker, "tracker");
        P0.a aVar = new P0.a(tracker, 0);
        Q0.a tracker2 = (Q0.a) trackers.f2918v;
        h.e(tracker2, "tracker");
        P0.a aVar2 = new P0.a(tracker2, 1);
        Q0.f tracker3 = (Q0.f) trackers.f2920x;
        h.e(tracker3, "tracker");
        P0.a aVar3 = new P0.a(tracker3, 4);
        Q0.f tracker4 = (Q0.f) trackers.f2919w;
        h.e(tracker4, "tracker");
        P0.a aVar4 = new P0.a(tracker4, 2);
        h.e(tracker4, "tracker");
        P0.a aVar5 = new P0.a(tracker4, 3);
        h.e(tracker4, "tracker");
        P0.d dVar = new P0.d(tracker4);
        h.e(tracker4, "tracker");
        P0.b[] bVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, dVar, new P0.c(tracker4)};
        this.f5557u = bVar;
        this.f5558v = bVarArr;
        this.f5559w = new Object();
    }

    public e(n nVar, c4.e eVar, androidx.emoji2.text.d dVar, Set set) {
        this.f5556n = 19;
        this.f5557u = eVar;
        this.f5558v = nVar;
        this.f5559w = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            C(str, 0, str.length(), 1, true, new C0316m(str, 2));
        }
    }

    public e(N.d dVar, Q1.a aVar, Q1.c cVar) {
        this.f5556n = 11;
        this.f5559w = dVar;
        this.f5557u = aVar;
        this.f5558v = cVar;
    }

    public e(P1.m mVar, ArrayList arrayList, C2964aq c2964aq) {
        this.f5556n = 3;
        P1.g.c(c2964aq, "Argument must not be null");
        this.f5558v = c2964aq;
        P1.g.c(arrayList, "Argument must not be null");
        this.f5559w = arrayList;
        this.f5557u = new com.bumptech.glide.load.data.g(mVar, c2964aq);
    }

    public e(int i) {
        this.f5556n = i;
        switch (i) {
            case 14:
                c4.e eVar = new c4.e();
                O2.i iVar = new O2.i(9);
                this.f5557u = new HashSet();
                this.f5558v = eVar;
                this.f5559w = iVar;
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f5557u = list;
                this.f5558v = list;
                break;
        }
    }

    public e(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C2964aq c2964aq) {
        this.f5556n = 4;
        P1.g.c(c2964aq, "Argument must not be null");
        this.f5557u = c2964aq;
        P1.g.c(arrayList, "Argument must not be null");
        this.f5558v = arrayList;
        this.f5559w = new com.bumptech.glide.load.data.g(parcelFileDescriptor);
    }

    public e(Matcher matcher, String input) {
        this.f5556n = 12;
        h.e(input, "input");
        this.f5557u = matcher;
        this.f5558v = new Q7.h(this);
    }

    public e(Toolbar toolbar) {
        this.f5556n = 28;
        this.f5557u = toolbar;
        this.f5558v = toolbar.getNavigationIcon();
        this.f5559w = toolbar.getNavigationContentDescription();
    }
}
