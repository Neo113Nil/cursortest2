package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class trw {
    public static final String f = f1d.g("YnisonShared:", "SimilarCommandsProcessor");
    public final zzp a;
    public final vow b;
    public final q0v c;
    public final ArrayList d;
    public long e;

    public trw(zzp zzpVar, vow vowVar, q0v q0vVar) {
        zzpVar.getClass();
        this.a = zzpVar;
        this.b = vowVar;
        this.c = q0vVar;
        this.d = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        srw srwVar;
        int i;
        ArrayList arrayList;
        Object obj;
        if (cg6Var instanceof srw) {
            srwVar = (srw) cg6Var;
            int i2 = srwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                srwVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = srwVar.j;
                nm6 nm6Var = nm6.a;
                i = srwVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    zzp zzpVar = this.a;
                    long f2 = 500 - yhn.f(zzpVar.a() - this.e, 0L, 500L);
                    this.e = zzpVar.a();
                    if (f2 > 0) {
                        srwVar.l = 1;
                        if (y2x.o(f2, srwVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                while (true) {
                    arrayList = this.d;
                    if (!arrayList.isEmpty()) {
                        return Unit.a;
                    }
                    rrw rrwVar = (rrw) CollectionsKt.Q(arrayList);
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator.previous();
                        rrw rrwVar2 = (rrw) obj;
                        rrwVar.getClass();
                        rrwVar2.getClass();
                        if (rrwVar.a.getClass().equals(rrwVar2.a.getClass())) {
                            break;
                        }
                    }
                    rrw rrwVar3 = (rrw) obj;
                    if (rrwVar3 == null) {
                        return Unit.a;
                    }
                    z75.z(arrayList, new vlv(1, rrwVar, rrw.class, "isSimilar", "isSimilar(Lcom/yandex/music/shared/ynison/domain/playback/YnisonSimilarCommandsProcessor$CommandWrapper;)Z", 0, 7));
                    zow zowVar = rrwVar3.a;
                    if (rrwVar3.b.equals(this.b.invoke())) {
                        this.c.invoke(zowVar);
                    } else {
                        ssg.a(6, f, "command " + zowVar + " is outdated", null);
                    }
                }
            }
        }
        srwVar = new srw(this, cg6Var);
        Object obj22 = srwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = srwVar.l;
        if (i != 0) {
        }
        while (true) {
            arrayList = this.d;
            if (!arrayList.isEmpty()) {
            }
        }
    }
}
