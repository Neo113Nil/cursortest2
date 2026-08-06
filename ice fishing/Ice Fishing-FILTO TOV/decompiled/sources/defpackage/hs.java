package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hs extends ui0 {
    public final /* synthetic */ int xqGvceK5x;

    @Override // defpackage.ui0
    public final Object GWasM1elztuh(Bundle bundle, String str) {
        switch (this.xqGvceK5x) {
            case 0:
                bundle.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                z50.cilMamHF(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || o50.M3K9sHhK(bundle, str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                z50.cilMamHF(str);
                throw null;
        }
    }

    @Override // defpackage.ui0
    public final void OOA6hdeuvCS(Bundle bundle, String str, Object obj) {
        switch (this.xqGvceK5x) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putString(str, str2);
                    break;
                }
        }
    }

    @Override // defpackage.ui0
    public final String Yi7zF1RB1() {
        switch (this.xqGvceK5x) {
            case 0:
                return "float";
            default:
                return "string";
        }
    }

    @Override // defpackage.ui0
    public final Object xqGvceK5x(String str) {
        switch (this.xqGvceK5x) {
            case 0:
                return Float.valueOf(Float.parseFloat(str));
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }
}
