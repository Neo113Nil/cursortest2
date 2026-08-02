package ru.yandex.taxi.preorder.extraphone.requiredmodalview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.preorder.extraphone.PopupProperties;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.agh0;
import defpackage.e90;
import defpackage.evu0;
import defpackage.kyh0;
import defpackage.lx4;
import defpackage.pex0;
import defpackage.rp31;
import defpackage.s4p;
import defpackage.sdh0;
import defpackage.t4p;
import defpackage.u4p;
import defpackage.v4p;
import defpackage.wph0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.extraphone.requiredmodalview.ExtraPhoneRequiredModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&¨\u0006'"}, d2 = {"Lru/yandex/taxi/preorder/extraphone/requiredmodalview/ExtraPhoneRequiredModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lt4p;", "Landroid/content/Context;", "context", "Lu4p;", "presenter", "<init>", "(Landroid/content/Context;Lu4p;)V", "Lzy11;", "onSelectPhoneClick", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonText", "show", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ls4p;", "setOnSelectPhoneClick", "(Ls4p;)V", "Lu4p;", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "cancelButton", "Lru/yandex/taxi/design/ButtonComponent;", "okButton", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Ls4p;", "extraphone"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraPhoneRequiredModalView extends ModalView implements t4p {
    private final ButtonComponent cancelButton;
    private final ViewGroup content;
    private final ListTextComponent description;
    private final ButtonComponent okButton;
    private s4p onSelectPhoneClick;
    private final u4p presenter;
    private final ListTitleComponent title;

    public ExtraPhoneRequiredModalView(Context context, u4p u4pVar) {
        super(context);
        this.presenter = u4pVar;
        c.q(this, wph0.extra_phone_modal_view, true);
        int i = sdh0.extra_phone_required_title;
        WeakHashMap weakHashMap = b.a;
        this.title = (ListTitleComponent) ((View) rp31.d(this, i));
        this.description = (ListTextComponent) ((View) rp31.d(this, sdh0.extra_phone_required_description));
        this.cancelButton = (ButtonComponent) ((View) rp31.d(this, sdh0.extra_phone_required_cancel));
        this.okButton = (ButtonComponent) ((View) rp31.d(this, sdh0.extra_phone_required_ok));
        this.content = (ViewGroup) ((View) rp31.d(this, agh0.content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectPhoneClick() {
        ((j) ((lx4) this.presenter.x.b)).d("DeliveryExtraPhone.PopupTap").m();
        s4p s4pVar = this.onSelectPhoneClick;
        if (s4pVar != null) {
            e90 e90Var = (e90) s4pVar;
            ExtraPhoneRequiredModalView extraPhoneRequiredModalView = (ExtraPhoneRequiredModalView) e90Var.b;
            v4p v4pVar = (v4p) e90Var.c;
            extraPhoneRequiredModalView.dismiss();
            v4pVar.b.a();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ExtraContactPhonesRules extraContactPhonesRules;
        super.onAttachedToWindow();
        u4p u4pVar = this.presenter;
        u4pVar.Bg(this);
        pex0 m = ((k) u4pVar.w.a).m();
        if (m == null || (extraContactPhonesRules = m.W) == null) {
            extraContactPhonesRules = ExtraContactPhonesRules.f;
        }
        PopupProperties popupProperties = extraContactPhonesRules.d;
        show(popupProperties.c, popupProperties.b, popupProperties.a);
        ((j) ((lx4) u4pVar.x.b)).d("DeliveryExtraPhone.PopupShow").m();
        final int i = 0;
        this.cancelButton.setDebounceClickListener(new Runnable(this) { // from class: r4p
            public final /* synthetic */ ExtraPhoneRequiredModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ExtraPhoneRequiredModalView extraPhoneRequiredModalView = this.b;
                switch (i2) {
                    case 0:
                        extraPhoneRequiredModalView.dismiss();
                        break;
                    default:
                        extraPhoneRequiredModalView.onSelectPhoneClick();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.okButton.setDebounceClickListener(new Runnable(this) { // from class: r4p
            public final /* synthetic */ ExtraPhoneRequiredModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ExtraPhoneRequiredModalView extraPhoneRequiredModalView = this.b;
                switch (i22) {
                    case 0:
                        extraPhoneRequiredModalView.dismiss();
                        break;
                    default:
                        extraPhoneRequiredModalView.onSelectPhoneClick();
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.cancelButton.setDebounceClickListener(null);
        this.okButton.setDebounceClickListener(null);
    }

    public final void setOnSelectPhoneClick(s4p onSelectPhoneClick) {
        this.onSelectPhoneClick = onSelectPhoneClick;
    }

    @Override // defpackage.t4p
    public void show(String title, String description, String buttonText) {
        this.title.setTitle(title);
        this.description.setText(description);
        this.title.setVisibility(evu0.J(title) ? 8 : 0);
        this.description.setVisibility(evu0.J(description) ? 8 : 0);
        ButtonComponent buttonComponent = this.okButton;
        if (evu0.J(buttonText)) {
            buttonText = getContext().getString(kyh0.common_next);
        }
        buttonComponent.setText(buttonText);
    }
}
