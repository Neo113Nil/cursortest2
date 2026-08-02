package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.UnsupportedSchemeException;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.KotlinVersion;
import ru.yandex.music.url.ui.StubActivity;
import ru.yandex.music.utils.Assertions;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes6.dex */
public final class n20 implements tft, al2, mqb, nsd {
    public boolean a;

    public n20(bfg bfgVar, ikj ikjVar) {
        int i = ikjVar.a;
        ByteBuffer byteBuffer = ikjVar.b;
        vq1.v(i == 6 || i == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        v94 v94Var = new v94(bArr, min);
        bfgVar.getClass();
        ngg.l(false);
        if (v94Var.h()) {
            this.a = false;
            return;
        }
        int i2 = v94Var.i(2);
        boolean h = v94Var.h();
        ngg.l(false);
        if (!h) {
            this.a = true;
            return;
        }
        boolean h2 = (i2 == 3 || i2 == 0) ? true : v94Var.h();
        v94Var.s();
        ngg.l(!false);
        if (v94Var.h()) {
            ngg.l(!false);
            v94Var.s();
        }
        ngg.l(false);
        if (i2 != 3) {
            v94Var.s();
        }
        v94Var.t(0);
        if (i2 != 2 && i2 != 0 && !h2) {
            v94Var.t(3);
        }
        this.a = ((i2 == 3 || i2 == 0) ? KotlinVersion.MAX_COMPONENT_VALUE : v94Var.i(8)) != 0;
    }

    public static int f(ArrayList arrayList, int i, llo lloVar) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        jlo jloVar = lloVar.b;
        if (obj != jloVar) {
            return -1;
        }
        Iterator it = jloVar.a().iterator();
        while (it.hasNext()) {
            if (((nlo) it.next()) == lloVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList j(bo3 bo3Var) {
        ArrayList arrayList = new ArrayList();
        while (!bo3Var.p()) {
            String str = (String) bo3Var.d;
            String str2 = null;
            if (!bo3Var.p()) {
                int i = bo3Var.b;
                char charAt = str.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    bo3Var.b = i;
                } else {
                    int i2 = bo3Var.i();
                    while (true) {
                        if ((i2 < 65 || i2 > 90) && (i2 < 97 || i2 > 122)) {
                            break;
                        }
                        i2 = bo3Var.i();
                    }
                    str2 = str.substring(i, bo3Var.b);
                }
            }
            if (str2 == null) {
                break;
            }
            try {
                arrayList.add(co3.valueOf(str2));
            } catch (IllegalArgumentException unused) {
            }
            if (!bo3Var.K()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean m(mo3 mo3Var, int i, ArrayList arrayList, int i2, llo lloVar) {
        no3 no3Var = (no3) mo3Var.a.get(i);
        if (!s(no3Var, lloVar)) {
            return false;
        }
        int i3 = no3Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!r(mo3Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return r(mo3Var, i - 1, arrayList, i2);
        }
        int f = f(arrayList, i2, lloVar);
        if (f <= 0) {
            return false;
        }
        return m(mo3Var, i - 1, arrayList, i2, (llo) lloVar.b.a().get(f - 1));
    }

    public static boolean o(mo3 mo3Var, llo lloVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = lloVar.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((nlo) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = mo3Var.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = mo3Var.a;
        if (size2 == 1) {
            return s((no3) arrayList3.get(0), lloVar);
        }
        return m(mo3Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, lloVar);
    }

    public static boolean r(mo3 mo3Var, int i, ArrayList arrayList, int i2) {
        no3 no3Var = (no3) mo3Var.a.get(i);
        llo lloVar = (llo) arrayList.get(i2);
        if (!s(no3Var, lloVar)) {
            return false;
        }
        int i3 = no3Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (r(mo3Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return r(mo3Var, i - 1, arrayList, i2 - 1);
        }
        int f = f(arrayList, i2, lloVar);
        if (f <= 0) {
            return false;
        }
        return m(mo3Var, i - 1, arrayList, i2, (llo) lloVar.b.a().get(f - 1));
    }

    public static boolean s(no3 no3Var, llo lloVar) {
        ArrayList arrayList;
        String str = no3Var.b;
        if (str != null && !str.equals(lloVar.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = no3Var.c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ao3 ao3Var = (ao3) it.next();
                String str2 = ao3Var.a;
                String str3 = ao3Var.c;
                if (str2.equals(ConnectableDevice.KEY_ID)) {
                    if (!str3.equals(lloVar.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = lloVar.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = no3Var.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((do3) it2.next()).a(lloVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mqb
    public oqb a(UUID uuid) {
        t7o t7oVar;
        uuid.getClass();
        try {
            r7o r7oVar = z7o.b;
            try {
                xvc xvcVar = new xvc(uuid);
                t7oVar = xvcVar;
                if (this.a) {
                    xvcVar.b.setPropertyString("securityLevel", "L3");
                    t7oVar = xvcVar;
                }
            } catch (UnsupportedSchemeException e) {
                throw new kmt(1, e);
            } catch (Exception e2) {
                throw new kmt(2, e2);
            }
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        Object obj = t7oVar;
        if (a != null) {
            obj = new hsa(a);
        }
        return (oqb) obj;
    }

    public synchronized void b() {
        while (!this.a) {
            wait();
        }
    }

    public synchronized void c() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.al2
    public yk2 create(Context context) {
        context.getClass();
        dc5 dc5Var = fc5.e;
        ame ameVar = ame.a;
        NetworkType c = l2j.d.s(context).c(context);
        String A = dvt.A(context);
        A.getClass();
        double a = ameVar.a(context, c, A);
        boolean z = this.a;
        fc5 a2 = dc5.a(a, z);
        qzc.c = z;
        return a2;
    }

    public synchronized void d() {
        this.a = false;
    }

    @Override // defpackage.nsd
    public boolean e(lmq lmqVar) {
        return this.a;
    }

    public synchronized boolean h() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public void i(lo3 lo3Var, bo3 bo3Var) {
        int intValue;
        char charAt;
        int M;
        String O = bo3Var.O();
        bo3Var.L();
        if (O == null) {
            throw new zn3("Invalid '@' rule");
        }
        int i = 0;
        if (!this.a && O.equals("media")) {
            ArrayList j = j(bo3Var);
            if (!bo3Var.m('{')) {
                throw new zn3("Invalid @media rule: missing rule set");
            }
            bo3Var.L();
            Iterator it = j.iterator();
            while (it.hasNext()) {
                co3 co3Var = (co3) it.next();
                if (co3Var == co3.a || co3Var == co3.b) {
                    this.a = true;
                    lo3Var.b(l(bo3Var));
                    this.a = false;
                    break;
                }
            }
            l(bo3Var);
            if (!bo3Var.p() && !bo3Var.m('}')) {
                throw new zn3("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.a || !O.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + O + " rule");
            while (!bo3Var.p() && ((intValue = bo3Var.A().intValue()) != 59 || i != 0)) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    break;
                }
            }
        } else {
            String str = null;
            if (!bo3Var.p()) {
                int i2 = bo3Var.b;
                if (bo3Var.n("url(")) {
                    bo3Var.L();
                    String N = bo3Var.N();
                    if (N == null) {
                        String str2 = (String) bo3Var.d;
                        StringBuilder sb = new StringBuilder();
                        while (!bo3Var.p() && (charAt = str2.charAt(bo3Var.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !ah3.y(charAt) && !Character.isISOControl((int) charAt)) {
                            bo3Var.b++;
                            if (charAt == '\\') {
                                if (!bo3Var.p()) {
                                    int i3 = bo3Var.b;
                                    bo3Var.b = i3 + 1;
                                    charAt = str2.charAt(i3);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int M2 = bo3.M(charAt);
                                        if (M2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !bo3Var.p() && (M = bo3.M(str2.charAt(bo3Var.b))) != -1; i4++) {
                                                bo3Var.b++;
                                                M2 = (M2 * 16) + M;
                                            }
                                            sb.append((char) M2);
                                        }
                                    }
                                }
                            }
                            sb.append(charAt);
                        }
                        N = sb.length() == 0 ? null : sb.toString();
                    }
                    if (N == null) {
                        bo3Var.b = i2;
                    } else {
                        bo3Var.L();
                        if (bo3Var.p() || bo3Var.n(")")) {
                            str = N;
                        } else {
                            bo3Var.b = i2;
                        }
                    }
                }
            }
            if (str == null) {
                str = bo3Var.N();
            }
            if (str == null) {
                throw new zn3("Invalid @import rule: expected string or url()");
            }
            bo3Var.L();
            j(bo3Var);
            if (!bo3Var.p() && !bo3Var.m(';')) {
                throw new zn3("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        bo3Var.L();
    }

    public boolean k(lo3 lo3Var, bo3 bo3Var) {
        ArrayList P = bo3Var.P();
        if (P == null || P.isEmpty()) {
            return false;
        }
        if (!bo3Var.m('{')) {
            throw new zn3("Malformed rule block: expected '{'");
        }
        bo3Var.L();
        flo floVar = new flo();
        do {
            String O = bo3Var.O();
            bo3Var.L();
            if (!bo3Var.m(':')) {
                throw new zn3("Expected ':'");
            }
            bo3Var.L();
            String str = (String) bo3Var.d;
            String str2 = null;
            if (!bo3Var.p()) {
                int i = bo3Var.b;
                int charAt = str.charAt(i);
                int i2 = i;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!ah3.y(charAt)) {
                        i2 = bo3Var.b + 1;
                    }
                    charAt = bo3Var.i();
                }
                if (bo3Var.b > i) {
                    str2 = str.substring(i, i2);
                } else {
                    bo3Var.b = i;
                }
            }
            if (str2 == null) {
                throw new zn3("Expected property value");
            }
            bo3Var.L();
            if (bo3Var.m('!')) {
                bo3Var.L();
                if (!bo3Var.n("important")) {
                    throw new zn3("Malformed rule set: found unexpected '!'");
                }
                bo3Var.L();
            }
            bo3Var.m(';');
            wmo.C(floVar, O, str2);
            bo3Var.L();
            if (bo3Var.p()) {
                break;
            }
        } while (!bo3Var.m('}'));
        bo3Var.L();
        Iterator it = P.iterator();
        while (it.hasNext()) {
            mo3 mo3Var = (mo3) it.next();
            ko3 ko3Var = new ko3();
            ko3Var.a = mo3Var;
            ko3Var.b = floVar;
            lo3Var.a(ko3Var);
        }
        return true;
    }

    public lo3 l(bo3 bo3Var) {
        lo3 lo3Var = new lo3(0);
        while (!bo3Var.p()) {
            try {
                if (!bo3Var.n("<!--") && !bo3Var.n("-->")) {
                    if (!bo3Var.m('@')) {
                        if (!k(lo3Var, bo3Var)) {
                            break;
                        }
                    } else {
                        i(lo3Var, bo3Var);
                    }
                }
            } catch (zn3 e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return lo3Var;
            }
        }
        return lo3Var;
    }

    @Override // defpackage.nsd
    public boolean n() {
        return this.a;
    }

    @Override // defpackage.tft
    public Intent p(Context context, Intent intent, kqt kqtVar) {
        boolean z = this.a;
        Object obj = kqtVar.b;
        ypt yptVar = kqtVar.a;
        u20 u20Var = (u20) obj;
        int i = kqtVar.c;
        if (i == 1 && u20Var != null) {
            mqs mqsVar = u20Var.b;
            if (z) {
                Assertions.assertNonNull(mqsVar);
            }
            dyd dydVar = new dyd(xpt.a(yptVar));
            Intent U = quj.U(context, new uq(u20Var.a, null, null, mqsVar, z && mqsVar != null, rq.a), null);
            dydVar.c(U);
            return U.putExtra("need_permission", ((ou2) yptVar).O());
        }
        Intent t = w1g.t(context, intent, kqtVar);
        if (t != null) {
            return t;
        }
        if (i == 5) {
            return StubActivity.z(context, rpt.NO_ALBUM);
        }
        if (i != 6) {
            return StubActivity.z(context, rpt.NOT_FOUND);
        }
        mqs mqsVar2 = u20Var != null ? u20Var.b : null;
        n58 K = mqsVar2 != null ? ild.K(mqsVar2) : null;
        int i2 = StubActivity.v;
        return new Intent(context, (Class<?>) StubActivity.class).putExtra("stub_type", fmr.c).putExtra("url_fail_type", rpt.NO_TRACK).putExtra("extra_track", K);
    }

    @Override // defpackage.al2
    public yk2 q(Context context, zle zleVar) {
        context.getClass();
        boolean z = this.a;
        qzc.c = z;
        dc5 dc5Var = fc5.e;
        NetworkType c = l2j.d.s(context).c(context);
        dvt.A(context).getClass();
        return dc5.a(zleVar.a(context, c, r2), z);
    }

    public /* synthetic */ n20(boolean z) {
        this.a = z;
    }
}
