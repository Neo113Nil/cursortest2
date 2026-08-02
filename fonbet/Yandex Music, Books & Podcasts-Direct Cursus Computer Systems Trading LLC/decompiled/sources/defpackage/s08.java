package defpackage;

import android.media.MediaDrm;
import android.os.Build;
import android.util.Log;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class s08 extends uif implements Function1 {
    public final /* synthetic */ o08 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s08(o08 o08Var) {
        super(1);
        this.r = o08Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object t7oVar;
        m08 m08Var = (m08) obj;
        m08Var.getClass();
        o08 o08Var = this.r;
        o08Var.getClass();
        String str = o08Var.c;
        if (str == null) {
            str = Build.MANUFACTURER;
        }
        String str2 = null;
        if (str == null || str.equals("unknown")) {
            str = null;
        }
        m08Var.a = str;
        String str3 = o08Var.d;
        if (str3 == null) {
            str3 = Build.MODEL;
        }
        if (str3 == null || str3.equals("unknown")) {
            str3 = null;
        }
        m08Var.b = str3;
        String str4 = o08Var.e;
        if (str4 == null) {
            str4 = Build.VERSION.RELEASE;
        }
        if (str4 == null || str4.equals("unknown")) {
            str4 = null;
        }
        m08Var.c = str4;
        String str5 = o08Var.f;
        if (str5 == null) {
            str5 = Build.VERSION.SDK_INT >= 31 ? Build.SOC_MODEL : null;
        }
        if (str5 == null || str5.equals("unknown")) {
            str5 = null;
        }
        m08Var.d = str5;
        String str6 = o08Var.g;
        if (str6 == null) {
            str6 = Build.MANUFACTURER;
        }
        if (str6 != null && !str6.equals("unknown")) {
            str2 = str6;
        }
        m08Var.e = str2;
        UUID uuid = nqa.a;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Boolean.valueOf(MediaDrm.isCryptoSchemeSupported(nqa.a));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            Log.e("YP:DrmInfoProvider", "Failed to query if Widevine crypto scheme is supported.", a);
        }
        Boolean bool = Boolean.FALSE;
        if (t7oVar instanceof t7o) {
            t7oVar = bool;
        }
        m08Var.f = (Boolean) t7oVar;
        return Unit.a;
    }
}
