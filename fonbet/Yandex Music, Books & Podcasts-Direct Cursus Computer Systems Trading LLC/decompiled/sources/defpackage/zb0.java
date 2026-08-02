package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.music.screen.artist.albums.data.ArtistApi;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class zb0 implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        drt drtVar;
        String str = 0;
        str = 0;
        int i = 1;
        switch (this.a) {
            case 0:
                return new sb0();
            case 1:
                return new yc0(l18.b.b(hag.I(rtl.class), true));
            case 2:
                return new qb0(l18.b.b(hag.I(et.class), true));
            case 3:
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new lc0((Context) qdcVar.C(I), l18Var.b(hag.I(eth.class), true));
            case 4:
                jyr jyrVar = cd0.e;
                return (cd0) ((byb) l18.b.c(hag.I(byb.class))).b(cd0.class);
            case 5:
                return (z66) l18.b.c(hag.I(z66.class));
            case 6:
                return new jd0();
            case 7:
                qs5 qs5Var = pm0.a;
                return null;
            case 8:
                return Boolean.valueOf(((gy4) ((byb) l18.b.c(hag.I(byb.class))).b(gy4.class)).h());
            case 9:
                throw new IllegalStateException("AppColors is not specified! You should provide app colors in the AppTheme function.");
            case 10:
                yxc yxcVar = (yxc) x97.D(g.a, new dt0(2, r4 ? 1 : 0, str));
                if (yxcVar != null && (drtVar = yxcVar.a) != null) {
                    str = drtVar.a;
                }
                return new fzc(str, yxcVar != null ? yxcVar.h : false);
            case 11:
                throw new IllegalStateException("AppThemeConfig instance is required for root theme call");
            case 12:
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 31);
            case 13:
                List list = qv0.d;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                }
                String str2 = Build.MANUFACTURER;
                str2.getClass();
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                return Boolean.valueOf(arrayList.contains(lowerCase2));
            case 14:
                Set<Map.Entry> entrySet = qv0.e.entrySet();
                int a = tah.a(v75.o(entrySet, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (Map.Entry entry : entrySet) {
                    String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    linkedHashMap.put(lowerCase3, entry.getValue());
                }
                String str3 = Build.MANUFACTURER;
                str3.getClass();
                String lowerCase4 = str3.toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                Object obj = linkedHashMap.get(lowerCase4);
                Object obj2 = obj;
                if (obj == null) {
                    obj2 = Float.valueOf(1.0f);
                }
                return Float.valueOf(((Number) obj2).floatValue());
            case 15:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(e0j.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return (g11) ((rci) ((e0j) qdcVar2.C(I2)).c.getValue()).a(ern.a(g11.class), g11.a);
            case 16:
                return Unit.a;
            case 17:
                return new td(5);
            case 18:
                return new td(i);
            case 19:
                return new td(3);
            case 20:
                return new td(6);
            case 21:
                return new td(4);
            case 22:
                return new td(8);
            case 23:
                return new td(7);
            case 24:
                return new wbb();
            case 25:
                return Unit.a;
            case 26:
                return (ArtistApi) l18.b.c(hag.I(ArtistApi.class));
            case 27:
                return (b71) l18.b.c(hag.I(b71.class));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Unit.a;
            default:
                return new zzc();
        }
    }

    public /* synthetic */ zb0(int i) {
        this.a = i;
    }
}
