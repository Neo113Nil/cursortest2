package ru.CryptoPro.JCP.VMInspector;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.b64;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.x4e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class UnixDepends {
    private static final String CHARSET = "UTF-8";
    private static final String DEBUG = "--debug";
    private static final String F = "--nm";
    private static final String F1 = "--readelf";
    private static final String F_TEST = "--test";
    private static final String HELP = "FUNCTIONS:\n--nm -path bin_path -temp temp_path [-nmpath nm_path] [--sol] [--debug]\n--readelf -path bin_path -temp temp_path] [--debug]";
    private static final String HELP_NM = "--nm -path bin_path -temp temp_path [-nmpath nm_path] [--sol] [--debug]";
    private static final String HELP_R = "--readelf -path bin_path -temp temp_path] [--debug]";
    private static final String ISSOL = "--sol";
    private static final String LDD_OUT = ".ldd";
    private static final String LDD_SH = "ldd_out.sh";
    private static final String NMPATH = "-nmpath";
    private static final String NM_EJ_SH = "nm_exp_j.sh";
    private static final String NM_E_SH = "nm_exp.sh";
    private static final String NM_I_SH = "nm_imp.sh";
    private static final String NM_OUT = ".nm";
    private static final String PATH = "-path";
    private static final String READELF_EJ_SH = "readelf_exp_j.sh";
    private static final String READELF_E_SH = "readelf_e.sh";
    private static final String READELF_I_SH = "readelf_i.sh";
    private static final String READELF_OUT = ".readelf";
    private static final String TEMP = "-temp";
    private static StringBuffer COM_FILE = new StringBuffer();
    private static final Logger log = Logger.getLogger("L");
    private static final char CHAR_DIR = ShimmerDivHandler.NUMBER_SING.charAt(0);
    private static String DEP_FILE_NM = "dep_libs_nm";
    private static String DEP_FILE_READELF = "dep_libs_readelf";
    private static String spl = null;
    private static boolean debug = false;

    private UnixDepends() {
    }

    public static void Ldd_func(String str, String str2, String str3, boolean z) throws IOException, InterruptedException {
        Vector createList = createList(new File(str2));
        COM_FILE = new StringBuffer();
        Iterator it = createList.iterator();
        while (it.hasNext()) {
            String obj = it.next().toString();
            if (!z || obj.indexOf("lib/zi") == -1) {
                createComm("ldd", LDD_OUT, obj, str3, extractFileName(str2));
            }
        }
        String t = oyr.t(qv10.t(str), File.separator, LDD_SH);
        writeFile(t, COM_FILE.toString().getBytes("UTF-8"));
        rightsX(t);
        procRun("bash ".concat(t));
        if (!debug) {
            delFile(t);
        }
        sortLdd(str3);
    }

    public static void RElfRun(String[] strArr) throws IOException, InterruptedException {
        Properties properties = new Properties();
        try {
            if (getFunc(DEBUG, strArr)) {
                debug = true;
            }
            properties.setProperty(PATH, getValue(PATH, strArr, null));
            properties.setProperty(TEMP, getValue(TEMP, strArr, null));
            String property = properties.getProperty(PATH);
            String property2 = properties.getProperty(TEMP);
            log.info("\n\tPath to bin dir: " + property + "\n\tPath to temp dir: " + property2);
            tempDir(property2);
            StringBuilder sb = new StringBuilder();
            sb.append(property2);
            String str = File.separator;
            sb.append(str);
            sb.append("temp_ldd");
            String sb2 = sb.toString();
            tempDir(sb2);
            String str2 = property2 + str + "temp_readelf_imp";
            tempDir(str2);
            String str3 = property2 + str + "temp_readelf_exp";
            tempDir(str3);
            String str4 = property2 + str + "temp_readelf_exp_j";
            tempDir(str4);
            int i = 0;
            Ldd_func(property2, property, sb2, false);
            Vector lddBinList = lddBinList(property2, property, sb2);
            COM_FILE = new StringBuffer();
            Iterator it = lddBinList.iterator();
            while (it.hasNext()) {
                createComm("readelf -s --wide", READELF_OUT, it.next().toString(), str2, extractFileName(property));
            }
            String str5 = property2 + File.separator + READELF_I_SH;
            writeFile(str5, COM_FILE.toString().getBytes("UTF-8"));
            rightsX(str5);
            procRun("bash " + str5);
            if (!debug) {
                delFile(str5);
            }
            Vector lddLibs = lddLibs(sb2, property);
            Vector vector = (Vector) lddLibs.elementAt(0);
            Vector vector2 = (Vector) lddLibs.elementAt(1);
            COM_FILE = new StringBuffer();
            while (i < vector2.size()) {
                String str6 = property;
                createComm("readelf -s --wide", READELF_OUT, (String) vector2.elementAt(i), str4, extractFileName(str6));
                i++;
                property = str6;
            }
            String str7 = property;
            String str8 = property2 + File.separator + READELF_EJ_SH;
            writeFile(str8, COM_FILE.toString().getBytes("UTF-8"));
            rightsX(str8);
            procRun("bash " + str8);
            if (!debug) {
                delFile(str8);
            }
            COM_FILE = new StringBuffer();
            for (int i2 = 0; i2 < vector.size(); i2++) {
                createComm("readelf -s --wide", READELF_OUT, (String) vector.elementAt(i2), str3, extractFileName(str7));
            }
            String str9 = property2 + File.separator + READELF_E_SH;
            writeFile(str9, COM_FILE.toString().getBytes("UTF-8"));
            rightsX(str9);
            procRun("bash " + str9);
            if (!debug) {
                delFile(str9);
            }
            sortReadelf(str2, str4, str3, property2, lddLibs);
            writeJar(sb2, sb2 + ".jar", true);
            writeJar(str2, str2 + ".jar", true);
            writeJar(str3, str3 + ".jar", true);
            writeJar(str4, str4 + ".jar", true);
        } catch (NullPointerException unused) {
            log.info(HELP_R);
        }
    }

    private static void assoc(Vector vector, Vector vector2, Vector vector3, Vector vector4, String str) throws IOException {
        Vector vector5 = new Vector(1);
        Vector vector6 = new Vector(1);
        Vector vector7 = (Vector) vector2.elementAt(2);
        Vector depVec = depVec(vector3, vector, vector2);
        Vector depVec2 = depVec(vector4, vector, vector2);
        vector5.add(depVec);
        vector5.add(depVec2);
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String str3 = str2.indexOf("@@") != -1 ? str2.split("@@")[0] : str2.indexOf("@") != -1 ? str2.split("@")[0] : str2;
            Iterator it2 = vector5.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Iterator it3 = ((Vector) it2.next()).iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((Vector) it3.next()).iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = ((Vector) it4.next()).iterator();
                        while (it5.hasNext()) {
                            String str4 = (String) it5.next();
                            String str5 = spl;
                            if (str5 != null && str4.indexOf(str5) != -1) {
                                str4 = str4.split(spl)[0];
                            }
                            if (str3.equals(str4)) {
                                i++;
                            }
                        }
                    }
                }
            }
            if (i == 0) {
                vector6.add(str2);
            }
        }
        StringBuffer stringBuffer = new StringBuffer("------------DEPEND------------\n\n\t***FUNC***\n");
        Iterator it6 = ((Vector) ((Vector) vector5.elementAt(0)).elementAt(0)).iterator();
        while (it6.hasNext()) {
            Iterator it7 = ((Vector) it6.next()).iterator();
            String str6 = "\n" + it7.next().toString() + "\n\n";
            while (true) {
                stringBuffer.append(str6);
                if (it7.hasNext()) {
                    str6 = "\t" + it7.next().toString() + "\n";
                }
            }
        }
        Iterator it8 = vector7.iterator();
        String str7 = "\n--------NOT FOUND libs--------\n\n";
        while (true) {
            stringBuffer.append(str7);
            if (!it8.hasNext()) {
                break;
            }
            str7 = it8.next().toString() + "\n";
        }
        Iterator it9 = vector6.iterator();
        String str8 = "\n--------NOT FOUND--------\n\n";
        while (true) {
            stringBuffer.append(str8);
            if (!it9.hasNext()) {
                break;
            }
            str8 = it9.next().toString() + "\n";
        }
        writeFile(str, stringBuffer.toString().getBytes("UTF-8"));
        StringBuffer stringBuffer2 = new StringBuffer("------------DEPEND------------\n\n\t***OBJ***\n");
        Iterator it10 = ((Vector) ((Vector) vector5.elementAt(1)).elementAt(0)).iterator();
        while (it10.hasNext()) {
            Iterator it11 = ((Vector) it10.next()).iterator();
            StringBuilder sb = new StringBuilder("\n");
            sb.append(it11.next().toString());
            sb.append("\n\n");
            while (true) {
                stringBuffer2.append(sb.toString());
                if (it11.hasNext()) {
                    sb = new StringBuilder("\t");
                    sb.append(it11.next().toString());
                    sb.append("\n");
                }
            }
        }
        stringBuffer2.append("\n------------DEPEND JAVA------------\n\n\t***FUNC***\n");
        Iterator it12 = ((Vector) ((Vector) vector5.elementAt(0)).elementAt(1)).iterator();
        while (it12.hasNext()) {
            Iterator it13 = ((Vector) it12.next()).iterator();
            StringBuilder sb2 = new StringBuilder("\n");
            sb2.append(it13.next().toString());
            sb2.append("\n\n");
            while (true) {
                stringBuffer2.append(sb2.toString());
                if (it13.hasNext()) {
                    sb2 = new StringBuilder("\t");
                    sb2.append(it13.next().toString());
                    sb2.append("\n");
                }
            }
        }
        stringBuffer2.append("\n\t***OBJ***\n");
        Iterator it14 = ((Vector) ((Vector) vector5.elementAt(1)).elementAt(1)).iterator();
        while (it14.hasNext()) {
            Iterator it15 = ((Vector) it14.next()).iterator();
            StringBuilder sb3 = new StringBuilder("\n");
            sb3.append(it15.next().toString());
            sb3.append("\n\n");
            while (true) {
                stringBuffer2.append(sb3.toString());
                if (it15.hasNext()) {
                    sb3 = new StringBuilder("\t");
                    sb3.append(it15.next().toString());
                    sb3.append("\n");
                }
            }
        }
        writeFile(b64.j(str, ".other"), stringBuffer2.toString().getBytes("UTF-8"));
    }

    public static void checkFile(File file, String str, Vector vector) {
        File file2 = new File(file, str);
        if (!file2.isDirectory()) {
            vector.add(file2.getAbsolutePath());
            return;
        }
        Vector createList = createList(new File(file, str));
        for (int i = 0; i < createList.size(); i++) {
            vector.add(createList.elementAt(i));
        }
    }

    public static void createComm(String str, String str2, String str3, String str4, String str5) throws IOException, InterruptedException {
        StringBuilder w = oyr.w(str, " ", str3, " > ", str4);
        String str6 = File.separator;
        w.append(str6);
        w.append(reName(str3, str5));
        w.append(str2);
        x4e.C(w, "\nchmod a+w ", str4, str6);
        w.append(reName(str3, str5));
        w.append(str2);
        w.append("\n");
        String sb = w.toString();
        StringBuffer stringBuffer = COM_FILE;
        stringBuffer.append(sb);
        COM_FILE = stringBuffer;
    }

    public static Vector createList(File file) {
        Vector vector = new Vector(16);
        for (String str : file.list()) {
            checkFile(file, str, vector);
        }
        return vector;
    }

    public static void delFile(String str) {
        new File(str).delete();
    }

    public static Vector depVec(Vector vector, Vector vector2, Vector vector3) {
        int i;
        int i2 = 1;
        Vector vector4 = new Vector(1);
        int i3 = 0;
        int i4 = 0;
        while (i4 < vector.size()) {
            Vector vector5 = new Vector(i2);
            Iterator it = ((Vector) vector.elementAt(i4)).iterator();
            while (it.hasNext()) {
                HashSet hashSet = new HashSet();
                Vector vector6 = new Vector(i2);
                Vector vector7 = (Vector) it.next();
                Iterator it2 = vector7.iterator();
                String str = "--lib name--";
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (str2.indexOf("@@") != -1) {
                        str2 = str2.split("@@")[i3];
                    } else if (str2.indexOf("@") != -1) {
                        str2 = str2.split("@")[i3];
                    }
                    Iterator it3 = vector2.iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        int i5 = i3;
                        if (str3.indexOf("@@") != -1) {
                            str3 = str3.split("@@")[i5];
                        } else if (str3.indexOf("@") != -1) {
                            str3 = str3.split("@")[i5];
                        }
                        if (str2.equals(str3)) {
                            if (spl != null) {
                                StringBuilder t = qv10.t(str3);
                                t.append(spl);
                                t.append(str2);
                                str3 = t.toString();
                            }
                            hashSet.add(str3);
                        }
                        i3 = i5;
                    }
                    int i6 = i3;
                    vector6 = new Vector(hashSet);
                    Collections.sort(vector6);
                    Iterator it4 = ((Vector) vector3.elementAt(i4)).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            i = i6;
                            break;
                        }
                        String str4 = (String) it4.next();
                        i = i6;
                        if (vector7.elementAt(i).equals(reName(str4, null))) {
                            str = str4;
                            break;
                        }
                        i6 = i;
                    }
                    i3 = i;
                }
                vector6.add(i3, str);
                vector5.add(vector6);
                i2 = 1;
            }
            vector4.add(vector5);
            i4++;
            i2 = 1;
        }
        return vector4;
    }

    public static Vector expLibVec(Vector vector, String str) throws IOException {
        Vector vector2 = new Vector(1);
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Vector vector3 = (Vector) it.next();
            String str2 = (String) vector3.elementAt(0);
            vector3.remove(0);
            Iterator it2 = vector3.iterator();
            Vector vector4 = new Vector(1);
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (str != null && str3.indexOf(str) != -1) {
                    str3 = str3.split(str)[str3.split(str).length - 1];
                }
                vector4.add(str3);
            }
            vector3.add(0, str2);
            Collections.sort(vector4);
            vector4.add(0, str2);
            vector2.add(vector4);
        }
        return vector2;
    }

    public static Vector extrFunc(Vector vector, String[] strArr, boolean[] zArr) {
        Vector vector2 = new Vector(1);
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Vector vector3 = (Vector) it.next();
            Vector vector4 = new Vector(1);
            String str = (String) vector3.elementAt(0);
            vector3.remove(0);
            Iterator it2 = vector3.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                boolean z = false;
                for (int i = 0; i < strArr.length; i++) {
                    if ((str2.indexOf(strArr[i]) != -1) == zArr[i]) {
                        z = true;
                    }
                }
                if (z) {
                    vector4.add(str2);
                }
            }
            vector3.add(0, str);
            Collections.sort(vector4);
            vector4.add(0, str);
            vector2.add(vector4);
        }
        return vector2;
    }

    public static String extractFileName(String str) {
        return str.substring(new File(str).getParent().length() + 1);
    }

    public static Vector funcList(Vector vector, String str) throws IOException {
        Iterator it = vector.iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            Vector vector2 = (Vector) it.next();
            String str2 = (String) vector2.elementAt(0);
            vector2.remove(0);
            Iterator it2 = vector2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (str != null && str3.indexOf(str) != -1) {
                    str3 = str3.split(str)[str3.split(str).length - 1];
                    for (int i = 0; i < str3.length() * 2; i++) {
                        if (str3.indexOf("\t") == 0 || str3.indexOf(" ") == 0) {
                            str3 = str3.substring(1, str3.length());
                        }
                    }
                }
                hashSet.add(str3);
            }
            vector2.add(0, str2);
        }
        Vector vector3 = new Vector(hashSet);
        Collections.sort(vector3);
        return vector3;
    }

    public static boolean getFunc(String str, String[] strArr) {
        boolean z = false;
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                z = true;
            }
        }
        return z;
    }

    public static String getValue(String str, String[] strArr, String str2) {
        String str3 = null;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                int i2 = i + 1;
                if (!"-".equals(strArr[i2].substring(0, 1))) {
                    str3 = strArr[i2];
                }
            }
        }
        return str3 == null ? str2 : str3;
    }

    public static Vector lddBinList(String str, String str2, String str3) throws IOException, InterruptedException {
        Vector createList = createList(new File(str2));
        Vector vector = new Vector(1);
        Vector createList2 = createList(new File(str3));
        Iterator it = createList.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            String reName = reName(str4, extractFileName(str2));
            Iterator it2 = createList2.iterator();
            while (it2.hasNext()) {
                String reName2 = reName((String) it2.next(), extractFileName(str3));
                if (reName2.indexOf(LDD_OUT) != -1 && reName.equals(reName2.substring(0, reName2.length() - 4))) {
                    vector.add(str4);
                }
            }
        }
        Iterator it3 = vector.iterator();
        StringBuffer stringBuffer = new StringBuffer("\tBIN LIST\n");
        while (it3.hasNext()) {
            stringBuffer.append(it3.next() + "\n");
        }
        writeFile(oyr.t(qv10.t(str), File.separator, "_bin_list"), stringBuffer.toString().getBytes("UTF-8"));
        return vector;
    }

    public static Vector lddLibs(String str, String str2) throws IOException {
        Iterator it = createList(new File(str)).iterator();
        HashSet hashSet = new HashSet(1);
        HashSet hashSet2 = new HashSet(1);
        HashSet hashSet3 = new HashSet(1);
        while (it.hasNext()) {
            LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(it.next().toString())));
            while (true) {
                String readLine = lineNumberReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.indexOf("not found") != -1 && readLine.indexOf("=>") != -1) {
                    String substring = readLine.substring(0, readLine.indexOf("=>"));
                    for (int i = 0; i < substring.length(); i++) {
                        if (substring.indexOf("\t") == 0) {
                            substring = substring.substring(1, substring.length());
                        }
                    }
                    hashSet3.add(substring);
                } else if (readLine.indexOf("=>") != -1) {
                    String str3 = readLine.split("=>")[1];
                    if (str3.indexOf(" (0x") != -1) {
                        str3 = str3.substring(0, str3.indexOf(" (0x"));
                    }
                    for (int i2 = 0; i2 < str3.length(); i2++) {
                        if (str3.indexOf("\t") == 0 || str3.indexOf(" ") == 0) {
                            str3 = str3.substring(1, str3.length());
                        }
                    }
                    if (readLine.indexOf(str2) == -1) {
                        hashSet.add(str3);
                    }
                    if (readLine.indexOf(str2) != -1) {
                        hashSet2.add(str3);
                    }
                } else if (readLine.indexOf("/") != -1 && readLine.indexOf(".so.") != -1) {
                    for (int i3 = 0; i3 < readLine.length(); i3++) {
                        if (readLine.indexOf("\t") == 0 || readLine.indexOf(" ") == 0) {
                            readLine = readLine.substring(1, readLine.length());
                        }
                    }
                    if (readLine.indexOf(str2) == -1) {
                        hashSet.add(readLine);
                    }
                    if (readLine.indexOf(str2) != -1) {
                        hashSet2.add(readLine);
                    }
                }
            }
            lineNumberReader.close();
        }
        Vector vector = new Vector(hashSet);
        Collections.sort(vector);
        Vector vector2 = new Vector(hashSet2);
        Collections.sort(vector);
        Vector vector3 = new Vector(hashSet3);
        Collections.sort(vector);
        Vector vector4 = new Vector(1);
        vector4.add(0, vector);
        vector4.add(1, vector2);
        vector4.add(2, vector3);
        Iterator it2 = vector.iterator();
        StringBuffer stringBuffer = new StringBuffer("\tLIBS\n");
        while (it2.hasNext()) {
            stringBuffer.append(it2.next() + "\n");
        }
        Iterator it3 = vector2.iterator();
        String str4 = "\n\tLIBS JAVA\n";
        while (true) {
            stringBuffer.append(str4);
            if (!it3.hasNext()) {
                break;
            }
            str4 = it3.next() + "\n";
        }
        Iterator it4 = vector3.iterator();
        String str5 = "\n\tNOT FOUND LIBS\n";
        while (true) {
            stringBuffer.append(str5);
            if (!it4.hasNext()) {
                writeFile(oyr.t(qv10.t(str), File.separator, "_libs_list"), stringBuffer.toString().getBytes("UTF-8"));
                return vector4;
            }
            str5 = it4.next() + "\n";
        }
    }

    public static void main(String[] strArr) throws InterruptedException, IOException {
        if (getFunc(F, strArr)) {
            nmRun(strArr);
            return;
        }
        if (getFunc(F1, strArr)) {
            RElfRun(strArr);
        } else if (getFunc(F_TEST, strArr)) {
            test(strArr);
        } else {
            log.info(HELP);
        }
    }

    public static void nmRun(String[] strArr) throws IOException, InterruptedException {
        String str;
        String str2;
        String str3;
        String str4;
        Properties properties = new Properties();
        try {
            if (getFunc(DEBUG, strArr)) {
                debug = true;
            }
            properties.setProperty(PATH, getValue(PATH, strArr, null));
            properties.setProperty(NMPATH, getValue(NMPATH, strArr, "nm"));
            properties.setProperty(TEMP, getValue(TEMP, strArr, null));
            boolean func = getFunc(ISSOL, strArr);
            String property = properties.getProperty(PATH);
            String property2 = properties.getProperty(NMPATH);
            String property3 = properties.getProperty(TEMP);
            log.info("\n\tPath to bin dir: " + property + "\n\tPath to temp dir: " + property3 + "\n\tPath to nm: " + property2 + "\n\t--sol: " + func);
            tempDir(property3);
            StringBuilder sb = new StringBuilder();
            sb.append(property3);
            String str5 = File.separator;
            sb.append(str5);
            sb.append("temp_ldd");
            String sb2 = sb.toString();
            tempDir(sb2);
            String str6 = property3 + str5 + "temp_nm_imp";
            tempDir(str6);
            String str7 = property3 + str5 + "temp_nm_exp";
            tempDir(str7);
            String str8 = property3 + str5 + "temp_nm_exp_j";
            tempDir(str8);
            if (func) {
                str = ".jar";
                String str9 = property3 + str5 + "32";
                tempDir(str9);
                String str10 = property3 + str5 + "64";
                tempDir(str10);
                String str11 = sb2 + str5 + "ldd_32";
                tempDir(str11);
                String str12 = sb2 + str5 + "ldd_64";
                tempDir(str12);
                String str13 = str6 + str5 + "nm_imp";
                tempDir(str13);
                String str14 = str6 + str5 + "nm_imp_sv9";
                tempDir(str14);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str7);
                sb3.append(str5);
                String str15 = str14;
                sb3.append("nm_exp");
                String sb4 = sb3.toString();
                tempDir(sb4);
                String str16 = str7 + str5 + "nm_exp_sv9";
                tempDir(str16);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str8);
                sb5.append(str5);
                String str17 = str16;
                sb5.append("nm_exp_j");
                String sb6 = sb5.toString();
                tempDir(sb6);
                String str18 = str8 + str5 + "nm_exp_j_sv9";
                tempDir(str18);
                Ldd_func(property3, property, sb2, func);
                lddBinList(property3, property, sb2);
                COM_FILE = new StringBuffer();
                sort64(sb2, str11, str12);
                Iterator it = lddBinList(str9, property, str11).iterator();
                while (it.hasNext()) {
                    createComm(property2, NM_OUT, (String) it.next(), str13, extractFileName(property));
                    it = it;
                    str9 = str9;
                }
                String str19 = str9;
                Iterator it2 = lddBinList(str10, property, str12).iterator();
                while (it2.hasNext()) {
                    String str20 = str10;
                    String str21 = str15;
                    createComm(property2, NM_OUT, (String) it2.next(), str21, extractFileName(property));
                    str15 = str21;
                    it2 = it2;
                    str10 = str20;
                }
                String str22 = str10;
                String str23 = str15;
                String str24 = property3 + File.separator + NM_I_SH;
                writeFile(str24, COM_FILE.toString().getBytes("UTF-8"));
                rightsX(str24);
                procRun("bash " + str24);
                if (!debug) {
                    delFile(str24);
                }
                Vector lddLibs = lddLibs(str11, property);
                Vector lddLibs2 = lddLibs(str12, property);
                Vector vector = (Vector) lddLibs.elementAt(0);
                Vector vector2 = (Vector) lddLibs2.elementAt(0);
                Vector vector3 = (Vector) lddLibs2.elementAt(1);
                COM_FILE = new StringBuffer();
                int i = 0;
                for (Vector vector4 = (Vector) lddLibs.elementAt(1); i < vector4.size(); vector4 = vector4) {
                    createComm(property2, NM_OUT, (String) vector4.elementAt(i), sb6, extractFileName(property));
                    i++;
                }
                for (int i2 = 0; i2 < vector3.size(); i2++) {
                    createComm(property2, NM_OUT, (String) vector3.elementAt(i2), str18, extractFileName(property));
                }
                String str25 = property3 + File.separator + NM_EJ_SH;
                writeFile(str25, COM_FILE.toString().getBytes("UTF-8"));
                rightsX(str25);
                procRun("bash " + str25);
                if (!debug) {
                    delFile(str25);
                }
                COM_FILE = new StringBuffer();
                for (int i3 = 0; i3 < vector.size(); i3++) {
                    createComm(property2, NM_OUT, (String) vector.elementAt(i3), sb4, extractFileName(property));
                }
                int i4 = 0;
                while (i4 < vector2.size()) {
                    String str26 = str17;
                    createComm(property2, NM_OUT, (String) vector2.elementAt(i4), str26, extractFileName(property));
                    i4++;
                    str17 = str26;
                }
                String str27 = str17;
                String str28 = property3 + File.separator + NM_E_SH;
                writeFile(str28, COM_FILE.toString().getBytes("UTF-8"));
                rightsX(str28);
                procRun("bash " + str28);
                if (!debug) {
                    delFile(str28);
                }
                sortNm(str23, str18, str27, str22, lddLibs2, func);
                sortNm(str13, sb6, sb4, str19, lddLibs, func);
                str2 = str6;
                str4 = str7;
                str3 = str8;
            } else {
                str = ".jar";
                String str29 = str6;
                String str30 = str7;
                String str31 = str8;
                Ldd_func(property3, property, sb2, func);
                Vector lddBinList = lddBinList(property3, property, sb2);
                COM_FILE = new StringBuffer();
                Iterator it3 = lddBinList.iterator();
                while (it3.hasNext()) {
                    String str32 = str29;
                    createComm(property2, NM_OUT, (String) it3.next(), str32, extractFileName(property));
                    str29 = str32;
                }
                String str33 = str29;
                String str34 = property3 + File.separator + NM_I_SH;
                writeFile(str34, COM_FILE.toString().getBytes("UTF-8"));
                rightsX(str34);
                procRun("bash " + str34);
                if (!debug) {
                    delFile(str34);
                }
                Vector lddLibs3 = lddLibs(sb2, property);
                Vector vector5 = (Vector) lddLibs3.elementAt(0);
                Vector vector6 = (Vector) lddLibs3.elementAt(1);
                COM_FILE = new StringBuffer();
                int i5 = 0;
                while (i5 < vector6.size()) {
                    String str35 = property;
                    int i6 = i5;
                    String str36 = str31;
                    createComm(property2, NM_OUT, (String) vector6.elementAt(i5), str36, extractFileName(str35));
                    str31 = str36;
                    i5 = i6 + 1;
                    property = str35;
                }
                String str37 = str31;
                String str38 = property3 + File.separator + NM_EJ_SH;
                writeFile(str38, COM_FILE.toString().getBytes("UTF-8"));
                rightsX(str38);
                procRun("bash " + str38);
                if (!debug) {
                    delFile(str38);
                }
                COM_FILE = new StringBuffer();
                int i7 = 0;
                while (i7 < vector5.size()) {
                    String str39 = str30;
                    createComm(property2, NM_OUT, (String) vector5.elementAt(i7), str39, null);
                    i7++;
                    str30 = str39;
                }
                String str40 = str30;
                String str41 = property3 + File.separator + NM_E_SH;
                writeFile(str41, COM_FILE.toString().getBytes("UTF-8"));
                rightsX(str41);
                procRun("bash " + str41);
                if (!debug) {
                    delFile(str41);
                }
                sortNm(str33, str37, str40, property3, lddLibs3, func);
                str2 = str33;
                str3 = str37;
                str4 = str40;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb2);
            String str42 = str;
            sb7.append(str42);
            writeJar(sb2, sb7.toString(), true);
            writeJar(str2, str2 + str42, true);
            writeJar(str4, str4 + str42, true);
            writeJar(str3, str3 + str42, true);
        } catch (NullPointerException unused) {
            log.info(HELP_NM);
        }
    }

    public static void procRun(String str) throws InterruptedException, IOException {
        Runtime.getRuntime().exec(str).waitFor();
    }

    public static String reName(String str, String str2) {
        if (str2 != null && str.indexOf(str2) != -1) {
            String substring = str.substring(str.indexOf(str2) + 1);
            str = substring.substring(substring.indexOf(File.separator) + 1);
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == File.separatorChar) {
                stringBuffer.setCharAt(i, CHAR_DIR);
            }
        }
        return stringBuffer.toString();
    }

    public static byte[] readFile(String str) throws IOException {
        int read;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                int available = fileInputStream2.available();
                byte[] bArr = new byte[available];
                int i = 0;
                do {
                    read = fileInputStream2.read(bArr, i, available - i);
                    i += read;
                } while (read > 0);
                fileInputStream2.close();
                return bArr;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void rightsX(String str) throws InterruptedException, IOException {
        procRun("chmod 755 " + str);
    }

    private static void sort64(String str, String str2, String str3) throws IOException {
        Iterator it = createList(new File(str)).iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (new File(str4).length() == 0) {
                delFile(str4);
            } else {
                LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(str4)));
                boolean z = false;
                do {
                    String readLine = lineNumberReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.indexOf("/64/") != -1 || readLine.indexOf("sparcv9") != -1) {
                        z = true;
                    }
                } while (!z);
                lineNumberReader.close();
                if (z) {
                    StringBuilder t = qv10.t(str3);
                    t.append(File.separator);
                    t.append(extractFileName(str4));
                    writeFile(t.toString(), readFile(str4));
                } else {
                    StringBuilder t2 = qv10.t(str2);
                    t2.append(File.separator);
                    t2.append(extractFileName(str4));
                    writeFile(t2.toString(), readFile(str4));
                }
                delFile(str4);
            }
        }
    }

    public static Vector sortFunc(String str, String[] strArr, boolean[] zArr, String str2) throws IOException {
        Vector vector = new Vector(1);
        Iterator it = createList(new File(str)).iterator();
        while (it.hasNext()) {
            String obj = it.next().toString();
            LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(obj)));
            HashSet hashSet = new HashSet();
            while (true) {
                String readLine = lineNumberReader.readLine();
                if (readLine == null) {
                    break;
                }
                int i = 0;
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (readLine.indexOf(strArr[i2]) != -1 && zArr[i2]) {
                        i++;
                    }
                    if (readLine.indexOf(strArr[i2]) == -1 && !zArr[i2]) {
                        i++;
                    }
                }
                if (i == strArr.length) {
                    hashSet.add(readLine);
                }
            }
            lineNumberReader.close();
            Vector vector2 = new Vector(hashSet);
            Collections.sort(vector2);
            String extractFileName = extractFileName(obj);
            if (extractFileName.indexOf(str2) != -1) {
                extractFileName = extractFileName.substring(0, extractFileName.indexOf(str2));
            }
            vector2.add(0, extractFileName);
            vector.add(vector2);
        }
        return vector;
    }

    public static void sortLdd(String str) throws IOException {
        Iterator it = createList(new File(str)).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (new File(str2).length() != 0) {
                LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(str2)));
                boolean z = false;
                do {
                    String readLine = lineNumberReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        z = readLine.indexOf("not a dynamic executable") != -1;
                    }
                } while (!z);
                lineNumberReader.close();
                if (z) {
                }
            }
            delFile(str2);
        }
    }

    public static void sortNm(String str, String str2, String str3, String str4, Vector vector, boolean z) throws IOException {
        if (!z) {
            Vector sortFunc = sortFunc(str, new String[]{" U "}, new boolean[]{true}, NM_OUT);
            Vector sortFunc2 = sortFunc(str2, new String[]{" U "}, new boolean[]{false}, NM_OUT);
            Vector extrFunc = extrFunc(sortFunc2, new String[]{" T ", " W "}, new boolean[]{true, true});
            Vector extrFunc2 = extrFunc(sortFunc2, new String[]{" V ", " B ", " D "}, new boolean[]{true, true, true});
            Vector sortFunc3 = sortFunc(str3, new String[]{" U "}, new boolean[]{false}, NM_OUT);
            Vector extrFunc3 = extrFunc(sortFunc3, new String[]{" T ", " W "}, new boolean[]{true, true});
            Vector extrFunc4 = extrFunc(sortFunc3, new String[]{" V ", " B ", " D "}, new boolean[]{true, true, true});
            Vector funcList = funcList(sortFunc, " U ");
            Iterator it = funcList.iterator();
            StringBuffer stringBuffer = new StringBuffer();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString() + "\n");
            }
            StringBuilder t = qv10.t(str4);
            String str5 = File.separator;
            writeFile(oyr.t(t, str5, "nm_imp_list"), stringBuffer.toString().getBytes("UTF-8"));
            Vector expLibVec = expLibVec(extrFunc3, " ");
            Vector expLibVec2 = expLibVec(extrFunc4, " ");
            Vector expLibVec3 = expLibVec(extrFunc, " ");
            Vector expLibVec4 = expLibVec(extrFunc2, " ");
            Vector vector2 = new Vector(1);
            vector2.add(0, expLibVec);
            vector2.add(1, expLibVec3);
            Vector vector3 = new Vector(1);
            vector3.add(0, expLibVec2);
            vector3.add(1, expLibVec4);
            StringBuilder v = oyr.v(str4, str5);
            v.append(DEP_FILE_NM);
            assoc(funcList, vector, vector2, vector3, v.toString());
            return;
        }
        Vector extrFunc5 = extrFunc(sortFunc(str, new String[]{"UNDEF  "}, new boolean[]{true}, NM_OUT), new String[]{"NOTY "}, new boolean[]{false});
        Vector sortFunc4 = sortFunc(str2, new String[]{"UNDEF  "}, new boolean[]{false}, NM_OUT);
        Vector extrFunc6 = extrFunc(sortFunc4, new String[]{"FUNC "}, new boolean[]{true});
        Vector extrFunc7 = extrFunc(sortFunc4, new String[]{"OBJT "}, new boolean[]{true});
        Vector sortFunc5 = sortFunc(str3, new String[]{"UNDEF  "}, new boolean[]{false}, NM_OUT);
        Vector extrFunc8 = extrFunc(sortFunc5, new String[]{"FUNC "}, new boolean[]{true});
        if (debug) {
            StringBuffer stringBuffer2 = new StringBuffer("\texport functions\n");
            Iterator it2 = extrFunc8.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Vector) it2.next()).iterator();
                while (it3.hasNext()) {
                    stringBuffer2.append(((String) it3.next()) + "\n");
                    it2 = it2;
                }
            }
            writeFile(oyr.t(qv10.t(str4), File.separator, "exp_f_list"), stringBuffer2.toString().getBytes("UTF-8"));
        }
        Vector extrFunc9 = extrFunc(sortFunc5, new String[]{"OBJT "}, new boolean[]{true});
        Vector funcList2 = funcList(extrFunc5, "UNDEF  ");
        Iterator it4 = funcList2.iterator();
        StringBuffer stringBuffer3 = new StringBuffer();
        while (it4.hasNext()) {
            stringBuffer3.append(it4.next().toString() + "\n");
        }
        StringBuilder t2 = qv10.t(str4);
        String str6 = File.separator;
        writeFile(oyr.t(t2, str6, "nm_imp_list"), stringBuffer3.toString().getBytes("UTF-8"));
        Vector expLibVec5 = expLibVec(extrFunc8, " ");
        Vector expLibVec6 = expLibVec(extrFunc9, " ");
        Vector expLibVec7 = expLibVec(extrFunc6, " ");
        Vector expLibVec8 = expLibVec(extrFunc7, " ");
        Vector vector4 = new Vector(1);
        vector4.add(0, expLibVec5);
        vector4.add(1, expLibVec7);
        Vector vector5 = new Vector(1);
        vector5.add(0, expLibVec6);
        vector5.add(1, expLibVec8);
        StringBuilder v2 = oyr.v(str4, str6);
        v2.append(DEP_FILE_NM);
        assoc(funcList2, vector, vector4, vector5, v2.toString());
    }

    public static void sortReadelf(String str, String str2, String str3, String str4, Vector vector) throws IOException {
        Vector extrFunc = extrFunc(sortFunc(str, new String[]{" UND "}, new boolean[]{true}, READELF_OUT), new String[]{"NOTYPE"}, new boolean[]{false});
        Vector sortFunc = sortFunc(str2, new String[]{" UND "}, new boolean[]{false}, READELF_OUT);
        Vector extrFunc2 = extrFunc(sortFunc, new String[]{" FUNC "}, new boolean[]{true});
        Vector extrFunc3 = extrFunc(sortFunc, new String[]{" OBJECT "}, new boolean[]{true});
        Vector sortFunc2 = sortFunc(str3, new String[]{" UND "}, new boolean[]{false}, READELF_OUT);
        Vector extrFunc4 = extrFunc(sortFunc2, new String[]{" FUNC "}, new boolean[]{true});
        Vector extrFunc5 = extrFunc(sortFunc2, new String[]{" OBJECT "}, new boolean[]{true});
        Vector funcList = funcList(extrFunc, " UND ");
        Iterator it = funcList.iterator();
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toString() + "\n");
        }
        StringBuilder t = qv10.t(str4);
        String str5 = File.separator;
        writeFile(oyr.t(t, str5, "readelf_imp_list"), stringBuffer.toString().getBytes("UTF-8"));
        Vector expLibVec = expLibVec(extrFunc4, " ");
        Vector expLibVec2 = expLibVec(extrFunc5, " ");
        Vector expLibVec3 = expLibVec(extrFunc2, " ");
        Vector expLibVec4 = expLibVec(extrFunc3, " ");
        Vector vector2 = new Vector(1);
        vector2.add(0, expLibVec);
        vector2.add(1, expLibVec3);
        Vector vector3 = new Vector(1);
        vector3.add(0, expLibVec2);
        vector3.add(1, expLibVec4);
        StringBuilder v = oyr.v(str4, str5);
        v.append(DEP_FILE_READELF);
        assoc(funcList, vector, vector2, vector3, v.toString());
    }

    public static void tempDir(String str) {
        new File(str).mkdir();
    }

    private static void test(String[] strArr) throws IOException, InterruptedException {
    }

    public static void writeFile(String str, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public static void writeJar(String str, String str2, boolean z) throws IOException {
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(str2));
        String[] list = new File(str).list();
        int i = 0;
        for (int i2 = 0; i2 < list.length; i2++) {
            File file = new File(str, list[i2]);
            if (file.isDirectory()) {
                i++;
                String str3 = new File(str2).getParent() + File.separator + list[i2];
                JarOutputStream jarOutputStream2 = new JarOutputStream(new FileOutputStream(str3));
                Vector<String> createList = createList(file);
                for (String str4 : createList) {
                    jarOutputStream2.putNextEntry(new JarEntry(extractFileName(str4)));
                    jarOutputStream2.write(readFile(str4));
                    jarOutputStream2.closeEntry();
                }
                jarOutputStream2.close();
                jarOutputStream.putNextEntry(new JarEntry(list[i2]));
                jarOutputStream.write(readFile(str3));
                jarOutputStream.closeEntry();
                new File(str3).delete();
                if (z) {
                    Iterator it = createList.iterator();
                    while (it.hasNext()) {
                        delFile((String) it.next());
                    }
                    for (String str5 : new File(str).list()) {
                        delFile(new File(str, str5).toString());
                    }
                    delFile(str);
                }
            }
        }
        if (i == 0) {
            Vector<String> createList2 = createList(new File(str));
            for (String str6 : createList2) {
                jarOutputStream.putNextEntry(new JarEntry(extractFileName(str6)));
                jarOutputStream.write(readFile(str6));
                jarOutputStream.closeEntry();
            }
            if (z) {
                Iterator it2 = createList2.iterator();
                while (it2.hasNext()) {
                    delFile((String) it2.next());
                }
                for (String str7 : new File(str).list()) {
                    delFile(new File(str, str7).toString());
                }
                delFile(str);
            }
        }
        jarOutputStream.close();
    }
}
