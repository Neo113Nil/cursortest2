package defpackage;

import android.content.res.TypedArray;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;

/* loaded from: classes3.dex */
public abstract class rsa1 {
    public static final lum a(tyk0 tyk0Var) {
        return new lum(new dok0((byte) 0, 22), yyk0.a, new ohk0(10, tyk0Var), zyk0.a);
    }

    public static int b(TypedArray typedArray) {
        return typedArray.getType(0);
    }

    public static final Integer c(AutoTopupType autoTopupType) {
        int i = autoTopupType == null ? -1 : y32.b[autoTopupType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return 10;
        }
        if (i == 2) {
            return 20;
        }
        w511.b();
        return null;
    }

    public static final String d(SettingStatus settingStatus) {
        int i = y32.c[settingStatus.ordinal()];
        if (i == 1) {
            return "on";
        }
        if (i == 2) {
            return "off";
        }
        w511.b();
        return null;
    }

    public static final String e(boolean z) {
        return z ? "on" : "off";
    }
}
