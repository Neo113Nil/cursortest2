package com.squareup.cash.investing.viewmodels;

import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingStockSelectionViewEvent {

    public final class MultiSelectStockClicked implements InvestingStockSelectionViewEvent {
        public final InvestmentEntityToken entityToken;
        public final String symbol;

        public MultiSelectStockClicked(InvestmentEntityToken investmentEntityToken, String str) {
            investmentEntityToken.getClass();
            str.getClass();
            this.entityToken = investmentEntityToken;
            this.symbol = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiSelectStockClicked)) {
                return false;
            }
            MultiSelectStockClicked multiSelectStockClicked = (MultiSelectStockClicked) obj;
            return Intrinsics.areEqual(this.entityToken, multiSelectStockClicked.entityToken) && Intrinsics.areEqual(this.symbol, multiSelectStockClicked.symbol);
        }

        public final int hashCode() {
            return this.symbol.hashCode() + (this.entityToken.value.hashCode() * 31);
        }

        public final String toString() {
            return "MultiSelectStockClicked(entityToken=" + this.entityToken + ", symbol=" + this.symbol + ")";
        }
    }

    public final class NavigationClicked implements InvestingStockSelectionViewEvent {
        public static final NavigationClicked INSTANCE = new NavigationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationClicked);
        }

        public final int hashCode() {
            return -1057766301;
        }

        public final String toString() {
            return "NavigationClicked";
        }
    }

    public final class SearchTextChanged implements InvestingStockSelectionViewEvent {
        public final TextFieldStateInputFieldText text;

        public SearchTextChanged(TextFieldStateInputFieldText textFieldStateInputFieldText) {
            this.text = textFieldStateInputFieldText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && this.text.equals(((SearchTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.textFieldState.hashCode();
        }

        public final String toString() {
            return "SearchTextChanged(text=" + this.text + ")";
        }
    }

    public final class SelectStockClicked implements InvestingStockSelectionViewEvent {
        public final InvestmentEntityToken entityToken;

        public SelectStockClicked(InvestmentEntityToken investmentEntityToken) {
            investmentEntityToken.getClass();
            this.entityToken = investmentEntityToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectStockClicked) && Intrinsics.areEqual(this.entityToken, ((SelectStockClicked) obj).entityToken);
        }

        public final int hashCode() {
            return this.entityToken.value.hashCode();
        }

        public final String toString() {
            return "SelectStockClicked(entityToken=" + this.entityToken + ")";
        }
    }

    public final class SubmitMultiSelection implements InvestingStockSelectionViewEvent {
        public final Set entities;

        public SubmitMultiSelection(Set set) {
            this.entities = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitMultiSelection) && Intrinsics.areEqual(this.entities, ((SubmitMultiSelection) obj).entities);
        }

        public final int hashCode() {
            Set set = this.entities;
            if (set == null) {
                return 0;
            }
            return set.hashCode();
        }

        public final String toString() {
            return "SubmitMultiSelection(entities=" + this.entities + ")";
        }
    }

    public final class ViewStockClicked implements InvestingStockSelectionViewEvent {
        public final InvestmentEntityToken entityToken;

        public ViewStockClicked(InvestmentEntityToken investmentEntityToken) {
            investmentEntityToken.getClass();
            this.entityToken = investmentEntityToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewStockClicked) && Intrinsics.areEqual(this.entityToken, ((ViewStockClicked) obj).entityToken);
        }

        public final int hashCode() {
            return this.entityToken.value.hashCode();
        }

        public final String toString() {
            return "ViewStockClicked(entityToken=" + this.entityToken + ")";
        }
    }
}
