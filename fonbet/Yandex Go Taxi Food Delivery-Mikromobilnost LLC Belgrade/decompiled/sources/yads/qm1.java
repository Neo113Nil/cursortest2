package yads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;
import defpackage.b471;
import defpackage.cr71;
import defpackage.fe81;
import defpackage.h071;
import defpackage.h471;
import defpackage.hi61;
import defpackage.j981;
import defpackage.nba1;
import defpackage.nk61;
import defpackage.t071;
import defpackage.w191;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class qm1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ j981 a;
    public final /* synthetic */ CustomizableMediaView b;
    public final /* synthetic */ gm1 c;

    public qm1(j981 j981Var, CustomizableMediaView customizableMediaView, gm1 gm1Var) {
        this.a = j981Var;
        this.b = customizableMediaView;
        this.c = gm1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        cr71 cr71Var = this.a.b;
        CustomizableMediaView customizableMediaView = this.b;
        String str = this.c.b;
        fe81 fe81Var = (fe81) cr71Var.b;
        String str2 = fe81Var.c.a;
        if (str2 == null) {
            return false;
        }
        int i = fe81Var.n;
        ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(nba1.a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
        Integer valueOf2 = layoutParams2 != null ? Integer.valueOf(nba1.a(layoutParams2.height)) : null;
        int a = nba1.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
        int a2 = nba1.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
        int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
        fi1 fi1Var = mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? fi1.d : fi1.b : fi1.d : fi1.c;
        int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
        ((ExecutorService) cr71Var.x).execute(new nk61(9, cr71Var, new h471(str2, i), new hi61(new w191(nba1.a(customizableMediaView.getWidth()), nba1.a(customizableMediaView.getHeight())), new h071(valueOf, valueOf2), new t071(new b471(a, fi1Var), new b471(a2, mode2 != Integer.MIN_VALUE ? mode2 != 0 ? mode2 != 1073741824 ? fi1.d : fi1.b : fi1.d : fi1.c)), b.i(new Pair("asset", "media"), new Pair("media_type", str)))));
        return false;
    }
}
