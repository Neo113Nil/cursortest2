package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class r67 extends w67 {
    public String m;
    public String n;

    @Override // defpackage.w67, defpackage.j67
    public final void o(StringBuilder sb) {
        super.o(sb);
        sb.append(" cpu: '" + this.n + "' os: '" + this.m + "'");
    }

    @Override // defpackage.w67
    public final dkp p(p2f p2fVar) {
        a q = q(false);
        q.q.a = p2fVar;
        return new dkp(p2fVar, q.i(), q.e(), q);
    }

    @Override // defpackage.w67
    public final a q(boolean z) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("cpu", this.n);
        hashMap.put("os", this.m);
        Map unmodifiableMap = Collections.unmodifiableMap(this.g);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
            for (String str : hashMap.keySet()) {
                Object obj = hashMap.get(str);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                a.y(byteArrayOutputStream2, str);
                if (obj != null) {
                    if (obj instanceof String) {
                        byteArrayOutputStream2.write(61);
                        a.y(byteArrayOutputStream2, (String) obj);
                    } else {
                        if (!(obj instanceof byte[])) {
                            throw new IllegalArgumentException("invalid property value: " + obj);
                        }
                        byte[] bArr = (byte[]) obj;
                        if (bArr.length > 0) {
                            byteArrayOutputStream2.write(61);
                            byteArrayOutputStream2.write(bArr, 0, bArr.length);
                        } else {
                            obj = null;
                        }
                    }
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (byteArray.length > 255) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                    sb.append(str);
                    sb.append(obj != null ? "" : "=" + obj);
                    throw new IOException(sb.toString());
                }
                byteArrayOutputStream.write((byte) byteArray.length);
                byteArrayOutputStream.write(byteArray, 0, byteArray.length);
            }
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            if (byteArray2 == null || byteArray2.length <= 0) {
                byteArray2 = w67.l;
            }
            return new a(unmodifiableMap, 0, 0, 0, z, byteArray2);
        } catch (IOException e) {
            qq6.b(e, "unexpected exception: ");
            return null;
        }
    }

    @Override // defpackage.w67
    public final boolean r(p2f p2fVar) {
        return false;
    }

    @Override // defpackage.w67
    public final boolean s(p2f p2fVar) {
        return false;
    }

    @Override // defpackage.w67
    public final boolean t() {
        return true;
    }

    @Override // defpackage.w67
    public final boolean u(w67 w67Var) {
        String str = this.m;
        if (!(w67Var instanceof r67)) {
            return false;
        }
        r67 r67Var = (r67) w67Var;
        String str2 = r67Var.m;
        String str3 = r67Var.n;
        String str4 = this.n;
        if (str4 != null || str3 == null) {
            return (str != null || str2 == null) && str4.equals(str3) && str.equals(str2);
        }
        return false;
    }

    @Override // defpackage.w67
    public final void v(n67 n67Var) {
        String str = this.n + StringUtil.SPACE + this.m;
        n67Var.D(str.length(), str);
    }
}
