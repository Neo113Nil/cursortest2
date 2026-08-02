package defpackage;

import android.view.View;
import com.yandex.go.taxi.auction.ui.AuctionView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

/* loaded from: classes14.dex */
public final class yd3 implements zo31 {
    public final AuctionView a;
    public final ListItemComponent b;
    public final IconCircleButton c;
    public final ShimmeringBar d;
    public final IconCircleButton e;

    public yd3(AuctionView auctionView, ListItemComponent listItemComponent, IconCircleButton iconCircleButton, ShimmeringBar shimmeringBar, IconCircleButton iconCircleButton2) {
        this.a = auctionView;
        this.b = listItemComponent;
        this.c = iconCircleButton;
        this.d = shimmeringBar;
        this.e = iconCircleButton2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
