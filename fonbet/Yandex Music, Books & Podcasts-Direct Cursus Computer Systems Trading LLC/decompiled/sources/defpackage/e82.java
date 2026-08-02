package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class e82 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ h82 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e82(h82 h82Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = h82Var;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e82(this.l, this.m, continuation, 0);
            case 1:
                return new e82(this.l, this.m, continuation, 1);
            case 2:
                return new e82(this.l, this.m, continuation, 2);
            case 3:
                return new e82(this.l, this.m, continuation, 3);
            case 4:
                return new e82(this.l, this.m, continuation, 4);
            case 5:
                return new e82(this.l, this.m, continuation, 5);
            default:
                return new e82(this.l, this.m, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((e82) create((Integer) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((e82) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((e82) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((e82) create((Integer) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((e82) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((e82) create((Integer) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((e82) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r9 == r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012f, code lost:
    
        if (r9 == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017c, code lost:
    
        if (r9 == r0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [nm6] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
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
        h82 h82Var = this.l;
        String str = this.m;
        switch (i) {
            case 0:
                c62 c62Var = h82Var.a;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    i82 i82Var = h82Var.b;
                    Boolean bool = Boolean.TRUE;
                    this.k = 1;
                    obj = i82Var.d(null, bool, this);
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
                b72 b72Var = b72.b;
                c62Var.a("DOWNLOADED_CHAPTERS_MEDIA_ID", list);
                return list;
            case 1:
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    i82 i82Var2 = h82Var.b;
                    Boolean bool2 = Boolean.TRUE;
                    this.k = 1;
                    obj = i82Var2.d(null, bool2, this);
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
                    obj2.add(((m82) h82Var.e.getValue()).e((mqs) it.next(), null, str, null));
                }
                return obj2;
            case 2:
                Object obj3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    i82 i82Var3 = h82Var.b;
                    Boolean bool3 = Boolean.TRUE;
                    this.k = 1;
                    obj = i82Var3.g(null, bool3, this);
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
                    obj3.add(((m82) h82Var.e.getValue()).e((mqs) it2.next(), null, str, null));
                }
                return obj3;
            case 3:
                c62 c62Var2 = h82Var.a;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    i82 i82Var4 = h82Var.b;
                    Boolean bool4 = Boolean.TRUE;
                    this.k = 1;
                    obj = i82Var4.e(null, bool4, this);
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
                b72 b72Var2 = b72.b;
                c62Var2.a("DOWNLOADED_KIDS_TRACKS_MEDIA_ID", list2);
                return list2;
            case 4:
                Object obj4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    i82 i82Var5 = h82Var.b;
                    Boolean bool5 = Boolean.TRUE;
                    this.k = 1;
                    obj = i82Var5.e(null, bool5, this);
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
                    obj4.add(((m82) h82Var.e.getValue()).e((mqs) it3.next(), null, str, null));
                }
                return obj4;
            case 5:
                c62 c62Var3 = h82Var.a;
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    i82 i82Var6 = h82Var.b;
                    Boolean bool6 = Boolean.TRUE;
                    this.k = 1;
                    obj = i82Var6.g(null, bool6, this);
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
                b72 b72Var3 = b72.b;
                c62Var3.a("DOWNLOADED_EPISODES_MEDIA_ID", list4);
                return list4;
            default:
                Object obj5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    i82 i82Var7 = h82Var.b;
                    this.k = 1;
                    obj = i82Var7.h(null, this);
                    break;
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list5 = (List) obj;
                h82Var.a.a(str, list5);
                List list6 = list5;
                obj5 = new ArrayList(v75.o(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    obj5.add(((m82) h82Var.e.getValue()).e((mqs) it4.next(), null, str, null));
                }
                return obj5;
        }
    }
}
