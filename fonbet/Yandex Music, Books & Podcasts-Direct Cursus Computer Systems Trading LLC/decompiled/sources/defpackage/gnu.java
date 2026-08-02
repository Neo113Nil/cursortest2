package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.collectionwave.WaveButtonApi;
import com.yandex.music.shared.skeleton.blocks.collectionwave.WaveButtonColorsDto;
import com.yandex.music.shared.skeleton.blocks.collectionwave.WaveButtonDto;
import java.util.List;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class gnu {
    public final WaveButtonApi a;

    public gnu(e0j e0jVar) {
        this.a = (WaveButtonApi) e0jVar.a.b(WaveButtonApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        fnu fnuVar;
        int i;
        bii biiVar;
        gmu gmuVar;
        StationId f;
        String title;
        if (continuation instanceof fnu) {
            fnuVar = (fnu) continuation;
            int i2 = fnuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fnuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fnuVar.j;
                nm6 nm6Var = nm6.a;
                i = fnuVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WaveButtonDto>> a = this.a.a();
                    fnuVar.l = 1;
                    obj = swf.N(a, fnuVar);
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
                if (biiVar instanceof aii) {
                    if (!(biiVar instanceof xhi)) {
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
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                }
                WaveButtonDto waveButtonDto = (WaveButtonDto) ((aii) biiVar).a;
                waveButtonDto.getClass();
                String stationId = waveButtonDto.getStationId();
                if (stationId != null && (f = StationId.f(stationId)) != null && (title = waveButtonDto.getTitle()) != null) {
                    String header = waveButtonDto.getHeader();
                    String bgImageUrl = waveButtonDto.getBgImageUrl();
                    List E = tyf.E(waveButtonDto.getStationId(), waveButtonDto.getSeeds());
                    if (E != null) {
                        WaveButtonColorsDto colors = waveButtonDto.getColors();
                        String average = colors != null ? colors.getAverage() : null;
                        WaveButtonColorsDto colors2 = waveButtonDto.getColors();
                        gmuVar = new gmu(title, header, bgImageUrl, f, E, average, colors2 != null ? colors2.getWaveTextColor() : null);
                        return gmuVar != null ? new nj6(null) : new qj6(gmuVar);
                    }
                }
                gmuVar = null;
                if (gmuVar != null) {
                }
            }
        }
        fnuVar = new fnu(this, continuation);
        Object obj2 = fnuVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fnuVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
