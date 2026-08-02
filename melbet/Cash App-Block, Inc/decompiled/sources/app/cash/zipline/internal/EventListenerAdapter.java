package app.cash.zipline.internal;

import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.EventListener;
import app.cash.zipline.Zipline;

/* loaded from: classes3.dex */
public final class EventListenerAdapter {
    public final EventListener delegate;
    public final Zipline zipline;

    public EventListenerAdapter(Zipline zipline, EventListener eventListener) {
        eventListener.getClass();
        this.zipline = zipline;
        this.delegate = eventListener;
    }

    public void callEnd(Call call, CallResult callResult, Object obj) {
        call.getClass();
        this.delegate.callEnd(this.zipline, call, callResult, obj);
    }

    public EventListenerAdapter(EventListener eventListener, Zipline zipline) {
        eventListener.getClass();
        this.delegate = eventListener;
        this.zipline = zipline;
    }
}
