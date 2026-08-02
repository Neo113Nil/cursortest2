package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.cwa1;
import defpackage.dib1;
import defpackage.ffx;
import defpackage.g8m0;
import defpackage.gh00;
import defpackage.mx0;
import defpackage.ny61;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class c implements xsd0 {
    public final ah00 a;
    public final g8m0 b;
    public final n0 c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public c(ah00 ah00Var, g8m0 g8m0Var) {
        this.a = ah00Var;
        this.b = g8m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        ScootersArbitraryDestinationSelectionPointActionRouter$launch$1 scootersArbitraryDestinationSelectionPointActionRouter$launch$1;
        int i;
        if (continuation instanceof ScootersArbitraryDestinationSelectionPointActionRouter$launch$1) {
            scootersArbitraryDestinationSelectionPointActionRouter$launch$1 = (ScootersArbitraryDestinationSelectionPointActionRouter$launch$1) continuation;
            int i2 = scootersArbitraryDestinationSelectionPointActionRouter$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersArbitraryDestinationSelectionPointActionRouter$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersArbitraryDestinationSelectionPointActionRouter$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersArbitraryDestinationSelectionPointActionRouter$launch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Point d = cwa1.d(wsd0Var.getPosition());
                    mx0 mx0Var = new mx0(11, this);
                    ah00 ah00Var = this.a;
                    ((gh00) ah00Var).g.j(d, 200.0f, mx0Var);
                    k kVar = new k(kotlinx.coroutines.flow.e.K(this.c, new b(dib1.c(ah00Var))), new ScootersArbitraryDestinationSelectionPointActionRouter$launch$4(this, null));
                    scootersArbitraryDestinationSelectionPointActionRouter$launch$1.L$0 = null;
                    scootersArbitraryDestinationSelectionPointActionRouter$launch$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(kVar, scootersArbitraryDestinationSelectionPointActionRouter$launch$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersArbitraryDestinationSelectionPointActionRouter$launch$1 = new ScootersArbitraryDestinationSelectionPointActionRouter$launch$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersArbitraryDestinationSelectionPointActionRouter$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersArbitraryDestinationSelectionPointActionRouter$launch$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
