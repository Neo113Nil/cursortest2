package ru.yandex.taxi.widget;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/widget/ExpandedContentModalView;", "Lru/yandex/taxi/widget/ContentModalView;", "Landroid/view/View;", "content", "", "initialState", "<init>", "(Landroid/view/View;I)V", "(Landroid/view/View;)V", "", BackendConfig.Restrictions.ENABLED, "Lzy11;", "setSwipeEnabled", "(Z)V", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "modals"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ExpandedContentModalView extends ContentModalView {
    public ExpandedContentModalView(View view) {
        this(view, 3);
        getCardContentContainer().addView(new View(getContext()), 0, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // ru.yandex.taxi.widget.ContentModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        throw new UnsupportedOperationException();
    }

    public void setSwipeEnabled(boolean enabled) {
        getBottomSheetBehavior().a0 = enabled;
    }

    private ExpandedContentModalView(View view, int i) {
        super(view, i);
    }
}
