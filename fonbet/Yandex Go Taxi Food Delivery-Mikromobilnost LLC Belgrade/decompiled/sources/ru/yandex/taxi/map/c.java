package ru.yandex.taxi.map;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.ah00;
import defpackage.c0h0;
import defpackage.evu0;
import defpackage.f4c0;
import defpackage.i3y;
import defpackage.j741;
import defpackage.l741;
import defpackage.mxp0;
import defpackage.qje;
import defpackage.sls;
import defpackage.vng;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.xm00;
import defpackage.xng0;
import defpackage.xw31;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.shadow.ShadowWrapperImpl;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.walkroute.WalkRouteInfoView;

/* loaded from: classes9.dex */
public final class c implements j741 {
    public final Context a;
    public final ah00 b;
    public final ShadowWrapperImpl c;
    public final i3y d;
    public w4e0 e;
    public f4c0 f;
    public l741 g;
    public ValueAnimator h;
    public f4c0 i;
    public f4c0 j;
    public final i3y k;
    public String l = "";

    public c(Context context, ah00 ah00Var, ShadowWrapperImpl shadowWrapperImpl) {
        this.a = context;
        this.b = ah00Var;
        this.c = shadowWrapperImpl;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: k741
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        return ((gh00) cVar.b).i.p();
                    default:
                        WalkRouteInfoView walkRouteInfoView = new WalkRouteInfoView(cVar.a);
                        walkRouteInfoView.setTextTypeface(3);
                        return walkRouteInfoView;
                }
            }
        });
        final int i2 = 1;
        this.k = kotlin.a.a(new sls(this) { // from class: k741
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        return ((gh00) cVar.b).i.p();
                    default:
                        WalkRouteInfoView walkRouteInfoView = new WalkRouteInfoView(cVar.a);
                        walkRouteInfoView.setTextTypeface(3);
                        return walkRouteInfoView;
                }
            }
        });
    }

    public final void a() {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        ((xm00) this.d.getValue()).m();
        this.h = null;
        this.e = null;
        this.f = null;
        this.g = null;
        i3y i3yVar = this.k;
        if (i3yVar.isInitialized()) {
            ((WalkRouteInfoView) i3yVar.getValue()).setText((CharSequence) null);
        }
        this.i = null;
        this.j = null;
    }

    public final void b(boolean z) {
        f4c0 f4c0Var = this.f;
        if (f4c0Var != null) {
            f4c0Var.i(z);
        }
    }

    public final void c(boolean z) {
        w4e0 w4e0Var = this.e;
        if (w4e0Var != null) {
            w4e0Var.i(z);
        }
        f4c0 f4c0Var = this.f;
        if (f4c0Var != null) {
            f4c0Var.i(z && !evu0.J(this.l));
        }
    }

    public final void d(WalkingRouteUiState walkingRouteUiState) {
        Point point;
        this.l = walkingRouteUiState.f();
        if (walkingRouteUiState.b().isEmpty()) {
            a();
            return;
        }
        Polyline l = k.l(walkingRouteUiState.b());
        if (l == null) {
            return;
        }
        WalkingRouteUiState.Type e = walkingRouteUiState.e();
        w4e0 w4e0Var = this.e;
        i3y i3yVar = this.d;
        if (w4e0Var != null) {
            w4e0Var.o(l);
            w4e0 w4e0Var2 = this.e;
            if (w4e0Var2 != null) {
                w4e0Var2.C(Integer.valueOf(e(e)));
            }
        } else {
            w4e0 s = ((xm00) i3yVar.getValue()).s(l);
            s.C(Integer.valueOf(e(e)));
            s.p(2.8f);
            s.u(4.0f);
            s.s(4.0f);
            s.v(false);
            this.e = s;
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
            ofInt.setDuration(OperationProgressView.ROTATION_ANIMATION_DURATION);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setRepeatCount(-1);
            ofInt.addUpdateListener(new mxp0(29, this));
            ofInt.start();
            this.h = ofInt;
        }
        List b = walkingRouteUiState.b();
        ImageProvider d = walkingRouteUiState.d();
        ImageProvider a = walkingRouteUiState.a();
        Point point2 = (Point) kotlin.collections.a.R(b);
        if (point2 != null) {
            f4c0 f4c0Var = this.i;
            if (d == null) {
                if (f4c0Var != null) {
                    f4c0Var.i(false);
                }
            } else if (f4c0Var != null) {
                f4c0Var.o(point2);
                f4c0 f4c0Var2 = this.i;
                if (f4c0Var2 != null) {
                    f4c0Var2.y(d);
                }
            } else {
                f4c0 r = ((xm00) i3yVar.getValue()).r(point2);
                r.y(d);
                this.i = r;
            }
        }
        if (b.size() > 1 && (point = (Point) kotlin.collections.a.b0(b)) != null) {
            f4c0 f4c0Var3 = this.j;
            if (a == null) {
                if (f4c0Var3 != null) {
                    f4c0Var3.i(false);
                }
            } else if (f4c0Var3 != null) {
                f4c0Var3.o(point);
                f4c0 f4c0Var4 = this.j;
                if (f4c0Var4 != null) {
                    f4c0Var4.y(a);
                }
            } else {
                f4c0 r2 = ((xm00) i3yVar.getValue()).r(point);
                r2.y(a);
                this.j = r2;
            }
        }
        String f = walkingRouteUiState.f();
        Float c = walkingRouteUiState.c();
        if (evu0.J(f)) {
            f4c0 f4c0Var5 = this.f;
            if (f4c0Var5 != null) {
                f4c0Var5.i(false);
                return;
            }
            return;
        }
        Point n = ru.yandex.taxi.map.utils.a.n(l);
        if (n == null) {
            return;
        }
        ShadowWrapperImpl shadowWrapperImpl = this.c;
        ThemeType X = qje.X(shadowWrapperImpl.getView().getContext());
        l741 l741Var = this.g;
        i3y i3yVar2 = this.k;
        if (l741Var != null && l741Var.b() != X) {
            ((WalkRouteInfoView) i3yVar2.getValue()).applyTheme(X);
            ((WalkRouteInfoView) i3yVar2.getValue()).setCompoundDrawablesWithIntrinsicBounds(vng.t(c0h0.ic_walking_man, this.a), (Drawable) null, (Drawable) null, (Drawable) null);
            Bitmap s2 = xw31.s(shadowWrapperImpl.getView());
            this.g = new l741(s2, X);
            f4c0 f4c0Var6 = this.f;
            if (f4c0Var6 != null) {
                f4c0Var6.x(s2);
            }
        }
        if (this.g == null || !f.contentEquals(((WalkRouteInfoView) i3yVar2.getValue()).getText())) {
            ((WalkRouteInfoView) i3yVar2.getValue()).setText(f);
            shadowWrapperImpl.wrapView((View) i3yVar2.getValue(), null);
            Bitmap s3 = xw31.s(shadowWrapperImpl.getView());
            this.g = new l741(s3, X);
            f4c0 f4c0Var7 = this.f;
            if (f4c0Var7 != null) {
                f4c0Var7.x(s3);
            }
        }
        if (this.f == null) {
            f4c0 r3 = ((xm00) i3yVar.getValue()).r(n);
            l741 l741Var2 = this.g;
            if (l741Var2 != null) {
                r3.x(l741Var2.a());
            }
            this.f = r3;
        }
        f4c0 f4c0Var8 = this.f;
        if (f4c0Var8 != null) {
            f4c0Var8.o(n);
        }
        if (c != null) {
            float floatValue = c.floatValue();
            f4c0 f4c0Var9 = this.f;
            if (f4c0Var9 != null) {
                f4c0Var9.k(floatValue);
            }
        }
        shadowWrapperImpl.setShadows(EmptyList.a);
    }

    public final int e(WalkingRouteUiState.Type type) {
        int i = b.a[type.ordinal()];
        Context context = this.a;
        if (i == 1) {
            return qje.t(xng0.line, context);
        }
        if (i == 2) {
            return qje.t(xng0.textMain, context);
        }
        w511.b();
        return 0;
    }
}
