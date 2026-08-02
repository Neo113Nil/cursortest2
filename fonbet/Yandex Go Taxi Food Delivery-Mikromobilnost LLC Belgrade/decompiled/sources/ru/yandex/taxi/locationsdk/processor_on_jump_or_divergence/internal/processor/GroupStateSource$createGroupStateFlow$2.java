package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import android.os.SystemClock;
import defpackage.ajc;
import defpackage.e3n;
import defpackage.ez60;
import defpackage.iz60;
import defpackage.k7z;
import defpackage.kp50;
import defpackage.lpw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.u1k;
import defpackage.vy60;
import defpackage.yga1;
import defpackage.z2u;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zy60;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llpw;", "prevState", "Lk7z;", "location", "<anonymous>", "(Llpw;Lk7z;)Llpw;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.GroupStateSource$createGroupStateFlow$2", f = "GroupStateSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class GroupStateSource$createGroupStateFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ ez60 $group;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ z2u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupStateSource$createGroupStateFlow$2(z2u z2uVar, ez60 ez60Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = z2uVar;
        this.$group = ez60Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GroupStateSource$createGroupStateFlow$2 groupStateSource$createGroupStateFlow$2 = new GroupStateSource$createGroupStateFlow$2(this.this$0, this.$group, (Continuation) obj3);
        groupStateSource$createGroupStateFlow$2.L$0 = (lpw) obj;
        groupStateSource$createGroupStateFlow$2.L$1 = (k7z) obj2;
        return groupStateSource$createGroupStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ajc ajcVar;
        ajc ajcVar2;
        vy60 vy60Var;
        lpw lpwVar = (lpw) this.L$0;
        k7z k7zVar = (k7z) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        z2u z2uVar = this.this$0;
        ez60 ez60Var = this.$group;
        z2uVar.b.getClass();
        ajc ajcVar3 = new ajc(SystemClock.elapsedRealtime(), System.currentTimeMillis());
        k7z k7zVar2 = lpwVar != null ? lpwVar.b : null;
        zy60 c = ez60Var.c();
        if (c != null) {
            TimestampSelector timestampSelector = z2uVar.a;
            if (k7zVar2 != null && !yga1.c(c.a, k7zVar2, k7zVar, timestampSelector)) {
                ajc ajcVar4 = k7zVar.a;
                long j = c.b;
                ajcVar = new ajc(e3n.e(j) + ajcVar4.a, e3n.e(j) + ajcVar4.b);
                boolean z = ajcVar == null;
                if (ajcVar != null) {
                    ajcVar2 = lpwVar != null ? lpwVar.e : null;
                } else {
                    ajcVar2 = ajcVar;
                }
                iz60 b = ez60Var.b();
                ajc ajcVar5 = k7zVar.a;
                vy60Var = b.b;
                long j2 = b.a;
                if (vy60Var != null) {
                    u1k u1kVar = k7zVar.b.b;
                    double d = u1kVar != null ? u1kVar.a : vy60Var.b;
                    double d2 = vy60Var.a;
                    o430 o430Var = e3n.b;
                    j2 = e3n.k(j2, e3n.q(kp50.T(d / d2, DurationUnit.SECONDS)));
                }
                return new lpw(ajcVar3, k7zVar, k7zVar2, z, ajcVar2, new ajc(e3n.e(j2) + ajcVar5.a, e3n.e(j2) + ajcVar5.b));
            }
        }
        ajcVar = null;
        boolean z2 = ajcVar == null;
        if (ajcVar != null) {
        }
        iz60 b2 = ez60Var.b();
        ajc ajcVar52 = k7zVar.a;
        vy60Var = b2.b;
        long j22 = b2.a;
        if (vy60Var != null) {
        }
        return new lpw(ajcVar3, k7zVar, k7zVar2, z2, ajcVar2, new ajc(e3n.e(j22) + ajcVar52.a, e3n.e(j22) + ajcVar52.b));
    }
}
