package defpackage;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import yads.ri;
import yads.ui;
import yads.uj1;

/* loaded from: classes10.dex */
public final class rn7 implements izn, ss81 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object w;
    public final Object x;

    public rn7(String str, a73 a73Var) {
        boolean z;
        int i;
        this.w = new HashMap();
        this.c = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            sgb1.g(5, "Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.a = z;
        this.b = i;
        this.x = a73Var;
    }

    @Override // defpackage.ss81
    public MediaFormat a() {
        MediaFormat mediaFormat;
        ui uiVar = (ui) this.w;
        synchronized (uiVar.a) {
            try {
                mediaFormat = uiVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.ss81
    public int b() {
        ui uiVar = (ui) this.w;
        synchronized (uiVar.a) {
            try {
                int i = -1;
                if (uiVar.k <= 0 && !uiVar.l) {
                    IllegalStateException illegalStateException = uiVar.m;
                    if (illegalStateException != null) {
                        uiVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = uiVar.j;
                    if (codecException != null) {
                        uiVar.j = null;
                        throw codecException;
                    }
                    by71 by71Var = uiVar.d;
                    int i2 = by71Var.c;
                    if (i2 != 0) {
                        if (i2 == 0) {
                            throw new NoSuchElementException();
                        }
                        int[] iArr = by71Var.d;
                        int i3 = by71Var.a;
                        i = iArr[i3];
                        by71Var.a = (i3 + 1) & by71Var.e;
                        by71Var.c = i2 - 1;
                    }
                    return i;
                }
                return -1;
            } finally {
            }
        }
    }

    @Override // defpackage.ss81
    public void c(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.ss81
    public void d(boolean z, int i) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.ss81
    public ByteBuffer e(int i) {
        return ((MediaCodec) this.c).getInputBuffer(i);
    }

    public void f(MediaFormat mediaFormat, Surface surface) {
        ui uiVar = (ui) this.w;
        MediaCodec mediaCodec = (MediaCodec) this.c;
        uiVar.a(mediaCodec);
        dda1.i("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        dda1.h();
        nf81 nf81Var = (nf81) this.x;
        boolean z = nf81Var.f;
        HandlerThread handlerThread = nf81Var.b;
        if (!z) {
            handlerThread.start();
            nf81Var.c = new ri(nf81Var, handlerThread.getLooper());
            nf81Var.f = true;
        }
        dda1.i("startCodec");
        mediaCodec.start();
        dda1.h();
        this.b = 1;
    }

    @Override // defpackage.ss81
    public void flush() {
        ((nf81) this.x).a();
        MediaCodec mediaCodec = (MediaCodec) this.c;
        mediaCodec.flush();
        ((ui) this.w).a();
        mediaCodec.start();
    }

    @Override // defpackage.ss81
    public void h(int i, l271 l271Var, long j) {
        nf81 nf81Var = (nf81) this.x;
        RuntimeException runtimeException = (RuntimeException) nf81Var.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        hc81 b = nf81.b();
        b.a = i;
        b.b = 0;
        b.d = j;
        b.e = 0;
        MediaCodec.CryptoInfo cryptoInfo = b.c;
        cryptoInfo.numSubSamples = l271Var.f;
        int[] iArr = l271Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = l271Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = l271Var.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = l271Var.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = l271Var.c;
        if (rf71.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(l271Var.g, l271Var.h));
        }
        nf81Var.c.obtainMessage(1, b).sendToTarget();
    }

    @Override // defpackage.ss81
    public void i(uj1 uj1Var, Handler handler) {
        ((MediaCodec) this.c).setOnFrameRenderedListener(new w871(this, uj1Var, 1), handler);
    }

    @Override // defpackage.ss81
    public int k(MediaCodec.BufferInfo bufferInfo) {
        return ((ui) this.w).a(bufferInfo);
    }

    @Override // defpackage.ss81
    public void l(int i, int i2, long j, int i3) {
        nf81 nf81Var = (nf81) this.x;
        RuntimeException runtimeException = (RuntimeException) nf81Var.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        hc81 b = nf81.b();
        b.a = i;
        b.b = i2;
        b.d = j;
        b.e = i3;
        ri riVar = nf81Var.c;
        int i4 = rf71.a;
        riVar.obtainMessage(0, b).sendToTarget();
    }

    @Override // defpackage.ss81
    public ByteBuffer m(int i) {
        return ((MediaCodec) this.c).getOutputBuffer(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:10|(7:12|(2:51|(1:53)(7:54|55|(1:57)(1:(1:59)(2:60|61))|(4:16|(2:40|(4:42|(3:44|(1:46)(1:48)|47)|49|(1:(5:21|(3:24|(4:26|27|28|29)(1:30)|22)|31|28|29)(3:(3:33|(2:35|(2:38|27)(1:37))|39)|28|29))))|18|(0))|50|28|29))|14|(0)|50|28|29)|63|64|(16:66|(1:68)|69|70|72|73|(2:75|(1:(1:78)(1:79)))(1:94)|80|81|82|84|85|(0)|50|28|29)|14|(0)|50|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x008a, code lost:
    
        defpackage.sgb1.g(5, "Camera2EncoderProfilesProvider");
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0172  */
    @Override // defpackage.izn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mzn o(int i) {
        String str;
        String str2;
        e64 e;
        boolean contains;
        mzn o;
        mzn mznVar = null;
        if (!this.a || !CamcorderProfile.hasProfile(this.b, i)) {
            return null;
        }
        if (((HashMap) this.w).containsKey(Integer.valueOf(i))) {
            return (mzn) ((HashMap) this.w).get(Integer.valueOf(i));
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 5;
        if (i2 >= 31) {
            EncoderProfiles c = vm2.c(i, (String) this.c);
            if (c != null) {
                if (xbj.a.b(InvalidVideoProfilesQuirk.class) == null) {
                    try {
                        if (i2 >= 33) {
                            e = rh.c(c);
                        } else {
                            if (i2 < 31) {
                                throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i2 + ". Version 31 or higher required.");
                            }
                            e = vm2.b(c);
                        }
                    } catch (NullPointerException unused) {
                        sgb1.g(5, "Camera2EncoderProfilesProvider");
                    }
                    if (e != null) {
                        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) ((a73) this.x).b(CamcorderProfileResolutionQuirk.class);
                        if (camcorderProfileResolutionQuirk != null) {
                            List list = e.d;
                            if (!list.isEmpty()) {
                                lzn lznVar = (lzn) list.get(0);
                                if (camcorderProfileResolutionQuirk.b == null) {
                                    Size[] I = camcorderProfileResolutionQuirk.a.I(34);
                                    List asList = I != null ? Arrays.asList((Size[]) I.clone()) : Collections.EMPTY_LIST;
                                    camcorderProfileResolutionQuirk.b = asList;
                                    Objects.toString(asList);
                                    sgb1.g(3, "CamcorderProfileResolutionQuirk");
                                }
                                contains = new ArrayList(camcorderProfileResolutionQuirk.b).contains(lznVar.j());
                                if (!contains) {
                                    if (i == 1) {
                                        Iterator it = izn.c2.iterator();
                                        while (it.hasNext()) {
                                            o = o(((Integer) it.next()).intValue());
                                            if (o != null) {
                                                mznVar = o;
                                                ((HashMap) this.w).put(Integer.valueOf(i), mznVar);
                                                return mznVar;
                                            }
                                        }
                                        ((HashMap) this.w).put(Integer.valueOf(i), mznVar);
                                        return mznVar;
                                    }
                                    if (i == 0) {
                                        for (int size = izn.c2.size() - 1; size >= 0; size--) {
                                            o = o(size);
                                            if (o != null) {
                                                mznVar = o;
                                            }
                                        }
                                    }
                                    ((HashMap) this.w).put(Integer.valueOf(i), mznVar);
                                    return mznVar;
                                }
                            }
                        }
                        contains = true;
                        if (!contains) {
                        }
                    }
                    mznVar = e;
                    ((HashMap) this.w).put(Integer.valueOf(i), mznVar);
                    return mznVar;
                }
                sgb1.g(3, "Camera2EncoderProfilesProvider");
            }
            e = null;
            if (e != null) {
            }
            mznVar = e;
            ((HashMap) this.w).put(Integer.valueOf(i), mznVar);
            return mznVar;
        }
        CamcorderProfile camcorderProfile = CamcorderProfile.get(this.b, i);
        if (camcorderProfile != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                sgb1.g(5, "EncoderProfilesProxyCompat");
            }
            int i4 = camcorderProfile.duration;
            int i5 = camcorderProfile.fileFormat;
            ArrayList arrayList = new ArrayList();
            int i6 = camcorderProfile.audioCodec;
            switch (i6) {
                case 1:
                    str = "audio/3gpp";
                    break;
                case 2:
                    str = "audio/amr-wb";
                    break;
                case 3:
                case 4:
                case 5:
                    str = "audio/mp4a-latm";
                    break;
                case 6:
                    str = "audio/vorbis";
                    break;
                case 7:
                    str = "audio/opus";
                    break;
                default:
                    str = "audio/none";
                    break;
            }
            String str3 = str;
            int i7 = camcorderProfile.audioBitRate;
            int i8 = camcorderProfile.audioSampleRate;
            int i9 = camcorderProfile.audioChannels;
            if (i6 == 3) {
                i3 = 2;
            } else if (i6 != 4) {
                i3 = i6 != 5 ? -1 : 39;
            }
            arrayList.add(new d64(i6, i7, i8, i9, i3, str3));
            ArrayList arrayList2 = new ArrayList();
            int i10 = camcorderProfile.videoCodec;
            switch (i10) {
                case 1:
                    str2 = "video/3gpp";
                    break;
                case 2:
                    str2 = "video/avc";
                    break;
                case 3:
                    str2 = "video/mp4v-es";
                    break;
                case 4:
                    str2 = "video/x-vnd.on2.vp8";
                    break;
                case 5:
                    str2 = "video/hevc";
                    break;
                case 6:
                    str2 = "video/x-vnd.on2.vp9";
                    break;
                case 7:
                    str2 = "video/dolby-vision";
                    break;
                case 8:
                    str2 = "video/av01";
                    break;
                default:
                    str2 = "video/none";
                    break;
            }
            arrayList2.add(new f64(i10, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
            e = kzn.e(i4, i5, arrayList, arrayList2);
            if (e != null) {
            }
            mznVar = e;
            ((HashMap) this.w).put(Integer.valueOf(i), mznVar);
            return mznVar;
        }
        e = null;
        if (e != null) {
        }
        mznVar = e;
        ((HashMap) this.w).put(Integer.valueOf(i), mznVar);
        return mznVar;
    }

    @Override // defpackage.ss81
    public void p(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    @Override // defpackage.ss81
    public void release() {
        try {
            if (this.b == 1) {
                nf81 nf81Var = (nf81) this.x;
                if (nf81Var.f) {
                    nf81Var.a();
                    nf81Var.b.quit();
                }
                nf81Var.f = false;
                ui uiVar = (ui) this.w;
                synchronized (uiVar.a) {
                    try {
                        uiVar.l = true;
                        uiVar.b.quit();
                        if (!uiVar.g.isEmpty()) {
                            uiVar.i = (MediaFormat) uiVar.g.getLast();
                        }
                        by71 by71Var = uiVar.d;
                        by71Var.a = 0;
                        by71Var.b = -1;
                        by71Var.c = 0;
                        by71 by71Var2 = uiVar.e;
                        by71Var2.a = 0;
                        by71Var2.b = -1;
                        by71Var2.c = 0;
                        uiVar.f.clear();
                        uiVar.g.clear();
                        uiVar.j = null;
                    } finally {
                    }
                }
            }
            this.b = 2;
            if (this.a) {
                return;
            }
            ((MediaCodec) this.c).release();
            this.a = true;
        } catch (Throwable th) {
            if (!this.a) {
                ((MediaCodec) this.c).release();
                this.a = true;
            }
            throw th;
        }
    }

    @Override // defpackage.izn
    public boolean s(int i) {
        return this.a && o(i) != null;
    }

    @Override // defpackage.ss81
    public void a(Bundle bundle) {
        ((MediaCodec) this.c).setParameters(bundle);
    }

    public rn7(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.c = mediaCodec;
        this.w = new ui(handlerThread);
        this.x = new nf81(mediaCodec, handlerThread2);
        this.b = 0;
    }

    @Override // defpackage.ss81
    public void b(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }
}
