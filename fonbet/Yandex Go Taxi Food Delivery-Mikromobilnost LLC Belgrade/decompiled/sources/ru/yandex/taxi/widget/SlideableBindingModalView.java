package ru.yandex.taxi.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.zo31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lzo31;", "T", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initialState", "(Landroid/content/Context;I)V", "", "manualInit", "(Landroid/content/Context;Z)V", "Landroid/view/View;", "inflateCardContent", "()Landroid/view/View;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzo31;", "bindingInternal", "Lzo31;", "getBinding", "()Lzo31;", "binding", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class SlideableBindingModalView<T extends zo31> extends SlideableModalView {
    private T bindingInternal;

    public SlideableBindingModalView(Context context) {
        super(context);
    }

    public abstract T bindingFactory(LayoutInflater inflater, ViewGroup parent);

    public final T getBinding() {
        T t = this.bindingInternal;
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public final int getCardContentViewLayoutRes() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public final View inflateCardContent() {
        T bindingFactory = bindingFactory(LayoutInflater.from(getContext()), getCardContentContainer());
        this.bindingInternal = bindingFactory;
        if (bindingFactory == null) {
            bindingFactory = null;
        }
        if (bindingFactory.getRoot().getParent() == null) {
            ViewGroup cardContentContainer = getCardContentContainer();
            T t = this.bindingInternal;
            if (t == null) {
                t = null;
            }
            cardContentContainer.addView(t.getRoot());
        }
        T t2 = this.bindingInternal;
        return (t2 != null ? t2 : null).getRoot();
    }

    public SlideableBindingModalView(Context context, int i) {
        super(context, i);
    }

    public SlideableBindingModalView(Context context, boolean z) {
        super(context, z);
    }
}
