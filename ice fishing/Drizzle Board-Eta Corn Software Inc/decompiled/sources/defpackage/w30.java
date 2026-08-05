package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.kolosta.rejin.jilosa.R;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.RejectedExecutionException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w30 {
    public static final /* synthetic */ int lDXGDhIF = 0;
    public static final /* synthetic */ int ygLcUYwZ = 0;
    public static final Object NCTxEWno = new Object();
    public static final lf MdtA4re8 = new lf("CLOSED", 1);
    public static final String[] wxUZMvaN = {"standard", "accelerate", "decelerate", "linear"};
    public static final Object VgvYg0wo = new Object();
    public static final boolean[] P7K7Inc8 = new boolean[3];
    public static final k00 b2ZJblxo = new k00(2);
    public static final k00 Qr9iLBAD = new k00(3);
    public static final k00 jb9XjC4I = new k00(4);
    public static final lf eVhOlqcC = new lf("NO_THREAD_ELEMENTS", 1);
    public static final l6 k3x7lurq = new l6(7);
    public static final l6 ow5vqvCr = new l6(8);
    public static final l6 OnDfzHZD = new l6(9);

    public static Drawable DK9slbsy(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable Ey6iv0m0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (Ey6iv0m0 = ra.Ey6iv0m0(context, resourceId)) == null) ? typedArray.getDrawable(i) : Ey6iv0m0;
    }

    public static final Object Ey6iv0m0(b60 b60Var, long j, dl dlVar) {
        while (true) {
            b60 b60Var2 = b60Var;
            while (true) {
                if (b60Var2.wxUZMvaN >= j && !b60Var2.MdtA4re8()) {
                    return b60Var2;
                }
                Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(b60Var2, r7.qoPGr6Ce);
                lf lfVar = MdtA4re8;
                if (objectVolatile == lfVar) {
                    return lfVar;
                }
                b60Var = (b60) ((r7) objectVolatile);
                if (b60Var != null) {
                    break;
                }
                b60 b60Var3 = (b60) dlVar.Qr9iLBAD(Long.valueOf(b60Var2.wxUZMvaN + 1), b60Var2);
                while (true) {
                    Unsafe unsafe = b1.qoPGr6Ce;
                    long j2 = r7.qoPGr6Ce;
                    if (unsafe.compareAndSwapObject(b60Var2, j2, (Object) null, b60Var3)) {
                        if (b60Var2.MdtA4re8()) {
                            b60Var2.wxUZMvaN();
                        }
                        b60Var2 = b60Var3;
                    } else if (unsafe.getObjectVolatile(b60Var2, j2) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final void FXJmAAN1(l9 l9Var, Object obj) {
        if (obj == eVhOlqcC) {
            return;
        }
        if (!(obj instanceof nc0)) {
            Object Qr9iLBAD2 = l9Var.Qr9iLBAD(null, ow5vqvCr);
            Qr9iLBAD2.getClass();
            ((jc0) Qr9iLBAD2).MdtA4re8.set(obj);
            return;
        }
        nc0 nc0Var = (nc0) obj;
        jc0[] jc0VarArr = nc0Var.MdtA4re8;
        int length = jc0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            jc0 jc0Var = jc0VarArr[length];
            jc0Var.getClass();
            jc0Var.MdtA4re8.set(nc0Var.NCTxEWno[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static ColorStateList FySoLYna(Context context, f0 f0Var, int i) {
        int resourceId;
        ColorStateList RXQxj5Oe;
        TypedArray typedArray = (TypedArray) f0Var.MdtA4re8;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (RXQxj5Oe = RXQxj5Oe(context, resourceId)) == null) ? f0Var.sjUBp5pO(i) : RXQxj5Oe;
    }

    public static final e10 HdOGZAzC(xg xgVar, t5 t5Var, u90 u90Var, Object obj) {
        q50 q50Var;
        m4 m4Var;
        xg MdtA4re82;
        j4.qoPGr6Ce.getClass();
        i4 i4Var = i4.qoPGr6Ce;
        if (!(xgVar instanceof m4) || (MdtA4re82 = (m4Var = (m4) xgVar).MdtA4re8()) == null) {
            q50Var = new q50(xgVar, uf.NCTxEWno);
        } else {
            if (m4Var.MdtA4re8 != -3) {
            }
            q50Var = new q50(MdtA4re82, m4Var.NCTxEWno);
        }
        x90 qoPGr6Ce = ra.qoPGr6Ce(obj);
        fn.KlHjfFWx(t5Var, (l9) q50Var.NCTxEWno, u90Var.equals(l70.qoPGr6Ce) ? w9.NCTxEWno : w9.VgvYg0wo, new jh(u90Var, (xg) q50Var.qoPGr6Ce, qoPGr6Ce, obj, (g9) null));
        return new e10(qoPGr6Ce);
    }

    public static final l9 I5GHvsYW(l9 l9Var, l9 l9Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 2;
        boolean booleanValue = ((Boolean) l9Var.Qr9iLBAD(bool, new l6(i))).booleanValue();
        boolean booleanValue2 = ((Boolean) l9Var2.Qr9iLBAD(bool, new l6(i))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return l9Var.eVhOlqcC(l9Var2);
        }
        l6 l6Var = new l6(3);
        uf ufVar = uf.NCTxEWno;
        l9 l9Var3 = (l9) l9Var.Qr9iLBAD(ufVar, l6Var);
        Object obj = l9Var2;
        if (booleanValue2) {
            obj = l9Var2.Qr9iLBAD(ufVar, new l6(4));
        }
        return l9Var3.eVhOlqcC((l9) obj);
    }

    public static en KRabZ4CU(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new en(i, i2 - 1, 1);
        }
        en enVar = en.VgvYg0wo;
        return en.VgvYg0wo;
    }

    public static final void KlHjfFWx(f40 f40Var, String str) {
        f40Var.getClass();
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0(str);
        try {
            Ey6iv0m0.amk52bBQ();
            le0.eVhOlqcC(Ey6iv0m0, null);
        } finally {
        }
    }

    public static z2 MdtA4re8(int i, int i2, v2 v2Var) {
        int i3 = i2 & 2;
        v2 v2Var2 = v2.NCTxEWno;
        if (i3 != 0) {
            v2Var = v2Var2;
        }
        if (i == -2) {
            if (v2Var != v2Var2) {
                return new s7(1, v2Var);
            }
            j4.qoPGr6Ce.getClass();
            return new z2(i4.NCTxEWno);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? v2Var == v2Var2 ? new z2(i) : new s7(i, v2Var) : new z2(Integer.MAX_VALUE) : v2Var == v2Var2 ? new z2(0) : new s7(1, v2Var);
        }
        if (v2Var == v2Var2) {
            return new s7(1, v2.MdtA4re8);
        }
        m1.sjUBp5pO("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final l50 Mq3SeTnW(vg0 vg0Var) {
        j50 j50Var = new j50();
        aa VgvYg0wo2 = vg0Var instanceof gm ? ((gm) vg0Var).VgvYg0wo() : y9.NCTxEWno;
        VgvYg0wo2.getClass();
        return (l50) ((VZZbw3BB) new tg0(vg0Var.P7K7Inc8(), j50Var, VgvYg0wo2).MdtA4re8).Qr9iLBAD(m20.qoPGr6Ce(l50.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static float[] OnDfzHZD(float[] fArr, int i) {
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

    public static final void OxcuoDLp(s50 s50Var) {
        po poVar = s50Var.b2ZJblxo().MdtA4re8;
        if (poVar != po.MdtA4re8 && poVar != po.wxUZMvaN) {
            m1.sjUBp5pO("Failed requirement.");
        } else if (s50Var.qoPGr6Ce().gjV1z5T1() == null) {
            k50 k50Var = new k50(s50Var.qoPGr6Ce(), (vg0) s50Var);
            s50Var.qoPGr6Ce().eIA6dogk("androidx.lifecycle.internal.SavedStateHandlesProvider", k50Var);
            s50Var.b2ZJblxo().qoPGr6Ce(new i10(5, k50Var));
        }
    }

    public static void Qr9iLBAD(u8 u8Var, gp gpVar, t8 t8Var) {
        t8Var.lDXGDhIF = -1;
        e8 e8Var = t8Var.Xkz7p5xa;
        int[] iArr = t8Var.N2kLh4D5;
        e8 e8Var2 = t8Var.aZz0PFXp;
        e8 e8Var3 = t8Var.pRiPUEwG;
        e8 e8Var4 = t8Var.VhgXwMj9;
        e8 e8Var5 = t8Var.eIA6dogk;
        t8Var.sjUBp5pO = -1;
        int[] iArr2 = u8Var.N2kLh4D5;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = e8Var5.b2ZJblxo;
            int lDXGDhIF2 = u8Var.lDXGDhIF() - e8Var4.b2ZJblxo;
            e8Var5.jb9XjC4I = gpVar.k3x7lurq(e8Var5);
            e8Var4.jb9XjC4I = gpVar.k3x7lurq(e8Var4);
            gpVar.wxUZMvaN(e8Var5.jb9XjC4I, i);
            gpVar.wxUZMvaN(e8Var4.jb9XjC4I, lDXGDhIF2);
            t8Var.lDXGDhIF = 2;
            t8Var.TrssYQ34 = i;
            int i2 = lDXGDhIF2 - i;
            t8Var.ZyZthT5G = i2;
            int i3 = t8Var.VGmz0ccI;
            if (i2 < i3) {
                t8Var.ZyZthT5G = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = e8Var3.b2ZJblxo;
        int jb9XjC4I2 = u8Var.jb9XjC4I() - e8Var2.b2ZJblxo;
        e8Var3.jb9XjC4I = gpVar.k3x7lurq(e8Var3);
        e8Var2.jb9XjC4I = gpVar.k3x7lurq(e8Var2);
        gpVar.wxUZMvaN(e8Var3.jb9XjC4I, i4);
        gpVar.wxUZMvaN(e8Var2.jb9XjC4I, jb9XjC4I2);
        if (t8Var.ESscZ9M1 > 0 || t8Var.LvHlPNBd == 8) {
            r70 k3x7lurq2 = gpVar.k3x7lurq(e8Var);
            e8Var.jb9XjC4I = k3x7lurq2;
            gpVar.wxUZMvaN(k3x7lurq2, t8Var.ESscZ9M1 + i4);
        }
        t8Var.sjUBp5pO = 2;
        t8Var.g2aRJUAd = i4;
        int i5 = jb9XjC4I2 - i4;
        t8Var.bvfAo0eO = i5;
        int i6 = t8Var.LfKQckgD;
        if (i5 < i6) {
            t8Var.bvfAo0eO = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.MdtA4re8 == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList RXQxj5Oe(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f30 f30Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        g30 g30Var = new g30(resources, theme);
        synchronized (i30.MdtA4re8) {
            try {
                SparseArray sparseArray = (SparseArray) i30.NCTxEWno.get(g30Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (f30Var = (f30) sparseArray.get(i)) != null) {
                    if (f30Var.NCTxEWno.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (f30Var.MdtA4re8 != 0) {
                            }
                            colorStateList2 = f30Var.qoPGr6Ce;
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
        ThreadLocal threadLocal = i30.qoPGr6Ce;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = f6.qoPGr6Ce(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (i30.MdtA4re8) {
            try {
                WeakHashMap weakHashMap = i30.NCTxEWno;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(g30Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(g30Var, sparseArray2);
                }
                sparseArray2.append(i, new f30(colorStateList, g30Var.qoPGr6Ce.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static g9 SgZGMMPL(g9 g9Var) {
        g9Var.getClass();
        h9 h9Var = g9Var instanceof h9 ? (h9) g9Var : null;
        if (h9Var == null || (g9Var = h9Var.wxUZMvaN) != null) {
            return g9Var;
        }
        n9 n9Var = (n9) h9Var.wxUZMvaN().OnDfzHZD(re.MdtA4re8);
        g9 adVar = n9Var != null ? new ad(n9Var, h9Var) : h9Var;
        h9Var.wxUZMvaN = adVar;
        return adVar;
    }

    public static final we0 TrssYQ34(g9 g9Var, l9 l9Var, Object obj) {
        we0 we0Var = null;
        if ((g9Var instanceof v9) && l9Var.OnDfzHZD(x30.wxUZMvaN) != null) {
            v9 v9Var = (v9) g9Var;
            while (true) {
                if ((v9Var instanceof bd) || (v9Var = v9Var.MdtA4re8()) == null) {
                    break;
                }
                if (v9Var instanceof we0) {
                    we0Var = (we0) v9Var;
                    break;
                }
            }
            if (we0Var != null) {
                we0Var.LfKQckgD(l9Var, obj);
            }
        }
        return we0Var;
    }

    public static float U0LaHZX7(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final Bundle VgvYg0wo(hx... hxVarArr) {
        Bundle bundle = new Bundle(hxVarArr.length);
        for (hx hxVar : hxVarArr) {
            String str = (String) hxVar.NCTxEWno;
            Object obj = hxVar.MdtA4re8;
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
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        m1.k3x7lurq("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\"");
                        return null;
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
                    m1.k3x7lurq("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\"");
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static int WYNAV5pd(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Xkz7p5xa(Context context, String str) {
        synchronized (NCTxEWno) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static final Object ZyZthT5G(l9 l9Var) {
        Object Qr9iLBAD2 = l9Var.Qr9iLBAD(0, k3x7lurq);
        Qr9iLBAD2.getClass();
        return Qr9iLBAD2;
    }

    public static final boolean amk52bBQ(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void bvfAo0eO(String str, int i) {
        throw new SQLException(q70.VgvYg0wo("Error code: ", i) + ", message: ".concat(str));
    }

    public static fo eIA6dogk(io ioVar, ok okVar) {
        re reVar = re.jb9XjC4I;
        int ordinal = ioVar.ordinal();
        if (ordinal == 0) {
            return new cb0(okVar);
        }
        if (ordinal == 1) {
            q40 q40Var = new q40();
            q40Var.NCTxEWno = okVar;
            q40Var.MdtA4re8 = reVar;
            return q40Var;
        }
        if (ordinal != 2) {
            throw new d7();
        }
        bf0 bf0Var = new bf0();
        bf0Var.NCTxEWno = okVar;
        bf0Var.MdtA4re8 = reVar;
        return bf0Var;
    }

    public static long eVhOlqcC(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static int euDDoUNr(Context context, int i) {
        if (i == 0) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, y00.KlHjfFWx);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = obtainStyledAttributes.getValue(2, typedValue);
        }
        obtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        int complexUnit = typedValue.getComplexUnit();
        int i2 = typedValue.data;
        return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String fVMzMhyS(Context context) {
        String str;
        synchronized (NCTxEWno) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next != 1) {
                                if (next == 3 && newPullParser.getDepth() <= depth) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
        if (str.isEmpty()) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
        return str;
    }

    public static ColorStateList gjV1z5T1(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList RXQxj5Oe;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (RXQxj5Oe = RXQxj5Oe(context, resourceId)) == null) ? typedArray.getColorStateList(i) : RXQxj5Oe;
    }

    public static final Object gmkaJpmS(l9 l9Var, Object obj) {
        if (obj == null) {
            obj = ZyZthT5G(l9Var);
        }
        if (obj == 0) {
            return eVhOlqcC;
        }
        if (obj instanceof Integer) {
            return l9Var.Qr9iLBAD(new nc0(((Number) obj).intValue(), l9Var), OnDfzHZD);
        }
        jc0 jc0Var = (jc0) obj;
        ThreadLocal threadLocal = jc0Var.MdtA4re8;
        Object obj2 = threadLocal.get();
        threadLocal.set(jc0Var.NCTxEWno);
        return obj2;
    }

    public static TimeInterpolator hzgxAD8d(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            m1.sjUBp5pO("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!ytu5o6f4(valueOf, "cubic-bezier") && !ytu5o6f4(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (ytu5o6f4(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(U0LaHZX7(split, 0), U0LaHZX7(split, 1), U0LaHZX7(split, 2), U0LaHZX7(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!ytu5o6f4(valueOf, "path")) {
            m1.sjUBp5pO("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            pRiPUEwG(lDXGDhIF(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(substring), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b40 i7xS8jrb(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        m1.sjUBp5pO(q70.VgvYg0wo("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new b40(i2, radius, center);
    }

    public static ev jb9XjC4I(TypedValue typedValue, ev evVar, ev evVar2, String str, String str2) {
        if (evVar == null || evVar == evVar2) {
            return evVar == null ? evVar2 : evVar;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static int k3x7lurq(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
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
    public static kz[] lDXGDhIF(String str) {
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
                                fArr = OnDfzHZD(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(q70.P7K7Inc8("error in parsing \"", trim, "\""), e);
                            }
                        }
                        arrayList.add(new kz(trim.charAt(i2), fArr));
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
            arrayList.add(new kz(str.charAt(i3), new float[0]));
        }
        return (kz[]) arrayList.toArray(new kz[i]);
    }

    public static final Object ow5vqvCr(v30 v30Var, zk zkVar, g9 g9Var) {
        HzhOLUMW hzhOLUMW;
        if (v30Var.b2ZJblxo() && v30Var.jb9XjC4I() && v30Var.Qr9iLBAD()) {
            return zkVar.ow5vqvCr(g9Var);
        }
        if (g9Var.wxUZMvaN().OnDfzHZD(x30.MdtA4re8) == null) {
            return zkVar.ow5vqvCr(g9Var);
        }
        y7 y7Var = new y7(zkVar, null, 4);
        kd0 kd0Var = (kd0) g9Var.wxUZMvaN().OnDfzHZD(kd0.MdtA4re8);
        n9 n9Var = kd0Var != null ? kd0Var.NCTxEWno : null;
        if (n9Var != null) {
            return fn.fVMzMhyS(n9Var, y7Var, g9Var);
        }
        m3 m3Var = new m3(1, SgZGMMPL(g9Var));
        m3Var.I5GHvsYW();
        try {
            hzhOLUMW = v30Var.wxUZMvaN;
        } catch (RejectedExecutionException e) {
            m3Var.OxcuoDLp(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (hzhOLUMW != null) {
            hzhOLUMW.execute(new a30(m3Var, v30Var, y7Var));
            return m3Var.Ey6iv0m0();
        }
        fn.ytu5o6f4("internalTransactionExecutor");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void pRiPUEwG(kz[] kzVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        kz kzVar;
        int i3;
        char c;
        float f;
        float f2;
        kz kzVar2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        kz[] kzVarArr2 = kzVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = kzVarArr2.length;
        int i4 = 0;
        int i5 = 0;
        char c2 = 'm';
        while (i5 < length) {
            kz kzVar3 = kzVarArr2[i5];
            char c3 = kzVar3.qoPGr6Ce;
            float[] fArr3 = kzVar3.NCTxEWno;
            float f11 = fArr2[i4];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            int i6 = i4;
            float f16 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i7 = i6;
            while (i7 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i7;
                    kzVar = kzVar3;
                    float f21 = f19;
                    float f22 = f20;
                    i3 = i5;
                    c = c3;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    kz.qoPGr6Ce(path, f21, f22, fArr[i8], fArr[i9], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i6, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f13 = fArr[i8];
                    f = fArr[i9];
                    f14 = f;
                    f2 = f13;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    kzVar = kzVar3;
                    c = c3;
                    int i10 = i2 + 2;
                    int i11 = i2 + 3;
                    int i12 = i2 + 4;
                    int i13 = i2 + 5;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i10], fArr[i11], fArr[i12], fArr[i13]);
                    float f23 = fArr[i12];
                    float f24 = fArr[i13];
                    f13 = fArr[i10];
                    f14 = fArr[i11];
                    f = f24;
                    f2 = f23;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i7;
                    kzVar = kzVar3;
                    c = c3;
                    f = f20;
                    i3 = i5;
                    path2.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    kzVar = kzVar3;
                    c = c3;
                    int i14 = i2 + 1;
                    int i15 = i2 + 2;
                    int i16 = i2 + 3;
                    path2.quadTo(fArr[i2], fArr[i14], fArr[i15], fArr[i16]);
                    float f25 = fArr[i2];
                    float f26 = fArr[i14];
                    float f27 = fArr[i15];
                    float f28 = fArr[i16];
                    f13 = f25;
                    f14 = f26;
                    f2 = f27;
                    f = f28;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    kzVar = kzVar3;
                    f2 = f19;
                    c = c3;
                    path2.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i7;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        int i19 = i2 + 4;
                        int i20 = i2 + 5;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                        float f29 = fArr[i17] + f19;
                        float f30 = fArr[i18] + f20;
                        f19 += fArr[i19];
                        f20 += fArr[i20];
                        f13 = f29;
                        f14 = f30;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    int i21 = i2 + 1;
                                    path2.lineTo(fArr[i2], fArr[i21]);
                                    f2 = fArr[i2];
                                    f = fArr[i21];
                                } else if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    f2 = fArr[i2];
                                    f = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f2, f);
                                    } else {
                                        path2.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c3 != 'S') {
                                    if (c3 == 'T') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i22 = i2 + 1;
                                        path2.quadTo(f19, f20, fArr[i2], fArr[i22]);
                                        f2 = fArr[i2];
                                        f = fArr[i22];
                                        kzVar = kzVar3;
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c3 == 'l') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        int i23 = i2 + 1;
                                        path2.rLineTo(fArr[i2], fArr[i23]);
                                        f19 += fArr[i2];
                                        f6 = fArr[i23];
                                    } else if (c3 == 'm') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        float f31 = fArr[i2];
                                        f19 += f31;
                                        float f32 = fArr[i2 + 1];
                                        f20 += f32;
                                        if (i2 > 0) {
                                            path2.rLineTo(f31, f32);
                                        } else {
                                            path2.rMoveTo(f31, f32);
                                            kzVar = kzVar3;
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c3 != 's') {
                                        if (c3 != 't') {
                                            fArr = fArr3;
                                            i2 = i7;
                                            kzVar = kzVar3;
                                            f2 = f19;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f9 = f19 - f13;
                                                f10 = f20 - f14;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i24 = i7 + 1;
                                            path2.rQuadTo(f9, f10, fArr3[i7], fArr3[i24]);
                                            float f33 = f9 + f19;
                                            float f34 = f10 + f20;
                                            float f35 = f19 + fArr3[i7];
                                            f20 += fArr3[i24];
                                            f14 = f34;
                                            fArr = fArr3;
                                            i2 = i7;
                                            kzVar = kzVar3;
                                            f2 = f35;
                                            f13 = f33;
                                        }
                                        f = f20;
                                    } else {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i25 = i7;
                                        int i26 = i25 + 1;
                                        int i27 = i25 + 2;
                                        int i28 = i25 + 3;
                                        fArr = fArr3;
                                        i2 = i25;
                                        path2.rCubicTo(f8, f7, fArr3[i25], fArr3[i26], fArr3[i27], fArr3[i28]);
                                        f3 = fArr[i2] + f19;
                                        f4 = fArr[i26] + f20;
                                        f19 += fArr[i27];
                                        f5 = fArr[i28];
                                    }
                                    i3 = i5;
                                    c = c3;
                                } else {
                                    fArr = fArr3;
                                    i2 = i7;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f36 = f19;
                                    float f37 = f20;
                                    int i29 = i2 + 1;
                                    int i30 = i2 + 2;
                                    int i31 = i2 + 3;
                                    path2.cubicTo(f36, f37, fArr[i2], fArr[i29], fArr[i30], fArr[i31]);
                                    f13 = fArr[i2];
                                    f14 = fArr[i29];
                                    f2 = fArr[i30];
                                    f = fArr[i31];
                                }
                                i3 = i5;
                                kzVar = kzVar3;
                                c = c3;
                            } else {
                                fArr = fArr3;
                                i2 = i7;
                                path2.rLineTo(0.0f, fArr[i2]);
                                f6 = fArr[i2];
                            }
                            f20 += f6;
                        } else {
                            fArr = fArr3;
                            i2 = i7;
                            int i32 = i2 + 1;
                            int i33 = i2 + 2;
                            int i34 = i2 + 3;
                            path2.rQuadTo(fArr[i2], fArr[i32], fArr[i33], fArr[i34]);
                            f3 = fArr[i2] + f19;
                            f4 = fArr[i32] + f20;
                            f19 += fArr[i33];
                            f5 = fArr[i34];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr = fArr3;
                        i2 = i7;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f19 += fArr[i2];
                    }
                    kzVar = kzVar3;
                    f2 = f19;
                    f = f20;
                    i3 = i5;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i7;
                    int i35 = i2 + 5;
                    float f38 = fArr[i35] + f19;
                    int i36 = i2 + 6;
                    float f39 = fArr[i36] + f20;
                    float f40 = fArr[i2];
                    float f41 = fArr[i2 + 1];
                    float f42 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        kzVar2 = kzVar3;
                        z = 1;
                    } else {
                        kzVar2 = kzVar3;
                        z = i6;
                    }
                    kzVar = kzVar2;
                    float f43 = f19;
                    c = c3;
                    float f44 = f20;
                    i3 = i5;
                    kz.qoPGr6Ce(path, f43, f44, f38, f39, f40, f41, f42, z, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f2 = f43 + fArr[i35];
                    f = f44 + fArr[i36];
                    f13 = f2;
                    f14 = f;
                }
                i7 = i2 + i;
                path2 = path;
                kzVar3 = kzVar;
                c3 = c;
                i5 = i3;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i6] = f19;
            fArr2[1] = f20;
            fArr2[2] = f13;
            fArr2[3] = f14;
            fArr2[4] = f17;
            fArr2[5] = f18;
            c2 = kzVar3.qoPGr6Ce;
            i5++;
            kzVarArr2 = kzVarArr;
            path2 = path;
            i4 = i6;
        }
    }

    public static final h50 sjUBp5pO(aa aaVar) {
        s50 s50Var = (s50) aaVar.qoPGr6Ce(b2ZJblxo);
        Bundle bundle = null;
        if (s50Var == null) {
            m1.sjUBp5pO("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        vg0 vg0Var = (vg0) aaVar.qoPGr6Ce(Qr9iLBAD);
        if (vg0Var == null) {
            m1.sjUBp5pO("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) aaVar.qoPGr6Ce(jb9XjC4I);
        String str = (String) aaVar.qoPGr6Ce(tg0.wxUZMvaN);
        if (str == null) {
            m1.sjUBp5pO("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        p50 gjV1z5T1 = s50Var.qoPGr6Ce().gjV1z5T1();
        k50 k50Var = gjV1z5T1 instanceof k50 ? (k50) gjV1z5T1 : null;
        if (k50Var == null) {
            m1.Ey6iv0m0("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = Mq3SeTnW(vg0Var).NCTxEWno;
        h50 h50Var = (h50) linkedHashMap.get(str);
        if (h50Var != null) {
            return h50Var;
        }
        k50Var.NCTxEWno();
        Bundle bundle3 = k50Var.MdtA4re8;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                k50Var.MdtA4re8 = null;
            }
            bundle = bundle4;
        }
        h50 NCTxEWno2 = g50.NCTxEWno(bundle, bundle2);
        linkedHashMap.put(str, NCTxEWno2);
        return NCTxEWno2;
    }

    public static void wxUZMvaN(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = on.qoPGr6Ce;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = mz.qoPGr6Ce;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vh ygLcUYwZ(Context context) {
        ProviderInfo providerInfo;
        th thVar;
        ApplicationInfo applicationInfo;
        int i = 12;
        re taVar = Build.VERSION.SDK_INT >= 28 ? new ta(i) : new re(i);
        PackageManager packageManager = context.getPackageManager();
        fn.MdtA4re8(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] wxUZMvaN2 = taVar.wxUZMvaN(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : wxUZMvaN2) {
                    arrayList.add(signature.toByteArray());
                }
                thVar = new th(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (thVar != null) {
                return null;
            }
            return new vh(new uh(context, thVar));
        }
        thVar = null;
        if (thVar != null) {
        }
    }

    public static boolean ytu5o6f4(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static g80 zCflySGU(Context context) {
        TypedValue SgZGMMPL = ra.SgZGMMPL(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = y00.amk52bBQ;
        TypedArray obtainStyledAttributes = SgZGMMPL == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(SgZGMMPL.resourceId, iArr);
        g80 g80Var = new g80();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            g80Var.NCTxEWno(f);
            g80Var.qoPGr6Ce(f2);
            return g80Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void N8VPGzVC(boolean z);

    public abstract View VhgXwMj9(int i);

    public abstract boolean aZz0PFXp();

    public abstract InputFilter[] lwWCatUu(InputFilter[] inputFilterArr);

    public abstract void nSmgoSB5(boolean z);
}
