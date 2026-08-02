package ru.CryptoPro.JCP.tools;

/* loaded from: classes4.dex */
public class ActionTools {

    public interface Action {
        Object execute();
    }

    public static class ActionResult {
        public final Object a;
        public final long b;

        public ActionResult(long j, Object obj) {
            this.a = obj;
            this.b = j;
        }

        public Object getResult() {
            return this.a;
        }

        public long getTime() {
            return this.b;
        }
    }

    public static ActionResult executeWithTime(Action action) {
        long currentTimeMillis = System.currentTimeMillis();
        return new ActionResult(System.currentTimeMillis() - currentTimeMillis, action.execute());
    }
}
