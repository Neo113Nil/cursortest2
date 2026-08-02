package defpackage;

import android.content.Context;
import android.media.UnsupportedSchemeException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule;
import io.flutter.embedding.engine.FlutterJNI;
import java.security.spec.InvalidKeySpecException;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes4.dex */
public final /* synthetic */ class qir implements a3q0, tu00, xu, ax, jhe, fkm0, vls, kno, iy60, u5v, ims, r131, zbv, nuw, j6x, d5s0, m9y, c9e, y80 {
    public final /* synthetic */ int a;

    public /* synthetic */ qir(int i) {
        this.a = i;
    }

    public static void h(String str) {
        FlutterJNI.lambda$loadLibrary$0(str);
    }

    public static /* synthetic */ void m(Object obj) {
        throw new InvalidKeySpecException("Unsupported keySpec type: " + obj);
    }

    public static /* synthetic */ void o(Object obj, Object obj2) {
        throw new NoSuchElementException("Dependencies " + obj + ((Object) " do not exist in ") + obj2 + '!');
    }

    public static /* synthetic */ void p(String str) {
        throw new NotImplementedError(str);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5 + obj6 + obj7);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Throwable th) {
        throw new RuntimeException(str + obj + obj2, th);
    }

    @Override // defpackage.tu00
    public OkHttpClient a(yd5 yd5Var) {
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.f(scc.g(Protocol.HTTP_2, Protocol.HTTP_1_1));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.x = bg61.b(30000L, timeUnit);
        aVar.b(30000L, timeUnit);
        aVar.g(30000L, timeUnit);
        aVar.d(yd5Var);
        return new OkHttpClient(aVar);
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.kno
    public mno acquireExoMediaDrm(UUID uuid) {
        try {
            try {
                return new rfs(uuid);
            } catch (UnsupportedDrmException unused) {
                lk91.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + Extension.DOT_CHAR);
                return new y2n();
            }
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    @Override // defpackage.vls, defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        switch (this.a) {
            case 8:
                kqx kqxVar = (kqx) obj;
                return kqxVar.a + Extension.COLON_SPACE + kqxVar.b;
            case 10:
                return (uzz0) obj;
            case 14:
                hou houVar = (hou) obj;
                houVar.q();
                return ImmutableList.l(u.b(houVar.d0.b, new s2u0(17)));
            default:
                r8v r8vVar = w8v.B;
                return null;
        }
    }

    @Override // defpackage.nuw
    public boolean b(sfr sfrVar, sfr sfrVar2) {
        return a.b(sfrVar, sfrVar2);
    }

    @Override // defpackage.a3q0
    public void c(k1q0 k1q0Var) {
    }

    @Override // defpackage.d5s0
    public boolean d() {
        return false;
    }

    @Override // defpackage.fkm0
    public void e(zjm0 zjm0Var) {
        FlexParsersModule.provideScaffoldParser$lambda$2(zjm0Var);
    }

    @Override // defpackage.u5v
    public boolean f(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.zbv
    public rbv g(Context context, int i, int i2) {
        switch (this.a) {
            case 18:
                break;
            case 25:
                break;
        }
        return new nbv(txg0.ybsdk_ic_yb_placeholder, null);
    }

    @Override // defpackage.jhe
    public void i(pge pgeVar) {
        FlexParsersModule.provideContentParser$lambda$1(pgeVar);
    }

    @Override // defpackage.ax
    public void j(jw jwVar) {
        FlexParsersModule.provideActionParser$lambda$0(jwVar);
    }

    @Override // defpackage.xu
    public void k(kr krVar, Throwable th) {
        h5z0.a.f(th, "UrbanAdsSdk: Failed to dispatch action " + krVar, new Object[0]);
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // defpackage.y80
    public boolean n(String str) {
        return true;
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m("GoogleSmsRetrieverMethod");
        e5z0Var.a("Error starting sms retriever: " + exc, new Object[0]);
    }

    @Override // defpackage.j6x
    public void x() {
    }
}
