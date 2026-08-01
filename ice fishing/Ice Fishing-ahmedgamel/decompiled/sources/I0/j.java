package I0;

import C2.BinderC0278k;
import D.y;
import O.B;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.InterfaceC4055vb;
import com.google.android.gms.internal.ads.KD;
import com.icefishing.icefishingbigwin.A;
import com.icefishing.icefishingbigwin.G;
import com.icefishing.icefishingbigwin.GenderActivity;
import com.icefishing.icefishingbigwin.MainActivity;
import com.icefishing.icefishingbigwin.PlaygamesActivity;
import com.icefishing.icefishingbigwin.StartActivity;
import com.icefishing.icefishingbigwin.ViewOnClickListenerC4401c;
import com.icefishing.icefishingbigwin.q;
import com.icefishing.icefishingbigwin.x;
import d1.C4445c;
import e.C4455a;
import e.InterfaceC4456b;
import e7.C4468a;
import f6.C4512a;
import g1.C4522b;
import g1.C4523c;
import g7.v;
import j3.InterfaceC4604a;
import j7.EnumC4613b;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import m.InterfaceC4688g0;
import m.U0;
import m6.t;
import m7.C4741a;
import m8.s;
import n7.AbstractC4770a;
import n7.C4772c;
import o4.InterfaceC4799l;
import o7.C4802a;
import o7.C4805d;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p2.C4835j;
import q2.r;
import u.AbstractC5049e;
import u2.z;

