package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qeq implements dlj {
    public final xdr a;
    public final ArrayList b;
    public int c;

    public qeq(mm6 mm6Var, llj lljVar) {
        mm6Var.getClass();
        this.a = ydr.a(null);
        this.b = new ArrayList();
        ox6.B(new bca(lljVar.i, 18), mm6Var, new ryp(12, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.dlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, s9p s9pVar, String str, cg6 cg6Var) {
        neq neqVar;
        Object obj;
        Object obj2;
        int i;
        int i2;
        mqs[] mqsVarArr;
        Object[] objArr;
        int i3;
        Object[] objArr2;
        Object[] objArr3;
        boolean isEmpty;
        if (cg6Var instanceof neq) {
            neqVar = (neq) cg6Var;
            int i4 = neqVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                neqVar.o = i4 - Integer.MIN_VALUE;
                obj = neqVar.m;
                obj2 = nm6.a;
                i = neqVar.o;
                xdr xdrVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = (List) xdrVar.getValue();
                    if (list != null) {
                        ArrayList x0 = CollectionsKt.x0(list);
                        Collections.shuffle(x0);
                        xdrVar.getClass();
                        xdrVar.m(null, x0);
                    }
                    ArrayList arrayList2 = this.b;
                    arrayList2.clear();
                    z75.t(arrayList2, arrayList);
                    mqs[] mqsVarArr2 = new mqs[2];
                    neqVar.j = mqsVarArr2;
                    neqVar.k = mqsVarArr2;
                    neqVar.l = 0;
                    neqVar.o = 1;
                    obj = e(neqVar);
                    if (obj != obj2) {
                        i2 = 0;
                        mqsVarArr = mqsVarArr2;
                        objArr = mqsVarArr2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = neqVar.l;
                    Object[] objArr4 = neqVar.k;
                    objArr2 = neqVar.j;
                    qgg.h0(obj);
                    objArr3 = objArr4;
                    objArr3[i3] = obj;
                    objArr2.getClass();
                    List w = xz0.w(objArr2);
                    ssg.a(3, "ShuffleOfflineRecommender", "newState: ".concat(CollectionsKt.X(w, null, null, null, san.f, 31)), null);
                    List list2 = (List) xdrVar.getValue();
                    olj oljVar = new olj(list2 != null ? list2.size() : 0);
                    isEmpty = w.isEmpty();
                    if (!(!isEmpty)) {
                        return new tlj(oljVar, dfi.e(System.currentTimeMillis(), "offline_wave_", "_unknown_unknown"), dfi.d(System.currentTimeMillis(), "offline_batch_"), w, null, false);
                    }
                    if (isEmpty) {
                        return new slj("newState", oljVar, null, null, null, 28);
                    }
                    b6e.s();
                    return null;
                }
                i2 = neqVar.l;
                Object[] objArr5 = neqVar.k;
                mqsVarArr = neqVar.j;
                qgg.h0(obj);
                objArr = objArr5;
                objArr[i2] = obj;
                neqVar.j = mqsVarArr;
                neqVar.k = mqsVarArr;
                neqVar.l = 1;
                neqVar.o = 2;
                obj = e(neqVar);
                if (obj != obj2) {
                    i3 = 1;
                    objArr2 = mqsVarArr;
                    objArr3 = objArr2;
                    objArr3[i3] = obj;
                    objArr2.getClass();
                    List w2 = xz0.w(objArr2);
                    ssg.a(3, "ShuffleOfflineRecommender", "newState: ".concat(CollectionsKt.X(w2, null, null, null, san.f, 31)), null);
                    List list22 = (List) xdrVar.getValue();
                    olj oljVar2 = new olj(list22 != null ? list22.size() : 0);
                    isEmpty = w2.isEmpty();
                    if (!(!isEmpty)) {
                    }
                }
                return obj2;
            }
        }
        neqVar = new neq(this, cg6Var);
        obj = neqVar.m;
        obj2 = nm6.a;
        i = neqVar.o;
        xdr xdrVar2 = this.a;
        if (i != 0) {
        }
        objArr[i2] = obj;
        neqVar.j = mqsVarArr;
        neqVar.k = mqsVarArr;
        neqVar.l = 1;
        neqVar.o = 2;
        obj = e(neqVar);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mqs mqsVar, List list, mqs mqsVar2, cg6 cg6Var) {
        oeq oeqVar;
        int i;
        olj oljVar;
        mqs mqsVar3;
        if (cg6Var instanceof oeq) {
            oeqVar = (oeq) cg6Var;
            int i2 = oeqVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oeqVar.o = i2 - Integer.MIN_VALUE;
                Object obj = oeqVar.m;
                Serializable serializable = nm6.a;
                i = oeqVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    List list2 = (List) this.a.getValue();
                    olj oljVar2 = new olj(list2 != null ? list2.size() : 0);
                    oeqVar.j = mqsVar;
                    oeqVar.k = mqsVar2;
                    oeqVar.l = oljVar2;
                    oeqVar.o = 1;
                    Serializable e = e(oeqVar);
                    if (e == serializable) {
                        return serializable;
                    }
                    oljVar = oljVar2;
                    obj = e;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    olj oljVar3 = oeqVar.l;
                    mqsVar2 = oeqVar.k;
                    mqs mqsVar4 = oeqVar.j;
                    qgg.h0(obj);
                    oljVar = oljVar3;
                    mqsVar = mqsVar4;
                }
                mqsVar3 = (mqs) obj;
                if (mqsVar3 != null) {
                    return new vlj("nextTrack", oljVar, null, null, null, 28);
                }
                this.b.add(mqsVar3);
                String str = mqsVar.a;
                String str2 = mqsVar.c;
                String str3 = mqsVar2.a;
                String str4 = mqsVar2.c;
                String str5 = mqsVar3.a;
                String str6 = mqsVar3.c;
                StringBuilder m = f1d.m("nextTrack(lastTrack=[", str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2, "], queuedTrack=[");
                su4.v(m, str3, StringUtils.PROCESS_POSTFIX_DELIMITER, str4, "]): track=[");
                ssg.a(3, "ShuffleOfflineRecommender", ouj.q(m, str5, StringUtils.PROCESS_POSTFIX_DELIMITER, str6, "]"), null);
                return new wlj(oljVar, dfi.d(System.currentTimeMillis(), "offline_batch_"), mqsVar3, null);
            }
        }
        oeqVar = new oeq(this, cg6Var);
        Object obj2 = oeqVar.m;
        Serializable serializable2 = nm6.a;
        i = oeqVar.o;
        if (i != 0) {
        }
        mqsVar3 = (mqs) obj2;
        if (mqsVar3 != null) {
        }
    }

    @Override // defpackage.dlj
    public final Object d(Continuation continuation) {
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(cg6 cg6Var) {
        peq peqVar;
        int i;
        List list;
        int size;
        if (cg6Var instanceof peq) {
            peqVar = (peq) cg6Var;
            int i2 = peqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                peqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = peqVar.j;
                nm6 nm6Var = nm6.a;
                i = peqVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    z0i z0iVar = new z0i(2, 23, continuation);
                    peqVar.l = 1;
                    obj = zsd.h0(this.a, z0iVar, peqVar);
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
                list = (List) obj;
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null && (size = list.size()) >= 10) {
                        List r0 = CollectionsKt.r0(this.b, 9);
                        for (int i3 = 0; i3 < size; i3++) {
                            int i4 = this.c;
                            this.c = i4 + 1;
                            mqs mqsVar = (mqs) CollectionsKt.S(list, i4 % size);
                            if (!CollectionsKt.I(r0, mqsVar)) {
                                return mqsVar;
                            }
                        }
                        dfi.r("Next track is not found!", "ShuffleOfflineRecommender");
                    }
                }
                return null;
            }
        }
        peqVar = new peq(this, cg6Var);
        Object obj2 = peqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = peqVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        return null;
    }

    @Override // defpackage.dlj
    public final void a() {
    }
}
