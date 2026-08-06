package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wr1 extends defpackage.oq0 {
    public static final defpackage.wr1 s0TASMVLSWD5 = new defpackage.wr1(0, false);
    public final /* synthetic */ int WmetiUbpKU9I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(int i, boolean z) {
        super(z);
        this.WmetiUbpKU9I = i;
    }

    @Override // defpackage.oq0
    public final java.lang.Object JhCgjQRTAOCT(java.lang.String str) {
        switch (this.WmetiUbpKU9I) {
            case 0:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (java.lang.Boolean) defpackage.oq0.Ns0WNyEWdPsk.JhCgjQRTAOCT(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            case 3:
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return (java.lang.Integer) defpackage.oq0.giKS3J6vZuNy.JhCgjQRTAOCT(str);
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (java.lang.Long) defpackage.oq0.WDYagTQQm9ns.JhCgjQRTAOCT(str);
            default:
                return str;
        }
    }

    @Override // defpackage.oq0
    public final void WDYagTQQm9ns(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        switch (this.WmetiUbpKU9I) {
            case 0:
                str.getClass();
                ((java.lang.String) obj).getClass();
                break;
            case 1:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                str.getClass();
                if (bool != null) {
                    defpackage.oq0.Ns0WNyEWdPsk.WDYagTQQm9ns(bundle, str, bool);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 2:
                java.lang.Double d = (java.lang.Double) obj;
                str.getClass();
                if (d != null) {
                    bundle.putDouble(str, d.doubleValue());
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 3:
                double doubleValue = ((java.lang.Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                break;
            case 4:
                java.lang.Float f = (java.lang.Float) obj;
                str.getClass();
                if (f != null) {
                    defpackage.oq0.P05cfTpS5W5L.WDYagTQQm9ns(bundle, str, f);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 5:
                java.lang.Integer num = (java.lang.Integer) obj;
                str.getClass();
                if (num != null) {
                    defpackage.oq0.giKS3J6vZuNy.WDYagTQQm9ns(bundle, str, num);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 6:
                java.lang.Long l = (java.lang.Long) obj;
                str.getClass();
                if (l != null) {
                    defpackage.oq0.WDYagTQQm9ns.WDYagTQQm9ns(bundle, str, l);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            default:
                java.lang.String str2 = (java.lang.String) obj;
                str.getClass();
                str2.getClass();
                bundle.putString(str, str2);
                break;
        }
    }

    @Override // defpackage.oq0
    public final java.lang.Object ZpBGe2uQfcn8(java.lang.String str, android.os.Bundle bundle) {
        switch (this.WmetiUbpKU9I) {
            case 0:
                bundle.getClass();
                return null;
            case 1:
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
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                double d = bundle.getDouble(str, Double.MIN_VALUE);
                if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return java.lang.Double.valueOf(d);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            case 3:
                bundle.getClass();
                double d2 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d2 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return java.lang.Double.valueOf(d2);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            case 4:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return java.lang.Float.valueOf(f);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            case 5:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                return java.lang.Integer.valueOf(defpackage.wc1.KrtOTfE6jiS2(str, bundle));
            case 6:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return java.lang.Long.valueOf(j);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return "null";
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
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // defpackage.oq0
    public java.lang.String oh71FJcDz6S2(java.lang.Object obj) {
        switch (this.WmetiUbpKU9I) {
            case 7:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                java.lang.String encode = android.net.Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.oh71FJcDz6S2(obj);
        }
    }
}
