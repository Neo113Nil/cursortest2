package defpackage;

import android.content.ComponentName;
import android.content.Context;
import ru.yandex.music.ui.widget.WidgetRecentlyRectangleReceiver;
import ru.yandex.music.ui.widget.WidgetRectangleReceiver;
import ru.yandex.music.ui.widget.WidgetSquareReceiver;

/* loaded from: classes5.dex */
public final class knv {
    public final Context a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final tf6 e;
    public final xdr f;
    public final bca g;
    public final uqi h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;

    public knv(Context context, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, cnv cnvVar) {
        this.a = context;
        this.b = jyrVar;
        this.c = jyrVar2;
        this.d = jyrVar4;
        tf6 e = gld.e(dm6.b);
        this.e = e;
        this.f = ydr.a(Boolean.FALSE);
        hov hovVar = (hov) ((m9q) jyrVar3.getValue()).a;
        this.g = new bca(new l8v(((wb7) hovVar.a.getValue()).getData(), hovVar, 2), 18);
        this.h = new uqi(gfo.Widget);
        this.i = btf.b(new hnv(this, 0));
        this.j = btf.b(new hav(4, this, cnvVar));
        this.k = btf.b(new hnv(this, 1));
        this.l = btf.b(new hnv(this, 2));
        ox6.B(zsd.C(zsd.X(a().j, 100L), 0), e, new jnv(this, 0));
        ox6.B(a().k, e, new jnv(this, 1));
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) WidgetRectangleReceiver.class), 1, 1);
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) WidgetSquareReceiver.class), 1, 1);
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) WidgetRecentlyRectangleReceiver.class), 1, 1);
        ssg.a(4, "WidgetPlayerCenter2", "[enableWidget] All widgets were enabled", null);
        ssg.a(4, "WidgetPlayerCenter2", "[init] WidgetPlayerCenter2 initialized", null);
    }

    public final pov a() {
        return (pov) this.j.getValue();
    }
}
