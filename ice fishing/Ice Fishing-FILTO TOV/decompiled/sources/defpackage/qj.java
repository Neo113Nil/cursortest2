package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class qj {
    public static final pp XnEVoBF0td1l;
    public static final pp iwATDS1i01k;
    public static final pp uFEq9NpZ;
    public static final n3 GWasM1elztuh = new n3(Float.POSITIVE_INFINITY);
    public static final o3 Yi7zF1RB1 = new o3(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final p3 X1lG3V04pd = new p3(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final q3 xqGvceK5x = new q3(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final n3 OOA6hdeuvCS = new n3(Float.NEGATIVE_INFINITY);
    public static final o3 EljAMC1QTz = new o3(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final p3 AvO7iQsrTN = new p3(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final q3 encWxUiV2 = new q3(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final jd mOu10nynGul = new jd(-1077159407, false, new pd(8));
    public static final jd JFJ3QoxA = new jd(1137976908, false, new pd(0));
    public static final jd rQPn8YBR = new jd(-237916000, false, new pd(9));
    public static final st E7jCp8Ls = new st(7);
    public static final vt WIEu4Ya2g8 = new vt(19);
    public static final Object YmKjaVtbfp5Z = new Object();

    static {
        int i = 1;
        XnEVoBF0td1l = new pp("REMOVED_TASK", i);
        uFEq9NpZ = new pp("CLOSED_EMPTY", i);
        iwATDS1i01k = new pp("NO_OWNER", i);
    }

    public static final float[] A1EKNP6CxJ(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final void AEn1Rrio(qx qxVar, lv lvVar) {
        lvVar.getClass();
        fb1.XnEVoBF0td1l(2, lvVar);
        lvVar.EljAMC1QTz(qxVar, 1);
    }

    public static gc AvO7iQsrTN(gc gcVar) {
        nf1 nf1Var = ki1.OOA6hdeuvCS;
        j6IIN2O8eOU j6iin2o8eou = j6IIN2O8eOU.AvO7iQsrTN;
        if (p.E7jCp8Ls(gcVar.Yi7zF1RB1, 12884901888L)) {
            gv0 gv0Var = (gv0) gcVar;
            nf1 nf1Var2 = gv0Var.xqGvceK5x;
            if (!uFEq9NpZ(nf1Var2, nf1Var)) {
                return new gv0(gv0Var.GWasM1elztuh, gv0Var.encWxUiV2, nf1Var, A1EKNP6CxJ(E7jCp8Ls((float[]) j6iin2o8eou.EljAMC1QTz, nf1Var2.GWasM1elztuh(), nf1Var.GWasM1elztuh()), gv0Var.mOu10nynGul), gv0Var.rQPn8YBR, gv0Var.uFEq9NpZ, gv0Var.OOA6hdeuvCS, gv0Var.EljAMC1QTz, gv0Var.AvO7iQsrTN, -1);
            }
        }
        return gcVar;
    }

    public static final ie0 CMh55RymNfS(boolean z, tf0 tf0Var, boolean z2, ov0 ov0Var, hv hvVar) {
        return ce0.GWasM1elztuh.X1lG3V04pd(new t91(z, tf0Var, z2, ov0Var, hvVar));
    }

    public static final boolean DmJncFq5(p41 p41Var, hv hvVar) {
        int i;
        EXrPz3p7hFb eXrPz3p7hFb;
        Object mOu10nynGul2;
        y31 JFJ3QoxA2;
        boolean JFJ3QoxA3;
        do {
            synchronized (YmKjaVtbfp5Z) {
                r51 r51Var = p41Var.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            op0 EljAMC1QTz2 = eXrPz3p7hFb.EljAMC1QTz();
            mOu10nynGul2 = hvVar.mOu10nynGul(EljAMC1QTz2);
            EXrPz3p7hFb X1lG3V04pd2 = EljAMC1QTz2.X1lG3V04pd();
            if (o30.rQPn8YBR(X1lG3V04pd2, eXrPz3p7hFb)) {
                break;
            }
            r51 r51Var3 = p41Var.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA2 = e41.JFJ3QoxA();
                JFJ3QoxA3 = JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, p41Var, JFJ3QoxA2), i, X1lG3V04pd2, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA2, p41Var);
        } while (!JFJ3QoxA3);
        return ((Boolean) mOu10nynGul2).booleanValue();
    }

    public static final float[] E7jCp8Ls(float[] fArr, float[] fArr2, float[] fArr3) {
        MZhzXH72(fArr, fArr2);
        MZhzXH72(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] ozMwhSAI = ozMwhSAI(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return A1EKNP6CxJ(ozMwhSAI, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final int EXrPz3p7hFb(p41 p41Var) {
        r51 r51Var = p41Var.OOA6hdeuvCS;
        r51Var.getClass();
        return ((r51) e41.encWxUiV2(r51Var)).OOA6hdeuvCS;
    }

    public static final void EljAMC1QTz(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static g2 GWasM1elztuh(float f) {
        return new g2(Float.valueOf(f), vc0.mOu10nynGul, Float.valueOf(0.01f), 8);
    }

    public static void HFYAaqMd6(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J3Xc8BaqpN8(Context context, Executor executor, fs0 fs0Var, boolean z) {
        boolean z2;
        ?? r7;
        pl[] plVarArr;
        pl[] plVarArr2;
        pl[] plVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        ol olVar;
        boolean z8;
        FileInputStream GWasM1elztuh2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                fs0Var.EljAMC1QTz(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        js0.X1lG3V04pd(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = n30.rQPn8YBR;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            ol olVar2 = new ol(assets, executor, fs0Var, name, file2);
            byte[] bArr3 = olVar2.X1lG3V04pd;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        olVar2.Yi7zF1RB1(4, null);
                    }
                    olVar2.EljAMC1QTz = true;
                    try {
                        try {
                            r7 = olVar2.GWasM1elztuh(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            fs0Var.EljAMC1QTz(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            plVarArr2 = olVar2.AvO7iQsrTN;
                            if (plVarArr2 != null) {
                            }
                            fs0 fs0Var2 = olVar2.Yi7zF1RB1;
                            plVarArr3 = olVar2.AvO7iQsrTN;
                            byte[] bArr4 = olVar2.X1lG3V04pd;
                            boolean z11 = r7;
                            z11 = r7;
                            if (plVarArr3 != null) {
                            }
                            bArr = olVar2.encWxUiV2;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                        } catch (IOException e2) {
                            fs0Var.EljAMC1QTz(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            plVarArr2 = olVar2.AvO7iQsrTN;
                            if (plVarArr2 != null) {
                            }
                            fs0 fs0Var22 = olVar2.Yi7zF1RB1;
                            plVarArr3 = olVar2.AvO7iQsrTN;
                            byte[] bArr42 = olVar2.X1lG3V04pd;
                            boolean z112 = r7;
                            z112 = r7;
                            if (plVarArr3 != null) {
                            }
                            bArr = olVar2.encWxUiV2;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e3) {
                                    fs0Var.EljAMC1QTz(8, e3);
                                    try {
                                        r7.close();
                                    } catch (IOException e4) {
                                        fs0Var.EljAMC1QTz(7, e4);
                                    }
                                    plVarArr = null;
                                    olVar2.AvO7iQsrTN = plVarArr;
                                    plVarArr2 = olVar2.AvO7iQsrTN;
                                    if (plVarArr2 != null) {
                                    }
                                    fs0 fs0Var222 = olVar2.Yi7zF1RB1;
                                    plVarArr3 = olVar2.AvO7iQsrTN;
                                    byte[] bArr422 = olVar2.X1lG3V04pd;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (plVarArr3 != null) {
                                    }
                                    bArr = olVar2.encWxUiV2;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e5) {
                                fs0Var.EljAMC1QTz(7, e5);
                                r7.close();
                                plVarArr = null;
                                olVar2.AvO7iQsrTN = plVarArr;
                                plVarArr2 = olVar2.AvO7iQsrTN;
                                if (plVarArr2 != null) {
                                }
                                fs0 fs0Var2222 = olVar2.Yi7zF1RB1;
                                plVarArr3 = olVar2.AvO7iQsrTN;
                                byte[] bArr4222 = olVar2.X1lG3V04pd;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (plVarArr3 != null) {
                                }
                                bArr = olVar2.encWxUiV2;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, fb1.z19UFEN2I(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            plVarArr = n30.CMh55RymNfS(r7, fb1.z19UFEN2I(r7, 4), olVar2.OOA6hdeuvCS);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                fs0Var.EljAMC1QTz(7, e6);
                            }
                            olVar2.AvO7iQsrTN = plVarArr;
                        }
                        plVarArr2 = olVar2.AvO7iQsrTN;
                        if (plVarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                GWasM1elztuh2 = olVar2.GWasM1elztuh(assets, "dexopt/baseline.profm");
                                z8 = r7;
                            } catch (FileNotFoundException e7) {
                                fs0Var.EljAMC1QTz(9, e7);
                                z8 = r7;
                            } catch (IOException e8) {
                                fs0Var.EljAMC1QTz(7, e8);
                                z8 = r7;
                            } catch (IllegalStateException e9) {
                                olVar2.AvO7iQsrTN = null;
                                fs0Var.EljAMC1QTz(8, e9);
                                z8 = r7;
                            }
                            if (GWasM1elztuh2 == null) {
                                try {
                                    if (!Arrays.equals(n30.E7jCp8Ls, fb1.z19UFEN2I(GWasM1elztuh2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] z19UFEN2I = fb1.z19UFEN2I(GWasM1elztuh2, 4);
                                    olVar2.AvO7iQsrTN = n30.VeqTn1PQw7(GWasM1elztuh2, z19UFEN2I, bArr3, plVarArr2);
                                    GWasM1elztuh2.close();
                                    olVar = olVar2;
                                    r7 = z19UFEN2I;
                                    if (olVar != null) {
                                        olVar2 = olVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (GWasM1elztuh2 != null) {
                                    GWasM1elztuh2.close();
                                    z8 = r7;
                                }
                                olVar = null;
                                r7 = z8;
                                if (olVar != null) {
                                }
                            }
                        }
                        fs0 fs0Var22222 = olVar2.Yi7zF1RB1;
                        plVarArr3 = olVar2.AvO7iQsrTN;
                        byte[] bArr42222 = olVar2.X1lG3V04pd;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (plVarArr3 != null && bArr42222 != null) {
                            r72 = olVar2.EljAMC1QTz;
                            if (r72 != 0) {
                                o4.jivtDDk9H("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                fs0Var22222.EljAMC1QTz(7, e10);
                                z7 = r72;
                            } catch (IllegalStateException e11) {
                                fs0Var22222.EljAMC1QTz(8, e11);
                                z7 = r72;
                            }
                            if (n30.Fm8W7vP7q(r72, bArr42222, plVarArr3)) {
                                olVar2.encWxUiV2 = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                olVar2.AvO7iQsrTN = null;
                                z112222 = z7;
                            } else {
                                fs0Var22222.EljAMC1QTz(5, null);
                                olVar2.AvO7iQsrTN = null;
                                r72.close();
                                z112222 = r72;
                            }
                        }
                        bArr = olVar2.encWxUiV2;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!olVar2.EljAMC1QTz) {
                                    o4.jivtDDk9H("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(olVar2.xqGvceK5x);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                olVar2.Yi7zF1RB1(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                olVar2.encWxUiV2 = null;
                                                                                olVar2.AvO7iQsrTN = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        olVar2.Yi7zF1RB1(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e13) {
                                        e = e13;
                                        olVar2.Yi7zF1RB1(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    z112222 = true;
                                    olVar2.Yi7zF1RB1(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                                } catch (IOException e15) {
                                    e = e15;
                                    z112222 = true;
                                    olVar2.Yi7zF1RB1(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                olVar2.encWxUiV2 = null;
                                olVar2.AvO7iQsrTN = null;
                            }
                        }
                        if (z4) {
                            HFYAaqMd6(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            olVar2.Yi7zF1RB1(4, null);
                        }
                        olVar2.EljAMC1QTz = true;
                        r7 = olVar2.GWasM1elztuh(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        plVarArr2 = olVar2.AvO7iQsrTN;
                        if (plVarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            GWasM1elztuh2 = olVar2.GWasM1elztuh(assets, "dexopt/baseline.profm");
                            z8 = r7;
                            if (GWasM1elztuh2 == null) {
                            }
                        }
                        fs0 fs0Var222222 = olVar2.Yi7zF1RB1;
                        plVarArr3 = olVar2.AvO7iQsrTN;
                        byte[] bArr422222 = olVar2.X1lG3V04pd;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (plVarArr3 != null) {
                            r72 = olVar2.EljAMC1QTz;
                            if (r72 != 0) {
                            }
                        }
                        bArr = olVar2.encWxUiV2;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        olVar2.Yi7zF1RB1(4, null);
                    }
                }
                js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
            }
            olVar2.Yi7zF1RB1(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            js0.X1lG3V04pd(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e16) {
            fs0Var.EljAMC1QTz(7, e16);
            js0.X1lG3V04pd(context, false);
        }
    }

    public static final boolean JFJ3QoxA(r51 r51Var, int i, EXrPz3p7hFb eXrPz3p7hFb, boolean z) {
        boolean z2;
        synchronized (YmKjaVtbfp5Z) {
            try {
                int i2 = r51Var.xqGvceK5x;
                if (i2 == i) {
                    r51Var.X1lG3V04pd = eXrPz3p7hFb;
                    z2 = true;
                    if (z) {
                        r51Var.OOA6hdeuvCS++;
                    }
                    r51Var.xqGvceK5x = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final r51 M3K9sHhK(p41 p41Var) {
        r51 r51Var = p41Var.OOA6hdeuvCS;
        r51Var.getClass();
        return (r51) e41.jivtDDk9H(r51Var, p41Var);
    }

    public static final int MItybXapHX(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final float[] MZhzXH72(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static final rt Mjvvu5DE(rt rtVar) {
        rt EljAMC1QTz2 = ((nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner()).EljAMC1QTz();
        if (EljAMC1QTz2 == null || !EljAMC1QTz2.Mjvvu5DE) {
            return null;
        }
        return EljAMC1QTz2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OOA6hdeuvCS(wu wuVar, ie0 ie0Var, boolean z, z11 z11Var, t8 t8Var, nn0 nn0Var, jd jdVar, qx qxVar, int i, int i2) {
        t8 t8Var2;
        int i3;
        int i4;
        ie0 ie0Var2;
        boolean z2;
        z11 z11Var2;
        nn0 nn0Var2;
        t8 t8Var3;
        at0 Mjvvu5DE;
        z11 GWasM1elztuh2;
        int i5;
        t8 t8Var4;
        int i6;
        ie0 ie0Var3;
        t8 t8Var5;
        nn0 nn0Var3;
        boolean z3;
        qxVar.Uxq83abb04(-1061374109);
        int i7 = i | (qxVar.encWxUiV2(wuVar) ? 4 : 2) | 1456;
        if ((i2 & 16) == 0) {
            t8Var2 = t8Var;
            if (qxVar.EljAMC1QTz(t8Var2)) {
                i3 = 16384;
                i4 = i7 | i3 | 115015680;
                if (qxVar.dqB83aoLBB(i4 & 1, (306783379 & i4) == 306783378)) {
                    qxVar.YXi2hvwn7WL();
                    ie0Var2 = ie0Var;
                    z2 = z;
                    z11Var2 = z11Var;
                    nn0Var2 = nn0Var;
                    t8Var3 = t8Var2;
                } else {
                    qxVar.qugwajBSa59j();
                    if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                        nn0 nn0Var4 = u8.GWasM1elztuh;
                        GWasM1elztuh2 = e21.GWasM1elztuh(n30.GWasM1elztuh, qxVar);
                        int i8 = i4 & (-7169);
                        if ((i2 & 16) != 0) {
                            dc dcVar = (dc) qxVar.JFJ3QoxA(fc.GWasM1elztuh);
                            t8Var4 = dcVar.MjxSquD6Av;
                            if (t8Var4 == null) {
                                long j = yb.EljAMC1QTz;
                                t8 t8Var6 = new t8(j, fc.Yi7zF1RB1(dcVar, ec.XnEVoBF0td1l), j, yb.Yi7zF1RB1(ki1.WIEu4Ya2g8, fc.Yi7zF1RB1(dcVar, ki1.iwATDS1i01k)));
                                dcVar.MjxSquD6Av = t8Var6;
                                t8Var4 = t8Var6;
                            }
                            i5 = i4 & (-64513);
                        } else {
                            i5 = i8;
                            t8Var4 = t8Var2;
                        }
                        nn0 nn0Var5 = u8.GWasM1elztuh;
                        i6 = i5;
                        ie0Var3 = fe0.GWasM1elztuh;
                        t8Var5 = t8Var4;
                        nn0Var3 = nn0Var5;
                        z3 = true;
                    } else {
                        qxVar.YXi2hvwn7WL();
                        int i9 = i4 & (-7169);
                        if ((i2 & 16) != 0) {
                            i9 = i4 & (-64513);
                        }
                        ie0Var3 = ie0Var;
                        nn0Var3 = nn0Var;
                        t8Var5 = t8Var2;
                        i6 = i9;
                        z3 = z;
                        GWasM1elztuh2 = z11Var;
                    }
                    qxVar.YmKjaVtbfp5Z();
                    X1lG3V04pd(wuVar, ie0Var3, z3, GWasM1elztuh2, t8Var5, null, nn0Var3, jdVar, qxVar, i6 & 2147483646);
                    z11Var2 = GWasM1elztuh2;
                    nn0Var2 = nn0Var3;
                    ie0Var2 = ie0Var3;
                    t8Var3 = t8Var5;
                    z2 = z3;
                }
                Mjvvu5DE = qxVar.Mjvvu5DE();
                if (Mjvvu5DE == null) {
                    Mjvvu5DE.xqGvceK5x = new x8(wuVar, ie0Var2, z2, z11Var2, t8Var3, nn0Var2, jdVar, i, i2);
                    return;
                }
                return;
            }
        } else {
            t8Var2 = t8Var;
        }
        i3 = 8192;
        i4 = i7 | i3 | 115015680;
        if (qxVar.dqB83aoLBB(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE == null) {
        }
    }

    public static final by0 TpUsjqg3bxO(qx qxVar) {
        Object[] objArr = new Object[0];
        boolean xqGvceK5x2 = qxVar.xqGvceK5x(0);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (xqGvceK5x2 || HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = new mw0(1);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        return (by0) d70.AEn1Rrio(objArr, by0.JFJ3QoxA, (wu) HFYAaqMd6, qxVar, 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String VeqTn1PQw7(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final bg WIEu4Ya2g8(gc gcVar, gc gcVar2) {
        return gcVar == gcVar2 ? new zf(gcVar, gcVar, 1) : (p.E7jCp8Ls(gcVar.Yi7zF1RB1, 12884901888L) && p.E7jCp8Ls(gcVar2.Yi7zF1RB1, 12884901888L)) ? new ag((gv0) gcVar, (gv0) gcVar2) : new bg(gcVar, gcVar2, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class WRKkgoJXwDn(va vaVar) {
        vaVar.getClass();
        Class cls = vaVar.GWasM1elztuh;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static final String WdrkLMV3xh(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void X1lG3V04pd(wu wuVar, ie0 ie0Var, boolean z, z11 z11Var, t8 t8Var, p pVar, nn0 nn0Var, jd jdVar, qx qxVar, int i) {
        int i2;
        z11 z11Var2;
        qxVar.Uxq83abb04(-1310015664);
        if ((i & 6) == 0) {
            i2 = (qxVar.encWxUiV2(wuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(ie0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.AvO7iQsrTN(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z11Var2 = z11Var;
            i2 |= qxVar.EljAMC1QTz(z11Var2) ? 2048 : 1024;
        } else {
            z11Var2 = z11Var;
        }
        if ((i & 24576) == 0) {
            i2 |= qxVar.EljAMC1QTz(t8Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= qxVar.EljAMC1QTz(pVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= qxVar.EljAMC1QTz(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= qxVar.EljAMC1QTz(nn0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= qxVar.EljAMC1QTz(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= qxVar.encWxUiV2(jdVar) ? 536870912 : 268435456;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (306783379 & i2) != 306783378)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) != 0 && !qxVar.WRKkgoJXwDn()) {
                qxVar.YXi2hvwn7WL();
            }
            qxVar.YmKjaVtbfp5Z();
            qxVar.MjxSquD6Av(1691738187);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = new tf0();
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            tf0 tf0Var = (tf0) HFYAaqMd6;
            qxVar.WIEu4Ya2g8(false);
            long j = z ? t8Var.GWasM1elztuh : t8Var.X1lG3V04pd;
            long j2 = z ? t8Var.Yi7zF1RB1 : t8Var.xqGvceK5x;
            qxVar.MjxSquD6Av(1691921830);
            qxVar.WIEu4Ya2g8(false);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (HFYAaqMd62 == k61Var) {
                HFYAaqMd62 = new bCsSzSHkbaQ(12);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            y61.Yi7zF1RB1(wuVar, a01.GWasM1elztuh(ie0Var, (hv) HFYAaqMd62), z, z11Var2, j, j2, 0.0f, tf0Var, rj0.YZjbz8VdP5(-535639973, new z8(j2, nn0Var, jdVar), qxVar), qxVar, (i2 & 8078) | ((i2 << 6) & 234881024), 64);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new x8(wuVar, ie0Var, z, z11Var, t8Var, pVar, nn0Var, jdVar, i);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String XnEVoBF0td1l(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final kt0 Y6hRI1cF8(rt rtVar) {
        bk0 bk0Var;
        if (rtVar.Mjvvu5DE && (bk0Var = rtVar.E7jCp8Ls) != null) {
            n50 iwATDS1i01k2 = o50.iwATDS1i01k(bk0Var);
            if (!iwATDS1i01k2.ozMwhSAI()) {
                iwATDS1i01k2 = null;
            }
            if (iwATDS1i01k2 != null) {
                return rtVar.Hc2GqxcqBiX(iwATDS1i01k2);
            }
        }
        return kt0.OOA6hdeuvCS;
    }

    public static String YXi2hvwn7WL(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + fb1.ZCWXqiC0(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + fb1.ZCWXqiC0(Float.intBitsToFloat(i)) + ", " + fb1.ZCWXqiC0(Float.intBitsToFloat(i2)) + ')';
    }

    public static final boolean YZjbz8VdP5(rt rtVar) {
        g60 g60Var;
        bk0 bk0Var;
        g60 g60Var2;
        bk0 bk0Var2 = rtVar.E7jCp8Ls;
        return (bk0Var2 == null || (g60Var = bk0Var2.mE4lRynR) == null || !g60Var.A1EKNP6CxJ() || (bk0Var = rtVar.E7jCp8Ls) == null || (g60Var2 = bk0Var.mE4lRynR) == null || !g60Var2.eUH21U3apd()) ? false : true;
    }

    public static final void Yi7zF1RB1(hi0 hi0Var, qx qxVar, int i) {
        hi0 hi0Var2;
        qxVar.Uxq83abb04(850457541);
        int i2 = i | 2;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 3) != 2)) {
            qxVar.qugwajBSa59j();
            int i6 = i & 1;
            int i7 = 6;
            Object obj = ue.GWasM1elztuh;
            if (i6 == 0 || qxVar.WRKkgoJXwDn()) {
                Context context = (Context) qxVar.JFJ3QoxA(r.Yi7zF1RB1);
                Object[] copyOf = Arrays.copyOf(new ej0[0], 0);
                d dVar = new d(19, new pd(21), new c50(context, i5));
                boolean encWxUiV22 = qxVar.encWxUiV2(context);
                Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                if (encWxUiV22 || HFYAaqMd6 == obj) {
                    HFYAaqMd6 = new o1(i7, context);
                    qxVar.dcDmLGVhzWm(HFYAaqMd6);
                }
                hi0Var2 = (hi0) d70.YZjbz8VdP5(copyOf, dVar, (wu) HFYAaqMd6, qxVar, 0, 4);
            } else {
                qxVar.YXi2hvwn7WL();
                hi0Var2 = hi0Var;
            }
            qxVar.YmKjaVtbfp5Z();
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (HFYAaqMd62 == obj) {
                HFYAaqMd62 = new bCsSzSHkbaQ(i4);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            hv hvVar = (hv) HFYAaqMd62;
            Object HFYAaqMd63 = qxVar.HFYAaqMd6();
            int i8 = 3;
            if (HFYAaqMd63 == obj) {
                HFYAaqMd63 = new bCsSzSHkbaQ(i8);
                qxVar.dcDmLGVhzWm(HFYAaqMd63);
            }
            hv hvVar2 = (hv) HFYAaqMd63;
            Object HFYAaqMd64 = qxVar.HFYAaqMd6();
            if (HFYAaqMd64 == obj) {
                HFYAaqMd64 = new bCsSzSHkbaQ(i7);
                qxVar.dcDmLGVhzWm(HFYAaqMd64);
            }
            hv hvVar3 = (hv) HFYAaqMd64;
            Object HFYAaqMd65 = qxVar.HFYAaqMd6();
            if (HFYAaqMd65 == obj) {
                HFYAaqMd65 = new bCsSzSHkbaQ(7);
                qxVar.dcDmLGVhzWm(HFYAaqMd65);
            }
            hv hvVar4 = (hv) HFYAaqMd65;
            boolean encWxUiV23 = qxVar.encWxUiV2(hi0Var2);
            Object HFYAaqMd66 = qxVar.HFYAaqMd6();
            if (encWxUiV23 || HFYAaqMd66 == obj) {
                HFYAaqMd66 = new i4(hi0Var2, i8);
                qxVar.dcDmLGVhzWm(HFYAaqMd66);
            }
            l60.X1lG3V04pd(hi0Var2, null, null, hvVar, hvVar2, hvVar3, hvVar4, (hv) HFYAaqMd66, qxVar, 115015728);
        } else {
            qxVar.YXi2hvwn7WL();
            hi0Var2 = hi0Var;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new k4(i, i3, hi0Var2);
        }
    }

    public static final boolean YmKjaVtbfp5Z(long j, long j2) {
        return j == j2;
    }

    public static final Object arNh8D4Z5gB(wc0 wc0Var) {
        Object encWxUiV22 = wc0Var.encWxUiV2();
        t50 t50Var = encWxUiV22 instanceof t50 ? (t50) encWxUiV22 : null;
        if (t50Var != null) {
            return t50Var.mE4lRynR;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final rt cilMamHF(rt rtVar) {
        boolean z = rtVar.OOA6hdeuvCS.Mjvvu5DE;
        if (z) {
            if (!z) {
                t10.Yi7zF1RB1("visitChildren called on an unattached node");
            }
            rg0 rg0Var = new rg0(new he0[16]);
            he0 he0Var = rtVar.OOA6hdeuvCS;
            he0 he0Var2 = he0Var.JFJ3QoxA;
            if (he0Var2 == null) {
                vc0.mOu10nynGul(rg0Var, he0Var);
            } else {
                rg0Var.Yi7zF1RB1(he0Var2);
            }
            loop0: while (true) {
                int i = rg0Var.AvO7iQsrTN;
                if (i == 0) {
                    break;
                }
                he0 he0Var3 = (he0) rg0Var.rQPn8YBR(i - 1);
                if ((he0Var3.encWxUiV2 & 1024) == 0) {
                    vc0.mOu10nynGul(rg0Var, he0Var3);
                } else {
                    while (true) {
                        if (he0Var3 == null) {
                            break;
                        }
                        if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                            rg0 rg0Var2 = null;
                            while (he0Var3 != null) {
                                if (he0Var3 instanceof rt) {
                                    rt rtVar2 = (rt) he0Var3;
                                    if (rtVar2.OOA6hdeuvCS.Mjvvu5DE) {
                                        int ordinal = rtVar2.bfDgRvRIg().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            o4.xqGvceK5x();
                                            return null;
                                        }
                                    }
                                } else if ((he0Var3.AvO7iQsrTN & 1024) != 0 && (he0Var3 instanceof yk)) {
                                    int i2 = 0;
                                    for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                        if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                he0Var3 = he0Var4;
                                            } else {
                                                if (rg0Var2 == null) {
                                                    rg0Var2 = new rg0(new he0[16]);
                                                }
                                                if (he0Var3 != null) {
                                                    rg0Var2.Yi7zF1RB1(he0Var3);
                                                    he0Var3 = null;
                                                }
                                                rg0Var2.Yi7zF1RB1(he0Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                he0Var3 = vc0.E7jCp8Ls(rg0Var2);
                            }
                        } else {
                            he0Var3 = he0Var3.JFJ3QoxA;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final long dqB83aoLBB(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final ie0 eUH21U3apd(String str) {
        return new s50(str);
    }

    public static final void encWxUiV2(SyyZR548qbcW syyZR548qbcW, d01 d01Var) {
        zz0 zz0Var = d01Var.xqGvceK5x;
        hg0 hg0Var = zz0Var.OOA6hdeuvCS;
        Object AvO7iQsrTN2 = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(h01.WRKkgoJXwDn);
        if (AvO7iQsrTN2 == null) {
            AvO7iQsrTN2 = null;
        }
        ov0 ov0Var = (ov0) AvO7iQsrTN2;
        if (n30.encWxUiV2(d01Var)) {
            if (ov0Var != null && ov0Var.GWasM1elztuh == 8) {
                return;
            }
            Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(yz0.WdrkLMV3xh);
            if (AvO7iQsrTN3 == null) {
                AvO7iQsrTN3 = null;
            }
            VeqTn1PQw7 veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN3;
            if (veqTn1PQw7 != null) {
                syyZR548qbcW.GWasM1elztuh(new EDwNPVYuViP0(null, R.id.accessibilityActionPageUp, veqTn1PQw7.GWasM1elztuh, null));
            }
            Object AvO7iQsrTN4 = hg0Var.AvO7iQsrTN(yz0.arNh8D4Z5gB);
            if (AvO7iQsrTN4 == null) {
                AvO7iQsrTN4 = null;
            }
            VeqTn1PQw7 veqTn1PQw72 = (VeqTn1PQw7) AvO7iQsrTN4;
            if (veqTn1PQw72 != null) {
                syyZR548qbcW.GWasM1elztuh(new EDwNPVYuViP0(null, R.id.accessibilityActionPageDown, veqTn1PQw72.GWasM1elztuh, null));
            }
            Object AvO7iQsrTN5 = hg0Var.AvO7iQsrTN(yz0.WRKkgoJXwDn);
            if (AvO7iQsrTN5 == null) {
                AvO7iQsrTN5 = null;
            }
            VeqTn1PQw7 veqTn1PQw73 = (VeqTn1PQw7) AvO7iQsrTN5;
            if (veqTn1PQw73 != null) {
                syyZR548qbcW.GWasM1elztuh(new EDwNPVYuViP0(null, R.id.accessibilityActionPageLeft, veqTn1PQw73.GWasM1elztuh, null));
            }
            Object AvO7iQsrTN6 = hg0Var.AvO7iQsrTN(yz0.pog2g9KITJA);
            if (AvO7iQsrTN6 == null) {
                AvO7iQsrTN6 = null;
            }
            VeqTn1PQw7 veqTn1PQw74 = (VeqTn1PQw7) AvO7iQsrTN6;
            if (veqTn1PQw74 != null) {
                syyZR548qbcW.GWasM1elztuh(new EDwNPVYuViP0(null, R.id.accessibilityActionPageRight, veqTn1PQw74.GWasM1elztuh, null));
            }
        }
    }

    public static Handler iwATDS1i01k(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return nm.GWasM1elztuh(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final View jivtDDk9H(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(mE4lRynR(view, com.combinations.level.experts.R.id.view_tree_lifecycle_owner), mE4lRynR(view, com.combinations.level.experts.R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (lv06NcmrQ(view) == null) {
                i++;
                Object mE4lRynR = d70.mE4lRynR(view);
                View view4 = view2;
                view2 = view;
                view = mE4lRynR instanceof View ? (View) mE4lRynR : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tv0 k8h8IjolWQ(Display display, int i) {
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
                        o4.mE4lRynR(mr0.AvO7iQsrTN("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new tv0(i2, radius, center);
    }

    public static final se lv06NcmrQ(View view) {
        Object tag = view.getTag(com.combinations.level.experts.R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (se) weakReference.get();
        }
        return null;
    }

    public static final int mE4lRynR(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object mE4lRynR = d70.mE4lRynR(view);
            view = mE4lRynR instanceof View ? (View) mE4lRynR : null;
        }
        return i3;
    }

    public static final float[] ozMwhSAI(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final Paint pog2g9KITJA(a1 a1Var) {
        if (a1Var == null) {
            s10.GWasM1elztuh("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + st0.GWasM1elztuh(a1Var.getClass()).GWasM1elztuh());
        }
        return (Paint) a1Var.Yi7zF1RB1;
    }

    public static ie0 qugwajBSa59j(ie0 ie0Var, by0 by0Var) {
        return ie0Var.X1lG3V04pd(n30.WIEu4Ya2g8(fe0.GWasM1elztuh, tz.X1lG3V04pd)).X1lG3V04pd(new cy0(null, null, by0Var.xqGvceK5x, xm0.OOA6hdeuvCS, by0Var, true, true)).X1lG3V04pd(new qy0(by0Var));
    }

    public static void rQPn8YBR(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            o4.mE4lRynR(mr0.mOu10nynGul("fromIndex: ", i, " > toIndex: ", i2));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static final long rezfBrjOrqK(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final boolean uFEq9NpZ(nf1 nf1Var, nf1 nf1Var2) {
        if (nf1Var == nf1Var2) {
            return true;
        }
        return Math.abs(nf1Var.GWasM1elztuh - nf1Var2.GWasM1elztuh) < 0.001f && Math.abs(nf1Var.Yi7zF1RB1 - nf1Var2.Yi7zF1RB1) < 0.001f;
    }

    public static final a1 xqGvceK5x() {
        return new a1(new Paint(7));
    }

    public static final String z19UFEN2I(vg vgVar) {
        Object su0Var;
        if (vgVar instanceof im) {
            return ((im) vgVar).toString();
        }
        try {
            su0Var = vgVar + '@' + WdrkLMV3xh(vgVar);
        } catch (Throwable th) {
            su0Var = new su0(th);
        }
        if (tu0.GWasM1elztuh(su0Var) != null) {
            su0Var = vgVar.getClass().getName() + '@' + WdrkLMV3xh(vgVar);
        }
        return (String) su0Var;
    }

    public abstract void mOu10nynGul(float f, long j, a1 a1Var);
}
