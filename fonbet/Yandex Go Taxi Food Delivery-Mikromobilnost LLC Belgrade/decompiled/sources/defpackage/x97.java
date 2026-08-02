package defpackage;

import com.caverock.androidsvg.e;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class x97 {
    public ArrayList a = null;
    public int b = 0;

    public final void a() {
        this.b += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((e) it.next());
            sb.append(HexString.CHAR_SPACE);
        }
        sb.append('[');
        return oyr.s(sb, this.b, ']');
    }
}
