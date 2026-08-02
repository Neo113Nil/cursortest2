package defpackage;

import android.media.MediaRecorder;
import android.os.HandlerThread;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.VideoRecordingFragment;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.b;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.c;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.i;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.j;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.k;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.l;

/* loaded from: classes4.dex */
public final class yn31 extends vc5 {
    public final IFlowController E;
    public final cm31 F;
    public o4w G;

    public yn31(IVerificationFlowController iVerificationFlowController, cm31 cm31Var) {
        super(iVerificationFlowController);
        this.E = iVerificationFlowController;
        this.F = cm31Var;
    }

    @Override // defpackage.yr31
    public final void V() {
        cm31 cm31Var = this.F;
        pn7 pn7Var = cm31Var.b;
        if (pn7Var != null) {
            try {
                try {
                    ExecutorService executorService = pn7Var.k;
                    if (executorService != null) {
                        executorService.shutdown();
                    }
                    HandlerThread handlerThread = pn7Var.l;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    MediaRecorder mediaRecorder = pn7Var.c;
                    if (mediaRecorder != null) {
                        mediaRecorder.release();
                    }
                } catch (Exception e) {
                    EbsLogger.INSTANCE.error(e);
                }
                pn7Var.l = null;
                pn7Var.m = null;
                pn7Var.k = null;
                pn7Var.c = null;
                pn7Var.d = null;
                pn7Var.e = null;
                pn7Var.f = null;
                pn7Var.g = null;
            } catch (Throwable th) {
                pn7Var.l = null;
                pn7Var.m = null;
                pn7Var.k = null;
                pn7Var.c = null;
                pn7Var.d = null;
                pn7Var.e = null;
                pn7Var.f = null;
                pn7Var.g = null;
                throw th;
            }
        }
        cm31Var.b = null;
    }

    @Override // defpackage.vc5
    public final tt11 Y() {
        return new vn31(0);
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        if (((vn31) a0()).a instanceof gl31) {
            return;
        }
        boolean z = ys11Var instanceof kn31;
        z93 z93Var = this.D;
        if (z) {
            kn31 kn31Var = (kn31) ys11Var;
            W(tje.N(ds31.a(this), z93Var, null, new i(this, kn31Var.b, kn31Var.a, kn31Var.c, null), 2), "init_job");
            return;
        }
        if (ys11Var instanceof nn31) {
            W(tje.N(ds31.a(this), z93Var, null, new j(this, null), 2), "open_camera_and_start_preview_job");
            return;
        }
        boolean z2 = ys11Var instanceof ln31;
        int i = 1;
        jl31 jl31Var = jl31.a;
        if (z2) {
            String str = ((ln31) ys11Var).a;
            vn31 vn31Var = (vn31) a0();
            o4w o4wVar = this.G;
            if (o4wVar == null) {
                o4wVar = null;
            }
            JSONObject jSONObject = o4wVar.a;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instruction", new JSONObject(String.format("\n                {\n                   \"mnemonic\":\"pre-instructions\",\n                   \"index\":0,\n                   \"actions\":{\n                      \"type\":\"pre\",\n                      \"index\":0,\n                      \"duration\":0,\n                      \"message\":\"%s\"\n                   }\n                }\n            ", Arrays.copyOf(new Object[]{str}, 1))));
            jSONObject2.put("customization", jSONObject);
            vn31 a = vn31.a(vn31Var, jl31Var, jSONObject2, null, false, false, false, 0, true, 250);
            r0 r0Var = (r0) c0();
            r0Var.getClass();
            r0Var.m(null, a);
            return;
        }
        if (ys11Var instanceof on31) {
            W(g0(3000L, new wn31(this, i)), "timer_incorrect_html_job");
            return;
        }
        if (ys11Var instanceof pn31) {
            X("timer_incorrect_html_job");
            if (jl40.l(((vn31) a0()).a, jl31Var)) {
                vn31 a2 = vn31.a((vn31) a0(), null, null, null, false, false, false, 0, false, 505);
                r0 r0Var2 = (r0) c0();
                r0Var2.getClass();
                r0Var2.m(null, a2);
                return;
            }
            return;
        }
        if (ys11Var instanceof qn31) {
            vn31 a3 = vn31.a((vn31) a0(), null, null, null, false, false, false, 0, false, 255);
            r0 r0Var3 = (r0) c0();
            r0Var3.getClass();
            r0Var3.m(null, a3);
            tje.N(ds31.a(this), z93Var, null, new k(this, null), 2);
            return;
        }
        if (ys11Var instanceof mn31) {
            o4w o4wVar2 = this.G;
            o4w o4wVar3 = o4wVar2 != null ? o4wVar2 : null;
            long currentTimeMillis = System.currentTimeMillis() - o4wVar3.h;
            JSONArray jSONArray = o4wVar3.e;
            if (jSONArray != null && (optJSONObject = jSONArray.optJSONObject(o4wVar3.f)) != null && (optJSONArray = optJSONObject.optJSONArray("actions")) != null && (optJSONObject2 = optJSONArray.optJSONObject(o4wVar3.g)) != null) {
                optJSONObject2.put("client_duration", currentTimeMillis);
            }
            o4wVar3.g++;
            h0();
            return;
        }
        if (!(ys11Var instanceof sn31)) {
            if (!(ys11Var instanceof rn31)) {
                super.d0(ys11Var);
                return;
            }
            if (((vn31) a0()).e) {
                vn31 a4 = vn31.a((vn31) a0(), null, null, null, false, false, false, 0, false, 495);
                r0 r0Var4 = (r0) c0();
                r0Var4.getClass();
                r0Var4.m(null, a4);
                tje.N(ds31.a(this), z93Var, null, new l(this, null), 2);
                return;
            }
            return;
        }
        boolean z3 = ((vn31) a0()).a instanceof fl31;
        X("timer_incorrect_html_job", "button_enabled_or_disabled_job", "open_camera_and_start_preview_job");
        vn31 vn31Var2 = new vn31(0);
        r0 r0Var5 = (r0) c0();
        r0Var5.getClass();
        r0Var5.m(null, vn31Var2);
        l8x l8xVar = (l8x) this.C.get("handle_video_recording_interrupted");
        if (l8xVar == null || l8xVar.k0()) {
            W(tje.N(ds31.a(this), z93Var, null, new c(z3, this, null), 2), "handle_video_recording_interrupted");
        }
    }

    public final void h0() {
        o4w o4wVar = this.G;
        if (o4wVar == null) {
            o4wVar = null;
        }
        y3w a = o4wVar.a();
        if (a != null) {
            vn31 a2 = vn31.a((vn31) a0(), new fl31(a.b), a.a, null, false, false, false, 0, false, 506);
            r0 r0Var = (r0) c0();
            r0Var.getClass();
            r0Var.m(null, a2);
            W(g0(3000L, new wn31(this, 0)), "button_enabled_or_disabled_job");
            return;
        }
        vn31 vn31Var = (vn31) a0();
        pn7 pn7Var = this.F.b;
        vn31 a3 = vn31.a(vn31Var, new gl31(pn7Var != null ? VideoRecordingFragment.access$getViewBinding((VideoRecordingFragment) ((aj31) pn7Var.a).b).j.getBitmap() : null), null, null, false, false, false, 0, false, 510);
        r0 r0Var2 = (r0) c0();
        r0Var2.getClass();
        r0Var2.m(null, a3);
        tje.N(ds31.a(this), this.D, null, new b(this, null), 2);
    }
}
