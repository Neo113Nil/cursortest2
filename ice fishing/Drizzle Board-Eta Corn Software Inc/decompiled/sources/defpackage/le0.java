package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class le0 {
    public static ExecutorService NCTxEWno;
    public static final /* synthetic */ int k3x7lurq = 0;
    public static final /* synthetic */ int ow5vqvCr = 0;
    public static final Object qoPGr6Ce = new Object();
    public static final int[] MdtA4re8 = new int[0];
    public static final Object[] wxUZMvaN = new Object[0];
    public static final String[] VgvYg0wo = new String[0];
    public static final int[] P7K7Inc8 = {R.attr.theme, com.kolosta.rejin.jilosa.R.attr.theme};
    public static final int[] b2ZJblxo = {com.kolosta.rejin.jilosa.R.attr.materialThemeOverlay};
    public static final re Qr9iLBAD = new re(28);
    public static final lf jb9XjC4I = new lf("NO_VALUE", 1);
    public static final k00 eVhOlqcC = new k00(11);

    public static boolean DK9slbsy(Context context) {
        ((la) ((qi) ra.OxcuoDLp(context, qi.class))).getClass();
        Set set = Collections.EMPTY_SET;
        ej0.P7K7Inc8(set.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (set.isEmpty()) {
            return true;
        }
        return ((Boolean) set.iterator().next()).booleanValue();
    }

    public static Intent Ey6iv0m0(Context context, ComponentName componentName) {
        String I5GHvsYW = I5GHvsYW(context, componentName);
        if (I5GHvsYW == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), I5GHvsYW);
        return I5GHvsYW(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long FXJmAAN1(long j, ie ieVar) {
        long j2;
        TimeUnit timeUnit = ieVar.NCTxEWno;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            long convert2 = timeUnit2.convert(j, timeUnit);
            re reVar = ge.NCTxEWno;
            long j3 = convert2 << 1;
            int i = he.qoPGr6Ce;
            return j3;
        }
        if (ieVar.compareTo(ie.MILLISECONDS) < 0) {
            return ygLcUYwZ(w30.eVhOlqcC(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long abs = Math.abs(j);
        int ordinal = ieVar.ordinal();
        long j4 = 0;
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                m1.P7K7Inc8(ieVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (abs != 0) {
            j4 = 4611686018427387903L;
            if (abs == 1) {
                if (j2 <= 4611686018427387903L) {
                    abs = j2;
                    return ygLcUYwZ(signum * abs);
                }
            } else if (j2 != 1) {
                int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(abs)) - Long.numberOfLeadingZeros(j2);
                if (numberOfLeadingZeros < 63) {
                    abs *= j2;
                } else if (numberOfLeadingZeros <= 63) {
                    abs *= j2;
                }
                return ygLcUYwZ(signum * abs);
            }
        }
        abs = j4;
        return ygLcUYwZ(signum * abs);
    }

    public static final t5 FySoLYna(ng0 ng0Var) {
        t5 t5Var;
        ng0Var.getClass();
        synchronized (eVhOlqcC) {
            t5Var = (t5) ng0Var.MdtA4re8("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (t5Var == null) {
                l9 l9Var = uf.NCTxEWno;
                try {
                    hb hbVar = ed.qoPGr6Ce;
                    l9Var = qq.qoPGr6Ce.P7K7Inc8;
                } catch (IllegalStateException | kw unused) {
                }
                t5 t5Var2 = new t5(l9Var.eVhOlqcC(new na0(null)));
                ng0Var.qoPGr6Ce("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", t5Var2);
                t5Var = t5Var2;
            }
        }
        return t5Var;
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
    public static void HdOGZAzC(Context context, Executor executor, j00 j00Var, boolean z) {
        boolean z2;
        ?? r7;
        hc[] hcVarArr;
        hc[] hcVarArr2;
        hc[] hcVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        gc gcVar;
        boolean z8;
        FileInputStream qoPGr6Ce2;
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
                                j00Var.OnDfzHZD(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        m00.MdtA4re8(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = ej0.eVhOlqcC;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            gc gcVar2 = new gc(assets, executor, j00Var, name, file2);
            byte[] bArr3 = gcVar2.MdtA4re8;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        gcVar2.NCTxEWno(4, null);
                    }
                    gcVar2.P7K7Inc8 = true;
                    try {
                        try {
                            r7 = gcVar2.qoPGr6Ce(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            j00Var.OnDfzHZD(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            hcVarArr2 = gcVar2.b2ZJblxo;
                            if (hcVarArr2 != null) {
                            }
                            j00 j00Var2 = gcVar2.NCTxEWno;
                            hcVarArr3 = gcVar2.b2ZJblxo;
                            byte[] bArr4 = gcVar2.MdtA4re8;
                            boolean z11 = r7;
                            z11 = r7;
                            if (hcVarArr3 != null) {
                            }
                            bArr = gcVar2.Qr9iLBAD;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                        } catch (IOException e2) {
                            j00Var.OnDfzHZD(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            hcVarArr2 = gcVar2.b2ZJblxo;
                            if (hcVarArr2 != null) {
                            }
                            j00 j00Var22 = gcVar2.NCTxEWno;
                            hcVarArr3 = gcVar2.b2ZJblxo;
                            byte[] bArr42 = gcVar2.MdtA4re8;
                            boolean z112 = r7;
                            z112 = r7;
                            if (hcVarArr3 != null) {
                            }
                            bArr = gcVar2.Qr9iLBAD;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e3) {
                                    j00Var.OnDfzHZD(8, e3);
                                    try {
                                        r7.close();
                                    } catch (IOException e4) {
                                        j00Var.OnDfzHZD(7, e4);
                                    }
                                    hcVarArr = null;
                                    gcVar2.b2ZJblxo = hcVarArr;
                                    hcVarArr2 = gcVar2.b2ZJblxo;
                                    if (hcVarArr2 != null) {
                                    }
                                    j00 j00Var222 = gcVar2.NCTxEWno;
                                    hcVarArr3 = gcVar2.b2ZJblxo;
                                    byte[] bArr422 = gcVar2.MdtA4re8;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (hcVarArr3 != null) {
                                    }
                                    bArr = gcVar2.Qr9iLBAD;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e5) {
                                j00Var.OnDfzHZD(7, e5);
                                r7.close();
                                hcVarArr = null;
                                gcVar2.b2ZJblxo = hcVarArr;
                                hcVarArr2 = gcVar2.b2ZJblxo;
                                if (hcVarArr2 != null) {
                                }
                                j00 j00Var2222 = gcVar2.NCTxEWno;
                                hcVarArr3 = gcVar2.b2ZJblxo;
                                byte[] bArr4222 = gcVar2.MdtA4re8;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (hcVarArr3 != null) {
                                }
                                bArr = gcVar2.Qr9iLBAD;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, SgZGMMPL(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            hcVarArr = ej0.hzgxAD8d(r7, SgZGMMPL(r7, 4), gcVar2.VgvYg0wo);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                j00Var.OnDfzHZD(7, e6);
                            }
                            gcVar2.b2ZJblxo = hcVarArr;
                        }
                        hcVarArr2 = gcVar2.b2ZJblxo;
                        if (hcVarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                qoPGr6Ce2 = gcVar2.qoPGr6Ce(assets, "dexopt/baseline.profm");
                                z8 = r7;
                            } catch (FileNotFoundException e7) {
                                j00Var.OnDfzHZD(9, e7);
                                z8 = r7;
                            } catch (IOException e8) {
                                j00Var.OnDfzHZD(7, e8);
                                z8 = r7;
                            } catch (IllegalStateException e9) {
                                gcVar2.b2ZJblxo = null;
                                j00Var.OnDfzHZD(8, e9);
                                z8 = r7;
                            }
                            if (qoPGr6Ce2 == null) {
                                try {
                                    if (!Arrays.equals(ej0.k3x7lurq, SgZGMMPL(qoPGr6Ce2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] SgZGMMPL = SgZGMMPL(qoPGr6Ce2, 4);
                                    gcVar2.b2ZJblxo = ej0.aZz0PFXp(qoPGr6Ce2, SgZGMMPL, bArr3, hcVarArr2);
                                    qoPGr6Ce2.close();
                                    gcVar = gcVar2;
                                    r7 = SgZGMMPL;
                                    if (gcVar != null) {
                                        gcVar2 = gcVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (qoPGr6Ce2 != null) {
                                    qoPGr6Ce2.close();
                                    z8 = r7;
                                }
                                gcVar = null;
                                r7 = z8;
                                if (gcVar != null) {
                                }
                            }
                        }
                        j00 j00Var22222 = gcVar2.NCTxEWno;
                        hcVarArr3 = gcVar2.b2ZJblxo;
                        byte[] bArr42222 = gcVar2.MdtA4re8;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (hcVarArr3 != null && bArr42222 != null) {
                            r72 = gcVar2.P7K7Inc8;
                            if (r72 != 0) {
                                m1.Ey6iv0m0("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
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
                                j00Var22222.OnDfzHZD(7, e10);
                                z7 = r72;
                            } catch (IllegalStateException e11) {
                                j00Var22222.OnDfzHZD(8, e11);
                                z7 = r72;
                            }
                            if (ej0.HdOGZAzC(r72, bArr42222, hcVarArr3)) {
                                gcVar2.Qr9iLBAD = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                gcVar2.b2ZJblxo = null;
                                z112222 = z7;
                            } else {
                                j00Var22222.OnDfzHZD(5, null);
                                gcVar2.b2ZJblxo = null;
                                r72.close();
                                z112222 = r72;
                            }
                        }
                        bArr = gcVar2.Qr9iLBAD;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!gcVar2.P7K7Inc8) {
                                    m1.Ey6iv0m0("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(gcVar2.wxUZMvaN);
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
                                                                                gcVar2.NCTxEWno(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                gcVar2.Qr9iLBAD = null;
                                                                                gcVar2.b2ZJblxo = null;
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
                                        gcVar2.NCTxEWno(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e13) {
                                        e = e13;
                                        gcVar2.NCTxEWno(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    z112222 = true;
                                    gcVar2.NCTxEWno(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                                } catch (IOException e15) {
                                    e = e15;
                                    z112222 = true;
                                    gcVar2.NCTxEWno(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    m00.MdtA4re8(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                gcVar2.Qr9iLBAD = null;
                                gcVar2.b2ZJblxo = null;
                            }
                        }
                        if (z4) {
                            Mq3SeTnW(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            gcVar2.NCTxEWno(4, null);
                        }
                        gcVar2.P7K7Inc8 = true;
                        r7 = gcVar2.qoPGr6Ce(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        hcVarArr2 = gcVar2.b2ZJblxo;
                        if (hcVarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            qoPGr6Ce2 = gcVar2.qoPGr6Ce(assets, "dexopt/baseline.profm");
                            z8 = r7;
                            if (qoPGr6Ce2 == null) {
                            }
                        }
                        j00 j00Var222222 = gcVar2.NCTxEWno;
                        hcVarArr3 = gcVar2.b2ZJblxo;
                        byte[] bArr422222 = gcVar2.MdtA4re8;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (hcVarArr3 != null) {
                            r72 = gcVar2.P7K7Inc8;
                            if (r72 != 0) {
                            }
                        }
                        bArr = gcVar2.Qr9iLBAD;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        gcVar2.NCTxEWno(4, null);
                    }
                }
                m00.MdtA4re8(context, (z6 || !z) ? false : z9);
            }
            gcVar2.NCTxEWno(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            m00.MdtA4re8(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e16) {
            j00Var.OnDfzHZD(7, e16);
            m00.MdtA4re8(context, false);
        }
    }

    public static String I5GHvsYW(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static Intent KlHjfFWx(f4UNdked f4undked) {
        Intent parentActivityIntent = f4undked.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String I5GHvsYW = I5GHvsYW(f4undked, f4undked.getComponentName());
            if (I5GHvsYW == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(f4undked, I5GHvsYW);
            try {
                return I5GHvsYW(f4undked, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + I5GHvsYW + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Map MdtA4re8(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof xn)) {
            return linkedHashMap;
        }
        zCflySGU(linkedHashMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void Mq3SeTnW(PackageInfo packageInfo, File file) {
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

    public static Context N8VPGzVC(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b2ZJblxo, i, i2);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof f9) && ((f9) context).qoPGr6Ce == i3;
        if (i3 == 0 || z) {
            return context;
        }
        f9 f9Var = new f9(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = obtainStyledAttributes2.getResourceId(i4, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                f9Var.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, P7K7Inc8);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            f9Var.getTheme().applyStyle(resourceId, true);
        }
        return f9Var;
    }

    public static final long NCTxEWno(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : w30.eVhOlqcC(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public static final f0 OnDfzHZD(v30 v30Var, String[] strArr, zk zkVar) {
        hx hxVar;
        v30Var.getClass();
        hn wxUZMvaN2 = v30Var.wxUZMvaN();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        ie0 ie0Var = wxUZMvaN2.NCTxEWno;
        ie0Var.getClass();
        o60 o60Var = new o60();
        int i = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = ie0Var.MdtA4re8;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                o60Var.addAll(set);
            } else {
                o60Var.add(str);
            }
        }
        String[] strArr3 = (String[]) g50.qoPGr6Ce(o60Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i >= length) {
                hxVar = new hx(strArr3, iArr);
                break;
            }
            String str2 = strArr3[i];
            LinkedHashMap linkedHashMap2 = ie0Var.P7K7Inc8;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                m1.sjUBp5pO("There is no table with name ".concat(str2));
                hxVar = null;
                break;
            }
            iArr[i] = num.intValue();
            i++;
        }
        ?? r4 = (String[]) hxVar.NCTxEWno;
        int[] iArr2 = (int[]) hxVar.MdtA4re8;
        r4.getClass();
        iArr2.getClass();
        return new f0(ra.VgvYg0wo(new tg0(26, new jh(ie0Var, iArr2, (Serializable) r4, (g9) null, 4)), -1), v30Var, zkVar, 6);
    }

    public static km OxcuoDLp(li liVar, rg0 rg0Var) {
        mcXgUFR8 qoPGr6Ce2 = ((ja) ((tb) fn.ow5vqvCr(liVar, tb.class))).qoPGr6Ce.qoPGr6Ce();
        go goVar = (go) qoPGr6Ce2.MdtA4re8;
        rg0Var.getClass();
        return new km(goVar, rg0Var, (mcXgUFR8) qoPGr6Ce2.wxUZMvaN);
    }

    public static final int P7K7Inc8(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void Qr9iLBAD(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new en(2, 36, 1));
        }
    }

    public static byte[] SgZGMMPL(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                m1.Ey6iv0m0(q70.VgvYg0wo("Not enough bytes to read: ", i));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static final boolean U0LaHZX7(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static void VgvYg0wo(int i, Object obj) {
        if (obj == null || lwWCatUu(i, obj)) {
            return;
        }
        zCflySGU(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final Object VhgXwMj9(bk bkVar, dl dlVar, bb0 bb0Var) {
        Object OnDfzHZD;
        bkVar.MdtA4re8();
        xo xoVar = bkVar.P7K7Inc8;
        po poVar = xoVar.MdtA4re8;
        po poVar2 = po.NCTxEWno;
        u9 u9Var = u9.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        if (poVar == poVar2 || (OnDfzHZD = ra.OnDfzHZD(new k4(xoVar, dlVar, null, 2), bb0Var)) != u9Var) {
            OnDfzHZD = xe0Var;
        }
        return OnDfzHZD == u9Var ? OnDfzHZD : xe0Var;
    }

    public static final kd WYNAV5pd(vn vnVar, boolean z, sn snVar) {
        if (vnVar instanceof vn) {
            return vnVar.pRiPUEwG(z, snVar);
        }
        boolean OnDfzHZD = snVar.OnDfzHZD();
        gn gnVar = new gn(1, snVar, sn.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1);
        vnVar.getClass();
        return vnVar.pRiPUEwG(z, OnDfzHZD ? new in(gnVar) : new jn(gnVar));
    }

    public static void Xkz7p5xa(View view, tr trVar) {
        te teVar = trVar.MdtA4re8.NCTxEWno;
        if (teVar == null || !teVar.qoPGr6Ce) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        rr rrVar = trVar.MdtA4re8;
        if (rrVar.ow5vqvCr != f) {
            rrVar.ow5vqvCr = f;
            trVar.gjV1z5T1();
        }
    }

    public static void ZyZthT5G(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static final void aZz0PFXp(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final m3 amk52bBQ(g9 g9Var) {
        Unsafe unsafe;
        m3 m3Var;
        m3 m3Var2;
        if (!(g9Var instanceof ad)) {
            return new m3(1, g9Var);
        }
        ad adVar = (ad) g9Var;
        lf lfVar = fn.jb9XjC4I;
        long j = ad.jb9XjC4I;
        loop0: while (true) {
            unsafe = b1.qoPGr6Ce;
            Object objectVolatile = unsafe.getObjectVolatile(adVar, j);
            m3Var = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(adVar, j, lfVar);
                m3Var2 = null;
                break;
            }
            if (objectVolatile instanceof m3) {
                do {
                    unsafe = b1.qoPGr6Ce;
                    if (unsafe.compareAndSwapObject(adVar, ad.jb9XjC4I, objectVolatile, lfVar)) {
                        m3Var2 = (m3) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(adVar, j) == objectVolatile);
            } else if (objectVolatile != lfVar && !(objectVolatile instanceof Throwable)) {
                m1.P7K7Inc8(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (m3Var2 != null) {
            long j2 = m3.jb9XjC4I;
            Object objectVolatile2 = unsafe.getObjectVolatile(m3Var2, j2);
            if (!(objectVolatile2 instanceof a7) || ((a7) objectVolatile2).wxUZMvaN == null) {
                unsafe.putIntVolatile(m3Var2, m3.b2ZJblxo, 536870911);
                unsafe.putObjectVolatile(m3Var2, j2, AxnhUDtd.qoPGr6Ce);
                m3Var = m3Var2;
            } else {
                m3Var2.amk52bBQ();
            }
            if (m3Var != null) {
                return m3Var;
            }
        }
        return new m3(2, g9Var);
    }

    public static final int b2ZJblxo(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static void bvfAo0eO(ByteArrayOutputStream byteArrayOutputStream, int i) {
        ZyZthT5G(byteArrayOutputStream, i, 2);
    }

    public static long eIA6dogk(InputStream inputStream, int i) {
        byte[] SgZGMMPL = SgZGMMPL(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (SgZGMMPL[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void eVhOlqcC(h40 h40Var, Throwable th) {
        boolean isTerminated;
        if (h40Var != 0) {
            if (th != null) {
                try {
                    q70.Qr9iLBAD(h40Var);
                    return;
                } catch (Throwable th2) {
                    w30.wxUZMvaN(th, th2);
                    return;
                }
            }
            if (h40Var instanceof AutoCloseable) {
                h40Var.close();
                return;
            }
            if (!(h40Var instanceof ExecutorService)) {
                if (h40Var instanceof TypedArray) {
                    ((TypedArray) h40Var).recycle();
                    return;
                } else if (h40Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) h40Var).release();
                    return;
                } else {
                    if (!(h40Var instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) h40Var).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) h40Var;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void fVMzMhyS(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final void gjV1z5T1(l9 l9Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = o9.qoPGr6Ce.iterator();
        while (it.hasNext()) {
            try {
                ((ELBHWJgD) it.next()).RXQxj5Oe(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    w30.wxUZMvaN(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            w30.wxUZMvaN(th, new ic(l9Var));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final ArrayList i7xS8jrb(Map map, zk zkVar) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            tt ttVar = (tt) entry.getValue();
            Boolean valueOf = ttVar != null ? Boolean.valueOf(ttVar.NCTxEWno) : null;
            valueOf.getClass();
            if (!valueOf.booleanValue() && !ttVar.MdtA4re8) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) zkVar.ow5vqvCr((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int jb9XjC4I(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, i0.qoPGr6Ce(context)) : 1;
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
        return -1;
    }

    public static byte[] k3x7lurq(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final void lDXGDhIF(l9 l9Var) {
        vn vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo);
        if (vnVar != null && !vnVar.VhgXwMj9()) {
            throw vnVar.DK9slbsy();
        }
    }

    public static boolean lwWCatUu(int i, Object obj) {
        if (obj instanceof ll) {
            if ((obj instanceof ml ? ((ml) obj).NCTxEWno() : obj instanceof ok ? 0 : obj instanceof zk ? 1 : obj instanceof dl ? 2 : obj instanceof el ? 3 : obj instanceof fl ? 4 : obj instanceof gl ? 5 : obj instanceof hl ? 6 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static Context nSmgoSB5(Context context, AttributeSet attributeSet, int i, int i2) {
        return N8VPGzVC(context, attributeSet, i, i2, new int[0]);
    }

    public static ra ow5vqvCr(int i) {
        return i != 0 ? i != 1 ? new c40() : new ba() : new c40();
    }

    public static final Object pRiPUEwG(Object obj) {
        if (!(obj instanceof c7)) {
            return obj;
        }
        Throwable th = ((c7) obj).qoPGr6Ce;
        th.getClass();
        return new k30(th);
    }

    public static h70 qoPGr6Ce(int i) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) != 0 ? 0 : 1;
        int i4 = i & 4;
        v2 v2Var = v2.NCTxEWno;
        v2 v2Var2 = i4 != 0 ? v2Var : v2.MdtA4re8;
        if (i2 <= 0 && i3 <= 0 && v2Var2 != v2Var) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + v2Var2).toString());
        }
        int i5 = i3 + i2;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new h70(i2, i5, v2Var2);
    }

    public static final int sjUBp5pO(h40 h40Var, String str) {
        h40Var.getClass();
        int jb9XjC4I2 = ej0.jb9XjC4I(h40Var, str);
        if (jb9XjC4I2 >= 0) {
            return jb9XjC4I2;
        }
        int columnCount = h40Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(h40Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + x5.Sjrx9cEN(arrayList, null, null, null, null, 63) + ']');
    }

    public static final void wxUZMvaN(ng0 ng0Var, mcXgUFR8 mcxgufr8, xo xoVar) {
        mcxgufr8.getClass();
        xoVar.getClass();
        i50 i50Var = (i50) ng0Var.MdtA4re8("androidx.lifecycle.savedstate.vm.tag");
        if (i50Var == null || i50Var.wxUZMvaN) {
            return;
        }
        i50Var.VgvYg0wo(mcxgufr8, xoVar);
        po poVar = xoVar.MdtA4re8;
        if (poVar == po.MdtA4re8 || poVar.compareTo(po.VgvYg0wo) >= 0) {
            mcxgufr8.pRiPUEwG();
        } else {
            xoVar.qoPGr6Ce(new gb(xoVar, 1, mcxgufr8));
        }
    }

    public static final long ygLcUYwZ(long j) {
        long j2 = (j << 1) + 1;
        ge.NCTxEWno.getClass();
        int i = he.qoPGr6Ce;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] ytu5o6f4(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static void zCflySGU(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(q70.P7K7Inc8(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        fn.Mq3SeTnW(classCastException, le0.class.getName());
        throw classCastException;
    }

    public abstract float RXQxj5Oe(Drawable drawable);

    public abstract Object euDDoUNr(int i, Intent intent);

    public abstract void hzgxAD8d(Drawable drawable, float f);
}
