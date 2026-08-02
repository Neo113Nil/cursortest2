package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class nc3 extends q8 {
    public final /* synthetic */ int e = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc3(SharedPreferences sharedPreferences, int i, String str) {
        super(sharedPreferences, Integer.valueOf(i), str);
        sharedPreferences.getClass();
    }

    @Override // defpackage.q8
    public final Object m(SharedPreferences sharedPreferences, Object obj, String str) {
        switch (this.e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                sharedPreferences.getClass();
                str.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
            case 1:
                int intValue = ((Number) obj).intValue();
                sharedPreferences.getClass();
                str.getClass();
                return Integer.valueOf(sharedPreferences.getInt(str, intValue));
            default:
                long longValue = ((Number) obj).longValue();
                sharedPreferences.getClass();
                str.getClass();
                return Long.valueOf(sharedPreferences.getLong(str, longValue));
        }
    }

    @Override // defpackage.q8
    public final void n(SharedPreferences sharedPreferences, Object obj, String str) {
        switch (this.e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                sharedPreferences.getClass();
                str.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(str, booleanValue);
                edit.apply();
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                sharedPreferences.getClass();
                str.getClass();
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putInt(str, intValue);
                edit2.apply();
                break;
            default:
                long longValue = ((Number) obj).longValue();
                sharedPreferences.getClass();
                str.getClass();
                SharedPreferences.Editor edit3 = sharedPreferences.edit();
                edit3.putLong(str, longValue);
                edit3.apply();
                break;
        }
    }

    public /* synthetic */ nc3(SharedPreferences sharedPreferences, Object obj, String str) {
        super(sharedPreferences, obj, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc3(SharedPreferences sharedPreferences, boolean z, String str) {
        super(sharedPreferences, Boolean.valueOf(z), str);
        sharedPreferences.getClass();
    }
}
