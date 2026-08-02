package defpackage;

import android.os.StatFs;
import android.webkit.MimeTypeMap;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.div.state.db.StateEntry;
import com.yandex.go.address.models.Address;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes11.dex */
public abstract class qna1 {
    public static po0 a(Address address, z zVar, RoutePointType routePointType) {
        String pickAction = address.getPickAction();
        if (pickAction == null) {
            pickAction = "";
        }
        return new po0(address.B(), pickAction, zVar, routePointType);
    }

    public static qo0 b(pv0 pv0Var, z zVar, RoutePointType routePointType) {
        Address address = pv0Var.a;
        String pickAction = address.getPickAction();
        if (pickAction == null) {
            pickAction = "";
        }
        return new qo0(address.B(), pickAction, zVar, routePointType, pv0Var);
    }

    public static File c(File file) {
        z83.h("Peculiar # of attempts: 3", true);
        File file2 = null;
        for (int i = 0; i < 3; i++) {
            if (file.exists() || file.mkdirs() || file.exists()) {
                file2 = file;
            } else {
                z83.j("Failed to create files directory!");
                file2 = null;
            }
            if (file2 != null) {
                break;
            }
        }
        if (file2 == null) {
            try {
                file.getCanonicalFile().getAbsolutePath();
                f(file);
            } catch (IOException | SecurityException unused) {
            }
        }
        return file2;
    }

    public static int d(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int i = 0;
                    for (File file2 : listFiles) {
                        i += d(file2);
                    }
                    return i;
                }
            } else {
                file.lastModified();
                if (file.delete()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void e(File file) {
        File[] listFiles;
        if (file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    e(file2);
                }
            }
            if (file.delete()) {
                return;
            }
            ny61.v(g8e.n(file, "Can't delete "));
        }
    }

    public static void f(File file) {
        File file2 = file;
        while (!file2.exists()) {
            file2 = file2.getParentFile();
            if (file2 == null) {
                ydz.b("[Y:Files]", "Can't get free space: " + file);
                return;
            }
        }
        try {
            StatFs statFs = new StatFs(file2.getAbsolutePath());
            statFs.getAvailableBlocksLong();
            statFs.getBlockSizeLong();
        } catch (IllegalArgumentException unused) {
            i991.c();
        }
    }

    public static String g(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str.toLowerCase(Locale.getDefault())));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0031. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List h(xdx xdxVar) {
        String str;
        if (xdxVar.peek() == JsonReader$Token.NULL) {
            xdxVar.B0();
            return EmptyList.a;
        }
        ArrayList z = oyr.z(xdxVar);
        while (xdxVar.hasNext()) {
            xdxVar.u();
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Map map = null;
            LinkedHashMap linkedHashMap = null;
            while (true) {
                str = "";
                while (xdxVar.hasNext()) {
                    String nextName = xdxVar.nextName();
                    switch (nextName.hashCode()) {
                        case -1809421292:
                            if (nextName.equals("extensions")) {
                                Object y = ooc.y(xdxVar);
                                map = y instanceof Map ? (Map) y : null;
                            } else {
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                }
                                linkedHashMap.put(nextName, ooc.y(xdxVar));
                            }
                        case -1197189282:
                            if (!nextName.equals("locations")) {
                                if (linkedHashMap == null) {
                                }
                                linkedHashMap.put(nextName, ooc.y(xdxVar));
                            } else if (xdxVar.peek() == JsonReader$Token.NULL) {
                                xdxVar.B0();
                                arrayList = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                xdxVar.l();
                                while (xdxVar.hasNext()) {
                                    xdxVar.u();
                                    int i = -1;
                                    int i2 = -1;
                                    while (xdxVar.hasNext()) {
                                        String nextName2 = xdxVar.nextName();
                                        if (jl40.l(nextName2, "line")) {
                                            i = xdxVar.nextInt();
                                        } else if (jl40.l(nextName2, "column")) {
                                            i2 = xdxVar.nextInt();
                                        } else {
                                            xdxVar.skipValue();
                                        }
                                    }
                                    xdxVar.y();
                                    arrayList3.add(new i6z0(i, i2, 3));
                                }
                                xdxVar.j();
                                arrayList = arrayList3;
                            }
                            break;
                        case 3433509:
                            if (!nextName.equals(StateEntry.COLUMN_PATH)) {
                                if (linkedHashMap == null) {
                                }
                                linkedHashMap.put(nextName, ooc.y(xdxVar));
                            } else if (xdxVar.peek() == JsonReader$Token.NULL) {
                                xdxVar.B0();
                                arrayList2 = null;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                xdxVar.l();
                                while (xdxVar.hasNext()) {
                                    int i3 = gwj0.a[xdxVar.peek().ordinal()];
                                    if (i3 == 1 || i3 == 2) {
                                        arrayList4.add(Integer.valueOf(xdxVar.nextInt()));
                                    } else {
                                        arrayList4.add(xdxVar.nextString());
                                    }
                                }
                                xdxVar.j();
                                arrayList2 = arrayList4;
                            }
                            break;
                        case 954925063:
                            if (nextName.equals(Constants.KEY_MESSAGE)) {
                                String nextString = xdxVar.nextString();
                                if (nextString == null) {
                                    break;
                                }
                                str = nextString;
                            } else {
                                if (linkedHashMap == null) {
                                }
                                linkedHashMap.put(nextName, ooc.y(xdxVar));
                            }
                            break;
                        default:
                            if (linkedHashMap == null) {
                            }
                            linkedHashMap.put(nextName, ooc.y(xdxVar));
                            break;
                    }
                    while (xdxVar.hasNext()) {
                    }
                }
            }
            xdxVar.y();
            z.add(new t5o(str, arrayList, arrayList2, map, linkedHashMap));
        }
        xdxVar.j();
        return z;
    }

    public static byte i(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean j(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
