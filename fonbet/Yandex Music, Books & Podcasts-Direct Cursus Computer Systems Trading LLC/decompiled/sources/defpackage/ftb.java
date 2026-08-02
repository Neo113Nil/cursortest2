package defpackage;

import android.view.View;
import ru.yandex.music.ui.view.RoundedOutlineProviderImageView;

/* loaded from: classes4.dex */
public final class ftb {
    public final q13 a;
    public final q13 b;
    public final q13 c;
    public static final /* synthetic */ s9f[] e = {new yxm(ftb.class, "title", "getTitle()Landroid/widget/TextView;", 0), f1d.c(ern.a, ftb.class, "subTitle", "getSubTitle()Landroid/widget/TextView;", 0), new yxm(ftb.class, "cover", "getCover()Lru/yandex/music/ui/view/RoundedOutlineProviderImageView;", 0)};
    public static final l48 d = new l48(22);

    public ftb(View view) {
        view.getClass();
        this.a = new q13(new etb(view, 0));
        this.b = new q13(new etb(view, 1));
        this.c = new q13(new etb(view, 2));
        xv.S(a());
    }

    public final RoundedOutlineProviderImageView a() {
        return (RoundedOutlineProviderImageView) this.c.a(e[2]);
    }
}
