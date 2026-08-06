package I;

import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t1.l;

/* loaded from: classes.dex */
public final class a extends j implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f706e = new a(1);

    @Override // t1.l
    public final Object invoke(Object obj) {
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
        return "  " + ((d) entry.getKey()).f712a + " = " + valueOf;
    }
}
