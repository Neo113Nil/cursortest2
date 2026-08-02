package defpackage;

import com.yandex.go.dto.response.Action$CityMode;
import com.yandex.go.dto.response.ActionType;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.HeaderService$Type;

/* loaded from: classes8.dex */
public final class r22 {
    public static ryr0 a(tbu tbuVar) {
        return tbuVar == HeaderService$Type.DRIVE ? fyr0.a : tbuVar == HeaderService$Type.MASSTRANSIT ? hyr0.a : tbuVar == HeaderService$Type.TAXI ? pyr0.a : tbuVar == HeaderService$Type.DELIVERY ? cyr0.a : new ayr0(tbuVar.getServiceName());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b52 b(q1 q1Var, tbu tbuVar) {
        ActionType a = q1Var != null ? q1Var.a() : null;
        switch (a == null ? -1 : q22.b[a.ordinal()]) {
            case -1:
            case 35:
            case 36:
            case 37:
            case 41:
            case 42:
            case 43:
            case 44:
                return null;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                return tbuVar != null ? a(tbuVar) : byr0.a;
            case 2:
                if (tbuVar != null) {
                    return a(tbuVar);
                }
                return null;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return pyr0.a;
            case 9:
                return jyr0.a;
            case 10:
                return tbuVar != null ? a(tbuVar) : eyr0.a;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return lyr0.a;
            case 20:
                return oyr0.a;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return zxr0.a;
            case 28:
                if (tbuVar != null) {
                    return a(tbuVar);
                }
                return lyr0.a;
            case 29:
                Action$CityMode action$CityMode = q1Var instanceof Action$CityMode ? (Action$CityMode) q1Var : null;
                return new bg1(action$CityMode != null ? action$CityMode.b : null);
            case 30:
                return gyr0.a;
            case 31:
                return hyr0.a;
            case 32:
                return dyr0.a;
            case 33:
                return nyr0.a;
            case 34:
                return myr0.a;
            case 38:
                return yxr0.a;
            case 39:
            case 40:
                return kyr0.a;
        }
    }
}
