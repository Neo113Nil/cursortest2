package pl.droidsonroids.gif;

import M2.i;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import com.anythink.core.common.d.j;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
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
import u1.h;

/* loaded from: classes2.dex */
final class GifInfoHandle {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39947b = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f39948a;

    static {
        S0.e v9;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        S0.e eVar = null;
        boolean z3 = true;
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (X2.e.f3788c == null) {
                try {
                    X2.e.f3788c = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e9) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e9);
                }
            }
            Context context = X2.e.f3788c;
            Z2.e eVar2 = new Z2.e(13);
            if (context == null) {
                throw new IllegalArgumentException("Given context is null");
            }
            Z2.e.A("Beginning load of %s...", "pl_droidsonroids_gif");
            i iVar = (i) eVar2.f4171v;
            HashSet hashSet = (HashSet) eVar2.f4170u;
            if (hashSet.contains("pl_droidsonroids_gif")) {
                Z2.e.A("%s already loaded previously!", "pl_droidsonroids_gif");
                return;
            }
            try {
                iVar.getClass();
                System.loadLibrary("pl_droidsonroids_gif");
                hashSet.add("pl_droidsonroids_gif");
                Z2.e.A("%s (%s) was loaded normally!", "pl_droidsonroids_gif", null);
            } catch (UnsatisfiedLinkError e10) {
                Z2.e.A("Loading the library normally failed: %s", Log.getStackTraceString(e10));
                Z2.e.A("%s (%s) was not loaded normally, re-linking...", "pl_droidsonroids_gif", null);
                File w6 = eVar2.w(context);
                if (!w6.exists()) {
                    File dir = context.getDir("lib", 0);
                    File w9 = eVar2.w(context);
                    iVar.getClass();
                    File[] listFiles = dir.listFiles(new Q1.a(System.mapLibraryName("pl_droidsonroids_gif")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(w9.getAbsolutePath())) {
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
                    ((E3.e) eVar2.f4172w).getClass();
                    try {
                        v9 = E3.e.v(context, strArr2, mapLibraryName, eVar2);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (v9 == null) {
                            try {
                                strArr = E3.e.x(context, mapLibraryName);
                            } catch (Exception e11) {
                                strArr = new String[]{e11.toString()};
                            }
                            StringBuilder j6 = AbstractC4404f.j("Could not find '", mapLibraryName, "'. Looked for: ");
                            j6.append(Arrays.toString(strArr2));
                            j6.append(", but only found: ");
                            throw new B0.c(h.g(j6, Arrays.toString(strArr), j.f12378z));
                        }
                        int i = 0;
                        while (true) {
                            int i6 = i + 1;
                            zipFile = (ZipFile) v9.f2781u;
                            if (i < 5) {
                                Z2.e.A("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (w6.exists() || w6.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) v9.f2782v);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(w6);
                                            } catch (FileNotFoundException unused2) {
                                                fileOutputStream2 = null;
                                                E3.e.u(inputStream2);
                                                E3.e.u(fileOutputStream2);
                                                i = i6;
                                                z3 = true;
                                            } catch (IOException unused3) {
                                                fileOutputStream2 = null;
                                                E3.e.u(inputStream2);
                                                E3.e.u(fileOutputStream2);
                                                i = i6;
                                                z3 = true;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                E3.e.u(inputStream);
                                                E3.e.u(fileOutputStream);
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
                                                    z3 = true;
                                                }
                                                fileOutputStream2.flush();
                                                fileOutputStream2.getFD().sync();
                                                if (j9 == w6.length()) {
                                                    E3.e.u(inputStream2);
                                                    E3.e.u(fileOutputStream2);
                                                    w6.setReadable(z3, false);
                                                    w6.setExecutable(z3, false);
                                                    w6.setWritable(z3);
                                                    break;
                                                }
                                                E3.e.u(inputStream2);
                                                E3.e.u(fileOutputStream2);
                                            } catch (FileNotFoundException unused4) {
                                                E3.e.u(inputStream2);
                                                E3.e.u(fileOutputStream2);
                                                i = i6;
                                                z3 = true;
                                            } catch (IOException unused5) {
                                                E3.e.u(inputStream2);
                                                E3.e.u(fileOutputStream2);
                                                i = i6;
                                                z3 = true;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                E3.e.u(inputStream);
                                                E3.e.u(fileOutputStream);
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
                                i = i6;
                                z3 = true;
                            }
                        }
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused9) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        eVar = v9;
                        if (eVar != null) {
                            try {
                                ((ZipFile) eVar.f2781u).close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = w6.getAbsolutePath();
                iVar.getClass();
                System.load(absolutePath);
                hashSet.add("pl_droidsonroids_gif");
                Z2.e.A("%s (%s) was re-linked!", "pl_droidsonroids_gif", null);
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
            this.f39948a = openNativeFileDescriptor(createTempNativeFileDescriptor, startOffset);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z3);

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
        return getCurrentFrameIndex(this.f39948a);
    }

    public final synchronized int b() {
        return getCurrentLoop(this.f39948a);
    }

    public final synchronized int c() {
        return getCurrentPosition(this.f39948a);
    }

    public final synchronized int d() {
        return getDuration(this.f39948a);
    }

    public final synchronized int e() {
        return getHeight(this.f39948a);
    }

    public final synchronized int f() {
        return getLoopCount(this.f39948a);
    }

    public final void finalize() {
        try {
            synchronized (this) {
                free(this.f39948a);
                this.f39948a = 0L;
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized int g() {
        return getNativeErrorCode(this.f39948a);
    }

    public final synchronized int h() {
        return getNumberOfFrames(this.f39948a);
    }

    public final synchronized long[] i() {
        return getSavedState(this.f39948a);
    }

    public final synchronized int j() {
        return getWidth(this.f39948a);
    }

    public final synchronized boolean k() {
        return isOpaque(this.f39948a);
    }

    public final synchronized long l(Bitmap bitmap) {
        return renderFrame(this.f39948a, bitmap);
    }

    public final synchronized boolean m() {
        return reset(this.f39948a);
    }

    public final synchronized long n() {
        return restoreRemainder(this.f39948a);
    }

    public final synchronized int o(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f39948a, jArr, bitmap);
    }

    public final synchronized void p() {
        saveRemainder(this.f39948a);
    }

    public final synchronized void q(Bitmap bitmap, int i) {
        seekToTime(this.f39948a, i, bitmap);
    }

    public final void r(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f39948a, (char) i);
        }
    }
}
