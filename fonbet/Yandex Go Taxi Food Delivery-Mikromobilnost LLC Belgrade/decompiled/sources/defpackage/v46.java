package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lv46;", "", "Companion", "t46", "u46", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class v46 {
    public static final u46 Companion = new u46();
    public final u2t a;
    public final pg70 b;
    public final ktf0 c;
    public final String d;
    public final String e;

    public /* synthetic */ v46(int i, u2t u2tVar, pg70 pg70Var, ktf0 ktf0Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = u2tVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pg70Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ktf0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public static final /* synthetic */ void c(v46 v46Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || v46Var.a != null) {
            yjdVar.g(serialDescriptor, 0, u2t.Companion.serializer(), v46Var.a);
        }
        if (yjdVar.F() || v46Var.b != null) {
            yjdVar.g(serialDescriptor, 1, hg70.a, v46Var.b);
        }
        if (yjdVar.F() || v46Var.c != null) {
            yjdVar.g(serialDescriptor, 2, gtf0.a, v46Var.c);
        }
        if (yjdVar.F() || v46Var.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, v46Var.d);
        }
        if (!yjdVar.F() && v46Var.e == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 4, auu0.a, v46Var.e);
    }

    /* renamed from: a, reason: from getter */
    public final pg70 getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public v46() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
