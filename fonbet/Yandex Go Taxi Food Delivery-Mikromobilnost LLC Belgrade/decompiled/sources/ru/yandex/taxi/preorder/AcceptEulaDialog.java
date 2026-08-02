package ru.yandex.taxi.preorder;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import defpackage.bd;
import defpackage.bkh0;
import defpackage.cc;
import defpackage.dc;
import defpackage.ed;
import defpackage.ely;
import defpackage.fd;
import defpackage.lbm;
import defpackage.nac;
import defpackage.obv;
import defpackage.pco;
import defpackage.pwf0;
import defpackage.qeb1;
import defpackage.r7h0;
import defpackage.rp31;
import defpackage.t26;
import defpackage.zxf0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.utils.c;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/preorder/AcceptEulaDialog;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Led;", "analytics", "Lru/yandex/taxi/utils/c;", "getImageHelper", "Lbd;", "acceptance", "Lely;", "linkMovementMethodInteractor", "<init>", "(Landroid/content/Context;Led;Lru/yandex/taxi/utils/c;Lbd;Lely;)V", "Lpco;", "callback", "withCallback", "(Lpco;)Lru/yandex/taxi/preorder/AcceptEulaDialog;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Landroid/view/ViewGroup;", "parent", "", "zOrder", "Lzy11;", "show", "(Landroid/view/ViewGroup;F)V", "onDismissManually", "()V", "onBackPressed", "Led;", "Lbd;", "content", "Landroid/view/View;", "Lpco;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AcceptEulaDialog extends ModalView {
    private final bd acceptance;
    private final ed analytics;
    private pco callback;
    private final View content;

    public AcceptEulaDialog(Context context, ed edVar, c cVar, bd bdVar, ely elyVar) {
        super(context);
        this.analytics = edVar;
        this.acceptance = bdVar;
        int i = 1;
        ru.yandex.taxi.design.utils.c.q(this, bkh0.accept_eula_modal_view, true);
        int i2 = r7h0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i2);
        this.callback = (pco) ((zxf0) pwf0.c(pco.class));
        String str = bdVar.d;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, r7h0.eula_title));
        listItemComponent.setTitle(str);
        int i3 = 0;
        listItemComponent.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        String str2 = bdVar.h;
        ImageModel$Tag$Theme imageModel$Tag$Theme = null;
        if (str2 == null || str2.length() == 0) {
            listItemComponent.clearLeadView();
        } else {
            ((nac) _init_$lambda$0(listItemComponent, cVar.a.a(listItemComponent.getLeadImageView()))).b(new obv(str2, imageModel$Tag$Theme, 6, i3));
        }
        String str3 = bdVar.e;
        if (str3 != null && str3.length() != 0) {
            TextView textView = (TextView) ((View) rp31.d(this, r7h0.eula_content));
            dc dcVar = new dc(this, i3);
            elyVar.getClass();
            Spanned fromHtml = Html.fromHtml(str3, 0);
            textView.setText(fromHtml);
            if (qeb1.d(fromHtml)) {
                textView.setMovementMethod(new LinkMovementMethod(new t26(13, dcVar, textView, elyVar)));
            } else if (textView.getMovementMethod() instanceof LinkMovementMethod) {
                textView.setMovementMethod(null);
            }
        }
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, r7h0.eula_confirm));
        buttonComponent.setOnClickListener(new dc(this, i));
        String str4 = bdVar.f;
        if (str4 != null && str4.length() != 0) {
            buttonComponent.setText(str4);
        }
        ButtonComponent buttonComponent2 = (ButtonComponent) ((View) rp31.d(this, r7h0.eula_discard));
        buttonComponent2.setOnClickListener(new dc(this, 2));
        String str5 = bdVar.g;
        if (str5 != null && str5.length() != 0) {
            buttonComponent2.setText(str5);
        }
        setDismissOnTouchOutside(false);
    }

    private static final lbm _init_$lambda$0(ListItemComponent listItemComponent, lbm lbmVar) {
        nac nacVar = (nac) lbmVar;
        nacVar.i = new cc(listItemComponent, 0);
        return nacVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AcceptEulaDialog acceptEulaDialog) {
        ((fd) acceptEulaDialog.analytics).f(acceptEulaDialog.acceptance, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(AcceptEulaDialog acceptEulaDialog) {
        acceptEulaDialog.dismiss();
        acceptEulaDialog.callback.n();
        ((fd) acceptEulaDialog.analytics).d(acceptEulaDialog.acceptance, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(AcceptEulaDialog acceptEulaDialog) {
        acceptEulaDialog.dismiss();
        acceptEulaDialog.callback.o();
        ((fd) acceptEulaDialog.analytics).e(acceptEulaDialog.acceptance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0(ListItemComponent listItemComponent) {
        listItemComponent.clearLeadView();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        ((fd) this.analytics).c(this.acceptance);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.callback.o();
        super.onDismissManually();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void show(ViewGroup parent, float zOrder) {
        super.show(parent, zOrder);
        ((fd) this.analytics).g(this.acceptance);
    }

    public final AcceptEulaDialog withCallback(pco callback) {
        this.callback = callback;
        return this;
    }
}
