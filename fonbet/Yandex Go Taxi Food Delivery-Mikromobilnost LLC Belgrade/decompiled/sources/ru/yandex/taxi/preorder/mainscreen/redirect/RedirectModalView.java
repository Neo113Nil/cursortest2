package ru.yandex.taxi.preorder.mainscreen.redirect;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import defpackage.oxe0;
import defpackage.peh0;
import defpackage.rp31;
import defpackage.sqh0;
import defpackage.vli0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/preorder/mainscreen/redirect/RedirectModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lvli0;", "innerNavigator", "", "text", "buttonTitle", "<init>", "(Landroid/content/Context;Lvli0;Ljava/lang/String;Ljava/lang/String;)V", "Lzy11;", "onAttachedToWindow", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lvli0;", "Ljava/lang/String;", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/ListHeaderComponent;", "title", "Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "button", "Lru/yandex/taxi/design/ButtonComponent;", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RedirectModalView extends ModalView {
    private final ButtonComponent button;
    private final String buttonTitle;
    private final ViewGroup content;
    private final vli0 innerNavigator;
    private final String text;
    private final ListHeaderComponent title;

    public RedirectModalView(Context context, vli0 vli0Var, String str, String str2) {
        super(context);
        this.innerNavigator = vli0Var;
        this.text = str;
        this.buttonTitle = str2;
        c.q(this, sqh0.redirect_modal_view, true);
        int i = peh0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (ViewGroup) ((View) rp31.d(this, i));
        this.title = (ListHeaderComponent) ((View) rp31.d(this, peh0.title));
        this.button = (ButtonComponent) ((View) rp31.d(this, peh0.redirect_button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(RedirectModalView redirectModalView) {
        redirectModalView.getClass();
        throw null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.title.setTitle(this.text);
        this.button.setText(this.buttonTitle);
        this.button.setDebounceClickListener(new oxe0(23, this));
    }
}
