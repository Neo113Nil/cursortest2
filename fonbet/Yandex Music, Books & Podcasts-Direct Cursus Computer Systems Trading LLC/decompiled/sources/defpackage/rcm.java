package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import ru.yandex.music.R;
import ru.yandex.music.novelties.podcasts.a;
import ru.yandex.music.ui.view.SquaredByWidthShapeableImageView;

/* loaded from: classes6.dex */
public final class rcm extends hq2 {
    public final boolean g;
    public pcm h;
    public Object i;

    public rcm(Context context) {
        context.getClass();
        this.g = true;
        this.h = bs4.i;
        this.i = c5b.a;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hq2, defpackage.qon
    public final void j(opn opnVar, int i) {
        String w;
        int i2;
        int i3;
        a aVar = (a) opnVar;
        super.j(aVar, i);
        Object obj = this.d.get(i);
        obj.getClass();
        ywl ywlVar = (ywl) obj;
        if (!(ywlVar instanceof ywl)) {
            b6e.s();
            return;
        }
        oq oqVar = ywlVar.a.a;
        View view = aVar.a;
        Context context = aVar.u;
        q13 q13Var = aVar.w;
        s9f[] s9fVarArr = a.H;
        ((SquaredByWidthShapeableImageView) q13Var.a(s9fVarArr[1])).setShapeAppearanceModel(aVar.G);
        aVar.w().setGravity(3);
        SquaredByWidthShapeableImageView squaredByWidthShapeableImageView = (SquaredByWidthShapeableImageView) aVar.w.a(s9fVarArr[1]);
        co6 co6Var = oqVar.D;
        int s = wct.s();
        Context context2 = squaredByWidthShapeableImageView.getContext();
        context2.getClass();
        pce X = i4w.X(co6Var, context2, s);
        X.f(squaredByWidthShapeableImageView);
        rce a = X.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a);
        TextView w2 = aVar.w();
        String str = oqVar.b;
        w2.setText(str);
        int i4 = oqVar.q;
        if (i4 >= 0) {
            boolean l = ((t3g) aVar.E.getValue()).l(oqVar.a);
            TextView v = aVar.v();
            context.getClass();
            vq2.J(v, context, l);
            TextView v2 = aVar.v();
            int i5 = i4 + (l ? 1 : 0);
            v2.setText(y3g.a(i5));
            w = dag.A(i5, false);
            aVar.v().setVisibility(0);
        } else {
            aVar.v().setCompoundDrawablePadding(0);
            aVar.v().setCompoundDrawables(null, null, null, null);
            aVar.v().setText(etn.w(oqVar));
            aVar.v().setVisibility(0);
            w = etn.w(oqVar);
        }
        jzb i6 = oqVar.i();
        if (i6 != null) {
            aVar.t().c(i6);
        }
        aVar.t().setVisibility(i6 != null ? 0 : 8);
        boolean a2 = ((m8w) ((k8w) aVar.F.getValue())).a(oqVar);
        ((ImageView) aVar.D.a(s9fVarArr[8])).setVisibility(a2 ? 0 : 8);
        view.getClass();
        bow.D(view);
        String contentDescription = aVar.t().getVisibility() == 0 ? aVar.t().getContentDescription() : "";
        view.setContentDescription(str + StringUtil.SPACE + ((Object) contentDescription) + StringUtil.SPACE + (a2 ? context.getString(R.string.bookmate_plus_badge_text) : "") + StringUtil.SPACE + w);
        if (this.g) {
            jf4 jf4Var = ((ywl) this.i.get(i)).a.b;
            jf4Var.getClass();
            LinearLayout linearLayout = (LinearLayout) aVar.B.a(s9fVarArr[6]);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView = (TextView) aVar.A.a(s9fVarArr[5]);
            if (textView != null) {
                textView.setText(String.valueOf(jf4Var.a));
            }
            ImageView imageView = (ImageView) aVar.C.a(s9fVarArr[7]);
            mf4 mf4Var = jf4Var.b;
            if (imageView != null) {
                if (mf4Var != null) {
                    boolean z = mf4Var instanceof umt;
                    if (z) {
                        i2 = 2131231393;
                    } else if (mf4Var instanceof t9a) {
                        i2 = 2131231387;
                    } else if (mf4Var instanceof tno) {
                        i2 = 2131231391;
                    } else {
                        if (!(mf4Var instanceof u2j)) {
                            b6e.s();
                            return;
                        }
                        i2 = R.drawable.ic_chart_new_multicolor_dark_20;
                    }
                    Context context3 = imageView.getContext();
                    if (z) {
                        i3 = R.string.chart_up_description;
                    } else if (mf4Var instanceof t9a) {
                        i3 = R.string.chart_down_description;
                    } else if (mf4Var instanceof tno) {
                        i3 = R.string.chart_same_description;
                    } else {
                        if (!(mf4Var instanceof u2j)) {
                            b6e.s();
                            return;
                        }
                        i3 = R.string.chart_new_description;
                    }
                    imageView.setContentDescription(context3.getString(i3));
                } else {
                    i2 = 0;
                }
                imageView.setImageResource(i2);
            }
        }
        if (!(this.h instanceof ocm) || aVar.u().getLayoutParams().height == 0) {
            return;
        }
        View u = aVar.u();
        ViewGroup.LayoutParams layoutParams = u.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = 0;
            u.setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.g);
    }
}
