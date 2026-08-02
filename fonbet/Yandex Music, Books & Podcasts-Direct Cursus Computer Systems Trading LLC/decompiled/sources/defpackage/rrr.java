package defpackage;

import androidx.fragment.app.o;
import com.google.gson.JsonObject;
import com.yandex.messenger.websdk.api.Authentication;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.WebMessenger;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rrr implements srr {
    public final WebMessenger a;
    public final vtm b;
    public final atn c = new atn(this);

    public rrr(WebMessenger webMessenger, vtm vtmVar) {
        this.a = webMessenger;
        this.b = vtmVar;
    }

    public static ChatRequest i(ksw kswVar) {
        if (kswVar instanceof nh4) {
            return new oh4(((nh4) kswVar).z);
        }
        if (kswVar instanceof qh4) {
            return new rh4(((qh4) kswVar).z);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.srr
    public final void a(g5r g5rVar) {
        h02 h02Var = (h02) ((Authentication) this.a.c.getValue());
        h02Var.getClass();
        h02Var.j = g5rVar;
    }

    @Override // defpackage.srr
    public final fsr b() {
        return this.c;
    }

    @Override // defpackage.srr
    public final void c() {
        h02 h02Var = (h02) ((Authentication) this.a.c.getValue());
        h02Var.getClass();
        qdc qdcVar = h02Var.c;
        k5r.t(qdcVar, qdcVar, "wm_auth_token_reset");
        h02Var.d = null;
        h02Var.b();
        if (h02Var.e.a() != null) {
            hfj hfjVar = h02Var.a;
            hfjVar.i.post(new zvh(4, hfjVar, (Object) null));
        }
    }

    @Override // defpackage.srr
    public final o d(ksw kswVar, String str) {
        kswVar.getClass();
        return this.a.b(i(kswVar), h(null), str);
    }

    @Override // defpackage.srr
    public final void e(mns mnsVar) {
        mnsVar.getClass();
        Authentication authentication = (Authentication) this.a.c.getValue();
        String str = mnsVar.a;
        h02 h02Var = (h02) authentication;
        h02Var.getClass();
        str.getClass();
        String concat = "OAuth ".concat(str);
        h02Var.c.sendEvent("wm_auth_token_set", tah.b(new Pair("isNew", Boolean.valueOf(!Intrinsics.d(h02Var.a(), concat)))));
        if (Intrinsics.d(h02Var.a(), concat)) {
            return;
        }
        h02Var.d = concat;
        h02Var.b();
        hfj hfjVar = h02Var.a;
        hfjVar.i.post(new zvh(4, hfjVar, new uv1(7, h02Var)));
    }

    @Override // defpackage.srr
    public final o f() {
        return this.a.a();
    }

    @Override // defpackage.srr
    public final o g(ksw kswVar, String str, String str2) {
        kswVar.getClass();
        return this.a.b(i(kswVar), h(str), str2);
    }

    public final String h(String str) {
        JsonObject jsonObject = new JsonObject();
        if (str != null) {
            jsonObject.u("entrypoint", "music_android_".concat(str));
        }
        jsonObject.u("ft_geo", v3g.E((frt) this.b.a).e.a);
        jsonObject.u("ft_language", swf.H().a);
        String jsonElement = jsonObject.toString();
        jsonElement.getClass();
        return jsonElement;
    }
}
