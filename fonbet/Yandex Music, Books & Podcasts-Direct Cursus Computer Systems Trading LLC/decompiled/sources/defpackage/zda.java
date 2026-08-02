package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.metrics.o;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zda implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ zda(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dd, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e8, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e6, code lost:
    
        if (r0 != false) goto L77;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return gl5.b(Long.valueOf(((pda) obj2).b), Long.valueOf(((pda) obj).b));
            case 1:
                return gl5.b(q7g.R(((gga) obj).a.b), q7g.R(((gga) obj2).a.b));
            case 2:
                return gl5.b(((gga) obj2).a.o, ((gga) obj).a.o);
            case 3:
                return gl5.b(((gga) obj2).a.n, ((gga) obj).a.n);
            case 4:
                return gl5.b(Long.valueOf(((gga) obj2).b), Long.valueOf(((gga) obj).b));
            case 5:
                return gl5.b(Long.valueOf(((hia) obj2).e), Long.valueOf(((hia) obj).e));
            case 6:
                return gl5.b(q7g.R(((jja) obj).a.d.d), q7g.R(((jja) obj2).a.d.d));
            case 7:
                return gl5.b(q7g.R(((jja) obj).a.c), q7g.R(((jja) obj2).a.c));
            case 8:
                return gl5.b(Long.valueOf(((jja) obj2).b), Long.valueOf(((jja) obj).b));
            case 9:
                zl2 zl2Var = (zl2) obj;
                int i = 0;
                Integer valueOf = Integer.valueOf(zl2Var.d ? 2 : zl2Var.e ? 1 : 0);
                zl2 zl2Var2 = (zl2) obj2;
                if (zl2Var2.d) {
                    i = 2;
                } else if (zl2Var2.e) {
                    i = 1;
                }
                return gl5.b(valueOf, Integer.valueOf(i));
            case 10:
                l1d l1dVar = (l1d) obj;
                l1d l1dVar2 = (l1d) obj2;
                RecyclerView recyclerView = l1dVar.d;
                if ((recyclerView == null) == (l1dVar2.d == null)) {
                    boolean z = l1dVar.a;
                    if (z == l1dVar2.a) {
                        int i2 = l1dVar2.b - l1dVar.b;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = l1dVar.c - l1dVar2.c;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                }
                break;
            case 11:
                return gl5.b(((ggd) obj).b(), ((ggd) obj2).b());
            case 12:
                return gl5.b(Boolean.valueOf(((ggd) obj2).d()), Boolean.valueOf(((ggd) obj).d()));
            case 13:
                Long timeSinceLastVoiceActivity = ((egd) obj).f.getTimeSinceLastVoiceActivity();
                Long valueOf2 = Long.valueOf(timeSinceLastVoiceActivity != null ? timeSinceLastVoiceActivity.longValue() : Long.MAX_VALUE);
                Long timeSinceLastVoiceActivity2 = ((egd) obj2).f.getTimeSinceLastVoiceActivity();
                return gl5.b(valueOf2, Long.valueOf(timeSinceLastVoiceActivity2 != null ? timeSinceLastVoiceActivity2.longValue() : Long.MAX_VALUE));
            case 14:
                return gl5.b(Float.valueOf(((ftd) obj).c.e()), Float.valueOf(((ftd) obj2).c.e()));
            case 15:
                return Integer.compare(((laf) obj).a, ((laf) obj2).a);
            case 16:
                return gl5.b(((rld) obj).getId(), ((rld) obj2).getId());
            case 17:
                return gl5.b(q7g.R(((oq) obj).b), q7g.R(((oq) obj2).b));
            case 18:
                return gl5.b(((oq) obj2).E, ((oq) obj).E);
            case 19:
                return gl5.b(q7g.R(((kca) obj).a.b), q7g.R(((kca) obj2).a.b));
            case 20:
                return gl5.b(Long.valueOf(((kca) obj2).b), Long.valueOf(((kca) obj).b));
            case 21:
                return gl5.b(q7g.R(((gga) obj).a.b), q7g.R(((gga) obj2).a.b));
            case 22:
                return gl5.b(Long.valueOf(((gga) obj2).b), Long.valueOf(((gga) obj).b));
            case 23:
                return gl5.b(q7g.R(((cvl) obj).b), q7g.R(((cvl) obj2).b));
            case 24:
                return gl5.b(((cvl) obj2).A, ((cvl) obj).A);
            case 25:
                return gl5.b(((cvl) obj2).o, ((cvl) obj).o);
            case 26:
                lqs I = ((jja) obj2).a.I();
                lqs lqsVar = lqs.c;
                return gl5.b(Boolean.valueOf(I == lqsVar), Boolean.valueOf(((jja) obj).a.I() == lqsVar));
            case 27:
                lqs I2 = ((jja) obj2).a.I();
                lqs lqsVar2 = lqs.d;
                return gl5.b(Boolean.valueOf(I2 == lqsVar2), Boolean.valueOf(((jja) obj).a.I() == lqsVar2));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return gl5.b(q7g.R(((jja) obj).a.c), q7g.R(((jja) obj2).a.c));
            default:
                return gl5.b(Long.valueOf(((jja) obj2).b), Long.valueOf(((jja) obj).b));
        }
    }
}
