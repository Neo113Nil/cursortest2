package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class s42 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ w42 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s42(w42 w42Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = w42Var;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new s42(this.l, this.m, continuation, 0);
            case 1:
                return new s42(this.l, this.m, continuation, 1);
            case 2:
                return new s42(this.l, this.m, continuation, 2);
            case 3:
                return new s42(this.l, this.m, continuation, 3);
            case 4:
                return new s42(this.l, this.m, continuation, 4);
            default:
                return new s42(this.l, this.m, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((s42) create((Integer) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((s42) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((s42) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((s42) create((Integer) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((s42) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((s42) create((Integer) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r9 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        if (r9 == r0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [nm6] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [nm6] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [nm6] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.m;
        w42 w42Var = this.l;
        switch (i) {
            case 0:
                c62 c62Var = w42Var.a;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    y42 y42Var = w42Var.b;
                    this.k = 1;
                    obj = y42Var.d(null, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list = (List) obj;
                c62Var.a(str, list);
                o42[] o42VarArr = o42.a;
                c62Var.a("COLLECTION_CHAPTERS_MEDIA_ID", list);
                return list;
            case 1:
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    y42 y42Var2 = w42Var.b;
                    this.k = 1;
                    obj = y42Var2.d(null, this);
                    break;
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                obj2 = new ArrayList(v75.o(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    obj2.add(((m82) w42Var.e.getValue()).e((mqs) it.next(), null, str, null));
                }
                return obj2;
            case 2:
                Object obj3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    y42 y42Var3 = w42Var.b;
                    this.k = 1;
                    obj = y42Var3.e(null, this);
                    break;
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable2 = (Iterable) obj;
                obj3 = new ArrayList(v75.o(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    obj3.add(((m82) w42Var.e.getValue()).e((mqs) it2.next(), null, str, null));
                }
                return obj3;
            case 3:
                c62 c62Var2 = w42Var.a;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    y42 y42Var4 = w42Var.b;
                    this.k = 1;
                    obj = y42Var4.h(null, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list2 = (List) obj;
                c62Var2.a(str, list2);
                o42[] o42VarArr2 = o42.a;
                c62Var2.a("COLLECTION_KIDS_TRACKS_MEDIA_ID", list2);
                return list2;
            case 4:
                Object obj4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    y42 y42Var5 = w42Var.b;
                    this.k = 1;
                    obj = y42Var5.h(null, this);
                    break;
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list3 = (List) obj;
                obj4 = new ArrayList(v75.o(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    obj4.add(((m82) w42Var.e.getValue()).e((mqs) it3.next(), null, str, null));
                }
                return obj4;
            default:
                c62 c62Var3 = w42Var.a;
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    y42 y42Var6 = w42Var.b;
                    this.k = 1;
                    obj = y42Var6.e(null, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list4 = (List) obj;
                c62Var3.a(str, list4);
                o42[] o42VarArr3 = o42.a;
                c62Var3.a("COLLECTION_EPISODES_MEDIA_ID", list4);
                return list4;
        }
    }
}
