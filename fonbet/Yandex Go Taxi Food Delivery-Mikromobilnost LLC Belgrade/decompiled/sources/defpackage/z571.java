package defpackage;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import javax.net.ssl.SSLHandshakeException;
import yads.aa2;
import yads.ar;
import yads.bk;
import yads.c01;
import yads.ck;
import yads.e01;
import yads.ef1;
import yads.fj1;
import yads.jc2;
import yads.lj1;
import yads.lk0;
import yads.od3;
import yads.p11;
import yads.po;
import yads.w23;
import yads.wq;

/* loaded from: classes7.dex */
public final class z571 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static od3 a(Throwable th) {
        od3 od3Var;
        boolean z;
        if (!(th instanceof jc2)) {
            if (th instanceof p11) {
                return od3.j;
            }
            if (th instanceof lj1) {
                return od3.k;
            }
            if (th instanceof fj1) {
                return od3.l;
            }
            if (th instanceof po) {
                return od3.n;
            }
            if (th instanceof MediaCodec.CryptoException) {
                return od3.o;
            }
            if (th instanceof lk0) {
                Throwable cause = ((lk0) th).getCause();
                return cause == null ? od3.q : ((cause instanceof MediaDrmResetException) || (cause instanceof ResourceBusyException)) ? od3.p : !(cause instanceof MediaCodec.CryptoException) ? od3.q : od3.o;
            }
            if (th instanceof e01) {
                int i = ((e01) th).e;
                return i == 401 ? od3.s : i == 403 ? od3.t : i == 404 ? od3.u : od3.v;
            }
            if (th instanceof c01) {
                return ((c01) th).getCause() instanceof SSLHandshakeException ? od3.w : od3.x;
            }
            if (th instanceof aa2) {
                return od3.y;
            }
            if (th instanceof ef1) {
                return od3.z;
            }
            if (th instanceof bk ? true : th instanceof ck) {
                return od3.A;
            }
            if (th instanceof w23) {
                return od3.B;
            }
            return th instanceof wq ? true : th instanceof ar ? od3.C : od3.F;
        }
        Throwable cause2 = th.getCause();
        if (cause2 != null && (((z = cause2 instanceof MediaCodec.CodecException)) || (cause2 instanceof IllegalStateException) || (cause2 instanceof IllegalArgumentException))) {
            StackTraceElement[] stackTrace = cause2.getStackTrace();
            if (stackTrace.length != 0 && stackTrace[0].isNativeMethod() && jl40.l(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                String methodName = stackTrace[0].getMethodName();
                if (methodName == null) {
                    methodName = "";
                }
                if (methodName.equals("native_dequeueOutputBuffer")) {
                    od3Var = od3.b;
                } else if (methodName.equals("native_dequeueInputBuffer")) {
                    od3Var = od3.c;
                } else if (methodName.equals("native_stop")) {
                    od3Var = od3.d;
                } else if (methodName.equals("native_setSurface")) {
                    od3Var = od3.e;
                } else if (methodName.equals("releaseOutputBuffer")) {
                    od3Var = od3.f;
                } else if (methodName.equals("native_queueSecureInputBuffer")) {
                    od3Var = od3.g;
                } else if (z) {
                    od3Var = od3.h;
                }
                if (od3Var == null) {
                    return od3Var;
                }
                Throwable cause3 = th.getCause();
                od3 a = cause3 != null ? a(cause3) : null;
                return a == null ? od3.E : a;
            }
        }
        od3Var = null;
        if (od3Var == null) {
        }
    }
}
