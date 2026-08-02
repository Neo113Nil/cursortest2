package defpackage;

import com.yandex.mob.api.model.MobPingPolicy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsl20;", "", "Companion", "ql20", "rl20", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class sl20 {
    public static final rl20 Companion = new rl20();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new g320(28))};
    public final MobPingPolicy a;

    public /* synthetic */ sl20(int i, MobPingPolicy mobPingPolicy) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mobPingPolicy;
        }
    }

    public static final /* synthetic */ void c(sl20 sl20Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && sl20Var.a == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 0, (KSerializer) b[0].getValue(), sl20Var.a);
    }

    /* renamed from: b, reason: from getter */
    public final MobPingPolicy getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl20) && this.a == ((sl20) obj).a;
    }

    public final int hashCode() {
        MobPingPolicy mobPingPolicy = this.a;
        if (mobPingPolicy == null) {
            return 0;
        }
        return mobPingPolicy.hashCode();
    }

    public final String toString() {
        return "MobApiNamePolicy(pingPolicy=" + this.a + Extension.C_BRAKE;
    }

    public sl20() {
        this.a = null;
    }
}
