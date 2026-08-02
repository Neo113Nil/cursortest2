package defpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class ugr {
    public static final Pattern a = Pattern.compile("^VmSwap:\\s+([0-9]+) kB$");

    public static long a(FileReader fileReader) {
        Matcher matcher;
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            do {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return 0L;
                    }
                    matcher = a.matcher(readLine);
                } finally {
                }
            } while (!matcher.find());
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 1024;
            bufferedReader.close();
            return parseLong;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
