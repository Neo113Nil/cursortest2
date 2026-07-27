package androidx.versionedparcelable;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113 implements Parcelable {
    public static final Parcelable.Creator<XenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113> CREATOR = new EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827(0);
    public final Intent LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public XenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113(Intent intent, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        Intent intent = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
