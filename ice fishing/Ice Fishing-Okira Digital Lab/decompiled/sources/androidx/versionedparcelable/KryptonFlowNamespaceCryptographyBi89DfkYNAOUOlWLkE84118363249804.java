package androidx.versionedparcelable;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class KryptonFlowNamespaceCryptographyBi89DfkYNAOUOlWLkE84118363249804 extends ZenithPathEventLoopDecryptionFG60tqolg4RmJ9s1dg73071211207465 {
    public final OnBackInvokedDispatcher ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final OnBackInvokedCallback LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public KryptonFlowNamespaceCryptographyBi89DfkYNAOUOlWLkE84118363249804(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = onBackInvokedDispatcher;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = Build.VERSION.SDK_INT == 33 ? new BlueKernelEngineManagerKSqffEHW70avLZfw7m54560246106692(1, this) : new KryptonFlowIteratorConcurrencyXGN4orcdnfU6FKZmRU57431914272467(this);
    }

    @Override // androidx.versionedparcelable.ZenithPathEventLoopDecryptionFG60tqolg4RmJ9s1dg73071211207465
    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (z && !this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
            this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.registerOnBackInvokedCallback(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, onBackInvokedCallback);
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = true;
        } else {
            if (z || !this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                return;
            }
            this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = false;
        }
    }
}
