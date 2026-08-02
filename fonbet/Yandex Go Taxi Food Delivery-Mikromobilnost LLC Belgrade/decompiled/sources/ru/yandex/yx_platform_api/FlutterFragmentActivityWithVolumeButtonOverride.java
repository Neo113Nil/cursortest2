package ru.yandex.yx_platform_api;

import android.view.KeyEvent;
import defpackage.oz31;
import defpackage.yeo;
import io.flutter.embedding.android.FlutterFragmentActivity;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"Lru/yandex/yx_platform_api/FlutterFragmentActivityWithVolumeButtonOverride;", "Lio/flutter/embedding/android/FlutterFragmentActivity;", "<init>", "()V", "dispatchKeyEvent", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/KeyEvent;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public class FlutterFragmentActivityWithVolumeButtonOverride extends FlutterFragmentActivity {
    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (oz31.a != null && event.getAction() == 0) {
            int keyCode = event.getKeyCode();
            if (keyCode == 24) {
                yeo yeoVar = oz31.a;
                if (yeoVar != null) {
                    yeoVar.success("volume_up");
                }
            } else if (keyCode == 25) {
                yeo yeoVar2 = oz31.a;
                if (yeoVar2 != null) {
                    yeoVar2.success("volume_down");
                    return true;
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }
}
