package defpackage;

import com.yandex.plus.core.graphql.type.HorizontalAlignment;
import com.yandex.plus.core.graphql.type.VerticalAlignment;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zo11 implements b70 {
    public static final List a = scc.g("horizontalContentAlignment", "verticalContentAlignment");

    public static vo11 c(xdx xdxVar) {
        VerticalAlignment verticalAlignment;
        HorizontalAlignment horizontalAlignment;
        HorizontalAlignment horizontalAlignment2 = null;
        VerticalAlignment verticalAlignment2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            int i = 0;
            if (h2 == 0) {
                String nextString = xdxVar.nextString();
                HorizontalAlignment.Companion.getClass();
                HorizontalAlignment[] values = HorizontalAlignment.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        horizontalAlignment = null;
                        break;
                    }
                    horizontalAlignment = values[i];
                    if (jl40.l(horizontalAlignment.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                horizontalAlignment2 = horizontalAlignment == null ? HorizontalAlignment.UNKNOWN__ : horizontalAlignment;
            } else {
                if (h2 != 1) {
                    return new vo11(horizontalAlignment2, verticalAlignment2);
                }
                String nextString2 = xdxVar.nextString();
                VerticalAlignment.Companion.getClass();
                VerticalAlignment[] values2 = VerticalAlignment.values();
                int length2 = values2.length;
                while (true) {
                    if (i >= length2) {
                        verticalAlignment = null;
                        break;
                    }
                    verticalAlignment = values2[i];
                    if (jl40.l(verticalAlignment.getRawValue(), nextString2)) {
                        break;
                    }
                    i++;
                }
                verticalAlignment2 = verticalAlignment == null ? VerticalAlignment.UNKNOWN__ : verticalAlignment;
            }
        }
    }
}
