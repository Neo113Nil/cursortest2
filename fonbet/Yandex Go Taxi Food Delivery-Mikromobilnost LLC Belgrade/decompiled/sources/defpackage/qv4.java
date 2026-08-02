package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.Array;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qv4 implements d4x {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public int w;
    public Object x;

    public qv4(JSONObject jSONObject) {
        Integer num;
        Integer num2;
        Integer num3;
        Uri uri = null;
        try {
            num = b4x.c("border_color", jSONObject);
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
            num = null;
        }
        if (num == null) {
            this.b = mob1.d("#F2F2F2");
        } else {
            this.b = num.intValue();
        }
        try {
            num2 = b4x.c("fill_color", jSONObject);
        } catch (JSONException e2) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e2);
            }
            num2 = null;
        }
        if (num2 == null) {
            this.c = mob1.d("#F2F2F2");
        } else {
            this.c = num2.intValue();
        }
        try {
            num3 = b4x.c("icon_color", jSONObject);
        } catch (JSONException e3) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e3);
            }
            num3 = null;
        }
        if (num3 == null) {
            this.w = mob1.d("#808080");
        } else {
            this.w = num3.intValue();
        }
        try {
            String m = b4x.m("image_url", jSONObject);
            if (!TextUtils.isEmpty(m)) {
                if (m == null) {
                    m = null;
                } else if (m.startsWith("//")) {
                    m = "https:".concat(m);
                }
                if (!TextUtils.isEmpty(m)) {
                    uri = Uri.parse(m);
                }
            }
        } catch (JSONException e4) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e4);
            }
        }
        this.x = uri;
    }

    public int a() {
        return this.w - this.c;
    }

    public rv4 b() {
        return ((rv4[]) this.x)[this.b];
    }

    public byte[][] c(int i, int i2) {
        int i3 = this.c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.w * i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            byte[] bArr2 = ((rv4[]) this.x)[i4 / i2].b;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                tjz0 tjz0Var = new tjz0();
                tjz0Var.a(Integer.valueOf(this.b), "borderColor");
                tjz0Var.a(Integer.valueOf(this.c), "fillColor");
                tjz0Var.a(Integer.valueOf(this.w), "iconColor");
                tjz0Var.a((Uri) this.x, "imageUrl");
                return tjz0Var.a.toString();
            case 2:
                return "";
            default:
                return super.toString();
        }
    }

    public qv4(int i, int i2) {
        this.x = new rv4[i];
        for (int i3 = 0; i3 < i; i3++) {
            ((rv4[]) this.x)[i3] = new rv4(((i2 + 4) * 17) + 1);
        }
        this.w = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public /* synthetic */ qv4() {
    }
}
