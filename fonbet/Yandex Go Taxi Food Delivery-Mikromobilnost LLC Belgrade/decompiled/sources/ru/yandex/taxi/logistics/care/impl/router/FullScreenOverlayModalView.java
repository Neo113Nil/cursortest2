package ru.yandex.taxi.logistics.care.impl.router;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.bjs;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/care/impl/router/FullScreenOverlayModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Landroid/view/View;", "content", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "contentView", "()Landroid/view/View;", "Lzy11;", "onAttachedToWindow", "()V", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullScreenOverlayModalView extends ModalView {
    private final View content;

    public FullScreenOverlayModalView(Context context, View view) {
        super(context);
        this.content = view;
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets onAttachedToWindow$lambda$0(View view, WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnApplyWindowInsetsListener(new bjs());
    }
}
