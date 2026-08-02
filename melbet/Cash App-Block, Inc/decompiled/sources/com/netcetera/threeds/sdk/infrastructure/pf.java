package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class pf {
    public int ThreeDS2ServiceInstance;
    public Object getWarnings;

    public pf(int i, Object obj) {
        this.ThreeDS2ServiceInstance = i;
        this.getWarnings = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (this.ThreeDS2ServiceInstance) {
            case -1:
                sb.append("END OF FILE");
                break;
            case 0:
                sb.append("VALUE(");
                sb.append(this.getWarnings);
                sb.append(")");
                break;
            case 1:
                sb.append("LEFT BRACE({)");
                break;
            case 2:
                sb.append("RIGHT BRACE(})");
                break;
            case 3:
                sb.append("LEFT SQUARE([)");
                break;
            case 4:
                sb.append("RIGHT SQUARE(])");
                break;
            case 5:
                sb.append("COMMA(,)");
                break;
            case 6:
                sb.append("COLON(:)");
                break;
        }
        return sb.toString();
    }
}
