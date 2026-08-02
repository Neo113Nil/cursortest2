package com.squareup.cash.investing.viewmodels.metrics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingAnalystOpinionsViewModel$Content extends X509CertChainUtils {
    public final ColorModel.Accented accentColor;
    public final InvestingAnalystOpinionsGraphModel analystOpinionsModels;
    public final List detailLabels;
    public final String label;
    public final String title;

    public final class InvestingAnalystOpinionsGraphModel {
        public final String recommendLabel;
        public final int score;

        public InvestingAnalystOpinionsGraphModel(String str, int i) {
            str.getClass();
            this.recommendLabel = str;
            this.score = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestingAnalystOpinionsGraphModel)) {
                return false;
            }
            InvestingAnalystOpinionsGraphModel investingAnalystOpinionsGraphModel = (InvestingAnalystOpinionsGraphModel) obj;
            return Intrinsics.areEqual(this.recommendLabel, investingAnalystOpinionsGraphModel.recommendLabel) && this.score == investingAnalystOpinionsGraphModel.score;
        }

        public final int hashCode() {
            return Integer.hashCode(this.score) + (this.recommendLabel.hashCode() * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m("InvestingAnalystOpinionsGraphModel(recommendLabel=", this.score, this.recommendLabel, ", score=", ")");
        }
    }

    public InvestingAnalystOpinionsViewModel$Content(String str, InvestingAnalystOpinionsGraphModel investingAnalystOpinionsGraphModel, List list, String str2, ColorModel.Accented accented) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.analystOpinionsModels = investingAnalystOpinionsGraphModel;
        this.detailLabels = list;
        this.label = str2;
        this.accentColor = accented;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingAnalystOpinionsViewModel$Content)) {
            return false;
        }
        InvestingAnalystOpinionsViewModel$Content investingAnalystOpinionsViewModel$Content = (InvestingAnalystOpinionsViewModel$Content) obj;
        return Intrinsics.areEqual(this.title, investingAnalystOpinionsViewModel$Content.title) && this.analystOpinionsModels.equals(investingAnalystOpinionsViewModel$Content.analystOpinionsModels) && Intrinsics.areEqual(this.detailLabels, investingAnalystOpinionsViewModel$Content.detailLabels) && this.label.equals(investingAnalystOpinionsViewModel$Content.label) && this.accentColor.equals(investingAnalystOpinionsViewModel$Content.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.color.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.analystOpinionsModels.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.detailLabels), 31, this.label);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(title=");
        sb.append(this.title);
        sb.append(", analystOpinionsModels=");
        sb.append(this.analystOpinionsModels);
        sb.append(", detailLabels=");
        Recorder$$ExternalSyntheticOutline2.m(", label=", this.label, ", accentColor=", sb, this.detailLabels);
        sb.append(this.accentColor);
        sb.append(")");
        return sb.toString();
    }
}
