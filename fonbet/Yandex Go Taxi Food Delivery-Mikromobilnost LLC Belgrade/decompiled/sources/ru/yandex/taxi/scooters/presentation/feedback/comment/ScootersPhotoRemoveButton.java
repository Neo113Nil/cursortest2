package ru.yandex.taxi.scooters.presentation.feedback.comment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.cma1;
import defpackage.mho0;
import defpackage.nho0;
import defpackage.ny61;
import defpackage.oho0;
import defpackage.pfh0;
import defpackage.pho0;
import defpackage.q0h0;
import defpackage.qho0;
import defpackage.qje;
import defpackage.qrh0;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.progress.SpinnerProgressBar;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0004\u000b\u001e!$B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u001eR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u00060!R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u00060$R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/comment/ScootersPhotoRemoveButton;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lpho0;", "newState", "Lzy11;", "changeState", "(Lpho0;)V", "tintColorAttrId", "Landroid/graphics/drawable/Drawable;", "requireBackgroundDrawableWithTint", "(I)Landroid/graphics/drawable/Drawable;", "drawableRes", "requireDrawableWithTint", "(II)Landroid/graphics/drawable/Drawable;", "showLoading", "()V", "showError", "showLoaded", "Lqho0;", "binding", "Lqho0;", "Loho0;", "loadingState", "Loho0;", "Lmho0;", "errorState", "Lmho0;", "Lnho0;", "loadedState", "Lnho0;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersPhotoRemoveButton extends GoFrameLayout {
    public static final int $stable = 8;
    private final qho0 binding;
    private final mho0 errorState;
    private final nho0 loadedState;
    private final oho0 loadingState;

    public ScootersPhotoRemoveButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(qrh0.scooters_photo_remove_button, this);
        int i3 = pfh0.image_view;
        GoImageView goImageView = (GoImageView) cma1.O(i3, this);
        if (goImageView != null) {
            i3 = pfh0.progress_bar;
            SpinnerProgressBar spinnerProgressBar = (SpinnerProgressBar) cma1.O(i3, this);
            if (spinnerProgressBar != null) {
                this.binding = new qho0(this, goImageView, spinnerProgressBar);
                this.loadingState = new oho0(this);
                this.errorState = new mho0(this);
                this.loadedState = new nho0(this);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final void changeState(pho0 newState) {
        setEnabled(newState.isEnabled());
        setBackground(newState.getBackground());
        androidx.core.view.b.t(this, newState.b());
        this.binding.b.setImageDrawable(newState.a());
        this.binding.b.setVisibility(newState.a() == null ? 4 : 0);
        this.binding.c.setVisibility(newState.a() == null ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable requireBackgroundDrawableWithTint(int tintColorAttrId) {
        return requireDrawableWithTint(q0h0.circle_remove_button_bg, tintColorAttrId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable requireDrawableWithTint(int drawableRes, int tintColorAttrId) {
        Drawable y = tje.y(drawableRes, getContext());
        y.setTint(qje.t(tintColorAttrId, getContext()));
        return y;
    }

    public final void showError() {
        changeState(this.errorState);
    }

    public final void showLoaded() {
        changeState(this.loadedState);
    }

    public final void showLoading() {
        changeState(this.loadingState);
    }

    public ScootersPhotoRemoveButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersPhotoRemoveButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersPhotoRemoveButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersPhotoRemoveButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
