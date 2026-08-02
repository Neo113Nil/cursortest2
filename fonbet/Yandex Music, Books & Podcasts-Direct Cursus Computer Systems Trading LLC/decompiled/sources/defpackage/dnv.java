package defpackage;

import android.content.Context;
import android.content.Intent;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes6.dex */
public final class dnv {
    public final Context a;

    public dnv(Context context) {
        this.a = context;
    }

    public final void a() {
        lhs lhsVar = MainScreenActivity.Q0;
        Context context = this.a;
        Intent addFlags = imp.J(context, null, null, null, 14).addFlags(268435456);
        addFlags.getClass();
        context.startActivity(addFlags);
    }
}
