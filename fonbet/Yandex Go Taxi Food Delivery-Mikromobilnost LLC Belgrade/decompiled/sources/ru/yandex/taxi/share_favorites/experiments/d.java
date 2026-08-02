package ru.yandex.taxi.share_favorites.experiments;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.dn6;
import defpackage.dxu0;
import defpackage.dzg0;
import defpackage.iws;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qje;
import defpackage.rfh0;
import defpackage.tls;
import defpackage.trh0;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yuf0;
import java.util.Collections;
import ru.yandex.taxi.bubbles.models.BubbleModelShownFrom;
import ru.yandex.taxi.layers.domain.model.BubbleType;
import ru.yandex.taxi.share_favorites.experiments.GeoSharingBubbleFactory$sharingBubbleModelFlow$1;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class d implements dn6 {
    public static final /* synthetic */ int h = 0;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final tls f;
    public final wls g;

    public d(String str, String str2, int i, boolean z, tls tlsVar, wls wlsVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
        this.f = tlsVar;
        this.g = wlsVar;
    }

    @Override // defpackage.dn6
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dn6
    public final Bitmap b(Context context, yuf0 yuf0Var) {
        View inflate = LayoutInflater.from(context).inflate(trh0.geo_sharing_bubble, (ViewGroup) null, false);
        int i = rfh0.subtitle;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = rfh0.title;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView2 != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                robotoTextView2.setText(this.b);
                if (xw31.n(context)) {
                    robotoTextView2.setCompoundDrawablesWithIntrinsicBounds(dzg0.chevron_next, 0, 0, 0);
                } else {
                    robotoTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, dzg0.chevron_next, 0);
                }
                robotoTextView.setText(this.c);
                return yuf0Var.r(new dxu0(q5z.s(qje.u(context.getTheme(), xng0.bgMain)), null, null, 1022), Collections.singletonList(linearLayout), null, null, BubbleType.MEDIUM_OR_LARGE, new iws(1)).b();
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.dn6
    public final void c(BubbleModelShownFrom bubbleModelShownFrom) {
        ((GeoSharingBubbleFactory$sharingBubbleModelFlow$1.AnonymousClass1) this.f).invoke(bubbleModelShownFrom);
    }

    @Override // defpackage.dn6
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.dn6
    public final boolean e() {
        return true;
    }

    @Override // defpackage.dn6
    public final boolean f() {
        return true;
    }

    @Override // defpackage.dn6
    public final void g(double d, double d2) {
        ((GeoSharingBubbleFactory$sharingBubbleModelFlow$1.AnonymousClass2) this.g).invoke(Double.valueOf(d), Double.valueOf(d2));
    }
}
