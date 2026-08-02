package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import java.io.Serializable;
import kotlin.Pair;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.f;

/* loaded from: classes4.dex */
public final class r8j {
    public final y a;
    public final Context b;
    public final kxi c;
    public final PlaybackScope d;
    public final boolean e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;

    public r8j(lt ltVar, y yVar, Context context, kxi kxiVar, PlaybackScope playbackScope, boolean z) {
        yVar.getClass();
        context.getClass();
        playbackScope.getClass();
        this.a = yVar;
        this.b = context;
        this.c = kxiVar;
        this.d = playbackScope;
        this.e = z;
        this.f = btf.b(new u5i(26));
        bdt I = hag.I(k68.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = btf.b(new u5i(27));
        this.i = l18Var.b(hag.I(lwc.class), true);
        this.j = l18Var.b(hag.I(f7l.class), true);
        this.k = l18Var.b(hag.I(k1l.class), true);
        this.l = l18Var.b(hag.I(k1l.class), true);
        this.m = btf.b(new u5i(28));
        this.n = l18Var.b(hag.I(uaa.class), true);
        this.o = l18Var.b(hag.I(raa.class), true);
        this.p = l18Var.b(hag.I(xba.class), true);
        this.q = l18Var.b(hag.I(z66.class), true);
        this.r = l18Var.b(hag.I(ms.class), true);
        this.s = l18Var.b(hag.I(e.class), true);
        this.t = l18Var.b(hag.I(f.class), true);
        this.u = btf.b(new y6g(21, this, ltVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, cg6 cg6Var) {
        q8j q8jVar;
        int i;
        Pair pair;
        if (cg6Var instanceof q8j) {
            q8jVar = (q8j) cg6Var;
            int i2 = q8jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q8jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q8jVar.j;
                nm6 nm6Var = nm6.a;
                i = q8jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ms msVar = (ms) this.r.getValue();
                    q8jVar.l = 1;
                    obj = msVar.d(str, q8jVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pair = (Pair) obj;
                if (pair == null) {
                    return (oq) pair.a;
                }
                return null;
            }
        }
        q8jVar = new q8j(this, cg6Var);
        Object obj2 = q8jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = q8jVar.l;
        if (i != 0) {
        }
        pair = (Pair) obj2;
        if (pair == null) {
        }
    }
}
