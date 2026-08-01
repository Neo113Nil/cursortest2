package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.datatransport.WinterFlowJavaConsumer;
import com.google.android.datatransport.WinterFlowStackFramework;
import com.google.android.datatransport.WinterFlowThreadPool;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new WinterFlowStackFramework(4);
    public final WinterFlowJavaConsumer WinterFlowVariableVersionControl;

    public ParcelImpl(Parcel parcel) {
        this.WinterFlowVariableVersionControl = new WinterFlowThreadPool(parcel).WinterFlowUnitTestResponse();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new WinterFlowThreadPool(parcel).WinterFlowSyntax(this.WinterFlowVariableVersionControl);
    }
}
