package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class br1 {
    public final Context a;

    public br1(Context context) {
        context.getClass();
        this.a = context;
    }

    public final JSONObject a(String str) {
        InputStream open = this.a.getAssets().open(str);
        open.getClass();
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
        StringBuilder sb = new StringBuilder(open.available());
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append(cArr, 0, read);
        }
    }
}
