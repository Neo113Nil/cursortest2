package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.a8c;
import defpackage.b64;
import defpackage.byb0;
import defpackage.c2c0;
import defpackage.d2c0;
import defpackage.dzb0;
import defpackage.exb0;
import defpackage.ezb0;
import defpackage.fcj0;
import defpackage.fdc0;
import defpackage.fzb0;
import defpackage.g8c;
import defpackage.go10;
import defpackage.gw00;
import defpackage.h041;
import defpackage.jl40;
import defpackage.k8c;
import defpackage.kvb0;
import defpackage.l2c0;
import defpackage.l8c;
import defpackage.lvb0;
import defpackage.m8c;
import defpackage.mwb0;
import defpackage.n1c0;
import defpackage.ny61;
import defpackage.oub0;
import defpackage.owb0;
import defpackage.pzt0;
import defpackage.q1c0;
import defpackage.q7c;
import defpackage.qub0;
import defpackage.qzb0;
import defpackage.r7c;
import defpackage.s1c0;
import defpackage.s7c;
import defpackage.scc;
import defpackage.sub0;
import defpackage.t1c0;
import defpackage.t4r0;
import defpackage.tcc;
import defpackage.u1c0;
import defpackage.uub0;
import defpackage.v1c0;
import defpackage.ve61;
import defpackage.w1c0;
import defpackage.w511;
import defpackage.wub0;
import defpackage.y1c0;
import defpackage.ycc;
import defpackage.yj70;
import defpackage.ymu;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class c extends b {
    public Set A;
    public final l2c0 m;
    public final Float n;
    public final s1c0 o;
    public final boolean p;
    public final float q;
    public final fcj0 r;
    public final y1c0 s;
    public final qub0 t;
    public final ve61 u;
    public final ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b v;
    public final ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.a w;
    public final ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a x;
    public pzt0 y;
    public Float z;

    public c(k8c k8cVar, y1c0 y1c0Var, float f, uub0 uub0Var, l2c0 l2c0Var, w1c0 w1c0Var, fdc0 fdc0Var, ymu ymuVar, owb0 owb0Var, n1c0 n1c0Var, Float f2, s1c0 s1c0Var) {
        super(k8cVar, f, uub0Var, owb0Var);
        float f3;
        this.m = l2c0Var;
        this.n = f2;
        this.o = s1c0Var;
        v1c0 v1c0Var = w1c0Var.a;
        this.p = !(v1c0Var instanceof u1c0);
        if (jl40.l(v1c0Var, u1c0.a)) {
            f3 = Float.NEGATIVE_INFINITY;
        } else {
            if (!(v1c0Var instanceof t1c0)) {
                w511.b();
                throw null;
            }
            f3 = ((t1c0) v1c0Var).a;
        }
        float f4 = f3;
        this.q = f4;
        fcj0 fcj0Var = new fcj0(this.e, y1c0Var);
        this.r = fcj0Var;
        this.s = y1c0Var;
        sub0 sub0Var = new sub0(uub0Var);
        sub0Var.a = uub0Var;
        qub0 qub0Var = new qub0(sub0Var);
        this.t = qub0Var;
        ve61 ve61Var = new ve61(this.d, w1c0Var.b, l2c0Var, w1c0Var.c.getValue());
        this.u = ve61Var;
        this.v = new ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b(this.e, k8cVar, y1c0Var, fcj0Var, fdc0Var, this.d, qub0Var, sub0Var, y1c0Var, fcj0Var, ve61Var, v1c0Var, f4);
        this.w = new ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.a(this.e, fcj0Var, qub0Var, y1c0Var, this.d);
        this.x = new ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a(this.e, ymuVar, qub0Var, n1c0Var.a);
        this.A = EmptySet.a;
    }

    public static ArrayList s(boolean z, List list, List list2, List list3) {
        PinVisualState pinVisualState;
        Iterable iterable;
        List list4 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(((qzb0) it.next()).a);
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        Set N02 = kotlin.collections.a.N0(list3);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            kvb0 kvb0Var = (kvb0) it2.next();
            if (!z) {
                pinVisualState = PinVisualState.INVISIBLE;
            } else if (N0.contains(kvb0Var.a.a)) {
                pinVisualState = PinVisualState.SELECTED;
            } else {
                PinState pinState = kvb0Var.b;
                List list5 = d2c0.a;
                switch (c2c0.a[pinState.ordinal()]) {
                    case 1:
                        pinVisualState = PinVisualState.INVISIBLE;
                        break;
                    case 2:
                        pinVisualState = PinVisualState.DUST;
                        break;
                    case 3:
                        pinVisualState = PinVisualState.ICON;
                        break;
                    case 4:
                        pinVisualState = PinVisualState.CLUSTER;
                        break;
                    case 5:
                        pinVisualState = PinVisualState.SUPERCLUSTER;
                        break;
                    case 6:
                        pinVisualState = PinVisualState.ICON_LABEL_S;
                        break;
                    case 7:
                        pinVisualState = PinVisualState.ICON_LABEL_M;
                        break;
                    default:
                        w511.b();
                        return null;
                }
            }
            List list6 = d2c0.a;
            switch (c2c0.b[pinVisualState.ordinal()]) {
                case 1:
                    iterable = EmptyList.a;
                    break;
                case 2:
                    iterable = Collections.singletonList(PlacemarkType.DUST);
                    break;
                case 3:
                    iterable = Collections.singletonList(PlacemarkType.ICON);
                    break;
                case 4:
                    iterable = Collections.singletonList(PlacemarkType.CLUSTER);
                    break;
                case 5:
                    iterable = Collections.singletonList(PlacemarkType.SUPERCLUSTER);
                    break;
                case 6:
                    iterable = scc.g(PlacemarkType.LABEL_S, PlacemarkType.ICON_OVERLAY);
                    break;
                case 7:
                    iterable = scc.g(PlacemarkType.LABEL_M, PlacemarkType.ICON_OVERLAY);
                    break;
                case 8:
                    iterable = Collections.singletonList(PlacemarkType.SELECTED);
                    break;
                default:
                    w511.b();
                    return null;
            }
            Iterable<PlacemarkType> iterable2 = iterable;
            ArrayList arrayList3 = new ArrayList(tcc.n(iterable2, 10));
            for (PlacemarkType placemarkType : iterable2) {
                mwb0 mwb0Var = kvb0Var.a.a;
                arrayList3.add(new oub0(mwb0Var, placemarkType, N02.contains(mwb0Var), kvb0Var.c));
            }
            ycc.r(arrayList3, arrayList2);
        }
        return arrayList2;
    }

    public static LinkedHashSet x(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kvb0 kvb0Var = (kvb0) it.next();
            if (kvb0Var.b == PinState.INVISIBLE) {
                mwb0 mwb0Var = kvb0Var.a.a;
                g8c g8cVar = mwb0Var instanceof g8c ? (g8c) mwb0Var : null;
                if (g8cVar == null) {
                    continue;
                } else {
                    s7c s7cVar = g8cVar.b;
                    if (s7cVar instanceof r7c) {
                        linkedHashSet.addAll(((r7c) s7cVar).e);
                    } else {
                        if (!(s7cVar instanceof q7c)) {
                            w511.b();
                            return null;
                        }
                        Iterator it2 = ((q7c) s7cVar).b.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.addAll(((r7c) it2.next()).e);
                        }
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashMap y(List list) {
        List list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : list2) {
            linkedHashMap.put(obj, ((mwb0) obj) instanceof g8c ? d2c0.b : d2c0.a);
        }
        return linkedHashMap;
    }

    public final boolean A(mwb0 mwb0Var, Float f) {
        List list;
        Object obj;
        if (!this.p || f == null) {
            return true;
        }
        if (mwb0Var instanceof g8c) {
            return this.A.contains(((g8c) mwb0Var).c);
        }
        Object a = mwb0Var.a();
        float floatValue = f.floatValue();
        ve61 ve61Var = this.u;
        Integer c = ve61Var.c(floatValue);
        Object obj2 = null;
        if (c != null && (list = (List) ve61Var.f.get(c)) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((a8c) obj).e.contains(a)) {
                    break;
                }
            }
            a8c a8cVar = (a8c) obj;
            if (a8cVar != null) {
                obj2 = a8cVar.c;
            }
        }
        if (obj2 == null) {
            return false;
        }
        return this.A.contains(obj2);
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.b
    public final void c() {
        pzt0 pzt0Var = this.y;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.y = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(15:(2:3|(28:5|6|7|8|(1:(1:(1:(1:(19:14|15|16|17|18|(4:21|(6:23|24|(1:26)(1:34)|(1:33)|30|31)(1:35)|32|19)|36|37|(5:40|(1:42)(1:50)|(2:48|49)(1:46)|47|38)|51|52|53|54|55|56|(4:59|(3:61|62|63)(1:65)|64|57)|66|67|68)(2:89|90))(20:91|92|93|94|(2:96|(1:99)(2:98|17))|18|(1:19)|36|37|(1:38)|51|52|53|54|55|56|(1:57)|66|67|68))(24:100|101|102|103|(2:106|104)|107|108|(2:111|109)|112|113|114|(1:339)(2:117|(9:119|(5:122|(1:124)(1:133)|(2:128|129)|130|120)|134|135|(6:138|(1:140)(1:150)|(1:142)(1:149)|(3:144|145|146)(1:148)|147|136)|151|152|(4:155|(3:160|161|162)|163|153)|166)(2:257|(7:259|(6:262|(1:264)(1:273)|(1:266)(1:272)|(2:268|269)(1:271)|270|260)|274|275|(4:278|(2:280|281)(1:283)|282|276)|284|(3:286|(5:289|(1:291)(1:301)|(2:293|294)(2:296|(2:298|299)(1:300))|295|287)|302))(4:303|(5:306|(1:308)(1:319)|(3:313|314|315)|316|304)|320|(3:322|(5:325|(1:327)(1:337)|(2:329|330)(2:332|(2:334|335)(1:336))|331|323)|338))))|167|(3:169|(4:172|(2:176|177)|178|170)|181)|(11:183|(4:186|(2:188|189)(1:191)|190|184)|192|193|(2:196|194)|197|198|(4:201|(2:205|206)|207|199)|210|(1:212)(1:255)|213)(1:256)|(4:215|(4:218|(3:223|224|225)|226|216)|229|230)(1:254)|231|(4:243|(4:246|(2:248|249)(1:251)|250|244)|252|253)|233|234|235|236|237|(2:239|240)(18:241|94|(0)|18|(1:19)|36|37|(1:38)|51|52|53|54|55|56|(1:57)|66|67|68)))(3:340|341|342))(4:410|(9:412|413|(2:416|414)|417|418|419|420|421|(2:423|424)(1:425))|67|68)|343|(1:345)(1:409)|346|347|348|(1:408)(1:354)|(3:356|357|(15:361|362|363|364|(7:388|389|390|391|(2:394|392)|395|396)(1:366)|367|(1:387)(1:371)|372|(2:375|373)|376|377|(2:380|378)|381|382|(2:384|385)(23:386|103|(1:104)|107|108|(1:109)|112|113|114|(0)|339|167|(0)|(0)(0)|(0)(0)|231|(0)|233|234|235|236|237|(0)(0))))|407|362|363|364|(0)(0)|367|(1:369)|387|372|(1:373)|376|377|(1:378)|381|382|(0)(0)))|363|364|(0)(0)|367|(0)|387|372|(1:373)|376|377|(1:378)|381|382|(0)(0))|8|(0)(0)|343|(0)(0)|346|347|348|(1:350)|408|(0)|407|362) */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0301, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0439 A[Catch: all -> 0x0301, LOOP:4: B:104:0x0433->B:106:0x0439, LOOP_END, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x046c A[Catch: all -> 0x0301, LOOP:5: B:109:0x0466->B:111:0x046c, LOOP_END, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x068f A[Catch: all -> 0x0301, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06c9 A[Catch: all -> 0x0301, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0764 A[Catch: all -> 0x0301, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x08df A[Catch: all -> 0x08c4, TryCatch #1 {all -> 0x08c4, blocks: (B:18:0x08cd, B:19:0x08d9, B:21:0x08df, B:24:0x08eb, B:26:0x08f7, B:28:0x08fe, B:30:0x0906, B:33:0x0902, B:37:0x090a, B:38:0x0914, B:40:0x091a, B:42:0x0928, B:44:0x092f, B:47:0x0937, B:48:0x0933, B:52:0x093b, B:94:0x0877, B:96:0x087b, B:237:0x085b), top: B:236:0x085b }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07a2 A[Catch: all -> 0x0301, TRY_ENTER, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0797 A[Catch: all -> 0x0301, TRY_LEAVE, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x075c A[Catch: all -> 0x0301, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0289 A[Catch: all -> 0x028f, TryCatch #6 {all -> 0x028f, blocks: (B:343:0x027d, B:345:0x0289, B:347:0x0298, B:350:0x029e, B:356:0x02b5, B:421:0x026e), top: B:420:0x026e }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02b5 A[Catch: all -> 0x028f, TRY_LEAVE, TryCatch #6 {all -> 0x028f, blocks: (B:343:0x027d, B:345:0x0289, B:347:0x0298, B:350:0x029e, B:356:0x02b5, B:421:0x026e), top: B:420:0x026e }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0310 A[Catch: all -> 0x0301, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x032f A[Catch: all -> 0x0301, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0359 A[Catch: all -> 0x0301, LOOP:20: B:373:0x0353->B:375:0x0359, LOOP_END, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0388 A[Catch: all -> 0x0301, LOOP:21: B:378:0x0382->B:380:0x0388, LOOP_END, TryCatch #0 {all -> 0x0301, blocks: (B:103:0x040e, B:104:0x0433, B:106:0x0439, B:108:0x044b, B:109:0x0466, B:111:0x046c, B:113:0x047a, B:119:0x04b0, B:120:0x04b8, B:122:0x04be, B:124:0x04ce, B:126:0x04d5, B:128:0x04df, B:135:0x04e7, B:136:0x04f4, B:138:0x04fa, B:140:0x0504, B:142:0x050a, B:145:0x0512, B:152:0x0516, B:153:0x0522, B:155:0x0528, B:158:0x053a, B:161:0x054c, B:167:0x0685, B:169:0x068f, B:170:0x0697, B:172:0x069d, B:174:0x06ab, B:176:0x06b9, B:183:0x06c9, B:184:0x06d6, B:186:0x06dc, B:188:0x06ed, B:193:0x06f5, B:194:0x0706, B:196:0x070c, B:198:0x071a, B:199:0x0723, B:201:0x0729, B:203:0x0740, B:205:0x074a, B:213:0x0757, B:215:0x0764, B:216:0x0771, B:218:0x0777, B:221:0x0784, B:224:0x078e, B:230:0x0792, B:234:0x07dc, B:243:0x07a2, B:244:0x07ba, B:246:0x07c0, B:248:0x07d4, B:254:0x0797, B:256:0x075c, B:259:0x055e, B:260:0x056b, B:262:0x0571, B:264:0x0585, B:266:0x058c, B:268:0x0594, B:275:0x059a, B:276:0x05a6, B:278:0x05ac, B:280:0x05be, B:286:0x05c6, B:287:0x05ce, B:289:0x05d4, B:291:0x05e8, B:296:0x05f0, B:298:0x05fe, B:303:0x060c, B:304:0x0614, B:306:0x061a, B:308:0x0624, B:311:0x062b, B:314:0x0635, B:322:0x063b, B:323:0x0643, B:325:0x0649, B:327:0x065d, B:332:0x0665, B:334:0x0673, B:391:0x02e2, B:392:0x02ed, B:394:0x02f3, B:367:0x0316, B:369:0x032f, B:372:0x033a, B:373:0x0353, B:375:0x0359, B:377:0x036b, B:378:0x0382, B:380:0x0388, B:382:0x0396, B:366:0x0310), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x091a A[Catch: all -> 0x08c4, TryCatch #1 {all -> 0x08c4, blocks: (B:18:0x08cd, B:19:0x08d9, B:21:0x08df, B:24:0x08eb, B:26:0x08f7, B:28:0x08fe, B:30:0x0906, B:33:0x0902, B:37:0x090a, B:38:0x0914, B:40:0x091a, B:42:0x0928, B:44:0x092f, B:47:0x0937, B:48:0x0933, B:52:0x093b, B:94:0x0877, B:96:0x087b, B:237:0x085b), top: B:236:0x085b }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x087b A[Catch: all -> 0x08c4, TryCatch #1 {all -> 0x08c4, blocks: (B:18:0x08cd, B:19:0x08d9, B:21:0x08df, B:24:0x08eb, B:26:0x08f7, B:28:0x08fe, B:30:0x0906, B:33:0x0902, B:37:0x090a, B:38:0x0914, B:40:0x091a, B:42:0x0928, B:44:0x092f, B:47:0x0937, B:48:0x0933, B:52:0x093b, B:94:0x0877, B:96:0x087b, B:237:0x085b), top: B:236:0x085b }] */
    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(boolean z, PinInvalidationReason pinInvalidationReason, ContinuationImpl continuationImpl) {
        PinWarGo$sync$1 pinWarGo$sync$1;
        int i;
        ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b bVar;
        exb0 exb0Var;
        fcj0 fcj0Var;
        ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b bVar2;
        exb0 exb0Var2;
        fcj0 fcj0Var2;
        fcj0 fcj0Var3;
        exb0 exb0Var3;
        ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b bVar3;
        Iterator it;
        boolean z2;
        boolean z3;
        qub0 qub0Var;
        Object r;
        List list;
        List list2;
        List list3;
        PinInvalidationReason pinInvalidationReason2;
        List list4;
        float a;
        Float f;
        float f2;
        float f3;
        boolean z4;
        boolean z5;
        List list5;
        List list6;
        Iterator it2;
        Iterator it3;
        Float f4;
        Object e;
        CoroutineSingletons coroutineSingletons;
        Object obj;
        int i2;
        fzb0 fzb0Var;
        int i3;
        List list7;
        int i4;
        float f5;
        List list8;
        boolean z6;
        List list9;
        List list10;
        PinInvalidationReason pinInvalidationReason3;
        List list11;
        int i5;
        Iterator it4;
        int i6;
        Iterator it5;
        boolean z7;
        boolean z8;
        List list12;
        LinkedHashSet linkedHashSet;
        Map f6;
        Map f7;
        List list13;
        fcj0 fcj0Var4;
        CoroutineSingletons coroutineSingletons2;
        int i7;
        exb0 exb0Var4;
        ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b bVar4;
        boolean z9;
        Object d;
        fzb0 fzb0Var2;
        int i8;
        float f8;
        boolean z10;
        lvb0 lvb0Var;
        List list14;
        int i9;
        int i10;
        Object obj2;
        PinInvalidationReason pinInvalidationReason4;
        fzb0 fzb0Var3;
        lvb0 lvb0Var2;
        Iterator it6;
        Iterator it7;
        Object a2;
        Object a3;
        c cVar = this;
        try {
            try {
                if (continuationImpl instanceof PinWarGo$sync$1) {
                    pinWarGo$sync$1 = (PinWarGo$sync$1) continuationImpl;
                    int i11 = pinWarGo$sync$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        pinWarGo$sync$1.label = i11 - Integer.MIN_VALUE;
                        PinWarGo$sync$1 pinWarGo$sync$12 = pinWarGo$sync$1;
                        Object obj3 = pinWarGo$sync$12.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = pinWarGo$sync$12.label;
                        bVar = cVar.v;
                        exb0Var = cVar.e;
                        fcj0Var = cVar.r;
                        qub0 qub0Var2 = cVar.t;
                        if (i != 0) {
                            kotlin.b.b(obj3);
                            if (!j(z)) {
                                List d2 = cVar.f().d();
                                List c = cVar.f().c();
                                List l = cVar.f().l();
                                List m = cVar.f().m();
                                List p = cVar.f().p();
                                List r2 = cVar.f().r();
                                List h = cVar.f().h();
                                cVar.z();
                                fcj0Var.k(d2);
                                List list15 = d2;
                                ArrayList arrayList = new ArrayList(tcc.n(list15, 10));
                                Iterator it8 = list15.iterator();
                                while (it8.hasNext()) {
                                    arrayList.add(((qzb0) it8.next()).a());
                                }
                                qub0Var2.g(arrayList, scc.g(PlacemarkType.DUST, PlacemarkType.ICON, PlacemarkType.SELECTED));
                                ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b bVar5 = cVar.v;
                                pinWarGo$sync$12.L$0 = pinInvalidationReason;
                                pinWarGo$sync$12.L$1 = null;
                                pinWarGo$sync$12.L$2 = null;
                                pinWarGo$sync$12.L$3 = null;
                                pinWarGo$sync$12.L$4 = l;
                                pinWarGo$sync$12.L$5 = null;
                                pinWarGo$sync$12.L$6 = p;
                                pinWarGo$sync$12.L$7 = r2;
                                pinWarGo$sync$12.L$8 = h;
                                z2 = z;
                                pinWarGo$sync$12.Z$0 = z2;
                                pinWarGo$sync$12.label = 1;
                                z3 = true;
                                qub0Var = qub0Var2;
                                bVar3 = bVar;
                                try {
                                    r = bVar5.r(d2, c, l, m, p, pinWarGo$sync$12);
                                    if (r == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    list = p;
                                    list2 = r2;
                                    list3 = h;
                                    pinInvalidationReason2 = pinInvalidationReason;
                                    list4 = l;
                                } catch (Throwable th) {
                                    th = th;
                                    exb0Var2 = exb0Var;
                                    fcj0Var2 = fcj0Var;
                                    bVar2 = bVar3;
                                    bVar2.getClass();
                                    bVar2.h = null;
                                    fcj0Var2.d = null;
                                    fcj0Var2.e = null;
                                    it = exb0Var2.a.iterator();
                                    while (it.hasNext()) {
                                    }
                                    throw th;
                                }
                            }
                            return zy11.a;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    lvb0Var2 = (lvb0) pinWarGo$sync$12.L$13;
                                    fzb0Var3 = (fzb0) pinWarGo$sync$12.L$9;
                                    list14 = (List) pinWarGo$sync$12.L$4;
                                    b64.D(pinWarGo$sync$12.L$1);
                                    kotlin.b.b(obj3);
                                    bVar4 = bVar;
                                    exb0Var4 = exb0Var;
                                    fcj0Var4 = fcj0Var;
                                    lvb0Var = lvb0Var2;
                                    fzb0Var2 = fzb0Var3;
                                    SetBuilder b = t4r0.b();
                                    for (kvb0 kvb0Var : lvb0Var.a()) {
                                        if (kvb0Var.b != PinState.INVISIBLE) {
                                            mwb0 a4 = kvb0Var.a().a();
                                            g8c g8cVar = a4 instanceof g8c ? (g8c) a4 : null;
                                            if (g8cVar == null || (a3 = g8cVar.c) == null) {
                                                a3 = a4.a();
                                            }
                                            b.add(a3);
                                        }
                                    }
                                    it6 = fzb0Var2.a().iterator();
                                    while (it6.hasNext()) {
                                        mwb0 a5 = ((qzb0) it6.next()).a();
                                        g8c g8cVar2 = a5 instanceof g8c ? (g8c) a5 : null;
                                        if (g8cVar2 == null || (a2 = g8cVar2.c) == null) {
                                            a2 = a5.a();
                                        }
                                        b.add(a2);
                                    }
                                    cVar.A = t4r0.a(b);
                                    exb0Var2 = exb0Var4;
                                    try {
                                        exb0Var2.b(list14);
                                        bVar4.getClass();
                                        bVar4.h = null;
                                        fcj0 fcj0Var5 = fcj0Var4;
                                        fcj0Var5.d = null;
                                        fcj0Var5.e = null;
                                        it7 = exb0Var2.a.iterator();
                                        while (it7.hasNext()) {
                                            wub0 wub0Var = (wub0) it7.next();
                                            if (wub0Var.a == PinCacheMode.TRANSIENT) {
                                                wub0Var.b.clear();
                                            }
                                        }
                                        return zy11.a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bVar2 = bVar4;
                                        fcj0Var2 = fcj0Var4;
                                        bVar2.getClass();
                                        bVar2.h = null;
                                        fcj0Var2.d = null;
                                        fcj0Var2.e = null;
                                        it = exb0Var2.a.iterator();
                                        while (it.hasNext()) {
                                        }
                                        throw th;
                                    }
                                }
                                boolean z11 = pinWarGo$sync$12.Z$1;
                                int i12 = pinWarGo$sync$12.I$2;
                                int i13 = pinWarGo$sync$12.I$1;
                                int i14 = pinWarGo$sync$12.I$0;
                                float f9 = pinWarGo$sync$12.F$0;
                                boolean z12 = pinWarGo$sync$12.Z$0;
                                lvb0Var = (lvb0) pinWarGo$sync$12.L$13;
                                fzb0Var2 = (fzb0) pinWarGo$sync$12.L$9;
                                List list16 = (List) pinWarGo$sync$12.L$4;
                                obj2 = obj3;
                                b64.D(pinWarGo$sync$12.L$1);
                                PinInvalidationReason pinInvalidationReason5 = (PinInvalidationReason) pinWarGo$sync$12.L$0;
                                kotlin.b.b(obj2);
                                bVar4 = bVar;
                                exb0Var4 = exb0Var;
                                fcj0Var4 = fcj0Var;
                                z9 = z11;
                                z10 = z12;
                                pinInvalidationReason4 = pinInvalidationReason5;
                                coroutineSingletons2 = coroutineSingletons3;
                                f8 = f9;
                                i7 = 4;
                                i8 = i14;
                                i10 = i13;
                                i9 = i12;
                                list14 = list16;
                                byb0 byb0Var = (byb0) obj2;
                                if (z9) {
                                    List a6 = byb0Var.a();
                                    pinWarGo$sync$12.L$0 = null;
                                    pinWarGo$sync$12.L$1 = null;
                                    pinWarGo$sync$12.L$2 = null;
                                    pinWarGo$sync$12.L$3 = null;
                                    pinWarGo$sync$12.L$4 = list14;
                                    pinWarGo$sync$12.L$5 = null;
                                    pinWarGo$sync$12.L$6 = null;
                                    pinWarGo$sync$12.L$7 = null;
                                    pinWarGo$sync$12.L$8 = null;
                                    pinWarGo$sync$12.L$9 = fzb0Var2;
                                    pinWarGo$sync$12.L$10 = null;
                                    pinWarGo$sync$12.L$11 = null;
                                    pinWarGo$sync$12.L$12 = null;
                                    pinWarGo$sync$12.L$13 = lvb0Var;
                                    pinWarGo$sync$12.L$14 = null;
                                    pinWarGo$sync$12.L$15 = null;
                                    pinWarGo$sync$12.L$16 = null;
                                    pinWarGo$sync$12.L$17 = null;
                                    pinWarGo$sync$12.L$18 = null;
                                    pinWarGo$sync$12.L$19 = null;
                                    pinWarGo$sync$12.L$20 = null;
                                    pinWarGo$sync$12.Z$0 = z10;
                                    pinWarGo$sync$12.F$0 = f8;
                                    pinWarGo$sync$12.I$0 = i8;
                                    pinWarGo$sync$12.I$1 = i10;
                                    pinWarGo$sync$12.I$2 = i9;
                                    pinWarGo$sync$12.Z$1 = z9;
                                    pinWarGo$sync$12.label = i7;
                                    if (cVar.k(pinInvalidationReason4, a6, pinWarGo$sync$12) == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    fzb0Var3 = fzb0Var2;
                                    lvb0Var2 = lvb0Var;
                                    lvb0Var = lvb0Var2;
                                    fzb0Var2 = fzb0Var3;
                                }
                                SetBuilder b2 = t4r0.b();
                                while (r2.hasNext()) {
                                }
                                it6 = fzb0Var2.a().iterator();
                                while (it6.hasNext()) {
                                }
                                cVar.A = t4r0.a(b2);
                                exb0Var2 = exb0Var4;
                                exb0Var2.b(list14);
                                bVar4.getClass();
                                bVar4.h = null;
                                fcj0 fcj0Var52 = fcj0Var4;
                                fcj0Var52.d = null;
                                fcj0Var52.e = null;
                                it7 = exb0Var2.a.iterator();
                                while (it7.hasNext()) {
                                }
                                return zy11.a;
                            }
                            obj = obj3;
                            int i15 = pinWarGo$sync$12.I$2;
                            int i16 = pinWarGo$sync$12.I$1;
                            int i17 = pinWarGo$sync$12.I$0;
                            float f10 = pinWarGo$sync$12.F$0;
                            boolean z13 = pinWarGo$sync$12.Z$0;
                            list8 = (List) pinWarGo$sync$12.L$12;
                            list9 = (List) pinWarGo$sync$12.L$11;
                            Float f11 = (Float) pinWarGo$sync$12.L$10;
                            fzb0Var = (fzb0) pinWarGo$sync$12.L$9;
                            List list17 = (List) pinWarGo$sync$12.L$7;
                            List list18 = (List) pinWarGo$sync$12.L$4;
                            b64.D(pinWarGo$sync$12.L$1);
                            PinInvalidationReason pinInvalidationReason6 = (PinInvalidationReason) pinWarGo$sync$12.L$0;
                            kotlin.b.b(obj);
                            pinInvalidationReason3 = pinInvalidationReason6;
                            qub0Var = qub0Var2;
                            bVar3 = bVar;
                            fcj0Var3 = fcj0Var;
                            z6 = z13;
                            z3 = true;
                            i4 = i16;
                            f4 = f11;
                            i2 = i15;
                            i3 = i17;
                            coroutineSingletons = coroutineSingletons3;
                            list7 = list18;
                            exb0Var3 = exb0Var;
                            f5 = f10;
                            list10 = list17;
                            lvb0 lvb0Var3 = (lvb0) obj;
                            CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                            boolean h2 = h();
                            list11 = list8;
                            List a7 = lvb0Var3.a();
                            List list19 = list9;
                            i5 = i2;
                            ArrayList arrayList2 = new ArrayList(tcc.n(a7, 10));
                            it4 = a7.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(((kvb0) it4.next()).a().a());
                            }
                            List a8 = fzb0Var.a();
                            List<mwb0> list20 = fzb0Var.d;
                            List list21 = a8;
                            i6 = i4;
                            ArrayList arrayList3 = new ArrayList(tcc.n(list21, 10));
                            it5 = list21.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(((qzb0) it5.next()).a());
                            }
                            qub0Var.h(y(kotlin.collections.a.I(kotlin.collections.a.m0(arrayList3, arrayList2))));
                            qub0Var.f(s(this.j, lvb0Var3.a(), fzb0Var.a(), list10));
                            LinkedHashSet<mwb0> linkedHashSet2 = new LinkedHashSet();
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            z7 = this.p;
                            if (i5 == 0 && z7) {
                                ve61 ve61Var = this.u;
                                if (i3 != 0) {
                                    for (mwb0 mwb0Var : list20) {
                                        boolean z14 = z7;
                                        List list22 = list10;
                                        g8c g8cVar3 = mwb0Var instanceof g8c ? (g8c) mwb0Var : null;
                                        if (g8cVar3 != null && ve61Var.g(f5, g8cVar3.b()) != null) {
                                            linkedHashSet2.add(mwb0Var);
                                        }
                                        z7 = z14;
                                        list10 = list22;
                                    }
                                    z8 = z7;
                                    list12 = list10;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (mwb0 mwb0Var2 : linkedHashSet2) {
                                        g8c g8cVar4 = mwb0Var2 instanceof g8c ? (g8c) mwb0Var2 : null;
                                        Object b3 = g8cVar4 != null ? g8cVar4.b() : null;
                                        if (b3 != null) {
                                            arrayList4.add(b3);
                                        }
                                    }
                                    Set N0 = kotlin.collections.a.N0(arrayList4);
                                    for (kvb0 kvb0Var2 : lvb0Var3.a()) {
                                        if (!(kvb0Var2.a().a() instanceof g8c) && N0.contains(kvb0Var2.a().a().a())) {
                                            linkedHashSet3.add(kvb0Var2.a().a());
                                        }
                                    }
                                } else {
                                    z8 = z7;
                                    list12 = list10;
                                    if (i6 != 0) {
                                        List a9 = lvb0Var3.a();
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it9 = a9.iterator();
                                        while (it9.hasNext()) {
                                            mwb0 a10 = ((kvb0) it9.next()).a().a();
                                            Iterator it10 = it9;
                                            g8c g8cVar5 = a10 instanceof g8c ? (g8c) a10 : null;
                                            Object b4 = g8cVar5 != null ? g8cVar5.b() : null;
                                            if (b4 != null) {
                                                arrayList5.add(b4);
                                            }
                                            it9 = it10;
                                        }
                                        Set N02 = kotlin.collections.a.N0(arrayList5);
                                        Iterator it11 = list19.iterator();
                                        while (it11.hasNext()) {
                                            mwb0 mwb0Var3 = (mwb0) it11.next();
                                            Iterator it12 = it11;
                                            if (N02.contains(mwb0Var3.a())) {
                                                linkedHashSet2.add(mwb0Var3);
                                            }
                                            it11 = it12;
                                        }
                                        if (f4 != null) {
                                            Iterator it13 = lvb0Var3.a().iterator();
                                            while (it13.hasNext()) {
                                                kvb0 kvb0Var3 = (kvb0) it13.next();
                                                mwb0 a11 = kvb0Var3.a().a();
                                                Iterator it14 = it13;
                                                g8c g8cVar6 = a11 instanceof g8c ? (g8c) a11 : null;
                                                if (g8cVar6 != null) {
                                                    if (ve61Var.g(f4.floatValue(), g8cVar6.b()) != null) {
                                                        linkedHashSet3.add(kvb0Var3.a().a());
                                                    }
                                                }
                                                it13 = it14;
                                            }
                                        }
                                    } else {
                                        for (mwb0 mwb0Var4 : list20) {
                                            g8c g8cVar7 = mwb0Var4 instanceof g8c ? (g8c) mwb0Var4 : null;
                                            if (g8cVar7 != null && ve61Var.g(f5, g8cVar7.b()) != null) {
                                                linkedHashSet2.add(mwb0Var4);
                                            }
                                        }
                                        if (f4 != null) {
                                            Iterator it15 = lvb0Var3.a().iterator();
                                            while (it15.hasNext()) {
                                                kvb0 kvb0Var4 = (kvb0) it15.next();
                                                mwb0 a12 = kvb0Var4.a().a();
                                                Iterator it16 = it15;
                                                g8c g8cVar8 = a12 instanceof g8c ? (g8c) a12 : null;
                                                if (g8cVar8 != null) {
                                                    if (ve61Var.g(f4.floatValue(), g8cVar8.b()) != null) {
                                                        linkedHashSet3.add(kvb0Var4.a().a());
                                                    }
                                                }
                                                it15 = it16;
                                            }
                                        }
                                    }
                                }
                            } else {
                                z8 = z7;
                                list12 = list10;
                            }
                            LinkedHashSet x = x(lvb0Var3.a());
                            if (z8) {
                                Iterator it17 = lvb0Var3.a().iterator();
                                while (it17.hasNext()) {
                                    kvb0 kvb0Var5 = (kvb0) it17.next();
                                    Iterator it18 = it17;
                                    if (kvb0Var5.b != PinState.INVISIBLE && !A(kvb0Var5.a().a(), f4)) {
                                        linkedHashSet3.remove(kvb0Var5.a().a());
                                    }
                                    it17 = it18;
                                }
                            }
                            if (z8) {
                                linkedHashSet = linkedHashSet3;
                                f6 = kotlin.collections.b.f();
                            } else {
                                List a13 = lvb0Var3.a();
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it19 = a13.iterator();
                                while (it19.hasNext()) {
                                    Object next = it19.next();
                                    Iterator it20 = it19;
                                    LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                    if (((kvb0) next).b != PinState.INVISIBLE) {
                                        arrayList6.add(next);
                                    }
                                    it19 = it20;
                                    linkedHashSet3 = linkedHashSet4;
                                }
                                linkedHashSet = linkedHashSet3;
                                ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
                                Iterator it21 = arrayList6.iterator();
                                while (it21.hasNext()) {
                                    arrayList7.add(((kvb0) it21.next()).a());
                                }
                                ArrayList arrayList8 = new ArrayList();
                                Iterator it22 = arrayList7.iterator();
                                while (it22.hasNext()) {
                                    Object next2 = it22.next();
                                    qzb0 qzb0Var = (qzb0) next2;
                                    Iterator it23 = it22;
                                    if (!x.contains(qzb0Var.a().a()) && A(qzb0Var.a(), f4)) {
                                        arrayList8.add(next2);
                                    }
                                    it22 = it23;
                                }
                                f6 = u(arrayList8, f4, f5, i3 != 0 ? z3 : false);
                            }
                            if (z8) {
                                f7 = kotlin.collections.b.f();
                            } else {
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj4 : list11) {
                                    mwb0 mwb0Var5 = (mwb0) obj4;
                                    if (!linkedHashSet2.contains(mwb0Var5) && !x.contains(mwb0Var5.a())) {
                                        arrayList9.add(obj4);
                                    }
                                }
                                f7 = t(arrayList9, f5);
                            }
                            list13 = fzb0Var.b;
                            LinkedHashSet linkedHashSet5 = linkedHashSet2;
                            if (i6 == 0) {
                                ArrayList m0 = kotlin.collections.a.m0(fzb0Var.e, list13);
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList10 = new ArrayList();
                                Iterator it24 = m0.iterator();
                                LinkedHashSet linkedHashSet6 = linkedHashSet2;
                                while (it24.hasNext()) {
                                    Object next3 = it24.next();
                                    LinkedHashSet linkedHashSet7 = linkedHashSet6;
                                    if (hashSet.add(((qzb0) next3).a())) {
                                        arrayList10.add(next3);
                                    }
                                    linkedHashSet6 = linkedHashSet7;
                                }
                                list13 = arrayList10;
                                linkedHashSet5 = linkedHashSet6;
                            }
                            LinkedHashSet linkedHashSet8 = linkedHashSet5;
                            ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a w = w();
                            Map map = f7;
                            boolean z15 = this.j;
                            Map map2 = f6;
                            List a14 = lvb0Var3.a();
                            List a15 = fzb0Var.a();
                            pinWarGo$sync$12.L$0 = pinInvalidationReason3;
                            pinWarGo$sync$12.L$1 = null;
                            pinWarGo$sync$12.L$2 = null;
                            pinWarGo$sync$12.L$3 = null;
                            pinWarGo$sync$12.L$4 = list7;
                            pinWarGo$sync$12.L$5 = null;
                            pinWarGo$sync$12.L$6 = null;
                            pinWarGo$sync$12.L$7 = null;
                            pinWarGo$sync$12.L$8 = null;
                            pinWarGo$sync$12.L$9 = fzb0Var;
                            pinWarGo$sync$12.L$10 = null;
                            pinWarGo$sync$12.L$11 = null;
                            pinWarGo$sync$12.L$12 = null;
                            pinWarGo$sync$12.L$13 = lvb0Var3;
                            pinWarGo$sync$12.L$14 = null;
                            pinWarGo$sync$12.L$15 = null;
                            pinWarGo$sync$12.L$16 = null;
                            pinWarGo$sync$12.L$17 = null;
                            pinWarGo$sync$12.L$18 = null;
                            pinWarGo$sync$12.L$19 = null;
                            pinWarGo$sync$12.Z$0 = z6;
                            pinWarGo$sync$12.F$0 = f5;
                            pinWarGo$sync$12.I$0 = i3;
                            pinWarGo$sync$12.I$1 = i6;
                            PinInvalidationReason pinInvalidationReason7 = pinInvalidationReason3;
                            pinWarGo$sync$12.I$2 = i5;
                            pinWarGo$sync$12.Z$1 = h2;
                            pinWarGo$sync$12.label = 3;
                            List list23 = list7;
                            cVar = this;
                            float f12 = f5;
                            fcj0Var4 = fcj0Var3;
                            coroutineSingletons2 = coroutineSingletons4;
                            i7 = 4;
                            fzb0 fzb0Var4 = fzb0Var;
                            exb0Var4 = exb0Var3;
                            bVar4 = bVar3;
                            boolean z16 = z6;
                            z9 = h2;
                            int i18 = i3;
                            try {
                                d = w.d(z15, a14, list13, a15, list12, list11, z9, map2, map, linkedHashSet8, linkedHashSet, pinWarGo$sync$12);
                                pinWarGo$sync$12 = pinWarGo$sync$12;
                                if (d != coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                fzb0Var2 = fzb0Var4;
                                i8 = i18;
                                f8 = f12;
                                z10 = z16;
                                lvb0Var = lvb0Var3;
                                list14 = list23;
                                i9 = i5;
                                i10 = i6;
                                obj2 = d;
                                pinInvalidationReason4 = pinInvalidationReason7;
                                byb0 byb0Var2 = (byb0) obj2;
                                if (z9) {
                                }
                                SetBuilder b22 = t4r0.b();
                                while (r2.hasNext()) {
                                }
                                it6 = fzb0Var2.a().iterator();
                                while (it6.hasNext()) {
                                }
                                cVar.A = t4r0.a(b22);
                                exb0Var2 = exb0Var4;
                                exb0Var2.b(list14);
                                bVar4.getClass();
                                bVar4.h = null;
                                fcj0 fcj0Var522 = fcj0Var4;
                                fcj0Var522.d = null;
                                fcj0Var522.e = null;
                                it7 = exb0Var2.a.iterator();
                                while (it7.hasNext()) {
                                }
                                return zy11.a;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar2 = bVar4;
                                exb0Var2 = exb0Var4;
                                fcj0Var2 = fcj0Var4;
                                bVar2.getClass();
                                bVar2.h = null;
                                fcj0Var2.d = null;
                                fcj0Var2.e = null;
                                it = exb0Var2.a.iterator();
                                while (it.hasNext()) {
                                    wub0 wub0Var2 = (wub0) it.next();
                                    if (wub0Var2.a == PinCacheMode.TRANSIENT) {
                                        wub0Var2.b.clear();
                                    }
                                }
                                throw th;
                            }
                        }
                        boolean z17 = pinWarGo$sync$12.Z$0;
                        List list24 = (List) pinWarGo$sync$12.L$8;
                        List list25 = (List) pinWarGo$sync$12.L$7;
                        list = (List) pinWarGo$sync$12.L$6;
                        List list26 = (List) pinWarGo$sync$12.L$4;
                        b64.D(pinWarGo$sync$12.L$1);
                        pinInvalidationReason2 = (PinInvalidationReason) pinWarGo$sync$12.L$0;
                        kotlin.b.b(obj3);
                        z2 = z17;
                        qub0Var = qub0Var2;
                        list2 = list25;
                        list4 = list26;
                        bVar3 = bVar;
                        z3 = true;
                        list3 = list24;
                        r = obj3;
                        fzb0 fzb0Var5 = (fzb0) r;
                        q1c0 a16 = cVar.e().a();
                        a = a16 == null ? a16.a() : 0.0f;
                        f = cVar.z;
                        f2 = cVar.q;
                        if (f != null || f.floatValue() > f2 || a <= f2) {
                            f3 = f2;
                            z4 = false;
                        } else {
                            f3 = f2;
                            z4 = z3;
                        }
                        if (f != null) {
                            if (f.floatValue() > f3 && a <= f3) {
                                exb0Var3 = exb0Var;
                                z5 = z3;
                                List list27 = list3;
                                cVar.z = new Float(a);
                                if (z5) {
                                    try {
                                        List list28 = fzb0Var5.e;
                                        list5 = list;
                                        fcj0Var3 = fcj0Var;
                                        ArrayList arrayList11 = new ArrayList(tcc.n(list28, 10));
                                        Iterator it25 = list28.iterator();
                                        while (it25.hasNext()) {
                                            arrayList11.add(((qzb0) it25.next()).a());
                                        }
                                        list6 = arrayList11;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fcj0Var3 = fcj0Var;
                                        bVar2 = bVar3;
                                        exb0Var2 = exb0Var3;
                                        fcj0Var2 = fcj0Var3;
                                        bVar2.getClass();
                                        bVar2.h = null;
                                        fcj0Var2.d = null;
                                        fcj0Var2.e = null;
                                        it = exb0Var2.a.iterator();
                                        while (it.hasNext()) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    list5 = list;
                                    fcj0Var3 = fcj0Var;
                                    list6 = EmptyList.a;
                                }
                                List I = kotlin.collections.a.I(kotlin.collections.a.m0(list6, kotlin.collections.a.m0(fzb0Var5.d, list27)));
                                boolean z18 = (f != null || jl40.j(f, a)) ? false : z3;
                                List list29 = fzb0Var5.a;
                                boolean z19 = z18;
                                boolean z20 = z5;
                                ArrayList arrayList12 = new ArrayList(tcc.n(list29, 10));
                                it2 = list29.iterator();
                                while (it2.hasNext()) {
                                    arrayList12.add(((ezb0) it2.next()).a().a());
                                }
                                List a17 = fzb0Var5.a();
                                boolean z21 = z4;
                                ArrayList arrayList13 = new ArrayList(tcc.n(a17, 10));
                                it3 = a17.iterator();
                                while (it3.hasNext()) {
                                    arrayList13.add(((qzb0) it3.next()).a());
                                }
                                qub0Var.h(y(kotlin.collections.a.I(kotlin.collections.a.m0(arrayList13, arrayList12))));
                                ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.a v = v();
                                List list30 = fzb0Var5.a;
                                List list31 = fzb0Var5.b;
                                List a18 = fzb0Var5.a();
                                pinWarGo$sync$12.L$0 = pinInvalidationReason2;
                                pinWarGo$sync$12.L$1 = null;
                                pinWarGo$sync$12.L$2 = null;
                                pinWarGo$sync$12.L$3 = null;
                                pinWarGo$sync$12.L$4 = list4;
                                pinWarGo$sync$12.L$5 = null;
                                pinWarGo$sync$12.L$6 = null;
                                pinWarGo$sync$12.L$7 = list2;
                                pinWarGo$sync$12.L$8 = null;
                                pinWarGo$sync$12.L$9 = fzb0Var5;
                                pinWarGo$sync$12.L$10 = f;
                                pinWarGo$sync$12.L$11 = list6;
                                pinWarGo$sync$12.L$12 = I;
                                pinWarGo$sync$12.Z$0 = z2;
                                pinWarGo$sync$12.F$0 = a;
                                pinWarGo$sync$12.I$0 = z21 ? 1 : 0;
                                List list32 = list6;
                                pinWarGo$sync$12.I$1 = z20 ? 1 : 0;
                                pinWarGo$sync$12.I$2 = z19 ? 1 : 0;
                                pinWarGo$sync$12.label = 2;
                                f4 = f;
                                List list33 = list2;
                                e = v.e(list30, list31, a18, list5, a, pinWarGo$sync$12);
                                coroutineSingletons = coroutineSingletons3;
                                if (e == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                obj = e;
                                i2 = z19 ? 1 : 0;
                                fzb0Var = fzb0Var5;
                                i3 = z21 ? 1 : 0;
                                list7 = list4;
                                i4 = z20 ? 1 : 0;
                                f5 = a;
                                list8 = I;
                                z6 = z2;
                                list9 = list32;
                                list10 = list33;
                                pinInvalidationReason3 = pinInvalidationReason2;
                                lvb0 lvb0Var32 = (lvb0) obj;
                                CoroutineSingletons coroutineSingletons42 = coroutineSingletons;
                                boolean h22 = h();
                                list11 = list8;
                                List a72 = lvb0Var32.a();
                                List list192 = list9;
                                i5 = i2;
                                ArrayList arrayList22 = new ArrayList(tcc.n(a72, 10));
                                it4 = a72.iterator();
                                while (it4.hasNext()) {
                                }
                                List a82 = fzb0Var.a();
                                List<mwb0> list202 = fzb0Var.d;
                                List list212 = a82;
                                i6 = i4;
                                ArrayList arrayList32 = new ArrayList(tcc.n(list212, 10));
                                it5 = list212.iterator();
                                while (it5.hasNext()) {
                                }
                                qub0Var.h(y(kotlin.collections.a.I(kotlin.collections.a.m0(arrayList32, arrayList22))));
                                qub0Var.f(s(this.j, lvb0Var32.a(), fzb0Var.a(), list10));
                                LinkedHashSet<mwb0> linkedHashSet22 = new LinkedHashSet();
                                LinkedHashSet linkedHashSet32 = new LinkedHashSet();
                                z7 = this.p;
                                if (i5 == 0) {
                                }
                                z8 = z7;
                                list12 = list10;
                                LinkedHashSet x2 = x(lvb0Var32.a());
                                if (z8) {
                                }
                                if (z8) {
                                }
                                if (z8) {
                                }
                                list13 = fzb0Var.b;
                                LinkedHashSet linkedHashSet52 = linkedHashSet22;
                                if (i6 == 0) {
                                }
                                LinkedHashSet linkedHashSet82 = linkedHashSet52;
                                ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a w2 = w();
                                Map map3 = f7;
                                boolean z152 = this.j;
                                Map map22 = f6;
                                List a142 = lvb0Var32.a();
                                List a152 = fzb0Var.a();
                                pinWarGo$sync$12.L$0 = pinInvalidationReason3;
                                pinWarGo$sync$12.L$1 = null;
                                pinWarGo$sync$12.L$2 = null;
                                pinWarGo$sync$12.L$3 = null;
                                pinWarGo$sync$12.L$4 = list7;
                                pinWarGo$sync$12.L$5 = null;
                                pinWarGo$sync$12.L$6 = null;
                                pinWarGo$sync$12.L$7 = null;
                                pinWarGo$sync$12.L$8 = null;
                                pinWarGo$sync$12.L$9 = fzb0Var;
                                pinWarGo$sync$12.L$10 = null;
                                pinWarGo$sync$12.L$11 = null;
                                pinWarGo$sync$12.L$12 = null;
                                pinWarGo$sync$12.L$13 = lvb0Var32;
                                pinWarGo$sync$12.L$14 = null;
                                pinWarGo$sync$12.L$15 = null;
                                pinWarGo$sync$12.L$16 = null;
                                pinWarGo$sync$12.L$17 = null;
                                pinWarGo$sync$12.L$18 = null;
                                pinWarGo$sync$12.L$19 = null;
                                pinWarGo$sync$12.Z$0 = z6;
                                pinWarGo$sync$12.F$0 = f5;
                                pinWarGo$sync$12.I$0 = i3;
                                pinWarGo$sync$12.I$1 = i6;
                                PinInvalidationReason pinInvalidationReason72 = pinInvalidationReason3;
                                pinWarGo$sync$12.I$2 = i5;
                                pinWarGo$sync$12.Z$1 = h22;
                                pinWarGo$sync$12.label = 3;
                                List list232 = list7;
                                cVar = this;
                                float f122 = f5;
                                fcj0Var4 = fcj0Var3;
                                coroutineSingletons2 = coroutineSingletons42;
                                i7 = 4;
                                fzb0 fzb0Var42 = fzb0Var;
                                exb0Var4 = exb0Var3;
                                bVar4 = bVar3;
                                boolean z162 = z6;
                                z9 = h22;
                                int i182 = i3;
                                d = w2.d(z152, a142, list13, a152, list12, list11, z9, map22, map3, linkedHashSet82, linkedHashSet, pinWarGo$sync$12);
                                pinWarGo$sync$12 = pinWarGo$sync$12;
                                if (d != coroutineSingletons2) {
                                }
                            }
                        }
                        exb0Var3 = exb0Var;
                        z5 = false;
                        List list272 = list3;
                        cVar.z = new Float(a);
                        if (z5) {
                        }
                        List I2 = kotlin.collections.a.I(kotlin.collections.a.m0(list6, kotlin.collections.a.m0(fzb0Var5.d, list272)));
                        if (f != null) {
                        }
                        List list292 = fzb0Var5.a;
                        boolean z192 = z18;
                        boolean z202 = z5;
                        ArrayList arrayList122 = new ArrayList(tcc.n(list292, 10));
                        it2 = list292.iterator();
                        while (it2.hasNext()) {
                        }
                        List a172 = fzb0Var5.a();
                        boolean z212 = z4;
                        ArrayList arrayList132 = new ArrayList(tcc.n(a172, 10));
                        it3 = a172.iterator();
                        while (it3.hasNext()) {
                        }
                        qub0Var.h(y(kotlin.collections.a.I(kotlin.collections.a.m0(arrayList132, arrayList122))));
                        ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.a v2 = v();
                        List list302 = fzb0Var5.a;
                        List list312 = fzb0Var5.b;
                        List a182 = fzb0Var5.a();
                        pinWarGo$sync$12.L$0 = pinInvalidationReason2;
                        pinWarGo$sync$12.L$1 = null;
                        pinWarGo$sync$12.L$2 = null;
                        pinWarGo$sync$12.L$3 = null;
                        pinWarGo$sync$12.L$4 = list4;
                        pinWarGo$sync$12.L$5 = null;
                        pinWarGo$sync$12.L$6 = null;
                        pinWarGo$sync$12.L$7 = list2;
                        pinWarGo$sync$12.L$8 = null;
                        pinWarGo$sync$12.L$9 = fzb0Var5;
                        pinWarGo$sync$12.L$10 = f;
                        pinWarGo$sync$12.L$11 = list6;
                        pinWarGo$sync$12.L$12 = I2;
                        pinWarGo$sync$12.Z$0 = z2;
                        pinWarGo$sync$12.F$0 = a;
                        pinWarGo$sync$12.I$0 = z212 ? 1 : 0;
                        List list322 = list6;
                        pinWarGo$sync$12.I$1 = z202 ? 1 : 0;
                        pinWarGo$sync$12.I$2 = z192 ? 1 : 0;
                        pinWarGo$sync$12.label = 2;
                        f4 = f;
                        List list332 = list2;
                        e = v2.e(list302, list312, a182, list5, a, pinWarGo$sync$12);
                        coroutineSingletons = coroutineSingletons3;
                        if (e == coroutineSingletons) {
                        }
                    }
                }
                cVar.z = new Float(a);
                if (z5) {
                }
                List I22 = kotlin.collections.a.I(kotlin.collections.a.m0(list6, kotlin.collections.a.m0(fzb0Var5.d, list272)));
                if (f != null) {
                }
                List list2922 = fzb0Var5.a;
                boolean z1922 = z18;
                boolean z2022 = z5;
                ArrayList arrayList1222 = new ArrayList(tcc.n(list2922, 10));
                it2 = list2922.iterator();
                while (it2.hasNext()) {
                }
                List a1722 = fzb0Var5.a();
                boolean z2122 = z4;
                ArrayList arrayList1322 = new ArrayList(tcc.n(a1722, 10));
                it3 = a1722.iterator();
                while (it3.hasNext()) {
                }
                qub0Var.h(y(kotlin.collections.a.I(kotlin.collections.a.m0(arrayList1322, arrayList1222))));
                ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.a v22 = v();
                List list3022 = fzb0Var5.a;
                List list3122 = fzb0Var5.b;
                List a1822 = fzb0Var5.a();
                pinWarGo$sync$12.L$0 = pinInvalidationReason2;
                pinWarGo$sync$12.L$1 = null;
                pinWarGo$sync$12.L$2 = null;
                pinWarGo$sync$12.L$3 = null;
                pinWarGo$sync$12.L$4 = list4;
                pinWarGo$sync$12.L$5 = null;
                pinWarGo$sync$12.L$6 = null;
                pinWarGo$sync$12.L$7 = list2;
                pinWarGo$sync$12.L$8 = null;
                pinWarGo$sync$12.L$9 = fzb0Var5;
                pinWarGo$sync$12.L$10 = f;
                pinWarGo$sync$12.L$11 = list6;
                pinWarGo$sync$12.L$12 = I22;
                pinWarGo$sync$12.Z$0 = z2;
                pinWarGo$sync$12.F$0 = a;
                pinWarGo$sync$12.I$0 = z2122 ? 1 : 0;
                List list3222 = list6;
                pinWarGo$sync$12.I$1 = z2022 ? 1 : 0;
                pinWarGo$sync$12.I$2 = z1922 ? 1 : 0;
                pinWarGo$sync$12.label = 2;
                f4 = f;
                List list3322 = list2;
                e = v22.e(list3022, list3122, a1822, list5, a, pinWarGo$sync$12);
                coroutineSingletons = coroutineSingletons3;
                if (e == coroutineSingletons) {
                }
            } catch (Throwable th5) {
                th = th5;
                fcj0Var2 = fcj0Var;
                bVar2 = bVar3;
                exb0Var2 = exb0Var3;
                bVar2.getClass();
                bVar2.h = null;
                fcj0Var2.d = null;
                fcj0Var2.e = null;
                it = exb0Var2.a.iterator();
                while (it.hasNext()) {
                }
                throw th;
            }
            if (i != 0) {
            }
            fzb0 fzb0Var52 = (fzb0) r;
            q1c0 a162 = cVar.e().a();
            a = a162 == null ? a162.a() : 0.0f;
            f = cVar.z;
            f2 = cVar.q;
            if (f != null) {
            }
            f3 = f2;
            z4 = false;
            if (f != null) {
            }
            exb0Var3 = exb0Var;
            z5 = false;
            List list2722 = list3;
        } catch (Throwable th6) {
            th = th6;
            bVar2 = bVar;
            exb0Var2 = exb0Var;
            fcj0Var2 = fcj0Var;
        }
        pinWarGo$sync$1 = new PinWarGo$sync$1(cVar, continuationImpl);
        PinWarGo$sync$1 pinWarGo$sync$122 = pinWarGo$sync$1;
        Object obj32 = pinWarGo$sync$122.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinWarGo$sync$122.label;
        bVar = cVar.v;
        exb0Var = cVar.e;
        fcj0Var = cVar.r;
        qub0 qub0Var22 = cVar.t;
    }

    public final LinkedHashMap t(ArrayList arrayList, float f) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mwb0 mwb0Var = (mwb0) it.next();
            h041 e = this.u.e(f, mwb0Var instanceof g8c ? ((g8c) mwb0Var).c : mwb0Var.a());
            if (e != null) {
                linkedHashMap.put(mwb0Var, ((go10) this.m).b(e));
            }
        }
        return linkedHashMap;
    }

    public final LinkedHashMap u(ArrayList arrayList, Float f, float f2, boolean z) {
        Object obj;
        h041 e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qzb0 qzb0Var = (qzb0) it.next();
            mwb0 mwb0Var = qzb0Var.a;
            boolean z2 = mwb0Var instanceof g8c;
            if (z2) {
                obj = ((g8c) mwb0Var).c;
            } else if (z) {
                obj = mwb0Var.a();
            }
            ve61 ve61Var = this.u;
            if (!z2 || f == null) {
                e = f != null ? ve61Var.e(f.floatValue(), obj) : ve61Var.f(f2, obj);
            } else {
                e = ve61Var.g(f.floatValue(), obj);
                if (e == null) {
                    e = ve61Var.f(f2, obj);
                }
            }
            if (e != null) {
                linkedHashMap.put(qzb0Var.a, ((go10) this.m).b(e));
            }
        }
        return linkedHashMap;
    }

    public final ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.a v() {
        return this.w;
    }

    public final ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a w() {
        return this.x;
    }

    public final void z() {
        k8c k8cVar = this.a;
        yj70 yj70Var = (yj70) k8cVar.a();
        com.yandex.mapkit.map.Map map = (com.yandex.mapkit.map.Map) yj70Var.a;
        k8c k8cVar2 = new k8c(new l8c(com.yandex.go.places.map.ui.b.b(map.getCameraPosition().getTarget()), yj70Var.a(), map.getCameraPosition().getAzimuth(), map.getCameraPosition().getTilt()), k8cVar.b());
        y1c0 y1c0Var = this.s;
        new dzb0(k8cVar2, new m8c(y1c0Var.a.width(), y1c0Var.a.height()));
        ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b bVar = this.v;
        bVar.getClass();
        bVar.h = null;
    }
}
