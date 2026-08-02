package ru.CryptoPro.JCSP.state;

import ru.CryptoPro.JCSP.InitEvent;

/* loaded from: classes4.dex */
public class ChangeWorkingDirectoryEvent implements InitEvent {
    private final String workPath;

    public ChangeWorkingDirectoryEvent(String str) {
        this.workPath = str;
    }

    public String getWorkingDirectory() {
        return this.workPath;
    }
}
