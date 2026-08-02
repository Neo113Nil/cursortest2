package io.flutter.plugins.imagepicker;

import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes4.dex */
public class Messages {

    public enum CacheRetrievalType {
        IMAGE(0),
        VIDEO(1);

        final int index;

        CacheRetrievalType(int i) {
            this.index = i;
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2) {
            super(str2);
            this.code = str;
            this.details = null;
        }
    }

    public enum SourceCamera {
        REAR(0),
        FRONT(1);

        final int index;

        SourceCamera(int i) {
            this.index = i;
        }
    }

    public enum SourceType {
        CAMERA(0),
        GALLERY(1);

        final int index;

        SourceType(int i) {
            this.index = i;
        }
    }

    public static final class a {
        public Long a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Objects.hash(this.a);
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
