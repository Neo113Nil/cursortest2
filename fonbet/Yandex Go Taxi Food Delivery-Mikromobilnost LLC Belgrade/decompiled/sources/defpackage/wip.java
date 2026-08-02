package defpackage;

import android.content.Context;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.favorites.notification.FavoriteNotification;

/* loaded from: classes5.dex */
public final class wip {
    public final Context a;
    public final tj60 b;

    public wip(tj60 tj60Var, Context context) {
        this.a = context;
        this.b = tj60Var;
    }

    public final void a(String str, String str2) {
        FavoriteNotification favoriteNotification = new FavoriteNotification(this.a, "FavoriteNotification", str, str2, false, f1h0.ic_failed_change);
        c.z(new bdp(2, new bgc(12), this), favoriteNotification);
        favoriteNotification.setExpiresListener(new f08(5, this));
        favoriteNotification.startExpiresTimer(5000L);
        this.b.e(favoriteNotification);
    }
}
