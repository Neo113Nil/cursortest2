package com.squareup.cash.account.components;

import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.protos.franklin.investing.resources.StatementType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class AccountDocumentsViewKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle bannerStyle = AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle.BITCOIN_TAXES;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[StatementType.values().length];
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
