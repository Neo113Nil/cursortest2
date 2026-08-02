package ru.yandex.taxi.logistics.explicit_comment_courier.choose_message_recipient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.crb;
import defpackage.drb;
import defpackage.frb;
import defpackage.grb;
import defpackage.hrb;
import defpackage.iqh0;
import defpackage.irb;
import defpackage.ny61;
import defpackage.xni;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0018\u0010\u0017\u001a\u00060\u0016R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/choose_message_recipient/ChooseMessageRecipientModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcrb;", "Landroid/content/Context;", "context", "Lfrb;", "presenter", "Lirb;", "engineFactory", "<init>", "(Landroid/content/Context;Lfrb;Lirb;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcrb;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lfrb;", "Ldrb;", "mvpView", "Ldrb;", "Lgrb;", "args", "Lgrb;", "getArgs", "()Lgrb;", "Lhrb;", "callback", "Lhrb;", "getCallback", "()Lhrb;", "Lxni;", "engine", "Lxni;", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChooseMessageRecipientModalView extends SlideableBindingModalView<crb> {
    private final grb args;
    private final hrb callback;
    private final xni engine;
    private final drb mvpView;
    private final frb presenter;

    public ChooseMessageRecipientModalView(Context context, frb frbVar, irb irbVar) {
        super(context);
        this.mvpView = new drb();
        throw null;
    }

    private static final void _init_$lambda$0(ChooseMessageRecipientModalView chooseMessageRecipientModalView) {
        chooseMessageRecipientModalView.getClass();
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public crb bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup cardContentContainer = getCardContentContainer();
        View inflate = from.inflate(iqh0.choose_message_recipient, cardContentContainer, false);
        cardContentContainer.addView(inflate);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            return new crb(frameLayout, frameLayout);
        }
        ny61.t("rootView");
        return null;
    }

    public final grb getArgs() {
        return null;
    }

    public final hrb getCallback() {
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.a();
        throw null;
    }
}
