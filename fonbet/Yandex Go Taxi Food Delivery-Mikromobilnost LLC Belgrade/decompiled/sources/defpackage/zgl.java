package defpackage;

import android.view.View;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.offline.b;
import com.google.android.gms.tasks.Task;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexDocumentParserExtensionsModule;
import com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import flex.core.loader.network.e;
import java.util.List;
import org.webrtc.EglThread;

/* loaded from: classes4.dex */
public final /* synthetic */ class zgl implements r131, ev31, sty, qi2, jhe, fkm0, ax, o0m, w001, bx60, pmm, EglThread.ReleaseMonitor, zfo, vls, ruy, iy60, pke, xxw0, xu, mi2 {
    public final /* synthetic */ int a;

    public /* synthetic */ zgl(int i) {
        this.a = i;
    }

    @Override // defpackage.qi2
    public void a(tg2 tg2Var, IllegalArgumentException illegalArgumentException) {
    }

    @Override // defpackage.vls, defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return new j5h((y3c) obj);
    }

    @Override // defpackage.sty
    public boolean b(List list) {
        return list.size() >= 1;
    }

    @Override // defpackage.mi2
    public void c(ki2 ki2Var) {
        FlexDocumentParserExtensionsModule.provideAnimationDocumentParserExtension$lambda$0(ki2Var);
    }

    @Override // defpackage.zfo
    public cgo create() {
        return cgo.e2;
    }

    @Override // defpackage.fkm0
    public void e(zjm0 zjm0Var) {
        h5z0.a.d(zjm0Var.toString(), new Object[0]);
    }

    @Override // defpackage.o0m
    public m0m g(e eVar) {
        return eVar;
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        int i;
        switch (this.a) {
            case 25:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.jhe
    public void i(pge pgeVar) {
        h5z0.a.d(pgeVar.toString(), new Object[0]);
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        xxc0 xxc0Var = (xxc0) obj;
        switch (this.a) {
            case 21:
                xxc0Var.onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
                break;
            default:
                xxc0Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // defpackage.ax
    public void j(jw jwVar) {
        h5z0.a.d(jwVar.toString(), new Object[0]);
    }

    @Override // defpackage.xu
    public void k(kr krVar, Throwable th) {
        FlexActionHandlersModule.provideActionDispatcherFactory$lambda$1(krVar, th);
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        switch (this.a) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d && doubleValue <= 1.0d) {
                    break;
                }
                break;
            case 1:
            case 6:
            default:
                if (((Long) obj).longValue() > 0) {
                    break;
                }
                break;
            case 2:
                double doubleValue2 = ((Double) obj).doubleValue();
                if (doubleValue2 >= 0.0d && doubleValue2 <= 1.0d) {
                    break;
                }
                break;
            case 3:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 4:
                if (((Double) obj).doubleValue() > 0.0d) {
                    break;
                }
                break;
            case 5:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 7:
                if (((Long) obj).longValue() > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 _init_$lambda$0;
        n751 applyWindowInsets$lambda$3;
        switch (this.a) {
            case 15:
                _init_$lambda$0 = DriveHostView._init_$lambda$0(view, n751Var);
                return _init_$lambda$0;
            default:
                applyWindowInsets$lambda$3 = ErrorFragment.applyWindowInsets$lambda$3(view, n751Var);
                return applyWindowInsets$lambda$3;
        }
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 23:
                jst.e.k(exc, "geofence remove failed");
                break;
            default:
                jst.e.k(exc, "geofence add failed");
                break;
        }
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        boolean lambda$create$1;
        lambda$create$1 = EglThread.lambda$create$1(eglThread);
        return lambda$create$1;
    }

    @Override // defpackage.w001
    public void onTrackSelectionsInvalidated() {
        int i = b.m;
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        Throwable th;
        u8j0 u8j0Var = ((njl) obj).a;
        mjl mjlVar = (mjl) u8j0Var.a();
        rr51 rr51Var = mjlVar != null ? mjlVar.a : null;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        return new qjl(rr51Var, (s8j0Var == null || (th = s8j0Var.a) == null) ? null : r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534), (u8j0Var instanceof t8j0 ? (t8j0) u8j0Var : null) != null ? pc70.a : null);
    }

    @Override // defpackage.pmm
    public void release() {
    }
}
