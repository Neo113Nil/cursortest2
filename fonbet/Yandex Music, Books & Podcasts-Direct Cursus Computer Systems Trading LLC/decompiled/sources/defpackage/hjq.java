package defpackage;

import android.content.Context;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.simpleplaylist.SimplePlaylistBlockApi;
import com.yandex.music.shared.skeleton.blocks.simpleplaylist.SimplePlaylistBlockDataDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public class hjq {
    public final jyr a;

    public hjq(int i) {
        switch (i) {
            case 2:
                this.a = l18.b.b(hag.I(upq.class), true);
                break;
            case 3:
            default:
                this.a = l18.b.b(hag.I(y60.class), false);
                break;
            case 4:
                this.a = btf.b(wjp.y);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public ArrayList a(List list, e4m e4mVar) {
        ArrayList arrayList;
        ?? r0;
        list.getClass();
        if (list.size() > 6) {
            List subList = list.subList(0, 4);
            arrayList = new ArrayList(v75.o(subList, 10));
            Iterator it = subList.iterator();
            while (it.hasNext()) {
                arrayList.add(b((mqs) it.next()));
            }
        } else {
            List list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(b((mqs) it2.next()));
            }
        }
        if (list.size() > 6) {
            List subList2 = list.subList(4, list.size());
            r0 = new ArrayList(v75.o(subList2, 10));
            Iterator it3 = subList2.iterator();
            while (it3.hasNext()) {
                r0.add(b((mqs) it3.next()));
            }
        } else {
            r0 = c5b.a;
        }
        ArrayList arrayList2 = new ArrayList();
        if (e4mVar == null) {
            arrayList2.addAll(arrayList);
            arrayList2.addAll((Collection) r0);
            return arrayList2;
        }
        StationId stationId = e4mVar.a;
        o1u o1uVar = e4mVar.b;
        int ordinal = o1uVar.f.ordinal();
        if (ordinal == 0) {
            arrayList2.addAll(arrayList);
            arrayList2.add(new nzl(stationId, o1uVar));
            arrayList2.addAll((Collection) r0);
            return arrayList2;
        }
        if (ordinal == 1) {
            arrayList2.add(new nzl(stationId, o1uVar));
            arrayList2.addAll(arrayList);
            arrayList2.addAll((Collection) r0);
            return arrayList2;
        }
        if (ordinal != 2) {
            b6e.s();
            return null;
        }
        arrayList2.addAll(arrayList);
        arrayList2.addAll((Collection) r0);
        arrayList2.add(new nzl(stationId, o1uVar));
        return arrayList2;
    }

    public mzl b(mqs mqsVar) {
        mqsVar.getClass();
        return a4g.D(gys.NonMusicHolder, mqsVar) ? new lzl(((cej) this.a.getValue()).a(mqsVar, false), mqsVar) : new kzl(oo6.a.a(mqsVar), mqsVar);
    }

    public olr c(tyf tyfVar, plr plrVar) {
        z8h z8hVar;
        List list;
        List list2;
        List split$default;
        if (tyfVar instanceof x48) {
            return new b2c();
        }
        if (!(tyfVar instanceof zr7)) {
            b6e.s();
            return null;
        }
        zr7 zr7Var = (zr7) tyfVar;
        Context context = zr7Var.a;
        cr crVar = zr7Var.e;
        cke ckeVar = new cke(context);
        OkHttpClient okHttpClient = zr7Var.b;
        Executor executor = zr7Var.c;
        g06 g06Var = zr7Var.j;
        l4f l4fVar = (l4f) g06Var.a;
        ksa ksaVar = (ksa) g06Var.b;
        jyr jyrVar = this.a;
        ylr ylrVar = new ylr(okHttpClient, executor, l4fVar == null ? (l4f) jyrVar.getValue() : l4fVar, ckeVar, ksaVar, (wpt) g06Var.c);
        xgd xgdVar = new xgd(context);
        dyc dycVar = new dyc(context);
        l2j s = l2j.d.s(context);
        LinkedHashSet a = nzk.a(context);
        Object obj = ozr.i;
        mzr q = lsq.q(context, Integer.valueOf(plrVar.e));
        if (plrVar.g) {
            z8hVar = new bjq(ckeVar, (ujl) crVar.i);
        } else {
            Object obj2 = crVar.i;
            d1 d1Var = plrVar.d;
            d1Var.getClass();
            nnk nnkVar = new nnk();
            nnkVar.a = ckeVar;
            nnkVar.b = d1Var;
            z8hVar = nnkVar;
        }
        z8h z8hVar2 = z8hVar;
        i9w i9wVar = (i9w) crVar.e;
        y9w y9wVar = (y9w) crVar.f;
        ehv ehvVar = (ehv) crVar.g;
        gos gosVar = (gos) crVar.h;
        bs4 bs4Var = (bs4) crVar.d;
        ujl ujlVar = (ujl) crVar.i;
        rc rcVar = (rc) crVar.b;
        q08 q08Var = (q08) crVar.c;
        List list3 = zr7Var.f;
        list3.getClass();
        if (list3.isEmpty()) {
            list2 = c5b.a;
            list = list3;
        } else {
            List list4 = list3;
            list = list3;
            ArrayList arrayList = new ArrayList();
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                ylr ylrVar2 = ylrVar;
                xgd xgdVar2 = xgdVar;
                dyc dycVar2 = dycVar;
                split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{StringUtils.COMMA}, false, 2, 2, null);
                String str = (String) CollectionsKt.firstOrNull(split$default);
                Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
                dycVar = dycVar2;
                ylrVar = ylrVar2;
                xgdVar = xgdVar2;
            }
            list2 = arrayList;
        }
        ylr ylrVar3 = ylrVar;
        xgd xgdVar3 = xgdVar;
        dyc dycVar3 = dycVar;
        String str2 = (String) g06Var.d;
        String str3 = zr7Var.g;
        Map map = zr7Var.h;
        ScheduledExecutorService scheduledExecutorService = zr7Var.d;
        if (l4fVar == null) {
            l4fVar = (l4f) jyrVar.getValue();
        }
        slr slrVar = new slr(i9wVar, y9wVar, ehvVar, gosVar, bs4Var, q, ujlVar, ckeVar, rcVar, q08Var, a, list, list2, str2, str3, map, ylrVar3, scheduledExecutorService, l4fVar, s, dycVar3, xgdVar3, plrVar.a, plrVar.b, plrVar.c, plrVar.f, plrVar.d, ksaVar, z8hVar2, plrVar.h);
        b2c b2cVar = new b2c();
        osh oshVar = new osh();
        oshVar.a = slrVar;
        oshVar.b = b2cVar;
        oshVar.c = slrVar;
        return oshVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(uvn uvnVar, boolean z, cg6 cg6Var) {
        gjq gjqVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof gjq) {
            gjqVar = (gjq) cg6Var;
            int i2 = gjqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gjqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gjqVar.j;
                nm6 nm6Var = nm6.a;
                i = gjqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SimplePlaylistBlockDataDto>> a = ((SimplePlaylistBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    gjqVar.l = 1;
                    obj = swf.N(a, gjqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    ljq a2 = ((SimplePlaylistBlockDataDto) ((aii) biiVar).a).a();
                    return a2 == null ? new nj6(null) : new qj6(a2);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                }
                if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                }
                if (biiVar instanceof zhi) {
                    return uwf.J((zhi) biiVar);
                }
                b6e.s();
                return null;
            }
        }
        gjqVar = new gjq(this, cg6Var);
        Object obj2 = gjqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gjqVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public y60 e() {
        return (y60) this.a.getValue();
    }

    public String f() {
        return (String) this.a.getValue();
    }

    public hjq(t1f t1fVar) {
        this.a = l18.b.b(hag.I(cej.class), true);
    }

    public hjq(upq upqVar) {
        this.a = btf.b(new z26(upqVar, 3));
    }

    public hjq(Context context) {
        context.getClass();
        this.a = btf.b(new ji7(context, 7));
    }
}
