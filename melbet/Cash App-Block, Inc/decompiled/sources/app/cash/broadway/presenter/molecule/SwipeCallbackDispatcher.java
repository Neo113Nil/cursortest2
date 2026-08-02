package app.cash.broadway.presenter.molecule;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SwipeCallbackDispatcher {
    public Function1 handle;
    public final String name;

    public SwipeCallbackDispatcher(String str) {
        this.name = str;
    }
}
