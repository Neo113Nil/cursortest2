package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.b64;
import defpackage.evu0;
import defpackage.fa90;
import defpackage.g8e;
import defpackage.i8n;
import defpackage.j8n;
import defpackage.ly3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzh0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yuj0;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Li8n;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.DynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1", f = "DynamicHeaderInfoInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$LongRef $delta;
    final /* synthetic */ fa90 $paidWaitingInfo;
    final /* synthetic */ String $subTitle;
    final /* synthetic */ String $title;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j8n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1(Ref$LongRef ref$LongRef, j8n j8nVar, String str, String str2, fa90 fa90Var, Continuation continuation) {
        super(2, continuation);
        this.$delta = ref$LongRef;
        this.this$0 = j8nVar;
        this.$title = str;
        this.$subTitle = str2;
        this.$paidWaitingInfo = fa90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1 dynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1 = new DynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1(this.$delta, this.this$0, this.$title, this.$subTitle, this.$paidWaitingInfo, continuation);
        dynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1.L$0 = obj;
        return dynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        if (r1.emit(r7, r20) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dc, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r20) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0121, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011f, code lost:
    
        if (r1.emit(r4, r20) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        if (r20.$delta.element > 0) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00dc -> B:13:0x00df). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z;
        int i;
        long j2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        long j3 = 0;
        int i3 = 2;
        if (i2 == 0) {
            kotlin.b.b(obj);
        } else if (i2 == 1) {
            kotlin.b.b(obj);
            z = true;
            j = 1000;
            this.L$0 = vprVar;
            i = 2;
            this.label = 2;
            j2 = j;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            z = true;
            i = 2;
            j2 = 1000;
            this.$delta.element -= j2;
            i3 = i;
            j3 = 0;
            if (kotlinx.coroutines.a.p(get_context())) {
                long j4 = this.$delta.element;
                if (j4 > j3) {
                    j8n j8nVar = this.this$0;
                    String str = this.$title;
                    String str2 = this.$subTitle;
                    j8nVar.getClass();
                    j = 1000;
                    long j5 = j4 / 60000;
                    long millis = (j4 - TimeUnit.MINUTES.toMillis(j5)) / 1000;
                    yuj0 yuj0Var = j8nVar.a;
                    String a = yuj0Var.a(rzh0.accessibility_minutes, new Object[0]);
                    String a2 = yuj0Var.a(rzh0.accessibility_seconds, new Object[0]);
                    String str3 = str + " " + j5 + ":" + evu0.N(MoneyInputEditView.DEFAULT_VALUE, i3, String.valueOf(millis));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" ");
                    sb.append(j5);
                    sb.append(" ");
                    ly3.y(millis, a, " ", sb);
                    i8n i8nVar = new i8n(str3, str2, g8e.r(sb, " ", a2, " ", str2), g8e.p(str, " ", str2));
                    this.L$0 = vprVar;
                    z = true;
                    this.label = 1;
                }
            }
            j8n j8nVar2 = this.this$0;
            fa90 fa90Var = this.$paidWaitingInfo;
            String str4 = fa90Var.b;
            String str5 = fa90Var.c;
            String str6 = this.$subTitle;
            j8nVar2.getClass();
            String j6 = b64.j(str4, str5 != null ? " ".concat(str5) : "");
            i8n i8nVar2 = new i8n(j6, str6, g8e.p(j6, " ", str6), g8e.p(j6, " ", str6));
            this.L$0 = null;
            this.label = 3;
        }
    }
}
