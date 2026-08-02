package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCashAllActivityViewModel {
    public final List sections;

    public final class Section {
        public final String header;
        public final List rows;

        public Section(String str, List list) {
            list.getClass();
            this.header = str;
            this.rows = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(this.header, section.header) && Intrinsics.areEqual(this.rows, section.rows);
        }

        public final int hashCode() {
            String str = this.header;
            return this.rows.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Section(header=", this.header, ", rows=", ")", this.rows);
        }
    }

    public LocalCashAllActivityViewModel(List list) {
        list.getClass();
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalCashAllActivityViewModel) && Intrinsics.areEqual(this.sections, ((LocalCashAllActivityViewModel) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("LocalCashAllActivityViewModel(sections=", ")", this.sections);
    }
}
