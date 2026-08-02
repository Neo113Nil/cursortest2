package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface GridItemVisual {

    public final class Card implements GridItemVisual {
        public final StyledCardViewModel viewModel;

        public Card(StyledCardViewModel styledCardViewModel) {
            this.viewModel = styledCardViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Card) && this.viewModel.equals(((Card) obj).viewModel);
        }

        public final int hashCode() {
            return this.viewModel.hashCode();
        }

        public final String toString() {
            return "Card(viewModel=" + this.viewModel + ")";
        }
    }

    public final class Tag implements GridItemVisual {
        public final TagThemeViewModel viewModel;

        public Tag(TagThemeViewModel tagThemeViewModel) {
            this.viewModel = tagThemeViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Tag) && this.viewModel.equals(((Tag) obj).viewModel);
        }

        public final int hashCode() {
            return this.viewModel.hashCode();
        }

        public final String toString() {
            return "Tag(viewModel=" + this.viewModel + ")";
        }
    }
}
