package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.video.g;
import io.flutter.plugins.camerax.CameraXError;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class v83 {
    public final pbj a;

    public /* synthetic */ v83(pbj pbjVar) {
        this.a = pbjVar;
    }

    public static String a(v3x0 v3x0Var, String str, String str2) {
        try {
            return File.createTempFile(str, str2, ((Context) v3x0Var.b.a.A).getCacheDir()).toString();
        } catch (IOException e) {
            ny61.n("getTempFilePath_failure", new Throwable("SystemServicesHostApiImpl.getTempFilePath encountered an exception: " + e, e));
            return null;
        }
    }

    public static b48 b(Map map) {
        a48 a48Var = new a48();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            yy40 yy40Var = a48Var.a;
            if (value == null) {
                yy40Var.z(wn7.a((CaptureRequest.Key) entry.getKey()));
            } else {
                CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
                Object value2 = entry.getValue();
                if (CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE == key) {
                    value2 = Integer.valueOf(((Long) value2).intValue());
                }
                yy40Var.w(wn7.a(key), value2);
            }
        }
        return a48Var.a();
    }

    public static g c(Long l, Long l2, qgg0 qgg0Var) {
        jii0 jii0Var = new jii0();
        if (l != null) {
            jii0Var.a(l.intValue());
        }
        mrj mrjVar = jii0Var.a;
        if (l2 != null) {
            int intValue = l2.intValue();
            if (intValue <= 0) {
                ny61.g(oyr.j(intValue, "The requested target bitrate ", " is not supported. Target bitrate must be greater than 0."));
                return null;
            }
            i94 i94Var = (i94) mrjVar.b;
            if (i94Var == null) {
                ny61.r("Property \"videoSpec\" has not been set");
                return null;
            }
            qgg0 qgg0Var2 = i94Var.a;
            int i = i94Var.b;
            int i2 = i94Var.d;
            Range range = new Range(Integer.valueOf(intValue), Integer.valueOf(intValue));
            String str = qgg0Var2 == null ? " qualitySelector" : "";
            if (!str.isEmpty()) {
                ny61.r("Missing required properties:".concat(str));
                return null;
            }
            mrjVar.b = new i94(qgg0Var2, i, range, i2);
        }
        if (qgg0Var != null) {
            jii0Var.b(qgg0Var);
        }
        return new g(mrjVar.f(), jii0Var.b, jii0Var.c, jii0Var.d, jii0Var.e);
    }

    public void d(b48 b48Var, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(b48Var)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(b48Var))), new nd2(20, fu7Var));
        }
    }

    public void e(lzj lzjVar, gu7 gu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            gu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(lzjVar)) {
                gu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(lzjVar))), new nd2(26, gu7Var));
        }
    }

    public void f(gvo gvoVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        boolean z = pbjVar.b;
        w4u w4uVar = (w4u) pbjVar.w;
        if (z) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(gvoVar)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        long i = w4uVar.i(gvoVar);
        String str = "dev.flutter.pigeon.camera_android_camerax.ExposureState.pigeon_newInstance";
        new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(scc.g(Long.valueOf(i), gvoVar.c(), Double.valueOf(gvoVar.a().doubleValue())), new nd2(28, fu7Var));
    }

    public void g(nur nurVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(nurVar)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        String str = "dev.flutter.pigeon.camera_android_camerax.FocusMeteringResult.pigeon_newInstance";
        new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar.i(nurVar)), Boolean.valueOf(nurVar.a)), new isb0(4, fu7Var));
    }

    public void h(jdv jdvVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(jdvVar)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar.i(jdvVar)), Long.valueOf(jdvVar.getFormat()), Long.valueOf(jdvVar.getWidth()), Long.valueOf(jdvVar.getHeight())), new isb0(9, fu7Var));
    }

    public void i(t920 t920Var, gu7 gu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            gu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(t920Var)) {
                gu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(t920Var))), new isb0(13, gu7Var));
        }
    }

    public void j(CaptureRequest.Key key, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(key)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.CaptureRequestKey.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(key))), new nd2(19, fu7Var));
        }
    }
}
