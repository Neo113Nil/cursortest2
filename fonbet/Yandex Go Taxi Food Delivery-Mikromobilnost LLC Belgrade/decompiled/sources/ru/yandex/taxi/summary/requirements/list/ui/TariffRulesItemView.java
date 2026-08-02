package ru.yandex.taxi.summary.requirements.list.ui;

import android.content.Context;
import defpackage.anx0;
import defpackage.g18;
import defpackage.nac;
import defpackage.pav;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/ui/TariffRulesItemView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "Lanx0;", "item", "Lzy11;", "bind", "(Lanx0;)V", "onDetachedFromWindow", "()V", "Lpav;", "Lg18;", "imageLoadTask", "Lg18;", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffRulesItemView extends ListItemComponent {
    public static final int $stable = 8;
    private g18 imageLoadTask;
    private final pav imageLoader;

    public TariffRulesItemView(Context context, pav pavVar) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.imageLoadTask = g18.u1;
    }

    public final void bind(anx0 item) {
        this.imageLoadTask.cancel();
        String str = item.c;
        if (str == null || str.length() == 0) {
            getLeadImageView().setImageDrawable(null);
        } else {
            this.imageLoadTask = ((nac) this.imageLoader.a(getLeadImageView())).c(item.c);
        }
        setTitle(item.a);
        setSubtitle(item.b);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageLoadTask.cancel();
    }
}
