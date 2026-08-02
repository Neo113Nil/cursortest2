package ru.yandex.taxi.surge.dialog;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.vpa;
import defpackage.yrh0;
import defpackage.z990;
import defpackage.zfh0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.dialog.BaseDialog;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/surge/dialog/PaidOptionDialog;", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "Landroid/app/Activity;", "activity", "Landroid/graphics/drawable/Drawable;", "icon", "<init>", "(Landroid/app/Activity;Landroid/graphics/drawable/Drawable;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getCustomView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lzy11;", "onViewCreated", "()V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)Lru/yandex/taxi/surge/dialog/PaidOptionDialog;", Constants.KEY_MESSAGE, "setMessage", "", "buttonText", "addButton", "(Ljava/lang/String;)Lru/yandex/taxi/surge/dialog/PaidOptionDialog;", "Landroid/graphics/drawable/Drawable;", "Lz990;", "binding", "Lz990;", "getBinding", "()Lz990;", "setBinding", "(Lz990;)V", "dialogTitle", "Ljava/lang/CharSequence;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaidOptionDialog extends BaseDialog<PaidOptionDialog> {
    public z990 binding;
    private CharSequence dialogTitle;
    private final Drawable icon;
    private CharSequence message;

    public PaidOptionDialog(Activity activity, Drawable drawable) {
        super(activity);
        this.icon = drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addButton$lambda$0() {
    }

    public final PaidOptionDialog addButton(String buttonText) {
        setMainActionButton(buttonText, new vpa(19), (String) null);
        return this;
    }

    public final z990 getBinding() {
        z990 z990Var = this.binding;
        if (z990Var != null) {
            return z990Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public View getCustomView(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(yrh0.paid_option_dialog, parent, false);
        int i = zfh0.payed_option_message;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = zfh0.payed_option_title;
            ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
            if (listHeaderComponent != null) {
                i = zfh0.surge_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView != null) {
                    setBinding(new z990((ScrollView) inflate, robotoTextView, listHeaderComponent, appCompatImageView));
                    return getBinding().a;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public void onViewCreated() {
        super.onViewCreated();
        getBinding().d.setImageDrawable(this.icon);
        int i = 8;
        getBinding().d.setVisibility(this.icon != null ? 0 : 8);
        getBinding().c.setTitle(this.dialogTitle);
        ListHeaderComponent listHeaderComponent = getBinding().c;
        CharSequence charSequence = this.dialogTitle;
        if (charSequence != null && charSequence.length() != 0) {
            i = 0;
        }
        listHeaderComponent.setVisibility(i);
        getBinding().b.setText(this.message);
    }

    public final void setBinding(z990 z990Var) {
        this.binding = z990Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public PaidOptionDialog setMessage(CharSequence message) {
        this.message = message;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public PaidOptionDialog setTitle(CharSequence title) {
        this.dialogTitle = title;
        return this;
    }
}
