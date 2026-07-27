package kotlin.text;

import android.text.TextUtils;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFABMVVMWidget extends CatchingFishHiltRetrofit {
    public final /* synthetic */ int CatchingFishViewModelFAB;

    public CatchingFishFABMVVMWidget(int i, Class cls, int i2, int i3, int i4) {
        this.CatchingFishViewModelFAB = i4;
        this.CatchingFishReduxKtor = i;
        this.CatchingFishViewModelScope = cls;
        this.CatchingFishWorkManager = i2;
        this.CatchingFishDaggerWebsocket = i3;
    }

    @Override // kotlin.text.CatchingFishHiltRetrofit
    public final Object CatchingFishCoroutine(View view) {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(CatchingFishHandlerMoshi.CatchingFishCoroutine(view));
            case 1:
                return CatchingFishHandlerMoshi.CatchingFishParcelableFAB(view);
            default:
                return Boolean.valueOf(CatchingFishHandlerMoshi.CatchingFishSnackbar(view));
        }
    }

    @Override // kotlin.text.CatchingFishHiltRetrofit
    public final void CatchingFishReduxKtor(View view, Object obj) {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishHandlerMoshi.CatchingFishWorkManager(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                CatchingFishHandlerMoshi.CatchingFishDaggerWebsocket(view, (CharSequence) obj);
                break;
            default:
                CatchingFishHandlerMoshi.CatchingFishReduxKtor(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // kotlin.text.CatchingFishHiltRetrofit
    public final boolean CatchingFishViewModelScope(Object obj, Object obj2) {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
