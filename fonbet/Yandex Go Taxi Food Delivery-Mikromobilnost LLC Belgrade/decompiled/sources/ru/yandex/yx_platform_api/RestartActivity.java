package ru.yandex.yx_platform_api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import defpackage.ywj0;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/yandex/yx_platform_api/RestartActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "ywj0", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RestartActivity extends Activity {
    public static final ywj0 Companion = new ywj0();
    private static final String KEY_MAIN_PROCESS_ID = "main_process_id";
    private static final String KEY_RESTART_INTENTS = "restart_intents";

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Process.killProcess(getIntent().getIntExtra(KEY_MAIN_PROCESS_ID, -1));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(KEY_RESTART_INTENTS);
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[0]));
        }
        finish();
        Runtime.getRuntime().exit(0);
    }
}
