package ru.CryptoPro.JCSP.state;

import ru.CryptoPro.JCSP.InitEvent;

/* loaded from: classes4.dex */
public class CreateInfrastructureEvent implements InitEvent {
    private final String path;

    public CreateInfrastructureEvent(String str) {
        this.path = str;
    }

    public String getInfrastructurePath() {
        return this.path;
    }
}
