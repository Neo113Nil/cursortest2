package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes.dex */
public abstract class ty2 {
    public static final oz40 a = f.j(null);
    public static final qwd b = new qwd(new i22(20));

    public static final trt a(fid fidVar) {
        trt trtVar = (trt) ((bts) fidVar).m(b);
        if (trtVar != null) {
            return trtVar;
        }
        trt trtVar2 = (trt) a.getValue();
        if (trtVar2 != null) {
            return trtVar2;
        }
        ny61.r("Missing [AppThemeExtendedContentProvider] integration");
        return null;
    }
}
