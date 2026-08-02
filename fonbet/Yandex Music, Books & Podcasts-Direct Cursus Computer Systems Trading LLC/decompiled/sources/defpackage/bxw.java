package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bxw {
    public final wo0 a;
    public final i6c b;

    public /* synthetic */ bxw(wo0 wo0Var, i6c i6cVar) {
        this.a = wo0Var;
        this.b = i6cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bxw)) {
            return false;
        }
        bxw bxwVar = (bxw) obj;
        return ldg.s(this.a, bxwVar.a) && ldg.s(this.b, bxwVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        md7 md7Var = new md7(this);
        md7Var.a(this.a, PListParser.TAG_KEY);
        md7Var.a(this.b, "feature");
        return md7Var.toString();
    }
}
