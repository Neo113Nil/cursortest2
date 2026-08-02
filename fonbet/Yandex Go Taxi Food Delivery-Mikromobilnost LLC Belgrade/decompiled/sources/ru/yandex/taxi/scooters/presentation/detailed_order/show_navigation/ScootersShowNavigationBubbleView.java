package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.rp31;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "title", "Lru/yandex/taxi/design/ListItemComponent;", "getTitle", "()Lru/yandex/taxi/design/ListItemComponent;", "yes", "Lru/yandex/taxi/design/ButtonComponent;", "getYes", "()Lru/yandex/taxi/design/ButtonComponent;", "no", "getNo", "contentContainer", "Lcom/yandex/go/design/view/GoLinearLayout;", "getContentContainer", "()Lcom/yandex/go/design/view/GoLinearLayout;", "bubbleComponent", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "getBubbleComponent", "()Lru/yandex/taxi/design/bubble/BubbleComponent;", "ontheway", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersShowNavigationBubbleView extends GoFrameLayout {
    public static final int $stable = 8;
    private final BubbleComponent bubbleComponent;
    private final GoLinearLayout contentContainer;
    private final ButtonComponent no;
    private final ListItemComponent title;
    private final ButtonComponent yes;

    public ScootersShowNavigationBubbleView(Context context) {
        super(context, null, 0, 0, 14, null);
        c.q(this, qrh0.scooters_show_navigation_bubble, true);
        int i = pfh0.title;
        WeakHashMap weakHashMap = b.a;
        this.title = (ListItemComponent) ((View) rp31.d(this, i));
        this.yes = (ButtonComponent) ((View) rp31.d(this, pfh0.yes_button));
        this.no = (ButtonComponent) ((View) rp31.d(this, pfh0.no_button));
        this.contentContainer = (GoLinearLayout) ((View) rp31.d(this, pfh0.content_container));
        this.bubbleComponent = (BubbleComponent) ((View) rp31.d(this, pfh0.bubble_component));
    }

    public final BubbleComponent getBubbleComponent() {
        return this.bubbleComponent;
    }

    public final GoLinearLayout getContentContainer() {
        return this.contentContainer;
    }

    public final ButtonComponent getNo() {
        return this.no;
    }

    public final ListItemComponent getTitle() {
        return this.title;
    }

    public final ButtonComponent getYes() {
        return this.yes;
    }
}
