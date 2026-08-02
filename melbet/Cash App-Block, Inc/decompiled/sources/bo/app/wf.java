package bo.app;

import android.content.Context;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.StringUtils;

/* loaded from: classes3.dex */
public abstract class wf {
    public static vf a(q5 q5Var, String str, String str2) {
        q5Var.getClass();
        str.getClass();
        str2.getClass();
        ah ahVar = q5Var.a;
        Context context = ahVar.a;
        return new vf(context, Boxes$$ExternalSyntheticOutline1.m("com.braze.tokenbucket.", str, ".", str2, StringUtils.getCacheFileSuffix(context, ahVar.e, ahVar.f)));
    }
}
