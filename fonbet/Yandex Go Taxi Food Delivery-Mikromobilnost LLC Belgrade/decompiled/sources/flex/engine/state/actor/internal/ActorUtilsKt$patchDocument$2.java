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
@mvg(c = "flex.engine.state.actor.internal.ActorUtilsKt$patchDocument$2", f = "ActorUtils.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ActorUtilsKt$patchDocument$2 extends SuspendLambda implements wls {
    final /* synthetic */ klc $commandChannel;
    final /* synthetic */ ywl $defaultDocument;
    final /* synthetic */ List<kq90> $documentPatchParams;
    final /* synthetic */ List<s1m> $documentPatchers;
    final /* synthetic */ dez $logContextReceiver;
    final /* synthetic */ ywl $newDocument;
    final /* synthetic */ ywl $oldDocument;
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
    Object L$16;
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
    public ActorUtilsKt$patchDocument$2(List list, ywl ywlVar, List list2, dez dezVar, klc klcVar, ywl ywlVar2, ywl ywlVar3, Continuation continuation) {
        super(2, continuation);
        this.$documentPatchParams = list;
        this.$defaultDocument = ywlVar;
        this.$documentPatchers = list2;
        this.$logContextReceiver = dezVar;
        this.$commandChannel = klcVar;
        this.$oldDocument = ywlVar2;
        this.$newDocument = ywlVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActorUtilsKt$patchDocument$2(this.$documentPatchParams, this.$defaultDocument, this.$documentPatchers, this.$logContextReceiver, this.$commandChannel, this.$oldDocument, this.$newDocument, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActorUtilsKt$patchDocument$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0107 -> B:5:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0090 -> B:6:0x00a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ref$ObjectRef z;
        List<s1m> list;
        dez dezVar;
        ywl ywlVar;
        klc klcVar;
        ywl ywlVar2;
        ywl ywlVar3;
        Iterator it;
        int i;
        s1m s1mVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            obj2 = null;
            z = qv10.z(obj);
            List<kq90> list2 = this.$documentPatchParams;
            list = this.$documentPatchers;
            dezVar = this.$logContextReceiver;
            ywlVar = this.$defaultDocument;
            klcVar = this.$commandChannel;
            ywlVar2 = this.$oldDocument;
            ywlVar3 = this.$newDocument;
            it = list2.iterator();
            i = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.L$16;
            Iterator it2 = (Iterator) this.L$12;
            kq90 kq90Var = (kq90) this.L$10;
            Iterator it3 = (Iterator) this.L$8;
            ywl ywlVar4 = (ywl) this.L$7;
            ywl ywlVar5 = (ywl) this.L$6;
            klc klcVar2 = (klc) this.L$5;
            ywl ywlVar6 = (ywl) this.L$4;
            dez dezVar2 = (dez) this.L$3;
            List<s1m> list3 = (List) this.L$2;
            Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
            b.b(obj);
            int i6 = i3;
            z = ref$ObjectRef2;
            List<s1m> list4 = list3;
            Iterator it4 = it3;
            ywl ywlVar7 = ywlVar4;
            Iterator it5 = it2;
            int i7 = i4;
            dez dezVar3 = dezVar2;
            kq90 kq90Var2 = kq90Var;
            ywl ywlVar8 = ywlVar5;
            int i8 = i5;
            ywl ywlVar9 = ywlVar6;
            CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
            T t = obj;
            ref$ObjectRef.element = t;
            int i9 = i7;
            klc klcVar3 = klcVar2;
            coroutineSingletons = coroutineSingletons2;
            kq90 kq90Var3 = kq90Var2;
            obj2 = null;
            if (it5.hasNext()) {
                s1m s1mVar2 = (s1m) it5.next();
                if (dezVar3 != null && (s1mVar = (s1m) s8o.W(dezVar3, s1mVar2)) != null) {
                    s1mVar2 = s1mVar;
                }
                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                ywl ywlVar10 = (ywl) z.element;
                if (ywlVar10 == null) {
                    ywlVar10 = ywlVar9;
                }
                this.L$0 = z;
                ywl ywlVar11 = ywlVar10;
                Object obj3 = obj2;
                this.L$1 = obj3;
                this.L$2 = list4;
                this.L$3 = dezVar3;
                this.L$4 = ywlVar9;
                this.L$5 = klcVar3;
                this.L$6 = ywlVar8;
                this.L$7 = ywlVar7;
                this.L$8 = it4;
                this.L$9 = obj3;
                this.L$10 = kq90Var3;
                this.L$11 = obj3;
                this.L$12 = it5;
                this.L$13 = obj3;
                this.L$14 = obj3;
                this.L$15 = obj3;
                this.L$16 = z;
                this.I$0 = i8;
                this.I$1 = i9;
                this.I$2 = i6;
                this.I$3 = 0;
                this.label = 1;
                ywl b = s1mVar2.b(kq90Var3, ywlVar8, ywlVar7, ywlVar11);
                coroutineSingletons2 = coroutineSingletons3;
                if (b == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                kq90Var2 = kq90Var3;
                klcVar2 = klcVar3;
                i7 = i9;
                ref$ObjectRef = z;
                t = b;
                ref$ObjectRef.element = t;
                int i92 = i7;
                klc klcVar32 = klcVar2;
                coroutineSingletons = coroutineSingletons2;
                kq90 kq90Var32 = kq90Var2;
                obj2 = null;
                if (it5.hasNext()) {
                    it = it4;
                    list = list4;
                    dezVar = dezVar3;
                    ywlVar = ywlVar9;
                    klcVar = klcVar32;
                    ywlVar2 = ywlVar8;
                    ywlVar3 = ywlVar7;
                    i = i8;
                    obj2 = null;
                    if (it.hasNext()) {
                        ywl ywlVar12 = (ywl) z.element;
                        return ywlVar12 == null ? this.$defaultDocument : ywlVar12;
                    }
                    kq90 kq90Var4 = (kq90) it.next();
                    it5 = list.iterator();
                    i8 = i;
                    kq90Var32 = kq90Var4;
                    ywlVar8 = ywlVar2;
                    ywlVar7 = ywlVar3;
                    i92 = 0;
                    klcVar32 = klcVar;
                    ywlVar9 = ywlVar;
                    dezVar3 = dezVar;
                    list4 = list;
                    it4 = it;
                    i6 = 0;
                    if (it5.hasNext()) {
                    }
                }
            }
        }
    }
}
