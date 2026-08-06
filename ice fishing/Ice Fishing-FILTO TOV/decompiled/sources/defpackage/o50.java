package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.window.BackEvent;
import com.combinations.level.experts.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class o50 {
    public static final float GWasM1elztuh = 0.38f;

    public static final void A1EKNP6CxJ(Object obj) {
        if (obj instanceof su0) {
            throw ((su0) obj).OOA6hdeuvCS;
        }
    }

    public static v20 AEn1Rrio(x20 x20Var) {
        x20Var.getClass();
        return new v20(x20Var.OOA6hdeuvCS, x20Var.EljAMC1QTz, x20Var.AvO7iQsrTN > 0 ? 2 : -2);
    }

    public static float AvO7iQsrTN(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final boolean E7jCp8Ls(long j, long j2) {
        return j == j2;
    }

    public static final long EXrPz3p7hFb(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        b91[] b91VarArr = a91.Yi7zF1RB1;
        return floatToRawIntBits;
    }

    public static double EljAMC1QTz(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final vi0 GWasM1elztuh(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new vi0(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static boolean JFJ3QoxA(File file, InputStream inputStream) {
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
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final boolean M3K9sHhK(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static x20 MZhzXH72(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new x20(i, i2 - 1, 1);
        }
        x20 x20Var = x20.encWxUiV2;
        return x20.encWxUiV2;
    }

    public static v01 Mjvvu5DE(xh0 xh0Var) {
        xh0Var.getClass();
        return x01.EXrPz3p7hFb(xh0Var, new oh0(2));
    }

    public static final kt0 OOA6hdeuvCS(n50 n50Var, boolean z) {
        n50 iwATDS1i01k = iwATDS1i01k(n50Var);
        float DmJncFq5 = (int) (iwATDS1i01k.DmJncFq5() >> 32);
        float DmJncFq52 = (int) (iwATDS1i01k.DmJncFq5() & 4294967295L);
        kt0 eUH21U3apd = iwATDS1i01k.eUH21U3apd(n50Var, z);
        float f = eUH21U3apd.GWasM1elztuh;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > DmJncFq5) {
                f = DmJncFq5;
            }
        }
        float f2 = eUH21U3apd.Yi7zF1RB1;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > DmJncFq52) {
                f2 = DmJncFq52;
            }
        }
        float f3 = eUH21U3apd.X1lG3V04pd;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= DmJncFq5) {
                DmJncFq5 = f3;
            }
            f3 = DmJncFq5;
        }
        float f4 = eUH21U3apd.xqGvceK5x;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= DmJncFq52) {
                DmJncFq52 = f5;
            }
            f4 = DmJncFq52;
        }
        if (f == f3 || f2 == f4) {
            return kt0.OOA6hdeuvCS;
        }
        long AvO7iQsrTN = iwATDS1i01k.AvO7iQsrTN((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long AvO7iQsrTN2 = iwATDS1i01k.AvO7iQsrTN((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long AvO7iQsrTN3 = iwATDS1i01k.AvO7iQsrTN((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long AvO7iQsrTN4 = iwATDS1i01k.AvO7iQsrTN((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (AvO7iQsrTN >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (AvO7iQsrTN2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (AvO7iQsrTN4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (AvO7iQsrTN3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (AvO7iQsrTN & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (AvO7iQsrTN2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (AvO7iQsrTN4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (AvO7iQsrTN3 & 4294967295L));
        return new kt0(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final yw0 WIEu4Ya2g8(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            yw0 yw0Var = tag instanceof yw0 ? (yw0) tag : null;
            if (yw0Var != null) {
                return yw0Var;
            }
            Object mE4lRynR = d70.mE4lRynR(view);
            view = mE4lRynR instanceof View ? (View) mE4lRynR : null;
        }
        return null;
    }

    public static final long WRKkgoJXwDn(int i) {
        return EXrPz3p7hFb(i, 4294967296L);
    }

    public static final long WdrkLMV3xh(double d) {
        return EXrPz3p7hFb((float) d, 4294967296L);
    }

    public static final int X1lG3V04pd(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final float XnEVoBF0td1l(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final rq0 Y6hRI1cF8(View view) {
        rq0 rq0Var = (rq0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (rq0Var != null) {
            return rq0Var;
        }
        rq0 rq0Var2 = new rq0();
        view.setTag(R.id.pooling_container_listener_holder_tag, rq0Var2);
        return rq0Var2;
    }

    public static final long YZjbz8VdP5(String str, long j, long j2, long j3) {
        String str2;
        int i = p71.GWasM1elztuh;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long z19UFEN2I = i61.z19UFEN2I(str2);
        if (z19UFEN2I == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = z19UFEN2I.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final String Yi7zF1RB1(Object[] objArr, int i, int i2, pog2g9KITJA pog2g9kitja) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == pog2g9kitja) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String YmKjaVtbfp5Z(kp kpVar, int i) {
        kpVar.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = kpVar.GWasM1elztuh;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static File arNh8D4Z5gB(Context context) {
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

    public static final ArrayList cilMamHF(Bundle bundle, String str) {
        Class cls = st0.GWasM1elztuh(Bundle.class).GWasM1elztuh;
        cls.getClass();
        ArrayList Yi7zF1RB1 = Build.VERSION.SDK_INT >= 34 ? Qd9Q8OZgvOo4.Yi7zF1RB1(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (Yi7zF1RB1 != null) {
            return Yi7zF1RB1;
        }
        z50.cilMamHF(str);
        throw null;
    }

    public static int eUH21U3apd(int i, int i2, String str) {
        return (int) YZjbz8VdP5(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static int encWxUiV2(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final n50 iwATDS1i01k(n50 n50Var) {
        n50 n50Var2;
        n50 JFJ3QoxA = n50Var.JFJ3QoxA();
        while (true) {
            n50 n50Var3 = JFJ3QoxA;
            n50Var2 = n50Var;
            n50Var = n50Var3;
            if (n50Var == null) {
                break;
            }
            JFJ3QoxA = n50Var.JFJ3QoxA();
        }
        bk0 bk0Var = n50Var2 instanceof bk0 ? (bk0) n50Var2 : null;
        if (bk0Var == null) {
            return n50Var2;
        }
        bk0 bk0Var2 = bk0Var.Y6hRI1cF8;
        while (true) {
            bk0 bk0Var3 = bk0Var2;
            bk0 bk0Var4 = bk0Var;
            bk0Var = bk0Var3;
            if (bk0Var == null) {
                return bk0Var4;
            }
            bk0Var2 = bk0Var.Y6hRI1cF8;
        }
    }

    public static final y1 jivtDDk9H(gh ghVar) {
        y1 y1Var = (y1) ghVar.E7jCp8Ls(b9xEq24R1.z19UFEN2I);
        if (y1Var != null) {
            return y1Var;
        }
        o4.jivtDDk9H("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static MappedByteBuffer k8h8IjolWQ(Context context, Uri uri) {
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

    public static final wz0 lv06NcmrQ(Object obj) {
        if (obj != rj0.OOA6hdeuvCS) {
            return (wz0) obj;
        }
        o4.jivtDDk9H("Does not contain segment");
        return null;
    }

    public static final int mE4lRynR(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        z50.cilMamHF(str);
        throw null;
    }

    public static long mOu10nynGul(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static final void ozMwhSAI(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final boolean pog2g9KITJA(Object obj) {
        return obj == rj0.OOA6hdeuvCS;
    }

    public static final su0 rQPn8YBR(Throwable th) {
        th.getClass();
        return new su0(th);
    }

    public static final int uFEq9NpZ(int i, k80 k80Var, Object obj) {
        int Yi7zF1RB1;
        return (obj == null || k80Var.X1lG3V04pd() == 0 || (i < k80Var.X1lG3V04pd() && obj.equals(k80Var.xqGvceK5x(i))) || (Yi7zF1RB1 = k80Var.xqGvceK5x.Yi7zF1RB1(obj)) == -1) ? i : Yi7zF1RB1;
    }

    public static final kt0 xqGvceK5x(n50 n50Var) {
        n50 JFJ3QoxA = n50Var.JFJ3QoxA();
        return JFJ3QoxA != null ? JFJ3QoxA.eUH21U3apd(n50Var, true) : new kt0(0.0f, 0.0f, (int) (n50Var.DmJncFq5() >> 32), (int) (n50Var.DmJncFq5() & 4294967295L));
    }
}
