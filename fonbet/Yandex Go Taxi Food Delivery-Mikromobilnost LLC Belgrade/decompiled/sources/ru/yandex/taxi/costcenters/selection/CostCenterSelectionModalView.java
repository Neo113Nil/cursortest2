package ru.yandex.taxi.costcenters.selection;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.agh0;
import defpackage.b1;
import defpackage.ce0;
import defpackage.czo0;
import defpackage.f1h0;
import defpackage.ff2;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.kxe;
import defpackage.kyh0;
import defpackage.ldh0;
import defpackage.lxe;
import defpackage.mrg0;
import defpackage.mxe;
import defpackage.nxe;
import defpackage.og20;
import defpackage.oxe;
import defpackage.pw7;
import defpackage.pxe;
import defpackage.pzt0;
import defpackage.qph0;
import defpackage.rji0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tse0;
import defpackage.v4a;
import defpackage.wnb1;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.costcenters.base.CostCenterBaseModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.RecyclerShadowController$Type;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u001d\u0010#\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u001b2\u0006\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010\u0015J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u000bJ\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0014¢\u0006\u0004\b2\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010CR\u0014\u0010D\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lru/yandex/taxi/costcenters/selection/CostCenterSelectionModalView;", "Lru/yandex/taxi/costcenters/base/CostCenterBaseModalView;", "Lnxe;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/costcenters/selection/b;", "presenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/costcenters/selection/b;)V", "Lzy11;", "hideResultList", "()V", "", "isEmpty", "showResultList", "(Z)V", "dismiss", "closeKeyboard", "", "changedPosition", "notifyItemChanged", "(I)V", "onAttachedToWindow", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "()Lru/yandex/taxi/design/ButtonComponent;", "onDetachedFromWindow", "", "title", "setTitle", "(Ljava/lang/String;)V", "hideProgress", "", "Lmxe;", "list", "displayListResult", "(Ljava/util/List;)V", "selectedElement", "updateSelection", "(Lmxe;)V", "preloadedValue", "isNotify", "setFilterValue", "(Ljava/lang/String;Z)V", "hintId", "setFilterHint", "showProgress", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "Lru/yandex/taxi/costcenters/selection/b;", "Lhbp0;", "mainScope", "Lhbp0;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbarView", "Lru/yandex/taxi/design/ToolbarComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "progressView", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "Lru/yandex/taxi/design/ListItemInputComponent;", "filterInput", "Lru/yandex/taxi/design/ListItemInputComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "listShadow", "Landroid/view/View;", "costCenterEmpty", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Lkxe;", "adapter", "Lkxe;", "Lrji0;", "recyclerShadowController", "Lrji0;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CostCenterSelectionModalView extends CostCenterBaseModalView implements nxe {
    private final kxe adapter;
    private final ViewGroup content;
    private final View costCenterEmpty;
    private final ButtonComponent doneButton;
    private final ListItemInputComponent filterInput;
    private final View listShadow;
    private final hbp0 mainScope;
    private final b presenter;
    private final CircularProgressBar progressView;
    private final rji0 recyclerShadowController;
    private final RecyclerView recyclerView;
    private final ToolbarComponent toolbarView;

    public CostCenterSelectionModalView(Context context, b bVar) {
        super(context);
        this.presenter = bVar;
        this.mainScope = new hbp0(new czo0(14), "", null);
        c.q(this, qph0.cost_center_selection_modal_view, true);
        int i = ldh0.cost_center_toolbar;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.toolbarView = (ToolbarComponent) ((View) rp31.d(this, i));
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, ldh0.cost_center_variants));
        this.recyclerView = recyclerView;
        this.progressView = (CircularProgressBar) ((View) rp31.d(this, ldh0.cost_center_spinner));
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, ldh0.cost_center_filter));
        this.filterInput = listItemInputComponent;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, ldh0.confirm));
        this.doneButton = buttonComponent;
        this.listShadow = (View) rp31.d(this, ldh0.list_shadow);
        this.costCenterEmpty = (View) rp31.d(this, ldh0.cost_center_empty_view);
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, agh0.content));
        this.content = viewGroup;
        kxe kxeVar = new kxe();
        this.adapter = kxeVar;
        this.recyclerShadowController = new rji0(RecyclerShadowController$Type.BOTTOM);
        setImportantForAccessibility(2);
        kxeVar.b = new pxe(bVar);
        recyclerView.setAdapter(kxeVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        buttonComponent.setDebounceClickListener(new v4a(29, bVar));
        recyclerView.setItemAnimator(null);
        listItemInputComponent.setLeadImage(f1h0.ic_search_24dp);
        listItemInputComponent.setInputType(1);
        listItemInputComponent.setImeOptions(3);
        listItemInputComponent.setAnimateDividerToHighlight(true);
        listItemInputComponent.setListItemPaddingStart(0);
        wnb1.d(viewGroup.getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), viewGroup);
    }

    private final void hideResultList() {
        this.recyclerView.setVisibility(4);
        this.costCenterEmpty.setVisibility(4);
        this.listShadow.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$1(CostCenterSelectionModalView costCenterSelectionModalView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return true;
        }
        costCenterSelectionModalView.closeKeyboard();
        return true;
    }

    private final void showResultList(boolean isEmpty) {
        this.recyclerView.setVisibility(isEmpty ? 4 : 0);
        this.listShadow.setVisibility(isEmpty ? 4 : 0);
        this.costCenterEmpty.setVisibility(isEmpty ? 0 : 8);
    }

    public void closeKeyboard() {
        ListItemInputComponent listItemInputComponent = this.filterInput;
        if (listItemInputComponent != null) {
            listItemInputComponent.post(new ce0(listItemInputComponent, 15));
        }
        this.filterInput.clearFocus();
        requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContentView() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        lxe lxeVar = this.presenter.A;
        b1 b1Var = lxeVar.a;
        int i = lxeVar.b;
        boolean z = lxeVar.e;
        String str = lxeVar.c;
        int i2 = lxeVar.f;
        String str2 = lxeVar.d;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("is_required", Boolean.valueOf(z));
        hashMap.put("title", str);
        hashMap.put("total_elements", Integer.valueOf(i2));
        b1Var.a.a("CostCenterCard.FieldList.Closed", hashMap, 1, tse0.r("type", hashMap, str2));
        super.dismiss();
    }

    @Override // defpackage.nxe
    public void displayListResult(List<mxe> list) {
        kxe kxeVar = this.adapter;
        List list2 = kxeVar.a;
        kxeVar.a = list;
        kp50.f(new og20(list2, list, new pw7(1, kxeVar)), true).b(kxeVar);
        hideProgress();
        showResultList(list.isEmpty());
    }

    @Override // ru.yandex.taxi.costcenters.base.CostCenterBaseModalView
    /* renamed from: doneButton, reason: from getter */
    public ButtonComponent getDoneButton() {
        return this.doneButton;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return this.toolbarView;
    }

    @Override // defpackage.nxe
    public void hideProgress() {
        this.progressView.setVisibility(8);
    }

    @Override // defpackage.nxe
    public void notifyItemChanged(int changedPosition) {
        this.adapter.notifyItemChanged(changedPosition);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope.a();
        b bVar = this.presenter;
        bVar.Kg(this);
        lxe lxeVar = bVar.A;
        b1 b1Var = lxeVar.a;
        int i = lxeVar.b;
        boolean z = lxeVar.e;
        String str = lxeVar.c;
        int i2 = lxeVar.f;
        String str2 = lxeVar.d;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("is_required", Boolean.valueOf(z));
        hashMap.put("title", str);
        hashMap.put("total_elements", Integer.valueOf(i2));
        b1Var.a.a("CostCenterCard.FieldList.Opened", hashMap, 1, tse0.r("type", hashMap, str2));
        CostCenterField.InputFormat inputFormat = bVar.x.c.e;
        if (inputFormat == CostCenterField.InputFormat.MIXED) {
            setFilterHint(kyh0.cost_centers_selection_or_enter_hint);
        } else if (inputFormat == CostCenterField.InputFormat.SELECT) {
            setFilterHint(kyh0.cost_centers_selection_hint);
        }
        pzt0 pzt0Var = bVar.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.E = tje.N(bVar.Jg(), null, null, new CostCenterSelectionPresenter$loadCostCenterData$1(bVar, null), 3);
        tje.N(this.mainScope, null, null, new CostCenterSelectionModalView$onAttachedToWindow$$inlined$safeCollectIn$1(this.filterInput.textValueFlow(), null, this), 3);
        this.filterInput.setOnKeyboardCloseListener(new oxe(0, this));
        this.filterInput.setOnEditorActionListener(new ff2(5, this));
        this.recyclerShadowController.a(this.listShadow, this.recyclerView);
        tje.N(this.mainScope, null, null, new CostCenterSelectionModalView$onAttachedToWindow$$inlined$safeCollectIn$2(this.filterInput.textFocusFlow(), null, this), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainScope.b();
        this.presenter.Cg();
        this.filterInput.setOnKeyboardCloseListener(null);
        this.filterInput.setOnEditorActionListener(null);
        this.recyclerShadowController.c();
    }

    @Override // defpackage.nxe
    public void setFilterHint(int hintId) {
        this.filterInput.setHint(hintId);
    }

    @Override // defpackage.nxe
    public void setFilterValue(String preloadedValue, boolean isNotify) {
        ListItemInputComponent listItemInputComponent = this.filterInput;
        if (!isNotify) {
            listItemInputComponent.setTextWithoutNotifying(preloadedValue);
            return;
        }
        if (preloadedValue == null) {
            preloadedValue = "";
        }
        listItemInputComponent.setText(preloadedValue);
    }

    @Override // ru.yandex.taxi.costcenters.base.CostCenterBaseModalView, defpackage.ewe
    public void setTitle(String title) {
        this.toolbarView.setTitle(title);
    }

    @Override // defpackage.nxe
    public void showProgress() {
        hideResultList();
        this.progressView.setVisibility(0);
    }

    @Override // defpackage.nxe
    public void updateSelection(mxe selectedElement) {
        kxe kxeVar = this.adapter;
        boolean l = jl40.l(selectedElement, kxeVar.c);
        kxeVar.c = selectedElement;
        if (l) {
            return;
        }
        kxeVar.notifyDataSetChanged();
    }

    @Override // defpackage.nxe
    public void setFilterValue(String str) {
        setFilterValue(str, false);
    }
}
