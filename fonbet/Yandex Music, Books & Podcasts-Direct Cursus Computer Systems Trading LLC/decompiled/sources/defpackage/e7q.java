package defpackage;

import com.yandex.music.shared.search.network.SearchApi;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$AddLast;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$AddNext;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$Move;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$RemoveAt;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$Back;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$Next;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$OriginalPosition;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$QueuePosition;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleWithIndices;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class e7q implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e7q(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(b7q.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new uts((b7q) qdcVar.D(I, l13Var, set), (vsb) qdcVar.D(hag.I(vsb.class), l13Var, set), (dqb) qdcVar.D(hag.I(dqb.class), l13Var, set), (j3t) qdcVar.D(hag.I(j3t.class), l13Var, set), (fys) qdcVar.D(hag.I(fys.class), l13Var, set), (uhr) qdcVar.D(hag.I(uhr.class), l13Var, set), (udp) qdcVar.D(hag.I(udp.class), l13Var, set), (z66) qdcVar.D(hag.I(z66.class), l13Var, set), (zzp) qdcVar.D(hag.I(zzp.class), l13Var, set), (r5q) qdcVar.D(hag.I(r5q.class), l13Var, set));
            case 1:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new cvs((b7q) l13Var2.a.D(hag.I(b7q.class), l13Var2, l13Var2.b));
            case 2:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new zzd((b7q) l13Var3.a.D(hag.I(b7q.class), l13Var3, l13Var3.b));
            case 3:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new oco((b7q) l13Var4.a.D(hag.I(b7q.class), l13Var4, l13Var4.b));
            case 4:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new z9c((b7q) l13Var5.a.D(hag.I(b7q.class), l13Var5, l13Var5.b));
            case 5:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new h92((b7q) l13Var6.a.D(hag.I(b7q.class), l13Var6, l13Var6.b));
            case 6:
                ((l13) obj).getClass();
                return new dpt();
            case 7:
                ((l13) obj).getClass();
                return new zlr();
            case 8:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new vsb((b7q) l13Var7.a.D(hag.I(b7q.class), l13Var7, l13Var7.b));
            case 9:
                ((l13) obj).getClass();
                return new jmf();
            case 10:
                ((l13) obj).getClass();
                return new fys();
            case 11:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new zss((fys) l13Var8.a.D(hag.I(fys.class), l13Var8, l13Var8.b));
            case 12:
                ((l13) obj).getClass();
                return new kvs();
            case 13:
                ((l13) obj).getClass();
                dq7 dq7Var = ca8.a;
                return new lka(mn7.d.I0(4));
            case 14:
                ((l13) obj).getClass();
                return new ssm();
            case 15:
                ((l13) obj).getClass();
                return new l73();
            case 16:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new xol((b7q) l13Var9.a.D(hag.I(b7q.class), l13Var9, l13Var9.b));
            case 17:
                ((l13) obj).getClass();
                return new ynf();
            case 18:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new h1p((SearchApi) l13Var10.a.D(hag.I(SearchApi.class), l13Var10, l13Var10.b));
            case 19:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 0);
                return Unit.a;
            case 20:
                ((YnisonNavigateCommand$Next) obj).getClass();
                return "Next";
            case 21:
                YnisonEditQueueCommand$Move ynisonEditQueueCommand$Move = (YnisonEditQueueCommand$Move) obj;
                ynisonEditQueueCommand$Move.getClass();
                return dfi.f("Move(from=", ynisonEditQueueCommand$Move.getFrom(), ynisonEditQueueCommand$Move.getTo(), ", to=", ")");
            case 22:
                throw ouj.g(obj);
            case 23:
                YnisonEditQueueCommand$AddNext ynisonEditQueueCommand$AddNext = (YnisonEditQueueCommand$AddNext) obj;
                ynisonEditQueueCommand$AddNext.getClass();
                return dfi.c(ynisonEditQueueCommand$AddNext.getPlayables().size(), "PlayNext(", " tracks)");
            case 24:
                ((YnisonNavigateCommand$Back) obj).getClass();
                return "Back";
            case 25:
                YnisonEditQueueCommand$AddLast ynisonEditQueueCommand$AddLast = (YnisonEditQueueCommand$AddLast) obj;
                ynisonEditQueueCommand$AddLast.getClass();
                return dfi.c(ynisonEditQueueCommand$AddLast.getPlayables().size(), "PlayLast(", " tracks)");
            case 26:
                YnisonEditQueueCommand$RemoveAt ynisonEditQueueCommand$RemoveAt = (YnisonEditQueueCommand$RemoveAt) obj;
                ynisonEditQueueCommand$RemoveAt.getClass();
                return dfi.c(ynisonEditQueueCommand$RemoveAt.getPosition(), "Remove(at=", ")");
            case 27:
                YnisonOptionCommand$ShuffleWithIndices ynisonOptionCommand$ShuffleWithIndices = (YnisonOptionCommand$ShuffleWithIndices) obj;
                ynisonOptionCommand$ShuffleWithIndices.getClass();
                return hrg.q("Shuffled(indices=", ynisonOptionCommand$ShuffleWithIndices.getIndices() == null ? "null" : "indices", ")");
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                YnisonNavigateCommand$QueuePosition ynisonNavigateCommand$QueuePosition = (YnisonNavigateCommand$QueuePosition) obj;
                ynisonNavigateCommand$QueuePosition.getClass();
                return dfi.c(ynisonNavigateCommand$QueuePosition.getIndex(), "Position(queue=", ")");
            default:
                YnisonNavigateCommand$OriginalPosition ynisonNavigateCommand$OriginalPosition = (YnisonNavigateCommand$OriginalPosition) obj;
                ynisonNavigateCommand$OriginalPosition.getClass();
                return dfi.c(ynisonNavigateCommand$OriginalPosition.getIndex(), "Position(original=", ")");
        }
    }
}
