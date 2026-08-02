package app.cash.zipline.loader;

import com.google.android.gms.internal.mlkit_common.zzsr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public abstract class LoaderJniKt {
    public static zzsr zza;

    public static final OkHttpZiplineHttpClient asZiplineHttpClient(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        return new OkHttpZiplineHttpClient(okHttpClient);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFamilyPendingRequestsWithoutParams.deepLinkSpecs;
    }

    public static synchronized zzwp zzb(String str) {
        zzwp zzwpVar;
        synchronized (LoaderJniKt.class) {
            int i = 2;
            byte b = (byte) (((byte) (0 | 1)) | 2);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            zzwd zzwdVar = new zzwd(str, 1);
            synchronized (LoaderJniKt.class) {
                try {
                    if (zza == null) {
                        zza = new zzsr(i);
                    }
                    zzwpVar = (zzwp) zza.get(zzwdVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzwpVar;
        }
        return zzwpVar;
    }
}
