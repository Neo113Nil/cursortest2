package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.List;

/* loaded from: classes.dex */
public final class yv1 {
    public static final yv1 c = new yv1(yde.y(xv1.d));
    public static final qsn d;
    public static final cee e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        gdg.r(3, objArr);
        d = yde.t(3, objArr);
        x0 x0Var = new x0(4);
        x0Var.V(5, 6);
        x0Var.V(17, 6);
        x0Var.V(7, 6);
        x0Var.V(30, 10);
        x0Var.V(18, 6);
        x0Var.V(6, 8);
        x0Var.V(8, 8);
        x0Var.V(14, 8);
        e = x0Var.r();
    }

    public yv1(qsn qsnVar) {
        for (int i = 0; i < qsnVar.d; i++) {
            xv1 xv1Var = (xv1) qsnVar.get(i);
            this.a.put(xv1Var.a, xv1Var);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((xv1) this.a.valueAt(i3)).b);
        }
        this.b = i2;
    }

    public static qsn a(int[] iArr, int i) {
        tde u = yde.u();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            u.a(new xv1(i2, i));
        }
        return u.f();
    }

    public static yv1 b(Context context, dv1 dv1Var, qxp qxpVar) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dv1Var, qxpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0120, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yv1 c(Context context, Intent intent, dv1 dv1Var, qxp qxpVar) {
        AudioManager f = fx1.f(context);
        if (qxpVar == null) {
            qxpVar = dvt.a >= 33 ? rb.r(f, dv1Var) : null;
        }
        int i = dvt.a;
        if (i >= 33 && (dvt.W(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return rb.p(f, dv1Var);
        }
        if (i >= 23) {
            AudioDeviceInfo[] devices = qxpVar == null ? f.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) qxpVar.a};
            fee feeVar = new fee(4);
            Integer[] numArr = {8, 7};
            gdg.r(2, numArr);
            feeVar.d(2);
            System.arraycopy(numArr, 0, feeVar.a, feeVar.b, 2);
            feeVar.b += 2;
            if (i >= 31) {
                Integer[] numArr2 = {26, 27};
                gdg.r(2, numArr2);
                feeVar.d(2);
                System.arraycopy(numArr2, 0, feeVar.a, feeVar.b, 2);
                feeVar.b += 2;
            }
            if (i >= 33) {
                feeVar.a(30);
            }
            hee f2 = feeVar.f();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (f2.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return c;
                }
            }
        }
        fee feeVar2 = new fee(4);
        feeVar2.a(2);
        int i2 = dvt.a;
        if (i2 >= 29 && (dvt.W(context) || (i2 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            qsn p = mi.p(dv1Var);
            p.getClass();
            feeVar2.c(p);
            return new yv1(a(zc4.Y(feeVar2.f()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            qsn qsnVar = d;
            qsnVar.getClass();
            feeVar2.c(qsnVar);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new yv1(a(zc4.Y(feeVar2.f()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List p2 = zc4.p(intArrayExtra);
            p2.getClass();
            feeVar2.c(p2);
        }
        return new yv1(a(zc4.Y(feeVar2.f()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r9 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair d(dv1 dv1Var, dsc dscVar) {
        int u;
        String str = dscVar.n;
        str.getClass();
        int d2 = l5i.d(str, dscVar.k);
        Integer valueOf = Integer.valueOf(d2);
        cee ceeVar = e;
        if (!ceeVar.containsKey(valueOf)) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.a;
        if (d2 == 18 && !dvt.k(sparseArray, 18)) {
            d2 = 6;
        } else if ((d2 == 8 && !dvt.k(sparseArray, 8)) || (d2 == 30 && !dvt.k(sparseArray, 30))) {
            d2 = 7;
        }
        if (!dvt.k(sparseArray, d2)) {
            return null;
        }
        xv1 xv1Var = (xv1) sparseArray.get(d2);
        xv1Var.getClass();
        int i2 = xv1Var.b;
        hee heeVar = xv1Var.c;
        int i3 = dscVar.D;
        boolean z = false;
        if (i3 == -1 || d2 == 18) {
            int i4 = dscVar.E;
            if (i4 == -1) {
                i4 = ScreenMirroringConfig.Audio.SAMPLING_RATE;
            }
            int i5 = xv1Var.a;
            if (heeVar == null) {
                if (dvt.a >= 29) {
                    i2 = mi.q(i5, i4, dv1Var);
                } else {
                    Object obj = ceeVar.get(Integer.valueOf(i5));
                    i2 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i3 = i2;
        } else if (!dscVar.n.equals("audio/vnd.dts.uhd;profile=p2") || dvt.a >= 33) {
            if (heeVar != null) {
                int u2 = dvt.u(i3);
                if (u2 != 0) {
                    z = heeVar.contains(Integer.valueOf(u2));
                }
            } else if (i3 <= i2) {
                z = true;
            }
            if (!z) {
                return null;
            }
        } else if (i3 > 10) {
            return null;
        }
        int i6 = dvt.a;
        if (i6 <= 28) {
            if (i3 == 7) {
                i = 8;
            } else if (i3 != 3) {
                if (i3 != 4) {
                }
            }
            if (i6 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                i = 2;
            }
            u = dvt.u(i);
            if (u != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(d2), Integer.valueOf(u));
        }
        i = i3;
        if (i6 <= 26) {
            i = 2;
        }
        u = dvt.u(i);
        if (u != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv1)) {
            return false;
        }
        yv1 yv1Var = (yv1) obj;
        return dvt.m(this.a, yv1Var.a) && this.b == yv1Var.b;
    }

    public final int hashCode() {
        return (dvt.n(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
