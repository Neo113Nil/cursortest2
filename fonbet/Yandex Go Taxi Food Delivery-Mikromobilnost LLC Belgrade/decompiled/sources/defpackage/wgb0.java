package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwgb0;", "", "Companion", "ugb0", "vgb0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class wgb0 {
    public static final vgb0 Companion = new vgb0();
    public final Float a;
    public final Float b;
    public final Float c;

    public /* synthetic */ wgb0(int i, Float f, Float f2, Float f3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f3;
        }
    }

    public static final /* synthetic */ void a(wgb0 wgb0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || wgb0Var.a != null) {
            yjdVar.g(serialDescriptor, 0, nor.a, wgb0Var.a);
        }
        if (yjdVar.F() || wgb0Var.b != null) {
            yjdVar.g(serialDescriptor, 1, nor.a, wgb0Var.b);
        }
        if (!yjdVar.F() && wgb0Var.c == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 2, nor.a, wgb0Var.c);
    }

    public wgb0(Float f, Float f2, Float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public wgb0() {
        this(null, null, null);
    }
}
