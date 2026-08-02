package ru.yandex.taxi.costcenters.required;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import defpackage.agh0;
import defpackage.axe;
import defpackage.cxe;
import defpackage.d770;
import defpackage.i130;
import defpackage.j4n;
import defpackage.jve;
import defpackage.ldh0;
import defpackage.o61;
import defpackage.p1b;
import defpackage.qph0;
import defpackage.qwe;
import defpackage.rp31;
import defpackage.vbb;
import defpackage.w3i;
import defpackage.wwe;
import defpackage.x4e;
import defpackage.yfa;
import defpackage.zxf;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.costcenters.required.CostCenterRequiredModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/costcenters/required/CostCenterRequiredModalView;", "Lru/yandex/taxi/widget/ModalView;", "Laxe;", "Landroid/content/Context;", "context", "Lcxe;", "presenter", "<init>", "(Landroid/content/Context;Lcxe;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lzy11;", "dismiss", "()V", "onAttachedToWindow", "onDetachedFromWindow", "getFocusedForAccessibilityViewOnAppear", "Lcxe;", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CostCenterRequiredModalView extends ModalView implements axe {
    private final ViewGroup content;
    private final cxe presenter;

    public CostCenterRequiredModalView(Context context, cxe cxeVar) {
        super(context);
        this.presenter = cxeVar;
        final int i = 1;
        c.q(this, qph0.cost_center_required_modal_view, true);
        int i2 = agh0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (ViewGroup) ((View) rp31.d(this, i2));
        final int i3 = 0;
        ((ButtonComponent) ((View) rp31.d(this, ldh0.change_payment_method))).setDebounceClickListener(new Runnable(this) { // from class: bxe
            public final /* synthetic */ CostCenterRequiredModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                CostCenterRequiredModalView costCenterRequiredModalView = this.b;
                switch (i4) {
                    case 0:
                        CostCenterRequiredModalView._init_$lambda$0(costCenterRequiredModalView);
                        break;
                    default:
                        CostCenterRequiredModalView._init_$lambda$1(costCenterRequiredModalView);
                        break;
                }
            }
        });
        ((ButtonComponent) ((View) rp31.d(this, ldh0.open_cost_center_change))).setDebounceClickListener(new Runnable(this) { // from class: bxe
            public final /* synthetic */ CostCenterRequiredModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i;
                CostCenterRequiredModalView costCenterRequiredModalView = this.b;
                switch (i4) {
                    case 0:
                        CostCenterRequiredModalView._init_$lambda$0(costCenterRequiredModalView);
                        break;
                    default:
                        CostCenterRequiredModalView._init_$lambda$1(costCenterRequiredModalView);
                        break;
                }
            }
        });
        cxeVar.w.b = ((ListItemComponent) ((View) rp31.d(this, ldh0.cost_centers_required_title_view))).getTitleText();
        setImportantForAccessibility(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CostCenterRequiredModalView costCenterRequiredModalView) {
        cxe cxeVar = costCenterRequiredModalView.presenter;
        ((d770) ((w3i) cxeVar.x.a).w).a();
        ((axe) cxeVar.Dg()).dismiss();
        p1b p1bVar = cxeVar.w;
        o61 o61Var = (o61) p1bVar.a;
        o61Var.a.a("CostCenterRequiredCard.ChangePaymentMethod.Tapped", x4e.p("title", (String) p1bVar.b), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CostCenterRequiredModalView costCenterRequiredModalView) {
        cxe cxeVar = costCenterRequiredModalView.presenter;
        vbb vbbVar = cxeVar.x;
        j4n j4nVar = (j4n) vbbVar.b;
        jve jveVar = (jve) j4nVar.b;
        int size = jveVar.e.size();
        w3i w3iVar = (w3i) vbbVar.a;
        if (size == 1) {
            wwe wweVar = (wwe) w3iVar.B;
            Context context = (Context) w3iVar.b;
            CostCenterField costCenterField = (CostCenterField) jveVar.e.get(0);
            yfa yfaVar = new yfa(w3iVar);
            costCenterField.getClass();
            zxf zxfVar = new zxf(j4nVar, costCenterField, 0, yfaVar);
            wweVar.getClass();
            ((i130) w3iVar.c).a().s(wwe.a(context, zxfVar), true);
        } else {
            qwe m = j4nVar.m();
            w3iVar.getClass();
            ((i130) w3iVar.c).a().s(new CostCenterFieldsModalView((Context) w3iVar.b, m, true), true);
        }
        ((axe) cxeVar.Dg()).dismiss();
        p1b p1bVar = cxeVar.w;
        o61 o61Var = (o61) p1bVar.a;
        o61Var.a.a("CostCenterRequiredCard.FillField.Tapped", x4e.p("title", (String) p1bVar.b), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        p1b p1bVar = this.presenter.w;
        o61 o61Var = (o61) p1bVar.a;
        o61Var.a.a("CostCenterRequiredCard.Closed", x4e.p("title", (String) p1bVar.b), 1, new HashMap());
        super.dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return getContent();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cxe cxeVar = this.presenter;
        cxeVar.Bg(this);
        p1b p1bVar = cxeVar.w;
        o61 o61Var = (o61) p1bVar.a;
        o61Var.a.a("CostCenterRequiredCard.Shown", x4e.p("title", (String) p1bVar.b), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
