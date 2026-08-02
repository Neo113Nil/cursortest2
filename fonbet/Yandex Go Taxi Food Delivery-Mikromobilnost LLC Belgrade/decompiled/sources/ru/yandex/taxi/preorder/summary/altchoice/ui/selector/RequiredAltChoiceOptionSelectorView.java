package ru.yandex.taxi.preorder.summary.altchoice.ui.selector;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import defpackage.aub;
import defpackage.b8r;
import defpackage.c4r0;
import defpackage.daj0;
import defpackage.dfb;
import defpackage.dzg0;
import defpackage.eaj0;
import defpackage.faj0;
import defpackage.gaj0;
import defpackage.gly0;
import defpackage.goi;
import defpackage.h4j;
import defpackage.hg;
import defpackage.hoi;
import defpackage.hxx;
import defpackage.jaj0;
import defpackage.jci;
import defpackage.jl40;
import defpackage.kci;
import defpackage.kdc;
import defpackage.kp50;
import defpackage.lci;
import defpackage.maj0;
import defpackage.mi31;
import defpackage.mqg0;
import defpackage.n051;
import defpackage.nac;
import defpackage.nqi0;
import defpackage.nu1;
import defpackage.oci;
import defpackage.odf0;
import defpackage.og20;
import defpackage.pav;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.qje;
import defpackage.ru1;
import defpackage.s8o;
import defpackage.saj0;
import defpackage.sgx0;
import defpackage.su1;
import defpackage.tai0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vng;
import defpackage.vyf0;
import defpackage.w511;
import defpackage.waj0;
import defpackage.xng0;
import defpackage.y051;
import defpackage.y4c0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.component.RequiredAltChoiceComponentView;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.utils.h;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00014B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J%\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0015\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0016H\u0014¢\u0006\u0004\b1\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0018\u00105\u001a\u000604R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/RequiredAltChoiceOptionSelectorView;", "Lru/yandex/taxi/design/AutoDividerComponentList;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/e;", "presenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/e;Lpav;)V", "", "Lwaj0;", "oldItems", "newItems", "Landroidx/recyclerview/widget/i;", "calculateDiff", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/i;", "item", "Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;", "createView", "(Lwaj0;)Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;", "view", "Lzy11;", "setAltChoiceClickListeners", "(Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;Lwaj0;)V", "setDeliveryIntervalsClickListeners", "(Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;)V", "bindItem", "", "text", "Landroid/graphics/drawable/Drawable;", "endDrawable", "", "createTitle", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)Ljava/lang/CharSequence;", "imageUrl", "Landroid/widget/ImageView;", "setIcon", "(Ljava/lang/String;Landroid/widget/ImageView;)V", "Lsaj0;", "model", "updateRequirement", "(Lsaj0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/e;", "Lpav;", "Lfaj0;", "mvp", "Lfaj0;", "Lru/yandex/taxi/utils/h;", "listDelegate", "Lru/yandex/taxi/utils/h;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequiredAltChoiceOptionSelectorView extends AutoDividerComponentList {
    private final pav imageLoader;
    private final h listDelegate;
    private final faj0 mvp;
    private final e presenter;

    public RequiredAltChoiceOptionSelectorView(Context context, e eVar, pav pavVar) {
        super(context, null, 0, 6, null);
        this.presenter = eVar;
        this.imageLoader = pavVar;
        setMiddleDividers(DividerType.MARGIN);
        this.mvp = new faj0(this);
        this.listDelegate = new h(this, new RequiredAltChoiceOptionSelectorView$listDelegate$1(2, this, RequiredAltChoiceOptionSelectorView.class, "calculateDiff", "calculateDiff(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;", 0), new RequiredAltChoiceOptionSelectorView$listDelegate$2(1, this, RequiredAltChoiceOptionSelectorView.class, "createView", "createView(Lru/yandex/taxi/preorder/summary/altchoice/domain/RequiredOptionUiState;)Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;", 0), new RequiredAltChoiceOptionSelectorView$listDelegate$3(2, this, RequiredAltChoiceOptionSelectorView.class, "bindItem", "bindItem(Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;Lru/yandex/taxi/preorder/summary/altchoice/domain/RequiredOptionUiState;)V", 0), new nqi0(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindItem(RequiredAltChoiceComponentView view, waj0 item) {
        String str = item.b;
        boolean z = item.k;
        setIcon(str, view.getLeadImageView());
        setIcon(item.f, view.getInnerTrailImageView());
        String str2 = item.c;
        Integer num = item.d;
        view.setTitle(createTitle(str2, num != null ? vng.t(num.intValue(), view.getContext()) : null));
        view.setSubtitle(item.e);
        view.setTrailTitle(item.g);
        view.setTrailSubtitle(item.h);
        view.setAlpha(z ? 1.0f : 0.5f);
        view.setEnabled(z);
        y051 y051Var = item.j;
        if (y051Var instanceof n051) {
            view.setChecked(((n051) y051Var).a);
            dfb dfbVar = new dfb();
            dfbVar.a = view.isChecked();
            androidx.core.view.b.p(view, dfbVar);
        } else if (!y051Var.equals(gly0.w)) {
            w511.b();
            return;
        } else {
            view.showChevron();
            hg.a(view);
        }
        daj0 daj0Var = item.i;
        if (daj0Var == null) {
            view.getTitleBadge().setVisibility(8);
            return;
        }
        BadgeView titleBadge = view.getTitleBadge();
        titleBadge.setVisibility(0);
        titleBadge.setText(daj0Var.c);
        kdc kdcVar = daj0Var.a;
        titleBadge.setTintColor(kdcVar != null ? s8o.m(kdcVar, titleBadge.getContext()) : 0);
        kdc kdcVar2 = daj0Var.b;
        titleBadge.setTextColor(kdcVar2 != null ? s8o.m(kdcVar2, titleBadge.getContext()) : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i calculateDiff(List<waj0> oldItems, List<waj0> newItems) {
        return kp50.f(new og20(oldItems, newItems, new aub(13)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean calculateDiff$lambda$0(waj0 waj0Var, waj0 waj0Var2) {
        return Boolean.valueOf(jl40.l(waj0Var.a, waj0Var2.a));
    }

    private final CharSequence createTitle(String text, Drawable endDrawable) {
        return endDrawable != null ? new SpannableStringBuilder(text).append((CharSequence) " ").append(" ", new CustomImageSpan(endDrawable, 1, false, false, null, 28, null), 18) : text;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RequiredAltChoiceComponentView createView(waj0 item) {
        RequiredAltChoiceComponentView requiredAltChoiceComponentView = new RequiredAltChoiceComponentView(getContext(), null, 0, 6, null);
        BadgeView titleBadge = requiredAltChoiceComponentView.getTitleBadge();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(tje.x(titleBadge.getContext(), 100.0f));
        titleBadge.setBackground(gradientDrawable);
        titleBadge.setTextTypeface(3, 0);
        titleBadge.setTintColor(titleBadge.getContext().getColor(mqg0.component_lime_toxic));
        titleBadge.setTextSize(tje.b0(titleBadge.getContext(), 14.0f));
        titleBadge.setTextColor(qje.t(xng0.bgMain, titleBadge.getContext()));
        requiredAltChoiceComponentView.setBackgroundResource(dzg0.bg_transparent_ripple);
        int i = gaj0.a[item.l.ordinal()];
        if (i == 1) {
            setAltChoiceClickListeners(requiredAltChoiceComponentView, item);
            return requiredAltChoiceComponentView;
        }
        if (i == 2) {
            setDeliveryIntervalsClickListeners(requiredAltChoiceComponentView);
            return requiredAltChoiceComponentView;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 listDelegate$lambda$0(RequiredAltChoiceComponentView requiredAltChoiceComponentView) {
        return zy11.a;
    }

    private final void setAltChoiceClickListeners(RequiredAltChoiceComponentView view, waj0 item) {
        view.setOnClickListener(new tai0(1, this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAltChoiceClickListeners$lambda$0(RequiredAltChoiceOptionSelectorView requiredAltChoiceOptionSelectorView, waj0 waj0Var, View view) {
        Object obj;
        Object obj2;
        pex0 b;
        sgx0 sgx0Var;
        e eVar = requiredAltChoiceOptionSelectorView.presenter;
        String str = waj0Var.a;
        maj0 maj0Var = eVar.E;
        c4r0 c4r0Var = eVar.z;
        saj0 saj0Var = (saj0) eVar.N.getValue();
        if (saj0Var == null) {
            return;
        }
        String str2 = saj0Var.e;
        Iterator it = saj0Var.b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (jl40.l(((nu1) obj2).b, str)) {
                    break;
                }
            }
        }
        nu1 nu1Var = (nu1) obj2;
        if (nu1Var == null) {
            return;
        }
        pex0 pex0Var = nu1Var.a;
        su1 su1Var = nu1Var.e;
        ru1 ru1Var = su1Var.l;
        String str3 = su1Var.m;
        String str4 = pex0Var.b;
        h4j h4jVar = eVar.C;
        String str5 = nu1Var.b;
        String str6 = su1Var.b;
        String str7 = su1Var.c;
        if (str7 == null) {
            str7 = "";
        }
        h4jVar.a(str4, str5, str6, str7, false);
        if (str3 != null) {
            maj0Var.a(str4);
            pex0 b2 = pex0Var.b();
            if (b2 != null && (sgx0Var = b2.J0) != null) {
                c4r0Var.d(SelectionOrigin.USER, sgx0Var, str2, true);
            }
            eVar.K.a(Uri.parse(str3), DeeplinkSource.UNSPECIFIED);
            return;
        }
        if (ru1Var == null) {
            c4r0Var.d(SelectionOrigin.USER, pex0Var.J0, str2, true);
            return;
        }
        mi31 d = b8r.d(eVar.D, ru1Var.a, str2, 4);
        if (d == null || (b = d.a.b()) == null) {
            return;
        }
        Iterator it2 = ru.yandex.taxi.tariffs.model.b.b(b).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (jl40.l(((nu1) next).b, ru1Var.b)) {
                obj = next;
                break;
            }
        }
        nu1 nu1Var2 = (nu1) obj;
        if (nu1Var2 != null) {
            maj0Var.a(str4);
            c4r0Var.d(SelectionOrigin.USER, nu1Var2.a.J0, str2, true);
        }
    }

    private final void setDeliveryIntervalsClickListeners(RequiredAltChoiceComponentView view) {
        view.setOnClickListener(new eaj0(0, this));
        view.setTrailCheckBoxClickListener(new vyf0(17, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDeliveryIntervalsClickListeners$lambda$0(RequiredAltChoiceOptionSelectorView requiredAltChoiceOptionSelectorView, View view) {
        String str;
        saj0 saj0Var;
        kci kciVar;
        e eVar = requiredAltChoiceOptionSelectorView.presenter;
        r0 r0Var = eVar.N;
        saj0 saj0Var2 = (saj0) r0Var.getValue();
        if (saj0Var2 == null || (str = saj0Var2.d) == null || (saj0Var = (saj0) r0Var.getValue()) == null || (kciVar = saj0Var.f) == null) {
            return;
        }
        h4j h4jVar = eVar.C;
        jci jciVar = kciVar.b;
        String str2 = jciVar.a;
        String str3 = jciVar.b;
        if (str3 == null) {
            str3 = "";
        }
        h4jVar.a(str, "sdd_multislot", str2, str3, true);
        hoi hoiVar = new hoi(str, kciVar.c, new d(r0Var));
        oci ociVar = eVar.H;
        boolean isEmpty = kciVar.d.isEmpty();
        ociVar.f = isEmpty;
        if (isEmpty && ociVar.a.a()) {
            ociVar.d.g(zy11.a);
        }
        ((pep0) eVar.J).f(new y4c0((goi) eVar.I.get(), new odf0(17, eVar), new jaj0(eVar, 0), new jaj0(eVar, 1), 11), hoiVar, hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setDeliveryIntervalsClickListeners$lambda$1(RequiredAltChoiceOptionSelectorView requiredAltChoiceOptionSelectorView) {
        e eVar = requiredAltChoiceOptionSelectorView.presenter;
        saj0 saj0Var = (saj0) eVar.N.getValue();
        if (saj0Var != null) {
            lci lciVar = eVar.G;
            String str = (String) ((Map) lciVar.a.getValue()).get(saj0Var.d);
            if (str != null) {
                eVar.Mg(str);
            }
        }
        return zy11.a;
    }

    private final void setIcon(String imageUrl, ImageView view) {
        if (imageUrl == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            ((nac) this.imageLoader.a(view)).c(imageUrl);
        }
    }

    @Override // ru.yandex.taxi.design.AutoDividerComponentList, com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.listDelegate.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.presenter;
        faj0 faj0Var = this.mvp;
        eVar.Bg(faj0Var);
        tse Jg = eVar.Jg();
        eVar.x.getClass();
        tje.N(Jg, uyj.a, null, new RequiredAltChoiceRadioOptionPresenter$attachView$1(null, eVar), 2);
        tje.N(eVar.Jg(), null, null, new RequiredAltChoiceRadioOptionPresenter$attachView$2(eVar, faj0Var, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    public final void updateRequirement(saj0 model) {
        Object value;
        r0 r0Var = this.presenter.N;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, model));
    }
}
