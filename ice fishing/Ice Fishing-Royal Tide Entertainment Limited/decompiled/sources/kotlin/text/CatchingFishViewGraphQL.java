package kotlin.text;

import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.catchingfish.fishcatcherpro.presentation.settings.SettingsMusicActivity;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishViewGraphQL implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ KeyEvent.Callback CatchingFishSnackbar;

    public /* synthetic */ CatchingFishViewGraphQL(KeyEvent.Callback callback, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        MediaPlayer mediaPlayer;
        int i = this.CatchingFishParcelableFAB;
        KeyEvent.Callback callback = this.CatchingFishSnackbar;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) callback).CatchingFishEspressoTesting;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            default:
                SettingsMusicActivity settingsMusicActivity = (SettingsMusicActivity) callback;
                int i2 = SettingsMusicActivity.CatchingFishSensorManager;
                CatchingFishFirebaseDagger.CatchingFishNavigation(compoundButton, "<unused var>");
                CatchingFishMVPGson catchingFishMVPGson = (CatchingFishMVPGson) settingsMusicActivity.CatchingFishPayPalService.getValue();
                CatchingFishFluxGraphQL catchingFishFluxGraphQL = catchingFishMVPGson.CatchingFishSnackbar.CatchingFishParcelableFAB;
                catchingFishFluxGraphQL.CatchingFishCoroutine = z;
                if (!z && (mediaPlayer = (MediaPlayer) catchingFishFluxGraphQL.CatchingFishDaggerWebsocket) != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    catchingFishFluxGraphQL.CatchingFishSnackbar = mediaPlayer.getCurrentPosition();
                }
                if (z) {
                    catchingFishMVPGson.CatchingFishCoroutine.CatchingFishParcelableFAB();
                } else {
                    CatchingFishFluxGraphQL catchingFishFluxGraphQL2 = catchingFishMVPGson.CatchingFishReduxKtor.CatchingFishParcelableFAB;
                    MediaPlayer mediaPlayer2 = (MediaPlayer) catchingFishFluxGraphQL2.CatchingFishDaggerWebsocket;
                    if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                        mediaPlayer2.pause();
                        catchingFishFluxGraphQL2.CatchingFishSnackbar = mediaPlayer2.getCurrentPosition();
                    }
                }
                CatchingFishSpannableJUnit catchingFishSpannableJUnit = settingsMusicActivity.CatchingFishMutableLiveData;
                if (catchingFishSpannableJUnit != null) {
                    ((ImageView) catchingFishSpannableJUnit.CatchingFishViewModelFAB).setImageResource(z ? R.drawable.musicon : R.drawable.musicoff);
                    return;
                } else {
                    CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                    throw null;
                }
        }
    }
}
