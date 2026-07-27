package pl.droidsonroids.gif;

import L2.i;
import S0.l;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import com.anythink.core.common.d.j;
import com.google.android.gms.internal.ads.CL;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
final class GifInfoHandle {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39854b = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f39855a;

    static {
        l q6;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        l lVar = null;
        boolean z8 = true;
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (S0.f.f2895c == null) {
                try {
                    S0.f.f2895c = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e6) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e6);
                }
            }
            Context context = S0.f.f2895c;
            Y2.e eVar = new Y2.e(12);
            if (context == null) {
                throw new IllegalArgumentException("Given context is null");
            }
            Y2.e.D("Beginning load of %s...", "pl_droidsonroids_gif");
            W3.e eVar2 = (W3.e) eVar.f3964v;
            HashSet hashSet = (HashSet) eVar.f3963u;
            if (hashSet.contains("pl_droidsonroids_gif")) {
                Y2.e.D("%s already loaded previously!", "pl_droidsonroids_gif");
                return;
            }
            try {
                eVar2.getClass();
                System.loadLibrary("pl_droidsonroids_gif");
                hashSet.add("pl_droidsonroids_gif");
                Y2.e.D("%s (%s) was loaded normally!", "pl_droidsonroids_gif", null);
            } catch (UnsatisfiedLinkError e9) {
                Y2.e.D("Loading the library normally failed: %s", Log.getStackTraceString(e9));
                Y2.e.D("%s (%s) was not loaded normally, re-linking...", "pl_droidsonroids_gif", null);
                File z9 = eVar.z(context);
                if (!z9.exists()) {
                    File dir = context.getDir("lib", 0);
                    File z10 = eVar.z(context);
                    eVar2.getClass();
                    File[] listFiles = dir.listFiles(new Q1.a(System.mapLibraryName("pl_droidsonroids_gif")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(z10.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("pl_droidsonroids_gif");
                    ((i) eVar.f3965w).getClass();
                    try {
                        q6 = i.q(context, strArr2, mapLibraryName, eVar);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (q6 == null) {
                            try {
                                strArr = i.t(context, mapLibraryName);
                            } catch (Exception e10) {
                                strArr = new String[]{e10.toString()};
                            }
                            StringBuilder m8 = CL.m("Could not find '", mapLibraryName, "'. Looked for: ");
                            m8.append(Arrays.toString(strArr2));
                            m8.append(", but only found: ");
                            throw new B0.c(AbstractC5051n.g(m8, Arrays.toString(strArr), j.f12535z));
                        }
                        int i = 0;
                        while (true) {
                            int i4 = i + 1;
                            zipFile = (ZipFile) q6.f2910u;
                            if (i < 5) {
                                Y2.e.D("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (z9.exists() || z9.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) q6.f2911v);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(z9);
                                            } catch (FileNotFoundException unused2) {
                                                fileOutputStream2 = null;
                                                i.i(inputStream2);
                                                i.i(fileOutputStream2);
                                                i = i4;
                                                z8 = true;
                                            } catch (IOException unused3) {
                                                fileOutputStream2 = null;
                                                i.i(inputStream2);
                                                i.i(fileOutputStream2);
                                                i = i4;
                                                z8 = true;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                i.i(inputStream);
                                                i.i(fileOutputStream);
                                                throw th;
                                            }
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j9 = 0;
                                                while (true) {
                                                    int read = inputStream2.read(bArr);
                                                    if (read == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream2.write(bArr, 0, read);
                                                    j9 += read;
                                                    z8 = true;
                                                }
                                                fileOutputStream2.flush();
                                                fileOutputStream2.getFD().sync();
                                                if (j9 == z9.length()) {
                                                    i.i(inputStream2);
                                                    i.i(fileOutputStream2);
                                                    z9.setReadable(z8, false);
                                                    z9.setExecutable(z8, false);
                                                    z9.setWritable(z8);
                                                    break;
                                                }
                                                i.i(inputStream2);
                                                i.i(fileOutputStream2);
                                            } catch (FileNotFoundException unused4) {
                                                i.i(inputStream2);
                                                i.i(fileOutputStream2);
                                                i = i4;
                                                z8 = true;
                                            } catch (IOException unused5) {
                                                i.i(inputStream2);
                                                i.i(fileOutputStream2);
                                                i = i4;
                                                z8 = true;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                i.i(inputStream);
                                                i.i(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused6) {
                                            inputStream2 = null;
                                        } catch (IOException unused7) {
                                            inputStream2 = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = null;
                                        }
                                    }
                                } catch (IOException unused8) {
                                }
                                i = i4;
                                z8 = true;
                            }
                        }
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused9) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        lVar = q6;
                        if (lVar != null) {
                            try {
                                ((ZipFile) lVar.f2910u).close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = z9.getAbsolutePath();
                eVar2.getClass();
                System.load(absolutePath);
                hashSet.add("pl_droidsonroids_gif");
                Y2.e.D("%s (%s) was re-linked!", "pl_droidsonroids_gif", null);
            }
        }
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int createTempNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT > 27) {
                try {
                    createTempNativeFileDescriptor = createTempNativeFileDescriptor();
                    Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
                } finally {
                }
            } else {
                createTempNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            }
            this.f39855a = openNativeFileDescriptor(createTempNativeFileDescriptor, startOffset);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z8);

    private static native void free(long j9);

    private static native int getCurrentFrameIndex(long j9);

    private static native int getCurrentLoop(long j9);

    private static native int getCurrentPosition(long j9);

    private static native int getDuration(long j9);

    private static native int getHeight(long j9);

    private static native int getLoopCount(long j9);

    private static native int getNativeErrorCode(long j9);

    private static native int getNumberOfFrames(long j9);

    private static native long[] getSavedState(long j9);

    private static native int getWidth(long j9);

    private static native boolean isOpaque(long j9);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i, long j9);

    private static native long renderFrame(long j9, Bitmap bitmap);

    private static native boolean reset(long j9);

    private static native long restoreRemainder(long j9);

    private static native int restoreSavedState(long j9, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j9);

    private static native void seekToTime(long j9, int i, Bitmap bitmap);

    private static native void setLoopCount(long j9, char c4);

    public final synchronized int a() {
        return getCurrentFrameIndex(this.f39855a);
    }

    public final synchronized int b() {
        return getCurrentLoop(this.f39855a);
    }

    public final synchronized int c() {
        return getCurrentPosition(this.f39855a);
    }

    public final synchronized int d() {
        return getDuration(this.f39855a);
    }

    public final synchronized int e() {
        return getHeight(this.f39855a);
    }

    public final synchronized int f() {
        return getLoopCount(this.f39855a);
    }

    public final void finalize() {
        try {
            synchronized (this) {
                free(this.f39855a);
                this.f39855a = 0L;
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized int g() {
        return getNativeErrorCode(this.f39855a);
    }

    public final synchronized int h() {
        return getNumberOfFrames(this.f39855a);
    }

    public final synchronized long[] i() {
        return getSavedState(this.f39855a);
    }

    public final synchronized int j() {
        return getWidth(this.f39855a);
    }

    public final synchronized boolean k() {
        return isOpaque(this.f39855a);
    }

    public final synchronized long l(Bitmap bitmap) {
        return renderFrame(this.f39855a, bitmap);
    }

    public final synchronized boolean m() {
        return reset(this.f39855a);
    }

    public final synchronized long n() {
        return restoreRemainder(this.f39855a);
    }

    public final synchronized int o(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f39855a, jArr, bitmap);
    }

    public final synchronized void p() {
        saveRemainder(this.f39855a);
    }

    public final synchronized void q(Bitmap bitmap, int i) {
        seekToTime(this.f39855a, i, bitmap);
    }

    public final void r(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f39855a, (char) i);
        }
    }
}
