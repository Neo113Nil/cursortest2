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
import com.icefishing.icefishingmoneygame11.databinding.ScreenExperienceSelectionBinding;
import java.util.Random;

/* loaded from: classes2.dex */
public class ExperienceSelectionActivity extends AppCompatActivity {
    ScreenExperienceSelectionBinding binding;
    ImageView gifimagview;
    ImageView img_main;
    int selectedItem = -1;
    private int[] native_gif = {R.drawable.ad_spinner};
    private int[] native_img = {R.drawable.ad_preview_one, R.drawable.ad_preview_two, R.drawable.ad_preview_three};
    private boolean doubleBackToExitPressedOnce = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScreenExperienceSelectionBinding inflate = ScreenExperienceSelectionBinding.inflate(getLayoutInflater());
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
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.ExperienceSelectionActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExperienceSelectionActivity.this.m452xdd5123cf(view);
            }
        });
        resetCountry();
        this.binding.cardCountry1.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.ExperienceSelectionActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExperienceSelectionActivity.this.m453xf7c21cee(view);
            }
        });
        this.binding.cardCountry2.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.ExperienceSelectionActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExperienceSelectionActivity.this.m454x1233160d(view);
            }
        });
        this.binding.cardCountry3.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.ExperienceSelectionActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExperienceSelectionActivity.this.m455x2ca40f2c(view);
            }
        });
        this.binding.cardviewContinue.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.ExperienceSelectionActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExperienceSelectionActivity.this.m456x4715084b(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-icefishing-icefishingmoneygame11-screens-ExperienceSelectionActivity, reason: not valid java name */
    /* synthetic */ void m452xdd5123cf(View view) {
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

    /* renamed from: lambda$onCreate$1$com-icefishing-icefishingmoneygame11-screens-ExperienceSelectionActivity, reason: not valid java name */
    /* synthetic */ void m453xf7c21cee(View view) {
        this.selectedItem = 0;
        setSelectedItem();
    }

    /* renamed from: lambda$onCreate$2$com-icefishing-icefishingmoneygame11-screens-ExperienceSelectionActivity, reason: not valid java name */
    /* synthetic */ void m454x1233160d(View view) {
        this.selectedItem = 1;
        setSelectedItem();
    }

    /* renamed from: lambda$onCreate$3$com-icefishing-icefishingmoneygame11-screens-ExperienceSelectionActivity, reason: not valid java name */
    /* synthetic */ void m455x2ca40f2c(View view) {
        this.selectedItem = 2;
        setSelectedItem();
    }

    /* renamed from: lambda$onCreate$4$com-icefishing-icefishingmoneygame11-screens-ExperienceSelectionActivity, reason: not valid java name */
    /* synthetic */ void m456x4715084b(View view) {
        if (this.selectedItem == -1) {
            Toast.makeText(this, "Please select an option before proceeding.", 0).show();
            return;
        }
        final Intent intent = new Intent(this, (Class<?>) DashboardActivity.class);
        if (AdFlowController.ads.equals("qureka")) {
            startActivity(intent);
            AdFlowController.QuraInterstitial_2(this);
        } else if (AdFlowController.ads.equals("adx")) {
            AdFlowController.loadInterstitial(this, new AdFlowController.AdCallback() { // from class: com.icefishing.icefishingmoneygame11.screens.ExperienceSelectionActivity.1
                @Override // com.icefishing.icefishingmoneygame11.core.AdFlowController.AdCallback
                public void onNextAction() {
                    super.onNextAction();
                    ExperienceSelectionActivity.this.startActivity(intent);
                }
            });
        } else {
            startActivity(intent);
        }
    }

    public void setSelectedItem() {
        resetCountry();
        int i = this.selectedItem;
        if (i == 0) {
            this.binding.imgSelect1.setImageResource(R.drawable.indicator_selected);
            this.binding.vSelect1.setVisibility(0);
        } else if (i == 1) {
            this.binding.imgSelect2.setImageResource(R.drawable.indicator_selected);
            this.binding.vSelect2.setVisibility(0);
        } else if (i == 2) {
            this.binding.imgSelect3.setImageResource(R.drawable.indicator_selected);
            this.binding.vSelect3.setVisibility(0);
        }
    }

    public void resetCountry() {
        this.binding.imgSelect1.setImageResource(R.drawable.indicator_unselected);
        this.binding.imgSelect2.setImageResource(R.drawable.indicator_unselected);
        this.binding.imgSelect3.setImageResource(R.drawable.indicator_unselected);
        this.binding.vSelect1.setVisibility(8);
        this.binding.vSelect2.setVisibility(8);
        this.binding.vSelect3.setVisibility(8);
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
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.ExperienceSelectionActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    ExperienceSelectionActivity.this.doubleBackToExitPressedOnce = false;
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
