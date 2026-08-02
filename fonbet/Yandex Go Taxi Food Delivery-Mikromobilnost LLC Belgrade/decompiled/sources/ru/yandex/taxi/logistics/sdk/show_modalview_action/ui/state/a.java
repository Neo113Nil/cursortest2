package ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.state;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bs;
import defpackage.c37;
import defpackage.cy20;
import defpackage.i330;
import defpackage.ny61;
import defpackage.o130;
import defpackage.oh4;
import defpackage.okg;
import defpackage.q8s;
import defpackage.ra90;
import defpackage.tcc;
import defpackage.v4v;
import defpackage.vge;
import defpackage.w4v;
import defpackage.xbu;
import defpackage.yfa;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final q8s a;
    public final yfa b;
    public final oh4 c;

    public a(q8s q8sVar, yfa yfaVar, oh4 oh4Var) {
        this.a = q8sVar;
        this.b = yfaVar;
        this.c = oh4Var;
    }

    public final vge a(cy20 cy20Var, boolean z) {
        boolean z2;
        ra90 ra90Var;
        String str = cy20Var.a;
        String str2 = cy20Var.b;
        w4v w4vVar = cy20Var.c;
        oh4 oh4Var = this.c;
        if (w4vVar != null) {
            z2 = z;
            ra90Var = oh4.b(oh4Var, w4vVar, null, null, z2, 6);
        } else {
            z2 = z;
            ra90Var = null;
        }
        w4v w4vVar2 = cy20Var.d;
        return new vge(str, str2, ra90Var, w4vVar2 != null ? oh4.b(oh4Var, w4vVar2, null, null, z2, 6) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[LOOP:0: B:11:0x005a->B:13:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[LOOP:1: B:16:0x007d->B:18:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(okg okgVar, boolean z, ContinuationImpl continuationImpl) {
        StateMapper$map$2 stateMapper$map$2;
        int i;
        Iterator it;
        if (continuationImpl instanceof StateMapper$map$2) {
            stateMapper$map$2 = (StateMapper$map$2) continuationImpl;
            int i2 = stateMapper$map$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stateMapper$map$2.label = i2 - Integer.MIN_VALUE;
                Object obj = stateMapper$map$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stateMapper$map$2.label;
                if (i != 0) {
                    b.b(obj);
                    o130 o130Var = okgVar.i;
                    stateMapper$map$2.L$0 = okgVar;
                    stateMapper$map$2.Z$0 = z;
                    stateMapper$map$2.label = 1;
                    obj = c(o130Var, z, stateMapper$map$2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = stateMapper$map$2.Z$0;
                    okgVar = (okg) stateMapper$map$2.L$0;
                    b.b(obj);
                }
                xbu xbuVar = (xbu) obj;
                ArrayList arrayList = okgVar.j;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(a((cy20) it.next(), z));
                }
                ArrayList<bs> arrayList3 = okgVar.k;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                for (bs bsVar : arrayList3) {
                    arrayList4.add(new c37(bsVar.a, bsVar.b, bsVar.c, bsVar.d, bsVar.e));
                }
                return new i330(xbuVar, arrayList2, arrayList4, okgVar.l, okgVar.m);
            }
        }
        stateMapper$map$2 = new StateMapper$map$2(this, continuationImpl);
        Object obj3 = stateMapper$map$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stateMapper$map$2.label;
        if (i != 0) {
        }
        xbu xbuVar2 = (xbu) obj3;
        ArrayList arrayList5 = okgVar.j;
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList5, 10));
        it = arrayList5.iterator();
        while (it.hasNext()) {
        }
        ArrayList<bs> arrayList32 = okgVar.k;
        ArrayList arrayList42 = new ArrayList(tcc.n(arrayList32, 10));
        while (r10.hasNext()) {
        }
        return new i330(xbuVar2, arrayList22, arrayList42, okgVar.l, okgVar.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v8, types: [v4v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o130 o130Var, boolean z, ContinuationImpl continuationImpl) {
        StateMapper$map$5 stateMapper$map$5;
        int i;
        ra90 ra90Var;
        boolean z2;
        o130 o130Var2;
        ra90 ra90Var2;
        if (continuationImpl instanceof StateMapper$map$5) {
            stateMapper$map$5 = (StateMapper$map$5) continuationImpl;
            int i2 = stateMapper$map$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stateMapper$map$5.label = i2 - Integer.MIN_VALUE;
                Object obj = stateMapper$map$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stateMapper$map$5.label;
                CharSequence charSequence = null;
                if (i != 0) {
                    b.b(obj);
                    ra90 b = oh4.b(this.c, o130Var.a, null, null, z, 6);
                    FormattedText formattedText = o130Var.b;
                    if (formattedText == null) {
                        ra90Var = b;
                        z2 = z;
                        return new xbu(ra90Var, charSequence, this.b.e(o130Var.c, z2), a(o130Var.d, z2));
                    }
                    stateMapper$map$5.L$0 = o130Var;
                    stateMapper$map$5.L$1 = null;
                    stateMapper$map$5.L$2 = b;
                    stateMapper$map$5.Z$0 = z;
                    stateMapper$map$5.I$0 = 0;
                    stateMapper$map$5.label = 1;
                    obj = this.a.a(formattedText, stateMapper$map$5);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o130Var2 = o130Var;
                    ra90Var2 = b;
                    z2 = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = stateMapper$map$5.Z$0;
                    ?? r12 = (v4v) stateMapper$map$5.L$2;
                    o130Var2 = (o130) stateMapper$map$5.L$0;
                    b.b(obj);
                    ra90Var2 = r12;
                }
                charSequence = (CharSequence) obj;
                ra90Var = ra90Var2;
                o130Var = o130Var2;
                return new xbu(ra90Var, charSequence, this.b.e(o130Var.c, z2), a(o130Var.d, z2));
            }
        }
        stateMapper$map$5 = new StateMapper$map$5(this, continuationImpl);
        Object obj2 = stateMapper$map$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stateMapper$map$5.label;
        CharSequence charSequence2 = null;
        if (i != 0) {
        }
        charSequence2 = (CharSequence) obj2;
        ra90Var = ra90Var2;
        o130Var = o130Var2;
        return new xbu(ra90Var, charSequence2, this.b.e(o130Var.c, z2), a(o130Var.d, z2));
    }
}
