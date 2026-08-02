package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes13.dex */
public final class xiu0 implements xbi0 {
    public final SharedPreferences a;
    public final String b;

    public /* synthetic */ xiu0(SharedPreferences sharedPreferences, String str) {
        this.a = sharedPreferences;
        this.b = str;
    }

    public void a(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        String str2 = this.b;
        if (str != null) {
            edit.putString(str2, str);
        } else {
            edit.remove(str2);
        }
        edit.apply();
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return this.a.getString(this.b, null);
    }

    @Override // defpackage.xbi0
    public /* bridge */ /* synthetic */ void setValue(Object obj, kgx kgxVar, Object obj2) {
        a((String) obj2);
    }
}
