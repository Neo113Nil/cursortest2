package kotlin.text;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIKtor implements CatchingFishGsonBundleMoshi, CatchingFishIntentReduxMVVM {
    public ClipData CatchingFishDaggerWebsocket;
    public Bundle CatchingFishLayout;
    public final /* synthetic */ int CatchingFishReduxKtor = 0;
    public Uri CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public /* synthetic */ CatchingFishStripeAPIKtor() {
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public ContentInfo CatchingFishCloudMessaging() {
        return null;
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public int CatchingFishFragmentHandler() {
        return this.CatchingFishViewModelScope;
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public void CatchingFishOkHttp(Uri uri) {
        this.CatchingFishViewModelFAB = uri;
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public ClipData CatchingFishReduxKtor() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public void CatchingFishRoomDatabase(int i) {
        this.CatchingFishViewModelScope = i;
    }

    @Override // kotlin.text.CatchingFishIntentReduxMVVM
    public int CatchingFishUnitTesting() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public CatchingFishMVIOkHttp build() {
        return new CatchingFishMVIOkHttp(new CatchingFishStripeAPIKtor(this));
    }

    @Override // kotlin.text.CatchingFishGsonBundleMoshi
    public void setExtras(Bundle bundle) {
        this.CatchingFishLayout = bundle;
    }

    public String toString() {
        String str;
        switch (this.CatchingFishReduxKtor) {
            case 1:
                Uri uri = this.CatchingFishViewModelFAB;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.CatchingFishDaggerWebsocket.getDescription());
                sb.append(", source=");
                int i = this.CatchingFishWorkManager;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.CatchingFishViewModelScope;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, this.CatchingFishLayout != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public CatchingFishStripeAPIKtor(CatchingFishStripeAPIKtor catchingFishStripeAPIKtor) {
        ClipData clipData = catchingFishStripeAPIKtor.CatchingFishDaggerWebsocket;
        clipData.getClass();
        this.CatchingFishDaggerWebsocket = clipData;
        int i = catchingFishStripeAPIKtor.CatchingFishWorkManager;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.CatchingFishWorkManager = i;
        int i2 = catchingFishStripeAPIKtor.CatchingFishViewModelScope;
        if ((i2 & 1) == i2) {
            this.CatchingFishViewModelScope = i2;
            this.CatchingFishViewModelFAB = catchingFishStripeAPIKtor.CatchingFishViewModelFAB;
            this.CatchingFishLayout = catchingFishStripeAPIKtor.CatchingFishLayout;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
