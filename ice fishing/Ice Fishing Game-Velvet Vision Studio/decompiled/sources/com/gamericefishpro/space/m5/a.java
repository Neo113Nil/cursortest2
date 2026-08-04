package com.gamericefishpro.space.m5;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.c6.c;
import com.gamericefishpro.space.h2.d;
import com.gamericefishpro.space.i9.x4;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.oh.e;
import com.gamericefishpro.space.t0.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(int i) {
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case i.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int b(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case i.STRING_FIELD_NUMBER /* 5 */:
                return 4;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return 5;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case RequestError.STOP_TRACKING /* 11 */:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int c(int i, int i2, int i3) {
        return x4.g0(i) + i2 + i3;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return x4.g0(i) + i2 + i3 + i4;
    }

    public static e e(String str) {
        com.gamericefishpro.space.e2.a.c(str);
        return new e();
    }

    public static ClassCastException f(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String j(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder k(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap m(Class cls, com.gamericefishpro.space.jb.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map n(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void o(int i, r rVar, com.gamericefishpro.space.h2.e eVar, r rVar2, d dVar) {
        com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(i), eVar);
        com.gamericefishpro.space.t0.i.x(rVar2, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(c cVar) throws Exception {
        boolean zIsTerminated;
        if (cVar instanceof AutoCloseable) {
            cVar.close();
            return;
        }
        if (!(cVar instanceof ExecutorService)) {
            if (cVar instanceof TypedArray) {
                ((TypedArray) cVar).recycle();
                return;
            } else if (cVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cVar).release();
                return;
            } else {
                if (!(cVar instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) cVar).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
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

    public static void q(com.gamericefishpro.space.hc.c cVar, Class cls, Class cls2, Class cls3, Class cls4) {
        cVar.register(cls).provides(cls2);
        cVar.register(cls3).provides(cls4);
    }

    public static /* synthetic */ void r(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
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

    public static /* synthetic */ void s(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static int t(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static String u(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case i.STRING_FIELD_NUMBER /* 5 */:
                return "NON_PLAY_MODE";
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SDK_TOO_OLD";
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "MISSING_JOB_SCHEDULER";
            case i.BYTES_FIELD_NUMBER /* 8 */:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case RequestError.STOP_TRACKING /* 11 */:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case i.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case i.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
