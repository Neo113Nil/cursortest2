package f0;

import a.AbstractC0078a;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class F extends L {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2872r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i, boolean z2) {
        super(z2);
        this.f2872r = i;
    }

    @Override // f0.L
    public final Object a(Bundle bundle, String str) {
        switch (this.f2872r) {
            case 0:
                return (Boolean) D1.h.c(bundle, "bundle", str, "key", str);
            case 1:
                Object c2 = D1.h.c(bundle, "bundle", str, "key", str);
                D1.i.c(c2, "null cannot be cast to non-null type kotlin.Float");
                return (Float) c2;
            case 2:
                Object c3 = D1.h.c(bundle, "bundle", str, "key", str);
                D1.i.c(c3, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) c3;
            case 3:
                Object c4 = D1.h.c(bundle, "bundle", str, "key", str);
                D1.i.c(c4, "null cannot be cast to non-null type kotlin.Long");
                return (Long) c4;
            case 4:
                Object c5 = D1.h.c(bundle, "bundle", str, "key", str);
                D1.i.c(c5, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) c5;
            default:
                return (String) D1.h.c(bundle, "bundle", str, "key", str);
        }
    }

    @Override // f0.L
    public final String b() {
        switch (this.f2872r) {
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

    @Override // f0.L
    public final Object d(String str) {
        boolean z2;
        int parseInt;
        String str2;
        long parseLong;
        int parseInt2;
        switch (this.f2872r) {
            case 0:
                D1.i.e(str, "value");
                if (str.equals("true")) {
                    z2 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 1:
                D1.i.e(str, "value");
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                D1.i.e(str, "value");
                if (str.startsWith("0x")) {
                    String substring = str.substring(2);
                    D1.i.d(substring, "substring(...)");
                    AbstractC0078a.h(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 3:
                D1.i.e(str, "value");
                if (str.endsWith("L")) {
                    str2 = str.substring(0, str.length() - 1);
                    D1.i.d(str2, "substring(...)");
                } else {
                    str2 = str;
                }
                if (str.startsWith("0x")) {
                    String substring2 = str2.substring(2);
                    D1.i.d(substring2, "substring(...)");
                    AbstractC0078a.h(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            case 4:
                D1.i.e(str, "value");
                if (str.startsWith("0x")) {
                    String substring3 = str.substring(2);
                    D1.i.d(substring3, "substring(...)");
                    AbstractC0078a.h(16);
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            default:
                D1.i.e(str, "value");
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // f0.L
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f2872r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                D1.i.e(str, "key");
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                D1.i.e(str, "key");
                bundle.putFloat(str, floatValue);
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                D1.i.e(str, "key");
                bundle.putInt(str, intValue);
                break;
            case 3:
                long longValue = ((Number) obj).longValue();
                D1.i.e(str, "key");
                bundle.putLong(str, longValue);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                D1.i.e(str, "key");
                bundle.putInt(str, intValue2);
                break;
            default:
                D1.i.e(str, "key");
                bundle.putString(str, (String) obj);
                break;
        }
    }
}
