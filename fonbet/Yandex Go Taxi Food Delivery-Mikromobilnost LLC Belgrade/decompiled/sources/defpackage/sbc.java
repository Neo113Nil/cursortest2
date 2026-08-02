package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.dynamic.impl.b;
import com.yandex.plus.home.c;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries.DeliveryTrackingItemDto;
import ru.yandex.taxi.polling.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class sbc implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sbc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intent launchIntentForPackage;
        String file;
        char c;
        boolean z;
        int i3 = 2;
        int i4 = 0;
        switch (this.a) {
            case 0:
                hbp0 hbp0Var = new hbp0(new czo0(14), "locationInfoPollingStarterLogger", (mse) ((a) this.b).d.a.getValue());
                hbp0Var.a();
                return hbp0Var;
            case 1:
                return ((Iterable) this.b).iterator();
            case 2:
                return Collections.singletonList((Pair) this.b);
            case 3:
                return new lzs(((c) ((lzc0) this.b).a).b.j);
            case 4:
                return ((com.yandex.go.benefits_center.benefits.sdk.descriptors.a) this.b).b;
            case 5:
                mug mugVar = (mug) this.b;
                return kotlin.collections.a.m0(mugVar.d, mugVar.a);
            case 6:
                return new r2h((y50) ((yzg) this.b).b);
            case 7:
                nth nthVar = (nth) this.b;
                return e.K(new mth(nthVar.c.b(), i4), new mth(nthVar.a.h, i3), new mth(nthVar.b.b, 1));
            case 8:
                u7i u7iVar = (u7i) this.b;
                return e.K((tpr) u7iVar.f.getValue(), (lz40) u7iVar.e.getValue());
            case 9:
                return ((dgi) this.b).a.adapter(DeliveryTrackingItemDto.class);
            case 10:
                return new ArrayList((Collection) ((lsi) this.b).a.a(EmptyList.a));
            case 11:
                return String.valueOf(Build.VERSION.SDK_INT >= 30 && ((ezj) this.b).a.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"));
            case 12:
                e89 e89Var = (e89) this.b;
                ((oju0) e89Var.b).x.remove((ga1) e89Var.c);
                return zy11.a;
            case 13:
                return (d0m) this.b;
            case 14:
                l2m l2mVar = (l2m) this.b;
                return ((d0m) l2mVar.a.invoke()).a(new d8(19, l2mVar));
            case 15:
                return (uyg) this.b;
            case 16:
                return hfb1.a(((b) this.b).a);
            case 17:
                x7n x7nVar = (x7n) this.b;
                return new r7n(x7nVar.F, x7nVar.G, x7nVar.D);
            case 18:
                com.yandex.go.splash.dynamic.b bVar = (com.yandex.go.splash.dynamic.b) this.b;
                Context context = bVar.b;
                ((sah) bVar.c).getClass();
                Drawable drawable = context.getDrawable(a4h0.go_splash_logo);
                if (drawable != null) {
                    return ffx.e0(drawable);
                }
                return null;
            case 19:
                return (OkHttpClient) ((com.yandex.go.superapp.unified_polling.a) this.b).a.get();
            case 20:
                Context context2 = ((oxn) this.b).a;
                String str6 = Build.PRODUCT;
                int i5 = (evu0.y(str6, "sdk", false) || evu0.y(str6, "Droid4X", false) || evu0.y(str6, "nox", false) || evu0.y(str6, "sdk_x86", false) || evu0.y(str6, "Andy", false) || evu0.y(str6, "google_sdk", false) || evu0.y(str6, "ttVM_Hdragon", false) || evu0.y(str6, "sdk_google", false) || evu0.y(str6, "vbox86p", false)) ? 1 : 0;
                String str7 = Build.MANUFACTURER;
                if (jl40.l(str7, "unknown")) {
                    i = i5;
                } else {
                    i = i5;
                    if (!evu0.y(str7, "MIT", false) && !evu0.y(str7, "nox", false) && !evu0.y(str7, "Andy", false) && !str7.equals("Genymotion") && !evu0.y(str7, "TiantianVM", false)) {
                        i2 = i;
                        str = Build.BRAND;
                        if (!jl40.l(str, "generic") || jl40.l(str, "TTVM") || jl40.l(str, "generic_x86") || evu0.y(str, "Andy", false)) {
                            i2++;
                        }
                        if (((SensorManager) context2.getSystemService("sensor")).getSensorList(-1).isEmpty()) {
                            i2++;
                        }
                        str2 = Build.DEVICE;
                        if (!evu0.y(str2, "generic", false) || evu0.y(str2, "Droid4X", false) || evu0.y(str2, "generic_x86", false) || evu0.y(str2, "generic_x86_64", false) || evu0.y(str2, "ttVM_Hdragon", false) || evu0.y(str2, "nox", false) || evu0.y(str2, "Andy", false) || evu0.y(str2, "vbox86p", false)) {
                            i2++;
                        }
                        str3 = Build.MODEL;
                        if (!jl40.l(str3, "sdk") || evu0.y(str3, "Droid4X", false) || evu0.y(str3, "Andy", false) || str3.equals("google_sdk") || str3.equals("Android SDK built for x86_64") || evu0.y(str3, "TiantianVM", false) || str3.equals("Android SDK built for x86")) {
                            i2++;
                        }
                        str4 = Build.HARDWARE;
                        if (!jl40.l(str4, "goldfish") || evu0.y(str4, "nox", false) || str4.equals("vbox86") || evu0.y(str4, "ttVM_x86", false)) {
                            i2++;
                        }
                        str5 = Build.FINGERPRINT;
                        if (!evu0.y(str5, "generic/sdk/generic", false) || evu0.y(str5, "vbox86p", false) || evu0.y(str5, "generic/google_sdk/generic", false) || evu0.y(str5, "generic_x86/sdk_x86/generic_x86", false) || evu0.y(str5, "generic_x86_64", false) || evu0.y(str5, "ttVM_Hdragon", false) || evu0.y(str5, "Andy", false) || evu0.y(str5, "generic/vbox86p/vbox86p", false)) {
                            i2++;
                        }
                        if (ConstantDeviceInfo.APP_PLATFORM.equalsIgnoreCase(((TelephonyManager) context2.getSystemService("phone")).getNetworkOperatorName())) {
                            i2 += 10;
                        }
                        PackageManager packageManager = context2.getPackageManager();
                        launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.bluestacks");
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            i2 += 10;
                        }
                        file = Environment.getExternalStorageDirectory().toString();
                        c = File.separatorChar;
                        if (new File(file + c + "windows" + c + "BstSharedFolder").exists()) {
                            i2 += 10;
                        }
                        if (i2 > 3) {
                            unr0.C(new Object[]{Integer.valueOf(i2)}, 1, "emulator probability scale %s", jst.e);
                            z = false;
                        } else {
                            unr0.D(new Object[]{Integer.valueOf(i2)}, 1, "emulator probability scale %s", jst.e, new IllegalStateException());
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                i2 = i + 1;
                str = Build.BRAND;
                if (!jl40.l(str, "generic")) {
                }
                i2++;
                if (((SensorManager) context2.getSystemService("sensor")).getSensorList(-1).isEmpty()) {
                }
                str2 = Build.DEVICE;
                if (!evu0.y(str2, "generic", false)) {
                }
                i2++;
                str3 = Build.MODEL;
                if (!jl40.l(str3, "sdk")) {
                }
                i2++;
                str4 = Build.HARDWARE;
                if (!jl40.l(str4, "goldfish")) {
                }
                i2++;
                str5 = Build.FINGERPRINT;
                if (!evu0.y(str5, "generic/sdk/generic", false)) {
                }
                i2++;
                if (ConstantDeviceInfo.APP_PLATFORM.equalsIgnoreCase(((TelephonyManager) context2.getSystemService("phone")).getNetworkOperatorName())) {
                }
                PackageManager packageManager2 = context2.getPackageManager();
                launchIntentForPackage = packageManager2.getLaunchIntentForPackage("com.bluestacks");
                if (launchIntentForPackage != null) {
                    i2 += 10;
                }
                file = Environment.getExternalStorageDirectory().toString();
                c = File.separatorChar;
                if (new File(file + c + "windows" + c + "BstSharedFolder").exists()) {
                }
                if (i2 > 3) {
                }
                return Boolean.valueOf(z);
            case 21:
                return new m4o(((n4o) this.b).g(), i4);
            case 22:
                return ((com.yandex.go.agreement.deeplink.b) this.b).f.a();
            case 23:
                return new f52("EvGen", new da1(i3, new zco((pho) ((ea1) this.b).c)));
            case 24:
                wqo wqoVar = (wqo) this.b;
                m2d0 m2d0Var = wqoVar.a;
                return new com.yandex.plus.experiments.impl.providers.b(m2d0Var.e, m2d0Var.f, (fro) wqoVar.c.getValue(), m2d0Var.h);
            case 25:
                vlp vlpVar = (vlp) this.b;
                trj0 trj0Var = (trj0) vlpVar.a.get();
                ulp ulpVar = vlpVar.b;
                boolean z2 = trj0Var instanceof f15;
                f15 f15Var = z2 ? (f15) trj0Var : null;
                if (f15Var != null) {
                    f15Var.d = ulpVar;
                }
                f15 f15Var2 = z2 ? (f15) trj0Var : null;
                if (f15Var2 != null) {
                    f15Var2.e = null;
                }
                return trj0Var;
            case 26:
                return new v4c(4, ((m40) this.b).provide());
            case 27:
                File file2 = (File) this.b;
                synchronized (n1r.e) {
                    n1r.d.remove(file2.getAbsolutePath());
                }
                return zy11.a;
            case 28:
                return (pul) this.b;
            default:
                npr nprVar = (npr) this.b;
                RecyclerView recyclerView = nprVar.a;
                recyclerView.removeOnScrollListener(nprVar);
                Rect rect = nprVar.c;
                if (rect != null) {
                    xw31.H(recyclerView, rect);
                }
                return zy11.a;
        }
    }
}
