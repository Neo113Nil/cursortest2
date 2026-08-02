package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w2r implements r03, tqj {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public w2r(m2s m2sVar, jnq jnqVar) {
        this.a = 4;
        m2sVar.getClass();
        jnqVar.getClass();
        this.c = m2sVar;
        this.d = jnqVar;
        this.b = -1;
    }

    public static w2r c(String str) {
        int i;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        hzm hzmVar = hzm.HTTP_1_0;
        if (startsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                hzmVar = hzm.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new w2r(hzmVar, parseInt, str2, 3);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public Object a(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    @Override // defpackage.r03
    public q03 b(s2c s2cVar, long j) {
        long j2;
        long position = s2cVar.getPosition();
        int min = (int) Math.min(112800, s2cVar.getLength() - position);
        d7k d7kVar = (d7k) this.d;
        d7kVar.E(min);
        s2cVar.A(d7kVar.a, 0, min);
        int i = d7kVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (d7kVar.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = d7kVar.a;
            int i2 = d7kVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long U = f8g.U(d7kVar, i2, this.b);
            if (U != j2) {
                long b = ((ojs) this.c).b(U);
                if (b > j) {
                    return j5 == j2 ? new q03(-1, b, position) : q03.b(position + j4);
                }
                if (100000 + b > j) {
                    return q03.b(position + i2);
                }
                j5 = b;
                j4 = i2;
            }
            d7kVar.H(i3);
            j3 = i3;
        }
        return j5 != j2 ? new q03(-2, j5, position + j3) : q03.d;
    }

    @Override // defpackage.r03
    public void d() {
        d7k d7kVar = (d7k) this.d;
        byte[] bArr = dvt.c;
        d7kVar.getClass();
        d7kVar.F(bArr.length, bArr);
    }

    public void e(int i) {
        r0s r0sVar;
        m2s m2sVar = (m2s) this.c;
        if (i == this.b || (r0sVar = (r0s) CollectionsKt.S(m2sVar.c, i)) == null) {
            return;
        }
        this.b = i;
        jnq jnqVar = (jnq) this.d;
        String str = r0sVar.a;
        boolean z = m2sVar.b == i;
        jnqVar.getClass();
        nmb nmbVar = jnqVar.c;
        String G = jnqVar.a.G();
        cvo cvoVar = jnqVar.b;
        wjb wjbVar = cvoVar.a;
        String str2 = cvoVar.d.a;
        int i2 = i + 1;
        avo avoVar = cvoVar.e;
        nmbVar.B(G, wjbVar, str2, avoVar.a, avoVar.b, str, i2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        bd2 bd2Var;
        n3m n3mVar;
        sbx sbxVar = (sbx) this.c;
        ohx ohxVar = (ohx) this.d;
        int i = this.b;
        String str = sbxVar.d;
        if (!((Boolean) obj).booleanValue()) {
            return;
        }
        nhx o = ohx.o(ohxVar);
        o.c();
        ohx.y((ohx) o.b, str);
        o.c();
        ohx.s((ohx) o.b, str);
        Long l = sbxVar.e;
        if (l != null) {
            int longValue = (int) l.longValue();
            o.c();
            ohx.v((ohx) o.b, longValue);
        }
        ohx ohxVar2 = (ohx) o.b();
        int i2 = sbxVar.i;
        int i3 = i2 - 1;
        bd2 bd2Var2 = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                bd2Var = new bd2(Integer.valueOf(i - 1), ohxVar2, lsm.a, null);
            }
            sbx.j.b("analytics event: %s", bd2Var2);
            y1g.G(bd2Var2);
            n3mVar = sbxVar.g;
            if (n3mVar == null) {
                n3mVar.P0(bd2Var2, new wvs(9));
                return;
            }
            return;
        }
        bd2Var = new bd2(Integer.valueOf(i - 1), ohxVar2, lsm.b, null);
        bd2Var2 = bd2Var;
        sbx.j.b("analytics event: %s", bd2Var2);
        y1g.G(bd2Var2);
        n3mVar = sbxVar.g;
        if (n3mVar == null) {
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((izm) this.c) == izm.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            case 3:
                String str = (String) this.d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((hzm) this.c) == hzm.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb2.append(' ');
                sb2.append(this.b);
                sb2.append(' ');
                sb2.append(str);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w2r(int i, byte b) {
        this.a = i;
    }

    public w2r(int i, String str, ArrayList arrayList) {
        this.a = 9;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public /* synthetic */ w2r(Enum r1, int i, String str, int i2) {
        this.a = i2;
        this.c = r1;
        this.b = i;
        this.d = str;
    }

    public /* synthetic */ w2r(sbx sbxVar, ohx ohxVar, int i) {
        this.a = 12;
        this.c = sbxVar;
        this.d = ohxVar;
        this.b = i;
    }

    public w2r(int i) {
        this.a = 10;
        this.b = i;
    }

    public w2r(int i, zii ziiVar, ArrayList arrayList, mqs mqsVar) {
        this.a = 5;
        this.b = i;
        this.c = ziiVar;
        this.d = mqsVar;
    }

    public w2r(e7o e7oVar) {
        this.a = 1;
        this.c = new SparseArray();
        this.d = e7oVar;
        this.b = -1;
    }

    public w2r(int i, ojs ojsVar) {
        this.a = 6;
        this.b = i;
        this.c = ojsVar;
        this.d = new d7k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w2r(Context context, Function0 function0, int i) {
        this.a = 8;
        context.getClass();
        this.c = context;
        this.d = (uif) function0;
        this.b = i;
    }
}
