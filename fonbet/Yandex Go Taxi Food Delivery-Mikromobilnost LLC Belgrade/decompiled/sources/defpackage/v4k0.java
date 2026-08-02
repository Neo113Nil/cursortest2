package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class v4k0 implements b70 {
    public static final List a = scc.g("__typename", "altText", "key");

    public static j4k0 c(xdx xdxVar, c cVar) {
        e4k0 e4k0Var;
        f4k0 f4k0Var;
        g4k0 g4k0Var;
        h4k0 h4k0Var;
        i4k0 i4k0Var;
        j70 j70Var = cVar.a;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str2 = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str3 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    break;
                }
                foe foeVar3 = l80.a;
                str4 = xdxVar.nextString();
            }
        }
        if (str2 == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("CheckoutTitleColorItem"), j70Var.b(), str2, j70Var)) {
            xdxVar.rewind();
            e4k0Var = q4k0.c(xdxVar, cVar);
        } else {
            e4k0Var = null;
        }
        if (a.a(a.b("CheckoutTitleHighlightItem"), j70Var.b(), str2, j70Var)) {
            xdxVar.rewind();
            List list = r4k0.a;
            String str5 = null;
            while (xdxVar.h2(r4k0.a) == 0) {
                foe foeVar4 = l80.a;
                str5 = xdxVar.nextString();
            }
            f4k0Var = new f4k0(str5);
        } else {
            f4k0Var = null;
        }
        if (a.a(a.b("CheckoutTitleIconItem"), j70Var.b(), str2, j70Var)) {
            xdxVar.rewind();
            List list2 = s4k0.a;
            b4k0 b4k0Var = null;
            while (xdxVar.h2(s4k0.a) == 0) {
                b4k0Var = (b4k0) l80.a(n4k0.a).b(xdxVar, cVar);
            }
            g4k0Var = new g4k0(b4k0Var);
        } else {
            g4k0Var = null;
        }
        if (a.a(a.b("CheckoutTitleLinkItem"), j70Var.b(), str2, j70Var)) {
            xdxVar.rewind();
            h4k0Var = t4k0.c(xdxVar, cVar);
        } else {
            h4k0Var = null;
        }
        if (a.a(a.b("CheckoutTitleStrikeItem"), j70Var.b(), str2, j70Var)) {
            xdxVar.rewind();
            List list3 = u4k0.a;
            while (xdxVar.h2(u4k0.a) == 0) {
                foe foeVar5 = l80.a;
                str = xdxVar.nextString();
            }
            i4k0Var = new i4k0(str);
        } else {
            i4k0Var = null;
        }
        return new j4k0(str2, str3, str4, e4k0Var, f4k0Var, g4k0Var, h4k0Var, i4k0Var);
    }
}
