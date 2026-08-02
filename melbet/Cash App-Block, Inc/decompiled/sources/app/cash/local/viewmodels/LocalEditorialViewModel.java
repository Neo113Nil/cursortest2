package app.cash.local.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalEditorialViewModel implements CanWorkAsync {
    public final List contents;
    public final boolean isLoading;
    public final boolean showShareButton;
    public final String title;

    public LocalEditorialViewModel(String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.isLoading = z;
        this.title = str;
        this.showShareButton = z2;
        this.contents = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalEditorialViewModel)) {
            return false;
        }
        LocalEditorialViewModel localEditorialViewModel = (LocalEditorialViewModel) obj;
        return this.isLoading == localEditorialViewModel.isLoading && Intrinsics.areEqual(this.title, localEditorialViewModel.title) && this.showShareButton == localEditorialViewModel.showShareButton && Intrinsics.areEqual(this.contents, localEditorialViewModel.contents);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.title;
        return this.contents.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showShareButton);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.isLoading;
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("LocalEditorialViewModel(isLoading=", ", title=", this.title, ", showShareButton=", this.isLoading);
        m.append(this.showShareButton);
        m.append(", contents=");
        m.append(this.contents);
        m.append(")");
        return m.toString();
    }
}
