package ru.yandex.taxi.surge.dialog.accept_paid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import defpackage.agh0;
import defpackage.c230;
import defpackage.d4;
import defpackage.e230;
import defpackage.kyh0;
import defpackage.mcb1;
import defpackage.mrg0;
import defpackage.p0;
import defpackage.qu;
import defpackage.rp31;
import defpackage.ryh;
import defpackage.tje;
import defpackage.vc;
import defpackage.wc;
import defpackage.xc;
import defpackage.yrh0;
import defpackage.zc;
import defpackage.zfh0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010,¨\u0006-"}, d2 = {"Lru/yandex/taxi/surge/dialog/accept_paid/AcceptPaidOptionDialog;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lxc;", "model", "<init>", "(Landroid/content/Context;Lxc;)V", "Lzy11;", "setupNextButton", "(Lxc;)V", "Lru/yandex/taxi/design/ListItemComponent;", "listItem", "", "text", "setText", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/String;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lwc;", "callback", "withCallback", "(Lwc;)Lru/yandex/taxi/surge/dialog/accept_paid/AcceptPaidOptionDialog;", "Landroid/view/ViewGroup;", "parent", "", "zOrder", "show", "(Landroid/view/ViewGroup;F)V", "onDismissManually", "()V", "onModalViewDisappear", "content", "Landroid/view/View;", "titleView", "Lru/yandex/taxi/design/ListItemComponent;", "descriptionView", "reasonView", "commentView", "buttonsHolder", "Lwc;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AcceptPaidOptionDialog extends ModalView {
    private final View buttonsHolder;
    private wc callback;
    private final ListItemComponent commentView;
    private final View content;
    private final ListItemComponent descriptionView;
    private final ListItemComponent reasonView;
    private final ListItemComponent titleView;

    public AcceptPaidOptionDialog(Context context, xc xcVar) {
        super(context, null);
        c.q(this, yrh0.accept_paid_options_dialog, true);
        int i = agh0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, zfh0.paid_options_title));
        this.titleView = listItemComponent;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(this, zfh0.paid_options_description));
        this.descriptionView = listItemComponent2;
        ListItemComponent listItemComponent3 = (ListItemComponent) ((View) rp31.d(this, zfh0.paid_options_reason));
        this.reasonView = listItemComponent3;
        ListItemComponent listItemComponent4 = (ListItemComponent) ((View) rp31.d(this, zfh0.paid_options_comment));
        this.commentView = listItemComponent4;
        this.buttonsHolder = (View) rp31.d(this, zfh0.buttons_holder);
        listItemComponent.setLeadImage(xcVar.a);
        setText(listItemComponent, xcVar.c);
        setText(listItemComponent2, xcVar.d);
        setText(listItemComponent3, xcVar.e);
        setText(listItemComponent4, xcVar.f);
        setupNextButton(xcVar);
        ((ButtonComponent) ((View) rp31.d(this, zfh0.paid_options_cancel))).setOnClickListener(new vc(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AcceptPaidOptionDialog acceptPaidOptionDialog, View view) {
        acceptPaidOptionDialog.dismiss();
        wc wcVar = acceptPaidOptionDialog.callback;
        if (wcVar != null) {
            ((zc) ((ryh) wcVar).b).r(new qu(9));
        }
    }

    private final void setText(ListItemComponent listItem, String text) {
        listItem.setTitle(text);
        listItem.setVisibility((text == null || text.length() == 0) ? 8 : 0);
    }

    private final void setupNextButton(xc model) {
        int i = zfh0.paid_options_next;
        WeakHashMap weakHashMap = b.a;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, i));
        buttonComponent.setOnClickListener(new vc(this, 0));
        String str = model.g;
        if (str == null || str.length() == 0) {
            str = getContext().getString(kyh0.common_next);
        }
        buttonComponent.setText(str);
        mcb1.a(buttonComponent, model.b);
        buttonComponent.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(mrg0.button_component_default_rounded_corners_radius, getContext())));
        buttonComponent.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupNextButton$lambda$0(AcceptPaidOptionDialog acceptPaidOptionDialog, View view) {
        acceptPaidOptionDialog.dismiss();
        wc wcVar = acceptPaidOptionDialog.callback;
        if (wcVar != null) {
            ((zc) ((ryh) wcVar).b).r(new p0(6));
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new d4(4, this), false);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        wc wcVar = this.callback;
        if (wcVar != null) {
            ((zc) ((ryh) wcVar).b).r(new qu(9));
        }
        super.onDismissManually();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.callback = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void show(ViewGroup parent, float zOrder) {
        super.show(parent, zOrder);
        String titleText = this.titleView.getTitleText();
        if (titleText == null || titleText.length() == 0) {
            String titleText2 = this.descriptionView.getTitleText();
            if (titleText2 == null || titleText2.length() == 0) {
                String titleText3 = this.reasonView.getTitleText();
                if (titleText3 == null || titleText3.length() == 0) {
                    this.commentView.setDividers(DividerPosition.NONE, DividerType.NORMAL);
                }
            }
        }
    }

    public final AcceptPaidOptionDialog withCallback(wc callback) {
        this.callback = callback;
        return this;
    }
}
