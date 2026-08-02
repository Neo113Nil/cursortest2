package ru.yandex.taxi.interactors;

import com.yandex.go.pickup_from_photo.experiment.p;
import defpackage.atd0;
import defpackage.ga0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.m8v0;
import defpackage.mgf;
import defpackage.mo21;
import defpackage.mob0;
import defpackage.ngf;
import defpackage.nwf0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pwf0;
import defpackage.tpr;
import defpackage.w9v0;
import defpackage.x9v0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.preorder.suggested.selection.SuggestViewModel$SuggestGroupId;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes5.dex */
public abstract class a {
    public final k7x0 a;
    public final mgf b;
    public final po21 c;
    public final atd0 d;
    public final n e;
    public final mob0 f;
    public final nwf0 g = pwf0.b(ngf.class);

    public a(k7x0 k7x0Var, mgf mgfVar, po21 po21Var, atd0 atd0Var, n nVar, mob0 mob0Var) {
        this.a = k7x0Var;
        this.b = mgfVar;
        this.c = po21Var;
        this.d = atd0Var;
        this.e = nVar;
        this.f = mob0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CurrentLocationSuggestInteractor$addressInfoFromGeoPoint$1 currentLocationSuggestInteractor$addressInfoFromGeoPoint$1;
        int i;
        if (continuationImpl instanceof CurrentLocationSuggestInteractor$addressInfoFromGeoPoint$1) {
            currentLocationSuggestInteractor$addressInfoFromGeoPoint$1 = (CurrentLocationSuggestInteractor$addressInfoFromGeoPoint$1) continuationImpl;
            int i2 = currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.label = 1;
                    obj = ((e) this.c).f(currentLocationSuggestInteractor$addressInfoFromGeoPoint$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                d(mo21Var);
                zzs a = mo21Var.a();
                mgf mgfVar = this.b;
                boolean d = mgfVar.d();
                PositionInitAction positionInitAction = PositionInitAction.GEO;
                boolean e = mgfVar.e();
                i iVar = (i) this.d;
                tpr s = iVar.s(iVar.e.j(a, d, positionInitAction, e));
                currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.L$0 = null;
                currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.label = 2;
                Object y = kotlinx.coroutines.flow.e.y(s, currentLocationSuggestInteractor$addressInfoFromGeoPoint$1);
                return y != coroutineSingletons ? coroutineSingletons : y;
            }
        }
        currentLocationSuggestInteractor$addressInfoFromGeoPoint$1 = new CurrentLocationSuggestInteractor$addressInfoFromGeoPoint$1(this, continuationImpl);
        Object obj2 = currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        d(mo21Var2);
        zzs a2 = mo21Var2.a();
        mgf mgfVar2 = this.b;
        boolean d2 = mgfVar2.d();
        PositionInitAction positionInitAction2 = PositionInitAction.GEO;
        boolean e2 = mgfVar2.e();
        i iVar2 = (i) this.d;
        tpr s2 = iVar2.s(iVar2.e.j(a2, d2, positionInitAction2, e2));
        currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.L$0 = null;
        currentLocationSuggestInteractor$addressInfoFromGeoPoint$1.label = 2;
        Object y2 = kotlinx.coroutines.flow.e.y(s2, currentLocationSuggestInteractor$addressInfoFromGeoPoint$1);
        if (y2 != coroutineSingletons2) {
        }
    }

    public final x9v0 b() {
        mgf mgfVar = this.b;
        if (!mgfVar.isEnabled()) {
            return null;
        }
        String b = mgfVar.b();
        w9v0 w9v0Var = new w9v0(-1);
        w9v0Var.y = Integer.valueOf(SuggestViewModel$SuggestGroupId.CurrentLocation.getGroupId());
        w9v0Var.b = mgfVar.a();
        w9v0Var.f = mgfVar.c();
        w9v0Var.x = m8v0.a;
        mob0 mob0Var = this.f;
        boolean b2 = mob0Var.b();
        p pVar = mob0Var.a;
        if (b2) {
            w9v0Var.M = new ga0(pVar.d(), pVar.e(), false);
        }
        if (b.length() > 0) {
            w9v0Var.i = ((m7x0) this.a).a(b);
        }
        return new x9v0(w9v0Var);
    }

    public final void c() {
        n nVar = this.e;
        boolean b = nVar.b();
        nwf0 nwf0Var = this.g;
        if (b) {
            ((ngf) nwf0Var.b).zc();
        } else if (nVar.c()) {
            ((ngf) nwf0Var.b).N4();
        } else {
            ((ngf) nwf0Var.b).y0();
        }
    }

    public abstract void d(mo21 mo21Var);
}
