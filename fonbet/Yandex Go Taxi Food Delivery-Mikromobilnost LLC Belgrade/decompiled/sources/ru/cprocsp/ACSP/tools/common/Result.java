package ru.cprocsp.ACSP.tools.common;

/* loaded from: classes4.dex */
public class Result implements IResult {
    private final int code;
    private final String message;

    public Result(int i, String str) {
        this.code = i;
        this.message = str;
    }

    @Override // ru.cprocsp.ACSP.tools.common.IResult
    public int getCode() {
        return this.code;
    }

    @Override // ru.cprocsp.ACSP.tools.common.IResult
    public String getMessage() {
        return this.message;
    }
}
