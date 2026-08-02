package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class s2i {
    public static final Logger c = Logger.getLogger(s2i.class.getName());
    public static final rwd d = new rwd(27);
    public static final yq2 e;
    public Object[] a;
    public int b;

    static {
        yq2 yq2Var = ar2.c;
        if (yq2Var.b != null) {
            yq2Var = new yq2(yq2Var.a, (Character) null);
        }
        e = yq2Var;
    }

    public s2i(int i, Object[] objArr) {
        this.b = i;
        this.a = objArr;
    }

    public final void a(o2i o2iVar) {
        if (this.b == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                Arrays.fill(this.a, i2 * 2, i3 * 2, (Object) null);
                this.b = i2;
                return;
            }
            if (!Arrays.equals(o2iVar.b, f(i))) {
                byte[] f = f(i);
                Object[] objArr = this.a;
                int i4 = i2 * 2;
                objArr[i4] = f;
                Object obj = objArr[(i * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr.length);
                }
                this.a[i4 + 1] = obj;
                i2++;
            }
            i++;
        }
    }

    public final void b(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.b;
        if (i2 != 0) {
            System.arraycopy(this.a, 0, objArr, 0, i2 * 2);
        }
        this.a = objArr;
    }

    public final Object c(o2i o2iVar) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (Arrays.equals(o2iVar.b, f(i))) {
                Object obj = this.a[(i * 2) + 1];
                if (obj instanceof byte[]) {
                    return o2iVar.a((byte[]) obj);
                }
                ((p2i) obj).getClass();
                return o2iVar.a(null);
            }
        }
        return null;
    }

    public final Set d() {
        if (this.b == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(this.b);
        for (int i = 0; i < this.b; i++) {
            hashSet.add(new String(f(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final void e(s2i s2iVar) {
        int i = s2iVar.b;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.a;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.b;
        int i3 = length - (i2 * 2);
        if (i2 == 0 || i3 < i * 2) {
            b((i * 2) + (i2 * 2));
        }
        System.arraycopy(s2iVar.a, 0, this.a, this.b * 2, s2iVar.b * 2);
        this.b += s2iVar.b;
    }

    public final byte[] f(int i) {
        return (byte[]) this.a[i * 2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 == (r2 != null ? r2.length : 0)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(o2i o2iVar, Object obj) {
        o2g.O(o2iVar, PListParser.TAG_KEY);
        o2g.O(obj, Constants.KEY_VALUE);
        int i = this.b;
        int i2 = i * 2;
        if (i2 != 0) {
            Object[] objArr = this.a;
        }
        b(Math.max(i * 4, 8));
        int i3 = this.b;
        this.a[i3 * 2] = o2iVar.b;
        this.a[(i3 * 2) + 1] = o2iVar.b(obj);
        this.b++;
    }

    public final String toString() {
        byte[] bArr;
        byte[] bArr2;
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] f = f(i);
            Charset charset = pe4.a;
            String str = new String(f, charset);
            sb.append(str);
            sb.append('=');
            boolean endsWith = str.endsWith("-bin");
            Object[] objArr = this.a;
            if (endsWith) {
                Object obj = objArr[(i * 2) + 1];
                if (obj instanceof byte[]) {
                    bArr2 = (byte[]) obj;
                } else {
                    ((p2i) obj).getClass();
                    bArr2 = null;
                }
                sb.append(e.c(bArr2));
            } else {
                Object obj2 = objArr[(i * 2) + 1];
                if (obj2 instanceof byte[]) {
                    bArr = (byte[]) obj2;
                } else {
                    ((p2i) obj2).getClass();
                    bArr = null;
                }
                sb.append(new String(bArr, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
