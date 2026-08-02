package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.fj3;
import yads.fv1;
import yads.lv1;
import yads.t92;

/* loaded from: classes7.dex */
public final class u171 implements dg61 {
    public final tj61 a;

    public u171(tj61 tj61Var) {
        this.a = tj61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    @Override // defpackage.dg61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        Object failure;
        boolean z;
        tj61 tj61Var = this.a;
        i971 i971Var = tj61Var.b;
        try {
            new URI(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (str != null && str.length() != 0) {
            z = true;
            failure = Boolean.valueOf(z);
            Object obj = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            if (((Boolean) failure).booleanValue()) {
                i971Var.A(fv1.d, "Mraid command sent an invalid URL");
                return;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!"mraid".equals(scheme) && !"mobileads".equals(scheme)) {
                tj61Var.a(gw00.e(new Pair("url", str)));
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : parse.getQueryParameterNames()) {
                linkedHashMap.put(str2, parse.getQueryParameter(str2));
            }
            fv1.c.getClass();
            try {
                for (fv1 fv1Var : fv1.values()) {
                    if (!jl40.l(fv1Var.b, host)) {
                    }
                    break;
                }
                break;
                tj61Var.b(fv1Var, linkedHashMap);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown exception";
                }
                i971Var.A(fv1Var, message);
            }
            fv1Var = fv1.d;
            i971Var.E("nativeCallComplete(" + JSONObject.quote(fv1Var.b) + Extension.C_BRAKE);
            return;
        }
        z = false;
        failure = Boolean.valueOf(z);
        Object obj2 = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
        }
        if (((Boolean) failure).booleanValue()) {
        }
    }

    @Override // defpackage.dg61
    public final void a(lv1 lv1Var, Map map) {
        dg61 dg61Var;
        tj61 tj61Var = this.a;
        t92 t92Var = tj61Var.a;
        ip31 ip31Var = new ip31(t92Var);
        w7o w7oVar = new w7o(vs71.a(t92Var));
        gj81 a = mm81.a(tj61Var.a);
        we6 we6Var = new we6(a.a, a.b, 17);
        fj3 fj3Var = fj3.c;
        tj61Var.m = fj3Var;
        i971 i971Var = tj61Var.b;
        i971Var.B(fj3Var, w7oVar, we6Var, ip31Var);
        i971Var.E("notifyReadyEvent();");
        lm71 lm71Var = tj61Var.h;
        if (lm71Var == null || (dg61Var = (dg61) ((WeakReference) lm71Var.b).get()) == null) {
            return;
        }
        dg61Var.a(lv1Var, map);
    }

    @Override // defpackage.dg61
    public final void a(boolean z) {
        tj61 tj61Var = this.a;
        tj61Var.getClass();
        w7o w7oVar = new w7o(z);
        i971 i971Var = tj61Var.b;
        i971Var.B(w7oVar);
        fp71 fp71Var = tj61Var.f;
        if (z) {
            at81 at81Var = (at81) fp71Var.x;
            Handler handler = (Handler) fp71Var.w;
            if (at81Var == null) {
                at81 at81Var2 = new at81((t92) fp71Var.a, (tj61) fp71Var.c, handler, (mm81) fp71Var.b);
                fp71Var.x = at81Var2;
                handler.post(at81Var2);
                return;
            }
            return;
        }
        ((Handler) fp71Var.w).removeCallbacksAndMessages(null);
        fp71Var.x = null;
        gj81 a = mm81.a(tj61Var.a);
        if (a.equals(tj61Var.n)) {
            return;
        }
        tj61Var.n = a;
        i971Var.B(new we6(a.a, a.b, 17));
    }

    @Override // defpackage.dg61
    public final void a() {
        dg61 dg61Var;
        tj61 tj61Var = this.a;
        tj61Var.e = true;
        lm71 lm71Var = tj61Var.h;
        if (lm71Var == null || (dg61Var = (dg61) ((WeakReference) lm71Var.b).get()) == null) {
            return;
        }
        dg61Var.a();
    }
}
