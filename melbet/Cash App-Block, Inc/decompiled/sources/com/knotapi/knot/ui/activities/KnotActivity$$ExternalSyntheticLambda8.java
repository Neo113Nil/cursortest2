package com.knotapi.knot.ui.activities;

import com.knotapi.knot.models.Bot;
import com.knotapi.knot.ui.activities.KnotActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class KnotActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ KnotActivity$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((KnotActivity) obj2).lambda$callTimeOutErrorCallback$8((Bot) obj);
                break;
            case 1:
                ((KnotActivity.AnonymousClass1) obj2).lambda$onPageFinished$0((String) obj);
                break;
            default:
                ((KnotActivity.AnonymousClass3) obj2).lambda$onWebViewCreated$0((Bot) obj);
                break;
        }
    }
}
