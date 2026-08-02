package defpackage;

import android.content.Context;
import com.yandex.music.shared.radio.data.network.VideoClipRotorApi;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.Vh;

/* loaded from: classes3.dex */
public final /* synthetic */ class xes implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xes(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke((oht) obj);
                return Unit.a;
            case 1:
                aqi aqiVar = (aqi) obj2;
                aqi aqiVar2 = (aqi) obj;
                if (((Boolean) aqiVar.getValue()).booleanValue()) {
                    aqiVar.setValue(Boolean.FALSE);
                } else if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    aqiVar2.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj2;
                FileChannel fileChannel = (FileChannel) obj;
                while (byteBuffer.hasRemaining()) {
                    if (fileChannel.write(byteBuffer) <= 0) {
                        kac.f("Save state is stalled");
                        return null;
                    }
                }
                return Unit.a;
            case 3:
                long b = ((x8a) obj2).b(bzf.s(Float.MAX_VALUE, Float.MAX_VALUE));
                ((Function2) obj).invoke(Float.valueOf(yzt.b(b)), Float.valueOf(yzt.c(b)));
                return Unit.a;
            case 4:
                ((x8a) obj2).f();
                ((Function0) obj).invoke();
                return Unit.a;
            case 5:
                return new w5l(((nrs) obj2).c.b, new jab(qkb.MyWave, 1, 3, 1), new thj(pkb.Wave, ((StationId) obj).h(), 1, 1, ""), null);
            case 6:
                ((i8l) obj2).x0((szs) obj);
                return Unit.a;
            case 7:
                return new bab((xba) obj2, (uaa) obj);
            case 8:
                i1t i1tVar = (i1t) obj2;
                return new vbb(i1tVar.b(), i1tVar.f(), i1tVar.m(), (qe3) ((uu5) obj).e);
            case 9:
                i1u i1uVar = (i1u) obj2;
                String str = (String) obj;
                try {
                    h1u h1uVar = i1uVar.a;
                    str.getClass();
                    return i1uVar.d((Vh.VhResponse) new g1u(h1uVar, str, null).invoke());
                } catch (IOException e) {
                    throw new ManifestLoadingException.ConnectionError(e, null, 2, null);
                } catch (ExecutionException e2) {
                    if (e2.getCause() instanceof IOException) {
                        throw new ManifestLoadingException.ConnectionError(e2.getCause(), null, 2, null);
                    }
                    throw e2;
                }
            case 10:
                alu aluVar = (alu) obj;
                cvo cvoVar = cvo.i;
                cvo b2 = o6m.b(wjb.BottomsheetScreen, (avo) obj2, 2);
                jab jabVar = new jab(qkb.MyWave, 1, 3, 1);
                pkb pkbVar = pkb.Wave;
                if (!(aluVar instanceof alu)) {
                    b6e.s();
                    return null;
                }
                String str2 = aluVar.a.a;
                str2.getClass();
                return new w5l(b2, jabVar, new thj(pkbVar, "track:".concat(str2), 1, 1, ""), null);
            case 11:
                Object b3 = i0j.a((i0j) ((z6u) obj2).c, null, new d4u((bhn) obj), new hft(18), null, 51).a.b(VideoClipRotorApi.class);
                b3.getClass();
                return (VideoClipRotorApi) b3;
            case 12:
                y8u y8uVar = (y8u) obj2;
                if (((Boolean) ((aqi) obj).getValue()).booleanValue()) {
                    y8uVar.b();
                } else {
                    y8uVar.d();
                }
                return Boolean.TRUE;
            case 13:
                rmu rmuVar = (rmu) obj2;
                hjl hjlVar = rmuVar.c;
                pkb pkbVar2 = pkb.Wave;
                String str3 = ((rr5) obj).a;
                str3.getClass();
                thj thjVar = new thj(pkbVar2, "track:".concat(str3), 1, 1, "");
                pkl pklVar = (pkl) rmuVar.c.c.getValue();
                hjlVar.getClass();
                pklVar.getClass();
                xmb xmbVar = hjlVar.d;
                cvo d = pklVar.d();
                nab nabVar = hjlVar.a;
                u0s u0sVar = (u0s) hjlVar.f.getValue();
                xmbVar.getClass();
                return xmb.c(thjVar, nabVar, u0sVar, d, 1);
            case 14:
                ((rpu) obj2).a();
                ((sai) obj).a();
                return Unit.a;
            case 15:
                ((sai) obj2).a();
                ((kqu) obj).a();
                return Unit.a;
            case 16:
                ((bru) obj2).a();
                ((sai) obj).a();
                return Unit.a;
            case 17:
                ((fpu) ((kpu) obj2)).a.invoke();
                ((sai) obj).a();
                return Unit.a;
            case 18:
                ((rpu) obj2).g(((aqu) obj).a);
                return Unit.a;
            case 19:
                dou douVar = ((vpu) obj).a;
                wjb wjbVar = wjb.AboutArtistScreen;
                ((rpu) obj2).f(douVar);
                return Unit.a;
            case 20:
                ((uru) obj2).J((lgq) obj);
                return Unit.a;
            case 21:
                ((zru) obj2).a(new co5((sai) obj, i2));
                return Unit.a;
            case 22:
                ((Function1) obj2).invoke((hsu) obj);
                return Unit.a;
            case 23:
                c3r c3rVar = (c3r) obj2;
                sai saiVar = (sai) obj;
                if (c3rVar != null) {
                    ((nw7) c3rVar).a();
                }
                saiVar.a();
                return Unit.a;
            case 24:
                return ost.a((Context) obj2, ((i1v) obj).a.c());
            case 25:
                t6k t6kVar = (t6k) obj;
                Float f = (Float) ((jap) obj2).b.getValue();
                return Float.valueOf(f != null ? f.floatValue() : t6kVar.e());
            case 26:
                n7v n7vVar = (n7v) obj2;
                m6v m6vVar = ((z8v) obj).a;
                n7vVar.getClass();
                m6vVar.getClass();
                rmb.a(n7vVar.b, sjb.Dislike, n7vVar.b(m6vVar), null, 10);
                n7vVar.d.a(o6v.c, n7vVar.a().r);
                n7vVar.h.setValue(n7vVar, n7v.j[0], x97.y(n7vVar.a, null, null, new zts(n7vVar, null == true ? 1 : 0, 23), 3));
                return Unit.a;
            case 27:
                ((r4v) obj2).c(((aav) obj).b);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((r4v) obj2).c(((eav) obj).b);
                return Unit.a;
            default:
                r4v r4vVar = (r4v) obj;
                fav favVar = (fav) ((aqi) obj2).getValue();
                eav eavVar = favVar instanceof eav ? (eav) favVar : null;
                if (eavVar != null) {
                    r4vVar.c(eavVar.b);
                }
                return Unit.a;
        }
    }
}
