package ru.yandex.taxi.address.clarification.impl.ui.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aud0;
import defpackage.bph0;
import defpackage.cma1;
import defpackage.cpb1;
import defpackage.dud0;
import defpackage.dzg0;
import defpackage.gfq0;
import defpackage.ifq0;
import defpackage.ir0;
import defpackage.k7x0;
import defpackage.lys;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pr0;
import defpackage.qje;
import defpackage.tls;
import defpackage.xch0;
import defpackage.xng0;
import defpackage.zo31;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.address.clarification.impl.ui.recycler.a;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class a extends lys {
    public static final /* synthetic */ int a0 = 0;
    public final pav S;
    public final k7x0 T;
    public final c U;
    public final tls V;
    public final pr0 W;
    public boolean Z;

    public a(pav pavVar, k7x0 k7x0Var, c cVar, tls tlsVar, ir0 ir0Var) {
        super(ir0Var);
        this.S = pavVar;
        this.T = k7x0Var;
        this.U = cVar;
        this.V = tlsVar;
        View inflate = LayoutInflater.from(this.a.getContext()).inflate(bph0.address_clarification_selectable_option_center_view, (ViewGroup) null, false);
        int i = xch0.leading_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = xch0.leading_subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = xch0.leading_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = xch0.trailing_container;
                    GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                    if (goLinearLayout2 != null) {
                        i = xch0.trailing_subtitle;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView3 != null) {
                            i = xch0.trailing_title;
                            RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView4 != null) {
                                GoLinearLayout goLinearLayout3 = (GoLinearLayout) inflate;
                                this.W = new pr0(goLinearLayout3, goLinearLayout, robotoTextView, robotoTextView2, goLinearLayout2, robotoTextView3, robotoTextView4);
                                ir0Var.a.setCustomCenterView(goLinearLayout3, false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0113, code lost:
    
        if (r13.d0(r15, r14, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        if (r13.d0(r15, r3, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(a aVar, List list, ContinuationImpl continuationImpl) {
        SelectableOptionViewHolder$setItems$1 selectableOptionViewHolder$setItems$1;
        int i;
        pr0 pr0Var;
        aud0 aud0Var;
        List list2;
        pr0 pr0Var2;
        RobotoTextView robotoTextView;
        FormattedText formattedText;
        pr0 pr0Var3;
        aud0 aud0Var2;
        aVar.getClass();
        if (continuationImpl instanceof SelectableOptionViewHolder$setItems$1) {
            selectableOptionViewHolder$setItems$1 = (SelectableOptionViewHolder$setItems$1) continuationImpl;
            int i2 = selectableOptionViewHolder$setItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectableOptionViewHolder$setItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectableOptionViewHolder$setItems$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectableOptionViewHolder$setItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pr0Var = aVar.W;
                    if (list.isEmpty()) {
                        pr0Var.d.setText("");
                        pr0Var.c.setText("");
                        pr0Var.g.setText("");
                        pr0Var.f.setText("");
                    } else {
                        aud0Var = (aud0) kotlin.collections.a.S(0, list);
                        if (aud0Var != null) {
                            pr0Var.b.setVisibility(0);
                            RobotoTextView robotoTextView2 = pr0Var.d;
                            FormattedText formattedText2 = aud0Var.a;
                            selectableOptionViewHolder$setItems$1.L$0 = list;
                            selectableOptionViewHolder$setItems$1.L$1 = pr0Var;
                            selectableOptionViewHolder$setItems$1.L$2 = aud0Var;
                            selectableOptionViewHolder$setItems$1.label = 1;
                            if (aVar.d0(robotoTextView2, formattedText2, selectableOptionViewHolder$setItems$1) != obj2) {
                                list2 = list;
                                pr0Var2 = pr0Var;
                                robotoTextView = pr0Var2.c;
                                formattedText = aud0Var.b;
                                selectableOptionViewHolder$setItems$1.L$0 = list2;
                                selectableOptionViewHolder$setItems$1.L$1 = pr0Var2;
                                selectableOptionViewHolder$setItems$1.L$2 = null;
                                selectableOptionViewHolder$setItems$1.label = 2;
                                if (aVar.d0(robotoTextView, formattedText, selectableOptionViewHolder$setItems$1) != obj2) {
                                }
                            }
                            return obj2;
                        }
                        pr0Var.b.setVisibility(8);
                        pr0Var3 = pr0Var;
                        aud0Var2 = (aud0) kotlin.collections.a.S(1, list);
                        if (aud0Var2 != null) {
                        }
                    }
                } else {
                    if (i == 1) {
                        aud0 aud0Var3 = (aud0) selectableOptionViewHolder$setItems$1.L$2;
                        pr0 pr0Var4 = (pr0) selectableOptionViewHolder$setItems$1.L$1;
                        list2 = (List) selectableOptionViewHolder$setItems$1.L$0;
                        kotlin.b.b(obj);
                        aud0Var = aud0Var3;
                        pr0Var2 = pr0Var4;
                        robotoTextView = pr0Var2.c;
                        formattedText = aud0Var.b;
                        selectableOptionViewHolder$setItems$1.L$0 = list2;
                        selectableOptionViewHolder$setItems$1.L$1 = pr0Var2;
                        selectableOptionViewHolder$setItems$1.L$2 = null;
                        selectableOptionViewHolder$setItems$1.label = 2;
                        if (aVar.d0(robotoTextView, formattedText, selectableOptionViewHolder$setItems$1) != obj2) {
                            pr0Var = pr0Var2;
                            list = list2;
                            pr0Var3 = pr0Var;
                            aud0Var2 = (aud0) kotlin.collections.a.S(1, list);
                            if (aud0Var2 != null) {
                            }
                        }
                        return obj2;
                    }
                    if (i == 2) {
                        pr0 pr0Var5 = (pr0) selectableOptionViewHolder$setItems$1.L$1;
                        List list3 = (List) selectableOptionViewHolder$setItems$1.L$0;
                        kotlin.b.b(obj);
                        pr0Var = pr0Var5;
                        list = list3;
                        pr0Var3 = pr0Var;
                        aud0Var2 = (aud0) kotlin.collections.a.S(1, list);
                        if (aud0Var2 != null) {
                            pr0Var3.e.setVisibility(0);
                            RobotoTextView robotoTextView3 = pr0Var3.g;
                            FormattedText formattedText3 = aud0Var2.a;
                            selectableOptionViewHolder$setItems$1.L$0 = null;
                            selectableOptionViewHolder$setItems$1.L$1 = pr0Var3;
                            selectableOptionViewHolder$setItems$1.L$2 = aud0Var2;
                            selectableOptionViewHolder$setItems$1.label = 3;
                        } else {
                            pr0Var3.e.setVisibility(8);
                        }
                    } else if (i == 3) {
                        aud0Var2 = (aud0) selectableOptionViewHolder$setItems$1.L$2;
                        pr0Var3 = (pr0) selectableOptionViewHolder$setItems$1.L$1;
                        kotlin.b.b(obj);
                        RobotoTextView robotoTextView4 = pr0Var3.f;
                        FormattedText formattedText4 = aud0Var2.b;
                        selectableOptionViewHolder$setItems$1.L$0 = null;
                        selectableOptionViewHolder$setItems$1.L$1 = pr0Var3;
                        selectableOptionViewHolder$setItems$1.L$2 = null;
                        selectableOptionViewHolder$setItems$1.label = 4;
                    } else {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                }
                return zy11.a;
            }
        }
        selectableOptionViewHolder$setItems$1 = new SelectableOptionViewHolder$setItems$1(aVar, continuationImpl);
        Object obj3 = selectableOptionViewHolder$setItems$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectableOptionViewHolder$setItems$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        String str;
        final gfq0 gfq0Var = (gfq0) obj;
        ir0 ir0Var = (ir0) ((zo31) this.R);
        ListItemComponent listItemComponent = ir0Var.a;
        final int i = 0;
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: hfq0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                gfq0 gfq0Var2 = gfq0Var;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        aVar.V.invoke(gfq0Var2);
                        break;
                    default:
                        aVar.V.invoke(gfq0Var2);
                        break;
                }
            }
        });
        dud0 dud0Var = gfq0Var.a.a;
        if (dud0Var == null || (str = dud0Var.a) == null) {
            listItemComponent.clearLeadViewAndExtendDivider();
        } else {
            b0(new SelectableOptionViewHolder$bind$1$2$1(this, str, listItemComponent, null));
        }
        b0(new SelectableOptionViewHolder$bind$1$3(this, gfq0Var, null));
        final int i2 = 1;
        listItemComponent.setTrailMode(1);
        boolean z = gfq0Var.b;
        ListItemComponent listItemComponent2 = ir0Var.a;
        if (z) {
            listItemComponent2.setTrailImage(dzg0.component_list_item_check_checked_single);
        } else {
            listItemComponent2.setTrailImage(dzg0.component_list_item_check_unchecked_single);
        }
        if (!this.Z) {
            int i3 = xng0.bgTransparent;
            View view = this.a;
            listItemComponent.setBackground(cpb1.f(0.0f, ru.yandex.taxi.design.utils.c.c(i3, view), qje.t(xng0.bgMinor, view.getContext())));
            listItemComponent.trailFrame.setBackground(cpb1.f(0.0f, qje.t(xng0.bgTransparent, view.getContext()), qje.t(xng0.bgMinor, view.getContext())));
            this.Z = true;
        }
        listItemComponent.setTrailContainerClickListener(new Runnable(this) { // from class: hfq0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                gfq0 gfq0Var2 = gfq0Var;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.V.invoke(gfq0Var2);
                        break;
                    default:
                        aVar.V.invoke(gfq0Var2);
                        break;
                }
            }
        });
        listItemComponent.setDividers(DividerPosition.BOTTOM, gfq0Var.c ? DividerType.ICON_MARGIN : DividerType.NONE);
        androidx.core.view.b.p(listItemComponent, new ifq0(i, gfq0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(RobotoTextView robotoTextView, FormattedText formattedText, ContinuationImpl continuationImpl) {
        SelectableOptionViewHolder$setUpSpotText$1 selectableOptionViewHolder$setUpSpotText$1;
        int i;
        try {
            if (continuationImpl instanceof SelectableOptionViewHolder$setUpSpotText$1) {
                selectableOptionViewHolder$setUpSpotText$1 = (SelectableOptionViewHolder$setUpSpotText$1) continuationImpl;
                int i2 = selectableOptionViewHolder$setUpSpotText$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    selectableOptionViewHolder$setUpSpotText$1.label = i2 - Integer.MIN_VALUE;
                    SelectableOptionViewHolder$setUpSpotText$1 selectableOptionViewHolder$setUpSpotText$12 = selectableOptionViewHolder$setUpSpotText$1;
                    Object obj = selectableOptionViewHolder$setUpSpotText$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = selectableOptionViewHolder$setUpSpotText$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (formattedText == null) {
                            robotoTextView.setVisibility(8);
                            robotoTextView.setText("");
                            return zy11.a;
                        }
                        robotoTextView.setVisibility(0);
                        try {
                            c cVar = this.U;
                            selectableOptionViewHolder$setUpSpotText$12.L$0 = robotoTextView;
                            selectableOptionViewHolder$setUpSpotText$12.L$1 = formattedText;
                            selectableOptionViewHolder$setUpSpotText$12.label = 1;
                            try {
                                obj = c.e(cVar, formattedText, null, false, selectableOptionViewHolder$setUpSpotText$12, 30);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                formattedText = formattedText;
                            } catch (Throwable unused) {
                                formattedText = formattedText;
                                robotoTextView.setText(c.f(this.U, formattedText, false, null, 14));
                                return zy11.a;
                            }
                        } catch (Throwable unused2) {
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        formattedText = (FormattedText) selectableOptionViewHolder$setUpSpotText$12.L$1;
                        robotoTextView = (RobotoTextView) selectableOptionViewHolder$setUpSpotText$12.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable unused3) {
                            robotoTextView.setText(c.f(this.U, formattedText, false, null, 14));
                            return zy11.a;
                        }
                    }
                    robotoTextView.setText((CharSequence) obj);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            robotoTextView.setText((CharSequence) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        selectableOptionViewHolder$setUpSpotText$1 = new SelectableOptionViewHolder$setUpSpotText$1(this, continuationImpl);
        SelectableOptionViewHolder$setUpSpotText$1 selectableOptionViewHolder$setUpSpotText$122 = selectableOptionViewHolder$setUpSpotText$1;
        Object obj2 = selectableOptionViewHolder$setUpSpotText$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectableOptionViewHolder$setUpSpotText$122.label;
    }
}
