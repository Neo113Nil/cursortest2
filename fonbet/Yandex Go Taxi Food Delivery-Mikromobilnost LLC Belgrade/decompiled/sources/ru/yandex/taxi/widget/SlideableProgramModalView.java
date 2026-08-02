package ru.yandex.taxi.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\b\u0010\u0013\u001a\u00020\u0002H\u0004J\r\u0010\u0014\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fR\u0010\u0010\u000b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/widget/SlideableProgramModalView;", "T", "Landroid/view/View;", "Lru/yandex/taxi/widget/SlideableModalView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "initialState", "", "(Landroid/content/Context;I)V", "contentRootViewInternal", "Landroid/view/View;", "contentRootView", "getContentRootView", "()Landroid/view/View;", "cardContentViewLayoutRes", "getCardContentViewLayoutRes", "()I", "inflateCardContent", "createContentRootView", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SlideableProgramModalView<T extends View> extends SlideableModalView {
    private T contentRootViewInternal;

    public SlideableProgramModalView(Context context) {
        super(context);
    }

    public abstract T createContentRootView();

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public final int getCardContentViewLayoutRes() {
        return 0;
    }

    public final T getContentRootView() {
        T t = this.contentRootViewInternal;
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public final View inflateCardContent() {
        T createContentRootView = createContentRootView();
        this.contentRootViewInternal = createContentRootView;
        if (createContentRootView == null) {
            createContentRootView = null;
        }
        if (createContentRootView.getParent() == null) {
            ViewGroup cardContentContainer = getCardContentContainer();
            T t = this.contentRootViewInternal;
            if (t == null) {
                t = null;
            }
            cardContentContainer.addView(t);
        }
        T t2 = this.contentRootViewInternal;
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    public SlideableProgramModalView(Context context, int i) {
        super(context, i);
    }
}
