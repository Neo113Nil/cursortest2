package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class n08 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ o08 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n08(o08 o08Var, int i) {
        super(0);
        this.r = i;
        this.s = o08Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                Pair pair = new Pair("codename", null);
                Pair pair2 = new Pair("customInfo", null);
                o08 o08Var = this.s;
                return uah.e(pair, pair2, new Pair(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE, o08Var.a), new Pair(ConnectableDevice.KEY_ID, o08Var.b), new Pair("manufacturer", o08Var.c), new Pair(CommonUrlParts.MODEL, o08Var.d), new Pair("osVersion", o08Var.e), new Pair("SoC", o08Var.f), new Pair("vendor", o08Var.g), new Pair("widevineAvailable", o08Var.h));
            default:
                return this.s;
        }
    }
}
