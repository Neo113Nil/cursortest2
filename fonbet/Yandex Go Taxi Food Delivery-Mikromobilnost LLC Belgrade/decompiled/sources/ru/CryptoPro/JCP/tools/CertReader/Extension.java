package ru.CryptoPro.JCP.tools.CertReader;

import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes4.dex */
public class Extension {
    public static final String COLON_CHAR = ":";
    public static final String COLON_SPACE = ": ";
    public static final String C_BRAKE = ")";
    public static final String C_BRAKE_SPACE = ") ";
    public static final String DOT_CHAR = ".";
    public static final String FIX_CHAR = ",";
    public static final String FIX_SPACE = ", ";
    public static final String NEW_LINE = "\n";
    public static final int ONE_LINE = 32;
    public static final String O_BRAKE = "(";
    public static final String O_BRAKE_SPACE = " (";
    public static final String SEMICOLON_CHAR = ";";
    public static final String SEMICOLON_SPACE = "; ";
    public static final String SPACE_CHAR = " ";
    public static final int STANDARD_WITH_TITLE = 22;
    public static final int STANDARD_WITH_TITLE_ONELINE = 54;
    public static final String TAB_CHAR = "    ";
    public static final int WITH_COLON = 2;
    public static final int WITH_FIX = 4;
    public static final int WITH_SEMICOLON = 8;
    public static final int WITH_SPACE = 1;
    public static final int WITH_TITLE = 16;
    public final String a;
    public Vector b;
    public final int c;
    public final boolean d;

    public Extension(String str, Vector vector, int i) {
        this.b = null;
        this.c = 4;
        this.d = true;
        this.a = str;
        this.b = new Vector(0);
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            this.b.add((Extension) it.next());
        }
        this.c = i;
        if ((i & 16) != 0) {
            this.d = false;
        }
    }

    public static String addColonPost(String str) {
        return str.concat(COLON_SPACE);
    }

    public static String addFixPost(String str) {
        return str.length() != 0 ? str.concat(FIX_SPACE) : str;
    }

    public static String addSemicolonPost(String str) {
        return str.length() != 0 ? str.concat(SEMICOLON_SPACE) : str;
    }

    public static String addSpacePost(String str) {
        return str.length() != 0 ? str.concat(" ") : str;
    }

    public final String a() {
        int i;
        int i2 = 0;
        Vector vector = new Vector(0);
        Vector vector2 = this.b;
        String str = this.a;
        if (vector2 == null) {
            return str;
        }
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            vector.add(((Extension) this.b.elementAt(i3)).a());
        }
        String str2 = "";
        while (true) {
            int size = vector.size();
            i = this.c;
            if (i2 >= size) {
                break;
            }
            str2 = ((i & 1) != 0 ? addSpacePost(str2) : (i & 8) != 0 ? addSemicolonPost(str2) : addFixPost(str2)).concat((String) vector.elementAt(i2));
            i2++;
        }
        if (this.d) {
            return str2;
        }
        return ((i & 2) != 0 ? addColonPost(str) : addSpacePost(str)).concat(str2);
    }

    public void addObject(Extension extension) {
        if (this.b == null) {
            this.b = new Vector(0);
        }
        this.b.add(extension);
    }

    public final Vector b() {
        Vector vector = new Vector(0);
        Vector vector2 = new Vector(0);
        Vector vector3 = this.b;
        String str = this.a;
        if (vector3 == null) {
            vector.add(str);
            return vector;
        }
        for (int i = 0; i < this.b.size(); i++) {
            vector2.addAll(((Extension) this.b.elementAt(i)).b());
        }
        if (this.d) {
            return vector2;
        }
        int size = vector2.size();
        int i2 = this.c;
        if (size == 1 && (i2 & 32) != 0) {
            vector.add(((i2 & 2) != 0 ? addColonPost(str) : addSpacePost(str)).concat((String) vector2.elementAt(0)));
            return vector;
        }
        if ((i2 & 2) != 0) {
            str = addColonPost(str);
        }
        vector.add(str);
        for (int i3 = 0; i3 < vector2.size(); i3++) {
            vector.add(TAB_CHAR.concat((String) vector2.elementAt(i3)));
        }
        return vector;
    }

    public String getColumnValue() {
        Vector b = b();
        String str = "";
        for (int i = 0; i < b.size(); i++) {
            if (str.length() != 0) {
                str = str.concat("\n");
            }
            str = str.concat((String) b.elementAt(i));
        }
        return str;
    }

    public String getName() {
        return this.a;
    }

    public String getRowValue() {
        return a();
    }

    public Extension(String str, Vector vector) {
        this(str, vector, 4);
    }

    public Extension(String str) {
        this(str, (Extension) null, 4);
    }

    public Extension(String str, Extension extension) {
        this(str, extension, 4);
    }

    public Extension(String str, Extension extension, int i) {
        this.b = null;
        this.c = 4;
        this.d = true;
        this.a = str;
        if (extension != null) {
            Vector vector = new Vector(0);
            this.b = vector;
            vector.add(extension);
        }
        this.c = i;
        if ((i & 16) != 0) {
            this.d = false;
        }
    }
}
