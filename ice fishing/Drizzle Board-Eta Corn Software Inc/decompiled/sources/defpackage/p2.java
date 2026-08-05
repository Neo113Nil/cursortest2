package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p2 extends ev {
    public final /* synthetic */ int amk52bBQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(int i, boolean z) {
        super(z);
        this.amk52bBQ = i;
    }

    @Override // defpackage.ev
    public final String NCTxEWno() {
        switch (this.amk52bBQ) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // defpackage.ev
    public String P7K7Inc8(Object obj) {
        switch (this.amk52bBQ) {
            case 5:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.P7K7Inc8(obj);
        }
    }

    @Override // defpackage.ev
    public final void VgvYg0wo(Bundle bundle, String str, Object obj) {
        switch (this.amk52bBQ) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 3:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue2);
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

    @Override // defpackage.ev
    public final Object qoPGr6Ce(String str, Bundle bundle) {
        switch (this.amk52bBQ) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                n50.P7K7Inc8(str);
                throw null;
            case 1:
                bundle.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                n50.P7K7Inc8(str);
                throw null;
            case 2:
                bundle.getClass();
                return Integer.valueOf(m50.wxUZMvaN(str, bundle));
            case 3:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                n50.P7K7Inc8(str);
                throw null;
            case 4:
                bundle.getClass();
                return Integer.valueOf(m50.wxUZMvaN(str, bundle));
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                n50.P7K7Inc8(str);
                throw null;
        }
    }

    @Override // defpackage.ev
    public final Object wxUZMvaN(String str) {
        int parseInt;
        long parseLong;
        int parseInt2;
        boolean z = true;
        switch (this.amk52bBQ) {
            case 0:
                str.getClass();
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        m1.sjUBp5pO("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                str.getClass();
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                str.getClass();
                if (str.startsWith("0x")) {
                    String substring = str.substring(2);
                    le0.Qr9iLBAD(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 3:
                str.getClass();
                String substring2 = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                if (str.startsWith("0x")) {
                    String substring3 = substring2.substring(2);
                    le0.Qr9iLBAD(16);
                    parseLong = Long.parseLong(substring3, 16);
                } else {
                    parseLong = Long.parseLong(substring2);
                }
                return Long.valueOf(parseLong);
            case 4:
                str.getClass();
                if (str.startsWith("0x")) {
                    String substring4 = str.substring(2);
                    le0.Qr9iLBAD(16);
                    parseInt2 = Integer.parseInt(substring4, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }
}
