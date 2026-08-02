package defpackage;

import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public interface lxl extends Parcelable {
    default boolean N() {
        if (equals(fxl.a)) {
            return true;
        }
        if (!(this instanceof jxl)) {
            return false;
        }
        jxl jxlVar = (jxl) this;
        StringBuilder sb = new StringBuilder();
        sb.append(jxlVar.a);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(jxlVar.b);
        return sb.toString().equals("414787002:1076");
    }

    String getId();
}
