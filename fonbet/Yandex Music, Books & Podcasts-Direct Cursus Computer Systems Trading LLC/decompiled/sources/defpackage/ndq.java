package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes6.dex */
public abstract class ndq {
    public final String a;
    public final irb b;
    public final irb c;
    public final int d;

    public ndq(String str, int i, int i2, int i3) {
        irb irbVar = new irb(i, 7);
        irb irbVar2 = new irb(i2, 7);
        this.a = str;
        this.b = irbVar;
        this.c = irbVar2;
        this.d = i3;
    }

    public final ShortcutInfo a(Context context) {
        context.getClass();
        Intent c = c(context);
        lhs lhsVar = MainScreenActivity.Q0;
        Intent J = imp.J(context, null, null, null, 14);
        String str = this.a;
        Intent action = J.putExtra("extra.shortcutId", str).setAction("action.reportShortcut");
        action.getClass();
        ShortcutInfo build = new ShortcutInfo.Builder(context, str).setShortLabel(context.getString(this.b.b)).setLongLabel(context.getString(this.c.b)).setIcon(Icon.createWithResource(context, this.d)).setIntents(new Intent[]{action, c}).build();
        build.getClass();
        return build;
    }

    public abstract pjc b(Context context);

    public abstract Intent c(Context context);

    public final String toString() {
        return hrg.q("Shortcut('", this.a, "')");
    }
}
