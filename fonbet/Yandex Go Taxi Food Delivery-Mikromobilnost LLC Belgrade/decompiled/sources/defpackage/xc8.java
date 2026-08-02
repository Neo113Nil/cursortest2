package defpackage;

import com.yandex.xplat.common.FileSystemError;
import java.io.File;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes15.dex */
public final /* synthetic */ class xc8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ xc8(wwf wwfVar, String str) {
        this.a = 9;
        this.b = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tyj0 tyj0Var;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(str != null);
            case 1:
                return Boolean.valueOf(str != null);
            case 2:
                return Boolean.valueOf(str != null);
            case 3:
                return Boolean.valueOf(str != null);
            case 4:
                return g8e.o("Got error while polling changes for ", str);
            case 5:
                return b.i(new Pair("type", "onConditionsUpdated"), new Pair("routeId", str));
            case 6:
                return b.i(new Pair("type", "onConditionsOutdated"), new Pair("routeId", str));
            case 7:
                return g8e.o("Failed to parse action ", str);
            case 8:
                return g8e.o("order id: ", str);
            case 9:
                try {
                    r4 = new File(str).exists();
                } catch (Throwable unused) {
                }
                return new tyj0(Boolean.valueOf(r4), null);
            case 10:
                File file = new File(str);
                try {
                    if (file.exists()) {
                        tyj0Var = new tyj0(null, new FileSystemError("File item already exists at destination path: '" + str + "'", null));
                    } else if (file.mkdirs()) {
                        tyj0Var = new tyj0(zy11.a, null);
                    } else {
                        tyj0Var = new tyj0(null, new FileSystemError("Received unexpected error when accessing file item at path: '" + str + "'", null));
                    }
                    return tyj0Var;
                } catch (Throwable th) {
                    return new tyj0(null, new FileSystemError(oyr.p("Received unexpected error when accessing file item at path: '", str, "'"), th));
                }
            case 11:
                return g8e.o("Unsupported action received: ", str);
            case 12:
                return g8e.o("Unsupported scaffold received: ", str);
            case 13:
                return g8e.o("Unsupported content received: ", str);
            case 14:
                return b.i(new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onActiveLevelChanged"), new Pair("activeLevelId", str));
            case 15:
                return String.format("Unknown resource with ID '%s'", Arrays.copyOf(new Object[]{str}, 1));
            case 16:
                return str;
            case 17:
                return g8e.o("Failed to parse order notification for key ", str);
            case 18:
                return oyr.p("Order draft ", str, " was created twice");
            case 19:
                return oyr.p("Failed to parse ", str, ".json");
            case 20:
                return oyr.p("Order shared request with orderId ", str, " failed");
            case 21:
                return "TaxiOrderCircleButtonsOverflow: ".concat(str);
            case 22:
                return oyr.p("order with the given id=", str, " not found");
            case 23:
                return Boolean.valueOf(str != null);
            default:
                return str;
        }
    }

    public /* synthetic */ xc8(wwf wwfVar, String str, hay hayVar) {
        this.a = 10;
        this.b = str;
    }

    public /* synthetic */ xc8(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
