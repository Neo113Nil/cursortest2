package com.icefishing.icefishingmoneygame11.screens;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.icefishing.icefishingmoneygame11.R;
import com.icefishing.icefishingmoneygame11.core.AdFlowController;
import com.icefishing.icefishingmoneygame11.core.NetworkStatusReceiver;
import com.icefishing.icefishingmoneygame11.storage.PreferenceStore;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LaunchActivity extends AppCompatActivity {
    public static boolean start_redirect;
    private AppOpenAd appOpenAd;
    private NetworkStatusReceiver connectivityReceiver;
    FrameLayout container;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        EdgeToEdge.enable(this);
        setContentView(R.layout.screen_launch);
        this.connectivityReceiver = new NetworkStatusReceiver();
        this.container = (FrameLayout) findViewById(R.id.splash_ad_container);
        if (isNetworkConnected()) {
            fetchRemoteConfig();
        } else {
            Toast.makeText(this, "Internet Connection Is Required", 0).show();
        }
    }

    private void fetchRemoteConfig() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.LaunchActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.this.m512x421663f4(handler);
            }
        });
    }

    /* renamed from: lambda$fetchRemoteConfig$3$com-icefishing-icefishingmoneygame11-screens-LaunchActivity, reason: not valid java name */
    /* synthetic */ void m512x421663f4(Handler handler) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://appxanalytics.com/data/" + getPackageName() + ".json").openConnection();
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            if (httpURLConnection.getResponseCode() != 200) {
                handler.post(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.LaunchActivity$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.this.m510xcd2b22f2();
                    }
                });
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    final JSONObject jSONObject = new JSONObject(sb.toString());
                    handler.post(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.LaunchActivity$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            LaunchActivity.this.m509x12b58271(jSONObject);
                        }
                    });
                    return;
                }
                sb.append(readLine);
            }
        } catch (Exception unused) {
            handler.post(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.LaunchActivity$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.this.m511x87a0c373();
                }
            });
        }
    }

    /* renamed from: lambda$fetchRemoteConfig$0$com-icefishing-icefishingmoneygame11-screens-LaunchActivity, reason: not valid java name */
    /* synthetic */ void m509x12b58271(JSONObject jSONObject) {
        try {
            start_redirect = jSONObject.optBoolean("start_redirect", false);
            AdFlowController.q_url = jSONObject.optString("qureka_url", "");
            AdFlowController.q_back_url = jSONObject.optString("qureka_back_url", "");
            AdFlowController.ads = jSONObject.optString("ads", "");
            AdFlowController.adx_interstitial = jSONObject.optString("adx_interstitial", "");
            AdFlowController.adx_banner = jSONObject.optString("adx_banner", "");
            AdFlowController.adx_native = jSONObject.optString("adx_native", "");
            AdFlowController.adx_appopen = jSONObject.optString("adx_appopen", "");
            AdFlowController.load(this);
            performNextSteps();
        } catch (Exception unused) {
            fallbackOrToast("Error parsing config");
        }
    }

    /* renamed from: lambda$fetchRemoteConfig$1$com-icefishing-icefishingmoneygame11-screens-LaunchActivity, reason: not valid java name */
    /* synthetic */ void m510xcd2b22f2() {
        fallbackOrToast("Config fetch failed");
    }

    /* renamed from: lambda$fetchRemoteConfig$2$com-icefishing-icefishingmoneygame11-screens-LaunchActivity, reason: not valid java name */
    /* synthetic */ void m511x87a0c373() {
        fallbackOrToast("Network error");
    }

    private void performNextSteps() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.screens.LaunchActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.this.m513x7fc8b8a0();
            }
        }, 800L);
    }

    /* renamed from: lambda$performNextSteps$4$com-icefishing-icefishingmoneygame11-screens-LaunchActivity, reason: not valid java name */
    /* synthetic */ void m513x7fc8b8a0() {
        if (AdFlowController.ads.equals("qureka")) {
            if (start_redirect) {
                startActivity(new Intent(this, (Class<?>) DashboardActivity.class));
                finish();
            } else if (new PreferenceStore(this).getIntrosOpen()) {
                startActivity(new Intent(this, (Class<?>) HomeActivity.class));
                finish();
            } else {
                startActivity(new Intent(this, (Class<?>) IntroOneActivity.class));
                finish();
            }
            AdFlowController.QuraInterstitial(this);
            return;
        }
        if (AdFlowController.ads.equals("adx")) {
            loadAd(this);
            return;
        }
        if (start_redirect) {
            startActivity(new Intent(this, (Class<?>) DashboardActivity.class));
            finish();
        } else if (new PreferenceStore(this).getIntrosOpen()) {
            startActivity(new Intent(this, (Class<?>) HomeActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, (Class<?>) IntroOneActivity.class));
            finish();
        }
    }

    private void fallbackOrToast(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
        performNextSteps();
    }

    public void loadAd(Context context) {
        AppOpenAd.load(context, AdFlowController.adx_appopen, new AdManagerAdRequest.Builder().build(), 1, new AppOpenAd.AppOpenAdLoadCallback() { // from class: com.icefishing.icefishingmoneygame11.screens.LaunchActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AppOpenAd appOpenAd) {
                LaunchActivity.this.appOpenAd = appOpenAd;
                LaunchActivity.this.appOpenAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.icefishing.icefishingmoneygame11.screens.LaunchActivity.1.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        LaunchActivity.this.appOpenAd = null;
                        LaunchActivity.this.openMain();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        LaunchActivity.this.appOpenAd = null;
                        LaunchActivity.this.openMain();
                    }
                });
                LaunchActivity.this.appOpenAd.show(LaunchActivity.this);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                LaunchActivity.this.appOpenAd = null;
                LaunchActivity.this.openMain();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openMain() {
        if (start_redirect) {
            startActivity(new Intent(this, (Class<?>) DashboardActivity.class));
            finish();
        } else if (new PreferenceStore(this).getIntrosOpen()) {
            startActivity(new Intent(this, (Class<?>) HomeActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, (Class<?>) IntroOneActivity.class));
            finish();
        }
    }

    private boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        unregisterReceiver(this.connectivityReceiver);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        NetworkStatusReceiver networkStatusReceiver = new NetworkStatusReceiver();
        this.connectivityReceiver = networkStatusReceiver;
        ContextCompat.registerReceiver(this, networkStatusReceiver, intentFilter, 4);
    }
}
