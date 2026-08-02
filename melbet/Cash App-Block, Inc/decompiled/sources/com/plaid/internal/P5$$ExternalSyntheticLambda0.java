package com.plaid.internal;

import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class P5$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ P5$$ExternalSyntheticLambda0(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                P5.a(function0);
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                int i2 = OldSelfieOverlayView.$r8$clinit;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 8:
                int i3 = OldSelfieOverlayView.$r8$clinit;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 9:
                int i4 = Pi2CircleMaskView.$r8$clinit;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
