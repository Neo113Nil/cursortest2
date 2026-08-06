package R1;

import A1.AbstractC0018t;
import A1.AbstractC0022x;
import A1.C0013n;
import J1.q;
import a.AbstractC0083a;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import com.yandex.varioqub.config.model.ConfigValue;
import h1.C0237g;
import i1.AbstractC0251h;
import i1.t;
import i1.v;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import kotlin.jvm.internal.s;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
import t1.InterfaceC1046a;
import t1.p;
import w1.C1062c;
import y.D;
import z1.o;

/* loaded from: classes.dex */
public abstract class d {
    public static MappedByteBuffer A(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
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
        } catch (IOException unused) {
            return null;
        }
    }

    public static float B(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C.e.c(edgeEffect, f2, f3);
        }
        C.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void C(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    C(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static String D(X509Certificate certificate) {
        kotlin.jvm.internal.i.e(certificate, "certificate");
        W1.j jVar = W1.j.f1876d;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.i.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i2 = 0;
        AbstractC0083a.d(encoded.length, 0, length);
        byte[] O2 = AbstractC0251h.O(encoded, 0, length);
        W1.j jVar2 = new W1.j(O2);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(O2, 0, jVar2.a());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.i.d(digestBytes, "digestBytes");
        new W1.j(digestBytes);
        byte[] map = W1.a.f1857a;
        kotlin.jvm.internal.i.e(map, "map");
        byte[] bArr = new byte[((digestBytes.length + 2) / 3) * 4];
        int length2 = digestBytes.length - (digestBytes.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b2 = digestBytes[i2];
            int i4 = i2 + 2;
            byte b3 = digestBytes[i2 + 1];
            i2 += 3;
            byte b4 = digestBytes[i4];
            bArr[i3] = map[(b2 & 255) >> 2];
            bArr[i3 + 1] = map[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr[i3 + 2] = map[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr[i5] = map[b4 & 63];
        }
        int length3 = digestBytes.length - length2;
        if (length3 == 1) {
            byte b5 = digestBytes[i2];
            bArr[i3] = map[(b5 & 255) >> 2];
            bArr[1 + i3] = map[(b5 & 3) << 4];
            bArr[2 + i3] = 61;
            bArr[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b6 = digestBytes[i2];
            byte b7 = digestBytes[i6];
            bArr[i3] = map[(b6 & 255) >> 2];
            bArr[1 + i3] = map[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr[i3 + 2] = map[(b7 & 15) << 2];
            bArr[i3 + 3] = 61;
        }
        return kotlin.jvm.internal.i.h(new String(bArr, z1.a.f8620a), "sha256/");
    }

    public static void E(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            D.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static Set F(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return t.f3418a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(v.G(objArr.length));
            AbstractC0251h.S(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        kotlin.jvm.internal.i.d(singleton, "singleton(...)");
        return singleton;
    }

    public static final W1.c G(Socket socket) {
        Logger logger = W1.n.f1890a;
        W1.v vVar = new W1.v(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.i.d(outputStream, "getOutputStream()");
        return new W1.c(vVar, new W1.c(outputStream, vVar));
    }

    public static final W1.d H(Socket socket) {
        Logger logger = W1.n.f1890a;
        W1.v vVar = new W1.v(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.i.d(inputStream, "getInputStream()");
        return new W1.d(0, vVar, new W1.d(1, inputStream, vVar));
    }

    public static final Object I(F1.t tVar, F1.t tVar2, p pVar) {
        Object c0013n;
        Object K2;
        try {
            s.a(2, pVar);
            c0013n = pVar.invoke(tVar2, tVar);
        } catch (Throwable th) {
            c0013n = new C0013n(th, false);
        }
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        if (c0013n == enumC0985a || (K2 = tVar.K(c0013n)) == AbstractC0022x.f77d) {
            return enumC0985a;
        }
        if (K2 instanceof C0013n) {
            throw ((C0013n) K2).f62a;
        }
        return AbstractC0022x.l(K2);
    }

    public static final void a(M1.a aVar, M1.c cVar, String str) {
        M1.d.f1097i.fine(cVar.f1091b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f1084a);
    }

    public static void b(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new C1062c(2, 36, 1));
        }
    }

    public static void c(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(C1.a.h("fromIndex: ", i2, i3, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean e(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean f2 = f(file, inputStream);
                d(inputStream);
                return f2;
            } catch (Throwable th) {
                th = th;
                d(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean f(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x013e, code lost:
    
        if (g(r2.getValue(), r5.getValue()) == false) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            if (dArr.length != dArr2.length) {
                return false;
            }
            int length = dArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!j(dArr[i2], dArr2[i2])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof float[]) && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            if (fArr.length != fArr2.length) {
                return false;
            }
            int length2 = fArr.length;
            for (int i3 = 0; i3 < length2; i3++) {
                if (!l(fArr[i3], fArr2[i3])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            int length3 = objArr.length;
            for (int i4 = 0; i4 < length3; i4++) {
                if (!g(objArr[i4], objArr2[i4])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Iterator it = list.iterator();
            Iterator it2 = list2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!g(it.next(), it2.next())) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return ((obj instanceof Double) && (obj2 instanceof Double)) ? j(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) : ((obj instanceof Float) && (obj2 instanceof Float)) ? l(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        loop4: for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Iterator it3 = map2.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break loop4;
                }
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (g(key, entry2.getKey())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static int h(Object obj) {
        int i2 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        boolean z2 = obj instanceof double[];
        double d2 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        int i3 = 1;
        if (z2) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (i2 < length) {
                double d3 = dArr[i2];
                int i4 = i3 * 31;
                if (d3 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    d3 = 0.0d;
                }
                long doubleToLongBits = Double.doubleToLongBits(d3);
                i3 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                i2++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (i2 < length2) {
                float f2 = fArr[i2];
                int i5 = i3 * 31;
                if (f2 == 0.0f) {
                    f2 = 0.0f;
                }
                i3 = i5 + Float.floatToIntBits(f2);
                i2++;
            }
        } else {
            if (!(obj instanceof Object[])) {
                if (obj instanceof List) {
                    Iterator it = ((List) obj).iterator();
                    int i6 = 1;
                    while (it.hasNext()) {
                        i6 = (i6 * 31) + h(it.next());
                    }
                    return i6;
                }
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        i2 += h(entry.getValue()) ^ (h(entry.getKey()) * 31);
                    }
                    return i2;
                }
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        return obj.hashCode();
                    }
                    float floatValue = ((Number) obj).floatValue();
                    return Float.floatToIntBits(floatValue != 0.0f ? floatValue : 0.0f);
                }
                double doubleValue = ((Number) obj).doubleValue();
                if (doubleValue != ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    d2 = doubleValue;
                }
                long doubleToLongBits2 = Double.doubleToLongBits(d2);
                return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            }
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (i2 < length3) {
                i3 = (i3 * 31) + h(objArr[i2]);
                i2++;
            }
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Activity activity, androidx.lifecycle.d event) {
        androidx.lifecycle.l b2;
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(event, "event");
        if (!(activity instanceof androidx.lifecycle.j) || (b2 = ((androidx.lifecycle.j) activity).b()) == null) {
            return;
        }
        b2.d(event);
    }

    public static boolean j(double d2, double d3) {
        double d4 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        double d5 = d2 == ConfigValue.DOUBLE_DEFAULT_VALUE ? 0.0d : d2;
        if (d3 != ConfigValue.DOUBLE_DEFAULT_VALUE) {
            d4 = d3;
        }
        return d5 == d4 || (Double.isNaN(d2) && Double.isNaN(d3));
    }

    public static final boolean k(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean l(float f2, float f3) {
        return ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : f2) == (f3 != 0.0f ? f3 : 0.0f) || (Float.isNaN(f2) && Float.isNaN(f3));
    }

    public static final String m(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static q n() {
        Matcher matcher = q.f913a.matcher("application/x-protobuf");
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"application/x-protobuf\"".toString());
        }
        String group = matcher.group(1);
        kotlin.jvm.internal.i.d(group, "typeSubtype.group(1)");
        Locale US = Locale.US;
        kotlin.jvm.internal.i.d(US, "US");
        kotlin.jvm.internal.i.d(group.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        kotlin.jvm.internal.i.d(group2, "typeSubtype.group(2)");
        kotlin.jvm.internal.i.d(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = q.f914b.matcher("application/x-protobuf");
        int end = matcher.end();
        while (end < 22) {
            matcher2.region(end, 22);
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = "application/x-protobuf".substring(end);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"application/x-protobuf\"");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (o.R(group4, "'", false) && o.M(group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    kotlin.jvm.internal.i.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return new q();
    }

    public static int o(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static float p(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C.e.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class q(x1.c cVar) {
        kotlin.jvm.internal.i.e(cVar, "<this>");
        Class a2 = ((kotlin.jvm.internal.c) cVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static String r(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static File s(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static l1.d t(l1.d dVar) {
        kotlin.jvm.internal.i.e(dVar, "<this>");
        AbstractC0991b abstractC0991b = dVar instanceof AbstractC0991b ? (AbstractC0991b) dVar : null;
        if (abstractC0991b == null) {
            return dVar;
        }
        l1.d dVar2 = abstractC0991b.f8214c;
        if (dVar2 != null) {
            return dVar2;
        }
        l1.f fVar = (l1.f) abstractC0991b.getContext().m(l1.e.f8137a);
        l1.d hVar = fVar != null ? new F1.h((AbstractC0018t) fVar, abstractC0991b) : abstractC0991b;
        abstractC0991b.f8214c = hVar;
        return hVar;
    }

    public static final boolean u(AssertionError assertionError) {
        Logger logger = W1.n.f1890a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? z1.g.T(message, "getsockname failed") : false;
    }

    public static boolean v(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentSizingFlag", "Could not get metadata", e2);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static boolean w() {
        return e.f1748d;
    }

    public static final boolean x(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static C0237g y(InterfaceC1046a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        return new C0237g(initializer);
    }

    public static N1.e z(Context context) {
        String string;
        String string2;
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = Q0.e.f1527a.f1525b;
            String str2 = Q0.e.f1528b.f1525b;
            String str3 = null;
            if (bundle == null) {
                string = null;
            } else {
                string = bundle.getString(str, null);
                if (string == null) {
                    string = bundle.getString(str2);
                }
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str4 = Q0.e.f1532f.f1525b;
            if (bundle2 != null) {
                bundle2.getString(str4, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str5 = Q0.e.f1533g.f1525b;
            if (bundle3 != null) {
                bundle3.getString(str5, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str6 = Q0.e.f1529c.f1525b;
            String str7 = Q0.e.f1530d.f1525b;
            if (bundle4 == null) {
                string2 = null;
            } else {
                string2 = bundle4.getString(str6, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str7);
                }
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                C(xml, jSONArray, false);
                            }
                        }
                    }
                    str3 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str8 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new N1.e(string, string2, str3, str8, bundle6 == null ? true : bundle6.getBoolean("io.flutter.automatically-register-plugins", true));
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public abstract void J(byte[] bArr, int i2, int i3);
}
