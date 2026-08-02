package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class xq5 implements ufb {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public final void a(br2 br2Var) {
        this.a.add(br2Var);
    }

    @Override // defpackage.ufb
    public final boolean b(PlaybackException playbackException) {
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ufb) it.next()).b(playbackException)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ufb
    public final qld c(PlaybackException playbackException) {
        Object obj;
        qld c;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ufb) obj).b(playbackException)) {
                break;
            }
        }
        ufb ufbVar = (ufb) obj;
        return (ufbVar == null || (c = ufbVar.c(playbackException)) == null) ? sfb.p : c;
    }
}
