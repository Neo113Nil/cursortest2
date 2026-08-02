package defpackage;

import android.text.TextUtils;
import com.yandex.alicekit.core.json.schema.HtmlString;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rhk implements d4x {
    public final x3k a;
    public final int b;
    public final ctk c;
    public final HtmlString w;

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:2|3)|(14:31|32|(1:7)(1:30)|8|9|(8:11|12|13|14|(2:16|17)|23|19|20)|27|12|13|14|(0)|23|19|20)|5|(0)(0)|8|9|(0)|27|12|13|14|(0)|23|19|20) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|2|3|(14:31|32|(1:7)(1:30)|8|9|(8:11|12|13|14|(2:16|17)|23|19|20)|27|12|13|14|(0)|23|19|20)|5|(0)(0)|8|9|(0)|27|12|13|14|(0)|23|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r5.length() < 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r0.e(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        r0.e(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[Catch: JSONException -> 0x004d, TRY_LEAVE, TryCatch #3 {JSONException -> 0x004d, blocks: (B:9:0x003f, B:11:0x0047), top: B:8:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: JSONException -> 0x0064, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0064, blocks: (B:14:0x0054, B:16:0x005c), top: B:13:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rhk(JSONObject jSONObject) {
        Integer num;
        ctk ctkVar;
        HtmlString l;
        JSONObject optJSONObject;
        String m;
        quz quzVar = quz.c;
        this.a = new x3k(b4x.b("action", jSONObject), quzVar);
        HtmlString htmlString = null;
        try {
            m = b4x.m("background_color", jSONObject);
        } catch (JSONException e) {
            quzVar.e(e);
        }
        if (!TextUtils.isEmpty(m)) {
            try {
                num = Integer.valueOf(mob1.b(m));
            } catch (IllegalArgumentException unused) {
            }
            if (num != null) {
                this.b = mob1.d("#ffedf0f2");
            } else {
                this.b = num.intValue();
            }
            optJSONObject = jSONObject.optJSONObject("image");
            if (optJSONObject != null) {
                ctkVar = new ctk(optJSONObject);
                this.c = ctkVar;
                l = b4x.l("text", jSONObject);
                if (l != null) {
                }
                htmlString = l;
                this.w = htmlString;
            }
            ctkVar = null;
            this.c = ctkVar;
            l = b4x.l("text", jSONObject);
            if (l != null) {
            }
            htmlString = l;
            this.w = htmlString;
        }
        num = null;
        if (num != null) {
        }
        optJSONObject = jSONObject.optJSONObject("image");
        if (optJSONObject != null) {
        }
        ctkVar = null;
        this.c = ctkVar;
        l = b4x.l("text", jSONObject);
        if (l != null) {
        }
        htmlString = l;
        this.w = htmlString;
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "action");
        tjz0Var.a(Integer.valueOf(this.b), UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        tjz0Var.a(this.c, "image");
        tjz0Var.a(this.w, "text");
        return tjz0Var.a.toString();
    }
}
