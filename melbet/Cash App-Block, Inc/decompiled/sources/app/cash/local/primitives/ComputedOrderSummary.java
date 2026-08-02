package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.order.RowIdentifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComputedOrderSummary implements Parcelable {
    public static final Parcelable.Creator<ComputedOrderSummary> CREATOR = new Line.Creator(1);
    public final String customerTipIdentifier;
    public final String grandTotalIdentifier;
    public final String localCashIdentifier;
    public final ArrayList rows;
    public final String subtotalIdentifier;
    public final String totalBeforeTipIdentifier;
    public final String totalWithoutDiscountsIdentifier;

    public final class DisplayRow implements Parcelable {
        public static final Parcelable.Creator<DisplayRow> CREATOR = new Line.Creator(2);
        public final boolean isBold;
        public final boolean isHighlighted;
        public final String label;
        public final String value;
        public final Visibility visibility;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Visibility {
            public static final /* synthetic */ Visibility[] $VALUES;
            public static final Visibility HIDDEN;
            public static final Visibility HIDDEN_IF_ZERO;
            public static final Visibility VISIBLE;

            static {
                Visibility visibility = new Visibility("VISIBLE", 0);
                VISIBLE = visibility;
                Visibility visibility2 = new Visibility("HIDDEN_IF_ZERO", 1);
                HIDDEN_IF_ZERO = visibility2;
                Visibility visibility3 = new Visibility("HIDDEN", 2);
                HIDDEN = visibility3;
                $VALUES = new Visibility[]{visibility, visibility2, visibility3};
            }

            public static Visibility valueOf(String str) {
                return (Visibility) Enum.valueOf(Visibility.class, str);
            }

            public static Visibility[] values() {
                return (Visibility[]) $VALUES.clone();
            }
        }

        public DisplayRow(String str, String str2, Visibility visibility, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            visibility.getClass();
            this.label = str;
            this.value = str2;
            this.visibility = visibility;
            this.isHighlighted = z;
            this.isBold = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayRow)) {
                return false;
            }
            DisplayRow displayRow = (DisplayRow) obj;
            return Intrinsics.areEqual(this.label, displayRow.label) && Intrinsics.areEqual(this.value, displayRow.value) && this.visibility == displayRow.visibility && this.isHighlighted == displayRow.isHighlighted && this.isBold == displayRow.isBold;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isBold) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.visibility.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.value)) * 31, 31, this.isHighlighted);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayRow(label=", this.label, ", value=", this.value, ", visibility=");
            m.append(this.visibility);
            m.append(", isHighlighted=");
            m.append(this.isHighlighted);
            m.append(", isBold=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isBold, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.label);
            parcel.writeString(this.value);
            parcel.writeString(this.visibility.name());
            parcel.writeInt(this.isHighlighted ? 1 : 0);
            parcel.writeInt(this.isBold ? 1 : 0);
        }
    }

    public final class Row implements Parcelable {
        public static final Parcelable.Creator<Row> CREATOR = new Line.Creator(3);
        public final LocalMoney amount;
        public final DisplayRow displayRow;
        public final String identifier;

        public Row(String str, LocalMoney localMoney, DisplayRow displayRow) {
            str.getClass();
            localMoney.getClass();
            this.identifier = str;
            this.amount = localMoney;
            this.displayRow = displayRow;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(this.identifier, row.identifier) && Intrinsics.areEqual(this.amount, row.amount) && Intrinsics.areEqual(this.displayRow, row.displayRow);
        }

        public final int hashCode() {
            int hashCode = (this.amount.hashCode() + (this.identifier.hashCode() * 31)) * 31;
            DisplayRow displayRow = this.displayRow;
            return hashCode + (displayRow == null ? 0 : displayRow.hashCode());
        }

        public final String toString() {
            return "Row(identifier=" + RowIdentifier.m1286toStringimpl(this.identifier) + ", amount=" + this.amount + ", displayRow=" + this.displayRow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.identifier);
            this.amount.writeToParcel(parcel, i);
            DisplayRow displayRow = this.displayRow;
            if (displayRow == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayRow.writeToParcel(parcel, i);
            }
        }
    }

    public ComputedOrderSummary(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6) {
        this.rows = arrayList;
        this.customerTipIdentifier = str;
        this.localCashIdentifier = str2;
        this.subtotalIdentifier = str3;
        this.totalBeforeTipIdentifier = str4;
        this.totalWithoutDiscountsIdentifier = str5;
        this.grandTotalIdentifier = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        if (this != obj) {
            if (obj instanceof ComputedOrderSummary) {
                ComputedOrderSummary computedOrderSummary = (ComputedOrderSummary) obj;
                if (this.rows.equals(computedOrderSummary.rows)) {
                    String str = computedOrderSummary.customerTipIdentifier;
                    String str2 = this.customerTipIdentifier;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals) {
                                String str3 = computedOrderSummary.localCashIdentifier;
                                String str4 = this.localCashIdentifier;
                                if (str4 == null) {
                                    if (str3 == null) {
                                        equals2 = true;
                                        if (equals2) {
                                            String str5 = computedOrderSummary.subtotalIdentifier;
                                            String str6 = this.subtotalIdentifier;
                                            if (str6 == null) {
                                                if (str5 == null) {
                                                    equals3 = true;
                                                    if (equals3) {
                                                        String str7 = computedOrderSummary.totalBeforeTipIdentifier;
                                                        String str8 = this.totalBeforeTipIdentifier;
                                                        if (str8 == null) {
                                                            if (str7 == null) {
                                                                equals4 = true;
                                                                if (equals4) {
                                                                    String str9 = computedOrderSummary.totalWithoutDiscountsIdentifier;
                                                                    String str10 = this.totalWithoutDiscountsIdentifier;
                                                                    if (str10 == null) {
                                                                        if (str9 == null) {
                                                                            equals5 = true;
                                                                            if (equals5) {
                                                                                String str11 = computedOrderSummary.grandTotalIdentifier;
                                                                                String str12 = this.grandTotalIdentifier;
                                                                                if (str12 == null) {
                                                                                    if (str11 == null) {
                                                                                        equals6 = true;
                                                                                        if (equals6) {
                                                                                        }
                                                                                    }
                                                                                    equals6 = false;
                                                                                    if (equals6) {
                                                                                    }
                                                                                } else {
                                                                                    if (str11 != null) {
                                                                                        equals6 = str12.equals(str11);
                                                                                        if (equals6) {
                                                                                        }
                                                                                    }
                                                                                    equals6 = false;
                                                                                    if (equals6) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        equals5 = false;
                                                                        if (equals5) {
                                                                        }
                                                                    } else {
                                                                        if (str9 != null) {
                                                                            equals5 = str10.equals(str9);
                                                                            if (equals5) {
                                                                            }
                                                                        }
                                                                        equals5 = false;
                                                                        if (equals5) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            equals4 = false;
                                                            if (equals4) {
                                                            }
                                                        } else {
                                                            if (str7 != null) {
                                                                equals4 = str8.equals(str7);
                                                                if (equals4) {
                                                                }
                                                            }
                                                            equals4 = false;
                                                            if (equals4) {
                                                            }
                                                        }
                                                    }
                                                }
                                                equals3 = false;
                                                if (equals3) {
                                                }
                                            } else {
                                                if (str5 != null) {
                                                    equals3 = str6.equals(str5);
                                                    if (equals3) {
                                                    }
                                                }
                                                equals3 = false;
                                                if (equals3) {
                                                }
                                            }
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                } else {
                                    if (str3 != null) {
                                        equals2 = str4.equals(str3);
                                        if (equals2) {
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                }
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.rows.hashCode() * 31;
        String str = this.customerTipIdentifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localCashIdentifier;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtotalIdentifier;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalBeforeTipIdentifier;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalWithoutDiscountsIdentifier;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.grandTotalIdentifier;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.customerTipIdentifier;
        String m1286toStringimpl = str == null ? "null" : RowIdentifier.m1286toStringimpl(str);
        String str2 = this.localCashIdentifier;
        String m1286toStringimpl2 = str2 == null ? "null" : RowIdentifier.m1286toStringimpl(str2);
        String str3 = this.subtotalIdentifier;
        String m1286toStringimpl3 = str3 == null ? "null" : RowIdentifier.m1286toStringimpl(str3);
        String str4 = this.totalBeforeTipIdentifier;
        String m1286toStringimpl4 = str4 == null ? "null" : RowIdentifier.m1286toStringimpl(str4);
        String str5 = this.totalWithoutDiscountsIdentifier;
        String m1286toStringimpl5 = str5 == null ? "null" : RowIdentifier.m1286toStringimpl(str5);
        String str6 = this.grandTotalIdentifier;
        String m1286toStringimpl6 = str6 != null ? RowIdentifier.m1286toStringimpl(str6) : "null";
        StringBuilder sb = new StringBuilder("ComputedOrderSummary(rows=");
        sb.append(this.rows);
        sb.append(", customerTipIdentifier=");
        sb.append(m1286toStringimpl);
        sb.append(", localCashIdentifier=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1286toStringimpl2, ", subtotalIdentifier=", m1286toStringimpl3, ", totalBeforeTipIdentifier=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1286toStringimpl4, ", totalWithoutDiscountsIdentifier=", m1286toStringimpl5, ", grandTotalIdentifier=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m1286toStringimpl6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.rows, parcel);
        while (m.hasNext()) {
            ((Row) m.next()).writeToParcel(parcel, i);
        }
        String str = this.customerTipIdentifier;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        String str2 = this.localCashIdentifier;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        String str3 = this.subtotalIdentifier;
        if (str3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str3);
        }
        String str4 = this.totalBeforeTipIdentifier;
        if (str4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str4);
        }
        String str5 = this.totalWithoutDiscountsIdentifier;
        if (str5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str5);
        }
        String str6 = this.grandTotalIdentifier;
        if (str6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str6);
        }
    }
}
