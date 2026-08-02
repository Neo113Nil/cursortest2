package io.requery.android.database.sqlite;

/* loaded from: classes5.dex */
abstract class SQLiteStatementType {
    public static int getSqlStatementType(String str) {
        if (str.length() < 3) {
            return 99;
        }
        int statementStartIndex = statementStartIndex(str);
        String substring = str.substring(statementStartIndex, Math.min(statementStartIndex + 3, str.length()));
        if (substring.equalsIgnoreCase("SEL") || substring.equalsIgnoreCase("WIT")) {
            return 1;
        }
        if (substring.equalsIgnoreCase("INS") || substring.equalsIgnoreCase("UPD") || substring.equalsIgnoreCase("REP") || substring.equalsIgnoreCase("DEL")) {
            return 2;
        }
        if (substring.equalsIgnoreCase("ATT")) {
            return 3;
        }
        if (substring.equalsIgnoreCase("COM") || substring.equalsIgnoreCase("END")) {
            return 5;
        }
        if (substring.equalsIgnoreCase("ROL")) {
            return 6;
        }
        if (substring.equalsIgnoreCase("BEG")) {
            return 4;
        }
        if (substring.equalsIgnoreCase("PRA")) {
            return 7;
        }
        if (substring.equalsIgnoreCase("CRE") || substring.equalsIgnoreCase("DRO") || substring.equalsIgnoreCase("ALT")) {
            return 8;
        }
        return (substring.equalsIgnoreCase("ANA") || substring.equalsIgnoreCase("DET")) ? 9 : 99;
    }

    public static int statementStartIndex(String str) {
        int i;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                if (charAt == '\n') {
                    z = false;
                }
            } else if (z2) {
                if (charAt == '*' && (i = i2 + 1) < str.length() && str.charAt(i) == '/') {
                    z2 = false;
                }
            } else if (charAt == '-') {
                int i3 = i2 + 1;
                if (i3 < str.length() && str.charAt(i3) == '-') {
                    z = true;
                }
            } else if (charAt == '/') {
                int i4 = i2 + 1;
                if (i4 < str.length() && str.charAt(i4) == '*') {
                    z2 = true;
                }
            } else if (charAt != '\n' && charAt != '\r' && charAt != ' ' && charAt != '\t') {
                return i2;
            }
        }
        return 0;
    }
}
