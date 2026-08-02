package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import ru.yandex.quasar.glagol.State;
import ru.yandex.quasar.glagol.conversation.model.SoftwareVersionCommand;
import ru.yandex.quasar.glagol.impl.ExtraDataTransformer;

/* loaded from: classes5.dex */
public final class ihd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ohd l;
    public final /* synthetic */ mdg m;
    public final /* synthetic */ dkd n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ihd(ohd ohdVar, mdg mdgVar, dkd dkdVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = ohdVar;
        this.m = mdgVar;
        this.n = dkdVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ihd(this.l, this.m, this.n, continuation, 0);
            default:
                return new ihd(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ihd) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                final mdg mdgVar = this.m;
                final dkd dkdVar = this.n;
                this.k = 1;
                zt3 zt3Var = new zt3(1, qxe.b(this));
                zt3Var.s();
                final oec oecVar = new oec(zt3Var, 1);
                try {
                    ssg.a(3, null, "--> check version " + mdgVar.getDeviceId().a, null);
                    mdgVar.send(new SoftwareVersionCommand(), new t3o() { // from class: ehd
                        /* JADX WARN: Code restructure failed: missing block: B:3:0x003d, code lost:
                        
                            r0 = kotlin.text.StringsKt__StringsKt.split$default(r0, new java.lang.String[]{"."}, false, 0, 6, null);
                         */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
                        @Override // defpackage.t3o
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onMessage(u3o u3oVar) {
                            int i2;
                            String str;
                            List supportedFeatures;
                            List split$default;
                            String str2;
                            Integer intOrNull;
                            mdg mdgVar2 = mdgVar;
                            ssg.a(3, null, "<-- check " + mdgVar2.getDeviceId().a + StringUtil.SPACE + u3oVar, null);
                            String str3 = dkdVar.a;
                            v68 discoveredDevice = mdgVar2.getDiscoveredDevice();
                            State state = u3oVar.getState();
                            String str4 = (String) u3oVar.getExtra().get(ExtraDataTransformer.KEY_SOFTWARE_VERSION);
                            if (str4 != null && split$default != null) {
                                if (split$default.size() <= 1) {
                                    split$default = null;
                                }
                                if (split$default != null && (str2 = (String) split$default.get(1)) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
                                    i2 = intOrNull.intValue();
                                    int i3 = i2;
                                    str = (String) u3oVar.getExtra().get(ExtraDataTransformer.KEY_SOFTWARE_VERSION);
                                    if (str == null) {
                                        str = "null";
                                    }
                                    String str5 = str;
                                    supportedFeatures = mdgVar.getSupportedFeatures();
                                    str3.getClass();
                                    discoveredDevice.getClass();
                                    if (supportedFeatures == null) {
                                        supportedFeatures = c5b.a;
                                    }
                                    oec.this.invoke(state != null ? new egd(str3, discoveredDevice, supportedFeatures, i3, str5, state, state.getPlayerState()) : null);
                                }
                            }
                            i2 = -1;
                            int i32 = i2;
                            str = (String) u3oVar.getExtra().get(ExtraDataTransformer.KEY_SOFTWARE_VERSION);
                            if (str == null) {
                            }
                            String str52 = str;
                            supportedFeatures = mdgVar.getSupportedFeatures();
                            str3.getClass();
                            discoveredDevice.getClass();
                            if (supportedFeatures == null) {
                            }
                            oec.this.invoke(state != null ? new egd(str3, discoveredDevice, supportedFeatures, i32, str52, state, state.getPlayerState()) : null);
                        }
                    }).getClass();
                } catch (shd e) {
                    ssg.a(6, null, hrg.q("<-- check ", mdgVar.getDeviceId().a, ": failed"), e);
                    oecVar.invoke(null);
                }
                Object q = zt3Var.q();
                nm6 nm6Var2 = nm6.a;
                return q == nm6Var ? nm6Var : q;
            default:
                nm6 nm6Var3 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object L = tyf.L(5000L, new ihd(this.l, this.m, this.n, null, 0), this);
                    return L == nm6Var3 ? nm6Var3 : L;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
