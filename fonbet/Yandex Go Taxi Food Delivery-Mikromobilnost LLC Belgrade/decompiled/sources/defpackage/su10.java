package defpackage;

import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class su10 {
    public final x22 a;

    public su10(x22 x22Var) {
        this.a = x22Var;
    }

    public final void a(MessageMenuReporter$Item messageMenuReporter$Item) {
        this.a.c("menu_item_tap", "item", messageMenuReporter$Item.name().toLowerCase(Locale.US));
    }

    public final void b(MessageMenuReporter$Item messageMenuReporter$Item, int i) {
        this.a.f("multiselect_menu_item_tap", "item", messageMenuReporter$Item.name().toLowerCase(Locale.US), "count", Integer.valueOf(i));
    }
}
