package com.createyourself.policy;

import android.webkit.JavascriptInterface;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PolicyGate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/createyourself/policy/PolicyJsBridge;", "", "onMessage", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "recieve", "message", "receive", "postMessage", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class PolicyJsBridge {
    private final Function1<String, Unit> onMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public PolicyJsBridge(Function1<? super String, Unit> onMessage) {
        Intrinsics.checkNotNullParameter(onMessage, "onMessage");
        this.onMessage = onMessage;
    }

    @JavascriptInterface
    public final void recieve(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.onMessage.invoke(message);
    }

    @JavascriptInterface
    public final void receive(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.onMessage.invoke(message);
    }

    @JavascriptInterface
    public final void postMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.onMessage.invoke(message);
    }
}
