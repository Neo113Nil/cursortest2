package com.squareup.cash.investingcrypto.viewmodels.news;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingCryptoNewsViewEvent {

    public final class ArticleClicked implements InvestingCryptoNewsViewEvent {
        public final InvestingCryptoNewsArticleViewModel article;
        public final int positionInList;

        public ArticleClicked(InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel, int i) {
            investingCryptoNewsArticleViewModel.getClass();
            this.article = investingCryptoNewsArticleViewModel;
            this.positionInList = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleClicked)) {
                return false;
            }
            ArticleClicked articleClicked = (ArticleClicked) obj;
            return Intrinsics.areEqual(this.article, articleClicked.article) && this.positionInList == articleClicked.positionInList;
        }

        public final int hashCode() {
            return Integer.hashCode(this.positionInList) + (this.article.hashCode() * 31);
        }

        public final String toString() {
            return "ArticleClicked(article=" + this.article + ", positionInList=" + this.positionInList + ")";
        }
    }

    public final class ListScrolled implements InvestingCryptoNewsViewEvent {
        public static final ListScrolled INSTANCE = new ListScrolled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ListScrolled);
        }

        public final int hashCode() {
            return -150867626;
        }

        public final String toString() {
            return "ListScrolled";
        }
    }

    public final class ListViewed implements InvestingCryptoNewsViewEvent {
        public static final ListViewed INSTANCE = new ListViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ListViewed);
        }

        public final int hashCode() {
            return -364973650;
        }

        public final String toString() {
            return "ListViewed";
        }
    }

    public final class NavigationClicked implements InvestingCryptoNewsViewEvent {
        public static final NavigationClicked INSTANCE = new NavigationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationClicked);
        }

        public final int hashCode() {
            return -1633706873;
        }

        public final String toString() {
            return "NavigationClicked";
        }
    }

    public final class ViewAllArticlesClicked implements InvestingCryptoNewsViewEvent {
        public static final ViewAllArticlesClicked INSTANCE = new ViewAllArticlesClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewAllArticlesClicked);
        }

        public final int hashCode() {
            return -420694470;
        }

        public final String toString() {
            return "ViewAllArticlesClicked";
        }
    }
}
