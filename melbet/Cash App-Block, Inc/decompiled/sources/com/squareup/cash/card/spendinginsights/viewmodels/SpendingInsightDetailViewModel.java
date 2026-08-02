package com.squareup.cash.card.spendinginsights.viewmodels;

import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsight;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SpendingInsightDetailViewModel {

    public final class Content implements SpendingInsightDetailViewModel {
        public final StackedBarChartViewModel chart;
        public final Button primaryButton;
        public final List spendingAnalyses;
        public final String subtitle;
        public final ArrayList title;
        public final SpendingInsight.TitleSize titleSize;

        public final class Button {
            public final SpendingInsightDetailViewEvent action;
            public final Color buttonColor;
            public final Color textColor;
            public final String title;

            public Button(String str, Color color, Color color2, SpendingInsightDetailViewEvent spendingInsightDetailViewEvent) {
                this.title = str;
                this.textColor = color;
                this.buttonColor = color2;
                this.action = spendingInsightDetailViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return this.title.equals(button.title) && Intrinsics.areEqual(this.textColor, button.textColor) && Intrinsics.areEqual(this.buttonColor, button.buttonColor) && this.action.equals(button.action);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Color color = this.textColor;
                int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
                Color color2 = this.buttonColor;
                return this.action.hashCode() + ((hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Button(title=" + this.title + ", textColor=" + this.textColor + ", buttonColor=" + this.buttonColor + ", action=" + this.action + ")";
            }
        }

        public final class ColoredString {
            public final Color color;
            public final String text;

            public ColoredString(Color color, String str) {
                str.getClass();
                color.getClass();
                this.text = str;
                this.color = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColoredString)) {
                    return false;
                }
                ColoredString coloredString = (ColoredString) obj;
                return Intrinsics.areEqual(this.text, coloredString.text) && Intrinsics.areEqual(this.color, coloredString.color);
            }

            public final int hashCode() {
                return this.color.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "ColoredString(text=" + this.text + ", color=" + this.color + ")";
            }
        }

        public interface SpendingAnalysis {

            public final class Card implements SpendingAnalysis {
                public final Button button;
                public final String text;
                public final String title;

                public Card(String str, String str2, Button button) {
                    this.title = str;
                    this.text = str2;
                    this.button = button;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Card)) {
                        return false;
                    }
                    Card card = (Card) obj;
                    return this.title.equals(card.title) && Intrinsics.areEqual(this.text, card.text) && Intrinsics.areEqual(this.button, card.button);
                }

                @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel.Content.SpendingAnalysis
                public final Button getButton() {
                    return this.button;
                }

                @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel.Content.SpendingAnalysis
                public final String getText() {
                    return this.text;
                }

                @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel.Content.SpendingAnalysis
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.text;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Button button = this.button;
                    return hashCode2 + (button != null ? button.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Card(title=", this.title, ", text=", this.text, ", button=");
                    m.append(this.button);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class Inline implements SpendingAnalysis {
                public final Button button;
                public final Image icon;
                public final String text;
                public final String title;

                public Inline(String str, Image image, String str2, Button button) {
                    this.title = str;
                    this.icon = image;
                    this.text = str2;
                    this.button = button;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Inline)) {
                        return false;
                    }
                    Inline inline = (Inline) obj;
                    return this.title.equals(inline.title) && Intrinsics.areEqual(this.icon, inline.icon) && Intrinsics.areEqual(this.text, inline.text) && Intrinsics.areEqual(this.button, inline.button);
                }

                @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel.Content.SpendingAnalysis
                public final Button getButton() {
                    return this.button;
                }

                @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel.Content.SpendingAnalysis
                public final String getText() {
                    return this.text;
                }

                @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel.Content.SpendingAnalysis
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    Image image = this.icon;
                    int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
                    String str = this.text;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Button button = this.button;
                    return hashCode3 + (button != null ? button.hashCode() : 0);
                }

                public final String toString() {
                    return "Inline(title=" + this.title + ", icon=" + this.icon + ", text=" + this.text + ", button=" + this.button + ")";
                }
            }

            Button getButton();

            String getText();

            String getTitle();
        }

        public Content(ArrayList arrayList, SpendingInsight.TitleSize titleSize, String str, StackedBarChartViewModel stackedBarChartViewModel, ArrayList arrayList2, Button button) {
            this.title = arrayList;
            this.titleSize = titleSize;
            this.subtitle = str;
            this.chart = stackedBarChartViewModel;
            this.spendingAnalyses = arrayList2;
            this.primaryButton = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && this.titleSize == content.titleSize && Intrinsics.areEqual(this.subtitle, content.subtitle) && Intrinsics.areEqual(this.chart, content.chart) && Intrinsics.areEqual(this.spendingAnalyses, content.spendingAnalyses) && this.primaryButton.equals(content.primaryButton);
        }

        public final int hashCode() {
            int hashCode = (this.titleSize.hashCode() + (this.title.hashCode() * 31)) * 31;
            String str = this.subtitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            StackedBarChartViewModel stackedBarChartViewModel = this.chart;
            int hashCode3 = (hashCode2 + (stackedBarChartViewModel == null ? 0 : stackedBarChartViewModel.hashCode())) * 31;
            List list = this.spendingAnalyses;
            return this.primaryButton.hashCode() + ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Content(title=" + this.title + ", titleSize=" + this.titleSize + ", subtitle=" + this.subtitle + ", chart=" + this.chart + ", spendingAnalyses=" + this.spendingAnalyses + ", primaryButton=" + this.primaryButton + ")";
        }
    }

    public final class Loading implements SpendingInsightDetailViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1503905655;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
