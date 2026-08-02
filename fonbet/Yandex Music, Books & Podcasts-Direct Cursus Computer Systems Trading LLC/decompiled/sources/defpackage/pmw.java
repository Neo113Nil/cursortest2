package defpackage;

import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.api.commands.SetPlaybackSpeedCommand;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class pmw {
    public static final String d = f1d.g("YnisonShared:", "PlayerDiffController");
    public final zzp a;
    public final amw b;
    public final fmw c;

    public pmw(zzp zzpVar, amw amwVar, slw slwVar, fmw fmwVar) {
        this.a = zzpVar;
        this.b = amwVar;
        this.c = fmwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(maq maqVar, fpw fpwVar, cg6 cg6Var) {
        omw omwVar;
        int i;
        maq maqVar2;
        long longValue;
        long j;
        h4q h4qVar;
        fpw fpwVar2 = fpwVar;
        amw amwVar = this.b;
        knn knnVar = amwVar.d;
        if (cg6Var instanceof omw) {
            omwVar = (omw) cg6Var;
            int i2 = omwVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                omwVar.n = i2 - Integer.MIN_VALUE;
                Object obj = omwVar.l;
                nm6 nm6Var = nm6.a;
                i = omwVar.n;
                String str = d;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = amwVar.b().c.a;
                    boolean z2 = fpwVar2.a;
                    if (z != z2) {
                        k5r.v("Updating playing status: ", z2, 4, str, null);
                        amw.a((amw) knnVar.b, new ToggleCommand(false));
                    }
                    pbx pbxVar = (pbx) amwVar.b().c.c;
                    omwVar.j = maqVar;
                    omwVar.k = fpwVar2;
                    omwVar.n = 1;
                    obj = pbxVar.b(omwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    maqVar2 = maqVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fpwVar2 = omwVar.k;
                    maqVar2 = omwVar.j;
                    qgg.h0(obj);
                }
                longValue = ((Number) obj).longValue();
                j = fpwVar2.b;
                h4qVar = fpwVar2.d;
                if (Math.abs(longValue - j) > 2000) {
                    n7q n7qVar = amwVar.b().b;
                    Integer num = n7qVar != null ? new Integer(euk.K(n7qVar)) : null;
                    int i3 = maqVar2.i();
                    if (num != null && num.intValue() == i3) {
                        ssg.a(4, str, dfi.d(j, "Updating playback progress: "), null);
                        amw.a((amw) knnVar.b, new SeekToPositionCommand(j));
                    }
                }
                if (!gdg.u((h4q) ((jyr) amwVar.b().c.e).getValue(), h4qVar)) {
                    ssg.a(4, str, "Updating playback speed " + h4qVar, null);
                    amw.a((amw) knnVar.b, new SetPlaybackSpeedCommand(h4qVar));
                }
                return Unit.a;
            }
        }
        omwVar = new omw(this, cg6Var);
        Object obj2 = omwVar.l;
        nm6 nm6Var2 = nm6.a;
        i = omwVar.n;
        String str2 = d;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        j = fpwVar2.b;
        h4qVar = fpwVar2.d;
        if (Math.abs(longValue - j) > 2000) {
        }
        if (!gdg.u((h4q) ((jyr) amwVar.b().c.e).getValue(), h4qVar)) {
        }
        return Unit.a;
    }
}
