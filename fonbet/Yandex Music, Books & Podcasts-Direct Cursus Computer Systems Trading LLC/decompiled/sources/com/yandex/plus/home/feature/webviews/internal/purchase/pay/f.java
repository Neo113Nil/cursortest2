package com.yandex.plus.home.feature.webviews.internal.purchase.pay;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.j;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.home.i;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.home.repository.api.model.webconfig.o;
import com.yandex.plus.home.repository.api.model.webconfig.p;
import defpackage.aa5;
import defpackage.b6e;
import defpackage.btf;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class f {
    public static final /* synthetic */ s9f[] r = {new yxm(f.class, "offerTextView", "getOfferTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, f.class, "offerSubTextView", "getOfferSubTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "offerOneClickTextView", "getOfferOneClickTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "payButtonView", "getPayButtonView()Landroid/widget/TextView;", 0), new yxm(f.class, "progressView", "getProgressView()Landroid/widget/ProgressBar;", 0)};
    public final com.yandex.plus.ui.core.theme.a a;
    public final View b;
    public final b c;
    public final c d;
    public final com.yandex.plus.resources.core.a e;
    public final com.yandex.plus.bdui.plus.content.controller.f f;
    public final com.yandex.plus.bdui.plus.content.controller.f g;
    public final com.yandex.plus.bdui.plus.content.controller.f h;
    public final com.yandex.plus.bdui.plus.content.controller.f i;
    public final com.yandex.plus.bdui.plus.content.controller.f j;
    public final jyr k;
    public final ColorStateList l;
    public final RippleDrawable m;
    public final jyr n;
    public String o;
    public com.yandex.plus.core.theme.c p;
    public final jyr q;

    public f(com.yandex.plus.ui.core.theme.a aVar, ViewGroup viewGroup, b bVar, c cVar, com.yandex.plus.resources.core.a aVar2, com.yandex.plus.core.strings.a aVar3) {
        aVar.getClass();
        viewGroup.getClass();
        bVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = aVar;
        this.b = viewGroup;
        this.c = bVar;
        this.d = cVar;
        this.e = aVar2;
        this.f = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 12));
        this.g = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 13));
        this.h = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 14));
        this.i = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 15));
        this.j = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 16));
        final int i = 0;
        jyr b = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.purchase.pay.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(fVar.b.getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius));
                    default:
                        return new g(fVar.b);
                }
            }
        });
        this.k = b;
        ColorStateList valueOf = ColorStateList.valueOf(r1.j(R.attr.plus_sdk_panelDefaultRippleColor, viewGroup));
        valueOf.getClass();
        this.l = valueOf;
        RippleDrawable rippleDrawable = new RippleDrawable(valueOf, com.yandex.plus.bdui.plus.analytics.b.y(r1.D(aVar3), ((Number) b.getValue()).floatValue()), null);
        this.m = rippleDrawable;
        this.n = btf.b(new u6(17));
        this.o = "";
        this.p = a(b(), null);
        final int i2 = 1;
        this.q = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.purchase.pay.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(fVar.b.getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius));
                    default:
                        return new g(fVar.b);
                }
            }
        });
        r1.E(b(), new i(1, this));
        b().setBackground(rippleDrawable);
        if (viewGroup.isAttachedToWindow()) {
            cVar.f(this);
        } else {
            viewGroup.addOnAttachStateChangeListener(new e(viewGroup, this, 0));
        }
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new e(viewGroup, this, 1));
        } else {
            cVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(f fVar, String str, String str2, String str3, boolean z, a0 a0Var, boolean z2, int i) {
        int b;
        String str4;
        s9f[] s9fVarArr;
        String str5;
        Context context;
        k kVar;
        Drawable drawable;
        boolean z3 = (i & 32) != 0 ? false : z2;
        com.yandex.plus.resources.core.a aVar = fVar.e;
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = fVar.h;
        jyr jyrVar = fVar.n;
        com.yandex.plus.bdui.plus.content.controller.f fVar3 = fVar.g;
        com.yandex.plus.bdui.plus.content.controller.f fVar4 = fVar.f;
        c cVar = fVar.d;
        View view = fVar.b;
        p pVar = a0Var.d;
        com.yandex.plus.home.repository.api.model.webconfig.f fVar5 = a0Var.e;
        v vVar = pVar.d;
        com.yandex.plus.ui.core.theme.a aVar2 = fVar.a;
        Context context2 = view.getContext();
        context2.getClass();
        k kVar2 = u.r(context2, aVar2) ? vVar.b : vVar.a;
        view.setBackground(kVar2 != null ? com.yandex.plus.bdui.plus.analytics.b.E(kVar2, R.attr.plus_sdk_payBackgroundDefaultTextColor, 0.0f, 0.0f, 0.0f, 0.0f, 30) : null);
        s9f[] s9fVarArr2 = r;
        TextView textView = (TextView) fVar4.g(s9fVarArr2[0]);
        com.yandex.plus.core.data.common.c cVar2 = pVar.c;
        Context context3 = textView.getContext();
        context3.getClass();
        if (cVar2 != null) {
            Integer num = u.r(context3, aVar2) ? cVar2.b : cVar2.a;
            if (num != null) {
                b = num.intValue();
                ((TextView) fVar4.g(s9fVarArr2[0])).setText(str);
                ((TextView) fVar4.g(s9fVarArr2[0])).setTextColor(b);
                TextView textView2 = (TextView) fVar3.g(s9fVarArr2[1]);
                String str6 = str2 != null ? "" : str2;
                com.yandex.plus.home.repository.api.model.webconfig.k kVar3 = pVar.a;
                str4 = kVar3 == null ? kVar3.a : null;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = kVar3 == null ? kVar3.b : null;
                String str8 = str7 != null ? str7 : "";
                cVar.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) str6);
                if (StringsKt.U(str4)) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    s9fVarArr = s9fVarArr2;
                    r1.c(spannableStringBuilder, str4, null, new com.yandex.plus.bdui.content.b(18, cVar, str8));
                } else {
                    s9fVarArr = s9fVarArr2;
                }
                textView2.setText(SpannableString.valueOf(spannableStringBuilder));
                textView2.setMovementMethod((MovementMethod) jyrVar.getValue());
                ((TextView) fVar3.g(s9fVarArr[1])).setTextColor(aa5.l(b, ((TextView) fVar3.g(s9fVarArr[1])).getContext().getResources().getInteger(R.integer.plus_sdk_pay_offer_sub_text_alpha)));
                if (((Boolean) a0Var.f.getValue()).booleanValue()) {
                    ((TextView) fVar2.g(s9fVarArr[2])).setVisibility(8);
                } else {
                    ((TextView) fVar2.g(s9fVarArr[2])).setVisibility(0);
                    TextView textView3 = (TextView) fVar2.g(s9fVarArr[2]);
                    o oVar = pVar.b;
                    oVar.getClass();
                    int color = textView3.getContext().getColor(R.color.home_sdk_semantic_link_link);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) oVar.e.getValue());
                    r1.c(spannableStringBuilder2, oVar.b, Integer.valueOf(color), new com.yandex.plus.bdui.content.b(19, cVar, oVar));
                    spannableStringBuilder2.append((CharSequence) oVar.f.getValue());
                    textView3.setText(SpannableString.valueOf(spannableStringBuilder2));
                    textView3.setMovementMethod((MovementMethod) jyrVar.getValue());
                }
                if (str3 == null) {
                    str5 = str3;
                } else if (z) {
                    str5 = fVar5.a;
                    if (str5 == null) {
                        str5 = r1.m(((com.yandex.plus.resources.core.c) aVar).a(R.string.Home_PlusPayButton_Try_Title), fVar.b());
                    }
                } else {
                    str5 = fVar5.b;
                    if (str5 == null) {
                        str5 = r1.m(((com.yandex.plus.resources.core.c) aVar).a(R.string.Home_PlusPayButton_Subscribe_Title), fVar.b());
                    }
                }
                fVar.o = str5;
                fVar.b().setText(fVar.o);
                fVar.p = fVar.a(fVar.b(), fVar5.c);
                com.yandex.plus.bdui.flex.ui.a.D(fVar.b(), fVar.p, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
                TextView b2 = fVar.b();
                v vVar2 = fVar5.d;
                context = fVar.b().getContext();
                context.getClass();
                if (u.r(context, aVar2)) {
                    if (vVar2 != null) {
                        kVar = vVar2.a;
                    }
                    kVar = null;
                } else {
                    if (vVar2 != null) {
                        kVar = vVar2.b;
                    }
                    kVar = null;
                }
                if (kVar == null) {
                    float floatValue = ((Number) fVar.k.getValue()).floatValue();
                    drawable = com.yandex.plus.bdui.plus.analytics.b.B(kVar, floatValue, floatValue, floatValue, floatValue);
                } else {
                    drawable = fVar.m;
                }
                b2.setBackground(new RippleDrawable(fVar.l, drawable, null));
                ((g) fVar.q.getValue()).a();
                fVar.d(z3);
            }
        }
        b = com.yandex.plus.home.common.utils.a.b(context3, R.attr.plus_sdk_payOfferDefaultTextColor);
        ((TextView) fVar4.g(s9fVarArr2[0])).setText(str);
        ((TextView) fVar4.g(s9fVarArr2[0])).setTextColor(b);
        TextView textView22 = (TextView) fVar3.g(s9fVarArr2[1]);
        if (str2 != null) {
        }
        com.yandex.plus.home.repository.api.model.webconfig.k kVar32 = pVar.a;
        if (kVar32 == null) {
        }
        if (str4 == null) {
        }
        if (kVar32 == null) {
        }
        if (str7 != null) {
        }
        cVar.getClass();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) str6);
        if (StringsKt.U(str4)) {
        }
        textView22.setText(SpannableString.valueOf(spannableStringBuilder3));
        textView22.setMovementMethod((MovementMethod) jyrVar.getValue());
        ((TextView) fVar3.g(s9fVarArr[1])).setTextColor(aa5.l(b, ((TextView) fVar3.g(s9fVarArr[1])).getContext().getResources().getInteger(R.integer.plus_sdk_pay_offer_sub_text_alpha)));
        if (((Boolean) a0Var.f.getValue()).booleanValue()) {
        }
        if (str3 == null) {
        }
        fVar.o = str5;
        fVar.b().setText(fVar.o);
        fVar.p = fVar.a(fVar.b(), fVar5.c);
        com.yandex.plus.bdui.flex.ui.a.D(fVar.b(), fVar.p, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
        TextView b22 = fVar.b();
        v vVar22 = fVar5.d;
        context = fVar.b().getContext();
        context.getClass();
        if (u.r(context, aVar2)) {
        }
        if (kVar == null) {
        }
        b22.setBackground(new RippleDrawable(fVar.l, drawable, null));
        ((g) fVar.q.getValue()).a();
        fVar.d(z3);
    }

    public final com.yandex.plus.core.theme.c a(TextView textView, v vVar) {
        if (vVar != null) {
            Context context = textView.getRootView().getContext();
            context.getClass();
            k kVar = u.r(context, this.a) ? vVar.b : vVar.a;
            com.yandex.plus.core.theme.c aVar = kVar instanceof com.yandex.plus.core.data.common.f ? new com.yandex.plus.core.theme.a(((com.yandex.plus.core.data.common.f) kVar).b) : kVar instanceof j ? new com.yandex.plus.core.theme.b(com.yandex.plus.bdui.plus.analytics.b.D(((j) kVar).b)) : null;
            if (aVar != null) {
                return aVar;
            }
        }
        Context context2 = textView.getContext();
        context2.getClass();
        return new com.yandex.plus.core.theme.a(com.yandex.plus.home.common.utils.a.b(context2, R.attr.plus_sdk_payButtonDefaultTextColor));
    }

    public final TextView b() {
        return (TextView) this.i.g(r[3]);
    }

    public final String c(com.yandex.plus.home.pay.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.o;
            }
            b6e.s();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        TextView b = b();
        com.yandex.plus.resources.core.a aVar2 = this.e;
        sb.append(r1.m(((com.yandex.plus.resources.core.c) aVar2).a(R.string.Home_PlusPayButton_Error_WentWrong_Title), b));
        sb.append('\n');
        sb.append(r1.m(((com.yandex.plus.resources.core.c) aVar2).a(R.string.Home_PlusPayButton_Error_WentWrong_Subtitle), b()));
        return sb.toString();
    }

    public final void d(boolean z) {
        ((ProgressBar) this.j.g(r[4])).setVisibility(z ? 0 : 8);
        b().setEnabled(!z);
        com.yandex.plus.bdui.flex.ui.a.D(b(), z ? new com.yandex.plus.core.theme.a(r1.j(R.attr.plus_sdk_transparentColor, b())) : this.p, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
    }
}
