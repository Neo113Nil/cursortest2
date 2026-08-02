package ru.cprocsp.ACSP.tools.store.model;

/* loaded from: classes4.dex */
public class ResultOf<T> {
    private final T data;
    private Error error;
    private String message;
    private int messageID;
    private final Status status;

    public enum Status {
        SUCCESS,
        ERROR,
        WAIT
    }

    public ResultOf(Status status, T t, Error error, int i) {
        this.status = status;
        this.data = t;
        this.error = error;
        this.messageID = i;
    }

    public T getData() {
        return this.data;
    }

    public Error getError() {
        return this.error;
    }

    public String getMessage() {
        return this.message;
    }

    public int getMessageID() {
        return this.messageID;
    }

    public Status getStatus() {
        return this.status;
    }

    public ResultOf(Status status, T t, String str) {
        this.status = status;
        this.data = t;
        this.message = str;
    }

    public ResultOf(Status status, T t, int i) {
        this.status = status;
        this.data = t;
        this.messageID = i;
    }
}
