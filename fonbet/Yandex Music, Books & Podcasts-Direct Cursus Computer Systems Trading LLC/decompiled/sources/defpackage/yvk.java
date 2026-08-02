package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes5.dex */
public final class yvk extends wjq {
    @Override // defpackage.ndq
    public final Intent c(Context context) {
        context.getClass();
        lhs lhsVar = MainScreenActivity.Q0;
        Intent action = imp.J(context, null, null, null, 14).setAction("action.startPlayback");
        action.getClass();
        return action;
    }

    @Override // defpackage.wjq
    public final HashSet d() {
        return wjq.e;
    }
}
