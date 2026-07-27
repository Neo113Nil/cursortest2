package com.catchingfish.fishcatcherpro.presentation.menu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.catchingfish.fishcatcherpro.presentation.info.GameInfoActivity;
import com.catchingfish.fishcatcherpro.presentation.menu.MenuGameActivity;
import com.catchingfish.fishcatcherpro.presentation.play.PlayActivity;
import com.catchingfish.fishcatcherpro.presentation.settings.SettingsMusicActivity;
import kotlin.text.CatchingFishAdMobStripeAPI;
import kotlin.text.CatchingFishBundleAndroidX;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishFluxGraphQL;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitGlide;
import kotlin.text.CatchingFishKtorHiltIntent;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishSensorManager;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
public final class MenuGameActivity extends AppCompatActivity {
    public static final /* synthetic */ int CatchingFishSensorManager = 0;
    public final CatchingFishKtorHiltIntent CatchingFishJobScheduler;
    public CatchingFishSensorManager CatchingFishMutableLiveData;
    public final CatchingFishKtorHiltIntent CatchingFishPayPalService;

    public MenuGameActivity() {
        final int i = 0;
        this.CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishJUnitGlide(this) { // from class: kotlin.text.CatchingFishViewAdMobRoom
            public final /* synthetic */ MenuGameActivity CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // kotlin.text.CatchingFishJUnitGlide
            public final Object CatchingFishParcelableFAB() {
                int i2 = i;
                MenuGameActivity menuGameActivity = this.CatchingFishDaggerWebsocket;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        int i3 = MenuGameActivity.CatchingFishSensorManager;
                        return CatchingFishAdMobFAB.CatchingFishGsonAppCompat(menuGameActivity);
                    default:
                        int i4 = MenuGameActivity.CatchingFishSensorManager;
                        return new CatchingFishAdMobStripeAPI(menuGameActivity.CatchingFishUnitTesting().CatchingFishDaggerWebsocket, menuGameActivity.CatchingFishUnitTesting().CatchingFishWorkManager, menuGameActivity.CatchingFishUnitTesting().CatchingFishViewModelFAB, menuGameActivity.CatchingFishUnitTesting().CatchingFishLayout);
                }
            }
        });
        final int i2 = 1;
        this.CatchingFishPayPalService = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishJUnitGlide(this) { // from class: kotlin.text.CatchingFishViewAdMobRoom
            public final /* synthetic */ MenuGameActivity CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // kotlin.text.CatchingFishJUnitGlide
            public final Object CatchingFishParcelableFAB() {
                int i22 = i2;
                MenuGameActivity menuGameActivity = this.CatchingFishDaggerWebsocket;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        int i3 = MenuGameActivity.CatchingFishSensorManager;
                        return CatchingFishAdMobFAB.CatchingFishGsonAppCompat(menuGameActivity);
                    default:
                        int i4 = MenuGameActivity.CatchingFishSensorManager;
                        return new CatchingFishAdMobStripeAPI(menuGameActivity.CatchingFishUnitTesting().CatchingFishDaggerWebsocket, menuGameActivity.CatchingFishUnitTesting().CatchingFishWorkManager, menuGameActivity.CatchingFishUnitTesting().CatchingFishViewModelFAB, menuGameActivity.CatchingFishUnitTesting().CatchingFishLayout);
                }
            }
        });
    }

    public final CatchingFishBundleAndroidX CatchingFishUnitTesting() {
        return (CatchingFishBundleAndroidX) this.CatchingFishJobScheduler.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_menu_game, (ViewGroup) null, false);
        int i = R.id.infoGame;
        TextView textView = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.infoGame);
        if (textView != null) {
            i = R.id.quit;
            TextView textView2 = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.quit);
            if (textView2 != null) {
                i = R.id.settingsButton;
                TextView textView3 = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.settingsButton);
                if (textView3 != null) {
                    i = R.id.startButton;
                    TextView textView4 = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.startButton);
                    if (textView4 != null) {
                        i = R.id.view;
                        if (CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.view) != null) {
                            this.CatchingFishMutableLiveData = new CatchingFishSensorManager((ConstraintLayout) inflate, textView, textView2, textView3, textView4);
                            CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = CatchingFishUnitTesting().CatchingFishCoroutine;
                            CatchingFishSensorManager catchingFishSensorManager = this.CatchingFishMutableLiveData;
                            if (catchingFishSensorManager == null) {
                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                throw null;
                            }
                            ConstraintLayout constraintLayout = (ConstraintLayout) catchingFishSensorManager.CatchingFishReduxKtor;
                            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(constraintLayout, "getRoot(...)");
                            catchingFishMVPExoPlayer.CatchingFishEspressoTesting(this, constraintLayout);
                            CatchingFishSensorManager catchingFishSensorManager2 = this.CatchingFishMutableLiveData;
                            if (catchingFishSensorManager2 == null) {
                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                throw null;
                            }
                            setContentView((ConstraintLayout) catchingFishSensorManager2.CatchingFishReduxKtor);
                            ((CatchingFishAdMobStripeAPI) this.CatchingFishPayPalService.getValue()).CatchingFishParcelableFAB();
                            CatchingFishSensorManager catchingFishSensorManager3 = this.CatchingFishMutableLiveData;
                            if (catchingFishSensorManager3 == null) {
                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                throw null;
                            }
                            final int i2 = 0;
                            ((TextView) catchingFishSensorManager3.CatchingFishViewModelFAB).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishOkHttpCardView
                                public final /* synthetic */ MenuGameActivity CatchingFishDaggerWebsocket;

                                {
                                    this.CatchingFishDaggerWebsocket = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i3 = i2;
                                    MenuGameActivity menuGameActivity = this.CatchingFishDaggerWebsocket;
                                    switch (i3) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            int i4 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) PlayActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 1:
                                            int i5 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) SettingsMusicActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 2:
                                            int i6 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) GameInfoActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        default:
                                            int i7 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.finishAffinity();
                                            break;
                                    }
                                }
                            });
                            final int i3 = 1;
                            ((TextView) catchingFishSensorManager3.CatchingFishViewModelScope).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishOkHttpCardView
                                public final /* synthetic */ MenuGameActivity CatchingFishDaggerWebsocket;

                                {
                                    this.CatchingFishDaggerWebsocket = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i32 = i3;
                                    MenuGameActivity menuGameActivity = this.CatchingFishDaggerWebsocket;
                                    switch (i32) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            int i4 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) PlayActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 1:
                                            int i5 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) SettingsMusicActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 2:
                                            int i6 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) GameInfoActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        default:
                                            int i7 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.finishAffinity();
                                            break;
                                    }
                                }
                            });
                            final int i4 = 2;
                            ((TextView) catchingFishSensorManager3.CatchingFishDaggerWebsocket).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishOkHttpCardView
                                public final /* synthetic */ MenuGameActivity CatchingFishDaggerWebsocket;

                                {
                                    this.CatchingFishDaggerWebsocket = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i32 = i4;
                                    MenuGameActivity menuGameActivity = this.CatchingFishDaggerWebsocket;
                                    switch (i32) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            int i42 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) PlayActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 1:
                                            int i5 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) SettingsMusicActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 2:
                                            int i6 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) GameInfoActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        default:
                                            int i7 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.finishAffinity();
                                            break;
                                    }
                                }
                            });
                            final int i5 = 3;
                            ((TextView) catchingFishSensorManager3.CatchingFishWorkManager).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishOkHttpCardView
                                public final /* synthetic */ MenuGameActivity CatchingFishDaggerWebsocket;

                                {
                                    this.CatchingFishDaggerWebsocket = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i32 = i5;
                                    MenuGameActivity menuGameActivity = this.CatchingFishDaggerWebsocket;
                                    switch (i32) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            int i42 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) PlayActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 1:
                                            int i52 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) SettingsMusicActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        case 2:
                                            int i6 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.startActivity(new Intent(menuGameActivity, (Class<?>) GameInfoActivity.class));
                                            menuGameActivity.finish();
                                            break;
                                        default:
                                            int i7 = MenuGameActivity.CatchingFishSensorManager;
                                            menuGameActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                            menuGameActivity.finishAffinity();
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        CatchingFishAdMobStripeAPI catchingFishAdMobStripeAPI = (CatchingFishAdMobStripeAPI) this.CatchingFishPayPalService.getValue();
        if (!isFinishing()) {
            catchingFishAdMobStripeAPI.getClass();
            return;
        }
        CatchingFishFluxGraphQL catchingFishFluxGraphQL = catchingFishAdMobStripeAPI.CatchingFishReduxKtor.CatchingFishParcelableFAB;
        MediaPlayer mediaPlayer = (MediaPlayer) catchingFishFluxGraphQL.CatchingFishDaggerWebsocket;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        mediaPlayer.pause();
        catchingFishFluxGraphQL.CatchingFishSnackbar = mediaPlayer.getCurrentPosition();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((CatchingFishAdMobStripeAPI) this.CatchingFishPayPalService.getValue()).CatchingFishParcelableFAB();
    }
}
