package app.cash.local.primitives.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.LocationToken;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemToken;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalClientCartMenuItemAddedContext implements Parcelable {
    public static final Parcelable.Creator<LocalClientCartMenuItemAddedContext> CREATOR = new MenuItem.Creator(25);
    public final String brandToken;
    public final MenuItemAddedContextComboData comboData;
    public final String locationToken;
    public final Long menuItemCategoryIndex;
    public final String menuItemCategoryToken;
    public final Long menuItemIndex;
    public final Long reorderableSelectionIndex;
    public final ReorderableSelectionSource reorderableSelectionSource;

    public interface MenuItemAddedContextComboData extends Parcelable {

        public final class ComboItemContextData implements MenuItemAddedContextComboData {
            public static final Parcelable.Creator<ComboItemContextData> CREATOR = new MenuItem.Creator(26);
            public final String slotSelectionTokens;

            public ComboItemContextData(String str) {
                str.getClass();
                this.slotSelectionTokens = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ComboItemContextData) && Intrinsics.areEqual(this.slotSelectionTokens, ((ComboItemContextData) obj).slotSelectionTokens);
            }

            public final int hashCode() {
                return this.slotSelectionTokens.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboItemContextData(slotSelectionTokens=", this.slotSelectionTokens, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.slotSelectionTokens);
            }
        }

        public final class ComboSlotItemContextData implements MenuItemAddedContextComboData {
            public static final Parcelable.Creator<ComboSlotItemContextData> CREATOR = new MenuItem.Creator(27);
            public final String parentComboItemToken;
            public final int slotSectionIndex;
            public final String slotToken;

            public ComboSlotItemContextData(String str, String str2, int i) {
                str.getClass();
                str2.getClass();
                this.parentComboItemToken = str;
                this.slotToken = str2;
                this.slotSectionIndex = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ComboSlotItemContextData)) {
                    return false;
                }
                ComboSlotItemContextData comboSlotItemContextData = (ComboSlotItemContextData) obj;
                return Intrinsics.areEqual(this.parentComboItemToken, comboSlotItemContextData.parentComboItemToken) && Intrinsics.areEqual(this.slotToken, comboSlotItemContextData.slotToken) && this.slotSectionIndex == comboSlotItemContextData.slotSectionIndex;
            }

            public final int hashCode() {
                return Integer.hashCode(this.slotSectionIndex) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.parentComboItemToken.hashCode() * 31, 31, this.slotToken);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.slotSectionIndex, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboSlotItemContextData(parentComboItemToken=", MenuItemToken.m1264toStringimpl(this.parentComboItemToken), ", slotToken=", ComboSlotToken.m1233toStringimpl(this.slotToken), ", slotSectionIndex="));
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.parentComboItemToken);
                parcel.writeString(this.slotToken);
                parcel.writeInt(this.slotSectionIndex);
            }
        }

        public final class NonComboItemContextData implements MenuItemAddedContextComboData {
            public static final NonComboItemContextData INSTANCE = new NonComboItemContextData();
            public static final Parcelable.Creator<NonComboItemContextData> CREATOR = new MenuItem.Creator(28);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NonComboItemContextData);
            }

            public final int hashCode() {
                return 744283646;
            }

            public final String toString() {
                return "NonComboItemContextData";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ReorderableSelectionSource {
        public static final /* synthetic */ ReorderableSelectionSource[] $VALUES;
        public static final ReorderableSelectionSource BRAND_PROFILE;
        public static final ReorderableSelectionSource LOCAL_HOME;

        static {
            ReorderableSelectionSource reorderableSelectionSource = new ReorderableSelectionSource("LOCAL_HOME", 0);
            LOCAL_HOME = reorderableSelectionSource;
            ReorderableSelectionSource reorderableSelectionSource2 = new ReorderableSelectionSource("BRAND_PROFILE", 1);
            BRAND_PROFILE = reorderableSelectionSource2;
            $VALUES = new ReorderableSelectionSource[]{reorderableSelectionSource, reorderableSelectionSource2};
        }

        public static ReorderableSelectionSource valueOf(String str) {
            return (ReorderableSelectionSource) Enum.valueOf(ReorderableSelectionSource.class, str);
        }

        public static ReorderableSelectionSource[] values() {
            return (ReorderableSelectionSource[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LocalClientCartMenuItemAddedContext(String str, String str2, MenuItemAddedContextComboData menuItemAddedContextComboData, Long l, String str3, Long l2, Long l3, ReorderableSelectionSource reorderableSelectionSource, int i) {
        this(str, str2, menuItemAddedContextComboData, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : reorderableSelectionSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        boolean areEqual2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCartMenuItemAddedContext)) {
            return false;
        }
        LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = (LocalClientCartMenuItemAddedContext) obj;
        String str = localClientCartMenuItemAddedContext.brandToken;
        String str2 = this.brandToken;
        if (str2 == null) {
            if (str == null) {
                areEqual = true;
            }
            areEqual = false;
        } else {
            if (str != null) {
                areEqual = Intrinsics.areEqual(str2, str);
            }
            areEqual = false;
        }
        if (!areEqual) {
            return false;
        }
        String str3 = localClientCartMenuItemAddedContext.locationToken;
        String str4 = this.locationToken;
        if (str4 == null) {
            if (str3 == null) {
                areEqual2 = true;
            }
            areEqual2 = false;
        } else {
            if (str3 != null) {
                areEqual2 = Intrinsics.areEqual(str4, str3);
            }
            areEqual2 = false;
        }
        return areEqual2 && Intrinsics.areEqual(this.comboData, localClientCartMenuItemAddedContext.comboData) && Intrinsics.areEqual(this.menuItemIndex, localClientCartMenuItemAddedContext.menuItemIndex) && Intrinsics.areEqual(this.menuItemCategoryToken, localClientCartMenuItemAddedContext.menuItemCategoryToken) && Intrinsics.areEqual(this.menuItemCategoryIndex, localClientCartMenuItemAddedContext.menuItemCategoryIndex) && Intrinsics.areEqual(this.reorderableSelectionIndex, localClientCartMenuItemAddedContext.reorderableSelectionIndex) && this.reorderableSelectionSource == localClientCartMenuItemAddedContext.reorderableSelectionSource;
    }

    public final int hashCode() {
        String str = this.brandToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.locationToken;
        int hashCode2 = (this.comboData.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Long l = this.menuItemIndex;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.menuItemCategoryToken;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.menuItemCategoryIndex;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.reorderableSelectionIndex;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        ReorderableSelectionSource reorderableSelectionSource = this.reorderableSelectionSource;
        return hashCode6 + (reorderableSelectionSource != null ? reorderableSelectionSource.hashCode() : 0);
    }

    public final String toString() {
        String str = this.brandToken;
        String m1229toStringimpl = str == null ? "null" : BrandToken.m1229toStringimpl(str);
        String str2 = this.locationToken;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientCartMenuItemAddedContext(brandToken=", m1229toStringimpl, ", locationToken=", str2 != null ? LocationToken.m1252toStringimpl(str2) : "null", ", comboData=");
        m.append(this.comboData);
        m.append(", menuItemIndex=");
        m.append(this.menuItemIndex);
        m.append(", menuItemCategoryToken=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.menuItemCategoryIndex, this.menuItemCategoryToken, ", menuItemCategoryIndex=", ", reorderableSelectionIndex=", m);
        m.append(this.reorderableSelectionIndex);
        m.append(", reorderableSelectionSource=");
        m.append(this.reorderableSelectionSource);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        String str = this.brandToken;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        String str2 = this.locationToken;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        parcel.writeParcelable(this.comboData, i);
        Long l = this.menuItemIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.menuItemCategoryToken);
        Long l2 = this.menuItemCategoryIndex;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l2);
        }
        Long l3 = this.reorderableSelectionIndex;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l3);
        }
        ReorderableSelectionSource reorderableSelectionSource = this.reorderableSelectionSource;
        if (reorderableSelectionSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reorderableSelectionSource.name());
        }
    }

    public LocalClientCartMenuItemAddedContext(String str, String str2, MenuItemAddedContextComboData menuItemAddedContextComboData, Long l, String str3, Long l2, Long l3, ReorderableSelectionSource reorderableSelectionSource) {
        menuItemAddedContextComboData.getClass();
        this.brandToken = str;
        this.locationToken = str2;
        this.comboData = menuItemAddedContextComboData;
        this.menuItemIndex = l;
        this.menuItemCategoryToken = str3;
        this.menuItemCategoryIndex = l2;
        this.reorderableSelectionIndex = l3;
        this.reorderableSelectionSource = reorderableSelectionSource;
    }
}
