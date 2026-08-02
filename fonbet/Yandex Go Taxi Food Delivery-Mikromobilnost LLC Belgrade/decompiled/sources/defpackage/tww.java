package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.INVITE_CANCELLATION_REASON;
import java.util.List;

/* loaded from: classes2.dex */
public final class tww implements b70 {
    public static final tww a = new tww();
    public static final List b = scc.g("webViewInvite", "inviteCancellationReason");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        pww pwwVar = (pww) obj;
        bfxVar.A1("webViewInvite");
        ep60 a2 = l80.a(uww.a);
        qww qwwVar = pwwVar.a;
        if (qwwVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, qwwVar);
        }
        bfxVar.A1("inviteCancellationReason");
        bfxVar.r0(pwwVar.b.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        INVITE_CANCELLATION_REASON invite_cancellation_reason;
        Object b2;
        qww qwwVar = null;
        INVITE_CANCELLATION_REASON invite_cancellation_reason2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                ep60 a2 = l80.a(uww.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a2.b(xdxVar, cVar);
                }
                qwwVar = (qww) b2;
            } else {
                if (h2 != 1) {
                    return new pww(qwwVar, invite_cancellation_reason2);
                }
                String nextString = xdxVar.nextString();
                INVITE_CANCELLATION_REASON.Companion.getClass();
                INVITE_CANCELLATION_REASON[] values = INVITE_CANCELLATION_REASON.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        invite_cancellation_reason = null;
                        break;
                    }
                    invite_cancellation_reason = values[i];
                    if (jl40.l(invite_cancellation_reason.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                invite_cancellation_reason2 = invite_cancellation_reason == null ? INVITE_CANCELLATION_REASON.UNKNOWN__ : invite_cancellation_reason;
            }
        }
    }
}
