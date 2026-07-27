package com.zennvvarroo.pealkkk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.content.ContextCompat;
import com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/zennvvarroo/pealkkk/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "appOpened", "", "internetCheckCall", "Lokhttp3/Call;", "internetCheckClient", "Lokhttp3/OkHttpClient;", "internetConfirmed", "internetFallbackRunnable", "Ljava/lang/Runnable;", "mainHandler", "Landroid/os/Handler;", "remMessReceiver", "com/zennvvarroo/pealkkk/MainActivity$remMessReceiver$1", "Lcom/zennvvarroo/pealkkk/MainActivity$remMessReceiver$1;", "showLoader", "Landroidx/compose/runtime/MutableState;", "timeoutRunnable", "webViewOpened", "checkRealInternetNow", "", "hasValidatedInternet", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openAppNormal", "openWebView", "url", "", "registerRemMessReceiver", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;
    private boolean appOpened;
    private Call internetCheckCall;
    private boolean internetConfirmed;
    private boolean webViewOpened;
    private final MutableState<Boolean> showLoader = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final OkHttpClient internetCheckClient = new OkHttpClient.Builder().connectTimeout(4000, TimeUnit.MILLISECONDS).readTimeout(4000, TimeUnit.MILLISECONDS).writeTimeout(4000, TimeUnit.MILLISECONDS).callTimeout(4500, TimeUnit.MILLISECONDS).build();
    private final Runnable timeoutRunnable = new Runnable() { // from class: com.zennvvarroo.pealkkk.MainActivity$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            MainActivity.timeoutRunnable$lambda$0(MainActivity.this);
        }
    };
    private final Runnable internetFallbackRunnable = new Runnable() { // from class: com.zennvvarroo.pealkkk.MainActivity$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            MainActivity.internetFallbackRunnable$lambda$1(MainActivity.this);
        }
    };
    private final MainActivity$remMessReceiver$1 remMessReceiver = new BroadcastReceiver() { // from class: com.zennvvarroo.pealkkk.MainActivity$remMessReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler;
            Runnable runnable;
            Handler handler2;
            Runnable runnable2;
            Call call;
            String stringExtra = intent != null ? intent.getStringExtra("notificationMessage") : null;
            handler = MainActivity.this.mainHandler;
            runnable = MainActivity.this.timeoutRunnable;
            handler.removeCallbacks(runnable);
            handler2 = MainActivity.this.mainHandler;
            runnable2 = MainActivity.this.internetFallbackRunnable;
            handler2.removeCallbacks(runnable2);
            call = MainActivity.this.internetCheckCall;
            if (call != null) {
                call.cancel();
            }
            MainActivity.this.internetCheckCall = null;
            String str = stringExtra;
            if (str == null || StringsKt.isBlank(str) || Intrinsics.areEqual(stringExtra, "Error occurred")) {
                MainActivity.this.openAppNormal();
            } else {
                MainActivity.this.openWebView(stringExtra);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeoutRunnable$lambda$0(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openAppNormal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void internetFallbackRunnable$lambda$1(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.internetConfirmed || this$0.appOpened || this$0.webViewOpened) {
            return;
        }
        Call call = this$0.internetCheckCall;
        if (call != null) {
            call.cancel();
        }
        this$0.internetCheckCall = null;
        this$0.openAppNormal();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerRemMessReceiver();
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1304911122, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.MainActivity$onCreate$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                MutableState mutableState;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1304911122, i, -1, "com.zennvvarroo.pealkkk.MainActivity.onCreate.<anonymous> (MainActivity.kt:99)");
                }
                mutableState = MainActivity.this.showLoader;
                MainActivityKt.AndroidWebEntryScreen(((Boolean) mutableState.getValue()).booleanValue(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
        if (!hasValidatedInternet()) {
            openAppNormal();
        } else {
            checkRealInternetNow();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.mainHandler.removeCallbacks(this.timeoutRunnable);
        this.mainHandler.removeCallbacks(this.internetFallbackRunnable);
        Call call = this.internetCheckCall;
        if (call != null) {
            call.cancel();
        }
        this.internetCheckCall = null;
        try {
            unregisterReceiver(this.remMessReceiver);
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAppNormal() {
        if (this.appOpened || this.webViewOpened) {
            return;
        }
        this.appOpened = true;
        this.webViewOpened = false;
        this.mainHandler.removeCallbacks(this.timeoutRunnable);
        this.mainHandler.removeCallbacks(this.internetFallbackRunnable);
        Call call = this.internetCheckCall;
        if (call != null) {
            call.cancel();
        }
        this.internetCheckCall = null;
        startActivity(new Intent(this, (Class<?>) NativeMainActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openWebView(String url) {
        if (this.webViewOpened || this.appOpened) {
            return;
        }
        this.webViewOpened = true;
        this.appOpened = false;
        this.mainHandler.removeCallbacks(this.timeoutRunnable);
        this.mainHandler.removeCallbacks(this.internetFallbackRunnable);
        Call call = this.internetCheckCall;
        if (call != null) {
            call.cancel();
        }
        this.internetCheckCall = null;
        ZenvaroPeakC533LaunchRouter.INSTANCE.openGate(this, url);
    }

    private final void registerRemMessReceiver() {
        ContextCompat.registerReceiver(this, this.remMessReceiver, new IntentFilter("RemMess"), 4);
    }

    private final boolean hasValidatedInternet() {
        NetworkCapabilities networkCapabilities;
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    private final void checkRealInternetNow() {
        this.internetConfirmed = false;
        this.mainHandler.postDelayed(this.internetFallbackRunnable, 4500L);
        Call newCall = this.internetCheckClient.newCall(new Request.Builder().url("https://clients3.google.com/generate_204").get().build());
        this.internetCheckCall = newCall;
        if (newCall != null) {
            newCall.enqueue(new MainActivity$checkRealInternetNow$1(this));
        }
    }
}
