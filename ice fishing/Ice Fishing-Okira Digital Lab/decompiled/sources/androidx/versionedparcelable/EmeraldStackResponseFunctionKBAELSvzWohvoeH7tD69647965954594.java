package androidx.versionedparcelable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594 {
    public static final Uri RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final boolean ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594(String str, boolean z) {
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(str);
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = str;
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834("com.google.android.gms");
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = "com.google.android.gms";
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = z;
    }

    public final Intent ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context) {
        Bundle bundle;
        String str = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
            }
            r0 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r0 == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str));
            }
        }
        return r0 == null ? new Intent(str).setPackage(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) : r0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594)) {
            return false;
        }
        EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594 emeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594 = (EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594) obj;
        return RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, emeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) && RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, emeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) && RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(null, null) && this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == emeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, null, 4225, Boolean.valueOf(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495)});
    }

    public final String toString() {
        String str = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (str != null) {
            return str;
        }
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(null);
        throw null;
    }
}
