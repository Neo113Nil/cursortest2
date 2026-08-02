package com.fidesmo.sec.local;

import com.fidesmo.sec.devices.Device;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final /* synthetic */ class ApduUtils$$ExternalSyntheticLambda2 implements Consumer, ObservableOnSubscribe {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Device f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ ApduUtils$$ExternalSyntheticLambda2(Object obj, Device device, Object obj2, Object obj3) {
        this.f$0 = obj;
        this.f$1 = device;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        ApduUtils.lambda$enumerateAppletsUtils$1((List) this.f$0, this.f$1, (String) this.f$2, (ObservableEmitter) this.f$3, (byte[]) obj);
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableCreate$CreateEmitter observableCreate$CreateEmitter) {
        WebSocketManager.initiateWebSocket$lambda$2((WebSocketManager) this.f$0, this.f$1, (OkHttpClient) this.f$2, (Request) this.f$3, observableCreate$CreateEmitter);
    }
}
