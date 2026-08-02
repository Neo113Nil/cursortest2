package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.Request;
import com.bugsnag.android.TraceParser;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public interface GraphCommand {

    public final class Capture implements GraphCommand {
        public final ArrayList requests;

        public Capture(ArrayList arrayList) {
            this.requests = arrayList;
        }
    }

    public abstract class Listeners implements GraphCommand {
    }

    public final class Parameters implements GraphCommand {
        public final Map graph3AParameters;
        public final Map graphParameters;

        public Parameters(Map map, Map map2) {
            map.getClass();
            map2.getClass();
            this.graphParameters = map;
            this.graph3AParameters = map2;
        }
    }

    public final class Repeat implements GraphCommand {
        public final Request request;

        public Repeat(Request request) {
            request.getClass();
            this.request = request;
        }
    }

    public final class RequestProcessor implements GraphCommand {

        /* renamed from: new, reason: not valid java name */
        public final TraceParser f0new;
        public final TraceParser old;

        public RequestProcessor(TraceParser traceParser, TraceParser traceParser2) {
            this.old = traceParser;
            this.f0new = traceParser2;
        }
    }

    public final class Stop implements GraphCommand {
        public static final Stop INSTANCE$1 = new Stop();
        public static final Stop INSTANCE$2 = new Stop();
        public static final Stop INSTANCE$3 = new Stop();
        public static final Stop INSTANCE = new Stop();
    }

    public final class Trigger implements GraphCommand {
        public final Map triggerParameters;

        public Trigger(Map map) {
            map.getClass();
            this.triggerParameters = map;
        }
    }
}
