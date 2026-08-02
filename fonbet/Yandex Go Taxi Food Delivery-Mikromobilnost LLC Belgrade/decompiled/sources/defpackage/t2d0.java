package defpackage;

import com.yandex.plus.core.gradient.api.LinearGradientDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import skeletor.render.SkeletonContentView;

/* loaded from: classes2.dex */
public abstract class t2d0 {
    public static final ArrayList a;
    public static final List b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        Float valueOf2 = Float.valueOf(0.72f);
        Float valueOf3 = Float.valueOf(0.25f);
        Float valueOf4 = Float.valueOf(1.0f);
        Float valueOf5 = Float.valueOf(0.0f);
        Long valueOf6 = Long.valueOf(_Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        List g = scc.g(valueOf6, valueOf6, valueOf6);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
        }
        scc.g(valueOf5, valueOf, valueOf4);
        List g2 = scc.g(4286792175L, 4282345721L, Long.valueOf(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        ArrayList arrayList2 = new ArrayList(tcc.n(g2, 10));
        Iterator it2 = g2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf((int) ((Number) it2.next()).longValue()));
        }
        scc.g(valueOf5, valueOf, valueOf4);
        List g3 = scc.g(4294925389L, 4293609119L, 4286792175L, 4282345721L);
        ArrayList arrayList3 = new ArrayList(tcc.n(g3, 10));
        Iterator it3 = g3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf((int) ((Number) it3.next()).longValue()));
        }
        a = arrayList3;
        b = scc.g(valueOf5, valueOf3, valueOf2, valueOf4);
        List g4 = scc.g(4286792175L, 4282345721L);
        ArrayList arrayList4 = new ArrayList(tcc.n(g4, 10));
        Iterator it4 = g4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Integer.valueOf((int) ((Number) it4.next()).longValue()));
        }
        scc.g(valueOf5, valueOf4);
        List g5 = scc.g(4294925389L, 4293609119L, 4286792175L);
        ArrayList arrayList5 = new ArrayList(tcc.n(g5, 10));
        Iterator it5 = g5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Integer.valueOf((int) ((Number) it5.next()).longValue()));
        }
        scc.g(valueOf5, Float.valueOf(0.4f), valueOf4);
        List g6 = scc.g(4294919219L, 4293472404L, 4285869037L, 4280307960L);
        ArrayList arrayList6 = new ArrayList(tcc.n(g6, 10));
        Iterator it6 = g6.iterator();
        while (it6.hasNext()) {
            arrayList6.add(Integer.valueOf((int) ((Number) it6.next()).longValue()));
        }
        scc.g(valueOf5, valueOf3, valueOf2, valueOf4);
        List g7 = scc.g(4294919219L, 4293337740L, 4285275628L, 4279387384L);
        ArrayList arrayList7 = new ArrayList(tcc.n(g7, 10));
        Iterator it7 = g7.iterator();
        while (it7.hasNext()) {
            arrayList7.add(Integer.valueOf((int) ((Number) it7.next()).longValue()));
        }
        scc.g(valueOf5, valueOf3, valueOf2, valueOf4);
        List g8 = scc.g(4294309882L, 4293652991L);
        ArrayList arrayList8 = new ArrayList(tcc.n(g8, 10));
        Iterator it8 = g8.iterator();
        while (it8.hasNext()) {
            arrayList8.add(Integer.valueOf((int) ((Number) it8.next()).longValue()));
        }
        scc.g(valueOf5, valueOf4);
    }

    public static final LinearGradientDrawable a() {
        return new LinearGradientDrawable(90.0f, a, b);
    }
}
