package com.knotapi.knot.interfaces;

/* loaded from: classes4.dex */
public interface MerchantViewListener {
    void hideBottomFragment();

    boolean isErrorViewVisible();

    boolean isLoaderVisible();

    void loadTransactionUrl(String str);

    void sendPageUrl(String str);

    void sendRunningEvent(String str, String str2);

    void setLoaderVisibility(int i);

    void showErrorView(String str);

    void toggleBackButton(boolean z);
}
