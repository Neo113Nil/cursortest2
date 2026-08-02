package ru.yandex.taxi.costcenters.fields;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import defpackage.an8;
import defpackage.b1;
import defpackage.c230;
import defpackage.ce0;
import defpackage.e230;
import defpackage.evu0;
import defpackage.j4n;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jwe;
import defpackage.kwe;
import defpackage.ldh0;
import defpackage.lwe;
import defpackage.m501;
import defpackage.mqg0;
import defpackage.mwe;
import defpackage.owe;
import defpackage.pzt0;
import defpackage.qph0;
import defpackage.qwe;
import defpackage.rp31;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.v4a;
import defpackage.vpa;
import defpackage.w030;
import defpackage.wwe;
import defpackage.x4e;
import defpackage.xng0;
import defpackage.z50;
import defpackage.zxf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003*$+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u00060$R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/yandex/taxi/costcenters/fields/CostCenterFieldsModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lqwe;", "presenter", "", "canChangeFields", "<init>", "(Landroid/content/Context;Lqwe;Z)V", "Lru/yandex/taxi/design/ListItemComponent;", "createSelectView", "()Lru/yandex/taxi/design/ListItemComponent;", "Ljwe;", "model", "itemComponent", "", "modelPosition", "Lzy11;", "bindSelectView", "(Ljwe;Lru/yandex/taxi/design/ListItemComponent;I)V", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "dismiss", "Lqwe;", "Z", "Landroid/view/ViewGroup;", "fieldsContainer", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/ButtonComponent;", "doneView", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/costcenters/fields/c;", "adapter", "Lru/yandex/taxi/costcenters/fields/c;", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "mwe", "nwe", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CostCenterFieldsModalView extends SlideableModalView {
    private final c adapter;
    private final boolean canChangeFields;
    private final ButtonComponent doneView;
    private final ViewGroup fieldsContainer;
    private final qwe presenter;

    public CostCenterFieldsModalView(Context context, qwe qweVar, boolean z) {
        super(context);
        this.presenter = qweVar;
        this.canChangeFields = z;
        int i = ldh0.cost_center_fields_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, i));
        this.fieldsContainer = viewGroup;
        this.doneView = (ButtonComponent) ((View) rp31.d(this, ldh0.cost_center_fields_done_button));
        this.adapter = new c(this, viewGroup);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnTouchOutside(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSelectView(jwe model, ListItemComponent itemComponent, int modelPosition) {
        itemComponent.setTitle(model.b);
        String str = model.e;
        if (str == null || evu0.J(str)) {
            itemComponent.setSubtitle(model.c);
            itemComponent.setSubtitleColorAttr(xng0.textMinor);
        } else {
            itemComponent.setSubtitle(str);
            itemComponent.setSubtitleTextColor(getContext().getColor(mqg0.component_red_normal));
        }
        itemComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        int i = 2;
        if (this.canChangeFields) {
            itemComponent.setTrailMode(2);
            itemComponent.setDebounceClickListener(new z50(this, model, modelPosition, 3));
        } else {
            itemComponent.setTrailMode(0);
            itemComponent.setDebounceClickListener(new vpa(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSelectView$lambda$0(CostCenterFieldsModalView costCenterFieldsModalView, jwe jweVar, int i) {
        Object obj;
        int i2 = 15;
        if (costCenterFieldsModalView != null) {
            costCenterFieldsModalView.post(new ce0(costCenterFieldsModalView, 15));
        }
        costCenterFieldsModalView.requestFocus();
        qwe qweVar = costCenterFieldsModalView.presenter;
        i d = ((j) qweVar.A.a).d("CostCenterCard.Field.Tapped");
        d.a.putAll(kwe.a(jweVar, i));
        d.m();
        an8 an8Var = qweVar.y;
        String str = jweVar.a;
        Iterator it = ((List) an8Var.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(str, ((CostCenterField) obj).a)) {
                    break;
                }
            }
        }
        CostCenterField costCenterField = (CostCenterField) obj;
        if (costCenterField == null) {
            jst.e.r("CostCenter. field expected wasn't found", new NullPointerException());
            return;
        }
        ((w030) an8Var.c).s(wwe.a((Context) an8Var.w, new zxf((j4n) an8Var.x, costCenterField, Integer.valueOf(i), new m501(i2))), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSelectView$lambda$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemComponent createSelectView() {
        return new ListItemComponent(getContext(), null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CostCenterFieldsModalView costCenterFieldsModalView) {
        costCenterFieldsModalView.requestFocus();
        qwe qweVar = costCenterFieldsModalView.presenter;
        kwe kweVar = qweVar.A;
        b1 b1Var = kweVar.b;
        String r0 = kweVar.c.r0();
        ArrayList arrayList = kweVar.e;
        int size = kweVar.d.size();
        HashMap hashMap = new HashMap();
        hashMap.put("done_text", r0);
        hashMap.put("fields", arrayList);
        b1Var.a.a("CostCenterCard.ConfirmButton.Tapped", hashMap, 1, x4e.n(size, hashMap, "total_fields"));
        lwe lweVar = qweVar.x;
        if (lweVar.d.q(lweVar.e, lweVar.b.get())) {
            ((owe) qweVar.Dg()).dismiss();
            qweVar.z.q0();
            return;
        }
        ArrayList a = lweVar.a(true);
        i d = ((j) kweVar.a).d("CostCenterCard.ConfirmButton.Error");
        d.b(a.size(), "total_fields");
        ArrayList arrayList2 = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList2.add(kwe.a((jwe) next, i));
            i = i2;
        }
        d.a.put("fields", arrayList2);
        d.m();
        pzt0 pzt0Var = qweVar.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        qweVar.B = tje.N(qweVar.Jg(), null, null, new CostCenterFieldsPresenter$onDoneClick$$inlined$safeCollectIn$1(new n(new b(lweVar.a.c(), lweVar, true), new CostCenterFieldsInteractor$getCostCenterFieldsFlow$2(lweVar, true, null)), null, qweVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        post(new ce0(this, 15));
        kwe kweVar = this.presenter.A;
        b1 b1Var = kweVar.b;
        String r0 = kweVar.c.r0();
        ArrayList arrayList = kweVar.e;
        int size = kweVar.d.size();
        HashMap hashMap = new HashMap();
        hashMap.put("done_text", r0);
        hashMap.put("fields", arrayList);
        b1Var.a.a("CostCenterCard.Closed", hashMap, 1, x4e.n(size, hashMap, "total_fields"));
        super.dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return qph0.cost_center_fields_modal_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new CostCenterFieldsModalView$insetsType$1(this, CostCenterFieldsModalView.class, "cardContentContainer", "getCardContentContainer()Landroid/view/ViewGroup;", 0), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qwe qweVar = this.presenter;
        qweVar.Bg(new mwe(this));
        kwe kweVar = qweVar.A;
        b1 b1Var = kweVar.b;
        String r0 = kweVar.c.r0();
        ArrayList arrayList = kweVar.e;
        int size = kweVar.d.size();
        HashMap hashMap = new HashMap();
        hashMap.put("done_text", r0);
        hashMap.put("fields", arrayList);
        b1Var.a.a("CostCenterCard.Opened", hashMap, 1, x4e.n(size, hashMap, "total_fields"));
        this.doneView.setText(qweVar.z.r0());
        lwe lweVar = qweVar.x;
        qweVar.B = tje.N(qweVar.Jg(), null, null, new CostCenterFieldsPresenter$attachView$$inlined$safeCollectIn$1(new n(new b(lweVar.a.c(), lweVar, false), new CostCenterFieldsInteractor$getCostCenterFieldsFlow$2(lweVar, false, null)), null, qweVar), 3);
        this.doneView.setDebounceClickListener(new v4a(26, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
