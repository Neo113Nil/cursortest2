package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class CalendarLocale_jvmKt {
    public static final WeakHashMap cachedFormatters = new WeakHashMap();

    public static String toLocalString$default(int i, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = "1.40.false." + locale.toLanguageTag();
        WeakHashMap weakHashMap = cachedFormatters;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(1);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i));
    }
}
