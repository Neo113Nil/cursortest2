package O2;

import D1.F;
import D1.G;
import Q2.A;
import S0.s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Path;
import android.media.AudioManager;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.fragment.app.C0465d;
import androidx.fragment.app.N;
import com.google.android.gms.internal.ads.BinderC2903Yp;
import com.google.android.gms.internal.ads.C2575Fh;
import com.google.android.gms.internal.ads.C2677Lh;
import com.google.android.gms.internal.ads.C3091d9;
import com.google.firebase.components.ComponentRegistrar;
import d2.InterfaceC4460b;
import h2.C4572a;
import h2.C4573b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import k2.InterfaceC4642a;
import r0.InterfaceC4894c;
import r2.C4906k;
import w2.D;
import w2.z;

/* loaded from: classes.dex */
public class i implements A2.c, G, N3.p, Q1.a, InterfaceC4460b, com.bumptech.glide.manager.l, InterfaceC4642a, InterfaceC4894c {

    /* renamed from: u, reason: collision with root package name */
    public static i f2274u;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2275n;

    public /* synthetic */ i(int i) {
        this.f2275n = i;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C6.a d(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C6.a(1, httpURLConnection);
    }

    public static S0.l h(Context context, String[] strArr, String str, b3.e eVar) {
        String[] p9 = p(context);
        int length = p9.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = p9[i];
            int i4 = 0;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i6;
                }
            }
            if (zipFile != null) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (i9 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c9 = File.separatorChar;
                            sb.append(c9);
                            sb.append(str3);
                            sb.append(c9);
                            sb.append(str);
                            String sb2 = sb.toString();
                            eVar.getClass();
                            b3.e.A("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                S0.l lVar = new S0.l(5, false);
                                lVar.f2926u = zipFile;
                                lVar.f2927v = entry;
                                return lVar;
                            }
                        }
                        i9 = i10;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    public static Path i(float f2, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f2, f9);
        path.lineTo(f10, f11);
        return path;
    }

    public static String[] l(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c9 = File.separatorChar;
        sb.append(c9);
        sb.append("([^\\");
        sb.append(c9);
        sb.append("]*)");
        sb.append(c9);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : p(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] p(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static CookieManager q() {
        C4906k c4906k = C4906k.f40186C;
        D d9 = c4906k.f40191c;
        int myUid = Process.myUid();
        if (myUid == 0 || myUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i = z.f41712b;
            x2.i.d("Failed to obtain CookieManager.", th);
            c4906k.f40196h.e("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean r(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        e3.f fVar;
        SigningInfo signingInfo;
        e3.f fVar2;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        int i;
        if (packageInfo != null) {
            boolean z6 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & com.anythink.expressad.video.module.a.a.f22517T) == 0)) ? false : true;
            try {
                fVar = z6 ? o.f2288c : o.f2287b;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        e3.b bVar = e3.e.f37276u;
                        Object[] objArr = {bArr};
                        Q3.b.w(objArr, 1);
                        fVar2 = new e3.f(objArr, 1);
                    } else {
                        e3.b bVar2 = e3.e.f37276u;
                        fVar2 = e3.f.f37277x;
                    }
                } else {
                    if (i4 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                e3.b bVar3 = e3.e.f37276u;
                                Object[] objArr2 = new Object[4];
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                int length = signingCertificateHistory2.length;
                                int i6 = 0;
                                int i9 = 0;
                                while (i6 < length) {
                                    byte[] byteArray = signingCertificateHistory2[i6].toByteArray();
                                    byteArray.getClass();
                                    int length2 = objArr2.length;
                                    int i10 = i9 + 1;
                                    if (i10 < 0) {
                                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
                                    if (i10 <= length2) {
                                        i = length2;
                                    } else {
                                        i = (length2 >> 1) + length2 + 1;
                                        if (i < i10) {
                                            int highestOneBit = Integer.highestOneBit(i9);
                                            i = highestOneBit + highestOneBit;
                                        }
                                        if (i < 0) {
                                            i = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (i > length2) {
                                        objArr2 = Arrays.copyOf(objArr2, i);
                                    }
                                    objArr2[i9] = byteArray;
                                    i6++;
                                    i9 = i10;
                                }
                                fVar2 = i9 == 0 ? e3.f.f37277x : new e3.f(objArr2, i9);
                            }
                        }
                    }
                    e3.b bVar4 = e3.e.f37276u;
                    fVar2 = e3.f.f37277x;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z6 ? t(packageInfo, o.f2286a) : t(packageInfo, o.f2286a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            e3.e f2 = fVar2.f();
            int size = f2.size();
            int i11 = 0;
            while (i11 < size) {
                byte[] bArr2 = (byte[]) f2.get(i11);
                e3.b listIterator = fVar.listIterator(0);
                do {
                    int i12 = i11 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static m t(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    public int A(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    @Override // r0.InterfaceC4894c
    public void a(int i, Serializable serializable) {
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

    @Override // N3.p
    public Object c(IBinder iBinder) {
        int i = M3.c.f1870u;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHpoaService");
        return queryLocalInterface instanceof M3.d ? (M3.d) queryLocalInterface : new M3.b(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService", 3);
    }

    @Override // Q1.a
    public Object e() {
        return new ArrayList();
    }

    @Override // k2.InterfaceC4642a
    public long f() {
        return System.currentTimeMillis();
    }

    @Override // r0.InterfaceC4894c
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        switch (this.f2275n) {
            case 14:
                return new A(2, Executors.newSingleThreadExecutor());
            default:
                i iVar = new i(21);
                HashMap hashMap = new HashMap();
                Y1.d dVar = Y1.d.f3904n;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar, new C4573b(30000L, 86400000L, set));
                Y1.d dVar2 = Y1.d.f3906v;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar2, new C4573b(1000L, 86400000L, set));
                Y1.d dVar3 = Y1.d.f3905u;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(h2.d.f38090u)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar3, new C4573b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < Y1.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C4572a(iVar, hashMap);
        }
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // D1.G
    public void k(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new F((ByteBuffer) obj));
    }

    @Override // D1.G
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new F((ByteBuffer) obj));
    }

    public boolean n(CharSequence charSequence) {
        return charSequence instanceof M.f;
    }

    public List o(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (T3.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f3169a;
            if (str != null) {
                C0465d c0465d = new C0465d(7, str, bVar);
                bVar = new T3.b(str, bVar.f3170b, bVar.f3171c, bVar.f3172d, bVar.f3173e, c0465d, bVar.f3175g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public C2677Lh s(C2575Fh c2575Fh, C3091d9 c3091d9, boolean z6, BinderC2903Yp binderC2903Yp) {
        return new C2677Lh(c2575Fh, c3091d9, z6, binderC2903Yp);
    }

    public int u(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean w(Context context) {
        return false;
    }

    public Intent x(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int z(AudioManager audioManager) {
        return 0;
    }

    public i(s sVar, N n9) {
        this.f2275n = 18;
    }

    public void v(Context context) {
    }

    public void y(Activity activity) {
    }
}
