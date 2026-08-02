package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import ru.yandex.music.chart.catalog.data.dto.AlbumsChartDto;

/* loaded from: classes5.dex */
public final class yg4 {
    public final zg4 a;

    public yg4(zg4 zg4Var) {
        this.a = zg4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0048, B:13:0x0050, B:16:0x0057, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0048, B:13:0x0050, B:16:0x0057, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, cg6 cg6Var) {
        vg4 vg4Var;
        int i;
        try {
            if (cg6Var instanceof vg4) {
                vg4Var = (vg4) cg6Var;
                int i2 = vg4Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vg4Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = vg4Var.j;
                    nm6 nm6Var = nm6.a;
                    i = vg4Var.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        zg4 zg4Var = this.a;
                        vg4Var.l = 1;
                        obj = zg4Var.w(z, vg4Var);
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
                    v20 a0 = y2x.a0((AlbumsChartDto) obj);
                    return a0 != null ? new nj6(null) : new qj6(a0);
                }
            }
            if (i != 0) {
            }
            v20 a02 = y2x.a0((AlbumsChartDto) obj);
            if (a02 != null) {
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
            return new oj6(btf.b(new ur(7, e4)));
        }
        vg4Var = new vg4(this, cg6Var);
        Object obj2 = vg4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = vg4Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0048, B:13:0x0050, B:16:0x0057, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0048, B:13:0x0050, B:16:0x0057, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, boolean z, cg6 cg6Var) {
        wg4 wg4Var;
        int i;
        try {
            if (cg6Var instanceof wg4) {
                wg4Var = (wg4) cg6Var;
                int i2 = wg4Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wg4Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = wg4Var.j;
                    nm6 nm6Var = nm6.a;
                    i = wg4Var.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        zg4 zg4Var = this.a;
                        wg4Var.l = 1;
                        obj = zg4Var.u(str, z, wg4Var);
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
                    v20 a0 = y2x.a0((AlbumsChartDto) obj);
                    return a0 != null ? new nj6(null) : new qj6(a0);
                }
            }
            if (i != 0) {
            }
            v20 a02 = y2x.a0((AlbumsChartDto) obj);
            if (a02 != null) {
            }
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError = e2.b;
            String name = musicBackendInvocationError.getName();
            String str2 = name == null ? "" : name;
            String message = musicBackendInvocationError.getMessage();
            return new kj6(e2.a, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(8, e4)));
        }
        wg4Var = new wg4(this, cg6Var);
        Object obj2 = wg4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = wg4Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0048, B:13:0x0050, B:16:0x0057, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0048, B:13:0x0050, B:16:0x0057, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, cg6 cg6Var) {
        xg4 xg4Var;
        int i;
        try {
            if (cg6Var instanceof xg4) {
                xg4Var = (xg4) cg6Var;
                int i2 = xg4Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xg4Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = xg4Var.j;
                    nm6 nm6Var = nm6.a;
                    i = xg4Var.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        zg4 zg4Var = this.a;
                        xg4Var.l = 1;
                        obj = zg4Var.I(z, xg4Var);
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
                    v20 a0 = y2x.a0((AlbumsChartDto) obj);
                    return a0 != null ? new nj6(null) : new qj6(a0);
                }
            }
            if (i != 0) {
            }
            v20 a02 = y2x.a0((AlbumsChartDto) obj);
            if (a02 != null) {
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
            return new oj6(btf.b(new ur(9, e4)));
        }
        xg4Var = new xg4(this, cg6Var);
        Object obj2 = xg4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = xg4Var.l;
    }
}
