package defpackage;

/* loaded from: classes.dex */
public abstract class qm1 {
    public static final java.lang.reflect.Method IHQe1A4L2xu;

    static {
        if (android.os.Build.VERSION.SDK_INT == 25) {
            try {
                IHQe1A4L2xu = android.view.ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (java.lang.Exception unused) {
                android.util.Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float IHQe1A4L2xu(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 25 && (method = IHQe1A4L2xu) != null) {
            try {
                return ((java.lang.Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (java.lang.Exception unused) {
                android.util.Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
