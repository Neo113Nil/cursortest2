package app.cash.local.viewmodels;

import app.cash.local.primitives.MenuItemToken;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationMenuCarouselContentModel implements LocalBrandProfileSectionContent {
    public final ArrayList entries;

    public final class Entry {
        public final MenuItemAvailability availability;
        public final String discountText;
        public final LocalImage image;
        public final boolean isPreorder;
        public final String label;
        public final String token;

        public Entry(String str, LocalImage localImage, String str2, MenuItemAvailability menuItemAvailability, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.image = localImage;
            this.label = str2;
            this.availability = menuItemAvailability;
            this.discountText = str3;
            this.isPreorder = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(this.token, entry.token) && Intrinsics.areEqual(this.image, entry.image) && Intrinsics.areEqual(this.label, entry.label) && this.availability.equals(entry.availability) && Intrinsics.areEqual(this.discountText, entry.discountText) && this.isPreorder == entry.isPreorder;
        }

        public final int hashCode() {
            int hashCode = this.token.hashCode() * 31;
            LocalImage localImage = this.image;
            int hashCode2 = (this.availability.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.label)) * 31;
            String str = this.discountText;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isPreorder);
        }

        public final String toString() {
            String m1264toStringimpl = MenuItemToken.m1264toStringimpl(this.token);
            StringBuilder sb = new StringBuilder("Entry(token=");
            sb.append(m1264toStringimpl);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", availability=");
            sb.append(this.availability);
            sb.append(", discountText=");
            return re$$ExternalSyntheticOutline0.m(sb, this.discountText, ", isPreorder=", this.isPreorder, ", counterViewModel=null)");
        }
    }

    public LocalBrandLocationMenuCarouselContentModel(ArrayList arrayList) {
        this.entries = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBrandLocationMenuCarouselContentModel) && this.entries.equals(((LocalBrandLocationMenuCarouselContentModel) obj).entries);
    }

    public final int hashCode() {
        return this.entries.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("LocalBrandLocationMenuCarouselContentModel(entries=", ")", this.entries);
    }
}
