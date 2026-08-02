package com.squareup.cash.bitcoin.viewmodels.performance.details;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.woodrow.model.v1.AssetAcquisition$AcquisitionType;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinPerformanceDetailsContentViewModel {
    public final String footer;
    public final List sections;

    public final class BitcoinPerformanceDetailsSection {
        public final List items;
        public final String sectionTitle;

        public BitcoinPerformanceDetailsSection(String str, List list) {
            str.getClass();
            list.getClass();
            this.sectionTitle = str;
            this.items = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinPerformanceDetailsSection)) {
                return false;
            }
            BitcoinPerformanceDetailsSection bitcoinPerformanceDetailsSection = (BitcoinPerformanceDetailsSection) obj;
            return Intrinsics.areEqual(this.sectionTitle, bitcoinPerformanceDetailsSection.sectionTitle) && Intrinsics.areEqual(this.items, bitcoinPerformanceDetailsSection.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.sectionTitle.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("BitcoinPerformanceDetailsSection(sectionTitle=", this.sectionTitle, ", items=", ")", this.items);
        }
    }

    public final class BitcoinPerformanceDetailsSectionItem {
        public final BitcoinPerformanceDetailsSectionInfoItem infoItem;
        public final String label;
        public final String labelContentDescription;
        public final String value;

        public BitcoinPerformanceDetailsSectionItem(String str, String str2, String str3, BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem) {
            str.getClass();
            str3.getClass();
            this.label = str;
            this.value = str2;
            this.labelContentDescription = str3;
            this.infoItem = bitcoinPerformanceDetailsSectionInfoItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinPerformanceDetailsSectionItem)) {
                return false;
            }
            BitcoinPerformanceDetailsSectionItem bitcoinPerformanceDetailsSectionItem = (BitcoinPerformanceDetailsSectionItem) obj;
            return Intrinsics.areEqual(this.label, bitcoinPerformanceDetailsSectionItem.label) && Intrinsics.areEqual(this.value, bitcoinPerformanceDetailsSectionItem.value) && Intrinsics.areEqual(this.labelContentDescription, bitcoinPerformanceDetailsSectionItem.labelContentDescription) && Intrinsics.areEqual(this.infoItem, bitcoinPerformanceDetailsSectionItem.infoItem);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.value), 31, this.labelContentDescription);
            BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = this.infoItem;
            return m + (bitcoinPerformanceDetailsSectionInfoItem == null ? 0 : bitcoinPerformanceDetailsSectionInfoItem.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinPerformanceDetailsSectionItem(label=", this.label, ", value=", this.value, ", labelContentDescription=");
            m.append(this.labelContentDescription);
            m.append(", infoItem=");
            m.append(this.infoItem);
            m.append(")");
            return m.toString();
        }
    }

    public BitcoinPerformanceDetailsContentViewModel(List list, String str) {
        list.getClass();
        this.sections = list;
        this.footer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinPerformanceDetailsContentViewModel)) {
            return false;
        }
        BitcoinPerformanceDetailsContentViewModel bitcoinPerformanceDetailsContentViewModel = (BitcoinPerformanceDetailsContentViewModel) obj;
        return Intrinsics.areEqual(this.sections, bitcoinPerformanceDetailsContentViewModel.sections) && Intrinsics.areEqual(this.footer, bitcoinPerformanceDetailsContentViewModel.footer);
    }

    public final int hashCode() {
        int hashCode = this.sections.hashCode() * 31;
        String str = this.footer;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BitcoinPerformanceDetailsContentViewModel(sections=" + this.sections + ", footer=" + this.footer + ")";
    }

    public final class BitcoinPerformanceDetailsSectionInfoItem {
        public final String body;
        public final String title;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1058type;

        public interface Type {

            public final class AcquisitionType implements Type {

                /* renamed from: type, reason: collision with root package name */
                public final AssetAcquisition$AcquisitionType f1059type;

                public AcquisitionType(AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType) {
                    this.f1059type = assetAcquisition$AcquisitionType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AcquisitionType) && this.f1059type == ((AcquisitionType) obj).f1059type;
                }

                public final int hashCode() {
                    return this.f1059type.hashCode();
                }

                public final String toString() {
                    return "AcquisitionType(type=" + this.f1059type + ")";
                }
            }

            public final class AllTimeType implements Type {

                /* renamed from: type, reason: collision with root package name */
                public final PerformanceDetailsUiSection.Row.ValueType f1060type;

                public AllTimeType(PerformanceDetailsUiSection.Row.ValueType valueType) {
                    this.f1060type = valueType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AllTimeType) && this.f1060type == ((AllTimeType) obj).f1060type;
                }

                public final int hashCode() {
                    return this.f1060type.hashCode();
                }

                public final String toString() {
                    return "AllTimeType(type=" + this.f1060type + ")";
                }
            }

            public final class DispositionType implements Type {

                /* renamed from: type, reason: collision with root package name */
                public final AssetDisposition$DispositionType f1061type;

                public DispositionType(AssetDisposition$DispositionType assetDisposition$DispositionType) {
                    this.f1061type = assetDisposition$DispositionType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof DispositionType) && this.f1061type == ((DispositionType) obj).f1061type;
                }

                public final int hashCode() {
                    return this.f1061type.hashCode();
                }

                public final String toString() {
                    return "DispositionType(type=" + this.f1061type + ")";
                }
            }
        }

        public BitcoinPerformanceDetailsSectionInfoItem(String str, String str2, Type type2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
            this.f1058type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinPerformanceDetailsSectionInfoItem)) {
                return false;
            }
            BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = (BitcoinPerformanceDetailsSectionInfoItem) obj;
            return Intrinsics.areEqual(this.title, bitcoinPerformanceDetailsSectionInfoItem.title) && Intrinsics.areEqual(this.body, bitcoinPerformanceDetailsSectionInfoItem.body) && Intrinsics.areEqual(this.f1058type, bitcoinPerformanceDetailsSectionInfoItem.f1058type);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            Type type2 = this.f1058type;
            return m + (type2 == null ? 0 : type2.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinPerformanceDetailsSectionInfoItem(title=", this.title, ", body=", this.body, ", type=");
            m.append(this.f1058type);
            m.append(")");
            return m.toString();
        }

        public /* synthetic */ BitcoinPerformanceDetailsSectionInfoItem() {
            this("Total", "Total value of all assets.", null);
        }
    }
}
