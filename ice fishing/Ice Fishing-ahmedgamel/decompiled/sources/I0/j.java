package I0;

import A1.C0260b;
import A1.E;
import A1.InterfaceC0259a;
import A1.y;
import E2.BinderC0314k;
import O.A0;
import O.InterfaceC0350u;
import O.X;
import O.y0;
import Q2.C0365j;
import Q2.H;
import Q2.InterfaceC0364i;
import a.AbstractC0426a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import com.IceFishing.LiveIceFishing.AgeSelection;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.GameCategoriesActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.IceFishing.LiveIceFishing.SplashActivity;
import com.IceFishing.LiveIceFishing.ViewOnClickListenerC0557a;
import com.IceFishing.LiveIceFishing.ViewOnClickListenerC0560d;
import com.IceFishing.LiveIceFishing.r;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AD;
import com.google.android.gms.internal.ads.InterfaceC4078vb;
import com.google.android.gms.internal.ads.QC;
import d2.InterfaceC4460b;
import e.InterfaceC4467b;
import f6.C4522a;
import h.AbstractC4545a;
import h.C4544H;
import h.InterfaceC4546b;
import h.LayoutInflaterFactory2C4537A;
import h.w;
import i1.C4585b;
import java.lang.reflect.InvocationHandler;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import l.SubMenuC4654E;
import l.x;
import l4.q;
import m.C4708k;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import u.AbstractC5050e;
import u7.C5081g;
import u7.v;
import v7.t;
import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public class j implements WebMessageListenerBoundaryInterface, y, InterfaceC0259a, InterfaceC0350u, u1.f, AD, H, InterfaceC0364i, V7.b, InterfaceC4467b, Y0.o, InterfaceC4546b, l.k, InterfaceC4460b, x {

    /* renamed from: v, reason: collision with root package name */
    public static j f1288v;

    /* renamed from: w, reason: collision with root package name */
    public static SharedPreferences.Editor f1289w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1290n;

    /* renamed from: u, reason: collision with root package name */
    public Object f1291u;

    public /* synthetic */ j(int i, Object obj) {
        this.f1290n = i;
        this.f1291u = obj;
    }

    @Override // Y0.o
    public void OnCall() {
        switch (this.f1290n) {
            case 18:
                ViewOnClickListenerC0557a viewOnClickListenerC0557a = (ViewOnClickListenerC0557a) this.f1291u;
                viewOnClickListenerC0557a.f6389u.startActivity(new Intent(viewOnClickListenerC0557a.f6389u, (Class<?>) GameCategoriesActivity.class));
                break;
            case 19:
                ViewOnClickListenerC0560d viewOnClickListenerC0560d = (ViewOnClickListenerC0560d) this.f1291u;
                viewOnClickListenerC0560d.f6397u.startActivity(new Intent(viewOnClickListenerC0560d.f6397u, (Class<?>) AgeSelection.class));
                break;
            case 20:
                r rVar = (r) this.f1291u;
                rVar.f6423v.f6298v.stopLoading();
                rVar.f6423v.f6298v.destroy();
                rVar.f6423v.f6298v.removeAllViews();
                rVar.f6422u.dismiss();
                rVar.f6423v.finish();
                break;
            default:
                MainActivity mainActivity = ((com.IceFishing.LiveIceFishing.y) this.f1291u).f6437u.f6440c;
                mainActivity.startActivity(mainActivity.f6334S);
                break;
        }
    }

    @Override // h.InterfaceC4546b
    public boolean a() {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) this.f1291u;
        layoutInflaterFactory2C4537A.C();
        AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
        return (abstractC4545a == null || (abstractC4545a.d() & 4) == 0) ? false : true;
    }

    @Override // Q2.InterfaceC0364i
    public void accept(Object obj, Object obj2) {
        l3.h hVar = (l3.h) obj2;
        T2.a aVar = (T2.a) ((T2.d) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f5723v);
        int i = c3.b.f5724a;
        R2.n nVar = (R2.n) this.f1291u;
        if (nVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            nVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.f5722u.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // l.x
    public void b(l.m mVar, boolean z6) {
        if (mVar instanceof SubMenuC4654E) {
            ((SubMenuC4654E) mVar).f38665S.k().c(false);
        }
        x xVar = ((C4708k) this.f1291u).f39245x;
        if (xVar != null) {
            xVar.b(mVar, z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AD
    public P3.a c() {
        BinderC0314k binderC0314k = (BinderC0314k) this.f1291u;
        binderC0314k.getClass();
        try {
            return (P3.a) binderC0314k.Z3(binderC0314k.f833v, null, "BANNER", null, null, new Bundle()).f35131W.f();
        } catch (NullPointerException e9) {
            return QC.k(e9);
        }
    }

    @Override // u1.f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l9 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f1291u)) {
            ((ByteBuffer) this.f1291u).position(0);
            messageDigest.update(((ByteBuffer) this.f1291u).putLong(l9.longValue()).array());
        }
    }

    @Override // l.x
    public boolean e(l.m mVar) {
        C4708k c4708k = (C4708k) this.f1291u;
        if (mVar == c4708k.f39243v) {
            return false;
        }
        ((SubMenuC4654E) mVar).f38666T.getClass();
        c4708k.getClass();
        x xVar = c4708k.f39245x;
        if (xVar != null) {
            return xVar.e(mVar);
        }
        return false;
    }

    @Override // e.InterfaceC4467b
    public void f(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        N n9 = (N) this.f1291u;
        K k9 = (K) n9.f4808C.pollFirst();
        if (k9 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        q qVar = n9.f4820c;
        String str = k9.f4802n;
        if (qVar.c(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override // h.InterfaceC4546b
    public Context g() {
        return ((LayoutInflaterFactory2C4537A) this.f1291u).z();
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        return new i2.j((Context) ((C4585b) this.f1291u).f38152u, "com.google.android.datatransport.events", Integer.valueOf(i2.j.f38176w).intValue());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // l.k
    public void h(l.m mVar) {
        C4544H c4544h = (C4544H) this.f1291u;
        boolean p9 = c4544h.f37844a.f39151a.p();
        w wVar = c4544h.f37845b;
        if (p9) {
            wVar.onPanelClosed(108, mVar);
        } else if (wVar.onPreparePanel(0, null, mVar)) {
            wVar.onMenuOpened(108, mVar);
        }
    }

    @Override // h.InterfaceC4546b
    public Drawable i() {
        l4.g r9 = l4.g.r(((LayoutInflaterFactory2C4537A) this.f1291u).z(), null, new int[]{C5248R.attr.homeAsUpIndicator});
        Drawable i = r9.i(0);
        r9.t();
        return i;
    }

    @Override // A1.y
    public A1.x j(E e9) {
        return new C0260b(0, (AssetManager) this.f1291u, this);
    }

    @Override // Q2.H
    public void k(int i) {
        C0365j c0365j = (C0365j) this.f1291u;
        ReentrantLock reentrantLock = (ReentrantLock) c0365j.f2565C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0365j.f2565C;
        reentrantLock.lock();
        try {
            if (c0365j.f2566n) {
                c0365j.f2566n = false;
                C0365j.g(c0365j, i);
            } else {
                c0365j.f2566n = true;
                ((Q2.y) c0365j.f2569w).onConnectionSuspended(i);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // V7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(V7.c cVar, InterfaceC5240d interfaceC5240d) {
        V7.a aVar;
        int i;
        Throwable th;
        W7.q qVar;
        if (interfaceC5240d instanceof V7.a) {
            aVar = (V7.a) interfaceC5240d;
            int i4 = aVar.f3451w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.f3451w = i4 - Integer.MIN_VALUE;
                Object obj = aVar.f3449u;
                A7.a aVar2 = A7.a.f215n;
                i = aVar.f3451w;
                v vVar = v.f41073a;
                if (i != 0) {
                    Q3.b.s(obj);
                    W7.q qVar2 = new W7.q(cVar, aVar.getContext());
                    try {
                        aVar.f3448n = qVar2;
                        aVar.f3451w = 1;
                        Object invoke = ((X.q) this.f1291u).invoke(qVar2, aVar);
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
                    qVar = aVar.f3448n;
                    try {
                        Q3.b.s(obj);
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
        aVar = new V7.a(this, interfaceC5240d);
        Object obj2 = aVar.f3449u;
        A7.a aVar22 = A7.a.f215n;
        i = aVar.f3451w;
        v vVar2 = v.f41073a;
        if (i != 0) {
        }
        qVar.releaseIntercepted();
        return vVar2;
    }

    @Override // l.k
    public boolean m(l.m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // h.InterfaceC4546b
    public void n(int i) {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) this.f1291u;
        layoutInflaterFactory2C4537A.C();
        AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
        if (abstractC4545a != null) {
            abstractC4545a.n(i);
        }
    }

    @Override // Q2.H
    public void o(Bundle bundle) {
        C0365j c0365j = (C0365j) this.f1291u;
        ReentrantLock reentrantLock = (ReentrantLock) c0365j.f2565C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0365j.f2565C;
        reentrantLock.lock();
        try {
            c0365j.f2564B = O2.b.f2254y;
            C0365j.h(c0365j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z6, InvocationHandler invocationHandler2) {
        H0.c cVar;
        H0.c cVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) A8.b.b(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        n4.c[] cVarArr = new n4.c[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            n4.c cVar3 = new n4.c(8);
            cVar3.f39658u = (WebMessagePortBoundaryInterface) A8.b.b(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i] = cVar3;
        }
        if (m.f1293a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) A8.b.b(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                cVar = new H0.c(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    cVar2 = null;
                    if (cVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) A8.b.b(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((H0.d) this.f1291u).onPostMessage(webView, cVar2, uri, z6, (g) jsReplyProxyBoundaryInterface.getOrCreatePeer(new f(0, jsReplyProxyBoundaryInterface)));
                        return;
                    }
                    return;
                }
                cVar = new H0.c(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            cVar = new H0.c(webMessageBoundaryInterface.getData());
        }
        cVar2 = cVar;
        if (cVar2 == null) {
        }
    }

    @Override // O.InterfaceC0350u
    public A0 p(View view, A0 a02) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1291u;
        if (!Objects.equals(coordinatorLayout.f4638G, a02)) {
            coordinatorLayout.f4638G = a02;
            boolean z6 = a02.d() > 0;
            coordinatorLayout.f4639H = z6;
            coordinatorLayout.setWillNotDraw(!z6 && coordinatorLayout.getBackground() == null);
            y0 y0Var = a02.f2115a;
            if (!y0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = X.f2142a;
                    if (childAt.getFitsSystemWindows() && ((B.e) childAt.getLayoutParams()).f229a != null && y0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return a02;
    }

    @Override // A1.InterfaceC0259a
    public com.bumptech.glide.load.data.d q(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.i(assetManager, str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(B7.c cVar) {
        G5.a aVar;
        int i;
        C5081g[] c5081gArr;
        String str;
        C5081g[] c5081gArr2;
        j jVar;
        if (cVar instanceof G5.a) {
            aVar = (G5.a) cVar;
            int i4 = aVar.f1182z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.f1182z = i4 - Integer.MIN_VALUE;
                Object obj = aVar.f1180x;
                A7.a aVar2 = A7.a.f215n;
                i = aVar.f1182z;
                if (i != 0) {
                    Q3.b.s(obj);
                    c5081gArr = new C5081g[10];
                    aVar.f1176n = this;
                    aVar.f1177u = c5081gArr;
                    aVar.f1178v = c5081gArr;
                    aVar.f1179w = "ossdk.install_id";
                    aVar.f1182z = 1;
                    Object installId = ((F5.f) this.f1291u).getInstallId(aVar);
                    if (installId == aVar2) {
                        return aVar2;
                    }
                    str = "ossdk.install_id";
                    obj = installId;
                    c5081gArr2 = c5081gArr;
                    jVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = aVar.f1179w;
                    c5081gArr = aVar.f1178v;
                    c5081gArr2 = aVar.f1177u;
                    jVar = aVar.f1176n;
                    Q3.b.s(obj);
                }
                c5081gArr[0] = new C5081g(str, obj);
                c5081gArr2[1] = new C5081g("ossdk.sdk_base", ((F5.f) jVar.f1291u).getSdkBase());
                F5.f fVar = (F5.f) jVar.f1291u;
                c5081gArr2[2] = new C5081g("ossdk.sdk_base_version", fVar.getSdkBaseVersion());
                c5081gArr2[3] = new C5081g("ossdk.app_package_id", fVar.getAppPackageId());
                c5081gArr2[4] = new C5081g("ossdk.app_version", fVar.getAppVersion());
                c5081gArr2[5] = new C5081g("device.manufacturer", fVar.getDeviceManufacturer());
                c5081gArr2[6] = new C5081g("device.model.identifier", fVar.getDeviceModel());
                c5081gArr2[7] = new C5081g("os.name", fVar.getOsName());
                c5081gArr2[8] = new C5081g("os.version", fVar.getOsVersion());
                c5081gArr2[9] = new C5081g("os.build_id", fVar.getOsBuildId());
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.t(c5081gArr2.length));
                t.v(linkedHashMap, c5081gArr2);
                AbstractC0426a.m(linkedHashMap, "ossdk.sdk_wrapper", fVar.getSdkWrapper());
                AbstractC0426a.m(linkedHashMap, "ossdk.sdk_wrapper_version", fVar.getSdkWrapperVersion());
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(...)");
                return unmodifiableMap;
            }
        }
        aVar = new G5.a(this, cVar);
        Object obj2 = aVar.f1180x;
        A7.a aVar22 = A7.a.f215n;
        i = aVar.f1182z;
        if (i != 0) {
        }
        c5081gArr[0] = new C5081g(str, obj2);
        c5081gArr2[1] = new C5081g("ossdk.sdk_base", ((F5.f) jVar.f1291u).getSdkBase());
        F5.f fVar2 = (F5.f) jVar.f1291u;
        c5081gArr2[2] = new C5081g("ossdk.sdk_base_version", fVar2.getSdkBaseVersion());
        c5081gArr2[3] = new C5081g("ossdk.app_package_id", fVar2.getAppPackageId());
        c5081gArr2[4] = new C5081g("ossdk.app_version", fVar2.getAppVersion());
        c5081gArr2[5] = new C5081g("device.manufacturer", fVar2.getDeviceManufacturer());
        c5081gArr2[6] = new C5081g("device.model.identifier", fVar2.getDeviceModel());
        c5081gArr2[7] = new C5081g("os.name", fVar2.getOsName());
        c5081gArr2[8] = new C5081g("os.version", fVar2.getOsVersion());
        c5081gArr2[9] = new C5081g("os.build_id", fVar2.getOsBuildId());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.t(c5081gArr2.length));
        t.v(linkedHashMap2, c5081gArr2);
        AbstractC0426a.m(linkedHashMap2, "ossdk.sdk_wrapper", fVar2.getSdkWrapper());
        AbstractC0426a.m(linkedHashMap2, "ossdk.sdk_wrapper_version", fVar2.getSdkWrapperVersion());
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        kotlin.jvm.internal.h.d(unmodifiableMap2, "unmodifiableMap(...)");
        return unmodifiableMap2;
    }

    @Override // Q2.H
    public void s(O2.b bVar) {
        C0365j c0365j = (C0365j) this.f1291u;
        ReentrantLock reentrantLock = (ReentrantLock) c0365j.f2565C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0365j.f2565C;
        reentrantLock.lock();
        try {
            c0365j.f2564B = bVar;
            C0365j.h(c0365j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // h.InterfaceC4546b
    public void t(j.a aVar, int i) {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) this.f1291u;
        layoutInflaterFactory2C4537A.C();
        AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
        if (abstractC4545a != null) {
            abstractC4545a.o(aVar);
            abstractC4545a.n(i);
        }
    }

    public void u() {
        View view = (View) this.f1291u;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void v(ImageView.ScaleType scaleType) {
        InterfaceC4078vb interfaceC4078vb = ((NativeAdView) this.f1291u).f24376u;
        if (interfaceC4078vb == null || scaleType == null) {
            return;
        }
        try {
            interfaceC4078vb.Y2(new Y2.b(scaleType));
        } catch (RemoteException e9) {
            x2.i.d("Unable to call setMediaViewImageScaleType on delegate", e9);
        }
    }

    public j(SplashActivity splashActivity) {
        this.f1290n = 22;
        SharedPreferences sharedPreferences = splashActivity.getSharedPreferences("HeartRate", 0);
        this.f1291u = sharedPreferences;
        f1289w = sharedPreferences.edit();
    }

    public j(int i, H5.a aVar, a7.k kVar, String str) {
        C4522a c4522a;
        this.f1290n = 10;
        a7.j jVar = kVar.f4347c;
        int i4 = jVar.f4343u;
        int d9 = AbstractC5050e.d(i);
        Object obj = O6.f.f2308a;
        if (d9 == 0) {
            k6.e eVar = O6.d.i;
            switch (jVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    obj = new O6.d(aVar, jVar);
                    break;
            }
            this.f1291u = obj;
            return;
        }
        if (d9 != 1) {
            throw new IllegalStateException("Unhandled case: ".concat(D.x.A(i)));
        }
        if (i4 != 4) {
            try {
                URI uri = new URI(str);
                K1.c cVar = new K1.c(1);
                String host = uri.getHost();
                if (host != null) {
                    cVar.c(a7.i.f4337d, host);
                }
                int port = uri.getPort();
                if (port == -1) {
                    String scheme = uri.getScheme();
                    if ("https".equals(scheme)) {
                        port = 443;
                    } else if ("http".equals(scheme)) {
                        port = 80;
                    }
                }
                if (port != -1) {
                    cVar.c(a7.i.f4338e, Long.valueOf(port));
                }
                c4522a = cVar.a();
            } catch (URISyntaxException unused) {
                c4522a = C4522a.f37475w;
            }
            obj = new O6.h(aVar, i4, kVar, c4522a);
        }
        this.f1291u = obj;
    }

    public j(int i) {
        this.f1290n = i;
        switch (i) {
            case 8:
                this.f1291u = new Object();
                new Handler(Looper.getMainLooper(), new H1.g(1, this));
                break;
            case 27:
                break;
            default:
                this.f1291u = ByteBuffer.allocate(8);
                break;
        }
    }

    public j(TextView textView) {
        this.f1290n = 17;
        this.f1291u = new c0.g(textView);
    }
}
