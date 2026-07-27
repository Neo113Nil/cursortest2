package kotlin.text;

import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishGlideWidget implements Runnable {
    public final /* synthetic */ int CatchingFishReduxKtor;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            case 1:
            case 2:
            case 3:
            case 4:
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return;
            default:
                try {
                    int i = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging != null) {
                        CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().CatchingFishCoroutine();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public /* synthetic */ CatchingFishGlideWidget(int i, Bundle bundle, CatchingFishFragmentGlide catchingFishFragmentGlide) {
        this.CatchingFishReduxKtor = i;
    }

    public /* synthetic */ CatchingFishGlideWidget(CatchingFishFragmentGlide catchingFishFragmentGlide, String str, Bundle bundle, int i) {
        this.CatchingFishReduxKtor = i;
    }

    public CatchingFishGlideWidget(CatchingFishFragmentGlide catchingFishFragmentGlide, int i, Uri uri, boolean z, Bundle bundle) {
        this.CatchingFishReduxKtor = 4;
    }

    public CatchingFishGlideWidget(CatchingFishFragmentGlide catchingFishFragmentGlide, int i, int i2, Bundle bundle) {
        this.CatchingFishReduxKtor = 5;
    }

    public CatchingFishGlideWidget(CatchingFishFragmentGlide catchingFishFragmentGlide, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.CatchingFishReduxKtor = 7;
    }

    private final void CatchingFishCoroutine() {
    }

    private final void CatchingFishDaggerWebsocket() {
    }

    private final void CatchingFishLayout() {
    }

    private final void CatchingFishParcelableFAB() {
    }

    private final void CatchingFishReduxKtor() {
    }

    private final void CatchingFishSnackbar() {
    }

    private final void CatchingFishViewModelFAB() {
    }

    private final void CatchingFishViewModelScope() {
    }

    private final void CatchingFishWorkManager() {
    }
}
