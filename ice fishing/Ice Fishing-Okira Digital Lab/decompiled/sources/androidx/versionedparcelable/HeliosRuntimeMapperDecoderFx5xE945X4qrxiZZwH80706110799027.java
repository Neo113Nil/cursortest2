package androidx.versionedparcelable;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class HeliosRuntimeMapperDecoderFx5xE945X4qrxiZZwH80706110799027 extends AsyncTaskExecutor {
    public final /* synthetic */ AdjustInstance ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final /* synthetic */ OnLastDeeplinkReadListener AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ Context ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public HeliosRuntimeMapperDecoderFx5xE945X4qrxiZZwH80706110799027(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = adjustInstance;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = context;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        String cachedDeeplink;
        cachedDeeplink = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.getCachedDeeplink(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        try {
            return Uri.parse(cachedDeeplink);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.onLastDeeplinkRead((Uri) obj);
    }
}
