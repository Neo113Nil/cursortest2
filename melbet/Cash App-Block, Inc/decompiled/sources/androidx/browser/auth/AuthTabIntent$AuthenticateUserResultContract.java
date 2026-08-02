package androidx.browser.auth;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.room.CoroutinesRoom;

/* loaded from: classes3.dex */
public class AuthTabIntent$AuthenticateUserResultContract extends ActivityResultContract<Intent, CoroutinesRoom.Companion> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        return (Intent) obj;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if (i == -1 && intent != null) {
            intent.getData();
        }
        return new CoroutinesRoom.Companion(2);
    }
}
