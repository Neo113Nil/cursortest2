package ru.yandex.taxi.widget.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.zo31;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/widget/dialog/BaseBindingDialog;", "Lzo31;", "T", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getCustomView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lzy11;", "bindViewsInFields", "()V", "Landroid/view/LayoutInflater;", "inflater", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzo31;", "bindingInternal", "Lzo31;", "getBinding", "()Lzo31;", "binding", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseBindingDialog<T extends zo31> extends BaseDialog<BaseBindingDialog<T>> {
    private T bindingInternal;

    public BaseBindingDialog(Activity activity) {
        super(activity);
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public final void bindViewsInFields() {
        super.bindViewsInFields();
    }

    public abstract T bindingFactory(LayoutInflater inflater, ViewGroup parent);

    public final T getBinding() {
        T t = this.bindingInternal;
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public final View getCustomView(ViewGroup parent) {
        T bindingFactory = bindingFactory(LayoutInflater.from(getContext()), parent);
        this.bindingInternal = bindingFactory;
        if (bindingFactory == null) {
            bindingFactory = null;
        }
        return bindingFactory.getRoot();
    }
}
