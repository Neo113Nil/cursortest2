package defpackage;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.t;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.skeleton.data.core.api.skeleton.SkeletonJsonAdapter;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final /* synthetic */ class v5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        tx3 tx3Var;
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        Continuation continuation = null;
        int i4 = 1;
        switch (this.a) {
            case 0:
                return obj == ((w5) this.b) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                x6f x6fVar = (x6f) this.b;
                w4f w4fVar = (w4f) obj;
                w4fVar.getClass();
                x6fVar.N(w4fVar, (String) CollectionsKt.Y(x6fVar.a));
                return Unit.a;
            case 2:
                b bVar = (b) this.b;
                Map.Entry entry = (Map.Entry) obj;
                i7 i7Var = b.c;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == bVar ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != bVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 3:
                ge geVar = (ge) this.b;
                List list = (List) obj;
                list.getClass();
                ArrayList<he> arrayList = ((sd) geVar.a.a).b;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                for (he heVar : arrayList) {
                    String str = heVar.d;
                    String str2 = heVar.e;
                    String str3 = heVar.a;
                    String e = heVar.c.e(wct.s(), WebPath$Storage.AVATARS);
                    String a = heVar.b.a();
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.d(((zd) it.next()).a, str2)) {
                                z = true;
                                arrayList2.add(new ie(str, str3, e, a, str2, z));
                            }
                        }
                    }
                    z = false;
                    arrayList2.add(new ie(str, str3, e, a, str2, z));
                }
                return arrayList2;
            case 4:
                am amVar = (am) this.b;
                ((oa8) obj).getClass();
                return new hi(i4, amVar);
            case 5:
                e00 e00Var = (e00) this.b;
                ((l13) obj).getClass();
                qne qneVar = (qne) e00Var.b;
                return new tmb(12, (fnb) qneVar.a, (cvo) qneVar.b);
            case 6:
                apo apoVar = (apo) this.b;
                obj.getClass();
                ja0 ja0Var = (ja0) ((Function1) apoVar.c).invoke(obj);
                if (ja0Var != null) {
                    return new za0(ja0Var);
                }
                return null;
            case 7:
                e00 e00Var2 = (e00) this.b;
                ((l13) obj).getClass();
                return new vwk(new efo(8, (bc0) e00Var2.b));
            case 8:
                String str4 = (String) obj;
                o11 o11Var = ((yi1) this.b).q;
                o11Var.getClass();
                str4.getClass();
                tnb tnbVar = (tnb) o11Var.b.getValue();
                avo avoVar = o11Var.a.e;
                tnb.f(tnbVar, str4, "deeplink", "deeplink", avoVar.b, avoVar.a.a, 0, 96);
                return Unit.a;
            case 9:
                rdk rdkVar = (rdk) this.b;
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(inq.class, new SkeletonJsonAdapter((gnq) rdkVar.g));
                return Unit.a;
            case 10:
                e00 e00Var3 = (e00) this.b;
                ((l13) obj).getClass();
                return (kg2) ((fg2) e00Var3.b).a.getValue();
            case 11:
                e00 e00Var4 = (e00) this.b;
                ((l13) obj).getClass();
                return new no2(e00Var4);
            case 12:
                e00 e00Var5 = (e00) this.b;
                ((l13) obj).getClass();
                return new ro2(e00Var5);
            case 13:
                y93 y93Var = (y93) this.b;
                ((Boolean) obj).getClass();
                ob3 ob3Var = y93Var.a;
                ie5 ie5Var = ob3Var.m;
                if (((z66) ob3Var.p.getValue()).g()) {
                    ob3Var.J();
                    ie5Var.c();
                } else {
                    ie5Var.f();
                }
                return Unit.a;
            case 14:
                tf3 tf3Var = (tf3) this.b;
                ((jx7) obj).getClass();
                float f = 2;
                return new enj((Float.floatToRawIntBits(r14.n0(tf3Var.a.e - f)) << 32) | (Float.floatToRawIntBits(r14.n0(f)) & 4294967295L));
            case 15:
                e00 e00Var6 = (e00) this.b;
                ((l13) obj).getClass();
                return (xj3) ((jk3) e00Var6.b).a.getValue();
            case 16:
                d54 d54Var = (d54) this.b;
                mm6 mm6Var = (mm6) obj;
                mm6Var.getClass();
                d54Var.j = false;
                d54Var.l(mm6Var);
                return Unit.a;
            case 17:
                dd4 dd4Var = (dd4) this.b;
                ((fwd) obj).getClass();
                y8p y8pVar = dd4Var.c;
                fos fosVar = (fos) y8pVar.b;
                hwd hwdVar = (hwd) y8pVar.c;
                fosVar.getClass();
                mns mnsVar = (mns) x97.D(g.a, new glp(fosVar, continuation, 28));
                String str5 = mnsVar != null ? "OAuth " + mnsVar : null;
                if (str5 == null) {
                    return null;
                }
                s2i s2iVar = new s2i();
                fwd.b(s2iVar, "Authorization", str5);
                fwd.b(s2iVar, "Accept-Language", hwdVar.d.a(hwdVar.a));
                fwd.b(s2iVar, "X-Yandex-Music-Client", "YandexMusicAndroid/24026391");
                tfs tfsVar = tfs.f;
                Date date = new Date(System.currentTimeMillis());
                tfsVar.getClass();
                String format = tfsVar.a().format(date);
                format.getClass();
                fwd.b(s2iVar, "X-Yandex-Music-Client-Now", format);
                fwd.b(s2iVar, "X-Yandex-Music-Content-Type", ((ezb) hwdVar.c.a.getValue()).a().a);
                e5b.a.getClass();
                q5b.a.getClass();
                b5b.a.getClass();
                return s2iVar;
            case 18:
                ff4 ff4Var = (ff4) this.b;
                Toolbar toolbar = (Toolbar) obj;
                toolbar.getClass();
                t l = ff4Var.l();
                l.getClass();
                ((hq0) l).setSupportActionBar(toolbar);
                return Unit.a;
            case 19:
                um4 um4Var = (um4) this.b;
                tm4 tm4Var = (tm4) obj;
                tm4Var.getClass();
                String str6 = tm4Var.a;
                return (um4Var.b.size() <= 1 || um4Var.a == pgp.d) ? str6 : hrg.q("(", str6, ")");
            case 20:
                c1t c1tVar = (c1t) this.b;
                String str7 = (String) obj;
                str7.getClass();
                pdp pdpVar = (pdp) c1tVar.d;
                pdpVar.getClass();
                ConcurrentHashMap concurrentHashMap = pdpVar.f;
                return (concurrentHashMap == null || (tx3Var = (tx3) concurrentHashMap.get(str7)) == null) ? (tx3) pdpVar.e.get(str7) : tx3Var;
            case 21:
                qs4 qs4Var = ((ys4) this.b).c;
                if (qs4Var != null) {
                    return qs4Var.a;
                }
                return null;
            case 22:
                st4 st4Var = (st4) this.b;
                ((oa8) obj).getClass();
                st4Var.h();
                return new hi(6, st4Var);
            case 23:
                ut4 ut4Var = (ut4) this.b;
                me5 me5Var = (me5) obj;
                me5Var.getClass();
                if (ut4Var.f) {
                    ut4Var.b.d(ut4.a(me5Var));
                }
                return me5Var.a();
            case 24:
                tv4 tv4Var = (tv4) this.b;
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                mv4 mv4Var = tv4Var.c;
                mv4Var.getClass();
                int i5 = ArtistScreenActivity.w0;
                t tVar = mv4Var.a;
                tVar.startActivity(l48.p(tVar, u51Var, d.f(u51Var.a, u51Var.b), null, 24));
                return Unit.a;
            case 25:
                bz4 bz4Var = (bz4) this.b;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                pvfVar.a(new String[]{"COLLECTION_DOWNLOADED_ARTISTS"}, new az4(bz4Var, i3));
                pvfVar.a(new String[]{"COLLECTION_DOWNLOADED_TRACKS"}, new az4(bz4Var, i4));
                pvfVar.a(new String[]{y35.CONNECTIVITY_INFO_OFFLINE.b}, new az4(bz4Var, i2));
                pvfVar.a(new String[]{"COLLECTION_DOWNLOADED_SECTIONS"}, new az4(bz4Var, i));
                return Unit.a;
            case 26:
                v25 v25Var = (v25) this.b;
                ((Boolean) obj).booleanValue();
                v25Var.a();
                return Unit.a;
            case 27:
                e00 e00Var7 = (e00) this.b;
                ((l13) obj).getClass();
                return (c65) ((n65) e00Var7.b).a.getValue();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jk5 jk5Var = (jk5) this.b;
                Map map = (Map) obj;
                map.getClass();
                return ((rk5) jk5Var.f).a(map);
            default:
                hvb hvbVar = (hvb) this.b;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, new wn5(new mo5(hvbVar, i3), -1482425777, true), 3);
                vuf.Y(vufVar, null, new wn5(new mo5(hvbVar, i4), 1127700166, true), 3);
                vuf.Y(vufVar, null, new wn5(new mo5(hvbVar, i2), -280510585, true), 3);
                return Unit.a;
        }
    }
}
