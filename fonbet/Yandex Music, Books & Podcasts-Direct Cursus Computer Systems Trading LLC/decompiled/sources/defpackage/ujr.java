package defpackage;

import android.net.Uri;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class ujr {
    public static final jyr c = btf.b(wjp.x);
    public static final Set d = uop.b("frontend.vh.yandex.ru");
    public static final Set e = xz0.Y(new String[]{"json", "html", "", null});
    public final Set a;
    public final Set b;

    public ujr() {
        Set set = d;
        set.getClass();
        Set set2 = e;
        set2.getClass();
        this.a = set;
        this.b = set2;
    }

    public final boolean a(String str) {
        str.getClass();
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return false;
        }
        String host = parse.getHost();
        String encodedPath = parse.getEncodedPath();
        String str2 = null;
        if (encodedPath != null) {
            Regex regex = (Regex) c.getValue();
            irn irnVar = Regex.b;
            jch b = regex.b(encodedPath);
            if (b != null) {
                str2 = (String) CollectionsKt.Y(b.a());
            }
        }
        return (CollectionsKt.I(this.a, host) && this.b.contains(str2)) ? false : true;
    }
}
