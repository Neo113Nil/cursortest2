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
import com.icefishing.icefishingmoneygame11.databinding.ScreenGuideListBinding;
import java.util.Random;

/* loaded from: classes2.dex */
public class GuideListActivity extends AppCompatActivity {
    ScreenGuideListBinding binding;
    ImageView gifimagview;
    ImageView img_main;
    private int[] native_gif = {R.drawable.ad_spinner};
    private int[] native_img = {R.drawable.ad_preview_one, R.drawable.ad_preview_two, R.drawable.ad_preview_three};
    private boolean doubleBackToExitPressedOnce = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScreenGuideListBinding inflate = ScreenGuideListBinding.inflate(getLayoutInflater());
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
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m466x15e27bc7(view);
            }
        });
        this.binding.cardTopic1.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m467x94437fa6(view);
            }
        });
        this.binding.cardTopic2.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m469x12a48385(view);
            }
        });
        this.binding.cardTopic3.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m470x91058764(view);
            }
        });
        this.binding.cardTopic4.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m471xf668b43(view);
            }
        });
        this.binding.cardTopic5.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m472x8dc78f22(view);
            }
        });
        this.binding.cardTopic6.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m473xc289301(view);
            }
        });
        this.binding.cardTopic7.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m474x8a8996e0(view);
            }
        });
        this.binding.cardTopic8.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m475x8ea9abf(view);
            }
        });
        this.binding.cardTopic9.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m476x874b9e9e(view);
            }
        });
        this.binding.cardTopic10.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideListActivity.this.m468x47a73b20(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m466x15e27bc7(View view) {
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

    /* renamed from: lambda$onCreate$1$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m467x94437fa6(View view) {
        openDetailScreenWithAd(1);
    }

    /* renamed from: lambda$onCreate$2$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m469x12a48385(View view) {
        openDetailScreenWithAd(2);
    }

    /* renamed from: lambda$onCreate$3$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m470x91058764(View view) {
        openDetailScreenWithAd(3);
    }

    /* renamed from: lambda$onCreate$4$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m471xf668b43(View view) {
        openDetailScreenWithAd(4);
    }

    /* renamed from: lambda$onCreate$5$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m472x8dc78f22(View view) {
        openDetailScreenWithAd(5);
    }

    /* renamed from: lambda$onCreate$6$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m473xc289301(View view) {
        openDetailScreenWithAd(6);
    }

    /* renamed from: lambda$onCreate$7$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m474x8a8996e0(View view) {
        openDetailScreenWithAd(7);
    }

    /* renamed from: lambda$onCreate$8$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m475x8ea9abf(View view) {
        openDetailScreenWithAd(8);
    }

    /* renamed from: lambda$onCreate$9$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m476x874b9e9e(View view) {
        openDetailScreenWithAd(9);
    }

    /* renamed from: lambda$onCreate$10$com-icefishing-icefishingmoneygame11-screens-GuideListActivity, reason: not valid java name */
    /* synthetic */ void m468x47a73b20(View view) {
        openDetailScreenWithAd(10);
    }

    private void openDetailScreenWithAd(int i) {
        final Intent intent = new Intent(this, (Class<?>) GuideDetailActivity.class);
        intent.putExtra("TOPIC_ID", i);
        if (AdFlowController.ads.equals("qureka")) {
            startActivity(intent);
            AdFlowController.QuraInterstitial_2(this);
        } else if (AdFlowController.ads.equals("adx")) {
            AdFlowController.loadInterstitial(this, new AdFlowController.AdCallback() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity.1
                @Override // com.icefishing.icefishingmoneygame11.core.AdFlowController.AdCallback
                public void onNextAction() {
                    super.onNextAction();
                    GuideListActivity.this.startActivity(intent);
                }
            });
        } else {
            startActivity(intent);
        }
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
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideListActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    GuideListActivity.this.doubleBackToExitPressedOnce = false;
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
