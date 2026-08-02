package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$LabelRenderingMode;
import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$PinStyle;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$LabelTypeface;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$TextAlignment;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes13.dex */
public final class zfc0 {
    public final Context a;
    public final tcc0 b;
    public final w040 c;
    public final w040 d;
    public final xv10 e;
    public final bu0 f;
    public final pwy0 g;
    public final odc0 h;
    public final i3y i = o(new sfc0(4));
    public final i3y j = o(new sfc0(8));
    public final i3y k = o(new sfc0(9));
    public final i3y l = o(new sfc0(10));
    public final i3y m = o(new sfc0(11));
    public final i3y n = o(new sfc0(12));
    public final i3y o = o(new sfc0(13));
    public final i3y p = o(new sfc0(5));
    public final i3y q = o(new sfc0(6));
    public final i3y r = o(new sfc0(7));
    public final i3y s;
    public final i3y t;
    public final i3y u;

    public zfc0(Context context, tcc0 tcc0Var, w040 w040Var, w040 w040Var2, xv10 xv10Var, bu0 bu0Var, pwy0 pwy0Var, odc0 odc0Var) {
        this.a = context;
        this.b = tcc0Var;
        this.c = w040Var;
        this.d = w040Var2;
        this.e = xv10Var;
        this.f = bu0Var;
        this.g = pwy0Var;
        this.h = odc0Var;
        final int i = 0;
        this.s = a.a(new sls(this) { // from class: xfc0
            public final /* synthetic */ zfc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                zfc0 zfc0Var = this.b;
                switch (i2) {
                    case 0:
                        Paint f = unr0.f(true);
                        f.setColor(qje.t(xng0.bgInvert, zfc0Var.a));
                        f.setStyle(Paint.Style.FILL);
                        return f;
                    case 1:
                        Paint f2 = unr0.f(true);
                        f2.setColor(qje.t(xng0.bgMain, zfc0Var.a));
                        f2.setStyle(Paint.Style.FILL);
                        return f2;
                    default:
                        return new ddc0(zfc0Var.a);
                }
            }
        });
        final int i2 = 1;
        this.t = a.a(new sls(this) { // from class: xfc0
            public final /* synthetic */ zfc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                zfc0 zfc0Var = this.b;
                switch (i22) {
                    case 0:
                        Paint f = unr0.f(true);
                        f.setColor(qje.t(xng0.bgInvert, zfc0Var.a));
                        f.setStyle(Paint.Style.FILL);
                        return f;
                    case 1:
                        Paint f2 = unr0.f(true);
                        f2.setColor(qje.t(xng0.bgMain, zfc0Var.a));
                        f2.setStyle(Paint.Style.FILL);
                        return f2;
                    default:
                        return new ddc0(zfc0Var.a);
                }
            }
        });
        final int i3 = 2;
        this.u = a.a(new sls(this) { // from class: xfc0
            public final /* synthetic */ zfc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                zfc0 zfc0Var = this.b;
                switch (i22) {
                    case 0:
                        Paint f = unr0.f(true);
                        f.setColor(qje.t(xng0.bgInvert, zfc0Var.a));
                        f.setStyle(Paint.Style.FILL);
                        return f;
                    case 1:
                        Paint f2 = unr0.f(true);
                        f2.setColor(qje.t(xng0.bgMain, zfc0Var.a));
                        f2.setStyle(Paint.Style.FILL);
                        return f2;
                    default:
                        return new ddc0(zfc0Var.a);
                }
            }
        });
    }

    public static Pair m(hn00 hn00Var) {
        fo00 fo00Var = hn00Var.h;
        if (fo00Var instanceof co00) {
            co00 co00Var = (co00) fo00Var;
            return new Pair(co00Var.d, co00Var.e);
        }
        if (fo00Var instanceof bo00) {
            bo00 bo00Var = (bo00) fo00Var;
            return new Pair(bo00Var.e, bo00Var.f);
        }
        if (fo00Var instanceof zn00) {
            zn00 zn00Var = (zn00) fo00Var;
            return new Pair(zn00Var.b, zn00Var.c);
        }
        if (!(fo00Var instanceof xn00)) {
            return new Pair(null, null);
        }
        xn00 xn00Var = (xn00) fo00Var;
        return new Pair(xn00Var.c, xn00Var.d);
    }

    public final i2c0 a(hn00 hn00Var, h5c0 h5c0Var) {
        Pair m = m(hn00Var);
        CharSequence charSequence = (CharSequence) m.getFirst();
        CharSequence charSequence2 = (CharSequence) m.getSecond();
        if ((charSequence == null || evu0.J(charSequence)) && (charSequence2 == null || evu0.J(charSequence2))) {
            return new i2c0(0, 0);
        }
        wcc0 i = i(hn00Var, charSequence, charSequence2, h5c0Var);
        return new i2c0(i.a, i.b);
    }

    public final yfc0 b(wcc0 wcc0Var) {
        int i;
        w040 w040Var = this.d;
        ofc0 ofc0Var = (ofc0) w040Var.b;
        int h = (w040Var.h() * 2) + ((int) (ofc0Var.a * 1.2f));
        int h2 = (w040Var.h() * 2) + ((int) (ofc0Var.b * 1.2f));
        i2c0 i2c0Var = new i2c0(h, h2);
        int i2 = (int) (4.0f * this.a.getResources().getDisplayMetrics().density);
        int l = l() + h2 + i2;
        if (wcc0Var != null) {
            int i3 = wcc0Var.b;
            h += wcc0Var.a;
            int max = Math.max(l, i3);
            r0 = i3 > l ? (i3 - l) / 2.0f : 0.0f;
            i = max;
        } else {
            i = l;
        }
        return new yfc0(i2c0Var, h, i, r0, i2);
    }

    public final i2c0 c() {
        xv10 xv10Var = this.e;
        i3y i3yVar = (i3y) xv10Var.c;
        int intValue = ((Number) i3yVar.getValue()).intValue();
        i3y i3yVar2 = (i3y) xv10Var.w;
        return new i2c0((((Number) i3yVar2.getValue()).intValue() * 2) + intValue, (l() * 2) + ((Number) this.q.getValue()).intValue() + (((Number) i3yVar2.getValue()).intValue() * 2) + ((Number) i3yVar.getValue()).intValue());
    }

    public final kn1 d() {
        i2c0 i = this.f.i(1.2f);
        int l = l() + ((Number) this.p.getValue()).intValue() + i.b;
        return new kn1(i, l, l() + l, 5);
    }

    public final Bitmap e(hn00 hn00Var, h5c0 h5c0Var) {
        Pair m = m(hn00Var);
        CharSequence charSequence = (CharSequence) m.getFirst();
        CharSequence charSequence2 = (CharSequence) m.getSecond();
        if ((charSequence == null || evu0.J(charSequence)) && (charSequence2 == null || evu0.J(charSequence2))) {
            return (Bitmap) this.b.c.getValue();
        }
        return ((ddc0) this.u.getValue()).b(i(hn00Var, charSequence, charSequence2, h5c0Var));
    }

    public final PointF f(hn00 hn00Var, h5c0 h5c0Var) {
        i2c0 j = j(hn00Var);
        int i = j.b;
        int i2 = j.a;
        if (i2 <= 0 || i <= 0) {
            return j5c0.a;
        }
        Pair m = m(hn00Var);
        CharSequence charSequence = (CharSequence) m.getFirst();
        CharSequence charSequence2 = (CharSequence) m.getSecond();
        if ((charSequence == null || evu0.J(charSequence)) && (charSequence2 == null || evu0.J(charSequence2))) {
            return j5c0.a;
        }
        wcc0 i3 = i(hn00Var, charSequence, charSequence2, h5c0Var);
        float f = i3.a;
        float f2 = i3.b;
        if (h5c0Var.equals(g5c0.b)) {
            return new PointF(-(f > 0.0f ? i2 / (f * 2.0f) : 0.5f), 0.5f);
        }
        if (h5c0Var.equals(f5c0.b)) {
            return new PointF((f > 0.0f ? i2 / (f * 2.0f) : 0.5f) + 1.0f, 0.5f);
        }
        if (h5c0Var.equals(e5c0.b)) {
            return new PointF(0.5f, -(f2 > 0.0f ? i / (f2 * 2.0f) : 0.5f));
        }
        w511.b();
        return null;
    }

    public final i2c0 g(hn00 hn00Var) {
        fo00 fo00Var = hn00Var.h;
        if (fo00Var instanceof co00) {
            w040 w040Var = this.c;
            w040Var.getClass();
            i3y i3yVar = (i3y) w040Var.e;
            i3y i3yVar2 = (i3y) w040Var.c;
            i3y i3yVar3 = (i3y) w040Var.d;
            if (((co00) fo00Var).f) {
                return new i2c0(((Number) i3yVar3.getValue()).intValue(), ((Number) i3yVar3.getValue()).intValue());
            }
            return new i2c0((((Number) i3yVar.getValue()).intValue() * 2) + ((Number) i3yVar2.getValue()).intValue(), (((Number) i3yVar.getValue()).intValue() * 2) + ((Number) i3yVar2.getValue()).intValue());
        }
        if (fo00Var instanceof bo00) {
            w040 w040Var2 = this.d;
            ofc0 ofc0Var = (ofc0) w040Var2.b;
            return new i2c0((w040Var2.h() * 2) + ofc0Var.a, (w040Var2.h() * 2) + ofc0Var.b);
        }
        if (!(fo00Var instanceof zn00)) {
            return fo00Var instanceof xn00 ? this.f.i(1.0f) : new i2c0(0, 0);
        }
        xv10 xv10Var = this.e;
        i3y i3yVar4 = (i3y) xv10Var.c;
        int intValue = ((Number) i3yVar4.getValue()).intValue();
        i3y i3yVar5 = (i3y) xv10Var.w;
        return new i2c0((((Number) i3yVar5.getValue()).intValue() * 2) + intValue, (((Number) i3yVar5.getValue()).intValue() * 2) + ((Number) i3yVar4.getValue()).intValue());
    }

    public final wcc0 h(hn00 hn00Var) {
        if (!n(hn00Var)) {
            return null;
        }
        fo00 fo00Var = hn00Var.h;
        if (fo00Var instanceof co00) {
            if (((co00) fo00Var).b == null) {
                return null;
            }
        } else if (!(fo00Var instanceof bo00) && !(fo00Var instanceof zn00) && !(fo00Var instanceof xn00)) {
            return null;
        }
        Pair m = m(hn00Var);
        CharSequence charSequence = (CharSequence) m.getFirst();
        CharSequence charSequence2 = (CharSequence) m.getSecond();
        if ((charSequence == null || evu0.J(charSequence)) && (charSequence2 == null || evu0.J(charSequence2))) {
            return null;
        }
        return i(hn00Var, charSequence, charSequence2, e5c0.b);
    }

    public final wcc0 i(hn00 hn00Var, CharSequence charSequence, CharSequence charSequence2, h5c0 h5c0Var) {
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment;
        bdc0 bdc0Var;
        fo00 fo00Var = hn00Var.h;
        boolean z = fo00Var instanceof bo00;
        int i = 1;
        boolean z2 = z || (fo00Var instanceof xn00);
        boolean z3 = (fo00Var instanceof co00) || (fo00Var instanceof zn00);
        if (h5c0Var.equals(f5c0.b)) {
            placesPinLabelBitmapCreator$TextAlignment = PlacesPinLabelBitmapCreator$TextAlignment.RIGHT;
        } else if (h5c0Var.equals(g5c0.b)) {
            placesPinLabelBitmapCreator$TextAlignment = PlacesPinLabelBitmapCreator$TextAlignment.LEFT;
        } else {
            if (!h5c0Var.equals(e5c0.b)) {
                w511.b();
                return null;
            }
            placesPinLabelBitmapCreator$TextAlignment = PlacesPinLabelBitmapCreator$TextAlignment.CENTER;
        }
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment2 = placesPinLabelBitmapCreator$TextAlignment;
        int i2 = 2;
        odc0 odc0Var = this.h;
        if (z) {
            boolean z4 = !((bo00) fo00Var).h;
            ndc0 ndc0Var = odc0Var.g;
            PlacesPinWarV2Config$PinStyle a = ndc0.a(fo00Var);
            if (a != null) {
                mdc0 mdc0Var = (mdc0) ndc0Var.a.get(a);
                Integer valueOf = mdc0Var != null ? Integer.valueOf(mdc0Var.a) : null;
                if (valueOf != null) {
                    i2 = valueOf.intValue();
                }
            }
            bdc0Var = new zcc0(i2, z4);
        } else if (fo00Var instanceof xn00) {
            boolean z5 = !((xn00) fo00Var).e;
            ndc0 ndc0Var2 = odc0Var.g;
            PlacesPinWarV2Config$PinStyle a2 = ndc0.a(fo00Var);
            if (a2 != null) {
                mdc0 mdc0Var2 = (mdc0) ndc0Var2.a.get(a2);
                Integer valueOf2 = mdc0Var2 != null ? Integer.valueOf(mdc0Var2.a) : null;
                if (valueOf2 != null) {
                    i2 = valueOf2.intValue();
                }
            }
            bdc0Var = new adc0(i2, z5);
        } else if (fo00Var instanceof zn00) {
            boolean z6 = !((zn00) fo00Var).d;
            ndc0 ndc0Var3 = odc0Var.g;
            PlacesPinWarV2Config$PinStyle a3 = ndc0.a(fo00Var);
            if (a3 != null) {
                mdc0 mdc0Var3 = (mdc0) ndc0Var3.a.get(a3);
                Integer valueOf3 = mdc0Var3 != null ? Integer.valueOf(mdc0Var3.a) : null;
                if (valueOf3 != null) {
                    i2 = valueOf3.intValue();
                }
            }
            bdc0Var = new adc0(i2, z6);
        } else {
            bdc0Var = ycc0.a;
        }
        bdc0 bdc0Var2 = bdc0Var;
        int i3 = (z2 || z3) ? eug0.discovery_map_pin_war_style_supermap_title_size : eug0.discovery_organizations_map_pin_title_size;
        int i4 = z2 ? eug0.discovery_map_pin_war_style_supermap_l_subtitle_size : z3 ? eug0.discovery_map_pin_war_style_supermap_m_subtitle_size : eug0.discovery_organizations_map_pin_subtitle_size;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface = (z2 || z3) ? PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondBold : PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondMedium;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface2 = z2 ? PlacesPinLabelBitmapCreator$LabelTypeface.TextMedium : z3 ? PlacesPinLabelBitmapCreator$LabelTypeface.TextBold : PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondRegular;
        int i5 = (z2 || z3) ? xng0.textMinor : xng0.textMain;
        int i6 = ((fo00Var instanceof xn00) || (fo00Var instanceof zn00)) ? eug0.discovery_map_pin_war_style_supermap_pin_max_width : eug0.discovery_organizations_map_pin_max_width;
        ddc0 ddc0Var = (ddc0) this.u.getValue();
        xcc0 xcc0Var = new xcc0(0, 0, 0, 0);
        Integer valueOf4 = (z2 || z3) ? Integer.valueOf(tje.r(eug0.discovery_map_pin_war_style_supermap_label_stroke_width, this.a)) : null;
        ndc0 ndc0Var4 = odc0Var.g;
        PlacesPinWarV2Config$PinStyle a4 = ndc0.a(fo00Var);
        if (a4 != null) {
            mdc0 mdc0Var4 = (mdc0) ndc0Var4.a.get(a4);
            Integer valueOf5 = mdc0Var4 != null ? Integer.valueOf(mdc0Var4.b) : null;
            if (valueOf5 != null) {
                i = valueOf5.intValue();
            }
        }
        return ddc0.d(ddc0Var, charSequence, charSequence2, placesPinLabelBitmapCreator$TextAlignment2, bdc0Var2, xcc0Var, i6, i3, i4, placesPinLabelBitmapCreator$LabelTypeface, placesPinLabelBitmapCreator$LabelTypeface2, i5, valueOf4, i, 8192);
    }

    public final i2c0 j(hn00 hn00Var) {
        i2c0 g = g(hn00Var);
        wcc0 h = h(hn00Var);
        if (h == null) {
            return g;
        }
        int i = g.a;
        int i2 = g.b;
        int i3 = h.a;
        int i4 = h.b;
        int intValue = ((Number) this.r.getValue()).intValue();
        this.b.getClass();
        scc0 d = tcc0.d(i, i2, i3, i4, intValue);
        return new i2c0(d.a, d.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wcc0 k(bo00 bo00Var) {
        CharSequence charSequence;
        int i;
        PlacesPinWarV2Config$PinStyle a;
        int i2;
        CharSequence charSequence2 = bo00Var.e;
        if ((charSequence2 == null || evu0.J(charSequence2)) && ((charSequence = bo00Var.f) == null || evu0.J(charSequence))) {
            return null;
        }
        ddc0 ddc0Var = (ddc0) this.u.getValue();
        CharSequence charSequence3 = bo00Var.e;
        CharSequence charSequence4 = bo00Var.f;
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment = PlacesPinLabelBitmapCreator$TextAlignment.LEFT;
        boolean z = !bo00Var.h;
        odc0 odc0Var = this.h;
        ndc0 ndc0Var = odc0Var.g;
        PlacesPinWarV2Config$PinStyle a2 = ndc0.a(bo00Var);
        if (a2 != null) {
            mdc0 mdc0Var = (mdc0) ndc0Var.a.get(a2);
            Integer valueOf = mdc0Var != null ? Integer.valueOf(mdc0Var.a) : null;
            if (valueOf != null) {
                i = valueOf.intValue();
                zcc0 zcc0Var = new zcc0(i, z);
                xcc0 xcc0Var = new xcc0(0, 0, 0, 0);
                ndc0 ndc0Var2 = odc0Var.g;
                a = ndc0.a(bo00Var);
                if (a != null) {
                    mdc0 mdc0Var2 = (mdc0) ndc0Var2.a.get(a);
                    Integer valueOf2 = mdc0Var2 != null ? Integer.valueOf(mdc0Var2.b) : null;
                    if (valueOf2 != null) {
                        i2 = valueOf2.intValue();
                        return ddc0.d(ddc0Var, charSequence3, charSequence4, placesPinLabelBitmapCreator$TextAlignment, zcc0Var, xcc0Var, 0, 0, 0, null, null, 0, null, i2, 12256);
                    }
                }
                i2 = 1;
                return ddc0.d(ddc0Var, charSequence3, charSequence4, placesPinLabelBitmapCreator$TextAlignment, zcc0Var, xcc0Var, 0, 0, 0, null, null, 0, null, i2, 12256);
            }
        }
        i = 2;
        zcc0 zcc0Var2 = new zcc0(i, z);
        xcc0 xcc0Var2 = new xcc0(0, 0, 0, 0);
        ndc0 ndc0Var22 = odc0Var.g;
        a = ndc0.a(bo00Var);
        if (a != null) {
        }
        i2 = 1;
        return ddc0.d(ddc0Var, charSequence3, charSequence4, placesPinLabelBitmapCreator$TextAlignment, zcc0Var2, xcc0Var2, 0, 0, 0, null, null, 0, null, i2, 12256);
    }

    public final int l() {
        return ((Number) this.n.getValue()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(hn00 hn00Var) {
        PlacesPinWarV2Config$LabelRenderingMode placesPinWarV2Config$LabelRenderingMode;
        ndc0 ndc0Var = this.h.g;
        PlacesPinWarV2Config$PinStyle a = ndc0.a(hn00Var.h);
        if (a != null) {
            mdc0 mdc0Var = (mdc0) ndc0Var.a.get(a);
            placesPinWarV2Config$LabelRenderingMode = mdc0Var != null ? mdc0Var.c : null;
        }
        placesPinWarV2Config$LabelRenderingMode = PlacesPinWarV2Config$LabelRenderingMode.INDEPENDENT_LABEL;
        return placesPinWarV2Config$LabelRenderingMode == PlacesPinWarV2Config$LabelRenderingMode.EMBEDDED_IN_ICON;
    }

    public final i3y o(sls slsVar) {
        return a.a(new xw90(29, this, slsVar));
    }
}
