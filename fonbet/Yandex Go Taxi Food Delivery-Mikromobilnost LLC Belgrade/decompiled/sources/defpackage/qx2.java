package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.a;
import kotlinx.coroutines.c;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;

/* loaded from: classes.dex */
public final class qx2 {
    public final Context a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final tt2 e;
    public volatile c f = a.a();
    public final hbp0 g;

    public qx2(Context context, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, tt2 tt2Var) {
        this.a = context;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = tt2Var;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        hbp0Var.a();
        this.g = hbp0Var;
    }

    public static Pair a(List list) {
        Object obj;
        Object obj2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((FavoriteAddress) obj2).getPlaceType() == PlaceType.HOME) {
                break;
            }
        }
        FavoriteAddress favoriteAddress = (FavoriteAddress) obj2;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((FavoriteAddress) next).getPlaceType() == PlaceType.WORK) {
                obj = next;
                break;
            }
        }
        return new Pair(favoriteAddress, (FavoriteAddress) obj);
    }

    public final Intent b(String str, boolean z) {
        Intent intent = new Intent(this.a, (Class<?>) ((y72) this.c.get()).a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(603979776);
        intent.putExtra("SHORTCUT_TARGET", str);
        if (z) {
            intent.putExtra("SHORTCUT_ACTION", "SHORTCUT_ACTION_SET_DESTINATION");
            return intent;
        }
        intent.putExtra("SHORTCUT_ACTION", "SHORTCUT_ACTION_ADD");
        return intent;
    }

    public final String c(FavoriteAddress favoriteAddress, int i, int i2) {
        Context context = this.a;
        String string = context.getString(i);
        String string2 = context.getString(i2);
        String q = (favoriteAddress == null || jl40.l(string, favoriteAddress.getName())) ? string2 : favoriteAddress.q();
        return evu0.J(q) ? string2 : q;
    }

    public final void d(Pair pair) {
        Context context = this.a;
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            jst.e.k(new NullPointerException("ShortcutManager is null"), "can't get ShortcutManager instance");
            return;
        }
        ShortcutInfo.Builder shortLabel = new ShortcutInfo.Builder(context, "home").setShortLabel(c((FavoriteAddress) pair.c(), kyh0.favorite_home, kyh0.suggested_favorite_home));
        FavoriteAddress favoriteAddress = (FavoriteAddress) pair.c();
        int i = yyg0.shortcut_home;
        if (favoriteAddress == null) {
            i = yyg0.shortcut_add;
        }
        ShortcutInfo build = shortLabel.setIcon(Icon.createWithResource(context, i)).setIntent(b("SHORTCUT_TARGET_HOME", ((FavoriteAddress) pair.c()) != null)).build();
        ShortcutInfo.Builder shortLabel2 = new ShortcutInfo.Builder(context, "work").setShortLabel(c((FavoriteAddress) pair.f(), kyh0.favorite_work, kyh0.suggested_favorite_work));
        FavoriteAddress favoriteAddress2 = (FavoriteAddress) pair.f();
        int i2 = yyg0.shortcut_work;
        if (favoriteAddress2 == null) {
            i2 = yyg0.shortcut_add;
        }
        shortcutManager.setDynamicShortcuts(scc.g(build, shortLabel2.setIcon(Icon.createWithResource(context, i2)).setIntent(b("SHORTCUT_TARGET_WORK", ((FavoriteAddress) pair.f()) != null)).build()));
    }
}
