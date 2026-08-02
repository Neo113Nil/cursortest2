package defpackage;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class itp extends ou2 {
    private static final long serialVersionUID = 2037000528850475650L;
    public final euo g = euo.v;

    @Override // defpackage.ypt
    public final cqt T() {
        gtp b = b();
        int i = b == null ? -1 : htp.a[b.ordinal()];
        if (i == -1) {
            return new aqt(wjb.SettingsScreen);
        }
        if (i == 1) {
            return new aqt(wjb.SettingsAutoDownloadScreen);
        }
        b6e.s();
        return null;
    }

    public final gtp b() {
        Object obj;
        tjl tjlVar = gtp.a;
        String a = a(1);
        tjlVar.getClass();
        Iterator it = gtp.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ((gtp) obj).getClass();
            if ("auto-download".equals(a)) {
                break;
            }
        }
        return (gtp) obj;
    }

    @Override // defpackage.ypt
    public final euo getType() {
        return this.g;
    }
}
