package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ma extends defpackage.oq0 {
    public final /* synthetic */ int WmetiUbpKU9I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(int i, boolean z) {
        super(z);
        this.WmetiUbpKU9I = i;
    }

    @Override // defpackage.oq0
    public final java.lang.Object JhCgjQRTAOCT(java.lang.String str) {
        int parseInt;
        long parseLong;
        boolean z = true;
        switch (this.WmetiUbpKU9I) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        defpackage.h7.w7APNrr0aGRc("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            case 2:
                if (str.startsWith("0x")) {
                    java.lang.String substring = str.substring(2);
                    defpackage.jr0.XntWc4eZSQ8j(16);
                    parseInt = java.lang.Integer.parseInt(substring, 16);
                } else {
                    parseInt = java.lang.Integer.parseInt(str);
                }
                return java.lang.Integer.valueOf(parseInt);
            case 3:
                java.lang.String substring2 = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                if (str.startsWith("0x")) {
                    java.lang.String substring3 = substring2.substring(2);
                    defpackage.jr0.XntWc4eZSQ8j(16);
                    parseLong = java.lang.Long.parseLong(substring3, 16);
                } else {
                    parseLong = java.lang.Long.parseLong(substring2);
                }
                return java.lang.Long.valueOf(parseLong);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.oq0
    public final void WDYagTQQm9ns(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        switch (this.WmetiUbpKU9I) {
            case 0:
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                float floatValue = ((java.lang.Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                break;
            case 2:
                int intValue = ((java.lang.Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 3:
                long longValue = ((java.lang.Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            default:
                java.lang.String str2 = (java.lang.String) obj;
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

    @Override // defpackage.oq0
    public final java.lang.Object ZpBGe2uQfcn8(java.lang.String str, android.os.Bundle bundle) {
        switch (this.WmetiUbpKU9I) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return java.lang.Boolean.valueOf(z);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            case 1:
                bundle.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return java.lang.Float.valueOf(f);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            case 2:
                bundle.getClass();
                return java.lang.Integer.valueOf(defpackage.wc1.KrtOTfE6jiS2(str, bundle));
            case 3:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return java.lang.Long.valueOf(j);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                java.lang.String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
        }
    }

    @Override // defpackage.oq0
    public final java.lang.String giKS3J6vZuNy() {
        switch (this.WmetiUbpKU9I) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    @Override // defpackage.oq0
    public java.lang.String oh71FJcDz6S2(java.lang.Object obj) {
        switch (this.WmetiUbpKU9I) {
            case 4:
                java.lang.String str = (java.lang.String) obj;
                if (str == null) {
                    return "null";
                }
                java.lang.String encode = android.net.Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.oh71FJcDz6S2(obj);
        }
    }
}
