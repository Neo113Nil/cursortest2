package u0;

import A1.AbstractC0000a;
import J1.m;
import J1.u;
import P.F;
import P.w;
import P.x;
import R1.d;
import R1.l;
import W1.e;
import a.AbstractC0083a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import h1.C0239i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.i;
import m.c;
import m.f;
import n.AbstractC0986a;
import n1.AbstractC0991b;
import o1.AbstractC0998a;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import p1.AbstractC1030a;
import q.AbstractC1031a;
import q.C1033c;
import q.C1034d;
import q.InterfaceC1032b;
import t1.p;
import w1.C1060a;
import w1.C1062c;
import z1.g;
import z1.o;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1050a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f8476a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f8477b;

    public AbstractC1050a() {
        new ConcurrentHashMap();
    }

    public static String A(Throwable th) {
        i.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        i.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void B(p pVar, AbstractC0000a abstractC0000a, AbstractC0000a abstractC0000a2) {
        try {
            F1.a.h(d.t(((AbstractC0991b) pVar).b(abstractC0000a, abstractC0000a2)), C0239i.f3393a, null);
        } catch (Throwable th) {
            abstractC0000a2.i(l.h(th));
            throw th;
        }
    }

    public static C1060a C(C1062c c1062c, int i2) {
        i.e(c1062c, "<this>");
        boolean z2 = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (z2) {
            if (c1062c.f8518c <= 0) {
                i2 = -i2;
            }
            return new C1060a(c1062c.f8516a, c1062c.f8517b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final String D(String str) {
        i.e(str, "<this>");
        int i2 = 0;
        int i3 = -1;
        if (!g.T(str, StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            try {
                String ascii = IDN.toASCII(str);
                i.d(ascii, "toASCII(host)");
                Locale US = Locale.US;
                i.d(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    char charAt = lowerCase.charAt(i4);
                    if (i.f(charAt, 31) <= 0 || i.f(charAt, 127) >= 0 || g.X(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                    i4 = i5;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress n2 = (o.R(str, "[", false) && o.M(str, "]")) ? n(str, 1, str.length() - 1) : n(str, 0, str.length());
        if (n2 == null) {
            return null;
        }
        byte[] address = n2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return n2.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i3 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        W1.g gVar = new W1.g();
        while (i2 < address.length) {
            if (i2 == i3) {
                gVar.u(58);
                i2 += i7;
                if (i2 == 16) {
                    gVar.u(58);
                }
            } else {
                if (i2 > 0) {
                    gVar.u(58);
                }
                byte b2 = address[i2];
                byte[] bArr = K1.b.f1051a;
                gVar.v(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return gVar.n(gVar.f1875b, z1.a.f8620a);
    }

    public static C1062c E(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new C1062c(i2, i3 - 1, 1);
        }
        C1062c c1062c = C1062c.f8523d;
        return C1062c.f8523d;
    }

    public static Object F(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(F(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(F(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), F(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public static void a(Throwable th, Throwable exception) {
        i.e(th, "<this>");
        i.e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC1030a.f8432a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC0998a.f8323a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static e b() {
        e eVar = e.f1868l;
        i.b(eVar);
        e eVar2 = eVar.f1870f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            e.f1865i.await(e.f1866j, TimeUnit.MILLISECONDS);
            e eVar3 = e.f1868l;
            i.b(eVar3);
            if (eVar3.f1870f != null || System.nanoTime() - nanoTime < e.f1867k) {
                return null;
            }
            return e.f1868l;
        }
        long nanoTime2 = eVar2.f1871g - System.nanoTime();
        if (nanoTime2 > 0) {
            e.f1865i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        e eVar4 = e.f1868l;
        i.b(eVar4);
        eVar4.f1870f = eVar2.f1870f;
        eVar2.f1870f = null;
        return eVar2;
    }

    public static void f(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(K1.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
            }
            i2 = i3;
        }
    }

    public static void g(String str, String str2) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                throw new IllegalArgumentException(i.h(K1.b.q(str2) ? "" : i.h(str, ": "), K1.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2)).toString());
            }
            i2 = i3;
        }
    }

    public static int h(F f2, L.b bVar, View view, View view2, w wVar, boolean z2) {
        if (wVar.p() == 0 || f2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z2) {
            return Math.min(bVar.f(), bVar.b(view2) - bVar.c(view));
        }
        ((x) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int i(F f2, L.b bVar, View view, View view2, w wVar, boolean z2) {
        if (wVar.p() == 0 || f2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return f2.a();
        }
        bVar.b(view2);
        bVar.c(view);
        ((x) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (r7 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r8 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress n(String str, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 16;
        byte[] bArr = new byte[16];
        boolean z2 = false;
        int i8 = i2;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            if (i8 >= i3) {
                i4 = i7;
                break;
            }
            if (i9 != i7) {
                int i12 = i8 + 2;
                if (i12 <= i3 && o.Q(i8, str, "::", z2)) {
                    if (i10 == -1) {
                        i9 += 2;
                        if (i12 != i3) {
                            i10 = i9;
                            i11 = i12;
                            i8 = i11;
                            int i13 = 0;
                            while (i8 < i3) {
                            }
                            i6 = i8 - i11;
                            if (i6 == 0) {
                                break;
                            }
                            break;
                        }
                        i4 = i7;
                        i10 = i9;
                        break;
                    }
                    return null;
                }
                if (i9 != 0) {
                    if (!o.Q(i8, str, StringUtils.PROCESS_POSTFIX_DELIMITER, z2)) {
                        if (o.Q(i8, str, ".", z2)) {
                            int i14 = i9 - 2;
                            int i15 = i14;
                            loop2: while (true) {
                                if (i11 < i3) {
                                    if (i15 == i7) {
                                        break;
                                    }
                                    if (i15 != i14) {
                                        if (str.charAt(i11) != '.') {
                                            break;
                                        }
                                        i11++;
                                    }
                                    ?? r14 = z2;
                                    int i16 = i11;
                                    while (i16 < i3) {
                                        char charAt = str.charAt(i16);
                                        if (i.f(charAt, 48) < 0 || i.f(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i11 != i16) || (i5 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i16++;
                                        r14 = i5;
                                    }
                                    if (i16 - i11 == 0) {
                                        break;
                                    }
                                    bArr[i15] = (byte) r14;
                                    i15++;
                                    i11 = i16;
                                    i7 = 16;
                                    z2 = false;
                                } else if (i15 == i9 + 2) {
                                    i9 += 2;
                                    i4 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i8++;
                }
                i11 = i8;
                i8 = i11;
                int i132 = 0;
                while (i8 < i3) {
                    int r2 = K1.b.r(str.charAt(i8));
                    if (r2 == -1) {
                        break;
                    }
                    i132 = (i132 << 4) + r2;
                    i8++;
                }
                i6 = i8 - i11;
                if (i6 == 0 || i6 > 4) {
                    break;
                }
                int i17 = i9 + 1;
                bArr[i9] = (byte) ((i132 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                i9 += 2;
                bArr[i17] = (byte) (i132 & KotlinVersion.MAX_COMPONENT_VALUE);
                i7 = 16;
                z2 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static void r(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void s(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static m t(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            String str = strArr2[i3];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i3] = g.k0(str).toString();
            i3 = i4;
        }
        int k2 = AbstractC0083a.k(0, strArr2.length - 1, 2);
        if (k2 >= 0) {
            while (true) {
                int i5 = i2 + 2;
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                f(str2);
                g(str3, str2);
                if (i2 == k2) {
                    break;
                }
                i2 = i5;
            }
        }
        return new m(strArr2);
    }

    public static InterfaceC1032b u(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0986a.f8196a);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    z(xmlResourceParser);
                }
                return new q.e(new u(string, string2, string3, y(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0986a.f8197b);
                        int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = obtainAttributes2.getInt(i3, 0);
                        int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                        String string6 = obtainAttributes2.getString(i5);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            z(xmlResourceParser);
                        }
                        arrayList.add(new C1034d(i2, i4, resourceId2, string6, string5, z2));
                    } else {
                        z(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C1033c((C1034d[]) arrayList.toArray(new C1034d[0]));
            }
        } else {
            z(xmlResourceParser);
        }
        return null;
    }

    public static void x(T0.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = dVar.f1801g;
                    int i4 = dVar.f1800f;
                    if (integer != 90 && integer != 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    dVar.f1796b = i3;
                    dVar.f1795a = i4;
                    dVar.f1797c = integer;
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    public static List y(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC1031a.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void z(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public abstract boolean c(m.g gVar, c cVar);

    public abstract boolean d(m.g gVar, Object obj, Object obj2);

    public abstract boolean e(m.g gVar, f fVar, f fVar2);

    public abstract Typeface j(Context context, C1033c c1033c, Resources resources, int i2);

    public abstract Typeface k(Context context, v.g[] gVarArr, int i2);

    public Typeface l(Context context, InputStream inputStream) {
        File s2 = d.s(context);
        if (s2 == null) {
            return null;
        }
        try {
            if (d.f(s2, inputStream)) {
                return Typeface.createFromFile(s2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            s2.delete();
        }
    }

    public Typeface m(Context context, Resources resources, int i2, String str, int i3) {
        File s2 = d.s(context);
        if (s2 == null) {
            return null;
        }
        try {
            if (d.e(s2, resources, i2)) {
                return Typeface.createFromFile(s2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            s2.delete();
        }
    }

    public abstract String o(byte[] bArr, int i2, int i3);

    public abstract int p(String str, byte[] bArr, int i2, int i3);

    public v.g q(v.g[] gVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        v.g gVar = null;
        int i4 = Integer.MAX_VALUE;
        for (v.g gVar2 : gVarArr) {
            int abs = (Math.abs(gVar2.f8499c - i3) * 2) + (gVar2.f8500d == z2 ? 0 : 1);
            if (gVar == null || i4 > abs) {
                gVar = gVar2;
                i4 = abs;
            }
        }
        return gVar;
    }

    public abstract void v(f fVar, f fVar2);

    public abstract void w(f fVar, Thread thread);
}
