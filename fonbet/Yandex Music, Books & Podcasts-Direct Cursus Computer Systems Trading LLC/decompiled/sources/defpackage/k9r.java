package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class k9r extends jbp {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k9r(onh onhVar, ip3 ip3Var, Executor executor) {
        super(r0.a(), new f4m(14), ip3Var, executor);
        wmh a = onhVar.a();
        gnh gnhVar = onhVar.b;
        gnhVar.getClass();
        Uri uri = gnhVar.a;
        String path = uri.getPath();
        if (path != null) {
            Matcher matcher = dvt.h.matcher(path);
            if (matcher.matches() && matcher.group(1) == null) {
                uri = Uri.withAppendedPath(uri, "Manifest");
            }
        }
        a.e = uri;
    }

    @Override // defpackage.jbp
    public final ArrayList d(jp3 jp3Var, icc iccVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (m9r m9rVar : ((n9r) iccVar).f) {
            for (int i = 0; i < m9rVar.j.length; i++) {
                for (int i2 = 0; i2 < m9rVar.k; i2++) {
                    arrayList.add(new hbp(m9rVar.o[i2], new nb7(m9rVar.a(i, i2))));
                }
            }
        }
        return arrayList;
    }
}
