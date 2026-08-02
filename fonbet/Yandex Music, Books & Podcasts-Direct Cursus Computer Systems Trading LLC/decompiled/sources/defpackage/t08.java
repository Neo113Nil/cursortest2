package defpackage;

import android.os.Build;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;

/* loaded from: classes6.dex */
public final class t08 implements q08 {
    public static String c;
    public o08 a;
    public final jyr b;

    public t08(o08 o08Var) {
        this.b = btf.b(new rs6(21, new n08(o08Var, 1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (kotlin.text.c.v(r0, "generic", false) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o08 a(o08 o08Var) {
        boolean z;
        DeviceType deviceType;
        boolean z2;
        String str;
        String str2 = Build.BRAND;
        str2.getClass();
        if (c.v(str2, "generic", false)) {
            String str3 = Build.DEVICE;
            str3.getClass();
        }
        String str4 = Build.FINGERPRINT;
        str4.getClass();
        if (!c.v(str4, "generic", false) && !c.v(str4, "unknown", false)) {
            String str5 = Build.HARDWARE;
            str5.getClass();
            if (!StringsKt.M(str5, "goldfish", false) && !StringsKt.M(str5, "ranchu", false)) {
                String str6 = Build.MODEL;
                str6.getClass();
                if (!StringsKt.M(str6, "google_sdk", false) && !StringsKt.M(str6, "Emulator", false) && !StringsKt.M(str6, "Android SDK built for x86", false)) {
                    String str7 = Build.MANUFACTURER;
                    str7.getClass();
                    if (!StringsKt.M(str7, "Genymotion", false)) {
                        String str8 = Build.PRODUCT;
                        str8.getClass();
                        if (!StringsKt.M(str8, "sdk_google", false) && !StringsKt.M(str8, "google_sdk", false) && !StringsKt.M(str8, "sdk", false) && !StringsKt.M(str8, "sdk_x86", false) && !StringsKt.M(str8, "sdk_gphone64_arm64", false) && !StringsKt.M(str8, "vbox86p", false) && !StringsKt.M(str8, "emulator", false) && !StringsKt.M(str8, "simulator", false)) {
                            z = false;
                            if (!z) {
                                deviceType = DeviceType.EMULATOR;
                            } else {
                                if (z) {
                                    b6e.s();
                                    return null;
                                }
                                deviceType = o08Var.a;
                            }
                            String str9 = o08Var.b;
                            z2 = str9 != null || StringsKt.U(str9);
                            if (!(!z2)) {
                                str = o08Var.b;
                            } else {
                                if (!z2) {
                                    b6e.s();
                                    return null;
                                }
                                if (c == null) {
                                    r08 r08Var = new r08();
                                    String str10 = k08.a;
                                    if (str10 != null) {
                                        c = str10;
                                    } else {
                                        k08.b.add(r08Var);
                                    }
                                }
                                str = c;
                            }
                            return tt0.h(deviceType, str, new s08(o08Var));
                        }
                    }
                }
            }
        }
        z = true;
        if (!z) {
        }
        String str92 = o08Var.b;
        if (str92 != null) {
        }
        if (!(!z2)) {
        }
        return tt0.h(deviceType, str, new s08(o08Var));
    }

    @Override // defpackage.q08
    public final o08 get() {
        o08 o08Var = this.a;
        jyr jyrVar = this.b;
        if (o08Var == null) {
            o08Var = a((o08) jyrVar.getValue());
            this.a = o08Var;
        }
        String str = o08Var.b;
        if (!(str == null || StringsKt.U(str))) {
            return o08Var;
        }
        if (c == null) {
            r08 r08Var = new r08();
            String str2 = k08.a;
            if (str2 != null) {
                c = str2;
            } else {
                k08.b.add(r08Var);
            }
        }
        if (c == null) {
            return o08Var;
        }
        o08 a = a((o08) jyrVar.getValue());
        this.a = a;
        return a;
    }
}
