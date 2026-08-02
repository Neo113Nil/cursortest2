package defpackage;

import android.util.TypedValue;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public abstract class xuj0 {
    public static final TypedValue a = new TypedValue();
    public static final TypedValue b = new TypedValue();

    public static final String a(TypedValue typedValue) {
        Character v0 = gvu0.v0("color");
        StringBuilder x = unr0.x("Expected ", evu0.z("aeio", v0 != null ? v0.charValue() : HexString.CHAR_SPACE) ? "an" : "a", " color theme attribute but got type 0x");
        int i = typedValue.type;
        rza.a(16);
        x.append(Integer.toString(i, 16));
        x.append(" (see what it corresponds to in android.util.TypedValue constants)");
        return x.toString();
    }
}
