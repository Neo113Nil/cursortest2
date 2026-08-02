package defpackage;

import android.content.Context;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.c;
import com.yandex.div.storage.database.d;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class y7l implements r131, sty, d {
    public final /* synthetic */ int a;

    @Override // com.yandex.div.storage.database.d
    public c a(Context context, String str, int i, c.a aVar, c.InterfaceC0036c interfaceC0036c) {
        return new AndroidDatabaseOpenHelper(context, str, i, aVar, interfaceC0036c);
    }

    @Override // defpackage.sty
    public boolean b(List list) {
        switch (this.a) {
            case 1:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 5:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 13:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 18:
                if (list.size() >= 1) {
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

    @Override // defpackage.r131
    public boolean l(Object obj) {
        switch (this.a) {
            case 0:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 1:
            case 5:
            case 8:
            case 13:
            case 14:
            case 15:
            case 18:
            case 21:
            default:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 2:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue >= 0.0d && doubleValue <= 1.0d) {
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
            case 6:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 7:
                if (((Long) obj).longValue() > 0) {
                    break;
                }
                break;
            case 9:
                if (((Long) obj).longValue() > 0) {
                    break;
                }
                break;
            case 10:
                double doubleValue2 = ((Double) obj).doubleValue();
                if (doubleValue2 >= 0.0d && doubleValue2 <= 1.0d) {
                    break;
                }
                break;
            case 11:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 12:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 16:
                double doubleValue3 = ((Double) obj).doubleValue();
                if (doubleValue3 >= 0.0d && doubleValue3 <= 1.0d) {
                    break;
                }
                break;
            case 17:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 19:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 20:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 22:
                if (((Long) obj).longValue() > 0) {
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
            case 25:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 26:
                if (((Long) obj).longValue() > 0) {
                    break;
                }
                break;
            case 27:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 28:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
        }
        return true;
    }
}
