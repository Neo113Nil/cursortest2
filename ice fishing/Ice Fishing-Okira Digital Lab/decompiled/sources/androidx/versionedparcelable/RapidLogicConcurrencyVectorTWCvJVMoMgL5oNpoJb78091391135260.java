package androidx.versionedparcelable;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class RapidLogicConcurrencyVectorTWCvJVMoMgL5oNpoJb78091391135260 implements Parcelable {
    public static final Parcelable.Creator<RapidLogicConcurrencyVectorTWCvJVMoMgL5oNpoJb78091391135260> CREATOR = new EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827(2);
    public final Intent LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final IntentSender RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public RapidLogicConcurrencyVectorTWCvJVMoMgL5oNpoJb78091391135260(IntentSender intentSender, Intent intent, int i, int i2) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = intentSender;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = intent;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, i);
        parcel.writeParcelable(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, i);
        parcel.writeInt(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
        parcel.writeInt(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
    }
}
