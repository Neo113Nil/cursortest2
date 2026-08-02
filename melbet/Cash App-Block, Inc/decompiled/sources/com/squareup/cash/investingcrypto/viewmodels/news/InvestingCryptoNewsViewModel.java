package com.squareup.cash.investingcrypto.viewmodels.news;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingCryptoNewsViewModel {
    public final List articles;
    public final String title;
    public final InvestingCryptoViewAllNewsModel viewAll;

    public InvestingCryptoNewsViewModel(List list, String str, InvestingCryptoViewAllNewsModel investingCryptoViewAllNewsModel) {
        list.getClass();
        str.getClass();
        this.articles = list;
        this.title = str;
        this.viewAll = investingCryptoViewAllNewsModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingCryptoNewsViewModel)) {
            return false;
        }
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
        return Intrinsics.areEqual(this.articles, investingCryptoNewsViewModel.articles) && Intrinsics.areEqual(this.title, investingCryptoNewsViewModel.title) && Intrinsics.areEqual(this.viewAll, investingCryptoNewsViewModel.viewAll);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.articles.hashCode() * 31, 31, this.title);
        InvestingCryptoViewAllNewsModel investingCryptoViewAllNewsModel = this.viewAll;
        return m + (investingCryptoViewAllNewsModel == null ? 0 : investingCryptoViewAllNewsModel.accentColor.hashCode());
    }

    public final String toString() {
        StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("InvestingCryptoNewsViewModel(articles=", ", title=", this.title, ", viewAll=", this.articles);
        m.append(this.viewAll);
        m.append(")");
        return m.toString();
    }
}
