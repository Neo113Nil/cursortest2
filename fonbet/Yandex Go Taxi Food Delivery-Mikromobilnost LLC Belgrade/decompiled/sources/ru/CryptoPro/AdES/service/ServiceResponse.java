package ru.CryptoPro.AdES.service;

/* loaded from: classes4.dex */
public abstract class ServiceResponse<T> {
    private final T response;

    public ServiceResponse(T t) {
        this.response = t;
    }

    public T getResponse() {
        return this.response;
    }
}
