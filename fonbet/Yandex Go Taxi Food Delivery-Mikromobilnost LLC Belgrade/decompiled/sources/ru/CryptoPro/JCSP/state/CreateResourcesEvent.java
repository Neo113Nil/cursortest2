package ru.CryptoPro.JCSP.state;

import ru.CryptoPro.JCSP.InitEvent;

/* loaded from: classes4.dex */
public class CreateResourcesEvent implements InitEvent {
    private final boolean willUpdate;

    public CreateResourcesEvent(boolean z) {
        this.willUpdate = z;
    }

    public boolean willUpdate() {
        return this.willUpdate;
    }
}
