package x4;

import ac.o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.Log;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bc.a0;
import f1.d0;
import f1.g0;
import f1.i0;
import f1.v;
import j0.r0;
import j0.s0;
import j0.t0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m0.d1;
import m0.l1;
import m0.m2;
import m0.r;
import m0.r1;
import m0.u1;
import m0.x1;
import m0.x2;
import m0.y1;
import m0.z;
import m0.z0;
import org.fortheloss.st.R;
import rd.e0;
import rd.t;
import rd.y;
import s.o0;
import u.l0;
import u.u;
import v.e1;
import v.g1;
import v.i1;
import v.y0;
import v1.h0;
import z.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static l1.f f8296a;

    /* renamed from: b, reason: collision with root package name */
    public static long f8297b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f8298c;

    public static void A(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(a4.d.f(i10, i11, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static final y0.n B(y0.n nVar, g0 g0Var) {
        return androidx.compose.ui.graphics.a.c(nVar, 0.0f, 0.0f, g0Var, 518143);
    }

    public static final y0.n C(y0.n nVar) {
        return androidx.compose.ui.graphics.a.c(nVar, 0.0f, 0.0f, null, 520191);
    }

    public static void D(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean E(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
            try {
                boolean F = F(file, inputStream);
                D(inputStream);
                return F;
            } catch (Throwable th) {
                th = th;
                D(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean F(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    D(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            D(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            D(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q3.r G(Context context) {
        ProviderInfo providerInfo;
        e3.e eVar;
        ApplicationInfo applicationInfo;
        u7.d cVar = Build.VERSION.SDK_INT >= 28 ? new q3.c() : new u7.d();
        PackageManager packageManager = context.getPackageManager();
        a.a.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j3 = cVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j3) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new e3.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
            }
            if (eVar != null) {
                return null;
            }
            return new q3.r(new q3.q(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static final k2.f H(Context context) {
        u7.d dVar = new u7.d();
        context.getApplicationContext();
        return new k2.f(dVar, new k2.a(Build.VERSION.SDK_INT >= 31 ? k2.m.f3616a.a(context) : 0));
    }

    public static String I(byte[] bArr, String str) {
        pc.j.e(bArr, "key");
        byte[] decode = Base64.decode(str, 10);
        pc.j.b(decode);
        a.a.q(16, decode.length);
        byte[] copyOfRange = Arrays.copyOfRange(decode, 0, 16);
        pc.j.d(copyOfRange, "copyOfRange(...)");
        int length = decode.length;
        a.a.q(length, decode.length);
        byte[] copyOfRange2 = Arrays.copyOfRange(decode, 16, length);
        pc.j.d(copyOfRange2, "copyOfRange(...)");
        Cipher cipher = Cipher.getInstance(L());
        cipher.init(2, new SecretKeySpec(bArr, J()), new IvParameterSpec(copyOfRange));
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        pc.j.d(doFinal, "doFinal(...)");
        return new String(doFinal, xc.a.f8399a);
    }

    public static String J() {
        char[] cArr = {'Q', 'A', '7', 'E', '%', 'S', 'L'};
        StringBuilder sb = new StringBuilder();
        sb.append(cArr[1]);
        sb.append(cArr[3]);
        sb.append(cArr[5]);
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static File K(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static String L() {
        char[] cArr = {'x', 'A', '1', 'E', '!', 'S', '/', 'C', '@', 'B', 'C', '/', 'P', '#', 'K', 'C', 'S', '5', 'P', 'a', 'd', 'd', 'i', 'n', 'g', 'z'};
        StringBuilder sb = new StringBuilder();
        sb.append(cArr[1]);
        sb.append(cArr[3]);
        sb.append(cArr[5]);
        sb.append(cArr[6]);
        sb.append(cArr[7]);
        sb.append(cArr[9]);
        sb.append(cArr[10]);
        sb.append(cArr[11]);
        sb.append(cArr[12]);
        sb.append(cArr[14]);
        sb.append(cArr[15]);
        sb.append(cArr[16]);
        sb.append(cArr[17]);
        sb.append(cArr[18]);
        sb.append(cArr[19]);
        sb.append(cArr[20]);
        sb.append(cArr[21]);
        sb.append(cArr[22]);
        sb.append(cArr[23]);
        sb.append(cArr[24]);
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static i4.c M(f8.c cVar, SQLiteDatabase sQLiteDatabase) {
        pc.j.e(cVar, "refHolder");
        i4.c cVar2 = (i4.c) cVar.f2340h;
        if (cVar2 != null && cVar2.f3173g.equals(sQLiteDatabase)) {
            return cVar2;
        }
        i4.c cVar3 = new i4.c(sQLiteDatabase);
        cVar.f2340h = cVar3;
        return cVar3;
    }

    public static boolean N() {
        if (Build.VERSION.SDK_INT >= 29) {
            return l4.a.a();
        }
        try {
            if (f8298c == null) {
                f8297b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f8298c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f8298c.invoke(null, Long.valueOf(f8297b))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void O(String str, Bundle bundle) {
        try {
            i7.g.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = d8.o.f(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            i7.g b2 = i7.g.b();
            b2.a();
            if (b2.f3234d.a(j7.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static MappedByteBuffer P(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final long Q(long j3, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + ((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + ((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final void R(m2 m2Var, m0.c cVar, int i10) {
        while (true) {
            int i11 = m2Var.f4679v;
            if (i10 > i11 && i10 < m2Var.f4678u) {
                return;
            }
            if (i11 == 0 && i10 == 0) {
                return;
            }
            m2Var.L();
            if (m2Var.x(m2Var.f4679v)) {
                cVar.o();
            }
            m2Var.j();
        }
    }

    public static final float S(long j3, float f10, s2.c cVar) {
        float c3;
        long b2 = s2.n.b(j3);
        if (s2.o.a(b2, 4294967296L)) {
            if (cVar.m() <= 1.05d) {
                return cVar.N(j3);
            }
            c3 = s2.n.c(j3) / s2.n.c(cVar.U(f10));
        } else {
            if (!s2.o.a(b2, 8589934592L)) {
                return Float.NaN;
            }
            c3 = s2.n.c(j3);
        }
        return c3 * f10;
    }

    public static final long T(long j3) {
        return (Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j3 >> 32))) << 32);
    }

    public static final void U(Spannable spannable, long j3, int i10, int i11) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(d0.s(j3)), i10, i11, 33);
        }
    }

    public static final void V(Spannable spannable, long j3, s2.c cVar, int i10, int i11) {
        long b2 = s2.n.b(j3);
        if (s2.o.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(a0.I(cVar.N(j3)), false), i10, i11, 33);
        } else if (s2.o.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(s2.n.c(j3)), i10, i11, 33);
        }
    }

    public static final void W(Spannable spannable, n2.b bVar, int i10, int i11) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(bc.o.O(bVar));
            Iterator it = bVar.f5042g.iterator();
            while (it.hasNext()) {
                arrayList.add(((n2.a) it.next()).f5040a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i10, i11, 33);
        }
    }

    public static boolean X(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final f8.c Y(c5.c cVar) {
        return new f8.c(new bd.o(cVar, null));
    }

    public static final double Z(long j3) {
        return ((j3 >>> 11) * 2048) + (j3 & 2047);
    }

    public static final void a(final qd.a aVar, final long j3, m0.r rVar, final int i10) {
        m0.r rVar2;
        rVar.Z(-1101331581);
        if ((((rVar.f(aVar) ? 4 : 2) | i10 | (rVar.e(j3) ? 32 : 16)) & 19) == 18 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            long j6 = (aVar.f5821h + aVar.f5822i) - j3;
            if (j6 <= 0) {
                j6 = 0;
            }
            int i11 = (int) (j6 / 1000);
            float f10 = 12;
            d0.d a6 = d0.e.a(f10);
            long j10 = ee.a.f2155b;
            rVar2 = rVar;
            j0.g0.b(new BorderModifierNodeElement(2, new i0(j10), d0.e.a(f10)), a6, j0.g0.d(f1.q.b(j10, 0.3f), rVar, 0), null, u0.e.e(147529169, new rd.s(i11, 0, aVar), rVar), rVar2, 196608, 24);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(j3, i10) { // from class: rd.j

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f6152h;

                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int y10 = m0.z.y(1);
                    x4.f.a(qd.a.this, this.f6152h, (m0.r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static void a0(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int g02 = g0(parcel, i10);
        parcel.writeBundle(bundle);
        h0(parcel, g02);
    }

    public static final void b(Object obj, oc.c cVar, String str, oc.c cVar2, u0.d dVar, m0.r rVar, int i10) {
        int i11;
        int i12;
        String str2;
        Object obj2 = y0.c.f8419g;
        rVar.Z(2132720749);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? rVar.f(obj) : rVar.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i10 & 48;
        int i14 = i11;
        y0.k kVar = y0.k.f8442a;
        if (i13 == 0) {
            i12 = (rVar.f(kVar) ? 32 : 16) | i14;
        } else {
            i12 = i14;
        }
        if ((i10 & 384) == 0) {
            i12 |= rVar.h(cVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= rVar.f(obj2) ? 2048 : 1024;
        }
        int i15 = i12 | 24576;
        if ((196608 & i10) == 0) {
            i15 |= rVar.h(cVar2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i15 |= rVar.h(dVar) ? 1048576 : 524288;
        }
        if ((599187 & i15) == 599186 && rVar.B()) {
            rVar.S();
            str2 = str;
        } else {
            int i16 = (i15 & 14) | ((i15 >> 9) & 112);
            int i17 = g1.f6851a;
            Object M = rVar.M();
            Object obj3 = m0.l.f4646a;
            if (M == obj3) {
                M = new e1(new l(obj), null, "AnimatedContent");
                rVar.i0(M);
            }
            e1 e1Var = (e1) M;
            e1Var.a(obj, rVar, (i16 & 14) | (i16 & 8) | 48);
            Object M2 = rVar.M();
            if (M2 == obj3) {
                M2 = new a0.a0(25, e1Var);
                rVar.i0(M2);
            }
            z.d(e1Var, (oc.c) M2, rVar);
            int i18 = i15 & 8176;
            int i19 = i15 >> 3;
            c(e1Var, kVar, cVar, cVar2, dVar, rVar, (i19 & 458752) | i18 | (57344 & i19));
            str2 = "AnimatedContent";
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new p5.d(obj, cVar, str2, cVar2, dVar, i10);
        }
    }

    public static void b0(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int g02 = g0(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        h0(parcel, g02);
    }

    public static final void c(e1 e1Var, y0.n nVar, oc.c cVar, oc.c cVar2, u0.d dVar, m0.r rVar, int i10) {
        w0.q qVar;
        u.m mVar;
        oc.c cVar3;
        m0.r rVar2;
        w0.q qVar2;
        e1 e1Var2 = e1Var;
        y0.f fVar = y0.c.f8419g;
        rVar.Z(-114689412);
        int i11 = (i10 & 6) == 0 ? (rVar.f(e1Var2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= rVar.f(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar.h(cVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= rVar.f(fVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= rVar.h(cVar2) ? 16384 : 8192;
        }
        u0.d dVar2 = dVar;
        if ((196608 & i10) == 0) {
            i11 |= rVar.h(dVar2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && rVar.B()) {
            rVar.S();
            cVar3 = cVar;
            rVar2 = rVar;
        } else {
            int i12 = i11 & 14;
            boolean z10 = i12 == 4;
            Object M = rVar.M();
            Object obj = m0.l.f4646a;
            if (z10 || M == obj) {
                M = new u.m(e1Var2);
                rVar.i0(M);
            }
            u.m mVar2 = (u.m) M;
            boolean z11 = i12 == 4;
            Object M2 = rVar.M();
            Object obj2 = M2;
            if (z11 || M2 == obj) {
                Object[] objArr = {e1Var2.c()};
                w0.q qVar3 = new w0.q();
                qVar3.addAll(bc.l.c0(objArr));
                rVar.i0(qVar3);
                obj2 = qVar3;
            }
            w0.q qVar4 = (w0.q) obj2;
            boolean z12 = i12 == 4;
            Object M3 = rVar.M();
            if (z12 || M3 == obj) {
                long[] jArr = o0.f6312a;
                M3 = new s.g0();
                rVar.i0(M3);
            }
            s.g0 g0Var = (s.g0) M3;
            Object c3 = e1Var2.c();
            l1 l1Var = e1Var2.f6826d;
            if (!qVar4.contains(c3)) {
                qVar4.clear();
                qVar4.add(e1Var2.c());
            }
            if (pc.j.a(e1Var2.c(), l1Var.getValue())) {
                if (qVar4.size() != 1 || !pc.j.a(qVar4.get(0), e1Var2.c())) {
                    qVar4.clear();
                    qVar4.add(e1Var2.c());
                }
                if (g0Var.f6270e != 1 || g0Var.c(e1Var2.c())) {
                    g0Var.a();
                }
                mVar2.getClass();
            }
            if (!pc.j.a(e1Var2.c(), l1Var.getValue()) && !qVar4.contains(l1Var.getValue())) {
                ListIterator listIterator = qVar4.listIterator();
                int i13 = 0;
                while (true) {
                    cc.a aVar = (cc.a) listIterator;
                    if (!aVar.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (pc.j.a(cVar2.invoke(aVar.next()), cVar2.invoke(l1Var.getValue()))) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 == -1) {
                    qVar4.add(l1Var.getValue());
                } else {
                    qVar4.set(i13, l1Var.getValue());
                }
            }
            if (g0Var.c(l1Var.getValue()) && g0Var.c(e1Var2.c())) {
                rVar.X(915535767);
                rVar.q(false);
                qVar = qVar4;
                mVar = mVar2;
                cVar3 = cVar;
            } else {
                rVar.X(912931457);
                g0Var.a();
                int size = qVar4.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = qVar4.get(i14);
                    u.m mVar3 = mVar2;
                    u0.d dVar3 = dVar2;
                    w0.q qVar5 = qVar4;
                    g0Var.m(obj3, u0.e.e(885640742, new u.f(e1Var2, obj3, cVar, mVar3, qVar5, dVar3), rVar));
                    i14++;
                    e1Var2 = e1Var;
                    mVar2 = mVar3;
                    qVar4 = qVar5;
                    dVar2 = dVar;
                }
                qVar = qVar4;
                mVar = mVar2;
                cVar3 = cVar;
                rVar.q(false);
            }
            boolean f10 = rVar.f(e1Var.f()) | rVar.f(mVar);
            Object M4 = rVar.M();
            if (f10 || M4 == obj) {
                M4 = (u) cVar3.invoke(mVar);
                rVar.i0(M4);
            }
            u uVar = (u) M4;
            e1 e1Var3 = mVar.f6617a;
            boolean f11 = rVar.f(mVar);
            Object M5 = rVar.M();
            if (f11 || M5 == obj) {
                M5 = z.s(Boolean.FALSE);
                rVar.i0(M5);
            }
            d1 d1Var = (d1) M5;
            d1 u10 = z.u(uVar.f6644d, rVar);
            if (pc.j.a(e1Var3.c(), e1Var3.f6826d.getValue())) {
                d1Var.setValue(Boolean.FALSE);
            } else if (u10.getValue() != null) {
                d1Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) d1Var.getValue()).booleanValue();
            y0.n nVar2 = y0.k.f8442a;
            if (booleanValue) {
                rVar.X(249037309);
                qVar2 = qVar;
                rVar2 = rVar;
                y0 a6 = g1.a(mVar.f6617a, i1.f6870h, null, rVar2, 0, 2);
                boolean f12 = rVar2.f(a6);
                Object M6 = rVar2.M();
                if (f12 || M6 == obj) {
                    M6 = C(nVar2).d(new u.l(mVar, a6, u10));
                    rVar2.i0(M6);
                }
                nVar2 = (y0.n) M6;
                rVar2.q(false);
            } else {
                rVar2 = rVar;
                qVar2 = qVar;
                rVar2.X(249353726);
                rVar2.q(false);
            }
            y0.n d10 = nVar.d(nVar2);
            Object M7 = rVar2.M();
            if (M7 == obj) {
                M7 = new u.h(mVar);
                rVar2.i0(M7);
            }
            u.h hVar = (u.h) M7;
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            y0.n o7 = uc.e.o(rVar2, d10);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            z.w(hVar, rVar2, x1.i.f8079e);
            z.w(l10, rVar2, x1.i.f8078d);
            x1.h hVar2 = x1.i.f8080f;
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar2);
            }
            z.w(o7, rVar2, x1.i.f8077c);
            rVar2.X(-1491001814);
            int size2 = qVar2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                Object obj4 = qVar2.get(i15);
                rVar2.T(1908315325, 0, cVar2.invoke(obj4), null);
                oc.e eVar = (oc.e) g0Var.g(obj4);
                if (eVar == null) {
                    rVar2.X(-971711888);
                } else {
                    rVar2.X(1908317105);
                    eVar.invoke(rVar2, 0);
                }
                rVar2.q(false);
                rVar2.q(false);
            }
            rVar2.q(false);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new p5.d(e1Var, nVar, cVar3, cVar2, dVar, i10);
        }
    }

    public static void c0(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int g02 = g0(parcel, i10);
        parcel.writeString(str);
        h0(parcel, g02);
    }

    public static final void d(final qd.b bVar, final oc.a aVar, final boolean z10, final e0 e0Var, m0.r rVar, final int i10) {
        rVar.Z(1778522707);
        int i11 = i10 | (rVar.f(bVar) ? 4 : 2) | (rVar.h(aVar) ? 32 : 16) | (rVar.g(z10) ? 256 : 128) | (rVar.f(e0Var) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            rVar.X(-1043779154);
            Object M = rVar.M();
            Object obj = m0.l.f4646a;
            if (M == obj) {
                M = v.d.a(0.0f);
                rVar.i0(M);
            }
            v.c cVar = (v.c) M;
            rVar.q(false);
            String str = bVar.f5823a;
            rVar.X(-1043776995);
            boolean h10 = rVar.h(cVar);
            Object M2 = rVar.M();
            fc.d dVar = null;
            if (h10 || M2 == obj) {
                M2 = new t(cVar, dVar, 0);
                rVar.i0(M2);
            }
            rVar.q(false);
            z.f(str, rVar, (oc.e) M2);
            Boolean valueOf = Boolean.valueOf(z10);
            rVar.X(-1043767833);
            boolean h11 = ((i11 & 896) == 256) | ((i11 & 7168) == 2048) | rVar.h(cVar);
            Object M3 = rVar.M();
            if (h11 || M3 == obj) {
                M3 = new rd.u(z10, e0Var, cVar, null);
                rVar.i0(M3);
            }
            rVar.q(false);
            z.e(valueOf, e0Var, (oc.e) M3, rVar);
            long j3 = (z10 && e0Var == e0.f6135g) ? ee.a.f2157d : (z10 && e0Var == e0.f6136h) ? ee.a.f2164k : f1.q.f2282g;
            k1.b B = i7.b.B(bVar.f5826d, rVar);
            String str2 = "Card " + bVar.f5825c;
            rVar.X(-1043744582);
            boolean z11 = (i11 & 14) == 4;
            Object M4 = rVar.M();
            if (z11 || M4 == obj) {
                M4 = new k2.e(9, bVar);
                rVar.i0(M4);
            }
            rVar.q(false);
            y0.n I = a.a.I(androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.d((oc.c) M4), 140), ((Number) cVar.d()).floatValue());
            float f10 = 8;
            float f11 = 12;
            d0.d a6 = d0.e.a(f11);
            float f12 = 0;
            boolean z12 = Float.compare(f10, f12) > 0;
            long j6 = v.f2289a;
            if (Float.compare(f10, f12) > 0 || z12) {
                I = I.d(new ShadowGraphicsLayerElement(f10, a6, z12, j6, j6));
            }
            y0.n d10 = B(I, d0.e.a(f11)).d(new BorderModifierNodeElement(3, new i0(j3), d0.e.a(f11)));
            rVar.X(-1043726658);
            boolean z13 = (i11 & 112) == 32;
            Object M5 = rVar.M();
            if (z13 || M5 == obj) {
                M5 = new rd.h(aVar, 0);
                rVar.i0(M5);
            }
            rVar.q(false);
            l0.a(B, str2, androidx.compose.foundation.a.d(d10, false, (oc.a) M5, 7), null, v1.j.f7083b, 0.0f, rVar, 24576, 104);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(aVar, z10, e0Var, i10) { // from class: rd.i

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ oc.a f6148h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f6149i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e0 f6150j;

                @Override // oc.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int y10 = m0.z.y(1);
                    x4.f.d(qd.b.this, this.f6148h, this.f6149i, this.f6150j, (m0.r) obj2, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static void d0(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int g02 = g0(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        h0(parcel, g02);
    }

    public static final void e(int i10, m0.r rVar, int i11) {
        m0.r rVar2;
        rVar.Z(-21158010);
        if ((((rVar.d(i10) ? 4 : 2) | i11) & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            j0.g0.b(null, d0.e.a(12), j0.g0.d(f1.q.b(ee.a.f2162i, 0.9f), rVar, 0), j0.g0.e(62, 4), u0.e.e(-299122312, new rd.v(i10, 0), rVar), rVar2, 196608, 17);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new rd.k(i10, i11, 1);
        }
    }

    public static void e0(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int g02 = g0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        h0(parcel, g02);
    }

    public static final void f(y yVar, oc.a aVar, oc.c cVar, m0.r rVar, int i10) {
        oc.a aVar2;
        x1.z zVar;
        rVar.Z(-95427057);
        int i11 = (rVar.h(yVar) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            i11 |= rVar.h(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar.h(cVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            y0.n f10 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.f542b, 16);
            z.r a6 = z.q.a(z.i.f8960b, y0.c.f8430r, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, f10);
            x1.j.f8084f.getClass();
            x1.z zVar2 = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar2);
            } else {
                rVar.l0();
            }
            x1.h hVar = x1.i.f8079e;
            z.w(a6, rVar, hVar);
            x1.h hVar2 = x1.i.f8078d;
            z.w(l10, rVar, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            z.w(o7, rVar, hVar4);
            y0.n b2 = androidx.compose.foundation.layout.b.b(1.0f);
            z.i0 a8 = z.g0.a(z.i.f8962d, y0.c.f8429q, rVar, 54);
            int hashCode2 = Long.hashCode(rVar.T);
            r1 l11 = rVar.l();
            y0.n o10 = uc.e.o(rVar, b2);
            rVar.b0();
            if (rVar.S) {
                zVar = zVar2;
                rVar.k(zVar);
            } else {
                zVar = zVar2;
                rVar.l0();
            }
            z.w(a8, rVar, hVar);
            z.w(l11, rVar, hVar2);
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar, hashCode2, hVar3);
            }
            z.w(o10, rVar, hVar4);
            qd.h hVar5 = yVar.f6206b;
            t(hVar5.f5851g, rVar, 0);
            y0.k kVar = y0.k.f8442a;
            int i12 = i11 >> 3;
            j0.g0.c(aVar2, androidx.compose.foundation.a.a(androidx.compose.foundation.layout.b.h(kVar, 48), f1.q.b(ee.a.f2162i, 0.8f), d0.e.f1563a), false, null, u0.e.e(550183864, new hd.m(2, yVar), rVar), rVar, (i12 & 14) | 196608);
            rVar.q(true);
            float f11 = 8;
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f11));
            l(hVar5.f5852h, rVar, 0);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f11));
            e(hVar5.f5853i, rVar, 0);
            rVar.X(1101903995);
            if (hVar5.f5858n) {
                u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f11));
                u(0, rVar);
            }
            rVar.q(false);
            qd.a aVar3 = hVar5.f5857m;
            rVar.X(1101910033);
            if (aVar3 != null) {
                u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f11));
                a(aVar3, System.currentTimeMillis(), rVar, 0);
            }
            rVar.q(false);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            u2.b.g(rVar, new LayoutWeightElement(1.0f));
            y0.n f12 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.b.b(1.0f), f1.q.b(f1.q.f2277b, 0.4f), d0.e.a(20)), 12);
            v1.e0 e10 = z.m.e(y0.c.f8419g, false);
            int hashCode3 = Long.hashCode(rVar.T);
            r1 l12 = rVar.l();
            y0.n o11 = uc.e.o(rVar, f12);
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            z.w(e10, rVar, hVar);
            z.w(l12, rVar, hVar2);
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode3))) {
                a4.d.p(hashCode3, rVar, hashCode3, hVar3);
            }
            z.w(o11, rVar, hVar4);
            q(yVar.f6208d, cVar, rVar, i12 & 112);
            rVar.q(true);
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new rd.r(yVar, aVar, cVar, i10, 0);
        }
    }

    public static void f0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void g(final y yVar, final oc.a aVar, final oc.c cVar, final oc.a aVar2, final oc.c cVar2, final oc.f fVar, m0.r rVar, final int i10) {
        rVar.Z(3108052);
        int i11 = i10 | (rVar.h(yVar) ? 4 : 2) | (rVar.h(aVar) ? 32 : 16) | (rVar.h(cVar) ? 256 : 128) | (rVar.h(aVar2) ? 2048 : 1024) | (rVar.h(cVar2) ? 16384 : 8192) | (rVar.h(fVar) ? 131072 : 65536);
        if ((74899 & i11) == 74898 && rVar.B()) {
            rVar.S();
        } else {
            Configuration configuration = (Configuration) rVar.j(AndroidCompositionLocals_androidKt.f602a);
            s2.c cVar3 = (s2.c) rVar.j(y1.y0.f8709h);
            final float x10 = cVar3.x(configuration.screenWidthDp);
            final float x11 = cVar3.x(configuration.screenHeightDp);
            final float x12 = cVar3.x(140);
            rVar.X(-1117728281);
            boolean c3 = ((458752 & i11) == 131072) | rVar.c(x10) | rVar.c(x11) | rVar.c(x12);
            Object M = rVar.M();
            if (c3 || M == m0.l.f4646a) {
                M = new oc.c() { // from class: rd.f
                    @Override // oc.c
                    public final Object invoke(Object obj) {
                        pc.j.e((m0.l0) obj, "$this$DisposableEffect");
                        oc.f.this.b(Float.valueOf(x10), Float.valueOf(x11), Float.valueOf(x12));
                        return new w();
                    }
                };
                rVar.i0(M);
            }
            rVar.q(false);
            z.d(ac.o.f277a, (oc.c) M, rVar);
            y0.n a6 = androidx.compose.foundation.a.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.f542b, i7.b.B(R.drawable.app_background, rVar), v1.j.f7082a, 0.0f, null, 54), f1.q.b(d0.c(4278911008L), 0.55f), d0.f2219a);
            v1.e0 e10 = z.m.e(y0.c.f8419g, false);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, a6);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            z.w(e10, rVar, x1.i.f8079e);
            z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            z.w(o7, rVar, x1.i.f8077c);
            if (yVar.f6209e) {
                rVar.X(-1047285634);
                int i12 = i11 & 14;
                int i13 = i11 >> 3;
                i(yVar, cVar, aVar2, cVar2, rVar, (i13 & 7168) | i12 | (i13 & 112) | (i13 & 896));
                rVar.q(false);
            } else {
                rVar.X(-1047361739);
                w(aVar, rVar, (i11 >> 3) & 14);
                rVar.q(false);
            }
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(aVar, cVar, aVar2, cVar2, fVar, i10) { // from class: rd.l

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ oc.a f6156h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ oc.c f6157i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ oc.a f6158j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ oc.c f6159k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ oc.f f6160l;

                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int y10 = m0.z.y(1);
                    x4.f.g(y.this, this.f6156h, this.f6157i, this.f6158j, this.f6159k, this.f6160l, (m0.r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static int g0(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void h(qd.h hVar, int i10, oc.a aVar, oc.a aVar2, m0.r rVar, int i11) {
        rVar.Z(-1689660935);
        if (((i11 | (rVar.f(hVar) ? 4 : 2) | (rVar.d(i10) ? 32 : 16) | (rVar.h(aVar) ? 256 : 128) | (rVar.h(aVar2) ? 2048 : 1024)) & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            rVar.X(-371758873);
            Object M = rVar.M();
            Object obj = m0.l.f4646a;
            if (M == obj) {
                M = v.d.a(0.0f);
                rVar.i0(M);
            }
            v.c cVar = (v.c) M;
            rVar.q(false);
            rVar.X(-371756807);
            boolean h10 = rVar.h(cVar);
            Object M2 = rVar.M();
            if (h10 || M2 == obj) {
                M2 = new t(cVar, null, 2);
                rVar.i0(M2);
            }
            rVar.q(false);
            z.f(ac.o.f277a, rVar, (oc.e) M2);
            y0.n a6 = androidx.compose.foundation.a.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.f542b, i7.b.B(R.drawable.app_background, rVar), v1.j.f7082a, 0.0f, null, 54), f1.q.b(d0.c(4278911008L), 0.55f), d0.f2219a);
            v1.e0 e10 = z.m.e(y0.c.f8423k, false);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, a6);
            x1.j.f8084f.getClass();
            oc.a aVar3 = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar3);
            } else {
                rVar.l0();
            }
            z.w(e10, rVar, x1.i.f8079e);
            z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar2 = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar2);
            }
            z.w(o7, rVar, x1.i.f8077c);
            float f10 = 24;
            j0.g0.b(a.a.I(androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), f10), ((Number) cVar.d()).floatValue()), d0.e.a(f10), j0.g0.d(ee.a.f2162i, rVar, 0), j0.g0.e(62, 8), u0.e.e(1124502257, new sd.g(hVar, i10, aVar, aVar2), rVar), rVar, 196608, 16);
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new rd.r(hVar, i10, aVar, aVar2, i11);
        }
    }

    public static void h0(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static final void i(final y yVar, final oc.c cVar, final oc.a aVar, final oc.c cVar2, m0.r rVar, final int i10) {
        rVar.Z(-823336129);
        int i11 = (rVar.h(yVar) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= rVar.h(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar.h(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= rVar.h(cVar2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            v1.e0 e10 = z.m.e(y0.c.f8419g, false);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, androidx.compose.foundation.layout.b.f542b);
            x1.j.f8084f.getClass();
            oc.a aVar2 = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar2);
            } else {
                rVar.l0();
            }
            z.w(e10, rVar, x1.i.f8079e);
            z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            z.w(o7, rVar, x1.i.f8077c);
            rVar.X(1505532049);
            Iterator it = yVar.f6207c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qd.b bVar = (qd.b) it.next();
                rVar.X(1751501516);
                boolean f10 = ((i11 & 112) == 32) | rVar.f(bVar);
                Object M = rVar.M();
                if (f10 || M == m0.l.f4646a) {
                    M = new y1(3, cVar, bVar);
                    rVar.i0(M);
                }
                rVar.q(false);
                d(bVar, (oc.a) M, pc.j.a(yVar.f6213i, bVar.f5823a), yVar.f6214j, rVar, 0);
            }
            rVar.q(false);
            int i12 = i11 >> 3;
            f(yVar, aVar, cVar2, rVar, (i11 & 14) | (i12 & 112) | (i12 & 896));
            rVar.X(1505545129);
            if (yVar.f6210f) {
                o(aVar, rVar, (i11 >> 6) & 14);
            }
            rVar.q(false);
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e() { // from class: rd.o
                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x4.f.i(y.this, cVar, aVar, cVar2, (m0.r) obj, m0.z.y(i10 | 1));
                    return ac.o.f277a;
                }
            };
        }
    }

    public static void i0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static final long j(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final void k(Object obj, int i10, b0.a0 a0Var, u0.d dVar, m0.r rVar, int i11) {
        int i12;
        rVar.Z(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (rVar.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= rVar.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= rVar.h(a0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= rVar.h(dVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            boolean f10 = rVar.f(obj) | rVar.f(a0Var);
            Object M = rVar.M();
            Object obj2 = m0.l.f4646a;
            if (f10 || M == obj2) {
                M = new b0.z(obj, a0Var);
                rVar.i0(M);
            }
            b0.z zVar = (b0.z) M;
            m0.i1 i1Var = zVar.f934c;
            l1 l1Var = zVar.f936e;
            l1 l1Var2 = zVar.f937f;
            i1Var.h(i10);
            u1 u1Var = h0.f7079a;
            b0.z zVar2 = (b0.z) rVar.j(u1Var);
            w0.g d10 = w0.r.d();
            oc.c e10 = d10 != null ? d10.e() : null;
            w0.g g8 = w0.r.g(d10);
            try {
                if (zVar2 != ((b0.z) l1Var2.getValue())) {
                    l1Var2.setValue(zVar2);
                    if (zVar.f935d.g() > 0) {
                        b0.z zVar3 = (b0.z) l1Var.getValue();
                        if (zVar3 != null) {
                            zVar3.b();
                        }
                        if (zVar2 != null) {
                            zVar2.a();
                        } else {
                            zVar2 = null;
                        }
                        l1Var.setValue(zVar2);
                    }
                }
                w0.r.j(d10, g8, e10);
                boolean f11 = rVar.f(zVar);
                Object M2 = rVar.M();
                if (f11 || M2 == obj2) {
                    M2 = new a0.a0(2, zVar);
                    rVar.i0(M2);
                }
                z.d(zVar, (oc.c) M2, rVar);
                z.a(u1Var.a(zVar), dVar, rVar, ((i12 >> 6) & 112) | 8);
            } catch (Throwable th) {
                w0.r.j(d10, g8, e10);
                throw th;
            }
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new b0.t(obj, i10, a0Var, dVar, i11);
        }
    }

    public static final void l(int i10, m0.r rVar, int i11) {
        m0.r rVar2;
        rVar.Z(1823643366);
        if ((((rVar.d(i10) ? 4 : 2) | i11) & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            j0.g0.b(null, d0.e.a(12), j0.g0.d(f1.q.b(ee.a.f2162i, 0.9f), rVar, 0), j0.g0.e(62, 4), u0.e.e(1545679064, new rd.v(i10, 1), rVar), rVar2, 196608, 17);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new rd.k(i10, i11, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(m5.c cVar, m0.r rVar, int i10) {
        boolean z10;
        x1 s10;
        rVar.Z(-329039035);
        if (!cVar.f4881d.j()) {
            m5.c cVar2 = cVar.f4880c;
            if (!(cVar2 != null ? cVar2.f4881d.j() : false)) {
                z10 = false;
                v6.a.a(z10, new m5.a(cVar, 1), rVar, 0);
                s10 = rVar.s();
                if (s10 == null) {
                    s10.f4809d = new m5.f(cVar, i10, 1);
                    return;
                }
                return;
            }
        }
        z10 = true;
        v6.a.a(z10, new m5.a(cVar, 1), rVar, 0);
        s10 = rVar.s();
        if (s10 == null) {
        }
    }

    public static final void n(int i10, m0.r rVar) {
        m0.r rVar2;
        rVar.Z(168311474);
        if (i10 == 0 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            rVar.X(-332910859);
            Object M = rVar.M();
            z0 z0Var = m0.l.f4646a;
            if (M == z0Var) {
                M = v.d.a(0.0f);
                rVar.i0(M);
            }
            v.c cVar = (v.c) M;
            rVar.q(false);
            rVar.X(-332908815);
            boolean h10 = rVar.h(cVar);
            Object M2 = rVar.M();
            if (h10 || M2 == z0Var) {
                M2 = new sd.h(cVar, null);
                rVar.i0(M2);
            }
            rVar.q(false);
            z.f(ac.o.f277a, rVar, (oc.e) M2);
            rVar2 = rVar;
            j0.g0.b(a.a.I(y0.k.f8442a, ((Number) cVar.d()).floatValue()), d0.e.a(16), j0.g0.d(f1.q.b(ee.a.f2156c, 0.2f), rVar, 0), j0.g0.e(62, 4), sd.b.f6478a, rVar2, 196608, 16);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new h2.u(i10, 26);
        }
    }

    public static final void o(oc.a aVar, m0.r rVar, int i10) {
        int i11;
        m0.r rVar2;
        rVar.Z(282117694);
        if ((i10 & 6) == 0) {
            i11 = (rVar.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            y0.n a6 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.b.f542b, f1.q.b(f1.q.f2277b, 0.7f), d0.f2219a);
            rVar.X(1381730392);
            boolean z10 = (i11 & 14) == 4;
            Object M = rVar.M();
            if (z10 || M == m0.l.f4646a) {
                M = new rd.h(aVar, 1);
                rVar.i0(M);
            }
            rVar.q(false);
            y0.n d10 = androidx.compose.foundation.a.d(a6, false, (oc.a) M, 7);
            v1.e0 e10 = z.m.e(y0.c.f8423k, false);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, d10);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            z.w(e10, rVar, x1.i.f8079e);
            z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            z.w(o7, rVar, x1.i.f8077c);
            rVar2 = rVar;
            j0.g0.b(null, d0.e.a(16), j0.g0.d(ee.a.f2162i, rVar, 0), null, rd.b.f6117b, rVar2, 196608, 25);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new rd.g(i10, 0, aVar);
        }
    }

    public static final void p(final qd.k kVar, final qd.l lVar, final oc.a aVar, final y0.n nVar, m0.r rVar, final int i10) {
        long j3;
        String str;
        yc.y yVar;
        int i11;
        long j6;
        long b2;
        z0 z0Var;
        long b10;
        m0.r rVar2 = rVar;
        rVar2.Z(510043561);
        int i12 = i10 | (rVar2.f(kVar) ? 4 : 2) | (rVar2.f(lVar) ? 32 : 16) | (rVar2.h(aVar) ? 256 : 128) | (rVar2.f(nVar) ? 2048 : 1024);
        if ((i12 & 1171) == 1170 && rVar2.B()) {
            rVar2.S();
        } else {
            rVar2.X(211228157);
            Object M = rVar2.M();
            z0 z0Var2 = m0.l.f4646a;
            if (M == z0Var2) {
                M = v.d.a(1.0f);
                rVar2.i0(M);
            }
            v.c cVar = (v.c) M;
            rVar2.q(false);
            Object M2 = rVar2.M();
            if (M2 == z0Var2) {
                M2 = z.l(rVar2);
                rVar2.i0(M2);
            }
            yc.y yVar2 = (yc.y) M2;
            int i13 = kVar != null ? kVar.f5869e : 0;
            boolean z10 = i13 > 0;
            int ordinal = lVar.ordinal();
            if (ordinal == 0) {
                j3 = ee.a.f2155b;
            } else if (ordinal == 1) {
                j3 = ee.a.f2157d;
            } else {
                if (ordinal != 2) {
                    throw new ac.d();
                }
                j3 = ee.a.f2156c;
            }
            long j10 = j3;
            int ordinal2 = lVar.ordinal();
            if (ordinal2 == 0) {
                str = "⏱️";
            } else if (ordinal2 == 1) {
                str = "🛡️";
            } else {
                if (ordinal2 != 2) {
                    throw new ac.d();
                }
                str = "🧲";
            }
            y0.n c3 = androidx.compose.foundation.layout.b.c(nVar, 90);
            rVar2.X(211247471);
            boolean h10 = rVar2.h(cVar) | rVar2.g(z10);
            Object M3 = rVar2.M();
            if (h10 || M3 == z0Var2) {
                M3 = new rd.m(cVar, z10, 0);
                rVar2.i0(M3);
            }
            rVar2.q(false);
            float f10 = 16;
            y0.n B = B(androidx.compose.ui.graphics.a.a(c3, (oc.c) M3), d0.e.a(f10));
            if (z10) {
                i11 = i13;
                j6 = j10;
                yVar = yVar2;
                b2 = f1.q.b(j6, 0.15f);
            } else {
                yVar = yVar2;
                i11 = i13;
                j6 = j10;
                b2 = f1.q.b(f1.q.f2278c, 0.1f);
            }
            y0.n a6 = androidx.compose.foundation.a.a(B, b2, d0.f2219a);
            float f11 = z10 ? 3 : 1;
            if (z10) {
                z0Var = z0Var2;
                b10 = j6;
            } else {
                z0Var = z0Var2;
                b10 = f1.q.b(f1.q.f2278c, 0.4f);
            }
            y0.n d10 = a6.d(new BorderModifierNodeElement(f11, new i0(b10), d0.e.a(f10)));
            rVar2.X(211269582);
            yc.y yVar3 = yVar;
            boolean h11 = ((i12 & 896) == 256) | rVar2.h(yVar3) | rVar2.h(cVar);
            Object M4 = rVar2.M();
            if (h11 || M4 == z0Var) {
                M4 = new m0.m(yVar3, aVar, cVar, 2);
                rVar2.i0(M4);
            }
            rVar2.q(false);
            y0.n f12 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.a.d(d10, z10, (oc.a) M4, 6), 8);
            v1.e0 e10 = z.m.e(y0.c.f8423k, false);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            y0.n o7 = uc.e.o(rVar2, f12);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            x1.h hVar = x1.i.f8079e;
            z.w(e10, rVar2, hVar);
            x1.h hVar2 = x1.i.f8078d;
            z.w(l10, rVar2, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            z.w(o7, rVar2, hVar4);
            z.r a8 = z.q.a(z.i.f8961c, y0.c.f8431s, rVar2, 54);
            int hashCode2 = Long.hashCode(rVar2.T);
            r1 l11 = rVar2.l();
            y0.k kVar2 = y0.k.f8442a;
            y0.n o10 = uc.e.o(rVar2, kVar2);
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            z.w(a8, rVar2, hVar);
            z.w(l11, rVar2, hVar2);
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
            }
            z.w(o10, rVar2, hVar4);
            x2 x2Var = t0.f3483a;
            boolean z11 = z10;
            long j11 = j6;
            r0.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((s0) rVar2.j(x2Var)).f3465c, rVar2, 0, 65534);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar2, 4));
            String str2 = "x" + i11;
            h2.h0 h0Var = ((s0) rVar2.j(x2Var)).f3469g;
            if (!z11) {
                j11 = f1.q.f2278c;
            }
            r0.b(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h2.h0.a(h0Var, j11, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 0, 65534);
            rVar2 = rVar2;
            rVar2.q(true);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(lVar, aVar, nVar, i10) { // from class: rd.n

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ qd.l f6165h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ oc.a f6166i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ y0.n f6167j;

                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int y10 = m0.z.y(1);
                    x4.f.p(qd.k.this, this.f6165h, this.f6166i, this.f6167j, (m0.r) obj, y10);
                    return ac.o.f277a;
                }
            };
        }
    }

    public static final void q(List list, oc.c cVar, m0.r rVar, int i10) {
        int i11;
        Object obj;
        rVar.Z(2093582293);
        int i12 = 2;
        if ((i10 & 6) == 0) {
            i11 = (rVar.h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= rVar.h(cVar) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) == 18 && rVar.B()) {
            rVar.S();
        } else {
            List L = bc.n.L(qd.l.f5871i, qd.l.f5872j, qd.l.f5873k);
            y0.n b2 = androidx.compose.foundation.layout.b.b(1.0f);
            z.f fVar = z.i.f8959a;
            z.i0 a6 = z.g0.a(new z.e(12), y0.c.f8428p, rVar, 6);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, b2);
            x1.j.f8084f.getClass();
            oc.a aVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.l0();
            }
            z.w(a6, rVar, x1.i.f8079e);
            z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            z.w(o7, rVar, x1.i.f8077c);
            rVar.X(840835727);
            Iterator it = L.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qd.l lVar = (qd.l) it.next();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((qd.k) obj).f5865a == lVar) {
                            break;
                        }
                    }
                }
                qd.k kVar = (qd.k) obj;
                rVar.X(-1974759349);
                boolean f10 = ((i13 & 112) == 32) | rVar.f(lVar);
                Object M = rVar.M();
                if (f10 || M == m0.l.f4646a) {
                    M = new y1(i12, cVar, lVar);
                    rVar.i0(M);
                }
                rVar.q(false);
                p(kVar, lVar, (oc.a) M, j0.a(), rVar, 0);
            }
            rVar.q(false);
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new m0.a0(list, cVar, i10, i12);
        }
    }

    public static final e1.c r(long j3, long j6) {
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        return new e1.c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    public static final void s(final String str, final String str2, final long j3, m0.r rVar, final int i10) {
        rVar.Z(1934061311);
        if (((i10 | (rVar.f(str2) ? 32 : 16) | (rVar.e(j3) ? 256 : 128)) & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            j0.g0.b(androidx.compose.foundation.layout.b.b(1.0f), d0.e.a(16), j0.g0.d(f1.q.b(ee.a.f2162i, 0.6f), rVar, 0), j0.g0.e(62, 4), u0.e.e(730652749, new sd.i(0, j3, str2, str), rVar), rVar, 196614, 16);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(i10, j3, str, str2) { // from class: sd.f

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f6487g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f6488h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f6489i;

                {
                    this.f6487g = str;
                    this.f6488h = str2;
                    this.f6489i = j3;
                }

                @Override // oc.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int y10 = z.y(7);
                    x4.f.s(this.f6487g, this.f6488h, this.f6489i, (r) obj, y10);
                    return o.f277a;
                }
            };
        }
    }

    public static final void t(int i10, m0.r rVar, int i11) {
        m0.r rVar2;
        rVar.Z(-136053711);
        if ((((rVar.d(i10) ? 4 : 2) | i11) & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            j0.g0.b(null, d0.e.a(12), j0.g0.d(f1.q.b(ee.a.f2162i, 0.9f), rVar, 0), j0.g0.e(62, 4), u0.e.e(-414018013, new rd.v(i10, 2), rVar), rVar2, 196608, 17);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new rd.k(i10, i11, 0);
        }
    }

    public static final void u(int i10, m0.r rVar) {
        m0.r rVar2;
        rVar.Z(-179797626);
        if (i10 == 0 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            float f10 = 12;
            d0.d a6 = d0.e.a(f10);
            long j3 = ee.a.f2157d;
            rVar2 = rVar;
            j0.g0.b(new BorderModifierNodeElement(2, new i0(j3), d0.e.a(f10)), a6, j0.g0.d(f1.q.b(j3, 0.3f), rVar, 0), null, rd.b.f6116a, rVar2, 196608, 24);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new h2.u(i10, 25);
        }
    }

    public static final void v(y0.n nVar, oc.a aVar, m0.r rVar, int i10) {
        int i11;
        m0.r rVar2 = rVar;
        pc.j.e(aVar, "onClick");
        rVar2.Z(1107958154);
        if ((i10 & 6) == 0) {
            i11 = (rVar2.f("START GAME") ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= rVar2.f(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar2.h(aVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && rVar2.B()) {
            rVar2.S();
        } else {
            rVar2.X(877555219);
            Object M = rVar2.M();
            Object obj = m0.l.f4646a;
            if (M == obj) {
                M = v.d.a(1.0f);
                rVar2.i0(M);
            }
            v.c cVar = (v.c) M;
            rVar2.q(false);
            rVar2.X(877556627);
            Object M2 = rVar2.M();
            if (M2 == obj) {
                M2 = v.d.a(1.0f);
                rVar2.i0(M2);
            }
            v.c cVar2 = (v.c) M2;
            rVar2.q(false);
            Object M3 = rVar2.M();
            if (M3 == obj) {
                M3 = z.l(rVar2);
                rVar2.i0(M3);
            }
            yc.y yVar = (yc.y) M3;
            rVar2.X(877561018);
            boolean h10 = rVar2.h(cVar) | rVar2.h(cVar2);
            Object M4 = rVar2.M();
            if (h10 || M4 == obj) {
                M4 = new rd.p(cVar, cVar2, 0);
                rVar2.i0(M4);
            }
            rVar2.q(false);
            y0.n a6 = androidx.compose.ui.graphics.a.a(nVar, (oc.c) M4);
            rVar2.X(877567039);
            Object M5 = rVar2.M();
            if (M5 == obj) {
                M5 = new y.i();
                rVar2.i0(M5);
            }
            y.i iVar = (y.i) M5;
            rVar2.q(false);
            rVar2.X(877570378);
            boolean h11 = ((i12 & 896) == 256) | rVar2.h(yVar) | rVar2.h(cVar) | rVar2.h(cVar2);
            Object M6 = rVar2.M();
            if (h11 || M6 == obj) {
                rd.q qVar = new rd.q(yVar, aVar, cVar, cVar2, 0);
                rVar2.i0(qVar);
                M6 = qVar;
            }
            rVar2.q(false);
            y0.n c3 = androidx.compose.foundation.a.c(a6, iVar, null, false, null, (oc.a) M6, 28);
            v1.e0 e10 = z.m.e(y0.c.f8419g, false);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            y0.n o7 = uc.e.o(rVar2, c3);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            x1.h hVar = x1.i.f8079e;
            z.w(e10, rVar2, hVar);
            x1.h hVar2 = x1.i.f8078d;
            z.w(l10, rVar2, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            z.w(o7, rVar2, hVar4);
            k1.b B = i7.b.B(R.drawable.custom_button, rVar2);
            androidx.compose.foundation.layout.a aVar2 = androidx.compose.foundation.layout.a.f540a;
            l0.a(B, "custom button", aVar2.b(), null, v1.j.f7084c, 0.0f, rVar2, 24624, 104);
            y0.n b2 = aVar2.b();
            v1.e0 e11 = z.m.e(y0.c.f8423k, false);
            int hashCode2 = Long.hashCode(rVar2.T);
            r1 l11 = rVar2.l();
            y0.n o10 = uc.e.o(rVar2, b2);
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            z.w(e11, rVar2, hVar);
            z.w(l11, rVar2, hVar2);
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
            }
            z.w(o10, rVar2, hVar4);
            r0.b("START GAME", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h2.h0.a(((s0) rVar2.j(t0.f3483a)).f3470h, f1.q.f2279d, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar, i12 & 14, 65534);
            rVar2 = rVar;
            rVar2.q(true);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new m0.a0(nVar, aVar, i10, 3);
        }
    }

    public static final void w(oc.a aVar, m0.r rVar, int i10) {
        int i11;
        oc.a aVar2;
        m0.r rVar2 = rVar;
        rVar2.Z(-855605484);
        if ((i10 & 6) == 0) {
            i11 = i10 | (rVar2.h(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar2.B()) {
            rVar2.S();
            aVar2 = aVar;
        } else {
            y0.n f10 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.f542b, 24);
            z.r a6 = z.q.a(z.i.f8961c, y0.c.f8431s, rVar2, 54);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            y0.n o7 = uc.e.o(rVar2, f10);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            z.w(a6, rVar2, x1.i.f8079e);
            z.w(l10, rVar2, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar);
            }
            z.w(o7, rVar2, x1.i.f8077c);
            k1.b B = i7.b.B(R.drawable.logo, rVar2);
            y0.k kVar = y0.k.f8442a;
            l0.a(B, "logo image", androidx.compose.foundation.layout.b.h(kVar, 180), null, v1.j.f7083b, 0.0f, rVar2, 25008, 104);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, 16));
            x2 x2Var = t0.f3483a;
            r0.b("Tap on 7 and Joker cards!", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h2.h0.a(((s0) rVar2.j(x2Var)).f3472j, f1.q.f2279d, 0L, null, null, 0L, 0L, null, 16777214), rVar, 6, 65534);
            r0.b("Avoid all other cards!", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h2.h0.a(((s0) rVar.j(x2Var)).f3473k, f1.q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar, 6, 65534);
            rVar2 = rVar;
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, 48));
            aVar2 = aVar;
            v(androidx.compose.foundation.layout.b.i(kVar, 200, 56), aVar2, rVar2, ((i11 << 6) & 896) | 54);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new rd.g(i10, 1, aVar2);
        }
    }

    public static final void x(String str, String str2, long j3, y0.n nVar, m0.r rVar, int i10) {
        rVar.Z(-277376040);
        int i11 = i10 | (rVar.f(str2) ? 32 : 16) | (rVar.e(j3) ? 256 : 128) | (rVar.f(nVar) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            j0.g0.b(nVar, d0.e.a(16), j0.g0.d(f1.q.b(ee.a.f2162i, 0.6f), rVar, 0), j0.g0.e(62, 4), u0.e.e(-191506650, new sd.i(1, j3, str2, str), rVar), rVar, ((i11 >> 9) & 14) | 196608, 16);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new sd.e(str, str2, j3, nVar, i10);
        }
    }

    public static void y(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final int z(float f10) {
        return Math.round((float) Math.ceil(f10));
    }
}
