package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;

/* loaded from: classes11.dex */
public abstract class uqb1 {
    public static final void a(MultimodalRouteFabState multimodalRouteFabState, tls tlsVar, BoundingBox boundingBox, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1264577945);
        int i2 = (btsVar.c(multimodalRouteFabState.ordinal()) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(boundingBox) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            rab1.b(null, wwg.S(-1638578060, true, new sg0(26, tlsVar), btsVar), null, null, null, wwg.S(278804088, true, new ru40(multimodalRouteFabState, tlsVar, boundingBox), btsVar), null, btsVar, 196656, 93);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ru40(multimodalRouteFabState, tlsVar, boundingBox, i);
        }
    }

    public static final ColorStateList b(Context context, Pair[] pairArr, boolean z) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(pair.c());
            arrayList2.add(pair.f());
        }
        Pair pair2 = new Pair(arrayList, arrayList2);
        List list = (List) pair2.getFirst();
        List list2 = (List) pair2.getSecond();
        ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (z) {
                intValue = context.getColor(intValue);
            }
            arrayList3.add(Integer.valueOf(intValue));
        }
        return new ColorStateList((int[][]) list.toArray(new int[0][]), a.I0(arrayList3));
    }

    public static boolean c(BaseActivity baseActivity, int i) {
        TypedValue typedValue = new TypedValue();
        baseActivity.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data != 0;
    }

    public static int d(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return context.getColor(typedValue.resourceId);
    }

    public static int e(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public static final pl3 f(String str) {
        return new pl3(str);
    }
}
