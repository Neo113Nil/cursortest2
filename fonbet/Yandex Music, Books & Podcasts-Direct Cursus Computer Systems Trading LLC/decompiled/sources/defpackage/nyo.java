package defpackage;

/* loaded from: classes5.dex */
public final class nyo extends qyo {
    public static final nyo d = new nyo(0);
    public static final nyo e = new nyo(1);
    public final /* synthetic */ int c;

    public /* synthetic */ nyo(int i) {
        this.c = i;
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "SCT signature failed verification";
            default:
                return "No trusted log server found for SCT";
        }
    }
}
