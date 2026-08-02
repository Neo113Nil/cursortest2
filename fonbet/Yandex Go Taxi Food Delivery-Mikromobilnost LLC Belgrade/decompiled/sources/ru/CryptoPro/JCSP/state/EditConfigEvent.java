package ru.CryptoPro.JCSP.state;

import ru.CryptoPro.JCSP.InitEvent;

/* loaded from: classes4.dex */
public class EditConfigEvent implements InitEvent {
    private final boolean configUpdated;

    public EditConfigEvent(boolean z) {
        this.configUpdated = z;
    }

    public boolean isConfigUpdated() {
        return this.configUpdated;
    }
}
