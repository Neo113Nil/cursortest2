package app.cash.local.views.wallet;

import app.cash.local.viewmodels.BrandFollowViewModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AddRemoveStateDialogModel {
    public final BrandFollowViewModel addRemoveState;
    public final LocalColor backgroundColor;
    public final int key;
    public final String locationArtwork;

    public AddRemoveStateDialogModel(int i, String str, LocalColor localColor, BrandFollowViewModel brandFollowViewModel) {
        localColor.getClass();
        brandFollowViewModel.getClass();
        this.key = i;
        this.locationArtwork = str;
        this.backgroundColor = localColor;
        this.addRemoveState = brandFollowViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddRemoveStateDialogModel)) {
            return false;
        }
        AddRemoveStateDialogModel addRemoveStateDialogModel = (AddRemoveStateDialogModel) obj;
        return this.key == addRemoveStateDialogModel.key && Intrinsics.areEqual(this.locationArtwork, addRemoveStateDialogModel.locationArtwork) && Intrinsics.areEqual(this.backgroundColor, addRemoveStateDialogModel.backgroundColor) && Intrinsics.areEqual(this.addRemoveState, addRemoveStateDialogModel.addRemoveState);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.key) * 31;
        String str = this.locationArtwork;
        return this.addRemoveState.hashCode() + ((this.backgroundColor.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("AddRemoveStateDialogModel(key=", this.key, ", locationArtwork=", this.locationArtwork, ", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", addRemoveState=");
        m.append(this.addRemoveState);
        m.append(")");
        return m.toString();
    }
}