/* loaded from: classes.dex */
public class j implements WebMessageListenerBoundaryInterface, B1.l, KD, j3.c, InterfaceC4604a, InterfaceC4456b, InterfaceC4799l, m6.n, InterfaceC4688g0, U0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1263n;

    /* renamed from: u, reason: collision with root package name */
    public Object f1264u;

    public /* synthetic */ j(int i, Object obj) {
        this.f1263n = i;
        this.f1264u = obj;
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        switch (this.f1263n) {
            case 19:
                ViewOnClickListenerC4401c viewOnClickListenerC4401c = (ViewOnClickListenerC4401c) this.f1264u;
                viewOnClickListenerC4401c.f36906u.startActivity(new Intent(viewOnClickListenerC4401c.f36906u, (Class<?>) MainActivity.class));
                break;
            case 20:
                q qVar = (q) this.f1264u;
                qVar.f36931u.startActivity(new Intent(qVar.f36931u, (Class<?>) GenderActivity.class));
                break;
            case 21:
                MainActivity mainActivity = ((x) this.f1264u).f36946u.f36949c;
                mainActivity.startActivity(mainActivity.f36842R);
                break;
            case 22:
                PlaygamesActivity playgamesActivity = ((A) this.f1264u).f36337u;
                playgamesActivity.startActivity(playgamesActivity.f36880u);
                break;
            default:
                StartActivity startActivity = ((G) this.f1264u).f36392u;
                startActivity.startActivity(startActivity.f36898y);
                break;
        }
    }

    @Override // m6.n
    public m6.n a() {
        ((g7.m) this.f1264u).f37666d = "The number of items queued";
        return this;
    }

    public void b(ImageView.ScaleType scaleType) {
        InterfaceC4055vb interfaceC4055vb = ((NativeAdView) this.f1264u).f23596u;
        if (interfaceC4055vb == null || scaleType == null) {
            return;
        }
        try {
            interfaceC4055vb.n0(new W2.b(scaleType));
        } catch (RemoteException e9) {
            v2.i.d("Unable to call setMediaViewImageScaleType on delegate", e9);
        }
    }

    @Override // m6.n
    public m6.n c() {
        ((g7.m) this.f1264u).f37667e = "1";
        return this;
    }

    @Override // B1.l
    public int d() {
        return (j() << 8) | j();
    }

    @Override // B1.l
    public long e(long j6) {
        if (j6 < 0) {
            return 0L;
        }
        long j9 = j6;
        while (j9 > 0) {
            InputStream inputStream = (InputStream) this.f1264u;
            long skip = inputStream.skip(j9);
            if (skip > 0) {
                j9 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j9--;
            }
        }
        return j6 - j9;
    }

    @Override // j3.c
    public void f(j3.m mVar) {
        ((CountDownLatch) this.f1264u).countDown();
    }

    @Override // e.InterfaceC4456b
    public void g(Object obj) {
        C4455a c4455a = (C4455a) obj;
        N n9 = (N) this.f1264u;
        K k9 = (K) n9.f4840C.pollLast();
        if (k9 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        S0.n nVar = n9.f4852c;
        String str = k9.f4834n;
        AbstractComponentCallbacksC0475s i = nVar.i(str);
        if (i != null) {
            i.m(k9.f4835u, c4455a.f37078n, c4455a.f37079u);
        } else {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // j3.InterfaceC4604a
    public Object h(j3.m mVar) {
        C2991bm c2991bm = (C2991bm) this.f1264u;
        if (mVar.i() || mVar.f38372d) {
            return mVar;
        }
        Exception f3 = mVar.f();
        if (!(f3 instanceof N2.f)) {
            return mVar;
        }
        int i = ((N2.f) f3).f1939n.f23615n;
        return (i == 43001 || i == 43002 || i == 43003 || i == 17) ? ((Z2.e) c2991bm.f29324v).b() : i == 43000 ? S0.f.h(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i != 15 ? mVar : S0.f.h(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // m6.n
    public t i(C4468a c4468a) {
        g7.m mVar = (g7.m) this.f1264u;
        mVar.f37669g = g7.n.f37674w;
        k7.b c9 = mVar.c();
        g7.t tVar = (g7.t) mVar.f37668f;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = tVar.f37694e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Y6.a aVar = tVar.f37693d;
            if (!hasNext) {
                n7.e eVar = new n7.e(c9, arrayList);
                C4772c c4772c = new C4772c(Collections.singletonList(eVar), new F.n(17, c4468a, eVar));
                g7.t tVar2 = (g7.t) mVar.f37668f;
                synchronized (tVar2.f37690a) {
                    tVar2.f37691b.add(c4772c);
                }
                return new v((g7.t) mVar.f37668f, c4772c);
            }
            Map.Entry entry = (Map.Entry) it.next();
            C4741a c4741a = (C4741a) entry.getKey();
            for (C4802a c4802a : c4741a.f39318b.a(c9, aVar)) {
                C4805d c4805d = C4805d.f39644a;
                g7.d dVar = c4802a.f39638b;
                if (c4805d != dVar.f37660a) {
                    int i = AbstractC4770a.f39502a;
                    k7.c.a(dVar, EnumC4613b.f38477n, c9);
                    throw null;
                }
            }
        }
    }

    @Override // B1.l
    public short j() {
        int read = ((InputStream) this.f1264u).read();
        if (read != -1) {
            return (short) read;
        }
        throw new B1.k();
    }

    @Override // B1.l
    public int k(int i, byte[] bArr) {
        int i6 = 0;
        int i9 = 0;
        while (i6 < i && (i9 = ((InputStream) this.f1264u).read(bArr, i6, i - i6)) != -1) {
            i6 += i9;
        }
        if (i6 == 0 && i9 == -1) {
            throw new B1.k();
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        int i = z.f41322b;
        v2.i.a("Initialized webview successfully for SDKCore.");
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.eb)).booleanValue()) {
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            BinderC0278k binderC0278k = (BinderC0278k) this.f1264u;
            com.bumptech.glide.d.p(binderC0278k.f352E, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(binderC0278k.f369W.get())));
            binderC0278k.f368V.set(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z3, InvocationHandler invocationHandler2) {
        H0.c cVar;
        H0.c cVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) A8.b.d(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        F1.a[] aVarArr = new F1.a[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            F1.a aVar = new F1.a(1, false);
            aVar.f903u = (WebMessagePortBoundaryInterface) A8.b.d(WebMessagePortBoundaryInterface.class, invocationHandler3);
            aVarArr[i] = aVar;
        }
        if (m.f1266a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) A8.b.d(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                cVar = new H0.c(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    cVar2 = null;
                    if (cVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) A8.b.d(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((H0.d) this.f1264u).onPostMessage(webView, cVar2, uri, z3, (g) jsReplyProxyBoundaryInterface.getOrCreatePeer(new f(0, jsReplyProxyBoundaryInterface)));
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

    public String toString() {
        switch (this.f1263n) {
            case 25:
                return ((g7.m) this.f1264u).d(getClass().getSimpleName());
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C4835j.f39733C.f39743h.d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        BinderC0278k binderC0278k = (BinderC0278k) this.f1264u;
        com.bumptech.glide.d.p(binderC0278k.f352E, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(binderC0278k.f369W.get())));
        int i = z.f41322b;
        v2.i.d("Failed to initialize webview for loading SDKCore. ", th);
        C3301ha c3301ha = AbstractC3569ma.eb;
        r rVar = r.f40207e;
        if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() || binderC0278k.f368V.get()) {
            return;
        }
        if (binderC0278k.f369W.getAndIncrement() < ((Integer) rVar.f40210c.a(AbstractC3569ma.fb)).intValue()) {
            binderC0278k.X3();
        }
    }

    public /* synthetic */ j(F1.a aVar) {
        this.f1263n = 8;
        aVar.getClass();
        this.f1264u = (M3.a) aVar.f903u;
    }

    public j(BinderC0278k binderC0278k) {
        this.f1263n = 3;
        Objects.requireNonNull(binderC0278k);
        this.f1264u = binderC0278k;
    }

    public j(int i, H5.a aVar, a7.k kVar, String str) {
        C4512a c4512a;
        this.f1263n = 11;
        a7.j jVar = kVar.f4379c;
        int i6 = jVar.f4375u;
        int d2 = AbstractC5049e.d(i);
        Object obj = O6.f.f2377a;
        if (d2 == 0) {
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
            this.f1264u = obj;
            return;
        }
        if (d2 != 1) {
            throw new IllegalStateException("Unhandled case: ".concat(y.A(i)));
        }
        if (i6 != 4) {
            try {
                URI uri = new URI(str);
                C4445c c4445c = new C4445c();
                String host = uri.getHost();
                if (host != null) {
                    c4445c.f(a7.i.f4369d, host);
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
                    c4445c.f(a7.i.f4370e, Long.valueOf(port));
                }
                c4512a = c4445c.d();
            } catch (URISyntaxException unused) {
                c4512a = C4512a.f37513w;
            }
            obj = new O6.h(aVar, i6, kVar, c4512a);
        }
        this.f1264u = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i8.g] */
    public j(final int i, final int i6, final int i9, final int i10, final boolean z3, final boolean z6, final C4523c c4523c) {
        this.f1263n = 28;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final l8.d taskRunner = l8.d.f38947l;
        m8.f fVar = m8.f.f39347a;
        kotlin.jvm.internal.h.e(timeUnit, "timeUnit");
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f1264u = new s(taskRunner, timeUnit, fVar, new I7.q() { // from class: i8.g
            @Override // I7.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                m8.s pool = (m8.s) obj;
                C4594a address = (C4594a) obj2;
                m8.a user = (m8.a) obj3;
                kotlin.jvm.internal.h.e(pool, "pool");
                kotlin.jvm.internal.h.e(address, "address");
                kotlin.jvm.internal.h.e(user, "user");
                l8.d dVar = l8.d.this;
                return new m8.m(new C4522b(25, new m8.t(dVar, pool, i, i6, i9, i10, z3, z6, address, c4523c, user)), dVar);
            }
        });
    }

    public j(int i) {
        this.f1263n = i;
        switch (i) {
            case 17:
                this.f1264u = new HashMap();
                break;
        }
    }

    public j(View view) {
        this.f1263n = 9;
        if (Build.VERSION.SDK_INT >= 30) {
            B b9 = new B(4, view);
            b9.f2028v = view;
            this.f1264u = b9;
            return;
        }
        this.f1264u = new F1.a(4, view);
    }

    public j(g7.t tVar, String str, String str2, String str3, F1.a aVar) {
        this.f1263n = 25;
        g7.m mVar = new g7.m(str, g7.n.f37675x, 1, tVar);
        mVar.f37666d = str2;
        mVar.f37667e = str3;
        mVar.f37670h = aVar;
        this.f1264u = mVar;
    }

    public j(WindowInsetsController windowInsetsController) {
        this.f1263n = 9;
        B b9 = new B(4, null);
        b9.f2029w = windowInsetsController;
        this.f1264u = b9;
    }

    public j(EditText editText) {
        this.f1263n = 16;
        this.f1264u = new S0.e(editText);
    }

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1263n = 12;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f1264u = new T.f(uri, clipDescription, uri2);
        } else {
            this.f1264u = new Z2.e(15, uri, clipDescription, uri2);
        }
    }
}
