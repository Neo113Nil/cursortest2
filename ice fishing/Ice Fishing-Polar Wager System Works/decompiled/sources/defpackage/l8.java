package defpackage;

/* loaded from: classes.dex */
public final class l8 extends defpackage.eo0 {
    public final /* synthetic */ int adDC3e2L;

    public l8(int i, boolean z) {
        this.adDC3e2L = i;
    }

    @Override // defpackage.eo0
    public final java.lang.Object F7NU4MC0GW(java.lang.String str) {
        int parseInt;
        long parseLong;
        boolean z = true;
        switch (this.adDC3e2L) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        defpackage.db.fnWB2E7cs("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                if (str.startsWith("0x")) {
                    java.lang.String substring = str.substring(2);
                    defpackage.x70.G3OKOH3wZRC(16);
                    parseInt = java.lang.Integer.parseInt(substring, 16);
                } else {
                    parseInt = java.lang.Integer.parseInt(str);
                }
                return java.lang.Integer.valueOf(parseInt);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.String substring2 = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                if (str.startsWith("0x")) {
                    java.lang.String substring3 = substring2.substring(2);
                    defpackage.x70.G3OKOH3wZRC(16);
                    parseLong = java.lang.Long.parseLong(substring3, 16);
                } else {
                    parseLong = java.lang.Long.parseLong(substring2);
                }
                return java.lang.Long.valueOf(parseLong);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.eo0
    public final java.lang.Object IHQe1A4L2xu(android.os.Bundle bundle, java.lang.String str) {
        switch (this.adDC3e2L) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.s70.p4kuH6PDtgom(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return java.lang.Boolean.valueOf(z);
                }
                defpackage.c80.abhbClRa(str);
                throw null;
            case 1:
                bundle.getClass();
                return java.lang.Integer.valueOf(defpackage.s70.PAEGRtP0bX(bundle, str));
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return java.lang.Long.valueOf(j);
                }
                defpackage.c80.abhbClRa(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.s70.p4kuH6PDtgom(bundle, str)) {
                    return null;
                }
                java.lang.String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                defpackage.c80.abhbClRa(str);
                throw null;
        }
    }

    @Override // defpackage.eo0
    public final void adDC3e2L(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                int intValue = ((java.lang.Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
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

    @Override // defpackage.eo0
    public final java.lang.String oh6vYeIP() {
        switch (this.adDC3e2L) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return "long";
            default:
                return "string";
        }
    }
}
