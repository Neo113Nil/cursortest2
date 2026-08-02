package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ou2 implements ypt {
    private static final long serialVersionUID = -4568279064458781355L;
    public final String a = getClass().getSimpleName();
    public String b;
    public String c;
    public HashMap d;
    public List e;
    public boolean f;

    @Override // defpackage.ypt
    public boolean O() {
        return this.f;
    }

    @Override // defpackage.ypt
    public final String Q(String str) {
        HashMap hashMap = this.d;
        if (hashMap != null) {
            return (String) hashMap.get(str);
        }
        return null;
    }

    public final String a(int i) {
        List list = this.e;
        if (list == null || list.size() <= i) {
            return null;
        }
        return (String) list.get(i);
    }

    @Override // defpackage.ypt
    public final Map getParams() {
        return this.d;
    }

    @Override // defpackage.ypt
    public final Uri m() {
        String str = this.b;
        return str == null ? Uri.EMPTY : Uri.parse(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append("] scheme: ");
        sb.append(this.c);
        sb.append("; args: ");
        sb.append(this.e);
        sb.append("; params: ");
        sb.append(this.d);
        sb.append("; need_permissions:");
        return ouj.r(sb, this.f, ".");
    }
}
