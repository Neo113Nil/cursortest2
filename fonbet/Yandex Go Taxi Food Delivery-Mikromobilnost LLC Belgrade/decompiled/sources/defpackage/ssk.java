package defpackage;

import android.net.Uri;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ssk implements d4x {
    public final Uri a;

    public ssk(JSONObject jSONObject) {
        this.a = b4x.k("image_url", jSONObject);
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "imageUrl");
        return tjz0Var.a.toString();
    }
}
