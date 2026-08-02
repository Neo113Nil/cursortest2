package com.squareup.cash.account.presenters.documents;

import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.data.profile.documents.AccountStatementsManager$AccountStatementsInfo;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountDocumentsPresenter$documentCategoryViewModel$3 extends AdaptedFunctionReference implements Function15 {
    public static final AccountDocumentsPresenter$documentCategoryViewModel$3 INSTANCE = new AccountDocumentsPresenter$documentCategoryViewModel$3(15, AccountDocumentsPresenter.CategoryContent.class, "<init>", "<init>(Lcom/squareup/cash/data/profile/documents/AccountStatementsManager$AccountStatementsInfo;Lcom/squareup/cash/data/profile/documents/AccountStatementsManager$AccountStatementsInfo;ZLcom/squareup/cash/data/profile/documents/AccountStatementsManager$AccountStatementsInfo;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/squareup/cash/data/profile/documents/AccountStatementsManager$AccountStatementsInfo;Z)V", 4);

    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        boolean booleanValue = ((Boolean) obj14).booleanValue();
        Calendar calendar = AccountDocumentsPresenter.cal;
        return new AccountDocumentsPresenter.CategoryContent((AccountStatementsManager$AccountStatementsInfo) obj, (AccountStatementsManager$AccountStatementsInfo) obj2, ((Boolean) obj3).booleanValue(), (AccountStatementsManager$AccountStatementsInfo) obj4, ((Boolean) obj5).booleanValue(), ((Boolean) obj6).booleanValue(), (List) obj7, (List) obj8, (String) obj9, (String) obj10, ((Boolean) obj11).booleanValue(), ((Boolean) obj12).booleanValue(), (AccountStatementsManager$AccountStatementsInfo) obj13, booleanValue);
    }
}
