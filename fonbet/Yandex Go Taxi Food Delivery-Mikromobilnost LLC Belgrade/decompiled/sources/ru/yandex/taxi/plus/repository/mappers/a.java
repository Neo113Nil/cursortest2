package ru.yandex.taxi.plus.repository.mappers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.bg20;
import defpackage.df20;
import defpackage.evu0;
import defpackage.g0k;
import defpackage.g16;
import defpackage.g1d0;
import defpackage.gf20;
import defpackage.gw00;
import defpackage.hf20;
import defpackage.hld0;
import defpackage.hoc0;
import defpackage.i0k;
import defpackage.ioc0;
import defpackage.ja20;
import defpackage.jf20;
import defpackage.jl40;
import defpackage.k0k;
import defpackage.kyh0;
import defpackage.l0d0;
import defpackage.m0d0;
import defpackage.m151;
import defpackage.mf20;
import defpackage.n0d0;
import defpackage.n151;
import defpackage.nf20;
import defpackage.noc0;
import defpackage.ny61;
import defpackage.o0d0;
import defpackage.o151;
import defpackage.ofe;
import defpackage.omy0;
import defpackage.ooc0;
import defpackage.p0d0;
import defpackage.pav;
import defpackage.pf20;
import defpackage.q0d0;
import defpackage.r2c;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sf20;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uf20;
import defpackage.w511;
import defpackage.wd20;
import defpackage.wf20;
import defpackage.wly0;
import defpackage.wwx0;
import defpackage.xf20;
import defpackage.ye20;
import defpackage.zf20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.plaque.api.models.PlaqueModel$TabletPlaqueModel$Notification$Position;
import ru.yandex.taxi.plus.api.dto.Action;
import ru.yandex.taxi.plus.api.dto.state.plaque.DisplayWidgetRules;
import ru.yandex.taxi.plus.api.dto.state.plaque.ElementLevelDto;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetDto;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;
import ru.yandex.taxi.plus.api.dto.state.plaque.x;
import ru.yandex.taxi.widget.i;

/* loaded from: classes6.dex */
public final class a {
    public final hld0 a;
    public final ru.yandex.taxi.widget.c b;
    public final pav c;
    public final wwx0 d;
    public final k0k e;

    public a(hld0 hld0Var, ru.yandex.taxi.widget.c cVar, pav pavVar, wwx0 wwx0Var, k0k k0kVar) {
        this.a = hld0Var;
        this.b = cVar;
        this.c = pavVar;
        this.d = wwx0Var;
        this.e = k0kVar;
    }

