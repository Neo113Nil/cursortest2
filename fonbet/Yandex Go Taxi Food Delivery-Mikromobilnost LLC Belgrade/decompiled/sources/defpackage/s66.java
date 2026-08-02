package defpackage;

import com.yandex.go.blur.experiments.BlurConfigurationExperiment;
import com.yandex.go.messenger_native.experiment.NativeMessengerOverloadedFlagsExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes.dex */
public final class s66 implements t1b0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1b0 b;

    public s66(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.SUPERAPP_COMMUNICATIONS_RESTRICTED_CACHE);
                break;
            case 2:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.ENABLE_APP_INFO_COPY);
                break;
            case 3:
                this.b = ((jbh) rqoVar).e(s3u.e);
                break;
            case 4:
                b3w.Companion.getClass();
                this.b = ((jbh) rqoVar).e(b3w.d);
                break;
            case 5:
                ygx.Companion.getClass();
                this.b = ((jbh) rqoVar).e(ygx.g);
                break;
            case 6:
                this.b = ((jbh) rqoVar).e(o7y.g);
                break;
            case 7:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.USE_MAPKIT_LOCATION);
                break;
            case 8:
                NativeMessengerOverloadedFlagsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).e(NativeMessengerOverloadedFlagsExperiment.e);
                break;
            case 9:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.QUARK_LOCK);
                break;
            case 10:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.SCOOTERS_CLIENT_PLUS_PLAQUE);
                break;
            case 11:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.SUPERAPP_BROTLI);
                break;
            case 12:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.SUPERAPP_MAINSCREEN_WARMUP);
                break;
            default:
                BlurConfigurationExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).e(BlurConfigurationExperiment.f);
                break;
        }
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        switch (this.a) {
        }
        return this.b.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        switch (this.a) {
        }
        return (Boolean) this.b.c();
    }
}
