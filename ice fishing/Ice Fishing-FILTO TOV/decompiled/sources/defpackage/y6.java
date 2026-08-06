package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y6 extends ui0 {
    public final /* synthetic */ int xqGvceK5x;

    public y6(int i, boolean z) {
        this.xqGvceK5x = i;
    }

    @Override // defpackage.ui0
    public final Object GWasM1elztuh(Bundle bundle, String str) {
        switch (this.xqGvceK5x) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || o50.M3K9sHhK(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                z50.cilMamHF(str);
                throw null;
            case 1:
                bundle.getClass();
                return Integer.valueOf(o50.mE4lRynR(bundle, str));
            default:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                z50.cilMamHF(str);
                throw null;
        }
    }

    @Override // defpackage.ui0
    public final void OOA6hdeuvCS(Bundle bundle, String str, Object obj) {
        switch (this.xqGvceK5x) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            default:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
        }
    }

    @Override // defpackage.ui0
    public final String Yi7zF1RB1() {
        switch (this.xqGvceK5x) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            default:
                return "long";
        }
    }

    @Override // defpackage.ui0
    public final Object xqGvceK5x(String str) {
        int parseInt;
        long parseLong;
        boolean z = true;
        switch (this.xqGvceK5x) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        o4.mE4lRynR("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (str.startsWith("0x")) {
                    String substring = str.substring(2);
                    ki1.Y6hRI1cF8(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            default:
                String substring2 = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                if (str.startsWith("0x")) {
                    String substring3 = substring2.substring(2);
                    ki1.Y6hRI1cF8(16);
                    parseLong = Long.parseLong(substring3, 16);
                } else {
                    parseLong = Long.parseLong(substring2);
                }
                return Long.valueOf(parseLong);
        }
    }
}
