package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class CatchingFishIntentGson extends CatchingFishDaggerFlux {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishIntentGson(CatchingFishFragmentCameraX catchingFishFragmentCameraX, int i) {
        super(catchingFishFragmentCameraX);
        this.CatchingFishDaggerWebsocket = i;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public void CatchingFishNavigation() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishSnackbar;
                catchingFishFragmentCameraX.CatchingFishNavigation = null;
                CheckableImageButton checkableImageButton = catchingFishFragmentCameraX.CatchingFishFragmentHandler;
                checkableImageButton.setOnLongClickListener(null);
                CatchingFishRobolectricHilt.CatchingFishLayoutInflater(checkableImageButton, null);
                break;
        }
    }
}
