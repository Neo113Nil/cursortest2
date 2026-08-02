package flex.engine.state.actor.internal;

import defpackage.dez;
import defpackage.klc;
import defpackage.kq90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.s1m;
import defpackage.s8o;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.ywl;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lywl;", "<anonymous>", "(Ltse;)Lywl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.internal.ActorUtilsKt$patchDocumentError$2", f = "ActorUtils.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ActorUtilsKt$patchDocumentError$2 extends SuspendLambda implements wls {
    final /* synthetic */ klc $commandChannel;
    final /* synthetic */ ywl $currentDocument;
    final /* synthetic */ List<kq90> $documentPatchParams;
    final /* synthetic */ List<s1m> $documentPatchers;
    final /* synthetic */ Throwable $error;
    final /* synthetic */ dez $logContextReceiver;
    final /* synthetic */ u1m $query;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActorUtilsKt$patchDocumentError$2(ywl ywlVar, List list, List list2, dez dezVar, klc klcVar, u1m u1mVar, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.$currentDocument = ywlVar;
        this.$documentPatchParams = list;
        this.$documentPatchers = list2;
        this.$logContextReceiver = dezVar;
        this.$commandChannel = klcVar;
        this.$query = u1mVar;
        this.$error = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActorUtilsKt$patchDocumentError$2(this.$currentDocument, this.$documentPatchParams, this.$documentPatchers, this.$logContextReceiver, this.$commandChannel, this.$query, this.$error, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActorUtilsKt$patchDocumentError$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, ywl] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00f5 -> B:5:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0084 -> B:6:0x009d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef z;
        List<s1m> list;
        dez dezVar;
        klc klcVar;
        u1m u1mVar;
        Throwable th;
        Iterator it;
        int i;
        s1m s1mVar;
        ActorUtilsKt$patchDocumentError$2 actorUtilsKt$patchDocumentError$2 = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = actorUtilsKt$patchDocumentError$2.label;
        if (i2 == 0) {
            z = qv10.z(obj);
            z.element = actorUtilsKt$patchDocumentError$2.$currentDocument;
            List<kq90> list2 = actorUtilsKt$patchDocumentError$2.$documentPatchParams;
            list = actorUtilsKt$patchDocumentError$2.$documentPatchers;
            dezVar = actorUtilsKt$patchDocumentError$2.$logContextReceiver;
            klcVar = actorUtilsKt$patchDocumentError$2.$commandChannel;
            u1mVar = actorUtilsKt$patchDocumentError$2.$query;
            th = actorUtilsKt$patchDocumentError$2.$error;
            it = list2.iterator();
            i = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = actorUtilsKt$patchDocumentError$2.I$2;
            int i4 = actorUtilsKt$patchDocumentError$2.I$1;
            int i5 = actorUtilsKt$patchDocumentError$2.I$0;
            Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) actorUtilsKt$patchDocumentError$2.L$15;
            Iterator it2 = (Iterator) actorUtilsKt$patchDocumentError$2.L$11;
            kq90 kq90Var = (kq90) actorUtilsKt$patchDocumentError$2.L$9;
            Iterator it3 = (Iterator) actorUtilsKt$patchDocumentError$2.L$7;
            Throwable th2 = (Throwable) actorUtilsKt$patchDocumentError$2.L$6;
            u1m u1mVar2 = (u1m) actorUtilsKt$patchDocumentError$2.L$5;
            klc klcVar2 = (klc) actorUtilsKt$patchDocumentError$2.L$4;
            dez dezVar2 = (dez) actorUtilsKt$patchDocumentError$2.L$3;
            List<s1m> list3 = (List) actorUtilsKt$patchDocumentError$2.L$2;
            Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) actorUtilsKt$patchDocumentError$2.L$0;
            b.b(obj);
            int i6 = i4;
            klc klcVar3 = klcVar2;
            dez dezVar3 = dezVar2;
            Iterator it4 = it2;
            int i7 = i5;
            u1m u1mVar3 = u1mVar2;
            List<s1m> list4 = list3;
            Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
            int i8 = i3;
            T t = obj;
            ref$ObjectRef.element = t;
            actorUtilsKt$patchDocumentError$2 = this;
            kq90 kq90Var2 = kq90Var;
            Throwable th3 = th2;
            int i9 = i7;
            int i10 = i6;
            if (it4.hasNext()) {
                s1m s1mVar2 = (s1m) it4.next();
                if (dezVar3 != null && (s1mVar = (s1m) s8o.W(dezVar3, s1mVar2)) != null) {
                    s1mVar2 = s1mVar;
                }
                ywl ywlVar = (ywl) ref$ObjectRef3.element;
                actorUtilsKt$patchDocumentError$2.L$0 = ref$ObjectRef3;
                actorUtilsKt$patchDocumentError$2.L$1 = null;
                actorUtilsKt$patchDocumentError$2.L$2 = list4;
                actorUtilsKt$patchDocumentError$2.L$3 = dezVar3;
                actorUtilsKt$patchDocumentError$2.L$4 = klcVar3;
                actorUtilsKt$patchDocumentError$2.L$5 = u1mVar3;
                actorUtilsKt$patchDocumentError$2.L$6 = th3;
                actorUtilsKt$patchDocumentError$2.L$7 = it3;
                actorUtilsKt$patchDocumentError$2.L$8 = null;
                actorUtilsKt$patchDocumentError$2.L$9 = kq90Var2;
                actorUtilsKt$patchDocumentError$2.L$10 = null;
                actorUtilsKt$patchDocumentError$2.L$11 = it4;
                actorUtilsKt$patchDocumentError$2.L$12 = null;
                actorUtilsKt$patchDocumentError$2.L$13 = null;
                actorUtilsKt$patchDocumentError$2.L$14 = null;
                actorUtilsKt$patchDocumentError$2.L$15 = ref$ObjectRef3;
                actorUtilsKt$patchDocumentError$2.I$0 = i9;
                actorUtilsKt$patchDocumentError$2.I$1 = i10;
                actorUtilsKt$patchDocumentError$2.I$2 = i8;
                actorUtilsKt$patchDocumentError$2.I$3 = 0;
                actorUtilsKt$patchDocumentError$2.label = 1;
                i7 = i9;
                Object c = s1mVar2.c(klcVar3, u1mVar3, kq90Var2, ywlVar, th3, actorUtilsKt$patchDocumentError$2);
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i6 = i10;
                th2 = th3;
                kq90Var = kq90Var2;
                ref$ObjectRef = ref$ObjectRef3;
                t = c;
                ref$ObjectRef.element = t;
                actorUtilsKt$patchDocumentError$2 = this;
                kq90 kq90Var22 = kq90Var;
                Throwable th32 = th2;
                int i92 = i7;
                int i102 = i6;
                if (it4.hasNext()) {
                    int i11 = i92;
                    actorUtilsKt$patchDocumentError$2 = this;
                    klcVar = klcVar3;
                    z = ref$ObjectRef3;
                    it = it3;
                    dezVar = dezVar3;
                    i = i11;
                    th = th32;
                    u1mVar = u1mVar3;
                    list = list4;
                    if (it.hasNext()) {
                        return z.element;
                    }
                    kq90 kq90Var3 = (kq90) it.next();
                    Iterator it5 = list.iterator();
                    list4 = list;
                    dezVar3 = dezVar;
                    u1mVar3 = u1mVar;
                    th32 = th;
                    kq90Var22 = kq90Var3;
                    it4 = it5;
                    i102 = 0;
                    ref$ObjectRef3 = z;
                    it3 = it;
                    klcVar3 = klcVar;
                    i92 = i;
                    i8 = 0;
                    if (it4.hasNext()) {
                    }
                }
            }
        }
    }
}
