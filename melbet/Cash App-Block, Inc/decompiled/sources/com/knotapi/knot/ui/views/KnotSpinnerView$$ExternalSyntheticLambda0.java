package com.knotapi.knot.ui.views;

import com.squareup.cash.graphics.backend.gl.core.ObjMesh$$ExternalSyntheticLambda0;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class KnotSpinnerView$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ KnotSpinnerView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((KnotSpinnerView) obj2).lambda$setupAnimations$1((Float) obj);
                break;
            case 1:
                ((KnotSpinnerView) obj2).lambda$setupAnimations$2((Float) obj);
                break;
            case 2:
                ((KnotSpinnerView) obj2).lambda$setupAnimations$3((Float) obj);
                break;
            default:
                ((ObjMesh$$ExternalSyntheticLambda0) obj2).invoke(obj);
                break;
        }
    }
}
