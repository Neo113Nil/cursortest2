package defpackage;

/* loaded from: classes.dex */
public abstract class ih1 {
    public static final /* synthetic */ int IHQe1A4L2xu = 0;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                java.lang.Class cls = java.lang.Long.TYPE;
                android.os.Trace.class.getMethod("isTagEnabled", cls);
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                android.os.Trace.class.getMethod("asyncTraceBegin", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("asyncTraceEnd", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("traceCounter", cls, java.lang.String.class, cls2);
            } catch (java.lang.Exception e) {
                android.util.Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}
