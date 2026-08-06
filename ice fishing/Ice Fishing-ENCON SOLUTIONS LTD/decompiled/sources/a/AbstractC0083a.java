package a;

import F.C0030f;
import F.C0032h;
import F.C0036l;
import F.U;
import J1.B;
import J1.g;
import J1.k;
import J1.t;
import K1.b;
import R1.l;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import h.p0;
import h1.C0234d;
import h1.C0239i;
import i1.r;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import l1.h;
import l1.j;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import t1.InterfaceC1046a;
import u0.AbstractC1050a;
import z1.o;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0083a {
    public static void A(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, C0036l c0036l, AbstractC0991b abstractC0991b) {
        C0030f c0030f;
        int i2;
        List list2;
        p pVar;
        Iterator it;
        Throwable th;
        if (abstractC0991b instanceof C0030f) {
            c0030f = (C0030f) abstractC0991b;
            int i3 = c0030f.f480g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0030f.f480g = i3 - Integer.MIN_VALUE;
                Object obj = c0030f.f479f;
                Object obj2 = EnumC0985a.f8194a;
                i2 = c0030f.f480g;
                if (i2 != 0) {
                    l.F(obj);
                    ArrayList arrayList = new ArrayList();
                    C0032h c0032h = new C0032h(list, arrayList, null);
                    c0030f.f477d = arrayList;
                    c0030f.f480g = 1;
                    if (c0036l.a(c0032h, c0030f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0030f.f478e;
                        pVar = (p) c0030f.f477d;
                        try {
                            l.F(obj);
                        } catch (Throwable th2) {
                            Object obj3 = pVar.f8076a;
                            if (obj3 == null) {
                                pVar.f8076a = th2;
                            } else {
                                AbstractC1050a.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            t1.l lVar = (t1.l) it.next();
                            c0030f.f477d = pVar;
                            c0030f.f478e = it;
                            c0030f.f480g = 2;
                            if (lVar.invoke(c0030f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) pVar.f8076a;
                        if (th == null) {
                            return C0239i.f3393a;
                        }
                        throw th;
                    }
                    list2 = (List) c0030f.f477d;
                    l.F(obj);
                }
                pVar = new p();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) pVar.f8076a;
                if (th == null) {
                }
            }
        }
        c0030f = new C0030f(abstractC0991b);
        Object obj4 = c0030f.f479f;
        Object obj22 = EnumC0985a.f8194a;
        i2 = c0030f.f480g;
        if (i2 != 0) {
        }
        pVar = new p();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) pVar.f8076a;
        if (th == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap b(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i2 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else {
                        if (i2 != 5) {
                            return bitmap;
                        }
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return createBitmap;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i2);
                    break;
            }
        }
        return bitmap;
    }

    public static final boolean c(int i2, int i3, int i4, byte[] a2, byte[] b2) {
        i.e(a2, "a");
        i.e(b2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2[i5 + i2] != b2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void d(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final void e(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1050a.a(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] f(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static boolean g(Method method, d dVar) {
        Class a2 = dVar.a();
        i.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static B h(String javaName) {
        i.e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return B.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return B.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return B.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return B.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return B.SSL_3_0;
        }
        throw new IllegalArgumentException(i.h(javaName, "Unexpected TLS version: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k i(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = r.f3416a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(i.h(cipherSuite, "cipherSuite == "));
        }
        g c2 = g.f847b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        B h2 = h(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = b.l(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = b.l(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new k(h2, c2, list2, new U(2, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new k(h2, c2, list2, new U(2, list));
    }

    public static l1.g j(l1.g gVar, h key) {
        i.e(key, "key");
        if (i.a(gVar.getKey(), key)) {
            return gVar;
        }
        return null;
    }

    public static final int k(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static boolean l(byte b2) {
        return b2 > -65;
    }

    public static List m(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static l1.i n(l1.g gVar, h key) {
        i.e(key, "key");
        return i.a(gVar.getKey(), key) ? j.f8138a : gVar;
    }

    public static O1.h o(String statusLine) {
        int i2;
        String str;
        i.e(statusLine, "statusLine");
        boolean R2 = o.R(statusLine, "HTTP/1.", false);
        t tVar = t.HTTP_1_0;
        if (R2) {
            i2 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException(i.h(statusLine, "Unexpected status line: "));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(i.h(statusLine, "Unexpected status line: "));
                }
                tVar = t.HTTP_1_1;
            }
        } else {
            if (!o.R(statusLine, "ICY ", false)) {
                throw new ProtocolException(i.h(statusLine, "Unexpected status line: "));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (statusLine.length() < i3) {
            throw new ProtocolException(i.h(statusLine, "Unexpected status line: "));
        }
        try {
            String substring = statusLine.substring(i2, i3);
            i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (statusLine.length() <= i3) {
                str = "";
            } else {
                if (statusLine.charAt(i3) != ' ') {
                    throw new ProtocolException(i.h(statusLine, "Unexpected status line: "));
                }
                str = statusLine.substring(i2 + 4);
                i.d(str, "this as java.lang.String).substring(startIndex)");
            }
            return new O1.h(tVar, parseInt, str);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(i.h(statusLine, "Unexpected status line: "));
        }
    }

    public static void p(FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static void q(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        p0 p0Var = p0.f3317j;
        if (p0Var != null && p0Var.f3319a == view) {
            p0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p0(view, charSequence);
            return;
        }
        p0 p0Var2 = p0.f3318k;
        if (p0Var2 != null && p0Var2.f3319a == view) {
            p0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static boolean r(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static final C0234d s(String str, String str2) {
        return new C0234d(str, str2);
    }

    public static final boolean t(String str, InterfaceC1046a interfaceC1046a) {
        try {
            boolean booleanValue = ((Boolean) interfaceC1046a.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static void u(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int y2 = y(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        z(parcel, y2);
    }

    public static void v(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int y2 = y(parcel, i2);
        parcel.writeString(str);
        z(parcel, y2);
    }

    public static void w(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int y2 = y(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        z(parcel, y2);
    }

    public static void x(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int y2 = y(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
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
        z(parcel, y2);
    }

    public static int y(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void z(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }
}
