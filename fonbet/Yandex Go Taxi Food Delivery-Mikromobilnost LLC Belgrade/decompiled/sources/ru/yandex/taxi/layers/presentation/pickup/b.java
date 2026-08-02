package ru.yandex.taxi.layers.presentation.pickup;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import defpackage.ah00;
import defpackage.aqb0;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.dxu0;
import defpackage.f4c0;
import defpackage.g7h;
import defpackage.gh00;
import defpackage.gm6;
import defpackage.ike;
import defpackage.jm6;
import defpackage.jst;
import defpackage.nm6;
import defpackage.o400;
import defpackage.pdc;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.rl6;
import defpackage.sjh;
import defpackage.sxx;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xl6;
import defpackage.xm00;
import defpackage.xng0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.map_object.BubbleOrientation;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

/* loaded from: classes5.dex */
public final class b {
    public final ah00 a;
    public final sxx b;
    public final pdc c;
    public final Context d;
    public final f4c0 e;
    public final PickupPointBubbleView f;
    public final BubbleComponent g;
    public final g7h h;
    public final ike i;
    public pzt0 j;
    public final r0 k;
    public final r0 l;
    public final r0 m;
    public final r0 n;
    public final r0 o;
    public final r0 p;

    public b(ah00 ah00Var, xm00 xm00Var, sxx sxxVar, pdc pdcVar, tt2 tt2Var, Context context) {
        this.a = ah00Var;
        this.b = sxxVar;
        this.c = pdcVar;
        this.d = context;
        f4c0 f4c0Var = new f4c0(new Point(0.0d, 0.0d), null, 6);
        this.e = f4c0Var;
        PickupPointBubbleView pickupPointBubbleView = new PickupPointBubbleView(context, null, 0, 6, null);
        this.f = pickupPointBubbleView;
        BubbleComponent bubbleComponent = new BubbleComponent(context, null, 0, 6, null);
        this.g = bubbleComponent;
        g7h g7hVar = new g7h(context);
        this.h = g7hVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.i = bvf0.a(o400.a);
        this.k = bvf0.c("");
        this.l = bvf0.c(new Pair(PickupPointBubbleHandler$ImageType.UNKNOWN, ""));
        Boolean bool = Boolean.FALSE;
        this.m = bvf0.c(bool);
        this.n = bvf0.c(new aqb0(0));
        this.o = bvf0.c(bool);
        this.p = bvf0.c(bool);
        g7hVar.o(DefaultBubbleDecorator$Direction.UP);
        g7hVar.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
        g7hVar.b(new bdc(xng0.bgMain));
        bubbleComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bubbleComponent.setDecorator(bubbleComponent.getDecorator());
        bubbleComponent.addView(pickupPointBubbleView);
        f4c0Var.D(new IconStyle().setAnchor(new PointF(0.5f, -0.15f)));
        f4c0Var.i(false);
        xm00Var.getClass();
        f4c0Var.b(xm00Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(rl6 rl6Var, Point point, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        dxu0 dxu0Var;
        dxu0 dxu0Var2;
        dxu0 dxu0Var3;
        dxu0 dxu0Var4;
        dxu0 dxu0Var5;
        xl6 xl6Var;
        Object obj;
        xl6 xl6Var2;
        Object obj2;
        xl6 xl6Var3;
        Object obj3;
        xl6 xl6Var4;
        Object obj4;
        f4c0 f4c0Var = this.e;
        boolean z2 = false;
        if (rl6Var == null) {
            f4c0Var.i(false);
        }
        if (this.j == null) {
            this.j = tje.N(this.i, null, null, new PickupPointBubbleHandler$createRender$1(this, null), 3);
        }
        if (rl6Var != null) {
            List list = rl6Var.a;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj4 = null;
                        break;
                    } else {
                        obj4 = it.next();
                        if (((xl6) obj4) instanceof nm6) {
                            break;
                        }
                    }
                }
                xl6Var4 = (xl6) obj4;
            } else {
                xl6Var4 = null;
            }
            nm6 nm6Var = (nm6) xl6Var4;
            str = nm6Var != null ? nm6Var.a : null;
        }
        str = "";
        r0 r0Var = this.k;
        r0Var.getClass();
        r0Var.m(null, str);
        if (rl6Var != null) {
            List list2 = rl6Var.a;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    xl6 xl6Var5 = (xl6) obj3;
                    if ((xl6Var5 instanceof jm6) && (((jm6) xl6Var5).a instanceof FormattedText.d)) {
                        break;
                    }
                }
                xl6Var3 = (xl6) obj3;
            } else {
                xl6Var3 = null;
            }
            jm6 jm6Var = (jm6) xl6Var3;
            FormattedText.d dVar = (FormattedText.d) (jm6Var != null ? jm6Var.a : null);
            if (dVar != null) {
                str2 = dVar.a;
                if (rl6Var != null) {
                    List list3 = rl6Var.a;
                    if (list3 != null) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            xl6 xl6Var6 = (xl6) obj2;
                            if ((xl6Var6 instanceof jm6) && (((jm6) xl6Var6).a instanceof FormattedText.e)) {
                                break;
                            }
                        }
                        xl6Var2 = (xl6) obj2;
                    } else {
                        xl6Var2 = null;
                    }
                    jm6 jm6Var2 = (jm6) xl6Var2;
                    FormattedText.e eVar = (FormattedText.e) (jm6Var2 != null ? jm6Var2.a : null);
                    if (eVar != null) {
                        str3 = eVar.a;
                        if (rl6Var != null) {
                            List list4 = rl6Var.a;
                            if (list4 != null) {
                                Iterator it4 = list4.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it4.next();
                                        if (((xl6) obj) instanceof gm6) {
                                            break;
                                        }
                                    }
                                }
                                xl6Var = (xl6) obj;
                            } else {
                                xl6Var = null;
                            }
                            gm6 gm6Var = (gm6) xl6Var;
                            if (gm6Var != null) {
                                str4 = gm6Var.a;
                                Pair pair = str2 == null ? new Pair(PickupPointBubbleHandler$ImageType.IMAGE_TAG, str2) : str3 != null ? new Pair(PickupPointBubbleHandler$ImageType.IMAGE_URL, str3) : str4 != null ? new Pair(PickupPointBubbleHandler$ImageType.ICON, str4) : new Pair(PickupPointBubbleHandler$ImageType.UNKNOWN, "");
                                r0 r0Var2 = this.l;
                                r0Var2.getClass();
                                r0Var2.m(null, pair);
                                boolean z3 = ((rl6Var != null || (dxu0Var5 = rl6Var.k) == null) ? null : dxu0Var5.j) != BubbleOrientation.TOP;
                                qv10.B(z3, this.m, null);
                                DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction = !z3 ? DefaultBubbleDecorator$Direction.DOWN : DefaultBubbleDecorator$Direction.UP;
                                g7h g7hVar = this.h;
                                g7hVar.o(defaultBubbleDecorator$Direction);
                                g7hVar.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
                                String str5 = (rl6Var != null || (dxu0Var4 = rl6Var.k) == null) ? null : dxu0Var4.a;
                                String str6 = (rl6Var != null || (dxu0Var3 = rl6Var.k) == null) ? null : dxu0Var3.b;
                                if (rl6Var != null || (dxu0Var2 = rl6Var.k) == null || (r7 = dxu0Var2.i) == null) {
                                    BubbleStructure bubbleStructure = BubbleStructure.UNKNOWN;
                                }
                                aqb0 aqb0Var = new aqb0(str5, str6, bubbleStructure, (rl6Var != null || (dxu0Var = rl6Var.k) == null) ? null : dxu0Var.h);
                                r0 r0Var3 = this.n;
                                r0Var3.getClass();
                                r0Var3.m(null, aqb0Var);
                                if (rl6Var != null) {
                                    Float[] fArr = rl6Var.j;
                                    if (fArr == null || fArr.length != 2) {
                                        jst.e.k(new IllegalArgumentException(), "Pickup point bubble zooms are incorrect: " + (fArr != null ? Arrays.asList(fArr) : null));
                                    } else {
                                        float floatValue = fArr[0].floatValue();
                                        float floatValue2 = fArr[1].floatValue();
                                        float j = ((gh00) this.a).j();
                                        if (floatValue <= j && j <= floatValue2 && !z) {
                                            z2 = true;
                                        }
                                    }
                                }
                                Boolean valueOf = Boolean.valueOf(z2);
                                r0 r0Var4 = this.o;
                                r0Var4.getClass();
                                r0Var4.m(null, valueOf);
                                f4c0Var.o(point);
                                f4c0Var.k((rl6Var != null || (num = rl6Var.c) == null) ? 11.0f : num.intValue());
                            }
                        }
                        str4 = null;
                        if (str2 == null) {
                        }
                        r0 r0Var22 = this.l;
                        r0Var22.getClass();
                        r0Var22.m(null, pair);
                        if (((rl6Var != null || (dxu0Var5 = rl6Var.k) == null) ? null : dxu0Var5.j) != BubbleOrientation.TOP) {
                        }
                        qv10.B(z3, this.m, null);
                        if (!z3) {
                        }
                        g7h g7hVar2 = this.h;
                        g7hVar2.o(defaultBubbleDecorator$Direction);
                        g7hVar2.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
                        if (rl6Var != null) {
                        }
                        if (rl6Var != null) {
                        }
                        if (rl6Var != null) {
                        }
                        BubbleStructure bubbleStructure2 = BubbleStructure.UNKNOWN;
                        aqb0 aqb0Var2 = new aqb0(str5, str6, bubbleStructure2, (rl6Var != null || (dxu0Var = rl6Var.k) == null) ? null : dxu0Var.h);
                        r0 r0Var32 = this.n;
                        r0Var32.getClass();
                        r0Var32.m(null, aqb0Var2);
                        if (rl6Var != null) {
                        }
                        Boolean valueOf2 = Boolean.valueOf(z2);
                        r0 r0Var42 = this.o;
                        r0Var42.getClass();
                        r0Var42.m(null, valueOf2);
                        f4c0Var.o(point);
                        f4c0Var.k((rl6Var != null || (num = rl6Var.c) == null) ? 11.0f : num.intValue());
                    }
                }
                str3 = null;
                if (rl6Var != null) {
                }
                str4 = null;
                if (str2 == null) {
                }
                r0 r0Var222 = this.l;
                r0Var222.getClass();
                r0Var222.m(null, pair);
                if (((rl6Var != null || (dxu0Var5 = rl6Var.k) == null) ? null : dxu0Var5.j) != BubbleOrientation.TOP) {
                }
                qv10.B(z3, this.m, null);
                if (!z3) {
                }
                g7h g7hVar22 = this.h;
                g7hVar22.o(defaultBubbleDecorator$Direction);
                g7hVar22.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
                if (rl6Var != null) {
                }
                if (rl6Var != null) {
                }
                if (rl6Var != null) {
                }
                BubbleStructure bubbleStructure22 = BubbleStructure.UNKNOWN;
                aqb0 aqb0Var22 = new aqb0(str5, str6, bubbleStructure22, (rl6Var != null || (dxu0Var = rl6Var.k) == null) ? null : dxu0Var.h);
                r0 r0Var322 = this.n;
                r0Var322.getClass();
                r0Var322.m(null, aqb0Var22);
                if (rl6Var != null) {
                }
                Boolean valueOf22 = Boolean.valueOf(z2);
                r0 r0Var422 = this.o;
                r0Var422.getClass();
                r0Var422.m(null, valueOf22);
                f4c0Var.o(point);
                f4c0Var.k((rl6Var != null || (num = rl6Var.c) == null) ? 11.0f : num.intValue());
            }
        }
        str2 = null;
        if (rl6Var != null) {
        }
        str3 = null;
        if (rl6Var != null) {
        }
        str4 = null;
        if (str2 == null) {
        }
        r0 r0Var2222 = this.l;
        r0Var2222.getClass();
        r0Var2222.m(null, pair);
        if (((rl6Var != null || (dxu0Var5 = rl6Var.k) == null) ? null : dxu0Var5.j) != BubbleOrientation.TOP) {
        }
        qv10.B(z3, this.m, null);
        if (!z3) {
        }
        g7h g7hVar222 = this.h;
        g7hVar222.o(defaultBubbleDecorator$Direction);
        g7hVar222.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
        if (rl6Var != null) {
        }
        if (rl6Var != null) {
        }
        if (rl6Var != null) {
        }
        BubbleStructure bubbleStructure222 = BubbleStructure.UNKNOWN;
        aqb0 aqb0Var222 = new aqb0(str5, str6, bubbleStructure222, (rl6Var != null || (dxu0Var = rl6Var.k) == null) ? null : dxu0Var.h);
        r0 r0Var3222 = this.n;
        r0Var3222.getClass();
        r0Var3222.m(null, aqb0Var222);
        if (rl6Var != null) {
        }
        Boolean valueOf222 = Boolean.valueOf(z2);
        r0 r0Var4222 = this.o;
        r0Var4222.getClass();
        r0Var4222.m(null, valueOf222);
        f4c0Var.o(point);
        f4c0Var.k((rl6Var != null || (num = rl6Var.c) == null) ? 11.0f : num.intValue());
    }
}
