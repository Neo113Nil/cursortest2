package androidx.camera.core.impl;

import androidx.camera.video.Recorder;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes3.dex */
public final /* synthetic */ class LiveDataObservable$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Recorder.AnonymousClass3 f$0;

    public /* synthetic */ LiveDataObservable$$ExternalSyntheticLambda2(Recorder.AnonymousClass3 anonymousClass3, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Recorder.AnonymousClass3 anonymousClass3 = this.f$0;
        switch (i) {
            case 0:
                LiveDataObservable$$ExternalSyntheticLambda5 liveDataObservable$$ExternalSyntheticLambda5 = (LiveDataObservable$$ExternalSyntheticLambda5) anonymousClass3.this$0;
                if (liveDataObservable$$ExternalSyntheticLambda5 != null) {
                    ((MutableLiveData) anonymousClass3.val$completer).removeObserver(liveDataObservable$$ExternalSyntheticLambda5);
                    break;
                }
                break;
            default:
                if (((LiveDataObservable$$ExternalSyntheticLambda5) anonymousClass3.this$0) == null) {
                    anonymousClass3.this$0 = new LiveDataObservable$$ExternalSyntheticLambda5(anonymousClass3, 0);
                }
                ((MutableLiveData) anonymousClass3.val$completer).observeForever((LiveDataObservable$$ExternalSyntheticLambda5) anonymousClass3.this$0);
                break;
        }
    }
}
