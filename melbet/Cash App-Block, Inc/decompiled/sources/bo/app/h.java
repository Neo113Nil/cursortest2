package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class h {
    public static final g c = new g();
    public final Context a;
    public final p9 b;

    public h(Context context, p9 p9Var) {
        context.getClass();
        p9Var.getClass();
        this.a = context;
        this.b = p9Var;
    }

    public static final String b() {
        return "Registering with ADM server...";
    }

    public final void a() {
        if (((tc) this.b).b() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 0), 6, (Object) null);
            tc tcVar = (tc) this.b;
            tcVar.a(tcVar.b());
        } else {
            ADM adm = new ADM(this.a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(21), 6, (Object) null);
                adm.startRegister();
            }
        }
    }

    public static final String a(h hVar) {
        return Recorder$$ExternalSyntheticOutline2.m("The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: ", ((tc) hVar.b).b());
    }
}
