package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.room.TransactorKt;
import com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda10;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.vision.face.internal.zzf;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class AudioSource {
    public Recorder.AnonymousClass4 mAcquireBufferCallback;
    public double mAudioAmplitude;
    public final int mAudioFormat;
    public Recorder.AnonymousClass4 mAudioSourceCallback;
    public final BufferedAudioStream mAudioStream;
    public boolean mAudioStreamSilenced;
    public EncoderImpl.ByteBufferInput mBufferProvider;
    public Executor mCallbackExecutor;
    public final SequentialExecutor mExecutor;
    public boolean mInSilentStartState;
    public boolean mIsSendingAudio;
    public long mLatestFailedStartTimeNs;
    public boolean mMuted;
    public final zzf mSilentAudioStream;
    public final long mStartRetryIntervalNs;
    public AnonymousClass1 mStateObserver;
    public byte[] mZeroBytes;
    public final AtomicReference mNotifiedSilenceState = new AtomicReference(null);
    public final AtomicBoolean mNotifiedSuspendState = new AtomicBoolean(false);
    public int mState = 1;
    public BufferProvider$State mBufferProviderState = BufferProvider$State.INACTIVE;
    public long mAmplitudeTimestamp = 0;

    public AudioSource(AutoValue_AudioSettings autoValue_AudioSettings, Executor executor, Context context) {
        SequentialExecutor sequentialExecutor = new SequentialExecutor(executor);
        this.mExecutor = sequentialExecutor;
        this.mStartRetryIntervalNs = 3000000000L;
        try {
            BufferedAudioStream bufferedAudioStream = new BufferedAudioStream(new AudioStreamImpl(autoValue_AudioSettings, context), autoValue_AudioSettings);
            this.mAudioStream = bufferedAudioStream;
            Recorder.AnonymousClass2 anonymousClass2 = new Recorder.AnonymousClass2(this);
            TransactorKt.checkState("AudioStream can not be started when setCallback.", true ^ bufferedAudioStream.mIsStarted.get());
            bufferedAudioStream.checkNotReleasedOrThrow$1();
            bufferedAudioStream.mProducerExecutor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(14, bufferedAudioStream, anonymousClass2, sequentialExecutor));
            this.mSilentAudioStream = new zzf(autoValue_AudioSettings);
            this.mAudioFormat = autoValue_AudioSettings.audioFormat;
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e);
        }
    }

    public final void notifySilenced() {
        Executor executor = this.mCallbackExecutor;
        Recorder.AnonymousClass4 anonymousClass4 = this.mAudioSourceCallback;
        if (executor == null || anonymousClass4 == null) {
            return;
        }
        int i = 1;
        boolean z = this.mMuted || this.mInSilentStartState || this.mAudioStreamSilenced;
        if (Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new LottieCompositionFactory$$ExternalSyntheticLambda10(anonymousClass4, z, i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.video.internal.audio.AudioSource$1] */
    public final void resetBufferProvider(final EncoderImpl.ByteBufferInput byteBufferInput) {
        EncoderImpl.ByteBufferInput byteBufferInput2 = this.mBufferProvider;
        BufferProvider$State bufferProvider$State = null;
        if (byteBufferInput2 != null) {
            AnonymousClass1 anonymousClass1 = this.mStateObserver;
            Objects.requireNonNull(anonymousClass1);
            byteBufferInput2.removeObserver(anonymousClass1);
            this.mBufferProvider = null;
            this.mStateObserver = null;
            this.mAcquireBufferCallback = null;
            this.mBufferProviderState = BufferProvider$State.INACTIVE;
            updateSendingAudio();
        }
        if (byteBufferInput != null) {
            this.mBufferProvider = byteBufferInput;
            this.mStateObserver = new Observable.Observer() { // from class: androidx.camera.video.internal.audio.AudioSource.1
                @Override // androidx.camera.core.impl.Observable.Observer
                public final void onError(Throwable th) {
                    AudioSource audioSource = AudioSource.this;
                    if (audioSource.mBufferProvider == byteBufferInput) {
                        Executor executor = audioSource.mCallbackExecutor;
                        Recorder.AnonymousClass4 anonymousClass4 = audioSource.mAudioSourceCallback;
                        if (executor == null || anonymousClass4 == null) {
                            return;
                        }
                        executor.execute(new Recorder$$ExternalSyntheticLambda15(13, anonymousClass4, th));
                    }
                }

                @Override // androidx.camera.core.impl.Observable.Observer
                public final void onNewData(Object obj) {
                    BufferProvider$State bufferProvider$State2 = (BufferProvider$State) obj;
                    Objects.requireNonNull(bufferProvider$State2);
                    AudioSource audioSource = AudioSource.this;
                    if (audioSource.mBufferProvider == byteBufferInput) {
                        StringUtilsKt.d("AudioSource", "Receive BufferProvider state change: " + audioSource.mBufferProviderState + " to " + bufferProvider$State2);
                        if (audioSource.mBufferProviderState != bufferProvider$State2) {
                            audioSource.mBufferProviderState = bufferProvider$State2;
                            audioSource.updateSendingAudio();
                        }
                    }
                }
            };
            this.mAcquireBufferCallback = new Recorder.AnonymousClass4(11, this, byteBufferInput);
            try {
                ListenableFuture fetchData = byteBufferInput.fetchData();
                if (((CallbackToFutureAdapter$SafeFuture) fetchData).delegate.isDone()) {
                    bufferProvider$State = (BufferProvider$State) ((CallbackToFutureAdapter$SafeFuture) fetchData).delegate.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (bufferProvider$State != null) {
                this.mBufferProviderState = bufferProvider$State;
                updateSendingAudio();
            }
            this.mBufferProvider.addObserver(this.mExecutor, this.mStateObserver);
        }
    }

    public final void sendNextAudio() {
        EncoderImpl.ByteBufferInput byteBufferInput = this.mBufferProvider;
        Objects.requireNonNull(byteBufferInput);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2(byteBufferInput, callbackToFutureAdapter$Completer, 1));
            callbackToFutureAdapter$Completer.tag = "acquireBuffer";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        Recorder.AnonymousClass4 anonymousClass4 = this.mAcquireBufferCallback;
        Objects.requireNonNull(anonymousClass4);
        Futures.addCallback(callbackToFutureAdapter$SafeFuture, anonymousClass4, this.mExecutor);
    }

    public final void setState(int i) {
        StringUtilsKt.d("AudioSource", "Transitioning internal state: " + Recorder$$ExternalSyntheticOutline1.stringValueOf$5(this.mState) + " --> " + Recorder$$ExternalSyntheticOutline1.stringValueOf$5(i));
        this.mState = i;
    }

    public final void stopSendingAudio() {
        if (this.mIsSendingAudio) {
            int i = 0;
            this.mIsSendingAudio = false;
            StringUtilsKt.d("AudioSource", "stopSendingAudio");
            BufferedAudioStream bufferedAudioStream = this.mAudioStream;
            bufferedAudioStream.checkNotReleasedOrThrow$1();
            if (bufferedAudioStream.mIsStarted.getAndSet(false)) {
                bufferedAudioStream.mProducerExecutor.execute(new BufferedAudioStream$$ExternalSyntheticLambda0(bufferedAudioStream, i));
            }
        }
    }

    public final void updateSendingAudio() {
        if (this.mState != 2) {
            stopSendingAudio();
            return;
        }
        boolean z = this.mBufferProviderState == BufferProvider$State.ACTIVE;
        boolean z2 = !z;
        Executor executor = this.mCallbackExecutor;
        Recorder.AnonymousClass4 anonymousClass4 = this.mAudioSourceCallback;
        if (executor != null && anonymousClass4 != null && this.mNotifiedSuspendState.getAndSet(z2) != z2) {
            executor.execute(new Preview$$ExternalSyntheticLambda0(anonymousClass4, z2));
        }
        if (!z) {
            stopSendingAudio();
            return;
        }
        if (this.mIsSendingAudio) {
            return;
        }
        try {
            StringUtilsKt.d("AudioSource", "startSendingAudio");
            this.mAudioStream.start();
            this.mInSilentStartState = false;
        } catch (AudioStream.AudioStreamException e) {
            StringUtilsKt.w("AudioSource", "Failed to start AudioStream", e);
            this.mInSilentStartState = true;
            zzf zzfVar = this.mSilentAudioStream;
            zzfVar.checkNotReleasedOrThrow$2();
            if (!((AtomicBoolean) zzfVar.zza).getAndSet(true)) {
                zzfVar.zzb = System.nanoTime();
            }
            this.mLatestFailedStartTimeNs = System.nanoTime();
            notifySilenced();
        }
        this.mIsSendingAudio = true;
        sendNextAudio();
    }
}
