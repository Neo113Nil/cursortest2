package com.fidesmo.sec.local;

import com.fidesmo.sec.devices.Device;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;

/* loaded from: classes4.dex */
public final /* synthetic */ class ApduUtils$$ExternalSyntheticLambda0 implements Function, ObservableOnSubscribe {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ApduUtils$$ExternalSyntheticLambda0(Object obj, String str) {
        this.f$0 = obj;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        byte[] lambda$transceive$3;
        lambda$transceive$3 = ApduUtils.lambda$transceive$3((int[]) this.f$0, this.f$1, (byte[]) obj);
        return lambda$transceive$3;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableCreate$CreateEmitter observableCreate$CreateEmitter) {
        ApduUtils.lambda$enumerateApplets$0((Device) this.f$0, this.f$1, observableCreate$CreateEmitter);
    }
}
