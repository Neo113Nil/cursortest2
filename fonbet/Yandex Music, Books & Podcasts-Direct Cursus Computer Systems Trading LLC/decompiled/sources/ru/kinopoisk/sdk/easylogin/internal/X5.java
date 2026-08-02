package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import defpackage.zt3;
import java.lang.reflect.Type;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.internal.O5;

/* loaded from: classes5.dex */
public final class X5 implements O5.b {
    public final /* synthetic */ Type a;
    public final /* synthetic */ zt3 b;

    public X5(Type type, zt3 zt3Var) {
        this.a = type;
        this.b = zt3Var;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.O5.b
    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        C1032f1 a = C1046g1.a(jSONObject, this.a);
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            if (a == null) {
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(new t7o(new IllegalStateException("Failed to convert to command response")));
            } else {
                r7o r7oVar2 = z7o.b;
                zt3Var.resumeWith(a);
            }
        }
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.O5.b
    public final void a(Exception exc) {
        exc.getClass();
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(exc));
        }
    }
}
