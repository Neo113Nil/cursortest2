package defpackage;

import android.content.Context;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.history.data.network.converters.MusicHistoryContextJsonDeserializer;
import com.yandex.music.shared.history.data.network.converters.MusicHistoryFullModelJsonDeserializer;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context;
import com.yandex.pulse.metrics.o;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* loaded from: classes.dex */
public final /* synthetic */ class p1i implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ p1i(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return s1i.a;
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new vxr((Context) l13Var.a(hag.I(Context.class)), (z66) l13Var.a(hag.I(z66.class)));
            case 2:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, k2i.class).E(new p1i(3));
                o18Var.b(hag.I(q3s.class)).E(new p1i(4));
                return Unit.a;
            case 3:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(e0j.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new k2i((e0j) qdcVar.C(I));
            case 4:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(e0j.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return new q3s((e0j) qdcVar2.C(I2));
            case 5:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return (String) matchResult.a().get(1);
            case 6:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                long j = d85.b;
                float n0 = opfVar.n0(8);
                jpa.B(opfVar, j, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(n0) & 4294967295L), 0L, 0.0f, null, 8, 60);
                return Unit.a;
            case 7:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, v7i.class).D(new p1i(8));
                o18Var2.c(t8i.a);
                return Unit.a;
            case 8:
                ((l13) obj).getClass();
                return new v7i();
            case 9:
                ((jfp) obj).getClass();
                return Unit.a;
            case 10:
                ((jfp) obj).getClass();
                return Unit.a;
            case 11:
                bsf bsfVar = (bsf) obj;
                bsfVar.getClass();
                ArrayList arrayList = new ArrayList(8);
                for (int i = 0; i < 8; i++) {
                    arrayList.add(Unit.a);
                }
                bsfVar.Y(arrayList.size(), null, new vv(arrayList, 24), new wn5(new lh0(3, arrayList), 699646206, true));
                return Unit.a;
            case 12:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, o8i.class).E(new p1i(13));
                o18Var3.b(hag.I(h4j.class)).E(new p1i(14));
                return Unit.a;
            case 13:
                ((l13) obj).getClass();
                return new o8i();
            case 14:
                ((l13) obj).getClass();
                return new h4j();
            case 15:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.k(-1.0f);
                return Unit.a;
            case 16:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                Float valueOf = Float.valueOf(0.0f);
                long j2 = d85.b;
                return np3Var.b(new g83(y9w.U(new Pair[]{new Pair(valueOf, new d85(d85.b(j2, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14)))}, 14), 8));
            case 17:
                ((l13) obj).getClass();
                return new tli();
            case 18:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new nli((i0j) l13Var2.a.D(hag.I(i0j.class), l13Var2, l13Var2.b));
            case 19:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(ili.class, new MusicHistoryFullModelJsonDeserializer());
                gsonBuilder.b(MusicHistoryModelDto$Context.class, new MusicHistoryContextJsonDeserializer());
                return Unit.a;
            case 20:
                cmi cmiVar = (cmi) obj;
                cmiVar.getClass();
                return cmiVar.getClass();
            case 21:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                wfp.x(jfpVar, -3.0f);
                return Unit.a;
            case 22:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.w(jfpVar2);
                wfp.x(jfpVar2, -2.0f);
                return Unit.a;
            case 23:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(20, null, vsf.v, kg5.e);
                return Unit.a;
            case 24:
                Date date = (Date) obj;
                date.getClass();
                LocalDate d = gkg.d(date);
                d.getClass();
                LocalDate d2 = gkg.d(new Date(System.currentTimeMillis()));
                if (gkg.b(d, d2)) {
                    String format = gkg.a.format(d);
                    format.getClass();
                    return new tki(format);
                }
                LocalDate minusDays = d2.minusDays(1L);
                minusDays.getClass();
                if (gkg.b(d, minusDays)) {
                    String format2 = gkg.a.format(d);
                    format2.getClass();
                    return new uki(format2);
                }
                LocalDate minusDays2 = d2.minusDays(2L);
                minusDays2.getClass();
                if (gkg.b(d, minusDays2)) {
                    String format3 = gkg.a.format(d);
                    format3.getClass();
                    return new rki(format3);
                }
                if (d.getYear() == d2.getYear()) {
                    String format4 = gkg.a.format(d);
                    format4.getClass();
                    return new ski(format4);
                }
                String format5 = gkg.b.format(d);
                format5.getClass();
                return new ski(format5);
            case 25:
                return (xyk) vz1.l((l13) obj, ubn.class);
            case 26:
                return (frt) vz1.l((l13) obj, dqi.class);
            case 27:
                ((jfp) obj).getClass();
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                np3 np3Var2 = (np3) obj;
                np3Var2.getClass();
                return np3Var2.a(new g83(new o6g(u75.h(new d85(c3x.h(4291372799L)), new d85(c3x.h(4283049727L))), null, 0L, 9187343241974906880L, 2), 11));
            default:
                np3 np3Var3 = (np3) obj;
                np3Var3.getClass();
                return np3Var3.a(new g83(new o6g(u75.h(new d85(c3x.h(4291372799L)), new d85(c3x.h(4283049727L))), null, 0L, 9187343241974906880L, 2), 10));
        }
    }
}
