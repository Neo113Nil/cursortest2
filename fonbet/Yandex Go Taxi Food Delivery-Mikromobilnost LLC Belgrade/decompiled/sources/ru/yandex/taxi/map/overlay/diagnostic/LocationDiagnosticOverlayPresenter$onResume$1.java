package ru.yandex.taxi.map.overlay.diagnostic;

import defpackage.e3n;
import defpackage.e8z;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x43;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lyne;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.overlay.diagnostic.LocationDiagnosticOverlayPresenter$onResume$1", f = "LocationDiagnosticOverlayPresenter.kt", l = {29, 31, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationDiagnosticOverlayPresenter$onResume$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDiagnosticOverlayPresenter$onResume$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationDiagnosticOverlayPresenter$onResume$1 locationDiagnosticOverlayPresenter$onResume$1 = new LocationDiagnosticOverlayPresenter$onResume$1(this.this$0, continuation);
        locationDiagnosticOverlayPresenter$onResume$1.L$0 = obj;
        return locationDiagnosticOverlayPresenter$onResume$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationDiagnosticOverlayPresenter$onResume$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if (kotlinx.coroutines.a.j(r7, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0083 -> B:13:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                List list = (List) obj;
                x43 x43Var = this.this$0.B.a;
                if (x43Var.size() > 60) {
                    x43Var.removeLast();
                }
                x43Var.addFirst(new e8z(System.currentTimeMillis(), list));
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 2;
            } else if (i == 2) {
                b.b(obj);
                o430 o430Var = e3n.b;
                long U = kp50.U(10, DurationUnit.SECONDS);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 3;
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        b.b(obj);
        a aVar = this.this$0;
        if (!aVar.c) {
            return zy11.a;
        }
        ru.yandex.taxi.preorder.source.userposition.a aVar2 = aVar.A;
        this.L$0 = vprVar;
        this.L$1 = null;
        this.label = 1;
        obj = aVar2.g(this);
    }
}
