package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.theme.AppThemeType;

/* loaded from: classes.dex */
public abstract class sy2 {
    public static final qwd b;
    public static final qwd d;
    public static final qwd f;
    public static final oz40 a = f.j(null);
    public static final oz40 c = f.j(AppThemeType.Light);
    public static final oz40 e = f.j("default");

    static {
        int i = 19;
        b = new qwd(new i22(i));
        d = new qwd(new i22(i));
        f = new qwd(new i22(i));
    }

    public static final srt a(fid fidVar) {
        srt srtVar = (srt) ((bts) fidVar).m(b);
        if (srtVar != null) {
            return srtVar;
        }
        srt srtVar2 = (srt) a.getValue();
        if (srtVar2 != null) {
            return srtVar2;
        }
        ny61.r("Missing [AppThemeContentProvider] integration");
        return null;
    }
}
