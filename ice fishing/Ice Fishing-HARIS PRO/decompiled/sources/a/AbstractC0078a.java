package a;

import D1.d;
import D1.i;
import F.j;
import F.k;
import F.o;
import G.e;
import I1.b;
import M0.h;
import O.InterfaceC0034j;
import O.J;
import O.K;
import O.O;
import R.c;
import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0078a implements O {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1657a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1658b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1659c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f1660d;

    public AbstractC0078a() {
        new ConcurrentHashMap();
    }

    public static ColorStateList A(Context context, h hVar, int i) {
        int resourceId;
        ColorStateList z2;
        TypedArray typedArray = (TypedArray) hVar.f617c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = z(context, resourceId)) == null) ? hVar.b(i) : z2;
    }

    public static ColorStateList B(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList z2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = z(context, resourceId)) == null) ? typedArray.getColorStateList(i) : z2;
    }

    public static ColorStateList C(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !B.a.q(drawable)) {
            return null;
        }
        colorStateList = B.a.e(drawable).getColorStateList();
        return colorStateList;
    }

    public static float D(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? c.b(edgeEffect) : RecyclerView.f2111C0;
    }

    public static Drawable E(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable n2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (n2 = f.n(context, resourceId)) == null) ? typedArray.getDrawable(i) : n2;
    }

    public static final Class F(b bVar) {
        i.e(bVar, "<this>");
        Class a2 = ((d) bVar).a();
        i.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class G(b bVar) {
        i.e(bVar, "<this>");
        Class a2 = ((d) bVar).a();
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

    public static float H(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= RecyclerView.f2111C0 && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static File I(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int J(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(D1.h.e("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static boolean L(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = G.a.f260a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = red / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = blue / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean N(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int O(int i, int i2, float f2) {
        return G.a.b(G.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static Typeface P(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, j(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static MappedByteBuffer Q(Context context, Uri uri) {
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

    public static float T(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.c(edgeEffect, f2, f3);
        }
        R.b.a(edgeEffect, f2, f3);
        return f2;
    }

    public static TypedValue U(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean V(Context context, int i, boolean z2) {
        TypedValue U2 = U(context, i);
        return (U2 == null || U2.type != 18) ? z2 : U2.data != 0;
    }

    public static int W(Context context, int i, int i2) {
        TypedValue U2 = U(context, i);
        return (U2 == null || U2.type != 16) ? i2 : U2.data;
    }

    public static TimeInterpolator X(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!N(valueOf, "cubic-bezier") && !N(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (N(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(H(split, 0), H(split, 1), H(split, 2), H(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!N(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            e.b(s(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(substring), e);
        }
    }

    public static TypedValue Y(Context context, int i, String str) {
        TypedValue U2 = U(context, i);
        if (U2 != null) {
            return U2;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void b0(Window window, boolean z2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            K.a.d(window, z2);
        } else {
            if (i >= 30) {
                K.a.c(window, z2);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void c0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final Bundle d(t1.d... dVarArr) {
        Bundle bundle = new Bundle(dVarArr.length);
        for (t1.d dVar : dVarArr) {
            String str = (String) dVar.f4378a;
            Object obj = dVar.f4379b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                i.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void d0(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void e(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new H1.c(2, 36, 1));
        }
    }

    public static int i(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                if (noteProxyOpNoThrow == 0) {
                    noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, D.f.a(context)) : 1;
                }
            } else {
                noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (noteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static int j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float[] l(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static boolean m(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean n2 = n(file, inputStream);
                k(inputStream);
                return n2;
            } catch (Throwable th) {
                th = th;
                k(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean n(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e[] s(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = l(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(D1.h.g("error in parsing \"", trim, "\""), e);
                            }
                        }
                        arrayList.add(new e(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new e(str.charAt(i3), new float[0]));
        }
        return (e[]) arrayList.toArray(new e[i]);
    }

    public static e[] t(e[] eVarArr) {
        e[] eVarArr2 = new e[eVarArr.length];
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr2[i] = new e(eVarArr[i]);
        }
        return eVarArr2;
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = K.f747a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = J.f743d;
        J j = (J) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (j == null) {
            j = new J();
            j.f744a = null;
            j.f745b = null;
            j.f746c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, j);
        }
        WeakReference weakReference2 = j.f746c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        j.f746c = new WeakReference(keyEvent);
        if (j.f745b == null) {
            j.f745b = new SparseArray();
        }
        SparseArray sparseArray = j.f745b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean v(InterfaceC0034j interfaceC0034j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC0034j == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0034j.e(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f1657a) {
                        try {
                            f1658b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f1657a = true;
                    }
                    Method method = f1658b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                z2 = ((Boolean) invoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (K.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && K.b(view, keyEvent)) || interfaceC0034j.e(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f1659c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f1660d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f1659c = true;
        }
        Field field = f1660d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
            if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window.getDecorView();
            if (K.b(decorView2, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        onKeyListener = null;
        if (onKeyListener == null) {
        }
        window = dialog.getWindow();
        if (!window.superDispatchKeyEvent(keyEvent)) {
        }
    }

    public static int x(Context context, int i, int i2) {
        Integer num;
        TypedValue U2 = U(context, i);
        if (U2 != null) {
            int i3 = U2.resourceId;
            num = Integer.valueOf(i3 != 0 ? context.getColor(i3) : U2.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int y(View view, int i) {
        Context context = view.getContext();
        TypedValue Y2 = Y(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = Y2.resourceId;
        return i2 != 0 ? context.getColor(i2) : Y2.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f212c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList z(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        j jVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        k kVar = new k(resources, theme);
        synchronized (o.f223c) {
            try {
                SparseArray sparseArray = (SparseArray) o.f222b.get(kVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (jVar = (j) sparseArray.get(i)) != null) {
                    if (jVar.f211b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (jVar.f212c != 0) {
                            }
                            colorStateList2 = jVar.f210a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = o.f221a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = F.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (o.f223c) {
            try {
                WeakHashMap weakHashMap = o.f222b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(kVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(kVar, sparseArray2);
                }
                sparseArray2.append(i, new j(colorStateList, kVar.f213a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public abstract boolean K();

    public abstract void R(int i);

    public abstract void S(Typeface typeface, boolean z2);

    public abstract void Z(boolean z2);

    public abstract void a0(boolean z2);

    @Override // O.O
    public void b() {
    }

    @Override // O.O
    public void c() {
    }

    public abstract Typeface o(Context context, F.f fVar, Resources resources, int i);

    public abstract Typeface p(Context context, L.j[] jVarArr, int i);

    public Typeface q(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface r(Context context, Resources resources, int i, String str, int i2) {
        File I2 = I(context);
        if (I2 == null) {
            return null;
        }
        try {
            if (m(I2, resources, i)) {
                return Typeface.createFromFile(I2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            I2.delete();
        }
    }

    public L.j w(L.j[] jVarArr, int i) {
        new S0.e(2);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        L.j jVar = null;
        int i3 = Integer.MAX_VALUE;
        for (L.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.f433c - i2) * 2) + (jVar2.f434d == z2 ? 0 : 1);
            if (jVar == null || i3 > abs) {
                jVar = jVar2;
                i3 = abs;
            }
        }
        return jVar;
    }
}
