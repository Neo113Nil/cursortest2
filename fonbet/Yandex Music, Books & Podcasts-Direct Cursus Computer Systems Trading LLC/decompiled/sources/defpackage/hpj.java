package defpackage;

import android.content.res.Resources;
import androidx.compose.animation.a;
import androidx.compose.animation.c;
import com.google.gson.GsonBuilder;
import com.yandex.music.skeleton.blocks.pay_offers.data.PayOffersDtoJsonDeserializer;
import com.yandex.music.skeleton.blocks.pay_offers.data.dto.PayOffersEntityDto;
import com.yandex.passport.api.b2;
import com.yandex.passport.api.h;
import com.yandex.passport.common.url.b;
import com.yandex.passport.internal.network.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import ru.yandex.music.paywalloptions.PaywallOptionsActivity;

/* loaded from: classes6.dex */
public final /* synthetic */ class hpj implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hpj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = null;
        int i = 3;
        int i2 = 0;
        switch (this.a) {
            case 0:
                jnb jnbVar = (jnb) obj;
                jnbVar.getClass();
                cvo p = jnbVar.getP();
                if (p == null) {
                    return "unknown";
                }
                avo avoVar = p.e;
                pkb pkbVar = avoVar.a;
                pkb pkbVar2 = pkb.NonApplicable;
                wjb wjbVar = p.a;
                if (pkbVar == pkbVar2) {
                    return wjbVar.a;
                }
                return wjbVar.a + "(" + ((Object) ("type=" + pkbVar + ", id=" + avoVar.b)) + ")";
            case 1:
                ((mm6) obj).getClass();
                return Unit.a;
            case 2:
                ((mm6) obj).getClass();
                return Unit.a;
            case 3:
                ((Long) obj).longValue();
                return Unit.a;
            case 4:
                ((hl0) obj).getClass();
                e9b e = c.e(null, 3);
                vpb f = c.f(null, 3);
                int i3 = a.b;
                return new zd6(e, f);
            case 5:
                ((hl0) obj).getClass();
                e9b e2 = c.e(null, 3);
                vpb f2 = c.f(null, 3);
                int i4 = a.b;
                return new zd6(e2, f2);
            case 6:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.j(-8.0f);
                return Unit.a;
            case 7:
                ((jfp) obj).getClass();
                return Unit.a;
            case 8:
                ((jfp) obj).getClass();
                return Unit.a;
            case 9:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 0);
                return Unit.a;
            case 10:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.e(jfpVar2);
                return Unit.a;
            case 11:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.e(jfpVar3);
                return Unit.a;
            case 12:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, qvj.class).D(new hpj(13));
                o18Var.b(hag.I(hvj.class)).D(new hpj(14));
                o18Var.b(hag.I(ivj.class)).D(new hpj(15));
                return Unit.a;
            case 13:
                ((l13) obj).getClass();
                return new qvj();
            case 14:
                ((l13) obj).getClass();
                return hvj.a;
            case 15:
                ((l13) obj).getClass();
                return ivj.a;
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                String obj2 = StringsKt.t0(str2).toString();
                Locale locale = Locale.US;
                return ouj.s(locale, obj2, locale);
            case 17:
                ((jfp) obj).getClass();
                return Unit.a;
            case 18:
                ((IntRange) obj).getClass();
                return Unit.a;
            case 19:
                ((psf) obj).getClass();
                return new ypd(fgq.o(psf.c));
            case 20:
                o oVar = (o) obj;
                oVar.getClass();
                b2 b2Var = b2.c;
                String str3 = StringsKt.U("https://passport.yandex.com/am") ? null : "https://passport.yandex.com/am";
                if (str3 != null) {
                    if (!StringsKt.M(str3, "://", false)) {
                        str3 = "https://".concat(str3);
                    }
                    b bVar = new b(str3);
                    if (!b.n(str3)) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        str = bVar.a;
                    }
                }
                LinkedHashMap linkedHashMap = oVar.a;
                if (str == null) {
                    Set keySet = linkedHashMap.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : keySet) {
                        if (((Pair) obj3).a == b2Var) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.remove((Pair) it.next());
                    }
                } else {
                    h[] values = h.values();
                    int length = values.length;
                    while (i2 < length) {
                        linkedHashMap.put(new Pair(b2Var, values[i2].a), str);
                        i2++;
                    }
                }
                return Unit.a;
            case 21:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(PayOffersEntityDto.class, new PayOffersDtoJsonDeserializer());
                return Unit.a;
            case 22:
                ((jfp) obj).getClass();
                return Unit.a;
            case 23:
                yxc yxcVar = (yxc) obj;
                yxcVar.getClass();
                return Boolean.valueOf(yxcVar.h);
            case 24:
                int i5 = PaywallOptionsActivity.v;
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 25:
                vz1.e((o18) obj, mik.class).D(new hpj(26));
                return Unit.a;
            case 26:
                ((l13) obj).getClass();
                return new mik();
            case 27:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, sw0.class).D(new hpj(28));
                o18Var2.b(hag.I(mh7.class)).E(new hpj(29));
                o18Var2.b(hag.I(ljk.class)).D(new mjk(i2));
                o18Var2.b(hag.I(pjk.class)).D(new mjk(1));
                o18Var2.b(hag.I(njk.class)).D(new mjk(2));
                o18Var2.b(hag.I(ojk.class)).D(new mjk(i));
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(cc7.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new ww0((cc7) qdcVar.D(I, l13Var, set), (zzp) qdcVar.D(hag.I(zzp.class), l13Var, set));
            default:
                ((l13) obj).getClass();
                return new mh7();
        }
    }
}
