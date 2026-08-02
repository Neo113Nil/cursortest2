package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* loaded from: classes15.dex */
public final class usg {
    public final x22 a;
    public final String b;
    public final Set c = j73.f0(new String[]{"e7ac364f-50ae-46e1-bc88-6d8d9472683b", "cfbe6a7c-4043-4b7a-9503-b7b20d0da63c", "40e4c37a-dbfa-4073-ae3f-59b02b0b32e1", "84a9faf5-c2d1-4db4-bfeb-145d846944f6", "68a83f9a-51fe-4f7e-a6f6-a2a828d40acf"});

    public usg(x22 x22Var, SharedPreferences sharedPreferences) {
        this.a = x22Var;
        this.b = sharedPreferences.getString("guid", "null");
    }
}
