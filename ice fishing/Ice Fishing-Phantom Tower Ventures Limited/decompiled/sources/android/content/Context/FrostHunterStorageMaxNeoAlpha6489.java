package android.content.Context;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStorageMaxNeoAlpha6489 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler FrostHunterAlphaAnimationNeoCosmos5761;
    public final AudioManager.OnAudioFocusChangeListener FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterStorageMaxNeoAlpha6489(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterAlphaAnimationNeoCosmos5761, new FrostHunterMergeQuantumMega4504(i, 0, this));
    }
}
