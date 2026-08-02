package ru.yandex.taxi.superapp.chat.view;

import android.widget.FrameLayout;
import defpackage.ce0;
import defpackage.e230;
import defpackage.lnv0;
import defpackage.ogu0;
import defpackage.ou4;
import defpackage.qsv0;
import defpackage.rsv0;
import defpackage.y130;
import kotlin.Metadata;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004*\u0001\u0015\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/superapp/chat/view/SuperAppChatView;", "Lru/yandex/taxi/widget/ModalView;", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "webViewContainer", "Lrsv0;", "presenter", "Ljava/lang/Runnable;", "onClose", "<init>", "(Lru/yandex/taxi/web/view/WebViewContainerImpl;Lrsv0;Ljava/lang/Runnable;)V", "Le230;", "insetsType", "()Le230;", "contentView", "()Lru/yandex/taxi/web/view/WebViewContainerImpl;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "Lrsv0;", "qsv0", "innerMvpView", "Lqsv0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuperAppChatView extends ModalView {
    private final qsv0 innerMvpView;
    private final rsv0 presenter;
    private final WebViewContainerImpl webViewContainer;

    public SuperAppChatView(WebViewContainerImpl webViewContainerImpl, rsv0 rsv0Var, Runnable runnable) {
        super(webViewContainerImpl.getContext());
        this.webViewContainer = webViewContainerImpl;
        this.presenter = rsv0Var;
        this.innerMvpView = new qsv0(this);
        addView(webViewContainerImpl, new FrameLayout.LayoutParams(-1, -1));
        webViewContainerImpl.setOnCloseRequested(new lnv0(2, this));
        setOnAppearingListener(new ou4(11, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SuperAppChatView superAppChatView) {
        superAppChatView.dismiss();
        WebViewContainerImpl webViewContainerImpl = superAppChatView.webViewContainer;
        if (webViewContainerImpl == null) {
            return;
        }
        webViewContainerImpl.post(new ce0(webViewContainerImpl, 15));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(0, new ogu0(17, this), true);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rsv0 rsv0Var = this.presenter;
        rsv0Var.Bg(this.innerMvpView);
        h hVar = rsv0Var.w;
        hVar.a.push(rsv0Var.x);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public WebViewContainerImpl getContent() {
        return this.webViewContainer;
    }
}
