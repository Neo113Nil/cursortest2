package defpackage;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes5.dex */
public final class vvx {
    public static final uvx Companion = new uvx();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new vix(20)), null, null};
    public final String a;
    public final TrackableAcceptanceActionParam.Status b;
    public final String c;
    public final String d;

    public /* synthetic */ vvx(int i, TrackableAcceptanceActionParam.Status status, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, tvx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = status;
        this.c = str2;
        this.d = str3;
    }

    public static final /* synthetic */ void b(vvx vvxVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, vvxVar.a);
        yjdVar.g(serialDescriptor, 1, (KSerializer) e[1].getValue(), vvxVar.b);
        auu0 auu0Var = auu0.a;
        yjdVar.g(serialDescriptor, 2, auu0Var, vvxVar.c);
        yjdVar.g(serialDescriptor, 3, auu0Var, vvxVar.d);
    }

    public vvx(TrackableAcceptanceActionParam.Status status, String str, String str2, String str3) {
        this.a = str;
        this.b = status;
        this.c = str2;
        this.d = str3;
    }
}
