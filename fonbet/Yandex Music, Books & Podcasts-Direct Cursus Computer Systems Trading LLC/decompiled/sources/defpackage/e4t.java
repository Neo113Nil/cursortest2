package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class e4t {
    public final Context a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final ArrayList e;
    public final jyr f;

    public e4t(Context context) {
        context.getClass();
        this.a = context;
        bdt I = hag.I(t3g.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(jul.class), true);
        this.d = l18Var.b(hag.I(z66.class), true);
        this.e = new ArrayList();
        this.f = btf.b(new x6s(17));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(9:11|12|13|14|15|16|(1:18)|19|20)(2:28|29))(5:30|31|(1:33)|34|35))(3:36|(1:38)(3:41|42|(6:44|15|16|(0)|19|20))|40)|47|48|49))|50|6|7|(0)(0)|47|48|49|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r2 == r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9 A[Catch: SoMuchTracksException -> 0x003d, IOException -> 0x00d1, TryCatch #1 {IOException -> 0x00d1, blocks: (B:16:0x00a9, B:18:0x00c9, B:19:0x00cc), top: B:15:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mqs mqsVar, cvl cvlVar, cg6 cg6Var) {
        a4t a4tVar;
        int i;
        cvl cvlVar2;
        z3t z3tVar;
        ArrayList arrayList;
        mqs mqsVar2 = mqsVar;
        if (cg6Var instanceof a4t) {
            a4tVar = (a4t) cg6Var;
            int i2 = a4tVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a4tVar.n = i2 - Integer.MIN_VALUE;
                Object obj = a4tVar.l;
                nm6 nm6Var = nm6.a;
                i = a4tVar.n;
                Context context = this.a;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Boolean.valueOf(((j1g) obj) != null);
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvl cvlVar3 = a4tVar.k;
                    mqs mqsVar3 = a4tVar.j;
                    try {
                        qgg.h0(obj);
                        cvlVar2 = cvlVar3;
                        mqsVar2 = mqsVar3;
                    } catch (IOException unused) {
                        cvlVar2 = cvlVar3;
                        String c = g3o.c(R.string.track_not_added_to_playlist, cvlVar2.b);
                        c.getClass();
                        context.getClass();
                        hag.y(context, c);
                        return Boolean.FALSE;
                    }
                    try {
                        z3tVar = new z3t(cvlVar2.g(), mqsVar2.d(), true);
                        arrayList = this.e;
                        if (!arrayList.removeIf(new y3t(objArr2 == true ? 1 : 0, new r3s(6, z3tVar)))) {
                            arrayList.add(z3tVar);
                        }
                        return Boolean.TRUE;
                    } catch (IOException unused2) {
                        String c2 = g3o.c(R.string.track_not_added_to_playlist, cvlVar2.b);
                        c2.getClass();
                        context.getClass();
                        hag.y(context, c2);
                        return Boolean.FALSE;
                    }
                }
                qgg.h0(obj);
                Continuation continuation = null;
                if (cvlVar.d()) {
                    ((t3g) this.b.getValue()).t(mqsVar2);
                    b4t b4tVar = new b4t(this, mqsVar2, continuation, objArr == true ? 1 : 0);
                    a4tVar.j = null;
                    a4tVar.k = null;
                    a4tVar.n = 1;
                    obj = tyf.L(500L, b4tVar, a4tVar);
                } else {
                    try {
                        jul julVar = (jul) this.c.getValue();
                        List c3 = t75.c(mqsVar2);
                        a4tVar.j = mqsVar2;
                        a4tVar.k = cvlVar;
                        a4tVar.n = 2;
                        julVar.getClass();
                        dq7 dq7Var = ca8.a;
                        if (x97.V(mn7.d, new ful(julVar, cvlVar, c3, continuation, 0), a4tVar) != nm6Var) {
                            cvlVar2 = cvlVar;
                            z3tVar = new z3t(cvlVar2.g(), mqsVar2.d(), true);
                            arrayList = this.e;
                            if (!arrayList.removeIf(new y3t(objArr2 == true ? 1 : 0, new r3s(6, z3tVar)))) {
                            }
                            return Boolean.TRUE;
                        }
                    } catch (IOException unused3) {
                        cvlVar2 = cvlVar;
                        String c22 = g3o.c(R.string.track_not_added_to_playlist, cvlVar2.b);
                        c22.getClass();
                        context.getClass();
                        hag.y(context, c22);
                        return Boolean.FALSE;
                    }
                }
                return nm6Var;
                String c4 = g3o.c(R.string.cant_add_more_2000_tracks_to_playlist, new Integer(e.a));
                c4.getClass();
                context.getClass();
                hag.y(context, c4);
                return Boolean.FALSE;
            }
        }
        a4tVar = new a4t(this, cg6Var);
        Object obj2 = a4tVar.l;
        nm6 nm6Var2 = nm6.a;
        i = a4tVar.n;
        Context context2 = this.a;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i == 0) {
        }
        String c42 = g3o.c(R.string.cant_add_more_2000_tracks_to_playlist, new Integer(e.a));
        c42.getClass();
        context2.getClass();
        hag.y(context2, c42);
        return Boolean.FALSE;
    }

    public final void b(mqs mqsVar, LinkedHashMap linkedHashMap, Map map) {
        mqsVar.getClass();
        map.getClass();
        x97.y((mm6) this.f.getValue(), null, null, new inr(map, linkedHashMap, this, mqsVar, (Continuation) null, 7), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(5:22|23|(1:25)|26|27))(3:28|(1:30)(2:33|(5:35|13|(0)|16|17))|32)|36|37|38|39))|40|6|7|(0)(0)|36|37|38|39|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: IOException -> 0x002f, TryCatch #0 {IOException -> 0x002f, blocks: (B:12:0x002b, B:13:0x009a, B:15:0x00ba, B:16:0x00bd, B:33:0x0071), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mqs mqsVar, cvl cvlVar, cg6 cg6Var) {
        c4t c4tVar;
        int i;
        cvl cvlVar2;
        z3t z3tVar;
        ArrayList arrayList;
        if (cg6Var instanceof c4t) {
            c4tVar = (c4t) cg6Var;
            int i2 = c4tVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4tVar.n = i2 - Integer.MIN_VALUE;
                Object obj = c4tVar.l;
                nm6 nm6Var = nm6.a;
                i = c4tVar.n;
                Object[] objArr = 0;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Boolean.valueOf(((j1g) obj) != null);
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvlVar2 = c4tVar.k;
                    mqsVar = c4tVar.j;
                    qgg.h0(obj);
                    z3tVar = new z3t(cvlVar2.g(), mqsVar.d(), false);
                    arrayList = this.e;
                    if (!arrayList.removeIf(new y3t(objArr == true ? 1 : 0, new r3s(6, z3tVar)))) {
                        arrayList.add(z3tVar);
                    }
                    return Boolean.TRUE;
                }
                qgg.h0(obj);
                Continuation continuation = null;
                if (cvlVar.d()) {
                    ((t3g) this.b.getValue()).A(mqsVar);
                    b4t b4tVar = new b4t(this, mqsVar, continuation, i3);
                    c4tVar.j = null;
                    c4tVar.k = null;
                    c4tVar.n = 1;
                    obj = tyf.L(500L, b4tVar, c4tVar);
                } else {
                    jul julVar = (jul) this.c.getValue();
                    List c = t75.c(mqsVar);
                    c4tVar.j = mqsVar;
                    c4tVar.k = cvlVar;
                    c4tVar.n = 2;
                    julVar.getClass();
                    dq7 dq7Var = ca8.a;
                    if (x97.V(mn7.d, new ful(julVar, cvlVar, c, continuation, 1), c4tVar) != nm6Var) {
                        cvlVar2 = cvlVar;
                        z3tVar = new z3t(cvlVar2.g(), mqsVar.d(), false);
                        arrayList = this.e;
                        if (!arrayList.removeIf(new y3t(objArr == true ? 1 : 0, new r3s(6, z3tVar)))) {
                        }
                        return Boolean.TRUE;
                    }
                }
                return nm6Var;
                ssg.a(7, "AddOrRemoveTrackPlaylistInteractor", "Unexpected error", e);
                String b = g3o.b(hld.y((x66) ((z66) this.d.getValue()).c().getValue()));
                b.getClass();
                Context context = this.a;
                context.getClass();
                hag.y(context, b);
                return Boolean.FALSE;
            }
        }
        c4tVar = new c4t(this, cg6Var);
        Object obj2 = c4tVar.l;
        nm6 nm6Var2 = nm6.a;
        i = c4tVar.n;
        Object[] objArr2 = 0;
        int i32 = 1;
        if (i == 0) {
        }
        ssg.a(7, "AddOrRemoveTrackPlaylistInteractor", "Unexpected error", e);
        String b2 = g3o.b(hld.y((x66) ((z66) this.d.getValue()).c().getValue()));
        b2.getClass();
        Context context2 = this.a;
        context2.getClass();
        hag.y(context2, b2);
        return Boolean.FALSE;
    }
}
