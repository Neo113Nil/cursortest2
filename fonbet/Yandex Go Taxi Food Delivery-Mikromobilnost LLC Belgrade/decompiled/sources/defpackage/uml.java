package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.internal.core.a;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivVisibilityAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public abstract class uml {
    public static final boolean a(m3k m3kVar, rvo rvoVar) {
        egk d = m3kVar.d();
        if (d.y() != null || d.k() != null || d.j() != null) {
            return true;
        }
        if (m3kVar instanceof i2k) {
            DivContainer divContainer = ((i2k) m3kVar).c;
            List<cxk> c = a.c(divContainer.B, divContainer.z, rvoVar);
            if (!(c instanceof Collection) || !c.isEmpty()) {
                for (cxk cxkVar : c) {
                    if (a(cxkVar.a, cxkVar.b)) {
                        return true;
                    }
                }
            }
        } else if (m3kVar instanceof m2k) {
            Iterable iterable = ((m2k) m3kVar).c.y;
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            Iterable iterable2 = iterable;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    if (a((m3k) it.next(), rvoVar)) {
                        return true;
                    }
                }
            }
        } else if (!(m3kVar instanceof x2k) && !(m3kVar instanceof n2k) && !(m3kVar instanceof l2k) && !(m3kVar instanceof s2k) && !(m3kVar instanceof o2k) && !(m3kVar instanceof u2k) && !(m3kVar instanceof k2k) && !(m3kVar instanceof q2k) && !(m3kVar instanceof w2k) && !(m3kVar instanceof j2k) && !(m3kVar instanceof r2k) && !(m3kVar instanceof t2k) && !(m3kVar instanceof y2k) && !(m3kVar instanceof p2k) && !(m3kVar instanceof v2k)) {
            w511.b();
            return false;
        }
        return false;
    }

    public static final int b(DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        int i;
        int i2 = divAlignmentHorizontal == null ? -1 : tml.c[divAlignmentHorizontal.ordinal()];
        if (i2 == 1) {
            i = 3;
        } else if (i2 != 2) {
            i = 5;
            if (i2 != 3) {
                i = (i2 == 4 || i2 != 5) ? 8388611 : 8388613;
            }
        } else {
            i = 1;
        }
        int i3 = divAlignmentVertical != null ? tml.d[divAlignmentVertical.ordinal()] : -1;
        int i4 = 48;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 16;
            } else if (i3 == 3) {
                i4 = 80;
            }
        }
        return i4 | i;
    }

    public static final int c(DivContentAlignmentHorizontal divContentAlignmentHorizontal, DivContentAlignmentVertical divContentAlignmentVertical) {
        int i = 8388611;
        switch (divContentAlignmentHorizontal == null ? -1 : tml.e[divContentAlignmentHorizontal.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 5;
                break;
            case 5:
                i = 8388613;
                break;
            case 6:
                i = 16777216;
                break;
            case 7:
                i = SelfTester_JCP.DECRYPT_CFB;
                break;
            case 8:
                i = SelfTester_JCP.DECRYPT_CBC;
                break;
        }
        int i2 = 48;
        switch (divContentAlignmentVertical != null ? tml.f[divContentAlignmentVertical.ordinal()] : -1) {
            case 2:
                i2 = 16;
                break;
            case 3:
                i2 = 80;
                break;
            case 4:
                i2 = SelfTester_JCP.IMITA;
                break;
            case 5:
                i2 = 536870912;
                break;
            case 6:
                i2 = 1073741824;
                break;
        }
        return i2 | i;
    }

    public static final List d(egk egkVar) {
        List b = egkVar.b();
        if (b != null) {
            return b;
        }
        DivVisibilityAction w = egkVar.w();
        List singletonList = w != null ? Collections.singletonList(w) : null;
        return singletonList == null ? EmptyList.a : singletonList;
    }

    public static final Interpolator e(DivAnimationInterpolator divAnimationInterpolator) {
        switch (tml.a[divAnimationInterpolator.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new EaseInterpolator();
            case 3:
                return new EaseInInterpolator();
            case 4:
                return new EaseOutInterpolator();
            case 5:
                return new EaseInOutInterpolator();
            case 6:
                return new SpringInterpolator();
            default:
                w511.b();
                return null;
        }
    }

    public static final cbl f(dbl dblVar, rvo rvoVar) {
        Object obj;
        Expression expression = dblVar.n;
        List list = dblVar.I;
        if (expression != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((cbl) obj).d, expression.a(rvoVar))) {
                    break;
                }
            }
            cbl cblVar = (cbl) obj;
            if (cblVar != null) {
                return cblVar;
            }
        }
        return (cbl) kotlin.collections.a.R(list);
    }

    public static final boolean g(egk egkVar) {
        if (egkVar.w() != null) {
            return true;
        }
        List b = egkVar.b();
        if (b != null && !b.isEmpty()) {
            return true;
        }
        List l = egkVar.l();
        return (l == null || l.isEmpty()) ? false : true;
    }

    public static final String h(m3k m3kVar) {
        egk d = m3kVar.d();
        return d instanceof ffl ? "text" : d instanceof psk ? "image" : d instanceof xrk ? "gif" : d instanceof DivSeparator ? "separator" : d instanceof DivIndicator ? "indicator" : d instanceof hal ? "slider" : d instanceof muk ? "input" : d instanceof ynl ? MediaStreamTrack.VIDEO_TRACK_KIND : d instanceof DivContainer ? "container" : d instanceof hsk ? "grid" : d instanceof dbl ? ClidProvider.STATE : d instanceof DivGallery ? "gallery" : d instanceof t1l ? "pager" : d instanceof mdl ? "tabs" : d instanceof clk ? "custom" : d instanceof x7l ? "select" : d instanceof ycl ? "switch" : "";
    }

    public static final boolean i(m3k m3kVar) {
        if ((m3kVar instanceof x2k) || (m3kVar instanceof n2k) || (m3kVar instanceof l2k) || (m3kVar instanceof s2k) || (m3kVar instanceof o2k) || (m3kVar instanceof t2k) || (m3kVar instanceof p2k) || (m3kVar instanceof j2k) || (m3kVar instanceof r2k) || (m3kVar instanceof y2k) || (m3kVar instanceof v2k)) {
            return false;
        }
        if ((m3kVar instanceof i2k) || (m3kVar instanceof m2k) || (m3kVar instanceof k2k) || (m3kVar instanceof q2k) || (m3kVar instanceof w2k) || (m3kVar instanceof u2k)) {
            return true;
        }
        w511.b();
        return false;
    }

    public static final boolean j(DivContainer divContainer, rvo rvoVar) {
        Expression expression;
        Expression expression2;
        Expression expression3 = divContainer.C;
        Expression expression4 = divContainer.I;
        if (expression3.a(rvoVar) == DivContainer.LayoutMode.WRAP && expression4.a(rvoVar) != DivContainer.Orientation.OVERLAP) {
            if (expression4.a(rvoVar) == DivContainer.Orientation.HORIZONTAL) {
                DivSize divSize = divContainer.c0;
                return !(divSize instanceof j9l) || ((expression2 = ((j9l) divSize).b.a) != null && ((Boolean) expression2.a(rvoVar)).booleanValue());
            }
            DivSize divSize2 = divContainer.v;
            if (!(divSize2 instanceof j9l) || ((expression = ((j9l) divSize2).b.a) != null && ((Boolean) expression.a(rvoVar)).booleanValue())) {
                return true;
            }
            afk afkVar = divContainer.i;
            if (afkVar != null) {
                return !(((float) ((Number) afkVar.a.a(rvoVar)).doubleValue()) == 0.0f);
            }
        }
        return false;
    }

    public static final DivAlignmentHorizontal k(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
        int i = tml.e[divContentAlignmentHorizontal.ordinal()];
        if (i == 1) {
            return DivAlignmentHorizontal.LEFT;
        }
        if (i == 2) {
            return DivAlignmentHorizontal.CENTER;
        }
        if (i == 3) {
            return DivAlignmentHorizontal.RIGHT;
        }
        if (i != 4 && i == 5) {
            return DivAlignmentHorizontal.END;
        }
        return DivAlignmentHorizontal.START;
    }

    public static final DivAlignmentVertical l(DivContentAlignmentVertical divContentAlignmentVertical) {
        int i = tml.f[divContentAlignmentVertical.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 7 ? DivAlignmentVertical.TOP : DivAlignmentVertical.BASELINE : DivAlignmentVertical.BOTTOM : DivAlignmentVertical.CENTER : DivAlignmentVertical.TOP;
    }

    public static final Drawable m(aok aokVar, DisplayMetrics displayMetrics, rvo rvoVar) {
        Float f;
        Expression expression;
        Float f2;
        float f3;
        float f4;
        Expression expression2;
        if (!(aokVar instanceof znk)) {
            w511.b();
            return null;
        }
        u8l u8lVar = ((znk) aokVar).b;
        t8l t8lVar = u8lVar.b;
        Expression expression3 = u8lVar.a;
        bcl bclVar = u8lVar.c;
        int i = 0;
        if (!(t8lVar instanceof s8l)) {
            if (!(t8lVar instanceof r8l)) {
                return null;
            }
            r8l r8lVar = (r8l) t8lVar;
            float K = com.yandex.div.core.view2.divs.a.K(r8lVar.c().b, displayMetrics, rvoVar);
            Expression expression4 = r8lVar.c().a;
            if (expression4 != null) {
                expression3 = expression4;
            }
            int intValue = ((Number) expression3.a(rvoVar)).intValue();
            bcl bclVar2 = r8lVar.c().c;
            if (bclVar2 == null) {
                bclVar2 = bclVar;
            }
            Integer num = (bclVar2 == null || (expression = bclVar2.a) == null) ? null : (Integer) expression.a(rvoVar);
            bcl bclVar3 = r8lVar.c().c;
            if (bclVar3 != null) {
                bclVar = bclVar3;
            }
            if (bclVar != null) {
                Number number = (Number) bclVar.d.a(rvoVar);
                int i2 = o05.a[((DivSizeUnit) bclVar.c.a(rvoVar)).ordinal()];
                if (i2 == 1) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 != 3) {
                    w511.b();
                    return null;
                }
                f = Float.valueOf(TypedValue.applyDimension(i, number != null ? number.floatValue() : 0.0f, displayMetrics));
            } else {
                f = null;
            }
            return new CircleDrawable(new jub(K, intValue, num, f));
        }
        k7l k7lVar = ((s8l) t8lVar).b;
        sqk sqkVar = k7lVar.d;
        bcl bclVar4 = k7lVar.e;
        float K2 = com.yandex.div.core.view2.divs.a.K(sqkVar, displayMetrics, rvoVar);
        float K3 = com.yandex.div.core.view2.divs.a.K(k7lVar.c, displayMetrics, rvoVar);
        Expression expression5 = k7lVar.a;
        if (expression5 != null) {
            expression3 = expression5;
        }
        int intValue2 = ((Number) expression3.a(rvoVar)).intValue();
        float K4 = com.yandex.div.core.view2.divs.a.K(k7lVar.b, displayMetrics, rvoVar);
        bcl bclVar5 = bclVar4 == null ? bclVar : bclVar4;
        Integer num2 = (bclVar5 == null || (expression2 = bclVar5.a) == null) ? null : (Integer) expression2.a(rvoVar);
        if (bclVar4 != null) {
            bclVar = bclVar4;
        }
        if (bclVar != null) {
            Number number2 = (Number) bclVar.d.a(rvoVar);
            int i3 = o05.a[((DivSizeUnit) bclVar.c.a(rvoVar)).ordinal()];
            if (i3 == 1) {
                i = 1;
            } else if (i3 == 2) {
                i = 2;
            } else if (i3 != 3) {
                w511.b();
                return null;
            }
            f2 = Float.valueOf(TypedValue.applyDimension(i, number2 != null ? number2.floatValue() : 0.0f, displayMetrics));
            f4 = K4;
            f3 = K3;
        } else {
            f2 = null;
            f3 = K3;
            f4 = K4;
        }
        return new RoundedRectDrawable(new oyk0(K2, f3, intValue2, f4, num2, f2));
    }

    public static final ArrayList n(List list, rvo rvoVar) {
        u06 t06Var;
        List<qpk> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (qpk qpkVar : list2) {
            if (qpkVar instanceof opk) {
                long longValue = ((Number) ((opk) qpkVar).c().a.a(rvoVar)).longValue();
                long j = longValue >> 31;
                t06Var = new s06((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            } else {
                if (!(qpkVar instanceof ppk)) {
                    w511.b();
                    return null;
                }
                t06Var = new t06();
            }
            arrayList.add(t06Var);
        }
        return arrayList;
    }

    public static final AspectImageView.Scale o(DivImageScale divImageScale) {
        int i = tml.h[divImageScale.ordinal()];
        if (i == 1) {
            return AspectImageView.Scale.NO_SCALE;
        }
        if (i == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (i == 3) {
            return AspectImageView.Scale.FILL;
        }
        if (i == 4) {
            return AspectImageView.Scale.STRETCH;
        }
        w511.b();
        return null;
    }

    public static final int p(DivSize divSize, DisplayMetrics displayMetrics, rvo rvoVar, ViewGroup.LayoutParams layoutParams) {
        if (divSize == null) {
            return -2;
        }
        if (divSize instanceof i9l) {
            return -1;
        }
        if (divSize instanceof h9l) {
            return com.yandex.div.core.view2.divs.a.H(((h9l) divSize).b, displayMetrics, rvoVar);
        }
        if (divSize instanceof j9l) {
            Expression expression = ((j9l) divSize).b.a;
            return (expression != null && ((Boolean) expression.a(rvoVar)).booleanValue() && (layoutParams instanceof DivLayoutParams)) ? -3 : -2;
        }
        w511.b();
        return 0;
    }

    public static final PorterDuff.Mode q(DivBlendMode divBlendMode) {
        switch (tml.g[divBlendMode.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                w511.b();
                return null;
        }
    }
}
