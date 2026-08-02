package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class u2q0 extends w2q0 {
    public static final t2q0 Companion = new t2q0();
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2q0(int i, String str, String str2) {
        super(str);
        if (3 != (i & 3)) {
            qje.Z(i, 3, s2q0.a.getDescriptor());
            throw null;
        }
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return u2q0.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.c, ((u2q0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("ReplaceSectionsOperation(targetId=", this.c, Extension.C_BRAKE);
    }

    public u2q0(String str) {
        super(FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE, 0);
        this.c = str;
    }
}
