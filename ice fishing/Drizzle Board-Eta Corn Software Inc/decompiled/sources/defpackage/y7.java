package defpackage;

import android.content.Context;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y7 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public Object Qr9iLBAD;
    public int b2ZJblxo;
    public /* synthetic */ Object jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7(Object obj, Object obj2, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.Qr9iLBAD = obj;
        this.jb9XjC4I = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0152, code lost:
    
        if (r0 == r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0131, code lost:
    
        if (r5 == r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x013d, code lost:
    
        if (r5 == r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0296, code lost:
    
        if (r2 == r6) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Throwable] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        Object NCTxEWno;
        Object NCTxEWno2;
        Object qoPGr6Ce;
        w80 w80Var;
        Object wxUZMvaN;
        g10 g10Var;
        ArrayList arrayList;
        int i;
        String string;
        g10 g10Var2;
        Object VgvYg0wo;
        h90 h90Var;
        Object NCTxEWno3;
        int i2 = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        int i3 = 1;
        g10 g10Var3 = null;
        switch (i2) {
            case 0:
                int i4 = this.b2ZJblxo;
                if (i4 != 0) {
                    if (i4 == 1) {
                        fn.SgZGMMPL(obj);
                        return obj;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                dl dlVar = (dl) this.Qr9iLBAD;
                yz yzVar = (yz) this.jb9XjC4I;
                this.b2ZJblxo = 1;
                Object Qr9iLBAD = dlVar.Qr9iLBAD(yzVar, this);
                return Qr9iLBAD == u9Var ? u9Var : Qr9iLBAD;
            case 1:
                int i5 = this.b2ZJblxo;
                if (i5 != 0) {
                    if (i5 == 1) {
                        fn.SgZGMMPL(obj);
                        return obj;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                dl dlVar2 = (dl) this.Qr9iLBAD;
                Object obj2 = ((l20) this.jb9XjC4I).NCTxEWno;
                this.b2ZJblxo = 1;
                Object Qr9iLBAD2 = dlVar2.Qr9iLBAD(obj2, this);
                return Qr9iLBAD2 == u9Var ? u9Var : Qr9iLBAD2;
            case 2:
                int i6 = this.b2ZJblxo;
                if (i6 != 0) {
                    if (i6 == 1) {
                        fn.SgZGMMPL(obj);
                        return obj;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                dl dlVar3 = (dl) this.Qr9iLBAD;
                hz hzVar = (hz) this.jb9XjC4I;
                this.b2ZJblxo = 1;
                Object Qr9iLBAD3 = dlVar3.Qr9iLBAD(hzVar, this);
                return Qr9iLBAD3 == u9Var ? u9Var : Qr9iLBAD3;
            case 3:
                int i7 = this.b2ZJblxo;
                if (i7 != 0) {
                    if (i7 == 1) {
                        fn.SgZGMMPL(obj);
                        return xe0Var;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                t9 t9Var = (t9) this.jb9XjC4I;
                dl dlVar4 = (dl) this.Qr9iLBAD;
                this.b2ZJblxo = 1;
                return dlVar4.Qr9iLBAD(t9Var, this) == u9Var ? u9Var : xe0Var;
            case 4:
                int i8 = this.b2ZJblxo;
                if (i8 != 0) {
                    if (i8 == 1) {
                        fn.SgZGMMPL(obj);
                        return obj;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                if (((t9) this.Qr9iLBAD).VgvYg0wo().OnDfzHZD(kd0.MdtA4re8) == null) {
                    m1.Ey6iv0m0("Expected a TransactionElement in the CoroutineContext but none was found.");
                    return null;
                }
                zk zkVar = (zk) this.jb9XjC4I;
                this.b2ZJblxo = 1;
                Object ow5vqvCr = zkVar.ow5vqvCr(this);
                return ow5vqvCr == u9Var ? u9Var : ow5vqvCr;
            case 5:
                kb0 kb0Var = (kb0) this.jb9XjC4I;
                d50 d50Var = (d50) this.Qr9iLBAD;
                int i9 = this.b2ZJblxo;
                if (i9 == 0) {
                    fn.SgZGMMPL(obj);
                    dt dtVar = d50Var.MdtA4re8;
                    this.b2ZJblxo = 1;
                    NCTxEWno = dtVar.NCTxEWno(kb0Var, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            fn.SgZGMMPL(obj);
                            return xe0Var;
                        }
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                    NCTxEWno = obj;
                }
                if (!((Boolean) NCTxEWno).booleanValue()) {
                    return xe0Var;
                }
                h70 h70Var = d50Var.wxUZMvaN;
                this.b2ZJblxo = 2;
                if (h70Var.OnDfzHZD(kb0Var, this) != u9Var) {
                    return xe0Var;
                }
                return u9Var;
            case 6:
                p80 p80Var = (p80) this.jb9XjC4I;
                int i10 = this.b2ZJblxo;
                if (i10 == 0) {
                    fn.SgZGMMPL(obj);
                    long j = p80Var.VgvYg0wo;
                    v80 v80Var = p80Var.wxUZMvaN;
                    if (j == -1) {
                        this.b2ZJblxo = 1;
                        qoPGr6Ce = v80Var.qoPGr6Ce(this);
                        break;
                    } else {
                        this.b2ZJblxo = 2;
                        NCTxEWno2 = v80Var.NCTxEWno(j, this);
                        break;
                    }
                    return u9Var;
                }
                if (i10 == 1) {
                    fn.SgZGMMPL(obj);
                    qoPGr6Ce = obj;
                    w80Var = (w80) qoPGr6Ce;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w80 w80Var2 = (w80) this.Qr9iLBAD;
                        fn.SgZGMMPL(obj);
                        w80Var = w80Var2;
                        wxUZMvaN = obj;
                        Iterable iterable = (Iterable) wxUZMvaN;
                        int ESscZ9M1 = zq.ESscZ9M1(z5.bvfAo0eO(iterable, 10));
                        if (ESscZ9M1 < 16) {
                            ESscZ9M1 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(ESscZ9M1);
                        for (Object obj3 : iterable) {
                            linkedHashMap.put(new Long(((xx) obj3).qoPGr6Ce), obj3);
                        }
                        ArrayList arrayList2 = w80Var.P7K7Inc8;
                        i90 i90Var = w80Var.NCTxEWno;
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        int i11 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj4 = arrayList2.get(i12);
                            i12++;
                            int i13 = i11 + 1;
                            if (i11 < 0) {
                                ?? r20 = g10Var3;
                                y5.ZyZthT5G();
                                throw r20;
                            }
                            long longValue = ((Number) obj4).longValue();
                            xx xxVar = (xx) linkedHashMap.get(new Long(longValue));
                            if (xxVar == null) {
                                arrayList = arrayList2;
                                i = i3;
                                g10Var2 = g10Var3;
                                g10Var = g10Var2;
                            } else {
                                String str = xxVar.NCTxEWno;
                                g10Var = g10Var3;
                                String str2 = xxVar.MdtA4re8;
                                Context context = p80Var.NCTxEWno;
                                context.getClass();
                                arrayList = arrayList2;
                                int ordinal = i90Var.ordinal();
                                if (ordinal == 0) {
                                    i = i3;
                                    string = context.getString(R.string.value_minutes, Integer.valueOf(xxVar.jb9XjC4I));
                                    string.getClass();
                                } else if (ordinal != i3) {
                                    i = i3;
                                    if (ordinal != 2) {
                                        throw new d7();
                                    }
                                    string = context.getString(R.string.value_step_count, Integer.valueOf(xxVar.lDXGDhIF));
                                    string.getClass();
                                } else {
                                    i = i3;
                                    string = context.getString(R.string.value_intensity_level, xxVar.b2ZJblxo, Integer.valueOf(xxVar.Qr9iLBAD));
                                    string.getClass();
                                }
                                g10Var2 = new g10(str, str2, string, w80Var.b2ZJblxo.indexOf(new Long(longValue)) + 1, i13);
                            }
                            if (g10Var2 != null) {
                                arrayList3.add(g10Var2);
                            }
                            arrayList2 = arrayList;
                            i11 = i13;
                            g10Var3 = g10Var;
                            i3 = i;
                        }
                        x90 x90Var = p80Var.P7K7Inc8;
                        o80 o80Var = new o80(w80Var, arrayList3, i90Var);
                        x90Var.getClass();
                        x90Var.eVhOlqcC(g10Var3, o80Var);
                        return xe0Var;
                    }
                    fn.SgZGMMPL(obj);
                    NCTxEWno2 = obj;
                    w80Var = (w80) NCTxEWno2;
                }
                if (w80Var == null) {
                    return xe0Var;
                }
                zy zyVar = p80Var.MdtA4re8;
                ArrayList arrayList4 = w80Var.P7K7Inc8;
                this.Qr9iLBAD = w80Var;
                this.b2ZJblxo = 3;
                wxUZMvaN = zyVar.wxUZMvaN(arrayList4, this);
                break;
            case 7:
                h90 h90Var2 = (h90) this.jb9XjC4I;
                int i14 = this.b2ZJblxo;
                if (i14 == 0) {
                    fn.SgZGMMPL(obj);
                    zy zyVar2 = h90Var2.NCTxEWno;
                    this.Qr9iLBAD = h90Var2;
                    this.b2ZJblxo = 1;
                    VgvYg0wo = zyVar2.VgvYg0wo(5, this);
                    if (VgvYg0wo != u9Var) {
                        h90Var = h90Var2;
                    }
                    return u9Var;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        fn.SgZGMMPL(obj);
                        return xe0Var;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h90 h90Var3 = (h90) this.Qr9iLBAD;
                fn.SgZGMMPL(obj);
                h90Var = h90Var3;
                VgvYg0wo = obj;
                h90Var.jb9XjC4I = (List) VgvYg0wo;
                List list = h90Var2.jb9XjC4I;
                ArrayList arrayList5 = new ArrayList(z5.bvfAo0eO(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList5.add(new Long(((xx) it.next()).qoPGr6Ce));
                }
                h90Var2.eVhOlqcC = arrayList5;
                h90Var2.ow5vqvCr = System.currentTimeMillis();
                x90 x90Var2 = h90Var2.VgvYg0wo;
                x90Var2.eVhOlqcC(null, e90.qoPGr6Ce((e90) x90Var2.Qr9iLBAD(), null, null, 0L, false, 11));
                h90Var2.VgvYg0wo();
                this.Qr9iLBAD = null;
                this.b2ZJblxo = 2;
                if (h90Var2.P7K7Inc8(this) != u9Var) {
                    return xe0Var;
                }
                return u9Var;
            case 8:
                ok okVar = (ok) this.jb9XjC4I;
                int i15 = this.b2ZJblxo;
                try {
                    if (i15 == 0) {
                        fn.SgZGMMPL(obj);
                        ie0 ie0Var = (ie0) this.Qr9iLBAD;
                        this.b2ZJblxo = 1;
                        NCTxEWno3 = ie0Var.NCTxEWno(this);
                        if (NCTxEWno3 == u9Var) {
                            return u9Var;
                        }
                    } else {
                        if (i15 != 1) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fn.SgZGMMPL(obj);
                        NCTxEWno3 = obj;
                    }
                    return xe0Var;
                } finally {
                    okVar.qoPGr6Ce();
                }
            default:
                int i16 = this.b2ZJblxo;
                if (i16 != 0) {
                    if (i16 == 1) {
                        fn.SgZGMMPL(obj);
                        return xe0Var;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                Object obj5 = this.Qr9iLBAD;
                yg ygVar = (yg) this.jb9XjC4I;
                this.b2ZJblxo = 1;
                return ygVar.OnDfzHZD(obj5, this) == u9Var ? u9Var : xe0Var;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        switch (i) {
            case 0:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 1:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 2:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 3:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 4:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 5:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 6:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 7:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 8:
                return ((y7) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            default:
                return ((y7) lDXGDhIF((g9) obj2, obj)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        switch (this.P7K7Inc8) {
            case 0:
                return new y7((dl) this.Qr9iLBAD, (yz) this.jb9XjC4I, g9Var, 0);
            case 1:
                return new y7((dl) this.Qr9iLBAD, (l20) this.jb9XjC4I, g9Var, 1);
            case 2:
                return new y7((dl) this.Qr9iLBAD, (hz) this.jb9XjC4I, g9Var, 2);
            case 3:
                y7 y7Var = new y7((dl) this.Qr9iLBAD, g9Var);
                y7Var.jb9XjC4I = obj;
                return y7Var;
            case 4:
                y7 y7Var2 = new y7((zk) this.jb9XjC4I, g9Var, 4);
                y7Var2.Qr9iLBAD = obj;
                return y7Var2;
            case 5:
                return new y7((d50) this.Qr9iLBAD, (kb0) this.jb9XjC4I, g9Var, 5);
            case 6:
                return new y7((p80) this.jb9XjC4I, g9Var, 6);
            case 7:
                return new y7((h90) this.jb9XjC4I, g9Var, 7);
            case 8:
                return new y7((ie0) this.Qr9iLBAD, (ok) this.jb9XjC4I, g9Var, 8);
            default:
                y7 y7Var3 = new y7((yg) this.jb9XjC4I, g9Var, 9);
                y7Var3.Qr9iLBAD = obj;
                return y7Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7(Object obj, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.jb9XjC4I = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(dl dlVar, g9 g9Var) {
        super(2, g9Var);
        this.P7K7Inc8 = 3;
        this.Qr9iLBAD = dlVar;
    }
}
