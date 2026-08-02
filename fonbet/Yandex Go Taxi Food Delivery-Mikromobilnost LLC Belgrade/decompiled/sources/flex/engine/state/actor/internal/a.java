package flex.engine.state.actor.internal;

import defpackage.dez;
import defpackage.fse;
import defpackage.klc;
import defpackage.kq90;
import defpackage.me7;
import defpackage.ny61;
import defpackage.og90;
import defpackage.s1m;
import defpackage.tje;
import defpackage.txl;
import defpackage.u1m;
import defpackage.xzl;
import defpackage.ywl;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public abstract class a {
    public static final Object a(ywl ywlVar, ywl ywlVar2, ywl ywlVar3, List list, List list2, fse fseVar, txl txlVar, dez dezVar, ContinuationImpl continuationImpl) {
        return (list.isEmpty() || list2.isEmpty()) ? ywlVar3 : tje.k0(fseVar, new ActorUtilsKt$patchDocument$2(list2, ywlVar3, list, dezVar, txlVar, ywlVar, ywlVar2, null), continuationImpl);
    }

    public static Object b(u1m u1mVar, ywl ywlVar, Throwable th, List list, List list2, fse fseVar, txl txlVar, Continuation continuation) {
        return (list.isEmpty() || list2.isEmpty()) ? ywlVar : tje.k0(fseVar, new ActorUtilsKt$patchDocumentError$2(ywlVar, list2, list, null, txlVar, u1mVar, th, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v2, types: [T] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, ywl] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x016b -> B:10:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d9 -> B:11:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0196 -> B:19:0x0197). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(xzl xzlVar, String str, List list, me7 me7Var, List list2, txl txlVar, ContinuationImpl continuationImpl) {
        ActorUtilsKt$patchWithCacheParts$1 actorUtilsKt$patchWithCacheParts$1;
        int i;
        Object obj;
        String str2;
        Ref$ObjectRef ref$ObjectRef;
        Iterator it;
        int i2;
        String str3;
        ActorUtilsKt$patchWithCacheParts$1 actorUtilsKt$patchWithCacheParts$12;
        Object obj2;
        me7 me7Var2;
        List list3;
        xzl xzlVar2 = xzlVar;
        if (continuationImpl instanceof ActorUtilsKt$patchWithCacheParts$1) {
            actorUtilsKt$patchWithCacheParts$1 = (ActorUtilsKt$patchWithCacheParts$1) continuationImpl;
            int i3 = actorUtilsKt$patchWithCacheParts$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                actorUtilsKt$patchWithCacheParts$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = actorUtilsKt$patchWithCacheParts$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actorUtilsKt$patchWithCacheParts$1.label;
                if (i != 0) {
                    obj = null;
                    b.b(obj3);
                    if (list2.isEmpty()) {
                        return xzlVar2;
                    }
                    String uuid = UUID.randomUUID().toString();
                    str2 = str;
                    if (me7Var != null) {
                        me7Var.d(str2, uuid);
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = xzlVar2.a;
                    ref$ObjectRef = ref$ObjectRef2;
                    it = list2.iterator();
                    i2 = 0;
                    str3 = uuid;
                    actorUtilsKt$patchWithCacheParts$12 = actorUtilsKt$patchWithCacheParts$1;
                    obj2 = txlVar;
                    me7Var2 = me7Var;
                    list3 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = actorUtilsKt$patchWithCacheParts$1.I$2;
                    int i5 = actorUtilsKt$patchWithCacheParts$1.I$1;
                    int i6 = actorUtilsKt$patchWithCacheParts$1.I$0;
                    ListIterator listIterator = (ListIterator) actorUtilsKt$patchWithCacheParts$1.L$16;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) actorUtilsKt$patchWithCacheParts$1.L$14;
                    og90 og90Var = (og90) actorUtilsKt$patchWithCacheParts$1.L$11;
                    Iterator it2 = (Iterator) actorUtilsKt$patchWithCacheParts$1.L$9;
                    Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) actorUtilsKt$patchWithCacheParts$1.L$7;
                    String str4 = (String) actorUtilsKt$patchWithCacheParts$1.L$6;
                    Object obj5 = (klc) actorUtilsKt$patchWithCacheParts$1.L$5;
                    me7 me7Var3 = (me7) actorUtilsKt$patchWithCacheParts$1.L$3;
                    List list4 = (List) actorUtilsKt$patchWithCacheParts$1.L$2;
                    String str5 = (String) actorUtilsKt$patchWithCacheParts$1.L$1;
                    xzlVar2 = (xzl) actorUtilsKt$patchWithCacheParts$1.L$0;
                    b.b(obj3);
                    Iterator it3 = it2;
                    Object obj6 = obj5;
                    String str6 = str4;
                    Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef4;
                    List list5 = list4;
                    me7 me7Var4 = me7Var3;
                    int i7 = i6;
                    ActorUtilsKt$patchWithCacheParts$1 actorUtilsKt$patchWithCacheParts$13 = actorUtilsKt$patchWithCacheParts$1;
                    int i8 = i5;
                    int i9 = i4;
                    Object obj7 = (ywl) obj3;
                    int i10 = i8;
                    ActorUtilsKt$patchWithCacheParts$1 actorUtilsKt$patchWithCacheParts$14 = actorUtilsKt$patchWithCacheParts$13;
                    int i11 = i7;
                    me7 me7Var5 = me7Var4;
                    List list6 = list5;
                    obj = null;
                    if (listIterator.hasPrevious()) {
                        Object obj8 = obj4;
                        s1m s1mVar = (s1m) listIterator.previous();
                        kq90 b = og90Var.b();
                        ywl a = og90Var.a();
                        ywl ywlVar = (ywl) ref$ObjectRef5.element;
                        actorUtilsKt$patchWithCacheParts$14.L$0 = xzlVar2;
                        actorUtilsKt$patchWithCacheParts$14.L$1 = str5;
                        actorUtilsKt$patchWithCacheParts$14.L$2 = list6;
                        actorUtilsKt$patchWithCacheParts$14.L$3 = me7Var5;
                        list5 = list6;
                        Object obj9 = obj;
                        actorUtilsKt$patchWithCacheParts$14.L$4 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.L$5 = obj6;
                        actorUtilsKt$patchWithCacheParts$14.L$6 = str6;
                        actorUtilsKt$patchWithCacheParts$14.L$7 = ref$ObjectRef5;
                        actorUtilsKt$patchWithCacheParts$14.L$8 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.L$9 = it3;
                        actorUtilsKt$patchWithCacheParts$14.L$10 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.L$11 = og90Var;
                        actorUtilsKt$patchWithCacheParts$14.L$12 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.L$13 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.L$14 = ref$ObjectRef3;
                        actorUtilsKt$patchWithCacheParts$14.L$15 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.L$16 = listIterator;
                        actorUtilsKt$patchWithCacheParts$14.L$17 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.L$18 = obj9;
                        actorUtilsKt$patchWithCacheParts$14.I$0 = i11;
                        actorUtilsKt$patchWithCacheParts$14.I$1 = i10;
                        actorUtilsKt$patchWithCacheParts$14.I$2 = i9;
                        actorUtilsKt$patchWithCacheParts$14.I$3 = 0;
                        actorUtilsKt$patchWithCacheParts$14.label = 1;
                        xzl xzlVar3 = xzlVar2;
                        int i12 = i9;
                        int i13 = i10;
                        obj3 = s1mVar.b(b, (ywl) obj7, a, ywlVar);
                        obj4 = obj8;
                        if (obj3 == obj4) {
                            return obj4;
                        }
                        xzlVar2 = xzlVar3;
                        i9 = i12;
                        me7Var4 = me7Var5;
                        i7 = i11;
                        actorUtilsKt$patchWithCacheParts$13 = actorUtilsKt$patchWithCacheParts$14;
                        i8 = i13;
                        Object obj72 = (ywl) obj3;
                        int i102 = i8;
                        ActorUtilsKt$patchWithCacheParts$1 actorUtilsKt$patchWithCacheParts$142 = actorUtilsKt$patchWithCacheParts$13;
                        int i112 = i7;
                        me7 me7Var52 = me7Var4;
                        List list62 = list5;
                        obj = null;
                        if (listIterator.hasPrevious()) {
                            xzl xzlVar4 = xzlVar2;
                            List list7 = list62;
                            Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef3;
                            i2 = i112;
                            str2 = str5;
                            ref$ObjectRef = ref$ObjectRef6;
                            xzlVar2 = xzlVar4;
                            actorUtilsKt$patchWithCacheParts$12 = actorUtilsKt$patchWithCacheParts$142;
                            me7Var2 = me7Var52;
                            obj2 = obj6;
                            it = it3;
                            str3 = str6;
                            list3 = list7;
                            ?? r12 = obj72;
                            ref$ObjectRef.element = r12;
                            ref$ObjectRef = ref$ObjectRef5;
                            obj = null;
                            if (it.hasNext()) {
                                og90Var = (og90) it.next();
                                Object obj10 = ref$ObjectRef.element;
                                if (list3.isEmpty()) {
                                    ref$ObjectRef5 = ref$ObjectRef;
                                    r12 = obj10;
                                    ref$ObjectRef.element = r12;
                                    ref$ObjectRef = ref$ObjectRef5;
                                    obj = null;
                                    if (it.hasNext()) {
                                        if (me7Var2 != null) {
                                            me7Var2.a(str2, str3);
                                        }
                                        return xzl.a(xzlVar2, (ywl) ref$ObjectRef.element);
                                    }
                                } else {
                                    it3 = it;
                                    listIterator = list3.listIterator(list3.size());
                                    str6 = str3;
                                    ref$ObjectRef5 = ref$ObjectRef;
                                    obj72 = obj10;
                                    me7Var52 = me7Var2;
                                    obj6 = obj2;
                                    str5 = str2;
                                    actorUtilsKt$patchWithCacheParts$142 = actorUtilsKt$patchWithCacheParts$12;
                                    i112 = i2;
                                    i102 = 0;
                                    list62 = list3;
                                    ref$ObjectRef3 = ref$ObjectRef5;
                                    i9 = 0;
                                    if (listIterator.hasPrevious()) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        actorUtilsKt$patchWithCacheParts$1 = new ActorUtilsKt$patchWithCacheParts$1(continuationImpl);
        Object obj32 = actorUtilsKt$patchWithCacheParts$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actorUtilsKt$patchWithCacheParts$1.label;
        if (i != 0) {
        }
    }
}
