package G;

import D0.l;
import E0.i;
import E0.j;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends j implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f328f = new a(1);

    @Override // D0.l
    public final Object i(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            i.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i2 = 0;
            for (byte b2 : bArr) {
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b2));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f334a + " = " + valueOf;
    }
}
