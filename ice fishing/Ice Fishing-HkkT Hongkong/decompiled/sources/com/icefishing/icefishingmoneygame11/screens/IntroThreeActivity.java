package com.icefishing.icefishingmoneygame11.screens;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.icefishing.icefishingmoneygame11.R;
import com.icefishing.icefishingmoneygame11.core.AdFlowController;
import com.icefishing.icefishingmoneygame11.databinding.ScreenIntroThreeBinding;
import com.icefishing.icefishingmoneygame11.storage.PreferenceStore;
import java.util.Random;

/* loaded from: classes2.dex */
public class IntroThreeActivity extends AppCompatActivity {
    ScreenIntroThreeBinding binding;
    ImageView gifimagview;
    ImageView img_main;
    private int[] native_gif = {R.drawable.ad_spinner};
    private int[] native_img = {R.drawable.ad_preview_one, R.drawable.ad_preview_two, R.drawable.ad_preview_three};
    private boolean doubleBackToExitPressedOnce = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScreenIntroThreeBinding inflate = ScreenIntroThreeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.gifimagview = (ImageView) findViewById(R.id.gifimagview);
        this.img_main = (ImageView) findViewById(R.id.img_main);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.QurekaAds_native);
        if (AdFlowController.ads.equals("adx")) {
            relativeLayout.setVisibility(8);
            AdFlowController.adxNativeAds(this, (RelativeLayout) findViewById(R.id.ry_native), (ShimmerFrameLayout) findViewById(R.id.shimmer_container_native));
        } else if (AdFlowController.ads.equals("qureka")) {
            relativeLayout.setVisibility(0);
        } else {
            this.binding.ryNative.setVisibility(8);
        }
        changeNativeImages();
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.IntroThreeActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroThreeActivity.this.m488x8c8fb6a3(view);
            }
        });
        this.binding.txtNext.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.IntroThreeActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroThreeActivity.this.m489xda4f2ea4(view);
            }
        });
        this.binding.skip.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.IntroThreeActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroThreeActivity.this.m490x280ea6a5(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-icefishing-icefishingmoneygame11-screens-IntroThreeActivity, reason: not valid java name */
    /* synthetic */ void m488x8c8fb6a3(View view) {
        String str = AdFlowController.q_url;
        if (str == null || str.isEmpty()) {
            Log.e("QurekaClick", "URL is null or empty!");
            return;
        }
        Log.d("QurekaClick", "Opening URL: " + str);
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(ContextCompat.getColor(this, R.color.white));
        builder.addDefaultShareMenuItem();
        builder.setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        try {
            build.launchUrl(this, Uri.parse(str));
            Log.d("QurekaClick", "Custom tab opened successfully!");
        } catch (Exception e) {
            Log.e("QurekaClick", "Failed to open custom tab", e);
            build.intent.setPackage(null);
            build.launchUrl(this, Uri.parse(str));
        }
    }

    /* renamed from: lambda$onCreate$1$com-icefishing-icefishingmoneygame11-screens-IntroThreeActivity, reason: not valid java name */
    /* synthetic */ void m489xda4f2ea4(View view) {
        new PreferenceStore(this).setIntrosScreen(true);
        final Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
        if (AdFlowController.ads.equals("qureka")) {
            startActivity(intent);
            AdFlowController.QuraInterstitial_2(this);
        } else if (AdFlowController.ads.equals("adx")) {
            AdFlowController.loadInterstitial(this, new AdFlowController.AdCallback() { // from class: com.icefishing.icefishingmoneygame11.screens.IntroThreeActivity.1
                @Override // com.icefishing.icefishingmoneygame11.core.AdFlowController.AdCallback
                public void onNextAction() {
                    super.onNextAction();
                    IntroThreeActivity.this.startActivity(intent);
                }
            });
        } else {
            startActivity(intent);
        }
    }

    /* renamed from: lambda$onCreate$2$com-icefishing-icefishingmoneygame11-screens-IntroThreeActivity, reason: not valid java name */
    /* synthetic */ void m490x280ea6a5(View view) {
        this.binding.txtNext.performClick();
    }

    private void changeNativeImages() {
        Random random = new Random();
        int nextInt = random.nextInt(this.native_gif.length);
        int nextInt2 = random.nextInt(this.native_img.length);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(this.native_gif[nextInt])).into(this.gifimagview);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(this.native_img[nextInt2])).into(this.img_main);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isTaskRoot()) {
            if (this.doubleBackToExitPressedOnce) {
                super.onBackPressed();
                return;
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Please click BACK again to exit", 0).show();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.IntroThreeActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    IntroThreeActivity.this.doubleBackToExitPressedOnce = false;
                }
            }, 2000L);
            return;
        }
        if (AdFlowController.ads.equals("qureka")) {
            AdFlowController.QuraInterstitial_back(this);
        }
        super.onBackPressed();
    }
}
