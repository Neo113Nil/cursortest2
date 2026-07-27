package com.zennvvarroo.pealkkk;

import android.os.Handler;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/zennvvarroo/pealkkk/MainActivity$checkRealInternetNow$1", "Lokhttp3/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivity$checkRealInternetNow$1 implements Callback {
    final /* synthetic */ MainActivity this$0;

    MainActivity$checkRealInternetNow$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e) {
        Handler handler;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        handler = this.this$0.mainHandler;
        final MainActivity mainActivity = this.this$0;
        handler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.MainActivity$checkRealInternetNow$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity$checkRealInternetNow$1.onFailure$lambda$0(MainActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailure$lambda$0(MainActivity this$0) {
        boolean z;
        boolean z2;
        Handler handler;
        Runnable runnable;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z = this$0.appOpened;
        if (z) {
            return;
        }
        z2 = this$0.webViewOpened;
        if (z2) {
            return;
        }
        handler = this$0.mainHandler;
        runnable = this$0.internetFallbackRunnable;
        handler.removeCallbacks(runnable);
        this$0.openAppNormal();
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Handler handler;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Response response2 = response;
        final MainActivity mainActivity = this.this$0;
        try {
            final boolean z = response2.code() == 204;
            handler = mainActivity.mainHandler;
            handler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.MainActivity$checkRealInternetNow$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity$checkRealInternetNow$1.onResponse$lambda$2$lambda$1(MainActivity.this, z);
                }
            });
            CloseableKt.closeFinally(response2, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$2$lambda$1(MainActivity this$0, boolean z) {
        boolean z2;
        boolean z3;
        Handler handler;
        Runnable runnable;
        Handler handler2;
        Runnable runnable2;
        Handler handler3;
        Runnable runnable3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z2 = this$0.appOpened;
        if (z2) {
            return;
        }
        z3 = this$0.webViewOpened;
        if (z3) {
            return;
        }
        if (z) {
            this$0.internetConfirmed = true;
            handler2 = this$0.mainHandler;
            runnable2 = this$0.internetFallbackRunnable;
            handler2.removeCallbacks(runnable2);
            handler3 = this$0.mainHandler;
            runnable3 = this$0.timeoutRunnable;
            handler3.postDelayed(runnable3, 30000L);
            return;
        }
        handler = this$0.mainHandler;
        runnable = this$0.internetFallbackRunnable;
        handler.removeCallbacks(runnable);
        this$0.openAppNormal();
    }
}
