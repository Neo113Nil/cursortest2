package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.device.ConnectableDevice;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.f;

/* loaded from: classes4.dex */
public final class t7l implements wtm, ear, y7e, mbq, gih, f, fw6, mbx {
    public final /* synthetic */ int a;

    public /* synthetic */ t7l(int i) {
        this.a = i;
    }

    public static MediaCodec b(rdk rdkVar) {
        ((mih) rdkVar.b).getClass();
        String str = ((mih) rdkVar.b).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static u7l i() {
        return new u7l(0.3f, 100000L, 30000L, true);
    }

    public static z9u j() {
        return new z9u(0, "", null, "", "Title", "Subtitle", "3:41", jzb.c, true, null);
    }

    @Override // defpackage.mbq
    public pjc a(wor worVar) {
        return new fs(15, kbq.a);
    }

    @Override // defpackage.mbx
    public Object d() {
        msg msgVar = mox.u;
        msg msgVar2 = o64.j;
        y1g.B("Must be called from the main thread.");
        o64 o64Var = o64.l;
        y1g.G(o64Var);
        y1g.B("Must be called from the main thread.");
        return o64Var.d.a;
    }

    @Override // defpackage.wtm
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.y7e
    public Object f(Map map) {
        map.getClass();
        return new vjp((String) map.get(ConnectableDevice.KEY_ID), (String) map.get("version"), (String) map.get("name"), (String) map.get("type"), u2x.O((String) map.get("isSupport")), Uri.parse((String) map.get("uri")), Boolean.FALSE);
    }

    @Override // defpackage.wtm
    public void g(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // defpackage.gih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iih h(rdk rdkVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = b(rdkVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) rdkVar.e;
            mediaCodec.configure((MediaFormat) rdkVar.c, surface, (MediaCrypto) rdkVar.f, (surface == null && ((mih) rdkVar.b).k && dvt.a >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new myr(mediaCodec, (uzg) rdkVar.g);
        } catch (IOException e) {
            e = e;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // defpackage.ear
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // defpackage.fw6
    public void t(t tVar) {
        y supportFragmentManager = tVar.getSupportFragmentManager();
        a l = su4.l(supportFragmentManager, supportFragmentManager);
        l.d(0, new pmv(), "WIDGET_INSTALL_DIALOG_TAG", 1);
        l.k(true, true);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }
}
