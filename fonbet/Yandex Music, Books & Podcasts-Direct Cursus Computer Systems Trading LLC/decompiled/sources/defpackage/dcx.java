package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dcx extends wcx {
    public final q5x a;
    public final int b;

    public dcx(o6x o6xVar) {
        o6xVar.getClass();
        this.a = o6xVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            q5x q5xVar = this.a;
            if (i >= q5xVar.size()) {
                break;
            }
            int b = ((wcx) q5xVar.get(i)).b();
            if (i2 < b) {
                i2 = b;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new pg5("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.wcx
    public final int a() {
        return wcx.d(Byte.MIN_VALUE);
    }

    @Override // defpackage.wcx
    public final int b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wcx wcxVar = (wcx) obj;
        int a = wcxVar.a();
        int d = wcx.d(Byte.MIN_VALUE);
        if (d != a) {
            return d - wcxVar.a();
        }
        q5x q5xVar = ((dcx) wcxVar).a;
        q5x q5xVar2 = this.a;
        if (q5xVar2.size() != q5xVar.size()) {
            return q5xVar2.size() - q5xVar.size();
        }
        for (int i = 0; i < q5xVar2.size(); i++) {
            int compareTo = ((wcx) q5xVar2.get(i)).compareTo((wcx) q5xVar.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dcx.class == obj.getClass()) {
            return this.a.equals(((dcx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(wcx.d(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        q5x q5xVar = this.a;
        if (q5xVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = q5xVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((wcx) q5xVar.get(i)).toString().replace(StringUtil.LF, "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(wfl.e(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(wfl.e(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }
}
