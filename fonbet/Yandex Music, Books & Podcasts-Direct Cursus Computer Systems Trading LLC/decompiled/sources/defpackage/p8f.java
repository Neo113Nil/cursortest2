package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;
import ru.yandex.music.ui.view.ImageSpannableEllipsizedTextView;
import ru.yandex.music.ui.view.RoundedOutlineProviderImageView;
import ru.yandex.music.ui.view.YaRotatingProgress;

/* loaded from: classes4.dex */
public final class p8f {
    public static final /* synthetic */ s9f[] s = {new yxm(p8f.class, "smallHeaderContainer", "getSmallHeaderContainer()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, p8f.class, "actionsList", "getActionsList()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(p8f.class, "title", "getTitle()Lru/yandex/music/ui/view/ImageSpannableEllipsizedTextView;", 0), new yxm(p8f.class, "subtitle", "getSubtitle()Lru/yandex/music/ui/view/ImageSpannableEllipsizedTextView;", 0), new yxm(p8f.class, "cover", "getCover()Lru/yandex/music/ui/view/RoundedOutlineProviderImageView;", 0), new yxm(p8f.class, "loadingPlaceholderContainer", "getLoadingPlaceholderContainer()Landroid/view/View;", 0), new yxm(p8f.class, "loadingProgressBar", "getLoadingProgressBar()Lru/yandex/music/ui/view/YaRotatingProgress;", 0)};
    public final g8c a;
    public final View b;
    public final Context c;
    public jvd d;
    public List e;
    public String f;
    public n1u g;
    public n68 h;
    public final q13 i;
    public final q13 j;
    public final q13 k;
    public final q13 l;
    public final q13 m;
    public final q13 n;
    public final q13 o;
    public final r8f p;
    public AlphaAnimation q;
    public final e3e r;

    public p8f(LayoutInflater layoutInflater, JuicyBottomSheetFrameLayout juicyBottomSheetFrameLayout, kxi kxiVar, w8f w8fVar, w8f w8fVar2, g8c g8cVar) {
        layoutInflater.getClass();
        juicyBottomSheetFrameLayout.getClass();
        g8cVar.getClass();
        this.a = g8cVar;
        View inflate = layoutInflater.inflate(R.layout.juicy_dialog, (ViewGroup) juicyBottomSheetFrameLayout, true);
        inflate.getClass();
        this.b = inflate;
        Context context = juicyBottomSheetFrameLayout.getContext();
        context.getClass();
        this.c = context;
        this.e = c5b.a;
        this.i = new q13(new etb(inflate, 27));
        this.j = new q13(new etb(inflate, 28));
        this.k = new q13(new etb(inflate, 29));
        this.l = new q13(new o8f(inflate, 0));
        q13 q13Var = new q13(new o8f(inflate, 1));
        this.m = q13Var;
        this.n = new q13(new o8f(inflate, 2));
        this.o = new q13(new o8f(inflate, 3));
        this.p = new r8f(kxiVar, w8fVar, w8fVar2);
        this.r = new e3e();
        xv.S((RoundedOutlineProviderImageView) q13Var.a(s[4]));
        inflate.post(new sr7(25, this));
    }

    public final RecyclerView a() {
        return (RecyclerView) this.j.a(s[1]);
    }

    public final View b() {
        return (View) this.n.a(s[5]);
    }

    public final void c() {
        q13 q13Var = this.k;
        s9f[] s9fVarArr = s;
        ImageSpannableEllipsizedTextView imageSpannableEllipsizedTextView = (ImageSpannableEllipsizedTextView) q13Var.a(s9fVarArr[2]);
        jvd jvdVar = this.d;
        if (jvdVar == null) {
            Intrinsics.j("headerData");
            throw null;
        }
        imageSpannableEllipsizedTextView.setText(jvdVar.a);
        ImageSpannableEllipsizedTextView imageSpannableEllipsizedTextView2 = (ImageSpannableEllipsizedTextView) this.l.a(s9fVarArr[3]);
        jvd jvdVar2 = this.d;
        if (jvdVar2 == null) {
            Intrinsics.j("headerData");
            throw null;
        }
        sht.e(imageSpannableEllipsizedTextView2, jvdVar2.b);
        ImageSpannableEllipsizedTextView imageSpannableEllipsizedTextView3 = (ImageSpannableEllipsizedTextView) this.l.a(s9fVarArr[3]);
        jvd jvdVar3 = this.d;
        if (jvdVar3 == null) {
            Intrinsics.j("headerData");
            throw null;
        }
        imageSpannableEllipsizedTextView3.setContentDescription(jvdVar3.d);
        RoundedOutlineProviderImageView roundedOutlineProviderImageView = (RoundedOutlineProviderImageView) this.m.a(s9fVarArr[4]);
        jvd jvdVar4 = this.d;
        if (jvdVar4 == null) {
            Intrinsics.j("headerData");
            throw null;
        }
        co6 co6Var = jvdVar4.c;
        int s2 = wct.s();
        Context context = roundedOutlineProviderImageView.getContext();
        context.getClass();
        pce X = i4w.X(co6Var, context, s2);
        X.f(roundedOutlineProviderImageView);
        rce a = X.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a);
        l48 l48Var = ftb.d;
        Context context2 = this.c;
        jvd jvdVar5 = this.d;
        if (jvdVar5 == null) {
            Intrinsics.j("headerData");
            throw null;
        }
        SpannableStringBuilder spannableStringBuilder = jvdVar5.a;
        l48Var.getClass();
        context2.getClass();
        float dimension = context2.getResources().getDimension(R.dimen.text_size_xlarge);
        if (xv7.o == null) {
            xv7.o = e3o.a(context2, R.font.ya_medium);
        }
        Typeface typeface = xv7.o;
        typeface.getClass();
        if (l48.j(context2, spannableStringBuilder, dimension, typeface)) {
            jvd jvdVar6 = this.d;
            if (jvdVar6 == null) {
                Intrinsics.j("headerData");
                throw null;
            }
            String str = jvdVar6.b;
            float dimension2 = context2.getResources().getDimension(R.dimen.text_size_large);
            if (xv7.o == null) {
                xv7.o = e3o.a(context2, R.font.ya_medium);
            }
            Typeface typeface2 = xv7.o;
            typeface2.getClass();
            if (l48.j(context2, str, dimension2, typeface2) && this.f == null) {
                RecyclerView a2 = a();
                a2.setPadding(a2.getPaddingLeft(), context2.getResources().getDimensionPixelSize(R.dimen.juicy_item_catalog_header_height), a2.getPaddingRight(), a2.getPaddingBottom());
                this.p.w(this.e, this.f, null, this.g, this.h);
                return;
            }
        }
        RecyclerView a3 = a();
        a3.setPadding(a3.getPaddingLeft(), (4 * sht.b(context2).densityDpi) / 160, a3.getPaddingRight(), a3.getPaddingBottom());
        r8f r8fVar = this.p;
        List list = this.e;
        String str2 = this.f;
        jvd jvdVar7 = this.d;
        if (jvdVar7 != null) {
            r8fVar.w(list, str2, jvdVar7, this.g, this.h);
        } else {
            Intrinsics.j("headerData");
            throw null;
        }
    }

    public final void d(boolean z, boolean z2) {
        boolean z3 = !z;
        BottomSheetBehavior bottomSheetBehavior = ((x7f) this.a.a).k;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setDraggable(z3);
        }
        if (z) {
            b().setVisibility(0);
            ((YaRotatingProgress) this.o.a(s[6])).setVisibility(z2 ? 0 : 8);
        } else {
            if (b().getVisibility() == 4) {
                return;
            }
            AlphaAnimation alphaAnimation = this.q;
            if (alphaAnimation == null || alphaAnimation.hasEnded()) {
                this.q = cb0.C(b());
            }
        }
    }
}
