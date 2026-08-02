package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class ols {
    public static final jyr a = btf.b(new w8a("prefs", 2));
    public static final List b = u75.h(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987);

    public static int a(String str) {
        int i = ((SharedPreferences) a.getValue()).getInt(str, 0);
        return (i != 20 ? i : 0) + 1;
    }

    public static void b(Context context) {
        context.getClass();
        int a2 = a("track_dislike_click_counter");
        if (b.contains(Integer.valueOf(a2))) {
            hag.x(context, R.string.track_added_to_dislikes, 0);
        }
        SharedPreferences.Editor edit = ((SharedPreferences) a.getValue()).edit();
        edit.putInt("track_dislike_click_counter", a2);
        edit.apply();
    }

    public static void c(Context context) {
        context.getClass();
        int a2 = a("track_undislike_click_counter");
        if (b.contains(Integer.valueOf(a2))) {
            hag.x(context, R.string.track_was_removed_from_dislikes, 0);
        }
        SharedPreferences.Editor edit = ((SharedPreferences) a.getValue()).edit();
        edit.putInt("track_undislike_click_counter", a2);
        edit.apply();
    }
}
