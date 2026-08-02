package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class oy extends Exception {
    private int ThreeDS2ServiceInstance;
    private int get;
    private Object getWarnings;

    public oy(int i, int i2, Object obj) {
        this.ThreeDS2ServiceInstance = i;
        this.get = i2;
        this.getWarnings = obj;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        int i = this.get;
        if (i == 0) {
            sb.append("Unexpected character (");
            sb.append(this.getWarnings);
            sb.append(") at position ");
            sb.append(this.ThreeDS2ServiceInstance);
            sb.append(".");
        } else if (i == 1) {
            sb.append("Unexpected token ");
            sb.append(this.getWarnings);
            sb.append(" at position ");
            sb.append(this.ThreeDS2ServiceInstance);
            sb.append(".");
        } else if (i != 2) {
            sb.append("Unknown error at position ");
            sb.append(this.ThreeDS2ServiceInstance);
            sb.append(".");
        } else {
            sb.append("Unexpected exception at position ");
            sb.append(this.ThreeDS2ServiceInstance);
            sb.append(": ");
            sb.append(this.getWarnings);
        }
        return sb.toString();
    }
}
