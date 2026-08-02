package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationHoursContentModel implements LocalBrandProfileSectionContent {
    public final List dropdownOptions;
    public final List entries;
    public final DropdownOption selectedDropdownOption;
    public final LocationStatus status;

    public final class DropdownOption {
        public final LocalFulfillmentType fulfillmentType;
        public final String title;

        public DropdownOption(String str, LocalFulfillmentType localFulfillmentType) {
            str.getClass();
            this.title = str;
            this.fulfillmentType = localFulfillmentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DropdownOption)) {
                return false;
            }
            DropdownOption dropdownOption = (DropdownOption) obj;
            return Intrinsics.areEqual(this.title, dropdownOption.title) && this.fulfillmentType == dropdownOption.fulfillmentType;
        }

        public final int hashCode() {
            return this.fulfillmentType.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "DropdownOption(title=" + this.title + ", fulfillmentType=" + this.fulfillmentType + ")";
        }
    }

    public final class Entry {
        public final List ends;
        public final boolean highlight;
        public final String start;
        public final String startExtra;

        public Entry(String str, String str2, List list, boolean z) {
            list.getClass();
            this.start = str;
            this.startExtra = str2;
            this.ends = list;
            this.highlight = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(this.start, entry.start) && Intrinsics.areEqual(this.startExtra, entry.startExtra) && Intrinsics.areEqual(this.ends, entry.ends) && this.highlight == entry.highlight;
        }

        public final int hashCode() {
            String str = this.start;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.startExtra;
            return Boolean.hashCode(this.highlight) + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.ends);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Entry(start=", this.start, ", startExtra=", this.startExtra, ", ends=");
            m.append(this.ends);
            m.append(", highlight=");
            m.append(this.highlight);
            m.append(")");
            return m.toString();
        }
    }

    public LocalBrandLocationHoursContentModel(ArrayList arrayList, DropdownOption dropdownOption, LocationStatus locationStatus, List list) {
        dropdownOption.getClass();
        list.getClass();
        this.dropdownOptions = arrayList;
        this.selectedDropdownOption = dropdownOption;
        this.status = locationStatus;
        this.entries = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationHoursContentModel)) {
            return false;
        }
        LocalBrandLocationHoursContentModel localBrandLocationHoursContentModel = (LocalBrandLocationHoursContentModel) obj;
        return this.dropdownOptions.equals(localBrandLocationHoursContentModel.dropdownOptions) && Intrinsics.areEqual(this.selectedDropdownOption, localBrandLocationHoursContentModel.selectedDropdownOption) && this.status.equals(localBrandLocationHoursContentModel.status) && Intrinsics.areEqual(this.entries, localBrandLocationHoursContentModel.entries);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + Recorder$$ExternalSyntheticOutline2.m((this.status.hashCode() + ((this.selectedDropdownOption.hashCode() + (this.dropdownOptions.hashCode() * 31)) * 31)) * 31, 31, this.entries);
    }

    public final String toString() {
        return "LocalBrandLocationHoursContentModel(dropdownOptions=" + this.dropdownOptions + ", selectedDropdownOption=" + this.selectedDropdownOption + ", status=" + this.status + ", entries=" + this.entries + ", isDropdownExpandedForTests=false)";
    }
}
