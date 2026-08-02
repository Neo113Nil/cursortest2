package defpackage;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes11.dex */
public class q4o implements ol11 {
    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        return new r4o(rawType);
    }
}
