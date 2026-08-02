package defpackage;

import com.yandex.alicekit.core.json.schema.HtmlString;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qml implements d4x {
    public final HtmlString a;
    public final HtmlString b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r4.length() < 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qml(JSONObject jSONObject) {
        HtmlString i = b4x.i("date_day", jSONObject);
        this.a = i;
        HtmlString htmlString = null;
        if (i.length() < 1) {
            z3k.c("dateDay does not meet condition dateDay.length() >= 1");
            throw null;
        }
        try {
            HtmlString l = b4x.l("date_month", jSONObject);
            if (l != null) {
            }
            htmlString = l;
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
        }
        this.b = htmlString;
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "dateDay");
        tjz0Var.a(this.b, "dateMonth");
        return tjz0Var.a.toString();
    }
}
