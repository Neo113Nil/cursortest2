package ru.CryptoPro.JCSP.state;

import ru.CryptoPro.JCSP.InitEvent;

/* loaded from: classes4.dex */
public class ResolveNativeLibraryEvent implements InitEvent {
    private final String libPath;

    public ResolveNativeLibraryEvent(String str) {
        this.libPath = str;
    }

    public String getLibraryPath() {
        return this.libPath;
    }
}
