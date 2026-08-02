package app.cash.cdp.integration;

import android.content.SharedPreferences;
import com.squareup.preferences.SharedPreferencesKeyValue;

/* loaded from: classes.dex */
public final /* synthetic */ class CdpModule$Companion$$ExternalSyntheticLambda1 implements SharedPreferencesKeyValue.Writer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ CdpModule$Companion$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.squareup.preferences.SharedPreferencesKeyValue.Writer
    public void write(SharedPreferences.Editor editor, Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 1:
                editor.putInt(str, ((Integer) obj).intValue());
                break;
            case 2:
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                editor.putString(str, str2);
                break;
            default:
                editor.putLong(str, ((Long) obj).longValue());
                break;
        }
    }
}
