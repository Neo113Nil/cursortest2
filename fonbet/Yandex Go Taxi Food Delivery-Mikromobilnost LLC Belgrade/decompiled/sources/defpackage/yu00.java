package defpackage;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes9.dex */
public interface yu00 {
    Object a(Map map, InputStream inputStream);

    default Object b(Map map, InputStream inputStream, wu00 wu00Var) {
        return a(map, inputStream);
    }
}
