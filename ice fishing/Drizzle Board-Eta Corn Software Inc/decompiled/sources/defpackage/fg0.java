package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class fg0 {
    public static c9 NCTxEWno(View view, c9 c9Var) {
        ContentInfo ow5vqvCr = c9Var.qoPGr6Ce.ow5vqvCr();
        Objects.requireNonNull(ow5vqvCr);
        ContentInfo performReceiveContent = view.performReceiveContent(ow5vqvCr);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == ow5vqvCr ? c9Var : new c9(new tg0(performReceiveContent));
    }

    public static String[] qoPGr6Ce(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
