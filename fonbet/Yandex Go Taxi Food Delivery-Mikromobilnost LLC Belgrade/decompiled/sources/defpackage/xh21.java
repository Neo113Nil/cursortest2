package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class xh21 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public xh21(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public static xh21 b(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + str.substring(i));
                i = str.length();
            } else if (indexOf != i) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + str.substring(i, indexOf));
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i += 2;
            } else {
                arrayList3.add("");
                int i2 = i + 1;
                int indexOf2 = str.indexOf("$", i2);
                String substring = str.substring(i2, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith(RemoteBioParameters.X) && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    switch (substring) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            ny61.g("Invalid template: ".concat(str));
                            return null;
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i = indexOf2 + 1;
            }
        }
        return new xh21(arrayList, arrayList2, arrayList3);
    }

    public final String a(long j, long j2, String str, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = this.a;
            if (i2 >= size) {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((String) arrayList2.get(i2));
            if (((Integer) arrayList.get(i2)).intValue() == 1) {
                sb.append(str);
            } else {
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                ArrayList arrayList3 = this.c;
                if (intValue == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Integer.valueOf(i)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }
}
