package com.catchingfish.fishcatcherpro.presentation.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.catchingfish.fishcatcherpro.presentation.settings.SettingsMusicActivity;
import kotlin.text.CatchingFishBundleAndroidX;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishFragmentFactory;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitGlide;
import kotlin.text.CatchingFishKtorHiltIntent;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishMVPGson;
import kotlin.text.CatchingFishSpannableJUnit;
import kotlin.text.CatchingFishViewGraphQL;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
public final class SettingsMusicActivity extends AppCompatActivity {
    public static final /* synthetic */ int CatchingFishSensorManager = 0;
    public final CatchingFishKtorHiltIntent CatchingFishJobScheduler;
    public CatchingFishSpannableJUnit CatchingFishMutableLiveData;
    public final CatchingFishKtorHiltIntent CatchingFishPayPalService;

    public SettingsMusicActivity() {
        final int i = 0;
        this.CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishJUnitGlide(this) { // from class: kotlin.text.CatchingFishMVPFABPayPal
            public final /* synthetic */ SettingsMusicActivity CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // kotlin.text.CatchingFishJUnitGlide
            public final Object CatchingFishParcelableFAB() {
                int i2 = i;
                SettingsMusicActivity settingsMusicActivity = this.CatchingFishDaggerWebsocket;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        int i3 = SettingsMusicActivity.CatchingFishSensorManager;
                        return CatchingFishAdMobFAB.CatchingFishGsonAppCompat(settingsMusicActivity);
                    default:
                        int i4 = SettingsMusicActivity.CatchingFishSensorManager;
                        return new CatchingFishMVPGson(settingsMusicActivity.CatchingFishUnitTesting().CatchingFishDaggerWebsocket, settingsMusicActivity.CatchingFishUnitTesting().CatchingFishViewModelScope, settingsMusicActivity.CatchingFishUnitTesting().CatchingFishViewModelFAB, settingsMusicActivity.CatchingFishUnitTesting().CatchingFishLayout);
                }
            }
        });
        final int i2 = 1;
        this.CatchingFishPayPalService = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishJUnitGlide(this) { // from class: kotlin.text.CatchingFishMVPFABPayPal
            public final /* synthetic */ SettingsMusicActivity CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // kotlin.text.CatchingFishJUnitGlide
            public final Object CatchingFishParcelableFAB() {
                int i22 = i2;
                SettingsMusicActivity settingsMusicActivity = this.CatchingFishDaggerWebsocket;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        int i3 = SettingsMusicActivity.CatchingFishSensorManager;
                        return CatchingFishAdMobFAB.CatchingFishGsonAppCompat(settingsMusicActivity);
                    default:
                        int i4 = SettingsMusicActivity.CatchingFishSensorManager;
                        return new CatchingFishMVPGson(settingsMusicActivity.CatchingFishUnitTesting().CatchingFishDaggerWebsocket, settingsMusicActivity.CatchingFishUnitTesting().CatchingFishViewModelScope, settingsMusicActivity.CatchingFishUnitTesting().CatchingFishViewModelFAB, settingsMusicActivity.CatchingFishUnitTesting().CatchingFishLayout);
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
        View inflate = getLayoutInflater().inflate(R.layout.activity_settings_music, (ViewGroup) null, false);
        int i = R.id.clear;
        TextView textView = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.clear);
        if (textView != null) {
            i = R.id.difText;
            if (((TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.difText)) != null) {
                i = R.id.hard;
                TextView textView2 = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.hard);
                if (textView2 != null) {
                    i = R.id.imageView2;
                    if (((ImageView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.imageView2)) != null) {
                        i = R.id.medium;
                        TextView textView3 = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.medium);
                        if (textView3 != null) {
                            i = R.id.musicIcon;
                            ImageView imageView = (ImageView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.musicIcon);
                            if (imageView != null) {
                                i = R.id.musicSwitch;
                                Switch r9 = (Switch) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.musicSwitch);
                                if (r9 != null) {
                                    i = R.id.otherText;
                                    if (((TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.otherText)) != null) {
                                        i = R.id.share;
                                        TextView textView4 = (TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.share);
                                        if (textView4 != null) {
                                            this.CatchingFishMutableLiveData = new CatchingFishSpannableJUnit((ConstraintLayout) inflate, textView, textView2, textView3, imageView, r9, textView4);
                                            CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = CatchingFishUnitTesting().CatchingFishCoroutine;
                                            CatchingFishSpannableJUnit catchingFishSpannableJUnit = this.CatchingFishMutableLiveData;
                                            if (catchingFishSpannableJUnit == null) {
                                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                                throw null;
                                            }
                                            ConstraintLayout constraintLayout = (ConstraintLayout) catchingFishSpannableJUnit.CatchingFishReduxKtor;
                                            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(constraintLayout, "getRoot(...)");
                                            catchingFishMVPExoPlayer.CatchingFishEspressoTesting(this, constraintLayout);
                                            CatchingFishSpannableJUnit catchingFishSpannableJUnit2 = this.CatchingFishMutableLiveData;
                                            if (catchingFishSpannableJUnit2 == null) {
                                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                                throw null;
                                            }
                                            setContentView((ConstraintLayout) catchingFishSpannableJUnit2.CatchingFishReduxKtor);
                                            CatchingFishSpannableJUnit catchingFishSpannableJUnit3 = this.CatchingFishMutableLiveData;
                                            if (catchingFishSpannableJUnit3 == null) {
                                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                                throw null;
                                            }
                                            final int i2 = 2;
                                            ((TextView) catchingFishSpannableJUnit3.CatchingFishWorkManager).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishRoomMoshi
                                                public final /* synthetic */ SettingsMusicActivity CatchingFishDaggerWebsocket;

                                                {
                                                    this.CatchingFishDaggerWebsocket = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i3 = i2;
                                                    SettingsMusicActivity settingsMusicActivity = this.CatchingFishDaggerWebsocket;
                                                    switch (i3) {
                                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                            int i4 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "Caches cleared", 0).show();
                                                            break;
                                                        case 1:
                                                            int i5 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            settingsMusicActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", "Catching Fish already on Play Market");
                                                            settingsMusicActivity.startActivity(Intent.createChooser(intent, "Share via"));
                                                            break;
                                                        case 2:
                                                            int i6 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "HARD SET", 0).show();
                                                            break;
                                                        default:
                                                            int i7 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "MEDIUM SET", 0).show();
                                                            break;
                                                    }
                                                }
                                            });
                                            final int i3 = 3;
                                            ((TextView) catchingFishSpannableJUnit3.CatchingFishViewModelScope).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishRoomMoshi
                                                public final /* synthetic */ SettingsMusicActivity CatchingFishDaggerWebsocket;

                                                {
                                                    this.CatchingFishDaggerWebsocket = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i32 = i3;
                                                    SettingsMusicActivity settingsMusicActivity = this.CatchingFishDaggerWebsocket;
                                                    switch (i32) {
                                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                            int i4 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "Caches cleared", 0).show();
                                                            break;
                                                        case 1:
                                                            int i5 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            settingsMusicActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", "Catching Fish already on Play Market");
                                                            settingsMusicActivity.startActivity(Intent.createChooser(intent, "Share via"));
                                                            break;
                                                        case 2:
                                                            int i6 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "HARD SET", 0).show();
                                                            break;
                                                        default:
                                                            int i7 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "MEDIUM SET", 0).show();
                                                            break;
                                                    }
                                                }
                                            });
                                            CatchingFishSpannableJUnit catchingFishSpannableJUnit4 = this.CatchingFishMutableLiveData;
                                            if (catchingFishSpannableJUnit4 == null) {
                                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                                throw null;
                                            }
                                            Switch r12 = (Switch) catchingFishSpannableJUnit4.CatchingFishLayout;
                                            r12.setChecked(((CatchingFishMVPGson) this.CatchingFishPayPalService.getValue()).CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishCoroutine);
                                            boolean isChecked = r12.isChecked();
                                            CatchingFishSpannableJUnit catchingFishSpannableJUnit5 = this.CatchingFishMutableLiveData;
                                            if (catchingFishSpannableJUnit5 == null) {
                                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                                throw null;
                                            }
                                            ((ImageView) catchingFishSpannableJUnit5.CatchingFishViewModelFAB).setImageResource(isChecked ? R.drawable.musicon : R.drawable.musicoff);
                                            r12.setOnCheckedChangeListener(new CatchingFishViewGraphQL(this, 1));
                                            CatchingFishSpannableJUnit catchingFishSpannableJUnit6 = this.CatchingFishMutableLiveData;
                                            if (catchingFishSpannableJUnit6 == null) {
                                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                                                throw null;
                                            }
                                            final int i4 = 0;
                                            ((TextView) catchingFishSpannableJUnit6.CatchingFishDaggerWebsocket).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishRoomMoshi
                                                public final /* synthetic */ SettingsMusicActivity CatchingFishDaggerWebsocket;

                                                {
                                                    this.CatchingFishDaggerWebsocket = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i32 = i4;
                                                    SettingsMusicActivity settingsMusicActivity = this.CatchingFishDaggerWebsocket;
                                                    switch (i32) {
                                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                            int i42 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "Caches cleared", 0).show();
                                                            break;
                                                        case 1:
                                                            int i5 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            settingsMusicActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", "Catching Fish already on Play Market");
                                                            settingsMusicActivity.startActivity(Intent.createChooser(intent, "Share via"));
                                                            break;
                                                        case 2:
                                                            int i6 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "HARD SET", 0).show();
                                                            break;
                                                        default:
                                                            int i7 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "MEDIUM SET", 0).show();
                                                            break;
                                                    }
                                                }
                                            });
                                            final int i5 = 1;
                                            ((TextView) catchingFishSpannableJUnit6.CatchingFishFragmentHandler).setOnClickListener(new View.OnClickListener(this) { // from class: kotlin.text.CatchingFishRoomMoshi
                                                public final /* synthetic */ SettingsMusicActivity CatchingFishDaggerWebsocket;

                                                {
                                                    this.CatchingFishDaggerWebsocket = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i32 = i5;
                                                    SettingsMusicActivity settingsMusicActivity = this.CatchingFishDaggerWebsocket;
                                                    switch (i32) {
                                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                            int i42 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "Caches cleared", 0).show();
                                                            break;
                                                        case 1:
                                                            int i52 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            settingsMusicActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", "Catching Fish already on Play Market");
                                                            settingsMusicActivity.startActivity(Intent.createChooser(intent, "Share via"));
                                                            break;
                                                        case 2:
                                                            int i6 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "HARD SET", 0).show();
                                                            break;
                                                        default:
                                                            int i7 = SettingsMusicActivity.CatchingFishSensorManager;
                                                            Toast.makeText(settingsMusicActivity, "MEDIUM SET", 0).show();
                                                            break;
                                                    }
                                                }
                                            });
                                            CatchingFishDaggerBiometric.CatchingFishReduxKtor(CatchingFishLayout(), this, new CatchingFishFragmentFactory(13, this));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