    public static ofe f(MicroWidgetDto.c cVar, Map map) {
        int i;
        if (cVar != null) {
            Boolean bool = cVar.a;
            if (bool == null) {
                i = 0;
            } else if (bool.equals(Boolean.TRUE)) {
                i = 1;
            } else if (bool.equals(Boolean.FALSE)) {
                i = 2;
            } else {
                w511.b();
            }
            return new ofe(i, i.a(cVar.b, map), i.a(cVar.c, map), null);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015a A[LOOP:0: B:14:0x0154->B:16:0x015a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r16v0, types: [ru.yandex.taxi.plus.repository.mappers.a] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MicroWidgetPlaqueDto microWidgetPlaqueDto, Map map, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$createBadge$1 microWidgetBadgeMapper$createBadge$1;
        int i;
        g0k b;
        q0d0 m0d0Var;
        Object h;
        String str;
        ArrayList arrayList;
        hoc0 hoc0Var;
        q0d0 q0d0Var;
        int d;
        MicroWidgetPlaqueDto microWidgetPlaqueDto2 = microWidgetPlaqueDto;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$createBadge$1) {
            microWidgetBadgeMapper$createBadge$1 = (MicroWidgetBadgeMapper$createBadge$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$createBadge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$createBadge$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$createBadge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$createBadge$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    df20 df20Var = microWidgetPlaqueDto2.c;
                    List list = microWidgetPlaqueDto2.b;
                    if (df20Var != null && microWidgetPlaqueDto2.d != null && !map.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            gf20 gf20Var = (gf20) map.get((String) it.next());
                            if (gf20Var != null) {
                                arrayList2.add(gf20Var);
                            }
                        }
                        if (arrayList2.size() == list.size()) {
                            String str2 = microWidgetPlaqueDto2.a;
                            b = this.e.b(microWidgetPlaqueDto2.f, false);
                            Action action = microWidgetPlaqueDto2.h;
                            Action.Type type = action.a;
                            List list2 = action.j;
                            switch (wd20.a[type.ordinal()]) {
                                case 1:
                                    String str3 = action.c;
                                    if (str3 != null) {
                                        m0d0Var = new m0d0(str3, list2);
                                        if (m0d0Var == null) {
                                            m0d0Var = new n0d0(null);
                                        }
                                        hoc0 hoc0Var2 = new hoc0(new Long((microWidgetPlaqueDto2.e.b != null ? r11.intValue() : 0) * 1000));
                                        MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto = microWidgetPlaqueDto2.k;
                                        microWidgetBadgeMapper$createBadge$1.L$0 = microWidgetPlaqueDto2;
                                        microWidgetBadgeMapper$createBadge$1.L$1 = null;
                                        microWidgetBadgeMapper$createBadge$1.L$2 = null;
                                        microWidgetBadgeMapper$createBadge$1.L$3 = str2;
                                        microWidgetBadgeMapper$createBadge$1.L$4 = arrayList2;
                                        microWidgetBadgeMapper$createBadge$1.L$5 = b;
                                        microWidgetBadgeMapper$createBadge$1.L$6 = m0d0Var;
                                        microWidgetBadgeMapper$createBadge$1.L$7 = hoc0Var2;
                                        microWidgetBadgeMapper$createBadge$1.label = 1;
                                        h = h(iconInCornerDto, microWidgetBadgeMapper$createBadge$1);
                                        if (h != coroutineSingletons) {
                                            str = str2;
                                            arrayList = arrayList2;
                                            hoc0Var = hoc0Var2;
                                            q0d0Var = m0d0Var;
                                            obj = h;
                                            break;
                                        }
                                    }
                                    m0d0Var = null;
                                    if (m0d0Var == null) {
                                    }
                                    hoc0 hoc0Var22 = new hoc0(new Long((microWidgetPlaqueDto2.e.b != null ? r11.intValue() : 0) * 1000));
                                    MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto2 = microWidgetPlaqueDto2.k;
                                    microWidgetBadgeMapper$createBadge$1.L$0 = microWidgetPlaqueDto2;
                                    microWidgetBadgeMapper$createBadge$1.L$1 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$2 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$3 = str2;
                                    microWidgetBadgeMapper$createBadge$1.L$4 = arrayList2;
                                    microWidgetBadgeMapper$createBadge$1.L$5 = b;
                                    microWidgetBadgeMapper$createBadge$1.L$6 = m0d0Var;
                                    microWidgetBadgeMapper$createBadge$1.L$7 = hoc0Var22;
                                    microWidgetBadgeMapper$createBadge$1.label = 1;
                                    h = h(iconInCornerDto2, microWidgetBadgeMapper$createBadge$1);
                                    if (h != coroutineSingletons) {
                                    }
                                    break;
                                case 2:
                                    String str4 = action.b;
                                    if (str4 != null) {
                                        m0d0Var = new p0d0(str4, action.f);
                                        if (m0d0Var == null) {
                                        }
                                        hoc0 hoc0Var222 = new hoc0(new Long((microWidgetPlaqueDto2.e.b != null ? r11.intValue() : 0) * 1000));
                                        MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto22 = microWidgetPlaqueDto2.k;
                                        microWidgetBadgeMapper$createBadge$1.L$0 = microWidgetPlaqueDto2;
                                        microWidgetBadgeMapper$createBadge$1.L$1 = null;
                                        microWidgetBadgeMapper$createBadge$1.L$2 = null;
                                        microWidgetBadgeMapper$createBadge$1.L$3 = str2;
                                        microWidgetBadgeMapper$createBadge$1.L$4 = arrayList2;
                                        microWidgetBadgeMapper$createBadge$1.L$5 = b;
                                        microWidgetBadgeMapper$createBadge$1.L$6 = m0d0Var;
                                        microWidgetBadgeMapper$createBadge$1.L$7 = hoc0Var222;
                                        microWidgetBadgeMapper$createBadge$1.label = 1;
                                        h = h(iconInCornerDto22, microWidgetBadgeMapper$createBadge$1);
                                        if (h != coroutineSingletons) {
                                        }
                                    }
                                    m0d0Var = null;
                                    if (m0d0Var == null) {
                                    }
                                    hoc0 hoc0Var2222 = new hoc0(new Long((microWidgetPlaqueDto2.e.b != null ? r11.intValue() : 0) * 1000));
                                    MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto222 = microWidgetPlaqueDto2.k;
                                    microWidgetBadgeMapper$createBadge$1.L$0 = microWidgetPlaqueDto2;
                                    microWidgetBadgeMapper$createBadge$1.L$1 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$2 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$3 = str2;
                                    microWidgetBadgeMapper$createBadge$1.L$4 = arrayList2;
                                    microWidgetBadgeMapper$createBadge$1.L$5 = b;
                                    microWidgetBadgeMapper$createBadge$1.L$6 = m0d0Var;
                                    microWidgetBadgeMapper$createBadge$1.L$7 = hoc0Var2222;
                                    microWidgetBadgeMapper$createBadge$1.label = 1;
                                    h = h(iconInCornerDto222, microWidgetBadgeMapper$createBadge$1);
                                    if (h != coroutineSingletons) {
                                    }
                                    break;
                                case 3:
                                    String str5 = action.g;
                                    if (str5 != null) {
                                        m0d0Var = new o0d0(str5, list2, action.k);
                                        if (m0d0Var == null) {
                                        }
                                        hoc0 hoc0Var22222 = new hoc0(new Long((microWidgetPlaqueDto2.e.b != null ? r11.intValue() : 0) * 1000));
                                        MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto2222 = microWidgetPlaqueDto2.k;
                                        microWidgetBadgeMapper$createBadge$1.L$0 = microWidgetPlaqueDto2;
                                        microWidgetBadgeMapper$createBadge$1.L$1 = null;
                                        microWidgetBadgeMapper$createBadge$1.L$2 = null;
                                        microWidgetBadgeMapper$createBadge$1.L$3 = str2;
                                        microWidgetBadgeMapper$createBadge$1.L$4 = arrayList2;
                                        microWidgetBadgeMapper$createBadge$1.L$5 = b;
                                        microWidgetBadgeMapper$createBadge$1.L$6 = m0d0Var;
                                        microWidgetBadgeMapper$createBadge$1.L$7 = hoc0Var22222;
                                        microWidgetBadgeMapper$createBadge$1.label = 1;
                                        h = h(iconInCornerDto2222, microWidgetBadgeMapper$createBadge$1);
                                        if (h != coroutineSingletons) {
                                        }
                                    }
                                    m0d0Var = null;
                                    if (m0d0Var == null) {
                                    }
                                    hoc0 hoc0Var222222 = new hoc0(new Long((microWidgetPlaqueDto2.e.b != null ? r11.intValue() : 0) * 1000));
                                    MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto22222 = microWidgetPlaqueDto2.k;
                                    microWidgetBadgeMapper$createBadge$1.L$0 = microWidgetPlaqueDto2;
                                    microWidgetBadgeMapper$createBadge$1.L$1 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$2 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$3 = str2;
                                    microWidgetBadgeMapper$createBadge$1.L$4 = arrayList2;
                                    microWidgetBadgeMapper$createBadge$1.L$5 = b;
                                    microWidgetBadgeMapper$createBadge$1.L$6 = m0d0Var;
                                    microWidgetBadgeMapper$createBadge$1.L$7 = hoc0Var222222;
                                    microWidgetBadgeMapper$createBadge$1.label = 1;
                                    h = h(iconInCornerDto22222, microWidgetBadgeMapper$createBadge$1);
                                    if (h != coroutineSingletons) {
                                    }
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    m0d0Var = null;
                                    if (m0d0Var == null) {
                                    }
                                    hoc0 hoc0Var2222222 = new hoc0(new Long((microWidgetPlaqueDto2.e.b != null ? r11.intValue() : 0) * 1000));
                                    MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto222222 = microWidgetPlaqueDto2.k;
                                    microWidgetBadgeMapper$createBadge$1.L$0 = microWidgetPlaqueDto2;
                                    microWidgetBadgeMapper$createBadge$1.L$1 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$2 = null;
                                    microWidgetBadgeMapper$createBadge$1.L$3 = str2;
                                    microWidgetBadgeMapper$createBadge$1.L$4 = arrayList2;
                                    microWidgetBadgeMapper$createBadge$1.L$5 = b;
                                    microWidgetBadgeMapper$createBadge$1.L$6 = m0d0Var;
                                    microWidgetBadgeMapper$createBadge$1.L$7 = hoc0Var2222222;
                                    microWidgetBadgeMapper$createBadge$1.label = 1;
                                    h = h(iconInCornerDto222222, microWidgetBadgeMapper$createBadge$1);
                                    if (h != coroutineSingletons) {
                                    }
                                    break;
                                default:
                                    w511.b();
                                    break;
                            }
                            return null;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hoc0 hoc0Var3 = (hoc0) microWidgetBadgeMapper$createBadge$1.L$7;
                q0d0 q0d0Var2 = (q0d0) microWidgetBadgeMapper$createBadge$1.L$6;
                g0k g0kVar = (g0k) microWidgetBadgeMapper$createBadge$1.L$5;
                ?? r5 = (List) microWidgetBadgeMapper$createBadge$1.L$4;
                String str6 = (String) microWidgetBadgeMapper$createBadge$1.L$3;
                MicroWidgetPlaqueDto microWidgetPlaqueDto3 = (MicroWidgetPlaqueDto) microWidgetBadgeMapper$createBadge$1.L$0;
                kotlin.b.b(obj);
                q0d0Var = q0d0Var2;
                microWidgetPlaqueDto2 = microWidgetPlaqueDto3;
                str = str6;
                b = g0kVar;
                arrayList = r5;
                hoc0Var = hoc0Var3;
                ioc0 ioc0Var = new ioc0(str, arrayList, b, q0d0Var, hoc0Var, (ooc0) obj);
                df20 df20Var2 = microWidgetPlaqueDto2.c;
                int intValue = microWidgetPlaqueDto2.d.intValue();
                List<ja20> list3 = microWidgetPlaqueDto2.g;
                d = gw00.d(tcc.n(list3, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (ja20 ja20Var : list3) {
                    Pair pair = new Pair(ja20Var.a, ja20Var.b);
                    linkedHashMap.put(pair.c(), pair.f());
                }
                return new g1d0(ioc0Var, linkedHashMap, df20Var2, intValue, microWidgetPlaqueDto2.i, microWidgetPlaqueDto2.j);
            }
        }
        microWidgetBadgeMapper$createBadge$1 = new MicroWidgetBadgeMapper$createBadge$1(this, continuationImpl);
        Object obj2 = microWidgetBadgeMapper$createBadge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$createBadge$1.label;
        if (i != 0) {
        }
        ioc0 ioc0Var2 = new ioc0(str, arrayList, b, q0d0Var, hoc0Var, (ooc0) obj2);
        df20 df20Var22 = microWidgetPlaqueDto2.c;
        int intValue2 = microWidgetPlaqueDto2.d.intValue();
        List<ja20> list32 = microWidgetPlaqueDto2.g;
        d = gw00.d(tcc.n(list32, 10));
        if (d < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
        while (r0.hasNext()) {
        }
        return new g1d0(ioc0Var2, linkedHashMap2, df20Var22, intValue2, microWidgetPlaqueDto2.i, microWidgetPlaqueDto2.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$loadImageFromUrl$1 microWidgetBadgeMapper$loadImageFromUrl$1;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$loadImageFromUrl$1) {
            microWidgetBadgeMapper$loadImageFromUrl$1 = (MicroWidgetBadgeMapper$loadImageFromUrl$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$loadImageFromUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$loadImageFromUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$loadImageFromUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$loadImageFromUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g16 b = this.c.b().b(str);
                    microWidgetBadgeMapper$loadImageFromUrl$1.L$0 = null;
                    microWidgetBadgeMapper$loadImageFromUrl$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(b, microWidgetBadgeMapper$loadImageFromUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return null;
                }
                hld0 hld0Var = this.a;
                hld0Var.getClass();
                return new BitmapDrawable(hld0Var.a.getResources(), bitmap);
            }
        }
        microWidgetBadgeMapper$loadImageFromUrl$1 = new MicroWidgetBadgeMapper$loadImageFromUrl$1(this, continuationImpl);
        Object obj2 = microWidgetBadgeMapper$loadImageFromUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$loadImageFromUrl$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0524, code lost:
    
        if (r1 == r8) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r0v11, types: [ru.yandex.taxi.plus.repository.mappers.a] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r32v0, types: [ru.yandex.taxi.plus.repository.mappers.a] */
    /* JADX WARN: Type inference failed for: r34v1, types: [q0d0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [wwx0] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0524 -> B:11:0x0527). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x02ff -> B:25:0x0302). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(e0 e0Var, Map map, r2c r2cVar, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$mapBadges$1 microWidgetBadgeMapper$mapBadges$1;
        int i;
        LinkedHashMap linkedHashMap;
        r2c r2cVar2;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        e0 e0Var2;
        Iterator it;
        MicroWidgetBadgeMapper$mapBadges$1 microWidgetBadgeMapper$mapBadges$12;
        Map map2;
        a aVar;
        boolean hasNext;
        Iterator it2;
        Collection collection;
        Map map3;
        q0d0 m0d0Var;
        q0d0 q0d0Var;
        gf20 gf20Var;
        Object obj;
        List list;
        Iterator it3;
        MicroWidgetBadgeMapper$mapBadges$1 microWidgetBadgeMapper$mapBadges$13;
        q0d0 m0d0Var2;
        q0d0 p0d0Var;
        mf20 mf20Var;
        LinkedHashMap linkedHashMap4;
        r2c r2cVar3;
        a aVar2;
        a aVar3;
        List list2;
        LinkedHashMap linkedHashMap5;
        Map map4;
        int[] iArr;
        Object m0d0Var3;
        a aVar4;
        a aVar5 = this;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$mapBadges$1) {
            microWidgetBadgeMapper$mapBadges$1 = (MicroWidgetBadgeMapper$mapBadges$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$mapBadges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$mapBadges$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = microWidgetBadgeMapper$mapBadges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$mapBadges$1.label;
                int i3 = 1;
                ?? r11 = 0;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    linkedHashMap = new LinkedHashMap();
                    r2cVar2 = r2cVar;
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap3 = new LinkedHashMap();
                    e0Var2 = e0Var;
                    it = e0Var.a.iterator();
                    microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$1;
                    map2 = map;
                    aVar = aVar5;
                    hasNext = it.hasNext();
                    ?? r4 = aVar.d;
                    EmptyList emptyList = EmptyList.a;
                    k0k k0kVar = aVar.e;
                    if (hasNext) {
                    }
                } else if (i == 1) {
                    Iterator it4 = (Iterator) microWidgetBadgeMapper$mapBadges$1.L$7;
                    ?? r42 = (Map) microWidgetBadgeMapper$mapBadges$1.L$5;
                    ?? r5 = (Map) microWidgetBadgeMapper$mapBadges$1.L$4;
                    ?? r6 = (Map) microWidgetBadgeMapper$mapBadges$1.L$3;
                    r2cVar2 = (r2c) microWidgetBadgeMapper$mapBadges$1.L$2;
                    Map map5 = (Map) microWidgetBadgeMapper$mapBadges$1.L$1;
                    e0 e0Var3 = (e0) microWidgetBadgeMapper$mapBadges$1.L$0;
                    kotlin.b.b(obj2);
                    MicroWidgetBadgeMapper$mapBadges$1 microWidgetBadgeMapper$mapBadges$14 = microWidgetBadgeMapper$mapBadges$1;
                    map2 = map5;
                    e0Var2 = e0Var3;
                    it = it4;
                    linkedHashMap3 = r42;
                    linkedHashMap2 = r5;
                    Object obj3 = null;
                    a aVar6 = aVar5;
                    LinkedHashMap linkedHashMap6 = r6;
                    sf20 sf20Var = (sf20) obj2;
                    if (sf20Var != null) {
                        linkedHashMap6.put(sf20Var.b(), sf20Var);
                    }
                    linkedHashMap = linkedHashMap6;
                    r11 = obj3;
                    i3 = 1;
                    microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$14;
                    aVar = aVar6;
                    hasNext = it.hasNext();
                    ?? r43 = aVar.d;
                    EmptyList emptyList2 = EmptyList.a;
                    k0k k0kVar2 = aVar.e;
                    if (hasNext) {
                        MicroWidgetDto microWidgetDto = (MicroWidgetDto) it.next();
                        microWidgetBadgeMapper$mapBadges$12.L$0 = e0Var2;
                        microWidgetBadgeMapper$mapBadges$12.L$1 = map2;
                        microWidgetBadgeMapper$mapBadges$12.L$2 = r2cVar2;
                        microWidgetBadgeMapper$mapBadges$12.L$3 = linkedHashMap;
                        microWidgetBadgeMapper$mapBadges$12.L$4 = linkedHashMap2;
                        microWidgetBadgeMapper$mapBadges$12.L$5 = linkedHashMap3;
                        microWidgetBadgeMapper$mapBadges$12.L$6 = r11;
                        microWidgetBadgeMapper$mapBadges$12.L$7 = it;
                        microWidgetBadgeMapper$mapBadges$12.L$8 = r11;
                        microWidgetBadgeMapper$mapBadges$12.L$9 = r11;
                        microWidgetBadgeMapper$mapBadges$12.label = i3;
                        String str = microWidgetDto.a;
                        MicroWidgetDto.Type type = microWidgetDto.c;
                        if (str.length() == 0 || type == null) {
                            r43.c("MicroWidgetBadgeMapper:INCORRECT_MICRO_WIDGET", "Incorrect micro widget with id=" + str + " type=" + type, r11);
                        } else if (sb2.N(microWidgetDto.e, map2)) {
                            MicroWidgetDto.c cVar = microWidgetDto.k;
                            if (cVar == null || (list2 = cVar.d) == null) {
                                list2 = emptyList2;
                            }
                            if (sb2.N(list2, map2)) {
                                int[] iArr2 = ye20.a;
                                obj3 = r11;
                                boolean z = iArr2[type.ordinal()] == 1;
                                if (type != MicroWidgetDto.Type.SWITCH || r2cVar2 == null) {
                                    linkedHashMap5 = linkedHashMap;
                                    map4 = map2;
                                    Action action = microWidgetDto.d;
                                    Action.Type type2 = action.a;
                                    List list3 = action.j;
                                    switch (wd20.a[type2.ordinal()]) {
                                        case 1:
                                            iArr = iArr2;
                                            String str2 = action.c;
                                            if (str2 != null) {
                                                m0d0Var3 = new m0d0(str2, list3);
                                                break;
                                            }
                                            m0d0Var3 = obj3;
                                            break;
                                        case 2:
                                            iArr = iArr2;
                                            String str3 = action.b;
                                            if (str3 != null) {
                                                m0d0Var3 = new p0d0(str3, action.f);
                                                break;
                                            }
                                            m0d0Var3 = obj3;
                                            break;
                                        case 3:
                                            String str4 = action.g;
                                            if (str4 != null) {
                                                iArr = iArr2;
                                                m0d0Var3 = new o0d0(str4, list3, action.k);
                                                break;
                                            }
                                        case 4:
                                        case 5:
                                        case 6:
                                            iArr = iArr2;
                                            m0d0Var3 = obj3;
                                            break;
                                        default:
                                            w511.b();
                                            return obj3;
                                    }
                                } else {
                                    linkedHashMap5 = linkedHashMap;
                                    map4 = map2;
                                    iArr = iArr2;
                                    m0d0Var3 = new l0d0(r2cVar2.a, r2cVar2.b);
                                }
                                DisplayWidgetRules displayWidgetRules = microWidgetDto.b;
                                k0kVar2.getClass();
                                g0k b = k0kVar2.b(displayWidgetRules.a, z);
                                n151 n151Var = omy0.c;
                                ?? r34 = m0d0Var3;
                                int i4 = i0k.c[displayWidgetRules.b.ordinal()];
                                MicroWidgetBadgeMapper$mapBadges$1 microWidgetBadgeMapper$mapBadges$15 = microWidgetBadgeMapper$mapBadges$12;
                                if (i4 == 1) {
                                    n151Var = wly0.w;
                                } else if (i4 != 2) {
                                    if (i4 != 3) {
                                        w511.b();
                                        return obj3;
                                    }
                                    if (displayWidgetRules.c != null) {
                                        n151Var = new m151(tje.x(k0kVar2.a.a, r4.intValue()));
                                    }
                                }
                                String str5 = displayWidgetRules.d;
                                int i5 = !jl40.l(str5, "LEFT") ? jl40.l(str5, "RIGHT") ? 8388613 : 1 : 8388611;
                                String str6 = displayWidgetRules.e;
                                o151 o151Var = new o151(b, n151Var, (!jl40.l(str6, "TOP") ? jl40.l(str6, "BOTTOM") ? 80 : 16 : 48) | i5);
                                switch (iArr[type.ordinal()]) {
                                    case 1:
                                        linkedHashMap4 = linkedHashMap5;
                                        r2cVar3 = r2cVar2;
                                        map2 = map4;
                                        microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$15;
                                        MicroWidgetDto.b bVar = microWidgetDto.h;
                                        if (bVar != null) {
                                            ?? r0 = this;
                                            obj2 = r0.e(bVar, map2, microWidgetDto.a, r34, o151Var, microWidgetBadgeMapper$mapBadges$12);
                                            aVar2 = r0;
                                            if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                obj2 = (jf20) obj2;
                                                aVar2 = r0;
                                            }
                                            if (obj2 != coroutineSingletons) {
                                                microWidgetBadgeMapper$mapBadges$14 = microWidgetBadgeMapper$mapBadges$12;
                                                linkedHashMap6 = linkedHashMap4;
                                                r2cVar2 = r2cVar3;
                                                aVar6 = aVar2;
                                                sf20 sf20Var2 = (sf20) obj2;
                                                if (sf20Var2 != null) {
                                                }
                                                linkedHashMap = linkedHashMap6;
                                                r11 = obj3;
                                                i3 = 1;
                                                microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$14;
                                                aVar = aVar6;
                                                hasNext = it.hasNext();
                                                ?? r432 = aVar.d;
                                                EmptyList emptyList22 = EmptyList.a;
                                                k0k k0kVar22 = aVar.e;
                                                if (hasNext) {
                                                    LinkedHashMap linkedHashMap7 = linkedHashMap;
                                                    Throwable th = r11;
                                                    Iterator it5 = e0Var2.d.iterator();
                                                    while (it5.hasNext()) {
                                                        x xVar = (x) it5.next();
                                                        String str7 = xVar.a;
                                                        List list4 = xVar.b;
                                                        MicroWidgetDto.c cVar2 = xVar.e;
                                                        if (str7.length() == 0) {
                                                            r432.c("MicroWidgetBadgeMapper:INCORRECT_GROUP", "Incorrect micro widget group id", th);
                                                        } else {
                                                            if (cVar2 == null || (list = cVar2.d) == null) {
                                                                list = emptyList22;
                                                            }
                                                            if (sb2.N(list, map2)) {
                                                                ArrayList arrayList = new ArrayList();
                                                                Iterator it6 = list4.iterator();
                                                                while (it6.hasNext()) {
                                                                    Iterator it7 = it5;
                                                                    sf20 sf20Var3 = (sf20) linkedHashMap7.get((String) it6.next());
                                                                    if (sf20Var3 != null) {
                                                                        arrayList.add(sf20Var3);
                                                                    }
                                                                    it5 = it7;
                                                                }
                                                                it3 = it5;
                                                                if (arrayList.size() == list4.size()) {
                                                                    String str8 = xVar.a;
                                                                    Action action2 = xVar.c;
                                                                    Action.Type type3 = action2.a;
                                                                    List list5 = action2.j;
                                                                    switch (wd20.a[type3.ordinal()]) {
                                                                        case 1:
                                                                            microWidgetBadgeMapper$mapBadges$13 = microWidgetBadgeMapper$mapBadges$12;
                                                                            String str9 = action2.c;
                                                                            if (str9 != null) {
                                                                                m0d0Var2 = new m0d0(str9, list5);
                                                                                mf20Var = new mf20(str8, m0d0Var2, k0kVar22.b(xVar.d, false), arrayList, f(cVar2, map2));
                                                                                if (mf20Var == null) {
                                                                                    linkedHashMap2.put(mf20Var.a, mf20Var);
                                                                                }
                                                                                it5 = it3;
                                                                                microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                                                th = null;
                                                                            }
                                                                            m0d0Var2 = null;
                                                                            mf20Var = new mf20(str8, m0d0Var2, k0kVar22.b(xVar.d, false), arrayList, f(cVar2, map2));
                                                                            if (mf20Var == null) {
                                                                            }
                                                                            it5 = it3;
                                                                            microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                                            th = null;
                                                                        case 2:
                                                                            microWidgetBadgeMapper$mapBadges$13 = microWidgetBadgeMapper$mapBadges$12;
                                                                            String str10 = action2.b;
                                                                            if (str10 != null) {
                                                                                p0d0Var = new p0d0(str10, action2.f);
                                                                                m0d0Var2 = p0d0Var;
                                                                                mf20Var = new mf20(str8, m0d0Var2, k0kVar22.b(xVar.d, false), arrayList, f(cVar2, map2));
                                                                                if (mf20Var == null) {
                                                                                }
                                                                                it5 = it3;
                                                                                microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                                                th = null;
                                                                            }
                                                                            m0d0Var2 = null;
                                                                            mf20Var = new mf20(str8, m0d0Var2, k0kVar22.b(xVar.d, false), arrayList, f(cVar2, map2));
                                                                            if (mf20Var == null) {
                                                                            }
                                                                            it5 = it3;
                                                                            microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                                            th = null;
                                                                            break;
                                                                        case 3:
                                                                            String str11 = action2.g;
                                                                            if (str11 != null) {
                                                                                microWidgetBadgeMapper$mapBadges$13 = microWidgetBadgeMapper$mapBadges$12;
                                                                                p0d0Var = new o0d0(str11, list5, action2.k);
                                                                                m0d0Var2 = p0d0Var;
                                                                                mf20Var = new mf20(str8, m0d0Var2, k0kVar22.b(xVar.d, false), arrayList, f(cVar2, map2));
                                                                                if (mf20Var == null) {
                                                                                }
                                                                                it5 = it3;
                                                                                microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                                                th = null;
                                                                            }
                                                                            break;
                                                                        case 4:
                                                                        case 5:
                                                                        case 6:
                                                                            microWidgetBadgeMapper$mapBadges$13 = microWidgetBadgeMapper$mapBadges$12;
                                                                            m0d0Var2 = null;
                                                                            mf20Var = new mf20(str8, m0d0Var2, k0kVar22.b(xVar.d, false), arrayList, f(cVar2, map2));
                                                                            if (mf20Var == null) {
                                                                            }
                                                                            it5 = it3;
                                                                            microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                                            th = null;
                                                                            break;
                                                                        default:
                                                                            w511.b();
                                                                            return null;
                                                                    }
                                                                }
                                                                microWidgetBadgeMapper$mapBadges$13 = microWidgetBadgeMapper$mapBadges$12;
                                                                mf20Var = null;
                                                                if (mf20Var == null) {
                                                                }
                                                                it5 = it3;
                                                                microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                                th = null;
                                                            }
                                                        }
                                                        it3 = it5;
                                                        microWidgetBadgeMapper$mapBadges$13 = microWidgetBadgeMapper$mapBadges$12;
                                                        mf20Var = null;
                                                        if (mf20Var == null) {
                                                        }
                                                        it5 = it3;
                                                        microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$13;
                                                        th = null;
                                                    }
                                                    MicroWidgetBadgeMapper$mapBadges$1 microWidgetBadgeMapper$mapBadges$16 = microWidgetBadgeMapper$mapBadges$12;
                                                    for (e0.a aVar7 : e0Var2.c) {
                                                        String str12 = aVar7.a;
                                                        List<ElementLevelDto> list6 = aVar7.b;
                                                        if (str12.length() == 0) {
                                                            r432.c("MicroWidgetBadgeMapper:INCORRECT_LEVEL", "Incorrect micro widget level id", null);
                                                            gf20Var = null;
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            for (ElementLevelDto elementLevelDto : list6) {
                                                                int i6 = ye20.b[elementLevelDto.a.ordinal()];
                                                                if (i6 != 1) {
                                                                    if (i6 == 2) {
                                                                        String str13 = elementLevelDto.c;
                                                                        if (str13 != null) {
                                                                            obj = (mf20) linkedHashMap2.get(str13);
                                                                            if (obj == null) {
                                                                                arrayList2.add(obj);
                                                                            }
                                                                        }
                                                                    } else if (i6 != 3) {
                                                                        w511.b();
                                                                        return null;
                                                                    }
                                                                    obj = null;
                                                                    if (obj == null) {
                                                                    }
                                                                } else {
                                                                    String str14 = elementLevelDto.b;
                                                                    if (str14 != null) {
                                                                        obj = (sf20) linkedHashMap7.get(str14);
                                                                        if (obj == null) {
                                                                        }
                                                                    }
                                                                    obj = null;
                                                                    if (obj == null) {
                                                                    }
                                                                }
                                                            }
                                                            if (arrayList2.size() != list6.size()) {
                                                                gf20Var = null;
                                                            } else {
                                                                String str15 = aVar7.a;
                                                                g0k b2 = k0kVar22.b(aVar7.c, false);
                                                                Action action3 = aVar7.d;
                                                                Action.Type type4 = action3.a;
                                                                List list7 = action3.j;
                                                                switch (wd20.a[type4.ordinal()]) {
                                                                    case 1:
                                                                        String str16 = action3.c;
                                                                        if (str16 != null) {
                                                                            m0d0Var = new m0d0(str16, list7);
                                                                            q0d0Var = m0d0Var;
                                                                            gf20Var = new gf20(str15, arrayList2, b2, q0d0Var, false, 8);
                                                                            break;
                                                                        }
                                                                        q0d0Var = null;
                                                                        gf20Var = new gf20(str15, arrayList2, b2, q0d0Var, false, 8);
                                                                    case 2:
                                                                        String str17 = action3.b;
                                                                        if (str17 != null) {
                                                                            m0d0Var = new p0d0(str17, action3.f);
                                                                            q0d0Var = m0d0Var;
                                                                            gf20Var = new gf20(str15, arrayList2, b2, q0d0Var, false, 8);
                                                                            break;
                                                                        }
                                                                        q0d0Var = null;
                                                                        gf20Var = new gf20(str15, arrayList2, b2, q0d0Var, false, 8);
                                                                    case 3:
                                                                        String str18 = action3.g;
                                                                        if (str18 != null) {
                                                                            m0d0Var = new o0d0(str18, list7, action3.k);
                                                                            q0d0Var = m0d0Var;
                                                                            gf20Var = new gf20(str15, arrayList2, b2, q0d0Var, false, 8);
                                                                            break;
                                                                        }
                                                                        q0d0Var = null;
                                                                        gf20Var = new gf20(str15, arrayList2, b2, q0d0Var, false, 8);
                                                                    case 4:
                                                                    case 5:
                                                                    case 6:
                                                                        q0d0Var = null;
                                                                        gf20Var = new gf20(str15, arrayList2, b2, q0d0Var, false, 8);
                                                                        break;
                                                                    default:
                                                                        w511.b();
                                                                        return null;
                                                                }
                                                            }
                                                        }
                                                        if (gf20Var != null) {
                                                            linkedHashMap3.put(gf20Var.a, gf20Var);
                                                        }
                                                    }
                                                    List list8 = e0Var2.b;
                                                    ArrayList arrayList3 = new ArrayList();
                                                    it2 = list8.iterator();
                                                    collection = arrayList3;
                                                    map3 = linkedHashMap3;
                                                    microWidgetBadgeMapper$mapBadges$1 = microWidgetBadgeMapper$mapBadges$16;
                                                    aVar4 = aVar;
                                                    if (it2.hasNext()) {
                                                    }
                                                }
                                            }
                                            return coroutineSingletons;
                                        }
                                        aVar2 = this;
                                        obj2 = obj3;
                                        if (obj2 != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 2:
                                        linkedHashMap4 = linkedHashMap5;
                                        r2cVar3 = r2cVar2;
                                        map2 = map4;
                                        microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$15;
                                        MicroWidgetDto.f fVar = microWidgetDto.f;
                                        if (fVar != null) {
                                            obj2 = j(fVar, map2, microWidgetDto.a, r34, o151Var, microWidgetDto.k, microWidgetBadgeMapper$mapBadges$12);
                                            microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$12;
                                            if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                obj2 = (zf20) obj2;
                                            }
                                            aVar2 = this;
                                            if (obj2 != coroutineSingletons) {
                                            }
                                            return coroutineSingletons;
                                        }
                                        aVar2 = this;
                                        obj2 = obj3;
                                        if (obj2 != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 3:
                                        linkedHashMap4 = linkedHashMap5;
                                        r2cVar3 = r2cVar2;
                                        map2 = map4;
                                        microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$15;
                                        obj2 = new uf20(str, o151Var);
                                        aVar2 = this;
                                        if (obj2 != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 4:
                                        linkedHashMap4 = linkedHashMap5;
                                        r2cVar3 = r2cVar2;
                                        map2 = map4;
                                        microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$15;
                                        MicroWidgetDto.d dVar = microWidgetDto.g;
                                        if (dVar != null) {
                                            obj2 = g(dVar, microWidgetDto.a, r34, o151Var, microWidgetDto.k, map2, microWidgetBadgeMapper$mapBadges$12);
                                            map2 = map2;
                                            microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$12;
                                            if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                obj2 = (nf20) obj2;
                                            }
                                            aVar2 = this;
                                            if (obj2 != coroutineSingletons) {
                                            }
                                            return coroutineSingletons;
                                        }
                                        aVar2 = this;
                                        obj2 = obj3;
                                        if (obj2 != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 5:
                                        linkedHashMap4 = linkedHashMap5;
                                        map2 = map4;
                                        microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$15;
                                        if (r2cVar2 == null) {
                                            r2cVar3 = r2cVar2;
                                            aVar2 = this;
                                            obj2 = obj3;
                                            if (obj2 != coroutineSingletons) {
                                            }
                                            return coroutineSingletons;
                                        }
                                        r2c r2cVar4 = r2cVar2;
                                        obj2 = i(microWidgetDto, r34, map2, r2cVar4, o151Var, microWidgetBadgeMapper$mapBadges$12);
                                        map2 = map2;
                                        r2cVar3 = r2cVar4;
                                        if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            obj2 = (xf20) obj2;
                                        }
                                        aVar2 = this;
                                        if (obj2 != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    case 6:
                                        MicroWidgetDto.a aVar8 = microWidgetDto.i;
                                        if (aVar8 == null) {
                                            linkedHashMap4 = linkedHashMap5;
                                            aVar2 = this;
                                            r2cVar3 = r2cVar2;
                                            obj2 = obj3;
                                            map2 = map4;
                                            microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$15;
                                            if (obj2 != coroutineSingletons) {
                                            }
                                            return coroutineSingletons;
                                        }
                                        linkedHashMap4 = linkedHashMap5;
                                        Map map6 = map4;
                                        microWidgetBadgeMapper$mapBadges$12 = microWidgetBadgeMapper$mapBadges$15;
                                        obj2 = d(aVar8, microWidgetDto.a, r34, map6, o151Var, microWidgetBadgeMapper$mapBadges$12);
                                        map2 = map6;
                                        if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            obj2 = (hf20) obj2;
                                        }
                                        aVar3 = this;
                                        r2cVar3 = r2cVar2;
                                        aVar2 = aVar3;
                                        if (obj2 != coroutineSingletons) {
                                        }
                                        return coroutineSingletons;
                                    default:
                                        w511.b();
                                        return obj3;
                                }
                            }
                        }
                        linkedHashMap4 = linkedHashMap;
                        obj2 = r11;
                        obj3 = obj2;
                        aVar3 = aVar;
                        r2cVar3 = r2cVar2;
                        aVar2 = aVar3;
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it2 = (Iterator) microWidgetBadgeMapper$mapBadges$1.L$10;
                    collection = (Collection) microWidgetBadgeMapper$mapBadges$1.L$8;
                    map3 = (Map) microWidgetBadgeMapper$mapBadges$1.L$5;
                    kotlin.b.b(obj2);
                    a aVar9 = aVar5;
                    g1d0 g1d0Var = (g1d0) obj2;
                    aVar4 = aVar9;
                    if (g1d0Var != null) {
                        collection.add(g1d0Var);
                        aVar4 = aVar9;
                    }
                    if (it2.hasNext()) {
                        return (List) collection;
                    }
                    MicroWidgetPlaqueDto microWidgetPlaqueDto = (MicroWidgetPlaqueDto) it2.next();
                    microWidgetBadgeMapper$mapBadges$1.L$0 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$1 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$2 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$3 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$4 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$5 = map3;
                    microWidgetBadgeMapper$mapBadges$1.L$6 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$7 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$8 = collection;
                    microWidgetBadgeMapper$mapBadges$1.L$9 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$10 = it2;
                    microWidgetBadgeMapper$mapBadges$1.L$11 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$12 = null;
                    microWidgetBadgeMapper$mapBadges$1.L$13 = null;
                    microWidgetBadgeMapper$mapBadges$1.label = 2;
                    obj2 = aVar4.a(microWidgetPlaqueDto, map3, microWidgetBadgeMapper$mapBadges$1);
                    aVar9 = aVar4;
                }
            }
        }
        microWidgetBadgeMapper$mapBadges$1 = new MicroWidgetBadgeMapper$mapBadges$1(aVar5, continuationImpl);
        Object obj22 = microWidgetBadgeMapper$mapBadges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$mapBadges$1.label;
        int i32 = 1;
        ?? r112 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(MicroWidgetDto.a aVar, String str, q0d0 q0d0Var, Map map, o151 o151Var, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$mapBalanceWidget$1 microWidgetBadgeMapper$mapBalanceWidget$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MicroWidgetDto.a aVar2;
        o151 o151Var2;
        String str2;
        q0d0 q0d0Var2;
        Object b;
        Map map2;
        CharSequence charSequence;
        String str3;
        q0d0 q0d0Var3;
        char c;
        Object b2;
        String str4;
        o151 o151Var3;
        CharSequence charSequence2;
        MicroWidgetDto.a aVar3;
        Map map3 = map;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$mapBalanceWidget$1) {
            microWidgetBadgeMapper$mapBalanceWidget$1 = (MicroWidgetBadgeMapper$mapBalanceWidget$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$mapBalanceWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$mapBalanceWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$mapBalanceWidget$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$mapBalanceWidget$1.label;
                ru.yandex.taxi.widget.c cVar = this.b;
                i iVar = i.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = aVar.a;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$0 = aVar;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$1 = str;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$2 = q0d0Var;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$3 = map3;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$4 = o151Var;
                    microWidgetBadgeMapper$mapBalanceWidget$1.label = 1;
                    obj = iVar.b(cVar, formattedText, map3, microWidgetBadgeMapper$mapBalanceWidget$1);
                    if (obj != coroutineSingletons) {
                        aVar2 = aVar;
                        o151Var2 = o151Var;
                        str2 = str;
                        q0d0Var2 = q0d0Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) microWidgetBadgeMapper$mapBalanceWidget$1.L$6;
                        charSequence = (CharSequence) microWidgetBadgeMapper$mapBalanceWidget$1.L$5;
                        o151 o151Var4 = (o151) microWidgetBadgeMapper$mapBalanceWidget$1.L$4;
                        q0d0 q0d0Var4 = (q0d0) microWidgetBadgeMapper$mapBalanceWidget$1.L$2;
                        String str5 = (String) microWidgetBadgeMapper$mapBalanceWidget$1.L$1;
                        aVar3 = (MicroWidgetDto.a) microWidgetBadgeMapper$mapBalanceWidget$1.L$0;
                        kotlin.b.b(obj);
                        o151Var3 = o151Var4;
                        q0d0Var3 = q0d0Var4;
                        c = 2;
                        str4 = str5;
                        CharSequence charSequence3 = (CharSequence) obj;
                        int i3 = kyh0.plus_sdk_badge_content_description;
                        Context context = this.a.a;
                        Object[] copyOf = Arrays.copyOf(new Object[]{charSequence}, 1);
                        String string = context.getString(i3, Arrays.copyOf(copyOf, copyOf.length));
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = charSequence2;
                        charSequenceArr[1] = string;
                        charSequenceArr[c] = charSequence3;
                        List g = scc.g(charSequenceArr);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : g) {
                            if (!evu0.J((CharSequence) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        return new hf20(str4, q0d0Var3, new ofe(0, kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62), "", null), o151Var3, new bg20(charSequence, aVar3.a), new bg20(charSequence2, aVar3.b), new bg20(charSequence3, aVar3.c));
                    }
                    CharSequence charSequence4 = (CharSequence) microWidgetBadgeMapper$mapBalanceWidget$1.L$5;
                    o151 o151Var5 = (o151) microWidgetBadgeMapper$mapBalanceWidget$1.L$4;
                    map2 = (Map) microWidgetBadgeMapper$mapBalanceWidget$1.L$3;
                    q0d0Var3 = (q0d0) microWidgetBadgeMapper$mapBalanceWidget$1.L$2;
                    String str6 = (String) microWidgetBadgeMapper$mapBalanceWidget$1.L$1;
                    MicroWidgetDto.a aVar4 = (MicroWidgetDto.a) microWidgetBadgeMapper$mapBalanceWidget$1.L$0;
                    kotlin.b.b(obj);
                    charSequence = charSequence4;
                    o151Var2 = o151Var5;
                    str3 = str6;
                    aVar2 = aVar4;
                    CharSequence charSequence5 = (CharSequence) obj;
                    c = 2;
                    FormattedText formattedText2 = aVar2.c;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$0 = aVar2;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$1 = str3;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$2 = q0d0Var3;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$3 = null;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$4 = o151Var2;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$5 = charSequence;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$6 = charSequence5;
                    microWidgetBadgeMapper$mapBalanceWidget$1.label = 3;
                    b2 = iVar.b(cVar, formattedText2, map2, microWidgetBadgeMapper$mapBalanceWidget$1);
                    if (b2 != coroutineSingletons) {
                        str4 = str3;
                        o151Var3 = o151Var2;
                        charSequence2 = charSequence5;
                        obj = b2;
                        aVar3 = aVar2;
                        CharSequence charSequence32 = (CharSequence) obj;
                        int i32 = kyh0.plus_sdk_badge_content_description;
                        Context context2 = this.a.a;
                        Object[] copyOf2 = Arrays.copyOf(new Object[]{charSequence}, 1);
                        String string2 = context2.getString(i32, Arrays.copyOf(copyOf2, copyOf2.length));
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        charSequenceArr2[0] = charSequence2;
                        charSequenceArr2[1] = string2;
                        charSequenceArr2[c] = charSequence32;
                        List g2 = scc.g(charSequenceArr2);
                        ArrayList arrayList2 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        return new hf20(str4, q0d0Var3, new ofe(0, kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, null, 62), "", null), o151Var3, new bg20(charSequence, aVar3.a), new bg20(charSequence2, aVar3.b), new bg20(charSequence32, aVar3.c));
                    }
                    return coroutineSingletons;
                }
                o151Var2 = (o151) microWidgetBadgeMapper$mapBalanceWidget$1.L$4;
                map3 = (Map) microWidgetBadgeMapper$mapBalanceWidget$1.L$3;
                q0d0Var2 = (q0d0) microWidgetBadgeMapper$mapBalanceWidget$1.L$2;
                str2 = (String) microWidgetBadgeMapper$mapBalanceWidget$1.L$1;
                aVar2 = (MicroWidgetDto.a) microWidgetBadgeMapper$mapBalanceWidget$1.L$0;
                kotlin.b.b(obj);
                CharSequence charSequence6 = (CharSequence) obj;
                FormattedText formattedText3 = aVar2.b;
                microWidgetBadgeMapper$mapBalanceWidget$1.L$0 = aVar2;
                microWidgetBadgeMapper$mapBalanceWidget$1.L$1 = str2;
                microWidgetBadgeMapper$mapBalanceWidget$1.L$2 = q0d0Var2;
                microWidgetBadgeMapper$mapBalanceWidget$1.L$3 = map3;
                microWidgetBadgeMapper$mapBalanceWidget$1.L$4 = o151Var2;
                microWidgetBadgeMapper$mapBalanceWidget$1.L$5 = charSequence6;
                microWidgetBadgeMapper$mapBalanceWidget$1.label = 2;
                b = iVar.b(cVar, formattedText3, map3, microWidgetBadgeMapper$mapBalanceWidget$1);
                if (b != coroutineSingletons) {
                    q0d0 q0d0Var5 = q0d0Var2;
                    map2 = map3;
                    charSequence = charSequence6;
                    obj = b;
                    str3 = str2;
                    q0d0Var3 = q0d0Var5;
                    CharSequence charSequence52 = (CharSequence) obj;
                    c = 2;
                    FormattedText formattedText22 = aVar2.c;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$0 = aVar2;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$1 = str3;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$2 = q0d0Var3;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$3 = null;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$4 = o151Var2;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$5 = charSequence;
                    microWidgetBadgeMapper$mapBalanceWidget$1.L$6 = charSequence52;
                    microWidgetBadgeMapper$mapBalanceWidget$1.label = 3;
                    b2 = iVar.b(cVar, formattedText22, map2, microWidgetBadgeMapper$mapBalanceWidget$1);
                    if (b2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        microWidgetBadgeMapper$mapBalanceWidget$1 = new MicroWidgetBadgeMapper$mapBalanceWidget$1(this, continuationImpl);
        Object obj3 = microWidgetBadgeMapper$mapBalanceWidget$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$mapBalanceWidget$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.b;
        i iVar2 = i.a;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj3;
        FormattedText formattedText32 = aVar2.b;
        microWidgetBadgeMapper$mapBalanceWidget$1.L$0 = aVar2;
        microWidgetBadgeMapper$mapBalanceWidget$1.L$1 = str2;
        microWidgetBadgeMapper$mapBalanceWidget$1.L$2 = q0d0Var2;
        microWidgetBadgeMapper$mapBalanceWidget$1.L$3 = map3;
        microWidgetBadgeMapper$mapBalanceWidget$1.L$4 = o151Var2;
        microWidgetBadgeMapper$mapBalanceWidget$1.L$5 = charSequence62;
        microWidgetBadgeMapper$mapBalanceWidget$1.label = 2;
        b = iVar2.b(cVar2, formattedText32, map3, microWidgetBadgeMapper$mapBalanceWidget$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(MicroWidgetDto.b bVar, Map map, String str, q0d0 q0d0Var, o151 o151Var, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$mapButtonWidget$1 microWidgetBadgeMapper$mapButtonWidget$1;
        int i;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$mapButtonWidget$1) {
            microWidgetBadgeMapper$mapButtonWidget$1 = (MicroWidgetBadgeMapper$mapButtonWidget$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$mapButtonWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$mapButtonWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$mapButtonWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$mapButtonWidget$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = bVar.a;
                    microWidgetBadgeMapper$mapButtonWidget$1.L$0 = bVar;
                    microWidgetBadgeMapper$mapButtonWidget$1.L$1 = null;
                    microWidgetBadgeMapper$mapButtonWidget$1.L$2 = str;
                    microWidgetBadgeMapper$mapButtonWidget$1.L$3 = q0d0Var;
                    microWidgetBadgeMapper$mapButtonWidget$1.L$4 = o151Var;
                    microWidgetBadgeMapper$mapButtonWidget$1.label = 1;
                    obj = i.a.b(this.b, formattedText, map, microWidgetBadgeMapper$mapButtonWidget$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o151Var = (o151) microWidgetBadgeMapper$mapButtonWidget$1.L$4;
                    q0d0Var = (q0d0) microWidgetBadgeMapper$mapButtonWidget$1.L$3;
                    str = (String) microWidgetBadgeMapper$mapButtonWidget$1.L$2;
                    bVar = (MicroWidgetDto.b) microWidgetBadgeMapper$mapButtonWidget$1.L$0;
                    kotlin.b.b(obj);
                }
                return new jf20(str, q0d0Var, o151Var, new bg20((CharSequence) obj, bVar.a));
            }
        }
        microWidgetBadgeMapper$mapButtonWidget$1 = new MicroWidgetBadgeMapper$mapButtonWidget$1(this, continuationImpl);
        Object obj2 = microWidgetBadgeMapper$mapButtonWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$mapButtonWidget$1.label;
        if (i != 0) {
        }
        return new jf20(str, q0d0Var, o151Var, new bg20((CharSequence) obj2, bVar.a));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(1:23))|12|13|14|15))|30|6|7|(0)(0)|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r4.d.c("MicroWidgetBadgeMapper:LOADING_IMAGE", "Failed upload image with url " + r5.a, r0);
        r1 = new ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(MicroWidgetDto.d dVar, String str, q0d0 q0d0Var, o151 o151Var, MicroWidgetDto.c cVar, Map map, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$mapIconWidget$1 microWidgetBadgeMapper$mapIconWidget$1;
        int i;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$mapIconWidget$1) {
            microWidgetBadgeMapper$mapIconWidget$1 = (MicroWidgetBadgeMapper$mapIconWidget$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$mapIconWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$mapIconWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$mapIconWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$mapIconWidget$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g16 b = this.c.b().b(dVar.a);
                    microWidgetBadgeMapper$mapIconWidget$1.L$0 = dVar;
                    microWidgetBadgeMapper$mapIconWidget$1.L$1 = str;
                    microWidgetBadgeMapper$mapIconWidget$1.L$2 = q0d0Var;
                    microWidgetBadgeMapper$mapIconWidget$1.L$3 = o151Var;
                    microWidgetBadgeMapper$mapIconWidget$1.L$4 = cVar;
                    microWidgetBadgeMapper$mapIconWidget$1.L$5 = map;
                    microWidgetBadgeMapper$mapIconWidget$1.label = 1;
                    obj = b.a(microWidgetBadgeMapper$mapIconWidget$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) microWidgetBadgeMapper$mapIconWidget$1.L$5;
                    cVar = (MicroWidgetDto.c) microWidgetBadgeMapper$mapIconWidget$1.L$4;
                    o151Var = (o151) microWidgetBadgeMapper$mapIconWidget$1.L$3;
                    q0d0Var = (q0d0) microWidgetBadgeMapper$mapIconWidget$1.L$2;
                    str = (String) microWidgetBadgeMapper$mapIconWidget$1.L$1;
                    dVar = (MicroWidgetDto.d) microWidgetBadgeMapper$mapIconWidget$1.L$0;
                    kotlin.b.b(obj);
                }
                hld0 hld0Var = this.a;
                hld0Var.getClass();
                Drawable formattedTextConverter$EmptyDrawable = new BitmapDrawable(hld0Var.a.getResources(), (Bitmap) obj);
                MicroWidgetDto.c cVar2 = cVar;
                o151 o151Var2 = o151Var;
                return new nf20(str, q0d0Var, o151Var2, f(cVar2, map), new pf20(dVar.a, formattedTextConverter$EmptyDrawable));
            }
        }
        microWidgetBadgeMapper$mapIconWidget$1 = new MicroWidgetBadgeMapper$mapIconWidget$1(this, continuationImpl);
        Object obj2 = microWidgetBadgeMapper$mapIconWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$mapIconWidget$1.label;
        if (i != 0) {
        }
        hld0 hld0Var2 = this.a;
        hld0Var2.getClass();
        Drawable formattedTextConverter$EmptyDrawable2 = new BitmapDrawable(hld0Var2.a.getResources(), (Bitmap) obj2);
        MicroWidgetDto.c cVar22 = cVar;
        o151 o151Var22 = o151Var;
        return new nf20(str, q0d0Var, o151Var22, f(cVar22, map), new pf20(dVar.a, formattedTextConverter$EmptyDrawable2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$mapNotification$1 microWidgetBadgeMapper$mapNotification$1;
        int i;
        Drawable drawable;
        PlaqueModel$TabletPlaqueModel$Notification$Position plaqueModel$TabletPlaqueModel$Notification$Position;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$mapNotification$1) {
            microWidgetBadgeMapper$mapNotification$1 = (MicroWidgetBadgeMapper$mapNotification$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$mapNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$mapNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$mapNotification$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$mapNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (iconInCornerDto != null) {
                        String str = iconInCornerDto.a;
                        if (!evu0.J(str) && iconInCornerDto.b != null) {
                            microWidgetBadgeMapper$mapNotification$1.L$0 = iconInCornerDto;
                            microWidgetBadgeMapper$mapNotification$1.label = 1;
                            obj = b(str, microWidgetBadgeMapper$mapNotification$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iconInCornerDto = (MicroWidgetPlaqueDto.IconInCornerDto) microWidgetBadgeMapper$mapNotification$1.L$0;
                kotlin.b.b(obj);
                drawable = (Drawable) obj;
                if (drawable != null) {
                    pf20 pf20Var = new pf20(iconInCornerDto.a, drawable);
                    int i3 = ye20.c[iconInCornerDto.b.ordinal()];
                    if (i3 == 1) {
                        plaqueModel$TabletPlaqueModel$Notification$Position = PlaqueModel$TabletPlaqueModel$Notification$Position.LEFT;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        plaqueModel$TabletPlaqueModel$Notification$Position = PlaqueModel$TabletPlaqueModel$Notification$Position.RIGHT;
                    }
                    return new noc0(pf20Var, plaqueModel$TabletPlaqueModel$Notification$Position);
                }
                return null;
            }
        }
        microWidgetBadgeMapper$mapNotification$1 = new MicroWidgetBadgeMapper$mapNotification$1(this, continuationImpl);
        Object obj3 = microWidgetBadgeMapper$mapNotification$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$mapNotification$1.label;
        if (i != 0) {
        }
        drawable = (Drawable) obj3;
        if (drawable != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(MicroWidgetDto microWidgetDto, q0d0 q0d0Var, Map map, r2c r2cVar, o151 o151Var, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$mapSwitchWidget$1 microWidgetBadgeMapper$mapSwitchWidget$1;
        int i;
        FormattedText b;
        q0d0 q0d0Var2;
        o151 o151Var2;
        FormattedText formattedText;
        MicroWidgetDto microWidgetDto2 = microWidgetDto;
        r2c r2cVar2 = r2cVar;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$mapSwitchWidget$1) {
            microWidgetBadgeMapper$mapSwitchWidget$1 = (MicroWidgetBadgeMapper$mapSwitchWidget$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$mapSwitchWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$mapSwitchWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$mapSwitchWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$mapSwitchWidget$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MicroWidgetDto.e eVar = microWidgetDto2.j;
                    if (eVar != null) {
                        b = eVar.a;
                    } else {
                        b = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, "$$COMPOSITE_PAYMENT_AMOUNT$$", new Integer(16), null, null, FormattedText.FontWeight.MEDIUM, 28);
                    }
                    Map o = kotlin.collections.b.o(map, new Pair("$$COMPOSITE_PAYMENT_AMOUNT$$", r2cVar2.a));
                    microWidgetBadgeMapper$mapSwitchWidget$1.L$0 = microWidgetDto2;
                    q0d0Var2 = q0d0Var;
                    microWidgetBadgeMapper$mapSwitchWidget$1.L$1 = q0d0Var2;
                    microWidgetBadgeMapper$mapSwitchWidget$1.L$2 = null;
                    microWidgetBadgeMapper$mapSwitchWidget$1.L$3 = r2cVar2;
                    o151Var2 = o151Var;
                    microWidgetBadgeMapper$mapSwitchWidget$1.L$4 = o151Var2;
                    microWidgetBadgeMapper$mapSwitchWidget$1.L$5 = b;
                    microWidgetBadgeMapper$mapSwitchWidget$1.label = 1;
                    Object b2 = i.a.b(this.b, b, o, microWidgetBadgeMapper$mapSwitchWidget$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    FormattedText formattedText2 = b;
                    obj = b2;
                    formattedText = formattedText2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    formattedText = (FormattedText) microWidgetBadgeMapper$mapSwitchWidget$1.L$5;
                    o151 o151Var3 = (o151) microWidgetBadgeMapper$mapSwitchWidget$1.L$4;
                    r2cVar2 = (r2c) microWidgetBadgeMapper$mapSwitchWidget$1.L$3;
                    q0d0 q0d0Var3 = (q0d0) microWidgetBadgeMapper$mapSwitchWidget$1.L$1;
                    MicroWidgetDto microWidgetDto3 = (MicroWidgetDto) microWidgetBadgeMapper$mapSwitchWidget$1.L$0;
                    kotlin.b.b(obj);
                    o151Var2 = o151Var3;
                    microWidgetDto2 = microWidgetDto3;
                    q0d0Var2 = q0d0Var3;
                }
                return new xf20(microWidgetDto2.a, q0d0Var2, o151Var2, new wf20(new bg20((CharSequence) obj, formattedText), r2cVar2.b));
            }
        }
        microWidgetBadgeMapper$mapSwitchWidget$1 = new MicroWidgetBadgeMapper$mapSwitchWidget$1(this, continuationImpl);
        Object obj2 = microWidgetBadgeMapper$mapSwitchWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$mapSwitchWidget$1.label;
        if (i != 0) {
        }
        return new xf20(microWidgetDto2.a, q0d0Var2, o151Var2, new wf20(new bg20((CharSequence) obj2, formattedText), r2cVar2.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(MicroWidgetDto.f fVar, Map map, String str, q0d0 q0d0Var, o151 o151Var, MicroWidgetDto.c cVar, ContinuationImpl continuationImpl) {
        MicroWidgetBadgeMapper$mapTextWidget$1 microWidgetBadgeMapper$mapTextWidget$1;
        int i;
        if (continuationImpl instanceof MicroWidgetBadgeMapper$mapTextWidget$1) {
            microWidgetBadgeMapper$mapTextWidget$1 = (MicroWidgetBadgeMapper$mapTextWidget$1) continuationImpl;
            int i2 = microWidgetBadgeMapper$mapTextWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeMapper$mapTextWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeMapper$mapTextWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeMapper$mapTextWidget$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = fVar.a;
                    microWidgetBadgeMapper$mapTextWidget$1.L$0 = fVar;
                    microWidgetBadgeMapper$mapTextWidget$1.L$1 = map;
                    microWidgetBadgeMapper$mapTextWidget$1.L$2 = str;
                    microWidgetBadgeMapper$mapTextWidget$1.L$3 = q0d0Var;
                    microWidgetBadgeMapper$mapTextWidget$1.L$4 = o151Var;
                    microWidgetBadgeMapper$mapTextWidget$1.L$5 = cVar;
                    microWidgetBadgeMapper$mapTextWidget$1.label = 1;
                    obj = i.a.b(this.b, formattedText, map, microWidgetBadgeMapper$mapTextWidget$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (MicroWidgetDto.c) microWidgetBadgeMapper$mapTextWidget$1.L$5;
                    o151Var = (o151) microWidgetBadgeMapper$mapTextWidget$1.L$4;
                    q0d0Var = (q0d0) microWidgetBadgeMapper$mapTextWidget$1.L$3;
                    str = (String) microWidgetBadgeMapper$mapTextWidget$1.L$2;
                    map = (Map) microWidgetBadgeMapper$mapTextWidget$1.L$1;
                    fVar = (MicroWidgetDto.f) microWidgetBadgeMapper$mapTextWidget$1.L$0;
                    kotlin.b.b(obj);
                }
                return new zf20(str, q0d0Var, o151Var, f(cVar, map), new bg20((CharSequence) obj, fVar.a));
            }
        }
        microWidgetBadgeMapper$mapTextWidget$1 = new MicroWidgetBadgeMapper$mapTextWidget$1(this, continuationImpl);
        Object obj2 = microWidgetBadgeMapper$mapTextWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeMapper$mapTextWidget$1.label;
        if (i != 0) {
        }
        return new zf20(str, q0d0Var, o151Var, f(cVar, map), new bg20((CharSequence) obj2, fVar.a));
    }
}
