package androidx.versionedparcelable;

import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class TitanCloudNamespaceFilterFqvELqi23qhuFsnoAT60884039266352 extends AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568 {
    public final /* synthetic */ int CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;

    public /* synthetic */ TitanCloudNamespaceFilterFqvELqi23qhuFsnoAT60884039266352(int i) {
        this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = i;
    }

    @Override // androidx.versionedparcelable.AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568
    public final Object CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070(Intent intent, int i) {
        switch (this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (intArrayExtra[i2] == 0) {
                                z = true;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new XenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113(intent, i);
        }
    }

    @Override // androidx.versionedparcelable.AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568
    public final Intent PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(Context context, Object obj) {
        switch (this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                putExtra.getClass();
                return putExtra;
            default:
                return (Intent) obj;
        }
    }

    @Override // androidx.versionedparcelable.AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568
    public IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(Context context, Object obj) {
        switch (this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(context, (String) obj) == 0) {
                    return new IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406(5, Boolean.TRUE);
                }
                return null;
            default:
                return super.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(context, obj);
        }
    }
}
