package ru.yandex.taxi.cashback.login;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import defpackage.agh0;
import defpackage.bid0;
import defpackage.cid0;
import defpackage.d5b0;
import defpackage.ffh0;
import defpackage.frh0;
import defpackage.oy80;
import defpackage.qeb1;
import defpackage.rp31;
import defpackage.wnb0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.zalogin.d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/cashback/login/PlusPortalLoginModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lcid0;", "callback", "<init>", "(Landroid/content/Context;Lcid0;)V", "Lzy11;", "onAttachedToWindow", "()V", "dismiss", "onDismissManually", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lcid0;", "root", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusPortalLoginModalView extends ModalView {
    private final cid0 callback;
    private final View root;

    public PlusPortalLoginModalView(Context context, cid0 cid0Var) {
        super(context);
        this.callback = cid0Var;
        c.q(this, frh0.plus_portal_login_modal_view, true);
        int i = agh0.content;
        WeakHashMap weakHashMap = b.a;
        this.root = (View) rp31.d(this, i);
        ((View) rp31.d(this, ffh0.plus_portal_login_button)).setOnClickListener(new d5b0(12, this));
        setDismissOnBackPressed(true);
        setInterceptOnBackPress(true);
        setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PlusPortalLoginModalView plusPortalLoginModalView, View view) {
        bid0 bid0Var = (bid0) ((oy80) plusPortalLoginModalView.callback).b;
        d dVar = bid0Var.d;
        dVar.b(Events$Zalogin$LinkageContext.PLUS_HOME, qeb1.b(dVar.e), new wnb0(14, bid0Var), new wnb0(15, bid0Var.c));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.root;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        oy80 oy80Var = (oy80) this.callback;
        if (((bid0) oy80Var.b).b.a.Ng()) {
            return;
        }
        ((wnb0) oy80Var.c).run();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.root.post(new wnb0(13, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        oy80 oy80Var = (oy80) this.callback;
        if (((bid0) oy80Var.b).b.a.Ng()) {
            return;
        }
        ((wnb0) oy80Var.c).run();
    }
}
