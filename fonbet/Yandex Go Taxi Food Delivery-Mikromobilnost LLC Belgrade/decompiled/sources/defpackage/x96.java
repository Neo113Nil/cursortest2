package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class x96 extends k9 {
    public final /* synthetic */ int x = 1;

    public x96(int i, SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, Integer.valueOf(i), str);
    }

    @Override // defpackage.k9
    public final Object b(SharedPreferences sharedPreferences, Object obj, String str) {
        switch (this.x) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(str, ((Number) obj).intValue()));
            default:
                return Long.valueOf(sharedPreferences.getLong(str, ((Number) obj).longValue()));
        }
    }

    @Override // defpackage.k9
    public final void c(SharedPreferences sharedPreferences, Object obj, String str) {
        switch (this.x) {
            case 0:
                oo31.n(sharedPreferences, str, ((Boolean) obj).booleanValue());
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(str, intValue);
                edit.apply();
                break;
            default:
                long longValue = ((Number) obj).longValue();
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putLong(str, longValue);
                edit2.apply();
                break;
        }
    }

    public /* synthetic */ x96(SharedPreferences sharedPreferences, Object obj, String str) {
        super(sharedPreferences, obj, str);
    }

    public x96(SharedPreferences sharedPreferences, String str, boolean z) {
        super(sharedPreferences, Boolean.valueOf(z), str);
    }
}
