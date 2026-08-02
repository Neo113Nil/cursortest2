package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public final class la {
    public final v9 a;
    public final y9 b;
    public final IInAppMessage c;
    public final String d;

    public la(v9 v9Var, y9 y9Var, IInAppMessage iInAppMessage, String str) {
        v9Var.getClass();
        y9Var.getClass();
        iInAppMessage.getClass();
        this.a = v9Var;
        this.b = y9Var;
        this.c = iInAppMessage;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return Intrinsics.areEqual(this.a, laVar.a) && Intrinsics.areEqual(this.b, laVar.b) && Intrinsics.areEqual(this.c, laVar.c) && Intrinsics.areEqual(this.d, laVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(this.c.getValue());
        String str = ((rg) this.b).a;
        v9 v9Var = this.a;
        String str2 = this.d;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n             ", prettyPrintedString, "\n             Triggered Action Id: ", str, "\n             Trigger Event: ");
        m.append(v9Var);
        m.append("\n             User Id: ");
        m.append(str2);
        m.append("\n        ");
        return StringsKt__IndentKt.replaceIndent(m.toString());
    }
}
