package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.ExifInterface;
import android.net.Uri;
import androidx.camera.core.ImageCaptureException;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.plus.navigation.a;
import com.yandex.go.plus.api.purchase.AddCardResolution;
import com.yandex.go.plus.pay.presentation.d;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentPollingResult;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.ui.core.theme.PlusTheme;
import com.ybsdk.feature.qr.api.QrReaderContentCameraPermission;
import com.ybsdk.feature.qr.api.QrReaderContentInfo;
import com.ybsdk.feature.qr.api.QrReaderContentLogo;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.flow.e;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.entities.exceptions.CameraException;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class y4a0 implements ryj0, bwy0, u8v, w0r, nsd0, bbe0, au5, jdg0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public y4a0(pwy0 pwy0Var, tse tseVar, b5d0 b5d0Var) {
        PlusTheme plusTheme;
        this.a = 15;
        this.b = b5d0Var;
        ike M = bvf0.M(tseVar, gtq0.i());
        d dVar = new d(pwy0Var.a(), this);
        xsr0.a.getClass();
        q2u0 q2u0Var = wsr0.b;
        int i = vgd0.a[pwy0Var.getThemeType().ordinal()];
        if (i == 1) {
            plusTheme = PlusTheme.LIGHT;
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            plusTheme = PlusTheme.DARK;
        }
        this.c = e.R(dVar, M, q2u0Var, plusTheme);
    }

    public static ArrayList b(y4a0 y4a0Var, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = hvc0.b[PlatformChannel$SystemUiOverlay.a(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                arrayList.add(PlatformChannel$SystemUiOverlay.TOP_OVERLAYS);
            } else if (i2 == 2) {
                arrayList.add(PlatformChannel$SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static PlatformChannel$SystemUiMode c(y4a0 y4a0Var, String str) {
        int i = hvc0.c[PlatformChannel$SystemUiMode.a(str).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? PlatformChannel$SystemUiMode.EDGE_TO_EDGE : PlatformChannel$SystemUiMode.EDGE_TO_EDGE : PlatformChannel$SystemUiMode.IMMERSIVE_STICKY : PlatformChannel$SystemUiMode.IMMERSIVE : PlatformChannel$SystemUiMode.LEAN_BACK;
    }

    public static wrr e(y4a0 y4a0Var, JSONObject jSONObject) {
        return new wrr(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? PlatformChannel$Brightness.a(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? PlatformChannel$Brightness.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")), 22);
    }

    @Override // defpackage.au5
    public zt5 a(c5p c5pVar, long j) {
        long position = c5pVar.getPosition();
        int min = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, c5pVar.getLength() - position);
        ef90 ef90Var = (ef90) this.c;
        ef90Var.H(min);
        c5pVar.g(0, min, ef90Var.a);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (ef90Var.a() >= 4) {
            if (wer.f(ef90Var.b, ef90Var.a) != 442) {
                ef90Var.L(1);
            } else {
                ef90Var.L(4);
                long c = ayf0.c(ef90Var);
                if (c != -9223372036854775807L) {
                    long b = ((sez0) this.b).b(c);
                    if (b > j) {
                        return j2 == -9223372036854775807L ? new zt5(-1, b, position) : new zt5(0, -9223372036854775807L, position + i2);
                    }
                    j2 = b;
                    long j3 = 100000 + j2;
                    i2 = ef90Var.b;
                    if (j3 > j) {
                        return new zt5(0, -9223372036854775807L, position + i2);
                    }
                }
                int i3 = ef90Var.c;
                if (ef90Var.a() >= 10) {
                    ef90Var.L(9);
                    int y = ef90Var.y() & 7;
                    if (ef90Var.a() >= y) {
                        ef90Var.L(y);
                        if (ef90Var.a() >= 4) {
                            if (wer.f(ef90Var.b, ef90Var.a) == 443) {
                                ef90Var.L(4);
                                int E = ef90Var.E();
                                if (ef90Var.a() < E) {
                                    ef90Var.K(i3);
                                } else {
                                    ef90Var.L(E);
                                }
                            }
                            while (true) {
                                if (ef90Var.a() < 4) {
                                    break;
                                }
                                int f = wer.f(ef90Var.b, ef90Var.a);
                                if (f == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                ef90Var.L(4);
                                if (ef90Var.a() < 2) {
                                    ef90Var.K(i3);
                                    break;
                                }
                                ef90Var.K(Math.min(ef90Var.c, ef90Var.b + ef90Var.E()));
                            }
                        } else {
                            ef90Var.K(i3);
                        }
                    } else {
                        ef90Var.K(i3);
                    }
                } else {
                    ef90Var.K(i3);
                }
                i = ef90Var.b;
            }
        }
        return j2 != -9223372036854775807L ? new zt5(-2, j2, position + i) : zt5.d;
    }

    @Override // defpackage.nsd0
    public void d(wqw wqwVar) {
        a aVar = (a) this.c;
        z80 z80Var = (z80) wqwVar;
        PaymentMethod$Type a = z80Var.e().a();
        boolean z = z80Var.b;
        if (z && a != null) {
            aVar.Q.c.a.l(new m6a0(a, z80Var.c(), null));
        }
        bjd0 bjd0Var = (bjd0) this.b;
        aVar.getClass();
        aVar.L.a(z ? AddCardResolution.SUCCESS : AddCardResolution.FAILED, bjd0Var.a);
    }

    @Override // defpackage.w0r
    public void f(long j, long j2) {
    }

    public boolean g() {
        return ((Boolean) ((i3y) this.b).getValue()).booleanValue();
    }

    public List h() {
        return (List) this.b;
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        switch (this.a) {
            case 1:
                PaymentKitError paymentKitError = (PaymentKitError) obj;
                ((bga0) this.c).b = new xfa0(paymentKitError);
                ryj0 ryj0Var = (ryj0) this.b;
                if (ryj0Var != null) {
                    ryj0Var.i(paymentKitError);
                    break;
                }
                break;
            case 22:
                ((rwe0) this.c).Z((mwe0) this.b);
                break;
            default:
                dy40 dy40Var = ((rwe0) this.b).A;
                xry0 xry0Var = yry0.a;
                dy40Var.l(new kwe0((PaymentKitError) obj, yry0.a.m));
                break;
        }
    }

    @Override // defpackage.u8v
    public void j(ImageCaptureException imageCaptureException) {
        j18 j18Var = (j18) this.c;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result.Failure(new CameraException(imageCaptureException)));
        }
    }

    @Override // defpackage.u8v
    public void k(reu reuVar) {
        j18 j18Var = (j18) this.c;
        Uri uri = (Uri) reuVar.b;
        if (uri == null) {
            uri = Uri.fromFile(((bhb0) this.b).d);
        }
        String path = uri.getPath();
        if (path != null) {
            int attributeInt = new ExifInterface(path).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                ej91.b(180.0f, path);
            } else if (attributeInt == 6) {
                ej91.b(90.0f, path);
            } else if (attributeInt != 8) {
                ej91.b(0.0f, path);
            } else {
                ej91.b(270.0f, path);
            }
        }
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(zy11.a);
        }
    }

    @Override // defpackage.bwy0
    public int l() {
        return ((Boolean) ((u290) this.b).invoke((Context) this.c)).booleanValue() ? k1i0.YbSdk_PsdkTheme_Dark : k1i0.YbSdk_PsdkTheme_Light;
    }

    @Override // defpackage.au5
    public void m() {
        ef90 ef90Var = (ef90) this.c;
        byte[] bArr = tw21.c;
        ef90Var.getClass();
        ef90Var.I(bArr.length, bArr);
    }

    public hdg0 n() {
        QrReaderContentCameraPermission cameraPermission = ((b) this.c).h().getCameraPermission();
        if (cameraPermission != null) {
            return cameraPermission.toEntity();
        }
        return null;
    }

    public QrReaderContentInfo o() {
        return ((b) this.c).h().getInfo();
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 1:
                PaymentPollingResult paymentPollingResult = (PaymentPollingResult) obj;
                ((bga0) this.c).b = new aga0(paymentPollingResult);
                ryj0 ryj0Var = (ryj0) this.b;
                if (ryj0Var != null) {
                    ryj0Var.onSuccess(paymentPollingResult);
                    break;
                }
                break;
            case 22:
                mwe0 mwe0Var = (mwe0) this.b;
                mwe0 mwe0Var2 = new mwe0((List) obj, mwe0Var.b, mwe0Var.c);
                rwe0 rwe0Var = (rwe0) this.c;
                rwe0Var.A.l(mwe0Var2);
                rwe0Var.Z(mwe0Var2);
                break;
            default:
                rwe0 rwe0Var2 = (rwe0) this.b;
                ArrayList arrayList = rwe0Var2.C;
                PaymentMethod paymentMethod = (PaymentMethod) this.c;
                arrayList.remove(paymentMethod);
                rwe0Var2.z.l(null);
                rwe0Var2.A.l(new owe0(paymentMethod));
                rwe0Var2.c.postDelayed(new ii30(16, rwe0Var2), 1500L);
                break;
        }
    }

    public QrReaderContentLogo p() {
        return ((b) this.c).h().getLogo();
    }

    @Override // defpackage.w0r
    public void q(FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status) {
        rh3 rh3Var = (rh3) this.c;
        tyc0 tyc0Var = (tyc0) this.b;
        if (fileProgressObservable$Listener$Status == FileProgressObservable$Listener$Status.FINISHED) {
            tyc0Var.f.remove(rh3Var);
            com.yandex.messaging.audio.d dVar = (com.yandex.messaging.audio.d) tyc0Var.g.get(rh3Var);
            if (dVar != null) {
                dVar.a.a();
                dVar.e.E();
            }
        }
    }

    public boolean r() {
        return ((CommonFeatureFlag) ((b) this.c).d(wlp.L).getData()).isEnabled();
    }

    public void s() {
        p270 p270Var = (p270) this.c;
        if (p270Var != null) {
            p270Var.c = false;
            skd0.b(PlusLogTag.SDK, "onViewLoadError with benchmark " + p270Var.a.a);
        }
        this.c = null;
    }

    public void t(String str) {
        p270 p270Var = (p270) this.c;
        if (p270Var != null) {
            com.yandex.plus.core.benchmark.b bVar = p270Var.a;
            String str2 = bVar.a;
            bVar.c();
            PlusLogTag plusLogTag = PlusLogTag.SDK;
            skd0.b(plusLogTag, "onViewLoaded with benchmark " + str2);
            if (p270Var.c) {
                p270Var.c = false;
                skd0.b(plusLogTag, "track duration=" + w3n.a(bVar) + " ms with benchmark " + str2);
                p270Var.b.invoke(bVar, gw00.e(new Pair("page_url", str)));
            } else {
                skd0.b(plusLogTag, "already tracked track with benchmark " + str2);
            }
        }
        this.c = null;
    }

    public void u() {
        this.c = null;
    }

    public void v() {
        p270 p270Var = (p270) ((sls) this.b).invoke();
        this.c = p270Var;
        com.yandex.plus.core.benchmark.b bVar = p270Var.a;
        bVar.b();
        skd0.b(PlusLogTag.SDK, "onViewShowed with benchmark " + bVar.a);
    }

    public void w(pv0 pv0Var) {
        ((com.yandex.go.route.interactor.b) this.c).m(new ZoneAddress(pv0Var.a, ((o) this.b).f(pv0Var.a.getZoneName())), null);
    }

    public /* synthetic */ y4a0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public y4a0(sls slsVar) {
        this.a = 5;
        this.b = slsVar;
    }

    public /* synthetic */ y4a0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public y4a0(bga0 bga0Var) {
        this.a = 1;
        this.c = bga0Var;
    }

    public y4a0(sez0 sez0Var) {
        this.a = 26;
        this.b = sez0Var;
        this.c = new ef90();
    }

    public y4a0(ufg ufgVar, PackageManager packageManager) {
        this.a = 24;
        aye0 aye0Var = new aye0(1, this);
        this.b = packageManager;
        new ea20(ufgVar, "flutter/processtext", wzt0.b, null).b(aye0Var);
    }

    public y4a0(b bVar, a3h a3hVar) {
        this.a = 28;
        this.c = bVar;
        this.b = kotlin.a.a(new agc0(13, bVar, a3hVar));
    }

    public y4a0(ufg ufgVar, int i) {
        this.a = i;
        switch (i) {
            case 13:
                nw70 nw70Var = new nw70(23, this);
                ea20 ea20Var = new ea20(ufgVar, "flutter/platform_views", wzt0.b, null);
                this.b = ea20Var;
                ea20Var.b(nw70Var);
                break;
            default:
                nw70 nw70Var2 = new nw70(22, this);
                ea20 ea20Var2 = new ea20(ufgVar, "flutter/platform", qtb1.G, null);
                this.b = ea20Var2;
                ea20Var2.b(nw70Var2);
                break;
        }
    }
}
