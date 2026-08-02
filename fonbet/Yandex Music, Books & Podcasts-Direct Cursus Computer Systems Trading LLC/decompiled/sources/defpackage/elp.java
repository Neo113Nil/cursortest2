package defpackage;

import android.util.Base64;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public abstract class elp {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = rb.y().getBytes(Charsets.UTF_8);
        bytes.getClass();
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = hrg.q("firebase_session_", encodeToString, "_data");
        b = hrg.q("firebase_session_", encodeToString, "_settings");
    }
}
