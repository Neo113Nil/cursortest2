package ru.CryptoPro.JCSP.state;

import ru.CryptoPro.JCSP.InitEvent;

/* loaded from: classes4.dex */
public class LoadingNativeLibraryEvent implements InitEvent {
    private boolean allowFindRemoteLibrary = false;

    public void allowFindRemoteLibrary() {
        this.allowFindRemoteLibrary = true;
    }

    public boolean isAllowFindRemoteLibrary() {
        return this.allowFindRemoteLibrary;
    }
}
