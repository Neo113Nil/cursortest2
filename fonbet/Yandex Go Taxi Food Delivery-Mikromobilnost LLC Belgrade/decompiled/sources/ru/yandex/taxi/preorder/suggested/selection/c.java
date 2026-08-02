package ru.yandex.taxi.preorder.suggested.selection;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.x0;
import defpackage.c1p0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.g18;
import defpackage.ga0;
import defpackage.hos0;
import defpackage.ifq0;
import defpackage.j8v0;
import defpackage.k5v0;
import defpackage.kne0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.run;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.x9v0;
import defpackage.xng0;
import defpackage.yyg0;
import defpackage.zt;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public class c extends x0 {
    public final tse N;
    public final ListItemComponent O;
    public final SuggestsView.a P;
    public final pav Q;
    public final ru.yandex.taxi.widget.c R;
    public CharSequence S;
    public ArrayList T;
    public g18 U;
    public pzt0 V;
    public CharSequence W;
    public pzt0 Z;
    public boolean a0;
    public pzt0 b0;
    public pzt0 c0;
    public g18 d0;

    public c(tse tseVar, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, SuggestsView.a aVar, pav pavVar, ru.yandex.taxi.widget.c cVar) {
        super(listItemComponent);
        this.N = tseVar;
        this.O = listItemComponent2;
        this.P = aVar;
        this.Q = pavVar;
        this.R = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(c cVar, FormattedText formattedText, tls tlsVar, ContinuationImpl continuationImpl) {
        SuggestHolder$createFormatTextJob$1 suggestHolder$createFormatTextJob$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SuggestHolder$createFormatTextJob$1) {
            suggestHolder$createFormatTextJob$1 = (SuggestHolder$createFormatTextJob$1) continuationImpl;
            int i2 = suggestHolder$createFormatTextJob$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestHolder$createFormatTextJob$1.label = i2 - Integer.MIN_VALUE;
                SuggestHolder$createFormatTextJob$1 suggestHolder$createFormatTextJob$12 = suggestHolder$createFormatTextJob$1;
                Object obj = suggestHolder$createFormatTextJob$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestHolder$createFormatTextJob$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar2 = cVar.R;
                    suggestHolder$createFormatTextJob$12.L$0 = null;
                    suggestHolder$createFormatTextJob$12.L$1 = tlsVar;
                    suggestHolder$createFormatTextJob$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText, null, false, suggestHolder$createFormatTextJob$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar = (tls) suggestHolder$createFormatTextJob$12.L$1;
                    kotlin.b.b(obj);
                }
                tlsVar.invoke((CharSequence) obj);
                return zy11.a;
            }
        }
        suggestHolder$createFormatTextJob$1 = new SuggestHolder$createFormatTextJob$1(cVar, continuationImpl);
        SuggestHolder$createFormatTextJob$1 suggestHolder$createFormatTextJob$122 = suggestHolder$createFormatTextJob$1;
        Object obj2 = suggestHolder$createFormatTextJob$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestHolder$createFormatTextJob$122.label;
        if (i != 0) {
        }
        tlsVar.invoke((CharSequence) obj2);
        return zy11.a;
    }

    public void X(x9v0 x9v0Var, SuggestsView.State state, PointType pointType, boolean z, zt ztVar) {
        b0();
        String str = x9v0Var.b;
        FormattedText formattedText = x9v0Var.g;
        this.S = str;
        ArrayList arrayList = x9v0Var.k;
        this.T = arrayList;
        CharSequence charSequence = x9v0Var.f;
        this.W = charSequence;
        Drawable k = ru.yandex.taxi.design.utils.c.k(dzg0.bg_transparent_ripple, this.a);
        ListItemComponent listItemComponent = this.O;
        listItemComponent.setBackground(k);
        boolean z2 = x9v0Var.N;
        this.a0 = z2;
        if (z2 || x9v0Var.O) {
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
        } else {
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
        }
        a0(x9v0Var);
        listItemComponent.setDebounceClickListener(new k5v0(this, x9v0Var, 0));
        listItemComponent.setOnLongClickListener(new run(3, this, x9v0Var));
        listItemComponent.ellipsizeTitleMiddle(true);
        Z(state.getMaxLines());
        if ((((charSequence == null || charSequence.length() == 0) && (formattedText == null || formattedText.equals(FormattedText.c))) ? 8 : state.getSubtitleVisibility()) == 0) {
            listItemComponent.showSubtitle();
        } else {
            listItemComponent.hideSubtitle();
        }
        Y(x9v0Var, z, ztVar);
        FormattedText formattedText2 = x9v0Var.c;
        tse tseVar = this.N;
        if (formattedText2 == null || formattedText2.equals(FormattedText.c)) {
            listItemComponent.setTitle(this.S);
            listItemComponent.highLightTitle(arrayList);
        } else {
            this.V = tje.N(tseVar, null, null, new SuggestHolder$setTitle$1(this, formattedText2, null), 3);
        }
        if (formattedText != null && !formattedText.equals(FormattedText.c)) {
            this.Z = tje.N(tseVar, null, null, new SuggestHolder$setSubtitle$1(this, formattedText, null), 3);
            return;
        }
        listItemComponent.setSubtitle(this.W);
        if (x9v0Var.m) {
            listItemComponent.highLightSubTitle(x9v0Var.l);
        }
    }

    public void Y(x9v0 x9v0Var, boolean z, zt ztVar) {
        ga0 ga0Var = x9v0Var.L;
        ListItemComponent listItemComponent = this.O;
        if (ga0Var != null) {
            this.P.s7(j8v0.a);
            listItemComponent.setTrailImportantForAccessibility(4);
            listItemComponent.setTrailContainerClickListener(null);
            this.d0 = ((nac) this.Q.f(new c1p0(22, this, ga0Var), listItemComponent)).c(ga0Var.a);
            return;
        }
        if (ga0Var != null) {
            w511.b();
            return;
        }
        View view = this.a;
        listItemComponent.setTrailImageSize(ru.yandex.taxi.design.utils.c.h(32, view));
        listItemComponent.setTrailImagePadding(0, 0, tje.u(12, view.getContext()), 0);
        kne0 kne0Var = x9v0Var.p;
        String str = x9v0Var.h;
        listItemComponent.setTrailImportantForAccessibility(4);
        androidx.core.view.b.p(listItemComponent, null);
        if (kne0Var.b) {
            listItemComponent.setTrailImage((Drawable) null);
            listItemComponent.setTrailCompanionText(kne0Var.a);
            listItemComponent.clearTrailSubtext();
            listItemComponent.setTrailTextSize(tje.r(mrg0.component_text_size_caption, view.getContext()));
            listItemComponent.setTrailContainerClickListener(new hos0(3, this, x9v0Var));
            listItemComponent.setTrailTextColor(qje.t(xng0.textMain, view.getContext()));
            listItemComponent.showTrailDivider();
            return;
        }
        FormattedText formattedText = x9v0Var.J;
        FormattedText formattedText2 = x9v0Var.K;
        if (formattedText != null) {
            listItemComponent.setTrailCompanionTextAlignment(2);
            SuggestHolder$bindTrailOld$2 suggestHolder$bindTrailOld$2 = new SuggestHolder$bindTrailOld$2(this, formattedText, null);
            tse tseVar = this.N;
            this.b0 = tje.N(tseVar, null, null, suggestHolder$bindTrailOld$2, 3);
            if (formattedText2 != null) {
                listItemComponent.setTrailCompanionSubtextAlignment(2);
                this.c0 = tje.N(tseVar, null, null, new SuggestHolder$bindTrailOld$3(this, formattedText2, null), 3);
            } else {
                listItemComponent.clearTrailSubtext();
            }
        } else {
            listItemComponent.setTrailCompanionText(str);
            listItemComponent.clearTrailSubtext();
            listItemComponent.setTrailTextSize(tje.r(x9v0Var.n, view.getContext()));
            listItemComponent.setTrailTextColor(qje.t(xng0.textMinor, view.getContext()));
        }
        listItemComponent.setTrailContainerClickListener(null);
        listItemComponent.hideTrailDivider();
        if (x9v0Var.M) {
            listItemComponent.setTrailImage(dzg0.chevron_next);
            return;
        }
        if ((str != null && !evu0.J(str)) || !z) {
            listItemComponent.setTrailImage(0);
            return;
        }
        listItemComponent.setTrailImage(yyg0.ic_suggest_dots);
        listItemComponent.setTrailContainerClickListener(new k5v0(this, x9v0Var, 1));
        listItemComponent.setTrailImportantForAccessibility(1);
        listItemComponent.setTrailContentDescription(ztVar.a);
        androidx.core.view.b.p(listItemComponent, new ifq0(5, ztVar));
    }

    public final void Z(int i) {
        ListItemComponent listItemComponent = this.O;
        if (i == 1) {
            listItemComponent.setTitleSingleLine(true);
        } else {
            listItemComponent.setTitleSingleLine(false);
            listItemComponent.setTitleMaxLines(i);
        }
        listItemComponent.setTitle(this.S);
        listItemComponent.highLightTitle(this.T);
        listItemComponent.invalidateComponent();
    }

    public void a0(x9v0 x9v0Var) {
        ClickableImageView leadImageView = this.O.getLeadImageView();
        String str = x9v0Var.i;
        String str2 = x9v0Var.t;
        if (str == null && str2 == null) {
            if (x9v0Var.s) {
                leadImageView.setImageResource(yyg0.ic_suggest_default);
                return;
            } else {
                leadImageView.setImageDrawable(null);
                return;
            }
        }
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        nac nacVar = (nac) this.Q.a(leadImageView);
        nacVar.e(yyg0.ic_suggest_default);
        if (str == null) {
            str = "";
        }
        this.U = nacVar.c(str);
    }

    public void b0() {
        g18 g18Var = this.U;
        if (g18Var != null) {
            g18Var.cancel();
        }
        pzt0 pzt0Var = this.V;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.Z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.b0;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        pzt0 pzt0Var4 = this.c0;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
        g18 g18Var2 = this.d0;
        if (g18Var2 != null) {
            g18Var2.cancel();
        }
    }
}
