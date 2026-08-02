package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.f;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.MeteringMode;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class sm7 {
    public final pbj a;

    public /* synthetic */ sm7(pbj pbjVar) {
        this.a = pbjVar;
    }

    public static int a(MeteringMode meteringMode) {
        int i = gur.a[meteringMode.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        w511.t("MeteringMode ", meteringMode, " is unhandled by FocusMeteringActionBuilderProxyApi.");
        return 0;
    }

    public static byte[] b(List list, long j, long j2) {
        int i = (int) j;
        int i2 = (int) j2;
        if (list.size() < 3) {
            ny61.g("The plane list must contain at least 3 planes (Y, U, V).");
            return null;
        }
        idv idvVar = (idv) list.get(0);
        idv idvVar2 = (idv) list.get(1);
        char c = 2;
        idv idvVar3 = (idv) list.get(2);
        ByteBuffer h = idvVar.h();
        ByteBuffer h2 = idvVar2.h();
        ByteBuffer h3 = idvVar3.h();
        h.rewind();
        h2.rewind();
        h3.rewind();
        int remaining = h.remaining();
        byte[] bArr = new byte[((i * i2) / 2) + remaining];
        int a = idvVar.a();
        if (a == i) {
            h.get(bArr, 0, remaining);
        } else {
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                h.get(bArr2, 0, i);
                System.arraycopy(bArr2, 0, bArr, i3, i);
                i3 += i;
                if (i4 < i2 - 1) {
                    h.position((h.position() - i) + a);
                }
            }
            remaining = i3;
        }
        int a2 = idvVar2.a();
        int a3 = idvVar3.a();
        int b = idvVar2.b();
        int b2 = idvVar3.b();
        byte[] bArr3 = new byte[a2];
        byte[] bArr4 = new byte[a3];
        int i5 = 0;
        while (i5 < i2 / 2) {
            int min = Math.min(h2.remaining(), a2);
            char c2 = c;
            int min2 = Math.min(h3.remaining(), a3);
            h2.get(bArr3, 0, min);
            h3.get(bArr4, 0, min2);
            for (int i6 = 0; i6 < i / 2; i6++) {
                int i7 = remaining + 1;
                bArr[remaining] = bArr4[i6 * b2];
                remaining += 2;
                bArr[i7] = bArr3[i6 * b];
            }
            i5++;
            c = c2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining2 = wrap.remaining();
        byte[] bArr5 = new byte[remaining2];
        wrap.get(bArr5, 0, remaining2);
        return bArr5;
    }

    public void c(pm7 pm7Var, gu7 gu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            gu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(pm7Var)) {
                gu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(pm7Var))), new nd2(7, gu7Var));
        }
    }

    public void d(eur eurVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(eurVar)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(eurVar))), new isb0(3, fu7Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(idv idvVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(idvVar)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        long i = w4uVar.i(idvVar);
        ByteBuffer h = idvVar.h();
        int remaining = h.remaining();
        byte[] bArr = new byte[remaining];
        h.get(bArr, 0, remaining);
        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.PlaneProxy.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(i), bArr, Long.valueOf(idvVar.b()), Long.valueOf(idvVar.a())), new isb0(16, fu7Var));
    }

    public void f(ldv ldvVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(ldvVar)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.ImageProxyUtils.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(ldvVar))), new isb0(10, fu7Var));
        }
    }

    public void g(xrj0 xrj0Var, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(xrj0Var)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(xrj0Var))), new isb0(23, fu7Var));
        }
    }

    public void h(kf61 kf61Var, fu7 fu7Var) {
        pbj pbjVar = this.a;
        boolean z = pbjVar.b;
        w4u w4uVar = (w4u) pbjVar.w;
        if (z) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(kf61Var)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.ZoomState.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar.i(kf61Var)), Double.valueOf(kf61Var.c()), Double.valueOf(kf61Var.a())), new htb0(10, fu7Var));
    }

    public void i(CaptureRequest captureRequest, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(captureRequest)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(captureRequest))), new nd2(18, fu7Var));
        }
    }

    public void j(f fVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        boolean z = pbjVar.b;
        w4u w4uVar = (w4u) pbjVar.w;
        if (z) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(fVar)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        long i = w4uVar.i(fVar);
        String str = "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.pigeon_newInstance";
        new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(scc.g(Long.valueOf(i), ((icv) fVar.h).s()), new isb0(7, fu7Var));
    }
}
