package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.dto.ActionButtonDto;
import com.yandex.music.shared.dto.VibeButtonDto;
import com.yandex.music.shared.dto.playlist.ChartDto;
import com.yandex.music.shared.dto.playlist.ChartResultDto;
import com.yandex.music.shared.dto.playlist.chart.ChartTrackDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.ChartApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class pf4 {
    public final ChartApi a;
    public final qf4 b;

    public pf4(e0j e0jVar) {
        this.a = (ChartApi) e0jVar.a.b(ChartApi.class);
        this.b = (qf4) ((rci) e0jVar.c.getValue()).a(ern.a(qf4.class), qf4.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static gf4 c(ChartResultDto chartResultDto) {
        ?? r3;
        VibeButtonDto vibeButtonInfo;
        ActionButtonDto actionInfo;
        List<ChartTrackDto> chartTracks;
        ChartDto chart = chartResultDto.getChart();
        r1u r1uVar = null;
        if (chart == null) {
            return null;
        }
        cvl I = uwf.I(chart);
        ChartDto chart2 = chartResultDto.getChart();
        if (chart2 == null || (chartTracks = chart2.getChartTracks()) == null) {
            r3 = c5b.a;
        } else {
            r3 = new ArrayList();
            for (ChartTrackDto chartTrackDto : chartTracks) {
                rf4 L = chartTrackDto != null ? wct.L(chartTrackDto) : null;
                if (L != null) {
                    r3.add(L);
                }
            }
        }
        ChartDto chart3 = chartResultDto.getChart();
        ff I0 = (chart3 == null || (actionInfo = chart3.getActionInfo()) == null) ? null : zsd.I0(actionInfo);
        ChartDto chart4 = chartResultDto.getChart();
        if (chart4 != null && (vibeButtonInfo = chart4.getVibeButtonInfo()) != null) {
            r1uVar = u1g.S(vibeButtonInfo);
        }
        return new gf4(I0, I, r1uVar, r3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x004a, B:13:0x0052, B:16:0x0059, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x004a, B:13:0x0052, B:16:0x0059, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, cg6 cg6Var) {
        nf4 nf4Var;
        int i;
        try {
            if (cg6Var instanceof nf4) {
                nf4Var = (nf4) cg6Var;
                int i2 = nf4Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nf4Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = nf4Var.j;
                    nm6 nm6Var = nm6.a;
                    i = nf4Var.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        qf4 qf4Var = this.b;
                        ChartApi chartApi = this.a;
                        nf4Var.l = 1;
                        obj = qf4Var.O(z, chartApi, nf4Var);
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
                    qe4 J = wct.J((ChartResultDto) obj);
                    return J != null ? new nj6(null) : new qj6(J);
                }
            }
            if (i != 0) {
            }
            qe4 J2 = wct.J((ChartResultDto) obj);
            if (J2 != null) {
            }
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError = e2.b;
            String name = musicBackendInvocationError.getName();
            String str = name == null ? "" : name;
            String message = musicBackendInvocationError.getMessage();
            return new kj6(e2.a, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(5, e4)));
        }
        nf4Var = new nf4(this, cg6Var);
        Object obj2 = nf4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = nf4Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: IOException -> 0x0029, IllegalRequestOnNetworkModeException -> 0x002c, MusicCommonHttpException -> 0x002f, MusicBackendHttpException -> 0x0032, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002c, MusicBackendHttpException -> 0x0032, MusicCommonHttpException -> 0x002f, IOException -> 0x0029, blocks: (B:11:0x0025, B:12:0x004f, B:14:0x005a, B:17:0x0061, B:22:0x003f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: IOException -> 0x0029, IllegalRequestOnNetworkModeException -> 0x002c, MusicCommonHttpException -> 0x002f, MusicBackendHttpException -> 0x0032, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002c, MusicBackendHttpException -> 0x0032, MusicCommonHttpException -> 0x002f, IOException -> 0x0029, blocks: (B:11:0x0025, B:12:0x004f, B:14:0x005a, B:17:0x0061, B:22:0x003f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, cg6 cg6Var) {
        of4 of4Var;
        int i;
        pf4 pf4Var;
        try {
            if (cg6Var instanceof of4) {
                of4Var = (of4) cg6Var;
                int i2 = of4Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    of4Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = of4Var.k;
                    nm6 nm6Var = nm6.a;
                    i = of4Var.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qf4 qf4Var = this.b;
                        ChartApi chartApi = this.a;
                        of4Var.j = this;
                        of4Var.m = 1;
                        obj = qf4Var.O(z, chartApi, of4Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        pf4Var = this;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pf4Var = of4Var.j;
                        qgg.h0(obj);
                    }
                    pf4Var.getClass();
                    gf4 c = c((ChartResultDto) obj);
                    return c != null ? new nj6(null) : new qj6(c);
                }
            }
            if (i != 0) {
            }
            pf4Var.getClass();
            gf4 c2 = c((ChartResultDto) obj);
            if (c2 != null) {
            }
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError = e2.b;
            String name = musicBackendInvocationError.getName();
            String str = name == null ? "" : name;
            String message = musicBackendInvocationError.getMessage();
            return new kj6(e2.a, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(6, e4)));
        }
        of4Var = new of4(this, cg6Var);
        Object obj2 = of4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = of4Var.m;
    }
}
