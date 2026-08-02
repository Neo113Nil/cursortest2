package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationFooterContentModel implements LocalBrandProfileSectionContent {
    public final String text;
    public final String versionName;

    public LocalBrandLocationFooterContentModel(String str, String str2) {
        str.getClass();
        this.text = str;
        this.versionName = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationFooterContentModel)) {
            return false;
        }
        LocalBrandLocationFooterContentModel localBrandLocationFooterContentModel = (LocalBrandLocationFooterContentModel) obj;
        return Intrinsics.areEqual(this.text, localBrandLocationFooterContentModel.text) && this.versionName.equals(localBrandLocationFooterContentModel.versionName);
    }

    public final int hashCode() {
        return this.versionName.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalBrandLocationFooterContentModel(text=", this.text, ", versionName=", this.versionName, ")");
    }
}
