package ru.cprocsp.ACSP.tools.store.model;

/* loaded from: classes4.dex */
public class Error {
    private final int statusCode;
    private final String statusMessage;

    public Error(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }
}
