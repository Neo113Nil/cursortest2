package pl.droidsonroids.gif;

import O2.i;
import S0.l;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import com.anythink.core.common.d.j;
import com.google.android.gms.internal.ads.Wv;
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

/* loaded from: classes2.dex */
final class GifInfoHandle {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39994b = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f39995a;

    static {
        l h3;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        l lVar = null;
        boolean z6 = true;
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (Q3.b.f2651a == null) {
                try {
                    Q3.b.f2651a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e9) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e9);
                }
            }
            Context context = Q3.b.f2651a;
            b3.e eVar = new b3.e(14);
            if (context == null) {
                throw new IllegalArgumentException("Given context is null");
            }
            b3.e.A("Beginning load of %s...", "pl_droidsonroids_gif");
            c4.e eVar2 = (c4.e) eVar.f5558v;
            HashSet hashSet = (HashSet) eVar.f5557u;
            if (hashSet.contains("pl_droidsonroids_gif")) {
                b3.e.A("%s already loaded previously!", "pl_droidsonroids_gif");
                return;
            }
            try {
                eVar2.getClass();
                System.loadLibrary("pl_droidsonroids_gif");
                hashSet.add("pl_droidsonroids_gif");
                b3.e.A("%s (%s) was loaded normally!", "pl_droidsonroids_gif", null);
            } catch (UnsatisfiedLinkError e10) {
                b3.e.A("Loading the library normally failed: %s", Log.getStackTraceString(e10));
                b3.e.A("%s (%s) was not loaded normally, re-linking...", "pl_droidsonroids_gif", null);
                File x9 = eVar.x(context);
                if (!x9.exists()) {
                    File dir = context.getDir("lib", 0);
                    File x10 = eVar.x(context);
                    eVar2.getClass();
                    File[] listFiles = dir.listFiles(new S1.a(System.mapLibraryName("pl_droidsonroids_gif")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(x10.getAbsolutePath())) {
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
                    ((i) eVar.f5559w).getClass();
                    try {
                        h3 = i.h(context, strArr2, mapLibraryName, eVar);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (h3 == null) {
                            try {
                                strArr = i.l(context, mapLibraryName);
                            } catch (Exception e11) {
                                strArr = new String[]{e11.toString()};
                            }
                            StringBuilder l9 = Wv.l("Could not find '", mapLibraryName, "'. Looked for: ");
                            l9.append(Arrays.toString(strArr2));
                            l9.append(", but only found: ");
                            throw new B0.c(Wv.i(l9, Arrays.toString(strArr), j.f13164z));
                        }
                        int i = 0;
                        while (true) {
                            int i4 = i + 1;
                            zipFile = (ZipFile) h3.f2926u;
                            if (i < 5) {
                                b3.e.A("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (x9.exists() || x9.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) h3.f2927v);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(x9);
                                            } catch (FileNotFoundException unused2) {
                                                fileOutputStream2 = null;
                                                i.b(inputStream2);
                                                i.b(fileOutputStream2);
                                                i = i4;
                                                z6 = true;
                                            } catch (IOException unused3) {
                                                fileOutputStream2 = null;
                                                i.b(inputStream2);
                                                i.b(fileOutputStream2);
                                                i = i4;
                                                z6 = true;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                i.b(inputStream);
                                                i.b(fileOutputStream);
                                                throw th;
                                            }
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j6 = 0;
                                                while (true) {
                                                    int read = inputStream2.read(bArr);
                                                    if (read == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream2.write(bArr, 0, read);
                                                    j6 += read;
                                                    z6 = true;
                                                }
                                                fileOutputStream2.flush();
                                                fileOutputStream2.getFD().sync();
                                                if (j6 == x9.length()) {
                                                    i.b(inputStream2);
                                                    i.b(fileOutputStream2);
                                                    x9.setReadable(z6, false);
                                                    x9.setExecutable(z6, false);
                                                    x9.setWritable(z6);
                                                    break;
                                                }
                                                i.b(inputStream2);
                                                i.b(fileOutputStream2);
                                            } catch (FileNotFoundException unused4) {
                                                i.b(inputStream2);
                                                i.b(fileOutputStream2);
                                                i = i4;
                                                z6 = true;
                                            } catch (IOException unused5) {
                                                i.b(inputStream2);
                                                i.b(fileOutputStream2);
                                                i = i4;
                                                z6 = true;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                i.b(inputStream);
                                                i.b(fileOutputStream);
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
                                z6 = true;
                            }
                        }
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused9) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        lVar = h3;
                        if (lVar != null) {
                            try {
                                ((ZipFile) lVar.f2926u).close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = x9.getAbsolutePath();
                eVar2.getClass();
                System.load(absolutePath);
                hashSet.add("pl_droidsonroids_gif");
                b3.e.A("%s (%s) was re-linked!", "pl_droidsonroids_gif", null);
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
            this.f39995a = openNativeFileDescriptor(createTempNativeFileDescriptor, startOffset);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z6);

    private static native void free(long j6);

    private static native int getCurrentFrameIndex(long j6);

    private static native int getCurrentLoop(long j6);

    private static native int getCurrentPosition(long j6);

    private static native int getDuration(long j6);

    private static native int getHeight(long j6);

    private static native int getLoopCount(long j6);

    private static native int getNativeErrorCode(long j6);

    private static native int getNumberOfFrames(long j6);

    private static native long[] getSavedState(long j6);

    private static native int getWidth(long j6);

    private static native boolean isOpaque(long j6);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i, long j6);

    private static native long renderFrame(long j6, Bitmap bitmap);

    private static native boolean reset(long j6);

    private static native long restoreRemainder(long j6);

    private static native int restoreSavedState(long j6, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j6);

    private static native void seekToTime(long j6, int i, Bitmap bitmap);

    private static native void setLoopCount(long j6, char c9);

    public final synchronized int a() {
        return getCurrentFrameIndex(this.f39995a);
    }

    public final synchronized int b() {
        return getCurrentLoop(this.f39995a);
    }

    public final synchronized int c() {
        return getCurrentPosition(this.f39995a);
    }

    public final synchronized int d() {
        return getDuration(this.f39995a);
    }

    public final synchronized int e() {
        return getHeight(this.f39995a);
    }

    public final synchronized int f() {
        return getLoopCount(this.f39995a);
    }

    public final void finalize() {
        try {
            synchronized (this) {
                free(this.f39995a);
                this.f39995a = 0L;
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized int g() {
        return getNativeErrorCode(this.f39995a);
    }

    public final synchronized int h() {
        return getNumberOfFrames(this.f39995a);
    }

    public final synchronized long[] i() {
        return getSavedState(this.f39995a);
    }

    public final synchronized int j() {
        return getWidth(this.f39995a);
    }

    public final synchronized boolean k() {
        return isOpaque(this.f39995a);
    }

    public final synchronized long l(Bitmap bitmap) {
        return renderFrame(this.f39995a, bitmap);
    }

    public final synchronized boolean m() {
        return reset(this.f39995a);
    }

    public final synchronized long n() {
        return restoreRemainder(this.f39995a);
    }

    public final synchronized int o(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f39995a, jArr, bitmap);
    }

    public final synchronized void p() {
        saveRemainder(this.f39995a);
    }

    public final synchronized void q(Bitmap bitmap, int i) {
        seekToTime(this.f39995a, i, bitmap);
    }

    public final void r(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f39995a, (char) i);
        }
    }
}
