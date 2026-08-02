package i1;

import A1.C0260b;
import A1.E;
import A1.InterfaceC0259a;
import A1.y;
import G3.e;
import I0.j;
import I0.o;
import J0.g;
import K0.l;
import O.B;
import O2.i;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import androidx.fragment.app.AbstractComponentCallbacksC0479s;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import c2.d;
import com.IceFishing.LiveIceFishing.IntroActivity;
import com.IceFishing.LiveIceFishing.LanguageActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.IceFishing.LiveIceFishing.SplashActivity;
import com.IceFishing.LiveIceFishing.ViewOnClickListenerC0558b;
import com.anythink.core.common.n.b.A;
import com.anythink.core.common.s;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C2681Ll;
import com.google.android.gms.internal.ads.FE;
import com.google.android.gms.internal.ads.InterfaceC4078vb;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.Qx;
import d2.InterfaceC4460b;
import e.C4466a;
import e.InterfaceC4467b;
import g7.m;
import g7.n;
import g7.p;
import g7.t;
import h.LayoutInflaterFactory2C4537A;
import i7.AbstractC4602d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import l.C4659e;
import l.x;
import l4.q;
import m6.k;
import m8.r;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import s2.N0;
import u1.f;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4585b implements y, InterfaceC0259a, f, KD, o, InterfaceC4467b, InterfaceC4460b, Y0.o, k, x {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38151n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38152u;

    public /* synthetic */ C4585b(int i, Object obj) {
        this.f38151n = i;
        this.f38152u = obj;
    }

    public static String l(String str, EnumC4584a enumC4584a, boolean z6) {
        String str2 = enumC4584a.f38150n;
        if (z6) {
            str2 = ".temp".concat(str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b9 : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b9)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return D.x.l("lottie_cache_", replaceAll, str2);
    }

    @Override // Y0.o
    public void OnCall() {
        switch (this.f38151n) {
            case 18:
                ViewOnClickListenerC0558b viewOnClickListenerC0558b = (ViewOnClickListenerC0558b) this.f38152u;
                viewOnClickListenerC0558b.f6393u.startActivity(new Intent(viewOnClickListenerC0558b.f6393u, (Class<?>) LanguageActivity.class));
                break;
            case 19:
                IntroActivity introActivity = ((com.IceFishing.LiveIceFishing.o) this.f38152u).f6417u;
                introActivity.startActivity(introActivity.f6269x);
                break;
            case 20:
                MainActivity mainActivity = ((com.IceFishing.LiveIceFishing.y) this.f38152u).f6437u.f6440c;
                mainActivity.startActivity(mainActivity.f6326O);
                break;
            case 21:
                MainActivity mainActivity2 = ((com.IceFishing.LiveIceFishing.y) this.f38152u).f6437u.f6440c;
                mainActivity2.startActivity(mainActivity2.f6336T);
                break;
            default:
                SplashActivity splashActivity = (SplashActivity) ((C4586c) this.f38152u).f38154u;
                Intent intent = splashActivity.f6376v;
                splashActivity.getClass();
                try {
                    if (splashActivity.f() && intent != null) {
                        splashActivity.startActivity(intent);
                        splashActivity.finish();
                        break;
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                break;
        }
    }

    @Override // m6.k
    public k a() {
        ((m) this.f38152u).f37691d = "The duration of exporting a batch of telemetry records";
        return this;
    }

    @Override // l.x
    public void b(l.m mVar, boolean z6) {
        ((LayoutInflaterFactory2C4537A) this.f38152u).s(mVar);
    }

    @Override // m6.k
    public k c() {
        ((m) this.f38152u).f37692e = s.f17036a;
        return this;
    }

    @Override // I0.o
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) A8.b.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f38152u).createWebView(webView));
    }

    @Override // u1.f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f38152u)) {
            ((ByteBuffer) this.f38152u).position(0);
            messageDigest.update(((ByteBuffer) this.f38152u).putInt(num.intValue()).array());
        }
    }

    @Override // l.x
    public boolean e(l.m mVar) {
        Window.Callback callback = ((LayoutInflaterFactory2C4537A) this.f38152u).f37788E.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    @Override // e.InterfaceC4467b
    public void f(Object obj) {
        C4466a c4466a = (C4466a) obj;
        N n9 = (N) this.f38152u;
        K k9 = (K) n9.f4808C.pollLast();
        if (k9 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        q qVar = n9.f4820c;
        String str = k9.f4802n;
        AbstractComponentCallbacksC0479s c9 = qVar.c(str);
        if (c9 != null) {
            c9.m(k9.f4803u, c4466a.f37186n, c4466a.f37187u);
        } else {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    @Override // m6.k
    public k g() {
        List list = Collections.EMPTY_LIST;
        try {
            Objects.requireNonNull(list, "bucketBoundaries must not be null");
            AbstractC4602d.a(list);
            ((j) ((m) this.f38152u).f37695h).f1291u = Collections.unmodifiableList(new ArrayList(list));
            return this;
        } catch (IllegalArgumentException | NullPointerException e9) {
            p.f37704w.warning("Error setting explicit bucket boundaries advice: " + e9.getMessage());
            return this;
        }
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        switch (this.f38151n) {
            case 17:
                return new d((Context) ((C4585b) this.f38152u).f38152u, new i(21), new e(21));
            default:
                return this.f38152u;
        }
    }

    @Override // I0.o
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) A8.b.b(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f38152u).getProfileStore());
    }

    @Override // I0.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) A8.b.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f38152u).getStatics());
    }

    @Override // I0.o
    public String[] h() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f38152u).getSupportedFeatures();
    }

    @Override // m6.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p build() {
        return (p) ((m) this.f38152u).b(new A(5));
    }

    @Override // A1.y
    public A1.x j(E e9) {
        switch (this.f38151n) {
            case 1:
                return new C0260b(0, (AssetManager) this.f38152u, this);
            case 2:
                return new C0260b((Resources) this.f38152u, e9.a(Uri.class, AssetFileDescriptor.class));
            default:
                return new B1.a((n4.c) this.f38152u);
        }
    }

    public P.k k(int i) {
        return null;
    }

    public P.k m(int i) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        C2681Ll c2681Ll = (C2681Ll) this.f38152u;
        E2.s sVar = (E2.s) obj;
        synchronized (c2681Ll) {
            c2681Ll.M1(new Qx(21, sVar));
        }
    }

    public File o(String str) {
        File file = new File(p(), l(str, EnumC4584a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(p(), l(str, EnumC4584a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(p(), l(str, EnumC4584a.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public File p() {
        l lVar = (l) this.f38152u;
        lVar.getClass();
        File file = new File(lVar.f1634n.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // A1.InterfaceC0259a
    public com.bumptech.glide.load.data.d q(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.i(assetManager, str, 1);
    }

    public boolean r(int i, int i4, Bundle bundle) {
        return false;
    }

    public void s(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f38152u;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = g.f1417b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = g.f1417b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = g.f1417b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = g.f1417b;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = g.f1417b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = g.f1417b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public File t(String str, InputStream inputStream, EnumC4584a enumC4584a) {
        File file = new File(p(), l(str, enumC4584a, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public String toString() {
        switch (this.f38151n) {
            case 25:
                return ((m) this.f38152u).d(getClass().getSimpleName());
            default:
                return super.toString();
        }
    }

    public void u(m2.o oVar) {
        InterfaceC4078vb interfaceC4078vb = ((NativeAdView) this.f38152u).f24376u;
        if (interfaceC4078vb == null) {
            return;
        }
        try {
            if (oVar instanceof N0) {
                interfaceC4078vb.I2(((N0) oVar).f40367a);
            } else if (oVar == null) {
                interfaceC4078vb.I2(null);
            } else {
                x2.i.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e9) {
            x2.i.d("Unable to call setMediaContent on delegate", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C2681Ll c2681Ll = (C2681Ll) this.f38152u;
        String message = th.getMessage();
        synchronized (c2681Ll) {
            c2681Ll.M1(new FE(message, 7));
        }
    }

    public C4585b(A1.A a9) {
        this.f38151n = 23;
        this.f38152u = Collections.unmodifiableMap(new HashMap(a9.f11a));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i8.g] */
    public C4585b(final int i, final int i4, final int i6, final int i9, final boolean z6, final boolean z9, final C4586c c4586c) {
        this.f38151n = 29;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final l8.d taskRunner = l8.d.f39015l;
        m8.f fVar = m8.f.f39506a;
        h.e(timeUnit, "timeUnit");
        h.e(taskRunner, "taskRunner");
        this.f38152u = new r(taskRunner, timeUnit, fVar, new I7.q() { // from class: i8.g
            @Override // I7.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                m8.r pool = (m8.r) obj;
                C4603a address = (C4603a) obj2;
                m8.a user = (m8.a) obj3;
                kotlin.jvm.internal.h.e(pool, "pool");
                kotlin.jvm.internal.h.e(address, "address");
                kotlin.jvm.internal.h.e(user, "user");
                l8.d dVar = l8.d.this;
                return new m8.l(new C4659e(3, new m8.s(dVar, pool, i, i4, i6, i9, z6, z9, address, c4586c, user)), dVar);
            }
        });
    }

    public C4585b(View view) {
        this.f38151n = 10;
        if (Build.VERSION.SDK_INT >= 30) {
            B b9 = new B(9, view);
            b9.f2116x = view;
            this.f38152u = b9;
            return;
        }
        this.f38152u = new j(9, view);
    }

    public C4585b(WindowInsetsController windowInsetsController) {
        this.f38151n = 10;
        B b9 = new B(9, null);
        b9.f2117y = windowInsetsController;
        this.f38152u = b9;
    }

    public C4585b(t tVar, String str) {
        this.f38151n = 25;
        this.f38152u = new m(str, n.f37698v, 2, tVar);
    }

    public C4585b(int i) {
        this.f38151n = i;
        switch (i) {
            case 5:
                this.f38152u = ByteBuffer.allocate(4);
                break;
            case 7:
                break;
            case 9:
                this.f38152u = new HashMap();
                break;
            case 11:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f38152u = new P.m(this);
                    break;
                } else {
                    this.f38152u = new P.l(this);
                    break;
                }
            case 15:
                this.f38152u = new HashSet();
                break;
            case 26:
                this.f38152u = new ConcurrentHashMap(16);
                break;
            default:
                this.f38152u = new n4.c(1);
                break;
        }
    }

    public C4585b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f38151n = 13;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f38152u = new T.f(uri, clipDescription, uri2);
        } else {
            this.f38152u = new b3.e(15, uri, clipDescription, uri2);
        }
    }
}
