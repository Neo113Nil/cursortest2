package com.squareup.cash.investing.viewmodels.metrics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingEarningsViewModel {

    public final class Content implements InvestingEarningsViewModel {
        public final ColorModel.Accented accentColor;
        public final String actualLabel;
        public final ArrayList earningsModels;
        public final String expectedLabel;
        public final ArrayList graphDetails;
        public final String title;

        public final class InvestingEarningsGraphModel {
            public final long actual;
            public final long expect;
            public final boolean hasActualEarnings;
            public final boolean hasExpectedEarnings;
            public final float minAmount;
            public final float rangeAmount;

            public InvestingEarningsGraphModel(boolean z, boolean z2, long j, long j2, float f, float f2) {
                this.hasExpectedEarnings = z;
                this.hasActualEarnings = z2;
                this.expect = j;
                this.actual = j2;
                this.rangeAmount = f;
                this.minAmount = f2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvestingEarningsGraphModel)) {
                    return false;
                }
                InvestingEarningsGraphModel investingEarningsGraphModel = (InvestingEarningsGraphModel) obj;
                return this.hasExpectedEarnings == investingEarningsGraphModel.hasExpectedEarnings && this.hasActualEarnings == investingEarningsGraphModel.hasActualEarnings && this.expect == investingEarningsGraphModel.expect && this.actual == investingEarningsGraphModel.actual && Float.compare(this.rangeAmount, investingEarningsGraphModel.rangeAmount) == 0 && Float.compare(this.minAmount, investingEarningsGraphModel.minAmount) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.minAmount) + CameraState$Type$EnumUnboxingLocalUtility.m(this.rangeAmount, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.hasExpectedEarnings) * 31, 31, this.hasActualEarnings), 31, this.expect), 31, this.actual), 31);
            }

            public final String toString() {
                StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("InvestingEarningsGraphModel(hasExpectedEarnings=", ", hasActualEarnings=", ", expect=", this.hasExpectedEarnings, this.hasActualEarnings);
                m.append(this.expect);
                Boxes$$ExternalSyntheticOutline1.m1151m(this.actual, ", actual=", ", rangeAmount=", m);
                m.append(this.rangeAmount);
                m.append(", minAmount=");
                m.append(this.minAmount);
                m.append(")");
                return m.toString();
            }
        }

        public Content(String str, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, ColorModel.Accented accented) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.earningsModels = arrayList;
            this.graphDetails = arrayList2;
            this.actualLabel = str2;
            this.expectedLabel = str3;
            this.accentColor = accented;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && this.earningsModels.equals(content.earningsModels) && this.graphDetails.equals(content.graphDetails) && Intrinsics.areEqual(this.actualLabel, content.actualLabel) && Intrinsics.areEqual(this.expectedLabel, content.expectedLabel) && this.accentColor.equals(content.accentColor);
        }

        public final int hashCode() {
            return this.accentColor.color.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.graphDetails, CameraState$Type$EnumUnboxingLocalUtility.m(this.earningsModels, this.title.hashCode() * 31, 31), 31), 31, this.actualLabel), 31, this.expectedLabel);
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.earningsModels, "Content(title=", this.title, ", earningsModels=", ", graphDetails=");
            m.append(this.graphDetails);
            m.append(", actualLabel=");
            m.append(this.actualLabel);
            m.append(", expectedLabel=");
            m.append(this.expectedLabel);
            m.append(", accentColor=");
            m.append(this.accentColor);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements InvestingEarningsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1927115053;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
