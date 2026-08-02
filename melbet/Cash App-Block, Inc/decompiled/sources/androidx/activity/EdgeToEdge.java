package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes3.dex */
public abstract class EdgeToEdge {
    public static EdgeToEdgeApi29 Impl;
    public static final int DefaultLightScrim = Color.argb(EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 255, 255, 255);
    public static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static void enable$default(AppCompatActivity appCompatActivity) {
        int i = 1;
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = new BorderKt$$ExternalSyntheticLambda1(i);
        SystemBarStyle systemBarStyle = new SystemBarStyle(0, 0, borderKt$$ExternalSyntheticLambda1);
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda12 = new BorderKt$$ExternalSyntheticLambda1(i);
        SystemBarStyle systemBarStyle2 = new SystemBarStyle(DefaultLightScrim, DefaultDarkScrim, borderKt$$ExternalSyntheticLambda12);
        View decorView = appCompatActivity.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) borderKt$$ExternalSyntheticLambda1.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) borderKt$$ExternalSyntheticLambda12.invoke(resources2)).booleanValue();
        EdgeToEdgeApi29 edgeToEdgeApi29 = Impl;
        if (edgeToEdgeApi29 == null) {
            int i2 = Build.VERSION.SDK_INT;
            edgeToEdgeApi29 = i2 >= 35 ? new EdgeToEdgeApi35() : i2 >= 30 ? new EdgeToEdgeApi30() : new EdgeToEdgeApi29();
            Impl = edgeToEdgeApi29;
        }
        EdgeToEdgeApi29 edgeToEdgeApi292 = edgeToEdgeApi29;
        Window window = appCompatActivity.getWindow();
        window.getClass();
        edgeToEdgeApi292.setUp(systemBarStyle, systemBarStyle2, window, decorView, booleanValue, booleanValue2);
        Window window2 = appCompatActivity.getWindow();
        window2.getClass();
        edgeToEdgeApi292.adjustLayoutInDisplayCutoutMode(window2);
    }
}
