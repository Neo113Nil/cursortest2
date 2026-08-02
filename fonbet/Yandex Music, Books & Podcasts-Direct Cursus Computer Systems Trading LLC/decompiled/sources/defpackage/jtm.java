package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class jtm implements aqi, mm6 {
    public final CoroutineContext a;
    public final /* synthetic */ aqi b;

    public jtm(aqi aqiVar, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = aqiVar;
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return this.b.getValue();
    }

    @Override // defpackage.aqi
    public final void setValue(Object obj) {
        this.b.setValue(obj);
    }
}
