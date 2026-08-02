package g1;

import B.e;
import C2.t;
import C2.y;
import O.A0;
import O.InterfaceC0329e;
import O.InterfaceC0345u;
import O.X;
import O.y0;
import O2.B;
import O2.C0360j;
import O2.C0369t;
import O2.I;
import O2.InterfaceC0359i;
import O2.x;
import O2.z;
import P2.n;
import R2.d;
import W7.q;
import X0.A;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.C0544a;
import com.anythink.core.common.d.j;
import com.anythink.core.common.s;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.C2644Kl;
import com.google.android.gms.internal.ads.FE;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.Qx;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import com.icefishingapp.icefishing.IntroActivity;
import com.icefishingapp.icefishing.LanguageActivity;
import com.icefishingapp.icefishing.MainActivity;
import com.icefishingapp.icefishing.ViewOnClickListenerC4400b;
import g7.m;
import g7.p;
import h.LayoutInflaterFactory2C4533A;
import i7.AbstractC4593d;
import j1.AbstractC4599c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import m.W;
import m1.C4729d;
import m6.k;
import o4.InterfaceC4799l;
import q3.InterfaceC4921a;
import s.i;
import s1.f;
import u7.v;
import y8.h;
import z7.InterfaceC5267d;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4523c implements InterfaceC0345u, f, KD, H0.b, InterfaceC0329e, x, I, InterfaceC0359i, V7.b, InterfaceC4799l, k, l.x, W, InterfaceC4921a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37626n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f37627u;

    public /* synthetic */ C4523c(int i, Object obj) {
        this.f37626n = i;
        this.f37627u = obj;
    }

    public long A() {
        return ((C0544a) this.f37627u).c();
    }

    @Override // m6.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public p build() {
        return (p) ((m) this.f37627u).b(new d4.f(5));
    }

    public h C(long j6) {
        return ((C0544a) this.f37627u).d((int) j6);
    }

    public A D(Context context, String str, InputStream inputStream, String str2, String str3) {
        A g4;
        EnumC4521a enumC4521a;
        if (str2 == null) {
            str2 = com.anythink.core.common.m.a.f14404q;
        }
        boolean contains = str2.contains("application/zip");
        C4522b c4522b = (C4522b) this.f37627u;
        if (contains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC4599c.a();
            EnumC4521a enumC4521a2 = EnumC4521a.ZIP;
            g4 = str3 != null ? X0.m.g(context, new ZipInputStream(new FileInputStream(c4522b.V(str, inputStream, enumC4521a2))), str) : X0.m.g(context, new ZipInputStream(inputStream), null);
            enumC4521a = enumC4521a2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC4599c.a();
            enumC4521a = EnumC4521a.GZIP;
            g4 = str3 != null ? X0.m.d(str, new GZIPInputStream(new FileInputStream(c4522b.V(str, inputStream, enumC4521a)))) : X0.m.d(null, new GZIPInputStream(inputStream));
        } else {
            AbstractC4599c.a();
            enumC4521a = EnumC4521a.JSON;
            g4 = str3 != null ? X0.m.d(str, new FileInputStream(c4522b.V(str, inputStream, enumC4521a).getAbsolutePath())) : X0.m.d(null, inputStream);
        }
        if (str3 != null && g4.f3575a != null) {
            File file = new File(c4522b.S(), C4522b.A(str, enumC4521a, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            AbstractC4599c.a();
            if (!renameTo) {
                AbstractC4599c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + j.f12378z);
            }
        }
        return g4;
    }

    public void E(C4729d c4729d, o oVar, RunnableC3191fP runnableC3191fP) {
        synchronized (c4729d.f39297w) {
            c4729d.f39288B = true;
        }
        c4729d.a("post-response");
        ((B) this.f37627u).execute(new y(13, c4729d, oVar, runnableC3191fP));
    }

    public void F(int i) {
        ((C0544a) this.f37627u).k(i);
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        switch (this.f37626n) {
            case 16:
                ViewOnClickListenerC4400b viewOnClickListenerC4400b = (ViewOnClickListenerC4400b) this.f37627u;
                viewOnClickListenerC4400b.f36904u.startActivity(new Intent(viewOnClickListenerC4400b.f36904u, (Class<?>) LanguageActivity.class));
                break;
            case 17:
                IntroActivity introActivity = ((com.icefishingapp.icefishing.o) this.f37627u).f36928u;
                introActivity.startActivity(introActivity.f36779x);
                break;
            case 18:
                MainActivity mainActivity = ((com.icefishingapp.icefishing.x) this.f37627u).f36946u.f36949c;
                mainActivity.startActivity(mainActivity.f36836O);
                break;
            default:
                MainActivity mainActivity2 = ((com.icefishingapp.icefishing.x) this.f37627u).f36946u.f36949c;
                mainActivity2.startActivity(mainActivity2.f36846T);
                break;
        }
    }

    @Override // m6.k
    public k a() {
        ((m) this.f37627u).f37666d = "The duration of exporting a batch of telemetry records";
        return this;
    }

    @Override // O2.InterfaceC0359i
    public void accept(Object obj, Object obj2) {
        j3.h hVar = (j3.h) obj2;
        R2.a aVar = (R2.a) ((d) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f4330v);
        int i = a3.b.f4331a;
        n nVar = (n) this.f37627u;
        if (nVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            nVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.f4329u.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // l.x
    public void b(l.m mVar, boolean z3) {
        ((LayoutInflaterFactory2C4533A) this.f37627u).s(mVar);
    }

    @Override // m6.k
    public k c() {
        ((m) this.f37627u).f37667e = s.f16249a;
        return this;
    }

    @Override // O.InterfaceC0329e
    public int d() {
        int source;
        source = ((ContentInfo) this.f37627u).getSource();
        return source;
    }

    @Override // O.InterfaceC0329e
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.f37627u).getClip();
        return clip;
    }

    @Override // O2.I
    public void f(M2.b bVar) {
        C0360j c0360j = (C0360j) this.f37627u;
        ReentrantLock reentrantLock = (ReentrantLock) c0360j.f2247C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0360j.f2247C;
        reentrantLock.lock();
        try {
            c0360j.f2245A = bVar;
            C0360j.h(c0360j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // s1.f
    public void h(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f37627u)) {
            ((ByteBuffer) this.f37627u).position(0);
            messageDigest.update(((ByteBuffer) this.f37627u).putInt(num.intValue()).array());
        }
    }

    @Override // O2.x
    public void i() {
        z zVar = (z) this.f37627u;
        zVar.f2324n.lock();
        try {
            zVar.f2320D = new C0369t(zVar, zVar.f2317A, zVar.f2318B, zVar.f2327w, zVar.f2319C, zVar.f2324n, zVar.f2326v);
            zVar.f2320D.t();
            zVar.f2325u.signalAll();
        } finally {
            zVar.f2324n.unlock();
        }
    }

    @Override // l.x
    public boolean j(l.m mVar) {
        Window.Callback callback = ((LayoutInflaterFactory2C4533A) this.f37627u).f37762E.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    @Override // m6.k
    public k k() {
        List list = Collections.EMPTY_LIST;
        try {
            Objects.requireNonNull(list, "bucketBoundaries must not be null");
            AbstractC4593d.a(list);
            ((F1.a) ((m) this.f37627u).f37670h).f903u = Collections.unmodifiableList(new ArrayList(list));
            return this;
        } catch (IllegalArgumentException | NullPointerException e9) {
            p.f37679w.warning("Error setting explicit bucket boundaries advice: " + e9.getMessage());
            return this;
        }
    }

    @Override // O2.I
    public void l(int i) {
        M2.b bVar;
        C0360j c0360j = (C0360j) this.f37627u;
        ReentrantLock reentrantLock = (ReentrantLock) c0360j.f2247C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0360j.f2247C;
        reentrantLock.lock();
        try {
            if (!c0360j.f2248n && (bVar = (M2.b) c0360j.f2246B) != null && bVar.b()) {
                c0360j.f2248n = true;
                ((z) c0360j.f2252x).onConnectionSuspended(i);
                return;
            }
            c0360j.f2248n = false;
            C0360j.g(c0360j, i);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // O2.I
    public void m(Bundle bundle) {
        C0360j c0360j = (C0360j) this.f37627u;
        ReentrantLock reentrantLock = (ReentrantLock) c0360j.f2247C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0360j.f2247C;
        reentrantLock.lock();
        try {
            Bundle bundle2 = (Bundle) c0360j.f2254z;
            if (bundle2 == null) {
                c0360j.f2254z = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            c0360j.f2245A = M2.b.f1828y;
            C0360j.h(c0360j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        C2644Kl c2644Kl = (C2644Kl) this.f37627u;
        t tVar = (t) obj;
        synchronized (c2644Kl) {
            c2644Kl.M1(new Qx(21, tVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // V7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(V7.c cVar, InterfaceC5267d interfaceC5267d) {
        V7.a aVar;
        int i;
        Throwable th;
        q qVar;
        if (interfaceC5267d instanceof V7.a) {
            aVar = (V7.a) interfaceC5267d;
            int i6 = aVar.f3321w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f3321w = i6 - Integer.MIN_VALUE;
                Object obj = aVar.f3319u;
                A7.a aVar2 = A7.a.f58n;
                i = aVar.f3321w;
                v vVar = v.f41353a;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    q qVar2 = new q(cVar, aVar.getContext());
                    try {
                        aVar.f3318n = qVar2;
                        aVar.f3321w = 1;
                        Object invoke = ((X.q) this.f37627u).invoke(qVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = vVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        qVar = qVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        qVar = qVar2;
                        qVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = aVar.f3318n;
                    try {
                        com.bumptech.glide.d.k(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        qVar.releaseIntercepted();
                        throw th;
                    }
                }
                qVar.releaseIntercepted();
                return vVar;
            }
        }
        aVar = new V7.a(this, interfaceC5267d);
        Object obj2 = aVar.f3319u;
        A7.a aVar22 = A7.a.f58n;
        i = aVar.f3321w;
        v vVar2 = v.f41353a;
        if (i != 0) {
        }
        qVar.releaseIntercepted();
        return vVar2;
    }

    @Override // O.InterfaceC0345u
    public A0 q(View view, A0 a02) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f37627u;
        if (!Objects.equals(coordinatorLayout.f4670G, a02)) {
            coordinatorLayout.f4670G = a02;
            boolean z3 = a02.d() > 0;
            coordinatorLayout.f4671H = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            y0 y0Var = a02.f2027a;
            if (!y0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = X.f2054a;
                    if (childAt.getFitsSystemWindows() && ((e) childAt.getLayoutParams()).f71a != null && y0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return a02;
    }

    @Override // O2.x
    public void t() {
        z zVar = (z) this.f37627u;
        Iterator it = ((i) zVar.f2329y.values()).iterator();
        while (it.hasNext()) {
            ((N2.c) it.next()).h();
        }
        zVar.f2322F.f2303I = Collections.EMPTY_SET;
    }

    public String toString() {
        switch (this.f37626n) {
            case 7:
                return "ContentInfoCompat{" + ((ContentInfo) this.f37627u) + "}";
            case 20:
                return ((m) this.f37627u).d(getClass().getSimpleName());
            default:
                return super.toString();
        }
    }

    @Override // O.InterfaceC0329e
    public int u() {
        int flags;
        flags = ((ContentInfo) this.f37627u).getFlags();
        return flags;
    }

    @Override // O.InterfaceC0329e
    public ContentInfo v() {
        return (ContentInfo) this.f37627u;
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C2644Kl c2644Kl = (C2644Kl) this.f37627u;
        String message = th.getMessage();
        synchronized (c2644Kl) {
            c2644Kl.M1(new FE(message, 7));
        }
    }

    @Override // O2.x
    public boolean x() {
        return true;
    }

    public C4523c(C4522b c4522b, M2.i iVar) {
        this.f37626n = 0;
        this.f37627u = c4522b;
    }

    public C4523c(Handler handler) {
        this.f37626n = 25;
        this.f37627u = new B(4, handler);
    }

    public C4523c(C0544a c0544a) {
        this.f37626n = 15;
        new ArrayList();
        this.f37627u = c0544a;
    }

    public C4523c(Context context) {
        boolean isEmpty;
        this.f37626n = 24;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f37627u = sharedPreferences;
        File file = new File(E.a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e9) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e9.getMessage());
            }
        }
    }

    public C4523c(g7.t tVar, String str) {
        this.f37626n = 20;
        this.f37627u = new m(str, g7.n.f37673v, 2, tVar);
    }

    public C4523c(int i) {
        Handler handler;
        Handler handler2;
        this.f37626n = i;
        switch (i) {
            case 6:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = K.i.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f37627u = handler2;
                        return;
                    } catch (InstantiationException e10) {
                        e = e10;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f37627u = handler2;
                        return;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f37627u = handler2;
                        return;
                    } catch (InvocationTargetException e12) {
                        Throwable cause = e12.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handler2 = handler;
                }
                this.f37627u = handler2;
                return;
            case 21:
                this.f37627u = new ConcurrentHashMap(16);
                return;
            case 27:
                this.f37627u = new LinkedHashSet();
                return;
            default:
                this.f37627u = ByteBuffer.allocate(4);
                return;
        }
    }

    @Override // O2.x
    public void g(Bundle bundle) {
    }

    @Override // m.W
    public void o(int i) {
    }

    @Override // O2.x
    public void r(int i) {
    }

    @Override // m.W
    public void y(int i) {
    }

    public C4523c(ContentInfo contentInfo) {
        this.f37626n = 7;
        contentInfo.getClass();
        this.f37627u = B3.e.q(contentInfo);
    }

    @Override // m.W
    public void z(int i, float f3) {
    }

    @Override // O2.x
    public void s(M2.b bVar, N2.e eVar, boolean z3) {
    }
}
