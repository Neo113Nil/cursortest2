package com.connectsdk.service.command;

/* loaded from: classes.dex */
public class ServiceCommandError extends Error {
    private static final long serialVersionUID = 4232138682873631468L;
    protected int code;
    protected Object payload;

    public ServiceCommandError(int i, String str, Object obj) {
        super(str);
        this.code = i;
        this.payload = obj;
    }

    public static ServiceCommandError getError(int i) {
        return new ServiceCommandError(i, i == 400 ? "Bad Request" : i == 401 ? "Unauthorized" : i == 500 ? "Internal Server Error" : i == 503 ? "Service Unavailable" : "Unknown Error", null);
    }

    public static ServiceCommandError notSupported() {
        return new NotSupportedServiceCommandError();
    }

    public int getCode() {
        return this.code;
    }

    public Object getPayload() {
        return this.payload;
    }

    public ServiceCommandError(String str) {
        super(str);
    }

    public ServiceCommandError(int i, String str) {
        super(str);
        this.code = i;
    }

    public ServiceCommandError() {
    }
}
