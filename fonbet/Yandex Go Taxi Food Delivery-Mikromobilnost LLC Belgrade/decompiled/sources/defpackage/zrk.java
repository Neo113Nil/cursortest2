package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class zrk implements sty, r131, kfy0, c5l {
    public final /* synthetic */ int a;

    public /* synthetic */ zrk(int i) {
        this.a = i;
    }

    @Override // defpackage.kfy0
    public xel a(bg90 bg90Var, JSONObject jSONObject) {
        return ((fxk) ft6.b.Y9.getValue()).a(bg90Var, jSONObject);
    }

    @Override // defpackage.sty
    public boolean b(List list) {
        switch (this.a) {
            case 0:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 5:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 9:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 15:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 18:
                if (list.size() >= 2) {
                    break;
                }
                break;
            case 19:
                if (list.size() >= 2) {
                    break;
                }
                break;
            default:
                if (list.size() >= 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.c5l
    public void finish(boolean z) {
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        switch (this.a) {
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue >= 0.0d && doubleValue <= 1.0d) {
                    break;
                }
                break;
            case 2:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 3:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 4:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 5:
            case 9:
            case 15:
            case 18:
            case 19:
            case 25:
            case 26:
            default:
                double doubleValue2 = ((Double) obj).doubleValue();
                if (doubleValue2 >= 0.0d && doubleValue2 <= 1.0d) {
                    break;
                }
                break;
            case 6:
                double doubleValue3 = ((Double) obj).doubleValue();
                if (doubleValue3 >= 0.0d && doubleValue3 <= 1.0d) {
                    break;
                }
                break;
            case 7:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 8:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 10:
                if (((Double) obj).doubleValue() > 0.0d) {
                    break;
                }
                break;
            case 11:
                double doubleValue4 = ((Double) obj).doubleValue();
                if (doubleValue4 >= 0.0d && doubleValue4 <= 1.0d) {
                    break;
                }
                break;
            case 12:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 13:
                if (((Double) obj).doubleValue() > 0.0d) {
                    break;
                }
                break;
            case 14:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 16:
                double doubleValue5 = ((Double) obj).doubleValue();
                if (doubleValue5 >= 0.0d && doubleValue5 <= 1.0d) {
                    break;
                }
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                if (longValue >= 0 && longValue <= 360) {
                    break;
                }
                break;
            case 20:
                if (((Double) obj).doubleValue() > 0.0d) {
                    break;
                }
                break;
            case 21:
                double doubleValue6 = ((Double) obj).doubleValue();
                if (doubleValue6 >= 0.0d && doubleValue6 <= 1.0d) {
                    break;
                }
                break;
            case 22:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 23:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 24:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 27:
                if (((Double) obj).doubleValue() > 0.0d) {
                    break;
                }
                break;
        }
        return true;
    }
}
