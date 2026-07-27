package o;

import E0.i;
import K0.AbstractC0043t;
import U.m;
import U.n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import d0.C0113c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import s0.InterfaceC0258b;
import v0.h;
import v0.j;
import w.AbstractC0266D;
import w.C0268F;
import w.G;
import w.H;
import w.S;

/* loaded from: classes.dex */
public abstract class g {
    public g() {
        new ConcurrentHashMap();
    }

    public static void B(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0266D.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final void C(Object obj) {
        if (obj instanceof t0.c) {
            throw ((t0.c) obj).f2984f;
        }
    }

    public static void a(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, "exception");
        if (th != th2) {
            Integer num = z0.a.f3092a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = y0.a.f3091a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void b(Context context, InterfaceC0258b interfaceC0258b) {
        Rect rect;
        S b2;
        WindowMetrics maximumWindowMetrics;
        Activity q2 = q(context);
        if (q2 != null) {
            m.f1037a.getClass();
            int i2 = n.f1038b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) q2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = q2.getSystemService("window");
                i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                i.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                b2 = (i3 >= 30 ? new H() : i3 >= 29 ? new G() : new C0268F()).b();
                i.d(b2, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b2 = Y.b.f1072a.a(q2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
            }
            if (i5 <= i7) {
                i.e(b2, "_windowInsetsCompat");
                ((C0113c) interfaceC0258b).f1776a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean e2 = e(file, inputStream);
                c(inputStream);
                return e2;
            } catch (Throwable th) {
                th = th;
                c(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean e(File file, InputStream inputStream) {
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
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final t0.c f(Throwable th) {
        i.e(th, "exception");
        return new t0.c(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x013e, code lost:
    
        if (k(r2.getValue(), r5.getValue()) == false) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(Object obj, Object obj2) {
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
                if (!m(dArr[i2], dArr2[i2])) {
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
                if (!o(fArr[i3], fArr2[i3])) {
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
                if (!k(objArr[i4], objArr2[i4])) {
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
                if (!k(it.next(), it2.next())) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return ((obj instanceof Double) && (obj2 instanceof Double)) ? m(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) : ((obj instanceof Float) && (obj2 instanceof Float)) ? o(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
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
                if (k(key, entry2.getKey())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static int l(Object obj) {
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
        int i3 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (i2 < length) {
                double d2 = dArr[i2];
                int i4 = i3 * 31;
                if (d2 == 0.0d) {
                    d2 = 0.0d;
                }
                long doubleToLongBits = Double.doubleToLongBits(d2);
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
                        i6 = (i6 * 31) + l(it.next());
                    }
                    return i6;
                }
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        i2 += l(entry.getValue()) ^ (l(entry.getKey()) * 31);
                    }
                    return i2;
                }
                if (obj instanceof Double) {
                    double doubleValue = ((Number) obj).doubleValue();
                    long doubleToLongBits2 = Double.doubleToLongBits(doubleValue != 0.0d ? doubleValue : 0.0d);
                    return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
                }
                if (!(obj instanceof Float)) {
                    return obj.hashCode();
                }
                float floatValue = ((Number) obj).floatValue();
                return Float.floatToIntBits(floatValue != 0.0f ? floatValue : 0.0f);
            }
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (i2 < length3) {
                i3 = (i3 * 31) + l(objArr[i2]);
                i2++;
            }
        }
        return i3;
    }

    public static boolean m(double d2, double d3) {
        return ((d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1)) == 0 ? 0.0d : d2) == (d3 != 0.0d ? d3 : 0.0d) || (Double.isNaN(d2) && Double.isNaN(d3));
    }

    public static boolean o(float f2, float f3) {
        return ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : f2) == (f3 != 0.0f ? f3 : 0.0f) || (Float.isNaN(f2) && Float.isNaN(f3));
    }

    public static v0.g p(v0.g gVar, h hVar) {
        i.e(hVar, "key");
        if (i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Activity q(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return q(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int r(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static String s(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static File t(Context context) {
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

    public static v0.d u(v0.d dVar) {
        i.e(dVar, "<this>");
        x0.b bVar = dVar instanceof x0.b ? (x0.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        v0.d dVar2 = bVar.f3087h;
        if (dVar2 != null) {
            return dVar2;
        }
        v0.f fVar = (v0.f) bVar.j().i(v0.e.f3008f);
        v0.d hVar = fVar != null ? new P0.h((AbstractC0043t) fVar, bVar) : bVar;
        bVar.f3087h = hVar;
        return hVar;
    }

    public static List v(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int w(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static v0.i x(v0.g gVar, h hVar) {
        i.e(hVar, "key");
        return i.a(gVar.getKey(), hVar) ? j.f3009f : gVar;
    }

    public static MappedByteBuffer y(Context context, Uri uri) {
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

    public abstract void A(boolean z2);

    public abstract Typeface g(Context context, c cVar, Resources resources, int i2);

    public abstract Typeface h(Context context, t.h[] hVarArr, int i2);

    public Typeface i(Context context, InputStream inputStream) {
        File t2 = t(context);
        if (t2 == null) {
            return null;
        }
        try {
            if (e(t2, inputStream)) {
                return Typeface.createFromFile(t2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            t2.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i2, String str, int i3) {
        File t2 = t(context);
        if (t2 == null) {
            return null;
        }
        try {
            if (d(t2, resources, i2)) {
                return Typeface.createFromFile(t2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            t2.delete();
        }
    }

    public t.h n(t.h[] hVarArr, int i2) {
        new E.a(23);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        t.h hVar = null;
        int i4 = Integer.MAX_VALUE;
        for (t.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f2973c - i3) * 2) + (hVar2.f2974d == z2 ? 0 : 1);
            if (hVar == null || i4 > abs) {
                hVar = hVar2;
                i4 = abs;
            }
        }
        return hVar;
    }

    public void z(boolean z2) {
    }
}
