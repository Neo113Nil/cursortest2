package com.icefishing.icefishingmoneygame11.screens;

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
import com.icefishing.icefishingmoneygame11.databinding.ScreenGuideDetailBinding;
import java.util.Random;

/* loaded from: classes2.dex */
public class GuideDetailActivity extends AppCompatActivity {
    ScreenGuideDetailBinding binding;
    ImageView gifimagview;
    ImageView img_main;
    private int[] native_gif = {R.drawable.ad_spinner};
    private int[] native_img = {R.drawable.ad_preview_one, R.drawable.ad_preview_two, R.drawable.ad_preview_three};
    private boolean doubleBackToExitPressedOnce = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScreenGuideDetailBinding inflate = ScreenGuideDetailBinding.inflate(getLayoutInflater());
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
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideDetailActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideDetailActivity.this.m463xc827e9fa(view);
            }
        });
        setTopicContent(getIntent().getIntExtra("TOPIC_ID", 1));
        this.binding.btnBack.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideDetailActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideDetailActivity.this.m464x32577219(view);
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-icefishing-icefishingmoneygame11-screens-GuideDetailActivity, reason: not valid java name */
    /* synthetic */ void m463xc827e9fa(View view) {
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

    /* renamed from: lambda$onCreate$1$com-icefishing-icefishingmoneygame11-screens-GuideDetailActivity, reason: not valid java name */
    /* synthetic */ void m464x32577219(View view) {
        onBackPressed();
    }

    private void setTopicContent(int i) {
        String str;
        String str2;
        String str3;
        switch (i) {
            case 1:
                str = "Introduction to Ice Fishing Games";
                str2 = "Ice fishing games and simulators offer players a realistic depiction of cold-weather angling. These games replicate the patience, gear setups, and environmental conditions of actual ice fishing.";
                str3 = "Players start by selecting virtual lakes, choosing their target species, and understanding basic controls. Replicating the feel of the ice, these games often incorporate drilling mechanics, depth finders, and reel tension systems. This guide will help you understand the core mechanics to master any virtual ice fishing title.";
                break;
            case 2:
                str = "Ice Fishing Gear & Tackle";
                str2 = "Selecting the right rod, reel, line, and bait is crucial for landing target fish in virtual simulators.";
                str3 = "Lightweight rods are designed for panfish like Perch, while heavy-action rods are required for large Lake Trout or Northern Pike. In-game line weight must match target size; too heavy will spook the fish, and too light will break under tension. Baits range from tiny live waxworms to artificial jigs and spoons, each suited for different species and depths.";
                break;
            case 3:
                str = "Target Fish Species & Behavior";
                str2 = "Ice fishing simulators program fish with realistic feeding behaviors, depth preferences, and reaction patterns.";
                str3 = "Walleyes are typically active during low-light hours near bottom structures. Yellow Perch travel in schools and are active during the day. Northern Pike are aggressive predators that strike large moving baits. Knowing these behaviors helps players choose the right tactics.";
                break;
            case 4:
                str = "Finding the Perfect Fishing Spot";
                str2 = "Finding fish on a vast frozen lake requires analyzing underwater topography, depth transitions, and weed lines.";
                str3 = "Look for drop-offs, underwater points, and deep basins where fish congregate for warmth and shelter. Using the in-game map, target areas where contour lines crowd together, indicating a steep slope. Locating underwater structure is the first step to a successful virtual catch.";
                break;
            case 5:
                str = "Drilling & Hole Management";
                str2 = "Selecting where to drill and managing your holes is a fundamental skill in ice fishing games.";
                str3 = "Drilling a series of holes at varying depths (known as \"hole hopping\") allows you to locate active schools. In cold simulator environments, keep an eye on hole ice build-up; use your virtual skimmer to clear slush, ensuring a clear path to pull your catch through.";
                break;
            case 6:
                str = "Mastering Jigging Techniques";
                str2 = "Jigging is the physical action of raising and lowering your rod tip to give life to your virtual lure.";
                str3 = "Subtle movements attract passive panfish, while aggressive lifts and drops trigger strikes from predatory fish. Vary your jigging rhythm and pause frequently; most strikes occur when the lure is completely still. Watch the line or rod tip closely for subtle twitches indicating a bite.";
                break;
            case 7:
                str = "Using In-Game Sonar & Flashers";
                str2 = "Electronic flashers and sonar are the ultimate tools for monitoring fish movement and lure depth.";
                str3 = "A flasher displays a circular dial representing depth. A solid line represents the bottom, a moving line represents your lure, and lines appearing in between represent approaching fish. Adjust your lure depth to hover just above the fish, as they prefer to feed upward.";
                break;
            case 8:
                str = "Weather & Time of Day Effects";
                str2 = "Virtual weather systems directly influence how active and aggressive fish are in simulator games.";
                str3 = "High barometric pressure after a cold front often makes fish sluggish. Overcast days keep light levels low, extending the active feeding times of light-sensitive fish like Walleyes. Sunrise and sunset are premium golden hours when fish activity peaks.";
                break;
            case 9:
                str = "Tournaments & Multiplayer Modes";
                str2 = "Competing against other players in real-time tournaments or climbing leaderboards adds excitement.";
                str3 = "In competitive play, time management is key. Drill holes quickly, locate active fish using electronics, and transition if a spot goes cold. Adapt your bait and tackle to target the highest-scoring fish specified by tournament rules.";
                break;
            case 10:
                str = "Advanced Pro Tips & Strategies";
                str2 = "Refining your angling technique and setups will help you land trophy-sized fish and maximize catches.";
                str3 = "Match your line color to the water clarity to prevent spooking fish. When a large fish strikes, manage the reel drag carefully; let the fish run to tire it out before pulling it to the surface. Experiment with bait combinations to discover secret patterns.";
                break;
            default:
                str = "";
                str2 = "";
                str3 = str2;
                break;
        }
        this.binding.tvTitle.setText(str);
        this.binding.tvContentPart1.setText(str2);
        this.binding.tvContentPart2.setText(str3);
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
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.GuideDetailActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    GuideDetailActivity.this.doubleBackToExitPressedOnce = false;
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
