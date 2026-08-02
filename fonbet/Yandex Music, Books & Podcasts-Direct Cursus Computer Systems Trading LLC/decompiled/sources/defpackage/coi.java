package defpackage;

import android.content.Context;
import android.database.DatabaseUtils;
import android.os.Build;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.dto.album.AlbumRelatedContentBlockDto;
import com.yandex.music.shared.dto.album.AlbumRelatedContentJsonAdapter;
import com.yandex.music.shared.dto.artist.DecomposedDto;
import com.yandex.music.shared.dto.track.TrackDto$TrackDtoTypeAdapter$Companion$factory$1;
import com.yandex.music.shared.myshelf.data.remote.MyShelfApi;
import com.yandex.music.shared.myshelf.data.remote.MyShelfBlockDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfBlockDtoJsonAdapter;
import com.yandex.music.shared.myshelf.data.remote.MyShelfEntityDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfEntityDtoJsonAdapter;
import com.yandex.pulse.metrics.o;
import defpackage.g5g;
import defpackage.h5g;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IParamsCallback;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final /* synthetic */ class coi implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ coi(fni fniVar) {
        this.a = 17;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final int i = 0;
        final int i2 = 1;
        switch (this.a) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                ou3 ou3Var = opfVar.a;
                if (opfVar.getLayoutDirection() == xof.a) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (ou3Var.e() >> 32)) - opfVar.n0(doi.a);
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L));
                    nsh nshVar = ou3Var.b;
                    long B = nshVar.B();
                    nshVar.s().r();
                    try {
                        ((xzi) nshVar.b).W(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        opfVar.a();
                    } finally {
                        vz1.A(nshVar, B);
                    }
                } else {
                    opfVar.a();
                }
                return Unit.a;
            case 1:
                String str = (String) obj;
                return hrg.A(str, "'", str, "'");
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                String sqlEscapeString = DatabaseUtils.sqlEscapeString(str2);
                sqlEscapeString.getClass();
                return sqlEscapeString;
            case 3:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(MyShelfBlockDto.class, new MyShelfBlockDtoJsonAdapter());
                gsonBuilder.b(MyShelfEntityDto.class, new MyShelfEntityDtoJsonAdapter());
                return Unit.a;
            case 4:
                vz1.e((o18) obj, gui.class).E(new coi(5));
                return Unit.a;
            case 5:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(i0j.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Object b = i0j.a((i0j) qdcVar.C(I), null, new coi(3), new u5i(11), null, 51).a.b(MyShelfApi.class);
                b.getClass();
                return new gui((MyShelfApi) b);
            case 6:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 0);
                return Unit.a;
            case 7:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.q(jfpVar2, 0);
                return Unit.a;
            case 8:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.d(1);
                return Unit.a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mn2 mn2Var = mn2.a;
                if (booleanValue) {
                    return mn2Var;
                }
                return null;
            case 10:
                Exception exc = (Exception) obj;
                exc.getClass();
                ssg.a(6, "NetworkCache", "Exception in toJson in NetworkCache#put", exc);
                return Unit.a;
            case 11:
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                ssg.a(6, "NetworkCache", "Exception in fromJson in NetworkCache#get", exc2);
                return Unit.a;
            case 12:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, l7b.class).E(new coi(13));
                o18Var.b(hag.I(ioi.class)).D(new coi(14));
                o18Var.b(hag.I(wbo.class)).E(new coi(15));
                o18Var.b(hag.I(a6e.class)).E(new coi(16));
                return Unit.a;
            case 13:
                ((l13) obj).getClass();
                boolean z = zni.a;
                String str3 = zni.a ? "https://mobile.api.music.yandex.net/" : null;
                if (str3 == null) {
                    oii[] oiiVarArr = oii.a;
                    str3 = "https://api.music.yandex.net/";
                }
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(le7.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                xhr[] xhrVarArr = xhr.a;
                bdt I3 = hag.I(le7.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                return new l7b(str3);
            case 14:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new ioi((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b));
            case 15:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                i0j i0jVar = (i0j) l13Var2.a.D(hag.I(i0j.class), l13Var2, l13Var2.b);
                return new wbo(i0jVar.d, i0jVar, i0jVar.n);
            case 16:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I4 = hag.I(Context.class);
                qdc qdcVar4 = l13Var3.a;
                Set set = l13Var3.b;
                return new a6e(new kpm(new File(((Context) qdcVar4.D(I4, l13Var3, set)).getCacheDir(), "http_network_cache")), (i0j) qdcVar4.D(hag.I(i0j.class), l13Var3, set), (uyt) qdcVar4.D(hag.I(uyt.class), l13Var3, set));
            case 17:
                GsonBuilder gsonBuilder2 = (GsonBuilder) obj;
                gsonBuilder2.getClass();
                gsonBuilder2.e.add(new TrackDto$TrackDtoTypeAdapter$Companion$factory$1());
                gsonBuilder2.b(DecomposedDto.class, new DecomposedDto.GsonDeserializer());
                gsonBuilder2.b(h5g.class, new JsonDeserializer<h5g>() { // from class: com.yandex.music.shared.dto.playlist.LikesResponseDto$GsonDeserializer
                    @Override // com.google.gson.JsonDeserializer
                    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                        jsonElement.getClass();
                        type.getClass();
                        jsonDeserializationContext.getClass();
                        if (!(jsonElement instanceof JsonObject)) {
                            return g5g.a;
                        }
                        Object a = jsonDeserializationContext.a(jsonElement, LikesResponseDto$UpdatedLibrary.class);
                        a.getClass();
                        return (h5g) a;
                    }
                });
                gsonBuilder2.b(AlbumRelatedContentBlockDto.class, new AlbumRelatedContentJsonAdapter());
                return Unit.a;
            case 18:
                ((l13) obj).getClass();
                return new fos();
            case 19:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new l0t(i0j.a((i0j) l13Var4.a.D(hag.I(i0j.class), l13Var4, l13Var4.b), null, null, null, null, 63), new e4(l13Var4));
            case 20:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, fos.class).E(new coi(18));
                o18Var2.b(hag.I(hfb.class)).E(new coi(22));
                o18Var2.b(hag.I(w1j.class)).E(new coi(23));
                o18Var2.b(hag.I(a0j.class)).E(new coi(24));
                o18Var2.b(hag.I(lxf.class)).E(new coi(25));
                o18Var2.b(hag.I(i0j.class)).E(new coi(26));
                o18Var2.b(hag.I(hwd.class)).E(new coi(27));
                o18Var2.b(hag.I(q76.class)).E(new coi(28));
                o18Var2.b(hag.I(uyt.class)).E(new coi(29));
                o18Var2.b(hag.I(l0t.class)).E(new coi(19));
                o18Var2.b(hag.I(q02.class)).E(new coi(21));
                return Unit.a;
            case 21:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                bdt I5 = hag.I(fos.class);
                qdc qdcVar5 = l13Var5.a;
                Set set2 = l13Var5.b;
                return new q02((fos) qdcVar5.D(I5, l13Var5, set2), (t9w) qdcVar5.D(hag.I(t9w.class), l13Var5, set2));
            case 22:
                ((l13) obj).getClass();
                return new hfb();
            case 23:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new w1j(l1b.d((Context) l13Var6.a(hag.I(Context.class))));
            case 24:
                return (a0j) vz1.l((l13) obj, w1j.class);
            case 25:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                Context context = (Context) l13Var7.a.D(hag.I(Context.class), l13Var7, l13Var7.b);
                lxf lxfVar = new lxf(context);
                AppMetricaYandex.requestStartupParams(context, new kxf(lxfVar), IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED);
                return lxfVar;
            case 26:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I6 = hag.I(gni.class);
                qdc qdcVar6 = l13Var8.a;
                Set set3 = l13Var8.b;
                gni gniVar = (gni) qdcVar6.D(I6, l13Var8, set3);
                fni fniVar = (fni) qdcVar6.D(hag.I(fni.class), l13Var8, set3);
                lxf lxfVar2 = (lxf) qdcVar6.D(hag.I(lxf.class), l13Var8, set3);
                Context context2 = (Context) qdcVar6.D(hag.I(Context.class), l13Var8, set3);
                hfb hfbVar = (hfb) qdcVar6.D(hag.I(hfb.class), l13Var8, set3);
                hwd hwdVar = (hwd) qdcVar6.D(hag.I(hwd.class), l13Var8, set3);
                b3i b3iVar = new b3i((it0) qdcVar6.D(hag.I(it0.class), l13Var8, set3));
                q76 q76Var = (q76) qdcVar6.D(hag.I(q76.class), l13Var8, set3);
                q02 q02Var = (q02) qdcVar6.D(hag.I(q02.class), l13Var8, set3);
                gst gstVar = (gst) qdcVar6.D(hag.I(gst.class), l13Var8, set3);
                faw fawVar = (faw) gniVar;
                d9w d9wVar = fawVar.w;
                c5b c5bVar = c5b.a;
                List list = fawVar.x;
                p9w p9wVar = fawVar.y;
                c5bVar.getClass();
                list.getClass();
                ozi oziVar = fniVar.b;
                Function0 function0 = oziVar.f;
                ard ardVar = new ard();
                ardVar.a(new kc(12, function0, hfbVar));
                ardVar.a(new coi(fniVar));
                if (d9wVar != null) {
                    ardVar.a(d9wVar);
                }
                jp0 jp0Var = new jp0(oziVar.a, gstVar, p9wVar != null ? (voj) p9wVar.invoke() : voj.b, oziVar.b, c5bVar, c5bVar, "https://api.music.yandex.net/");
                final osh oshVar = new osh();
                oshVar.a = context2;
                oshVar.b = btf.a(bwf.b, new Function0() { // from class: jv2
                    /* JADX WARN: Type inference failed for: r2v10, types: [arf, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                Context context3 = (Context) oshVar.a;
                                return Boolean.valueOf(new File(context3.getDataDir(), "libsslMetrica").exists() || new File(context3.getDataDir(), "libssl").exists());
                            default:
                                ForkJoinPool forkJoinPool = new ForkJoinPool(32, new kv2(), null, false);
                                z98 z98Var = new z98();
                                z98Var.c = forkJoinPool;
                                z98Var.m(32);
                                z98Var.n();
                                joj jojVar = new joj();
                                jojVar.d(u75.h(izm.HTTP_2, izm.HTTP_1_1));
                                jojVar.b = new ozw(5);
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                jojVar.c(15L, timeUnit);
                                jojVar.e(20L, timeUnit);
                                jojVar.g(20L);
                                jojVar.a = z98Var;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    jojVar.c.add(new n56(4));
                                }
                                osh oshVar2 = oshVar;
                                if (((Boolean) oshVar2.b.getValue()).booleanValue()) {
                                    nxf nxfVar = new nxf((Context) oshVar2.a);
                                    jojVar.f(new mxf(nxfVar), nxfVar);
                                }
                                return new OkHttpClient(jojVar);
                        }
                    }
                });
                x97.y(cmd.a, dm6.b, null, new ox1(oshVar, null, 3), 2);
                oshVar.c = btf.b(new Function0() { // from class: jv2
                    /* JADX WARN: Type inference failed for: r2v10, types: [arf, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                Context context3 = (Context) oshVar.a;
                                return Boolean.valueOf(new File(context3.getDataDir(), "libsslMetrica").exists() || new File(context3.getDataDir(), "libssl").exists());
                            default:
                                ForkJoinPool forkJoinPool = new ForkJoinPool(32, new kv2(), null, false);
                                z98 z98Var = new z98();
                                z98Var.c = forkJoinPool;
                                z98Var.m(32);
                                z98Var.n();
                                joj jojVar = new joj();
                                jojVar.d(u75.h(izm.HTTP_2, izm.HTTP_1_1));
                                jojVar.b = new ozw(5);
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                jojVar.c(15L, timeUnit);
                                jojVar.e(20L, timeUnit);
                                jojVar.g(20L);
                                jojVar.a = z98Var;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    jojVar.c.add(new n56(4));
                                }
                                osh oshVar2 = oshVar;
                                if (((Boolean) oshVar2.b.getValue()).booleanValue()) {
                                    nxf nxfVar = new nxf((Context) oshVar2.a);
                                    jojVar.f(new mxf(nxfVar), nxfVar);
                                }
                                return new OkHttpClient(jojVar);
                        }
                    }
                });
                return new i0j(oshVar, jp0Var, new h50(list, 5), context2, new cr(oziVar, lxfVar2), ardVar, q76Var, q02Var, b3iVar, hwdVar);
            case 27:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                bdt I7 = hag.I(gni.class);
                qdc qdcVar7 = l13Var9.a;
                Set set4 = l13Var9.b;
                gni gniVar2 = (gni) qdcVar7.D(I7, l13Var9, set4);
                Context context3 = (Context) qdcVar7.D(hag.I(Context.class), l13Var9, set4);
                fos fosVar = (fos) qdcVar7.D(hag.I(fos.class), l13Var9, set4);
                gaw gawVar = (gaw) qdcVar7.D(hag.I(gaw.class), l13Var9, set4);
                iqg iqgVar = (iqg) qdcVar7.D(hag.I(iqg.class), l13Var9, set4);
                w4i w4iVar = new w4i(2, gniVar2, gni.class, "onAuthHeaderSet", "onAuthHeaderSet(Lokhttp3/Request$Builder;Lokhttp3/Request;)Lokhttp3/Request$Builder;", 0, 6);
                faw fawVar2 = (faw) gniVar2;
                return new hwd(context3, fosVar, gawVar, iqgVar, w4iVar, fawVar2.z, fawVar2.A, fawVar2.n);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new q76((a0j) l13Var10.a.D(hag.I(a0j.class), l13Var10, l13Var10.b), l13Var10.b(hag.I(z66.class), true));
            default:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new uyt(new qsh(l13Var11.b(hag.I(iqg.class), true), (Context) l13Var11.a.D(hag.I(Context.class), l13Var11, l13Var11.b)), new c76(l13Var11.b(hag.I(frt.class), true), 17));
        }
    }

    public /* synthetic */ coi(int i) {
        this.a = i;
    }
}
