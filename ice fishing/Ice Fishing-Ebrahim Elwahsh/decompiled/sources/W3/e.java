package W3;

import B1.F;
import B1.G;
import M7.q;
import a1.InterfaceC0418b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.media.AudioManager;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.fragment.app.C0471d;
import androidx.fragment.app.N;
import com.bumptech.glide.manager.l;
import com.google.android.gms.internal.ads.BinderC2949aq;
import com.google.android.gms.internal.ads.C2486Bh;
import com.google.android.gms.internal.ads.C2588Hh;
import com.google.android.gms.internal.ads.C2914a9;
import com.google.firebase.components.ComponentRegistrar;
import g1.C4521a;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k1.C4628a;
import p2.j;
import p8.n;
import r0.InterfaceC4954c;
import s1.k;
import t2.C;
import u1.w;
import u1.x;
import u2.i;
import v1.InterfaceC5117a;
import w1.C5152e;

/* loaded from: classes2.dex */
public class e implements G, k, O1.a, InterfaceC0418b, l, p8.l, InterfaceC4954c, InterfaceC5117a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3459n;

    public /* synthetic */ e(int i) {
        this.f3459n = i;
    }

    public static final String t(u8.h hVar, u8.h[] hVarArr, int i) {
        int i4;
        boolean z8;
        int i9;
        int i10;
        int i11 = -1;
        u8.h hVar2 = r8.a.f40363b;
        int a9 = hVar.a();
        int i12 = 0;
        while (i12 < a9) {
            int i13 = (i12 + a9) / 2;
            while (i13 > i11 && hVar.e(i13) != 10) {
                i13 += i11;
            }
            int i14 = i13 + 1;
            int i15 = 1;
            while (true) {
                i4 = i14 + i15;
                if (hVar.e(i4) == 10) {
                    break;
                }
                i15++;
            }
            int i16 = i4 - i14;
            int i17 = i;
            boolean z9 = false;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (z9) {
                    i9 = 46;
                    z8 = false;
                } else {
                    byte e6 = hVarArr[i17].e(i18);
                    byte[] bArr = f8.c.f37814a;
                    int i20 = e6 & 255;
                    z8 = z9;
                    i9 = i20;
                }
                byte e9 = hVar.e(i14 + i19);
                byte[] bArr2 = f8.c.f37814a;
                i10 = i9 - (e9 & 255);
                if (i10 != 0) {
                    break;
                }
                i19++;
                i18++;
                if (i19 == i16) {
                    break;
                }
                if (hVarArr[i17].a() != i18) {
                    z9 = z8;
                } else {
                    if (i17 == hVarArr.length - 1) {
                        break;
                    }
                    i17++;
                    z9 = true;
                    i18 = -1;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i21 = i16 - i19;
                    int a10 = hVarArr[i17].a() - i18;
                    int length = hVarArr.length;
                    for (int i22 = i17 + 1; i22 < length; i22++) {
                        a10 += hVarArr[i22].a();
                    }
                    if (a10 >= i21) {
                        if (a10 <= i21) {
                            return hVar.i(i14, i16 + i14).h(M7.a.f1916a);
                        }
                    }
                }
                i12 = i4 + 1;
                i11 = -1;
            }
            a9 = i13;
            i11 = -1;
        }
        return null;
    }

    public static C4521a u(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C4521a(0, httpURLConnection);
    }

    public static Path v(float f6, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f6, f9);
        path.lineTo(f10, f11);
        return path;
    }

    public static CookieManager x() {
        j jVar = j.f39798C;
        t2.G g9 = jVar.f39803c;
        int myUid = Process.myUid();
        if (myUid == 0 || myUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i = C.f40822b;
            i.d("Failed to obtain CookieManager.", th);
            jVar.f39808h.e("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    public boolean B(Context context) {
        return false;
    }

    public Intent C(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int E(AudioManager audioManager) {
        return 0;
    }

    public int F(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    @Override // p8.l
    public boolean a(SSLSocket sSLSocket) {
        return q.I(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // s1.InterfaceC4989b
    public boolean b(Object obj, File file, s1.h hVar) {
        try {
            N1.b.d(((F1.f) ((F1.b) ((x) obj).get()).f961n.f744b).f976a.f40262d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e6) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e6);
            return false;
        }
    }

    @Override // v1.InterfaceC5117a
    public Bitmap c(int i, int i4, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i4, config);
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // r0.InterfaceC4954c
    public void e(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // O1.a
    public Object f() {
        switch (this.f3459n) {
            case 6:
                return new ArrayList();
            case 27:
                return new w();
            default:
                try {
                    return new C5152e(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e6) {
                    throw new RuntimeException(e6);
                }
        }
    }

    @Override // a1.InterfaceC0418b
    public boolean g(float f6) {
        throw new IllegalStateException("not implemented");
    }

    @Override // a1.InterfaceC0418b
    public C4628a h() {
        throw new IllegalStateException("not implemented");
    }

    @Override // a1.InterfaceC0418b
    public boolean i(float f6) {
        return false;
    }

    @Override // a1.InterfaceC0418b
    public boolean isEmpty() {
        return true;
    }

    @Override // B1.G
    public void j(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new F((ByteBuffer) obj));
    }

    @Override // p8.l
    public n k(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new p8.e(cls2);
    }

    @Override // v1.InterfaceC5117a
    public Bitmap l(int i, int i4, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // a1.InterfaceC0418b
    public float m() {
        return 1.0f;
    }

    @Override // a1.InterfaceC0418b
    public float n() {
        return 0.0f;
    }

    @Override // r0.InterfaceC4954c
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // s1.k
    public int q(s1.h hVar) {
        return 1;
    }

    @Override // B1.G
    public void r(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new F((ByteBuffer) obj));
    }

    public List w(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (N3.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f2154a;
            if (str != null) {
                C0471d c0471d = new C0471d(7, str, bVar);
                bVar = new N3.b(str, bVar.f2155b, bVar.f2156c, bVar.f2157d, bVar.f2158e, c0471d, bVar.f2160g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public C2588Hh y(C2486Bh c2486Bh, C2914a9 c2914a9, boolean z8, BinderC2949aq binderC2949aq) {
        return new C2588Hh(c2486Bh, c2914a9, z8, binderC2949aq);
    }

    public int z(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public e(S0.c cVar, N n9) {
        this.f3459n = 16;
    }

    @Override // v1.InterfaceC5117a
    public void s() {
    }

    public void A(Context context) {
    }

    public void D(Activity activity) {
    }

    @Override // v1.InterfaceC5117a
    public void p(int i) {
    }
}
