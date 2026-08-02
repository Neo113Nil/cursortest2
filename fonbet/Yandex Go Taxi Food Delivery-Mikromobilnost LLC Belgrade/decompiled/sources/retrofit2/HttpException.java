package retrofit2;

import defpackage.kvj0;

/* loaded from: classes9.dex */
public class HttpException extends RuntimeException {
    public final transient Response a;
    private final int code;
    private final String message;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpException(Response response) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("HTTP ");
        kvj0 kvj0Var = response.a;
        int i = kvj0Var.w;
        sb.append(i);
        sb.append(" ");
        String str = kvj0Var.c;
        sb.append(str);
        this.code = i;
        this.message = str;
        this.a = response;
    }

    public final int a() {
        return this.code;
    }
}
