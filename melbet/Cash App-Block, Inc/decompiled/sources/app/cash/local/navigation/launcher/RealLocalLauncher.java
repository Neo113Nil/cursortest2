package app.cash.local.navigation.launcher;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.room.CoroutinesRoom;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.util.android.Intents;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class RealLocalLauncher {
    public final Activity activity;
    public final RealRouter$Factory$Impl centralUrlRouterFactory;
    public final Lazy router$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Worker$$ExternalSyntheticLambda0(this, 17));

    public RealLocalLauncher(CoroutinesRoom.Companion companion, RealRouter$Factory$Impl realRouter$Factory$Impl, Activity activity) {
        this.centralUrlRouterFactory = realRouter$Factory$Impl;
        this.activity = activity;
    }

    public final void openMap(String str, String str2) {
        Uri.Builder appendQueryParameter = Uri.parse("https://www.google.com/maps/search/?api=1").buildUpon().appendQueryParameter("query", str);
        if (str2 != null) {
            appendQueryParameter.appendQueryParameter("queryPlaceId", str2);
        }
        Intents.maybeStartActivity(r2, new Intent("android.intent.action.VIEW", appendQueryParameter.build()), new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }

    public final void openTel(String str) {
        str.getClass();
        Intents.maybeStartActivity(r3, new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null)), new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }

    public final void openWeb(Navigator navigator, String str) {
        boolean route;
        navigator.getClass();
        str.getClass();
        route = ((RealRouter$Factory$Impl) this.router$delegate.getValue()).create$1(navigator).route(new RoutingParams(null, null, null, null, null, null, 511), str);
        if (route) {
            return;
        }
        Intents.maybeStartActivity(r1, new Intent("android.intent.action.VIEW", Uri.parse(str)), new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }

    public final void shareUri(String str, String str2) {
        str.getClass();
        str2.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        Intent createChooser = Intent.createChooser(intent, str);
        createChooser.getClass();
        Intents.maybeStartActivity(r2, createChooser, new CameraX$$ExternalSyntheticLambda0(this.activity, 12));
    }
}
