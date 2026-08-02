package com.fidesmo.sec.local;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.local.WebSocketResult;
import com.fidesmo.sec.local.models.WebSocketMessage;
import com.fidesmo.sec.utils.Hex;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.internal.observers.BlockingFirstObserver;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.adapter.rxjava3.CallEnqueueObservable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/fidesmo/sec/local/WebSocketManager;", "", "()V", "logger", "Lorg/slf4j/Logger;", "webSocket", "Lokhttp3/WebSocket;", "initiateWebSocket", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/local/WebSocketResult;", "device", "Lcom/fidesmo/sec/devices/Device;", "serverUrl", "", "headers", "", "printResult", "message", "Companion", "WebSocketCommunicator", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebSocketManager {
    private static final int CLOSE_STATUS = 1000;
    private final Logger logger;
    private WebSocket webSocket;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ \u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/fidesmo/sec/local/WebSocketManager$WebSocketCommunicator;", "Lokhttp3/WebSocketListener;", "device", "Lcom/fidesmo/sec/devices/Device;", "onFinish", "Lkotlin/Function1;", "Lcom/fidesmo/sec/local/WebSocketResult;", "", "(Lcom/fidesmo/sec/local/WebSocketManager;Lcom/fidesmo/sec/devices/Device;Lkotlin/jvm/functions/Function1;)V", "getDevice", "()Lcom/fidesmo/sec/devices/Device;", "getOnFinish", "()Lkotlin/jvm/functions/Function1;", "onClosing", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onFailure", "throwable", "", "response", "Lokhttp3/Response;", "onMessage", "message", "onOpen", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class WebSocketCommunicator extends WebSocketListener {
        private final Device device;
        private final Function1<WebSocketResult, Unit> onFinish;
        final /* synthetic */ WebSocketManager this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public WebSocketCommunicator(WebSocketManager webSocketManager, Device device, Function1<? super WebSocketResult, Unit> function1) {
            device.getClass();
            function1.getClass();
            this.this$0 = webSocketManager;
            this.device = device;
            this.onFinish = function1;
        }

        public final Device getDevice() {
            return this.device;
        }

        public final Function1<WebSocketResult, Unit> getOnFinish() {
            return this.onFinish;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int code, String reason) {
            webSocket.getClass();
            reason.getClass();
            ((RealWebSocket) webSocket).close(1000, reason);
            this.this$0.printResult("Closing Socket : " + code + " / " + reason);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable throwable, Response response) {
            webSocket.getClass();
            throwable.getClass();
            this.this$0.printResult("Error : " + throwable.getMessage());
            this.onFinish.invoke(new WebSocketResult.Failed(throwable, null, null, null, 14, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [com.fidesmo.sec.local.models.WebSocketMessage$Companion] */
        /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String message) {
            ?? listOf;
            Observable<List<byte[]>> transceive;
            webSocket.getClass();
            message.getClass();
            this.this$0.printResult("Receive Message: ".concat(message));
            WebSocketMessage from = WebSocketMessage.INSTANCE.from(message);
            if (from instanceof WebSocketMessage.Id) {
                this.this$0.printResult("id message: " + ((WebSocketMessage.Id) from).getValue());
                return;
            }
            if (from instanceof WebSocketMessage.Status) {
                ((RealWebSocket) webSocket).close(1000, "Service finished");
                WebSocketMessage.Status status = (WebSocketMessage.Status) from;
                this.onFinish.invoke(Intrinsics.areEqual(status.getCode(), "OK") ? new WebSocketResult.Succeeded(status) : new WebSocketResult.Failed(null, status.getCode(), status.getMessage(), status, 1, null));
                return;
            }
            if (from instanceof WebSocketMessage.Command) {
                List<String> commands = ((WebSocketMessage.Command) from).getCommands();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(commands, 10));
                Iterator it = commands.iterator();
                while (it.hasNext()) {
                    arrayList.add(Hex.decodeHex((String) it.next()));
                }
                try {
                    Device device = this.device;
                    List list = null;
                    if (device != null && (transceive = device.transceive(arrayList)) != null) {
                        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver(1);
                        transceive.subscribe(blockingFirstObserver);
                        if (blockingFirstObserver.getCount() != 0) {
                            try {
                                blockingFirstObserver.await();
                            } catch (InterruptedException e) {
                                blockingFirstObserver.dispose();
                                throw ExceptionHelper.wrapOrThrow(e);
                            }
                        }
                        Throwable th = blockingFirstObserver.error;
                        if (th != null) {
                            throw ExceptionHelper.wrapOrThrow(th);
                        }
                        ?? r11 = blockingFirstObserver.value;
                        if (r11 != 0) {
                            list = r11;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m();
                        }
                        list = list;
                    }
                    if (list != null) {
                        List list2 = list;
                        listOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            listOf.add(Hex.encodeHex((byte[]) it2.next()));
                        }
                    } else {
                        listOf = CollectionsKt__CollectionsJVMKt.listOf("");
                    }
                    ((RealWebSocket) webSocket).send(WebSocketMessage.INSTANCE.to(listOf));
                } catch (Throwable th2) {
                    ((RealWebSocket) webSocket).close(1000, "Exception caught during transceive");
                    this.onFinish.invoke(new WebSocketResult.Failed(new Throwable("Service stopped because an exception occurred during transceive", th2), null, null, null, 14, null));
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            webSocket.getClass();
            response.getClass();
            this.this$0.printResult("Opened Websocket");
        }
    }

    public WebSocketManager() {
        Logger logger = LoggerFactory.getLogger("fidesmo-WS");
        logger.getClass();
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Observable initiateWebSocket$default(WebSocketManager webSocketManager, Device device, String str, Iterable iterable, int i, Object obj) {
        if ((i & 4) != 0) {
            iterable = null;
        }
        return webSocketManager.initiateWebSocket(device, str, iterable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initiateWebSocket$lambda$2(WebSocketManager webSocketManager, Device device, OkHttpClient okHttpClient, Request request, final ObservableEmitter observableEmitter) {
        webSocketManager.getClass();
        device.getClass();
        okHttpClient.getClass();
        request.getClass();
        observableEmitter.getClass();
        webSocketManager.webSocket = okHttpClient.newWebSocket(request, new WebSocketCommunicator(webSocketManager, device, new Function1<WebSocketResult, Unit>() { // from class: com.fidesmo.sec.local.WebSocketManager$initiateWebSocket$2$listener$1
            {
                super(1);
            }

            public final void invoke(WebSocketResult webSocketResult) {
                webSocketResult.getClass();
                ((ObservableCreate$CreateEmitter) ObservableEmitter.this).onNext(webSocketResult);
                ((ObservableCreate$CreateEmitter) ObservableEmitter.this).onComplete();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((WebSocketResult) obj);
                return Unit.INSTANCE;
            }
        }));
        ((ThreadPoolExecutor) okHttpClient.dispatcher.executorService()).shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String printResult(String message) {
        this.logger.info("WebSocket message: " + message);
        return message;
    }

    public final Observable<WebSocketResult> initiateWebSocket(Device device, String serverUrl, Iterable<String> headers) {
        device.getClass();
        serverUrl.getClass();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(serverUrl);
        if (headers != null) {
            Headers.Builder builder2 = new Headers.Builder();
            for (String str : headers) {
                str.getClass();
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6);
                if (indexOf$default == -1) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) "Unexpected header: ".concat(str));
                    return null;
                }
                builder2.add(StringsKt.trim(str.substring(0, indexOf$default)).toString(), str.substring(indexOf$default + 1));
            }
            builder.headers = builder2.build().newBuilder();
        }
        return new CallEnqueueObservable(new ApduUtils$$ExternalSyntheticLambda2(this, device, okHttpClient, new Request(builder)), 1);
    }
}
