package ru.yandex.taxi.summary.requirements.list.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.yandex.go.zone.dto.objects.TariffDefinitionPresentationModal;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinitionPresentation;
import defpackage.b580;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.f580;
import defpackage.fmw0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kpw0;
import defpackage.lfh0;
import defpackage.lmw0;
import defpackage.lot0;
import defpackage.lpo;
import defpackage.m8t0;
import defpackage.mrh0;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.oej0;
import defpackage.qje;
import defpackage.qu;
import defpackage.rot0;
import defpackage.scc;
import defpackage.sot0;
import defpackage.tje;
import defpackage.vot0;
import defpackage.w511;
import defpackage.x8;
import defpackage.xcv0;
import defpackage.xg;
import defpackage.xng0;
import defpackage.xot0;
import defpackage.xw31;
import defpackage.yot0;
import defpackage.zot0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B!\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0018\u0010%\u001a\u00060$R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/ui/SpecialNeedsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxot0;", "Lnwy0;", "Landroid/content/Context;", "context", "Lvot0;", "presenter", "Lxg;", "accessibilityScreenBlocker", "<init>", "(Landroid/content/Context;Lvot0;Lxg;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxot0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "viewTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "Lvot0;", "Lxg;", "Lrot0;", "mvpView", "Lrot0;", "Llpo;", "adapter", "Llpo;", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpecialNeedsModalView extends SlideableBindingModalView<xot0> {
    public static final int $stable = 8;
    private final xg accessibilityScreenBlocker;
    private final lpo adapter;
    private final rot0 mvpView;
    private final vot0 presenter;

    public SpecialNeedsModalView(Context context, vot0 vot0Var, xg xgVar) {
        super(context);
        this.presenter = vot0Var;
        this.accessibilityScreenBlocker = xgVar;
        this.mvpView = new rot0(this);
        this.adapter = new lpo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(SpecialNeedsModalView specialNeedsModalView) {
        xw31.w(specialNeedsModalView.getBinding().h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onConfirmClick(vot0 vot0Var) {
        ((kpw0) vot0Var.I.a).r(new qu(9));
        ((sot0) vot0Var.Dg()).V8();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        xot0 binding = getBinding();
        binding.i.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        binding.h.applyTheme(themeType);
        binding.j.applyTheme(themeType);
        ShimmeringFrameLayout shimmeringFrameLayout = binding.f;
        Drawable y = tje.y(dzg0.bg_rounded, shimmeringFrameLayout.getContext());
        y.setTint(qje.t(xng0.bgMinor, shimmeringFrameLayout.getContext()));
        shimmeringFrameLayout.setBackground(y);
        binding.g.applyTheme(themeType);
        binding.c.applyTheme(themeType);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xot0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(mrh0.special_needs_view, parent, false);
        int i = lfh0.bottom_container;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = lfh0.confirm_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = lfh0.expanded_recycler;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = lfh0.group_requirement_info_image;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = lfh0.group_requirement_info_shimmering;
                        ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                        if (shimmeringFrameLayout != null) {
                            i = lfh0.group_requirement_info_text;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                i = lfh0.header;
                                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                                if (listHeaderComponent != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    i = lfh0.subtitle;
                                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                    if (listItemComponent != null) {
                                        return new xot0(constraintLayout, linearLayout, buttonComponent, recyclerView, imageView, shimmeringFrameLayout, robotoTextView, listHeaderComponent, constraintLayout, listItemComponent);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        fmw0 fmw0Var;
        String str;
        yot0 yot0Var;
        boolean z;
        int i3;
        int i4;
        Object obj;
        Object obj2;
        super.onAttachedToWindow();
        RecyclerView.c itemAnimator = getBinding().d.getItemAnimator();
        String str2 = null;
        b1 b1Var = itemAnimator instanceof b1 ? (b1) itemAnimator : null;
        if (b1Var != null) {
            b1Var.g = false;
        }
        getBinding().d.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().d.setAdapter(this.adapter);
        getBinding().f.setShimmering(true);
        vot0 vot0Var = this.presenter;
        rot0 rot0Var = this.mvpView;
        vot0Var.Bg(rot0Var);
        TariffInfoGroupDefinition tariffInfoGroupDefinition = vot0Var.G;
        List<String> list = tariffInfoGroupDefinition.b;
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : list) {
            Iterator it = vot0Var.x.getRequirements().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (jl40.l(((lmw0) obj2).getName(), str3)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            lmw0 lmw0Var = (lmw0) obj2;
            if (lmw0Var != null) {
                arrayList3.add(lmw0Var);
            }
        }
        TariffInfoGroupDefinitionPresentation tariffInfoGroupDefinitionPresentation = tariffInfoGroupDefinition.f;
        TariffDefinitionPresentationModal tariffDefinitionPresentationModal = tariffInfoGroupDefinitionPresentation != null ? tariffInfoGroupDefinitionPresentation.b : null;
        if (tariffDefinitionPresentationModal == null) {
            g8e.C("TariffDefinitionPresentationModal = null, but SpecialNeedsModalView are already shown", jst.e);
        } else {
            ((sot0) vot0Var.Dg()).n1(tariffDefinitionPresentationModal.a, tariffDefinitionPresentationModal.b, tariffDefinitionPresentationModal.e, tariffDefinitionPresentationModal.d);
            String str4 = tariffDefinitionPresentationModal.c;
            if (evu0.J(str4)) {
                ((sot0) vot0Var.Dg()).z4(null);
            } else {
                tje.N(vot0Var.Jg(), null, null, new SpecialNeedsPresenter$bindPresentation$1(vot0Var, str4, null), 3);
            }
        }
        lot0 lot0Var = vot0Var.z;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = ((x8) vot0Var.C).d;
        int f = scc.f(arrayList3);
        if (f >= 0) {
            int i5 = 0;
            while (true) {
                lmw0 lmw0Var2 = (lmw0) arrayList3.get(i5);
                if (lmw0Var2 instanceof fmw0) {
                    fmw0 fmw0Var2 = (fmw0) lmw0Var2;
                    String str5 = fmw0Var2.a;
                    oej0 oej0Var = fmw0Var2.m;
                    if (oej0Var != null) {
                        String b = lot0Var.b(str5);
                        Iterator it2 = arrayList5.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (jl40.l(((b580) obj).a, str5)) {
                                    break;
                                }
                            } else {
                                obj = str2;
                                break;
                            }
                        }
                        b580 b580Var = (b580) obj;
                        String str6 = b == null ? b580Var != null ? b580Var.f : str2 : b;
                        String str7 = oej0Var.b;
                        String str8 = oej0Var.a;
                        arrayList2 = arrayList5;
                        arrayList = arrayList4;
                        fmw0Var = fmw0Var2;
                        str = str5;
                        i = f;
                        i2 = i5;
                        yot0Var = new yot0(new SpecialNeedsPresenter$provideSpecialRequirements$commentModel$1(1, vot0Var, vot0.class, "onExpandedViewClick", "onExpandedViewClick(Lru/yandex/taxi/requirements/ui/SpecialRequirementModel;)V", 0), new SpecialNeedsPresenter$provideSpecialRequirements$commentModel$2(1, vot0Var, vot0.class, "saveForNextTripsClicked", "saveForNextTripsClicked(Lru/yandex/taxi/requirements/ui/SpecialRequirementModel;)V", 0), str8, str7, str6, lot0Var.b(str) != null);
                    } else {
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        i = f;
                        i2 = i5;
                        fmw0Var = fmw0Var2;
                        str = str5;
                        yot0Var = null;
                    }
                    String str9 = fmw0Var.b;
                    String str10 = fmw0Var.c;
                    boolean z2 = fmw0Var.p;
                    if (z2) {
                        if (arrayList2 == null || !arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                if (jl40.l(((b580) it3.next()).a, str)) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        break;
                    }
                    if (!z2) {
                        if (arrayList2 == null || !arrayList2.isEmpty()) {
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                if (jl40.l(((b580) it4.next()).a, str)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                    w511.b();
                    return;
                    i3 = i2;
                    arrayList.add(new zot0(str9, str10, z, new SpecialNeedsPresenter$provideSpecialRequirements$3(1, vot0Var, vot0.class, "onSwitcherClick", "onSwitcherClick(Lru/yandex/taxi/requirements/ui/SpecialRequirementModel;)V", 0), yot0Var, i3 == scc.f(arrayList3), fmw0Var.a, fmw0Var.n));
                    i4 = i;
                } else {
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i4 = f;
                    i3 = i5;
                }
                if (i3 == i4) {
                    break;
                }
                i5 = i3 + 1;
                f = i4;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                str2 = null;
            }
        } else {
            arrayList = arrayList4;
        }
        ((sot0) vot0Var.Dg()).sd(arrayList);
        tje.N(vot0Var.Jg(), null, null, new SpecialNeedsPresenter$processBanners$1(vot0Var, arrayList3, null), 3);
        f580 f580Var = vot0Var.H;
        String str11 = tariffInfoGroupDefinition.a;
        xcv0 xcv0Var = f580Var.c;
        xcv0Var.a.a("Summary.Requirements.RequirementGroup.Shown", nnm.m(xcv0Var, "group_id", str11), 1, new HashMap());
        tje.N(vot0Var.Jg(), null, null, new SpecialNeedsPresenter$attachView$1(vot0Var, rot0Var, null), 3);
        getBinding().c.setDebounceClickListener(new m8t0(13, this.presenter));
        post(new m8t0(14, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int viewTop) {
        xg.b(this.accessibilityScreenBlocker, getBinding().a, null, 6);
        super.onModalViewAppear(viewTop);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        this.accessibilityScreenBlocker.c(getBinding().a);
        super.onModalViewDisappear();
    }
}
