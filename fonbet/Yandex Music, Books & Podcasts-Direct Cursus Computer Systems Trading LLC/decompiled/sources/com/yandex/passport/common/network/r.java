package com.yandex.passport.common.network;

import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import com.yandex.passport.data.network.f1;
import com.yandex.passport.data.network.t0;
import com.yandex.passport.data.network.y0;
import com.yandex.passport.internal.methods.b4;
import com.yandex.passport.internal.methods.k4;
import com.yandex.passport.internal.methods.l4;
import com.yandex.passport.internal.methods.t4;
import com.yandex.passport.internal.methods.u5;
import com.yandex.passport.internal.methods.y3;
import com.yandex.passport.internal.methods.z3;
import defpackage.avf;
import defpackage.b6e;
import defpackage.cko;
import defpackage.csm;
import defpackage.g4f;
import defpackage.i5f;
import defpackage.mm4;
import defpackage.q5b;
import defpackage.wm6;
import defpackage.xjo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                g4fVar.a = true;
                return Unit.a;
            case 1:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
            case 2:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 3:
                g4f g4fVar2 = (g4f) obj;
                g4fVar2.getClass();
                g4fVar2.c = true;
                return Unit.a;
            case 4:
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                return y0.w(t0Var);
            case 5:
                t0 t0Var2 = (t0) obj;
                t0Var2.getClass();
                return y0.w(t0Var2);
            case 6:
                g4f g4fVar3 = (g4f) obj;
                g4fVar3.getClass();
                g4fVar3.c = true;
                g4fVar3.h = true;
                return Unit.a;
            case 7:
                g4f g4fVar4 = (g4f) obj;
                g4fVar4.getClass();
                g4fVar4.c = true;
                return Unit.a;
            case 8:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 9:
                D0 = ((xjo) obj).D0("SELECT max(uploadedAt) FROM diary_upload");
                try {
                    Long l = null;
                    if (D0.q() && !D0.isNull(0)) {
                        l = Long.valueOf(D0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 10:
                D0 = ((xjo) obj).D0("SELECT min(issuedAt) FROM diary_method");
                try {
                    Long l2 = null;
                    if (D0.q() && !D0.isNull(0)) {
                        l2 = Long.valueOf(D0.getLong(0));
                    }
                    return l2;
                } finally {
                }
            case 11:
                ((wm6) obj).getClass();
                return q5b.a;
            case 12:
                ((wm6) obj).getClass();
                return null;
            case 13:
                g4f g4fVar5 = (g4f) obj;
                g4fVar5.getClass();
                g4fVar5.c = true;
                return Unit.a;
            case 14:
                ((Bundle) obj).getClass();
                return y3.c;
            case 15:
                ((Bundle) obj).getClass();
                return z3.c;
            case 16:
                ((Bundle) obj).getClass();
                return t4.c;
            case 17:
                ((Bundle) obj).getClass();
                return u5.c;
            case 18:
                ((Bundle) obj).getClass();
                return b4.c;
            case 19:
                ((Bundle) obj).getClass();
                return l4.c;
            case 20:
                ((Bundle) obj).getClass();
                return k4.c;
            case 21:
                String str = (String) obj;
                str.getClass();
                return "\"" + str + '\"';
            case 22:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 23:
                return String.valueOf(obj);
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return ((String) entry.getKey()) + '-' + ((String) entry.getValue());
            case 25:
                f1 f1Var = (f1) obj;
                f1Var.getClass();
                i5f i5fVar = com.yandex.passport.data.network.core.q.a;
                i5fVar.getClass();
                return i5fVar.c(f1.Companion.serializer(), f1Var);
            case 26:
                com.yandex.passport.api.o oVar = (com.yandex.passport.api.o) obj;
                oVar.getClass();
                int ordinal = oVar.ordinal();
                if (ordinal == 0) {
                    return "not_needed";
                }
                if (ordinal == 1) {
                    return "needed";
                }
                if (ordinal == 2) {
                    return "skipped";
                }
                if (ordinal == 3) {
                    return "required";
                }
                b6e.s();
                return null;
            case 27:
                mm4 mm4Var = (mm4) obj;
                mm4Var.getClass();
                mm4.a(mm4Var, "environment", avf.g("Environment", csm.j));
                mm4.a(mm4Var, Constants.KEY_VALUE, avf.g("Value", csm.h));
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Exception) obj).getClass();
                return Unit.a;
            default:
                com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) obj;
                if (fVar == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(fVar.a.a);
                sb.append(':');
                sb.append(fVar.b);
                return sb.toString();
        }
    }
}
