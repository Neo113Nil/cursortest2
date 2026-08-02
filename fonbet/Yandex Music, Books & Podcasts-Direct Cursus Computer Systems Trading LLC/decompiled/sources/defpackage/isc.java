package defpackage;

/* loaded from: classes5.dex */
public abstract class isc {
    public static final double a = Math.log(10.0d);
    public static final /* synthetic */ int b = 0;

    public static void a(Appendable appendable, int i, int i2) {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i >= 100) {
            int log = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / a)) + 1;
            while (i2 > log) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
            return;
        }
        while (i2 > 2) {
            appendable.append('0');
            i2--;
        }
        int i3 = ((i + 1) * 13421772) >> 27;
        appendable.append((char) (i3 + 48));
        appendable.append((char) (((i - (i3 << 3)) - (i3 << 1)) + 48));
    }

    public static int b(int i, CharSequence charSequence) {
        int charAt = charSequence.charAt(i) - '0';
        return (charSequence.charAt(i + 1) + ((charAt << 3) + (charAt << 1))) - 48;
    }
}
