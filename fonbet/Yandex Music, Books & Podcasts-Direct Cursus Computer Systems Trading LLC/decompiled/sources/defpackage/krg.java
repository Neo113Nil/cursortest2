package defpackage;

/* loaded from: classes5.dex */
public final class krg extends org {
    public static final krg b = new krg(0);
    public static final krg c = new krg(1);
    public final /* synthetic */ int a;

    public /* synthetic */ krg(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "log-list.json failed to load";
            default:
                return "log-list.json contains no log servers";
        }
    }
}
